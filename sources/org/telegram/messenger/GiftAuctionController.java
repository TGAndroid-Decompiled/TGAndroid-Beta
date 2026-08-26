package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.vkryl.core.reference.ReferenceList;
import me.vkryl.core.reference.ReferenceMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda149;
import org.telegram.ui.Stars.StarsController;

public class GiftAuctionController extends BaseController {
    private static volatile GiftAuctionController[] Instance = new GiftAuctionController[4];
    private final ArrayList<Auction> activeAuctions;
    private final LongSparseArray<AuctionInternal> auctions;
    private final ReferenceMap listeners;
    private final ReferenceList onActiveAuctionsUpdateListeners;
    private final LongSparseArray<Boolean> upgrades;
    private boolean wasRequestedActiveAuctions;

    public static class Auction {
        private int approximatedMyPlace;
        public TL_stars.StarGiftAuctionState auctionState;
        public TL_stars.TL_starGiftAuctionState auctionStateActive;
        public TL_stars.TL_starGiftAuctionStateFinished auctionStateFinished;
        public TL_stars.TL_StarGiftAuctionUserState auctionUserState;
        public final int currentAccount;
        public TL_stars.StarGift gift;
        public final String giftAuctionSlug;
        public final long giftDocumentId;
        public final long giftId;
        public ArrayList<TL_stars.StarGiftAttribute> previewAttributes;

        public enum BidStatus {
            WINNING,
            OUTBID,
            RETURNED,
            NO_BID;

            public boolean isOutbid() {
                return this == OUTBID || this == RETURNED;
            }
        }

        public boolean applyAuctionState(TL_stars.StarGiftAuctionState starGiftAuctionState) {
            if (!(starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionState)) {
                if (!(starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionStateFinished) || isFinished()) {
                    return false;
                }
                this.auctionState = starGiftAuctionState;
                this.auctionStateFinished = (TL_stars.TL_starGiftAuctionStateFinished) starGiftAuctionState;
                return true;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = (TL_stars.TL_starGiftAuctionState) starGiftAuctionState;
            if (tL_starGiftAuctionState.version <= getVersion()) {
                return false;
            }
            this.auctionState = starGiftAuctionState;
            this.auctionStateActive = tL_starGiftAuctionState;
            onUpdateUserOrAuctionState();
            return true;
        }

        public boolean applyGift(TL_stars.StarGift starGift) {
            this.gift = starGift;
            return true;
        }

        public boolean applyUserState(TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
            this.auctionUserState = tL_StarGiftAuctionUserState;
            onUpdateUserOrAuctionState();
            return true;
        }

        private int approximateMyPlace() {
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auctionStateActive;
            if (tL_starGiftAuctionState == null) {
                return -1;
            }
            if (tL_starGiftAuctionState.top_bidders != null) {
                long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                int i = 0;
                while (i < this.auctionStateActive.top_bidders.size()) {
                    long jLongValue = this.auctionStateActive.top_bidders.get(i).longValue();
                    i++;
                    if (clientUserId == jLongValue) {
                        return i;
                    }
                }
            }
            TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.auctionUserState;
            long j = tL_StarGiftAuctionUserState.bid_amount;
            if (j <= 0 || tL_StarGiftAuctionUserState.returned) {
                return -1;
            }
            return approximatePlaceFromStars(j, tL_StarGiftAuctionUserState.bid_date);
        }

        public int getVersion() {
            if (isFinished()) {
                return Integer.MAX_VALUE;
            }
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auctionStateActive;
            if (tL_starGiftAuctionState != null) {
                return tL_starGiftAuctionState.version;
            }
            return 0;
        }

        private void onUpdateUserOrAuctionState() {
            this.approximatedMyPlace = approximateMyPlace();
        }

        public long approximateBidAmountFromPlace(int i) {
            ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auctionStateActive;
            if (tL_starGiftAuctionState == null || (arrayList = tL_starGiftAuctionState.bid_levels) == null) {
                return getMinimumBid();
            }
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i2);
                i2++;
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
                if (i <= tL_AuctionBidLevel2.pos) {
                    return tL_AuctionBidLevel2.amount;
                }
            }
            return getMinimumBid();
        }

        public int approximatePlaceFromStars(long j) {
            return approximatePlaceFromStars(j, ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
        }

        public int getApproximatedMyPlace() {
            return this.approximatedMyPlace;
        }

        public BidStatus getBidStatus() {
            TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.auctionUserState;
            if (tL_StarGiftAuctionUserState.returned) {
                return BidStatus.RETURNED;
            }
            if (tL_StarGiftAuctionUserState.bid_amount == 0) {
                return BidStatus.NO_BID;
            }
            return getApproximatedMyPlace() <= this.gift.gifts_per_round ? BidStatus.WINNING : BidStatus.OUTBID;
        }

        public long getCurrentMyBid() {
            return this.auctionUserState.bid_amount;
        }

        public long getCurrentTopBid() {
            ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auctionStateActive;
            if (tL_starGiftAuctionState == null || (arrayList = tL_starGiftAuctionState.bid_levels) == null || arrayList.isEmpty()) {
                return 0L;
            }
            return this.auctionStateActive.bid_levels.get(0).amount;
        }

        public long getMaximumBid() {
            return Math.max(50000L, (getCurrentTopBid() * 3) / 2);
        }

        public long getMinimumBid() {
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auctionStateActive;
            if (tL_starGiftAuctionState != null) {
                long j = this.auctionUserState.min_bid_amount;
                if (j > 0) {
                    return Math.max(tL_starGiftAuctionState.min_bid_amount, j);
                }
            }
            long j2 = this.auctionUserState.min_bid_amount;
            if (j2 > 0) {
                return j2;
            }
            if (tL_starGiftAuctionState != null) {
                return tL_starGiftAuctionState.min_bid_amount;
            }
            return 0L;
        }

        public boolean isFinished() {
            return this.auctionStateFinished != null;
        }

        public boolean isUpcoming() {
            return isUpcoming(ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime());
        }

        private Auction(int i, TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
            this.currentAccount = i;
            this.gift = starGift;
            this.auctionState = starGiftAuctionState;
            this.auctionUserState = tL_StarGiftAuctionUserState;
            this.giftId = starGift.id;
            TLRPC.Document document = starGift.sticker;
            this.giftDocumentId = document != null ? document.id : 0L;
            this.giftAuctionSlug = starGift.auction_slug;
            applyAuctionState(starGiftAuctionState);
        }

        public int approximatePlaceFromStars(long j, int i) {
            ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auctionStateActive;
            if (tL_starGiftAuctionState == null || (arrayList = tL_starGiftAuctionState.bid_levels) == null) {
                return -1;
            }
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i2 < size) {
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i2);
                i2++;
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
                long j2 = tL_AuctionBidLevel2.amount;
                if (j > j2 || (j == j2 && i <= tL_AuctionBidLevel2.date)) {
                    return tL_AuctionBidLevel2.pos;
                }
                i3 = tL_AuctionBidLevel2.pos;
            }
            return i3 + 1;
        }

        public boolean isUpcoming(int i) {
            return this.gift.auction_start_date > i;
        }
    }

    public static class AuctionInternal {
        private ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> acquiredGifts;
        public final long giftId;
        private Auction internalState;
        private boolean pendingBid;
        private ArrayList<TL_stars.StarGiftAttribute> previewAttributes;
        private Runnable resubscribe;
        private boolean subscription;

        public int getVersion() {
            Auction auction = this.internalState;
            if (auction != null) {
                return auction.getVersion();
            }
            return 0;
        }

        public boolean hasBid() {
            Auction auction = this.internalState;
            return auction != null && auction.auctionUserState.bid_amount > 0;
        }

        private AuctionInternal(long j) {
            this.giftId = j;
        }
    }

    public interface OnActiveAuctionsUpdateListeners {
        void onActiveAuctionsUpdate(List<Auction> list);
    }

    public interface OnAuctionUpdateListener {
        void onUpdate(Auction auction);
    }

    private GiftAuctionController(int i) {
        super(i);
        this.listeners = new ReferenceMap();
        this.auctions = new LongSparseArray<>();
        this.activeAuctions = new ArrayList<>();
        this.upgrades = new LongSparseArray<>();
        this.onActiveAuctionsUpdateListeners = new ReferenceList(true);
    }

    private void applyGiftAuctionStateAndPerformUpdate(TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        TL_stars.StarGift starGift2;
        boolean zApplyGift;
        AuctionInternal orCreateAuction = getOrCreateAuction(starGift.id);
        if (orCreateAuction.internalState == null) {
            starGift2 = starGift;
            orCreateAuction.internalState = new Auction(this.currentAccount, starGift2, starGiftAuctionState, tL_StarGiftAuctionUserState);
            orCreateAuction.internalState.previewAttributes = orCreateAuction.previewAttributes;
            zApplyGift = true;
        } else {
            starGift2 = starGift;
            zApplyGift = orCreateAuction.internalState.applyGift(starGift2) | orCreateAuction.internalState.applyAuctionState(starGiftAuctionState) | orCreateAuction.internalState.applyUserState(tL_StarGiftAuctionUserState);
        }
        if (zApplyGift) {
            updateActiveAuctions();
            performAuctionUpdate(starGift2.id);
        }
    }

    private long calculateUserAuctionsHash() {
        ArrayList arrayList = new ArrayList();
        int size = this.auctions.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            AuctionInternal auctionInternalValueAt = this.auctions.valueAt(i2);
            if (auctionInternalValueAt.internalState != null && !auctionInternalValueAt.internalState.isFinished() && auctionInternalValueAt.internalState.auctionStateActive != null && auctionInternalValueAt.internalState.auctionUserState.bid_date > 0) {
                arrayList.add(Long.valueOf(((long) auctionInternalValueAt.internalState.auctionStateActive.version) | (((long) auctionInternalValueAt.internalState.auctionUserState.bid_date) << 32)));
            }
        }
        Collections.sort(arrayList);
        int size2 = arrayList.size();
        long jCalcHash = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            Long l = (Long) obj;
            jCalcHash = MediaDataController.calcHash(MediaDataController.calcHash(jCalcHash, l.longValue() & 4294967295L), l.longValue() >> 32);
        }
        return jCalcHash;
    }

    public static ArrayList<TL_stars.StarGiftAttribute> filterAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList, boolean z) {
        boolean z2;
        ArrayList<TL_stars.StarGiftAttribute> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i);
            i++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                z2 = z && (starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel);
            } else {
                z2 = !z;
            }
            if (!z2) {
                arrayList2.add(starGiftAttribute2);
            }
        }
        return arrayList2;
    }

    private Auction findAuctionBySlug(String str) {
        int size = this.auctions.size();
        for (int i = 0; i < size; i++) {
            AuctionInternal auctionInternalValueAt = this.auctions.valueAt(i);
            if (auctionInternalValueAt.internalState != null && TextUtils.equals(auctionInternalValueAt.internalState.gift.auction_slug, str)) {
                if (auctionInternalValueAt.internalState != null) {
                    return auctionInternalValueAt.internalState;
                }
                return null;
            }
        }
        return null;
    }

    public static GiftAuctionController getInstance(int i) {
        GiftAuctionController giftAuctionController;
        GiftAuctionController giftAuctionController2 = Instance[i];
        if (giftAuctionController2 != null) {
            return giftAuctionController2;
        }
        synchronized (GiftAuctionController.class) {
            try {
                giftAuctionController = Instance[i];
                if (giftAuctionController == null) {
                    GiftAuctionController[] giftAuctionControllerArr = Instance;
                    GiftAuctionController giftAuctionController3 = new GiftAuctionController(i);
                    giftAuctionControllerArr[i] = giftAuctionController3;
                    giftAuctionController = giftAuctionController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return giftAuctionController;
    }

    private AuctionInternal getOrCreateAuction(long j) {
        AuctionInternal auctionInternal = this.auctions.get(j);
        if (auctionInternal != null) {
            return auctionInternal;
        }
        AuctionInternal auctionInternal2 = new AuctionInternal(j);
        this.auctions.put(j, auctionInternal2);
        return auctionInternal2;
    }

    public static boolean hasAllAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        return (StarsController.findAttribute(arrayList, TL_stars.starGiftAttributeModel.class) == null || StarsController.findAttribute(arrayList, TL_stars.starGiftAttributePattern.class) == null || StarsController.findAttribute(arrayList, TL_stars.starGiftAttributeBackdrop.class) == null) ? false : true;
    }

    public void lambda$getOrRequestAcquiredGifts$11(Utilities.Callback callback, AuctionInternal auctionInternal, TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts, TLRPC.TL_error tL_error) {
        if (tL_StarGiftAuctionAcquiredGifts == null) {
            callback.run(null);
            return;
        }
        getMessagesController().putUsers(tL_StarGiftAuctionAcquiredGifts.users, false);
        getMessagesController().putChats(tL_StarGiftAuctionAcquiredGifts.chats, false);
        auctionInternal.acquiredGifts = tL_StarGiftAuctionAcquiredGifts.gifts;
        callback.run(auctionInternal.acquiredGifts);
    }

    public void lambda$getOrRequestAuction$12(Utilities.Callback2 callback2, long j, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, TLRPC.TL_error tL_error) {
        callback2.run(getAuction(j), tL_error);
    }

    public void lambda$onGiftAuctionStateReceivedInternal$2(AuctionInternal auctionInternal, long j) {
        auctionInternal.resubscribe = null;
        subscribeToGiftAuctionStateInternal(j);
    }

    public static void lambda$requestAuctionUpgrades$5(Utilities.Callback callback, TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes, TLRPC.TL_error tL_error) {
        if (stargiftupgradeattributes != null) {
            callback.run(stargiftupgradeattributes.attributes);
        } else {
            callback.run(null);
        }
    }

    public void lambda$requestGiftAuctionInternal$3(TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, Utilities.Callback2 callback2, TLRPC.TL_error tL_error, ArrayList arrayList) {
        getOrCreateAuction(tL_StarGiftAuctionState.gift.id).previewAttributes = arrayList;
        onGiftAuctionStateReceivedInternal(tL_StarGiftAuctionState.gift.id, tL_StarGiftAuctionState);
        callback2.run(tL_StarGiftAuctionState, tL_error);
    }

    public void lambda$requestGiftAuctionInternal$4(final Utilities.Callback2 callback2, final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, final TLRPC.TL_error tL_error) {
        if (tL_StarGiftAuctionState != null) {
            getMessagesController().putUsers(tL_StarGiftAuctionState.users, false);
            getMessagesController().putChats(tL_StarGiftAuctionState.chats, false);
        }
        if (tL_StarGiftAuctionState != null && !this.upgrades.get(tL_StarGiftAuctionState.gift.id, Boolean.FALSE).booleanValue()) {
            this.upgrades.put(tL_StarGiftAuctionState.gift.id, Boolean.TRUE);
            requestAuctionUpgrades(tL_StarGiftAuctionState.gift.id, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$requestGiftAuctionInternal$3(tL_StarGiftAuctionState, callback2, tL_error, (ArrayList) obj);
                }
            });
        } else {
            if (tL_StarGiftAuctionState != null) {
                onGiftAuctionStateReceivedInternal(tL_StarGiftAuctionState.gift.id, tL_StarGiftAuctionState);
            }
            callback2.run(tL_StarGiftAuctionState, tL_error);
        }
    }

    public void lambda$requestUserAuctions$10(TL_payments.StarGiftActiveAuctions starGiftActiveAuctions, TLRPC.TL_error tL_error) {
        if (starGiftActiveAuctions == null || tL_error != null) {
            return;
        }
        if (!(starGiftActiveAuctions instanceof TL_payments.TL_starGiftActiveAuctions)) {
            boolean z = starGiftActiveAuctions instanceof TL_payments.TL_starGiftActiveAuctionsNotModified;
            return;
        }
        TL_payments.TL_starGiftActiveAuctions tL_starGiftActiveAuctions = (TL_payments.TL_starGiftActiveAuctions) starGiftActiveAuctions;
        int i = 0;
        getMessagesController().putUsers(tL_starGiftActiveAuctions.users, false);
        getMessagesController().putChats(tL_starGiftActiveAuctions.chats, false);
        ArrayList<TL_stars.TL_StarGiftActiveAuctionState> arrayList = tL_starGiftActiveAuctions.auctions;
        int size = arrayList.size();
        while (i < size) {
            TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState = arrayList.get(i);
            i++;
            TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState2 = tL_StarGiftActiveAuctionState;
            applyGiftAuctionStateAndPerformUpdate(tL_StarGiftActiveAuctionState2.gift, tL_StarGiftActiveAuctionState2.state, tL_StarGiftActiveAuctionState2.user_state);
        }
    }

    public void lambda$sendBid$6(Utilities.Callback2 callback2, long j, AuctionBidSheet.Params params, long j2) {
        if (StarsController.getInstance(this.currentAccount, false).balanceLoaded) {
            sendBid(j, params, j2, callback2);
        } else if (callback2 != null) {
            callback2.run(Boolean.FALSE, "NO_BALANCE");
        }
    }

    public void lambda$sendBid$7(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
    }

    public void lambda$sendBid$8(AuctionInternal auctionInternal, Utilities.Callback2 callback2, TLRPC.payments_PaymentResult payments_paymentresult, TLRPC.TL_error tL_error) {
        auctionInternal.pendingBid = false;
        if (payments_paymentresult instanceof TLRPC.TL_payments_paymentResult) {
            Utilities.stageQueue.postRunnable(new FileLog$$ExternalSyntheticLambda3(11, this, (TLRPC.TL_payments_paymentResult) payments_paymentresult));
            callback2.run(Boolean.TRUE, null);
        } else if (tL_error != null) {
            callback2.run(Boolean.FALSE, tL_error.text);
        } else {
            callback2.run(Boolean.FALSE, null);
        }
    }

    public void lambda$sendBid$9(Utilities.Callback2 callback2, AuctionInternal auctionInternal, TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm, TLRPC.PaymentForm paymentForm, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            callback2.run(Boolean.FALSE, tL_error.text);
            auctionInternal.pendingBid = false;
        } else if (!(paymentForm instanceof TLRPC.TL_payments_paymentFormStarGift)) {
            callback2.run(Boolean.FALSE, "NO_PAYMENT_FORM");
            auctionInternal.pendingBid = false;
        } else {
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = ((TLRPC.TL_payments_paymentFormStarGift) paymentForm).form_id;
            tL_payments_sendStarsForm.invoice = tL_payments_getPaymentForm.invoice;
            getConnectionsManager().sendRequestTyped(tL_payments_sendStarsForm, new AiTonesController$$ExternalSyntheticLambda0(), new GiftAuctionController$$ExternalSyntheticLambda0(this, auctionInternal, callback2));
        }
    }

    public void lambda$subscribeToGiftAuctionStateInternal$0(long j, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, ArrayList arrayList) {
        getOrCreateAuction(j).previewAttributes = arrayList;
        onGiftAuctionStateReceivedInternal(j, tL_StarGiftAuctionState);
    }

    public void lambda$subscribeToGiftAuctionStateInternal$1(long j, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, TLRPC.TL_error tL_error) {
        if (tL_StarGiftAuctionState != null) {
            getMessagesController().putUsers(tL_StarGiftAuctionState.users, false);
            getMessagesController().putChats(tL_StarGiftAuctionState.chats, false);
        }
        if (tL_StarGiftAuctionState != null && !this.upgrades.get(j, Boolean.FALSE).booleanValue()) {
            this.upgrades.put(j, Boolean.TRUE);
            requestAuctionUpgrades(j, new TranslateController$$ExternalSyntheticLambda36(this, j, tL_StarGiftAuctionState));
        } else if (tL_StarGiftAuctionState != null) {
            onGiftAuctionStateReceivedInternal(j, tL_StarGiftAuctionState);
        }
    }

    public static int lambda$updateActiveAuctions$13(Auction auction) {
        return auction.auctionUserState.bid_date;
    }

    private void onGiftAuctionStateReceivedInternal(long j, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        applyGiftAuctionStateAndPerformUpdate(tL_StarGiftAuctionState.gift, tL_StarGiftAuctionState.state, tL_StarGiftAuctionState.user_state);
        AuctionInternal auctionInternal = this.auctions.get(j);
        if (auctionInternal == null || !auctionInternal.subscription) {
            return;
        }
        auctionInternal.resubscribe = new MessagesStorage$$ExternalSyntheticLambda11(this, auctionInternal, j, 1);
        AndroidUtilities.runOnUIThread(auctionInternal.resubscribe, ((long) tL_StarGiftAuctionState.timeout) * 1000);
    }

    private void performAuctionUpdate(long j) {
        Iterator it;
        Auction auction = getAuction(j);
        ReferenceMap referenceMap = this.listeners;
        Long lValueOf = Long.valueOf(j);
        synchronized (referenceMap.map) {
            try {
                ReferenceList referenceList = (ReferenceList) referenceMap.map.get(lValueOf);
                it = referenceList != null ? referenceList.iterator() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (auction == null || it == null) {
            return;
        }
        while (it.hasNext()) {
            ((OnAuctionUpdateListener) it.next()).onUpdate(auction);
        }
    }

    private void performUpdateActiveAuctions() {
        Iterator it = this.onActiveAuctionsUpdateListeners.iterator();
        while (it.hasNext()) {
            ((OnActiveAuctionsUpdateListeners) it.next()).onActiveAuctionsUpdate(this.activeAuctions);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeAuctionsUpdated, new Object[0]);
    }

    private int requestGiftAuctionInternal(TL_stars.InputStarGiftAuction inputStarGiftAuction, Utilities.Callback2<TL_payments.TL_StarGiftAuctionState, TLRPC.TL_error> callback2) {
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        return getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new AiTonesController$$ExternalSyntheticLambda0(), new ChatThemeController$$ExternalSyntheticLambda9(1, this, callback2));
    }

    private void subscribeToGiftAuctionStateInternal(long j) {
        AuctionInternal orCreateAuction = getOrCreateAuction(j);
        orCreateAuction.subscription = true;
        if (orCreateAuction.resubscribe != null) {
            AndroidUtilities.cancelRunOnUIThread(orCreateAuction.resubscribe);
            orCreateAuction.resubscribe = null;
        }
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = orCreateAuction.giftId;
        tL_getStarGiftAuctionState.auction = tL_inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = orCreateAuction.getVersion();
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new AiTonesController$$ExternalSyntheticLambda0(), new LaunchActivity$$ExternalSyntheticLambda149(this, j, 1));
    }

    private void updateActiveAuctions() {
        getMessagesController().putLastGiftAuctionUpdate();
        this.activeAuctions.clear();
        int size = this.auctions.size();
        for (int i = 0; i < size; i++) {
            AuctionInternal auctionInternalValueAt = this.auctions.valueAt(i);
            if (auctionInternalValueAt.internalState != null && !auctionInternalValueAt.internalState.isFinished() && auctionInternalValueAt.internalState.auctionUserState.bid_amount > 0) {
                this.activeAuctions.add(auctionInternalValueAt.internalState);
            }
        }
        j$.util.List.EL.sort(this.activeAuctions, Comparator$CC.comparingInt(new MessagesController$$ExternalSyntheticLambda335(1)));
        performUpdateActiveAuctions();
    }

    public ArrayList<Auction> getActiveAuctions() {
        return this.activeAuctions;
    }

    public Auction getAuction(long j) {
        AuctionInternal auctionInternal = this.auctions.get(j);
        if (auctionInternal != null) {
            return auctionInternal.internalState;
        }
        return null;
    }

    public void getOrRequestAcquiredGifts(long j, Utilities.Callback<List<TL_stars.TL_StarGiftAuctionAcquiredGift>> callback) {
        AuctionInternal auctionInternal = this.auctions.get(j);
        if (auctionInternal == null || auctionInternal.internalState == null) {
            callback.run(null);
            return;
        }
        if (auctionInternal.acquiredGifts != null && auctionInternal.internalState.auctionUserState.acquired_count == auctionInternal.acquiredGifts.size()) {
            callback.run(auctionInternal.acquiredGifts);
            return;
        }
        TL_payments.TL_getStarGiftAuctionAcquiredGifts tL_getStarGiftAuctionAcquiredGifts = new TL_payments.TL_getStarGiftAuctionAcquiredGifts();
        tL_getStarGiftAuctionAcquiredGifts.gift_id = j;
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionAcquiredGifts, new AiTonesController$$ExternalSyntheticLambda0(), new GiftAuctionController$$ExternalSyntheticLambda0(this, callback, auctionInternal));
    }

    public void getOrRequestAuction(long j, Utilities.Callback2<Auction, TLRPC.TL_error> callback2) {
        Auction auction = getAuction(j);
        if (auction != null) {
            callback2.run(auction, null);
        } else {
            requestGiftAuctionById(j, new BotForumHelper$$ExternalSyntheticLambda3(this, callback2, j, 2));
        }
    }

    public boolean hasActiveAuctions() {
        if (!this.wasRequestedActiveAuctions && getMessagesController().giftAuctionUpdateWasRecently()) {
            this.wasRequestedActiveAuctions = true;
            requestUserAuctions();
        }
        return !this.activeAuctions.isEmpty();
    }

    public void processUpdate(TL_update.TL_updateStarGiftAuctionState tL_updateStarGiftAuctionState) {
        AuctionInternal auctionInternal = this.auctions.get(tL_updateStarGiftAuctionState.gift_id);
        if (auctionInternal == null || auctionInternal.internalState == null || !auctionInternal.internalState.applyAuctionState(tL_updateStarGiftAuctionState.state)) {
            return;
        }
        updateActiveAuctions();
        performAuctionUpdate(auctionInternal.giftId);
    }

    public void requestAuctionUpgrades(long j, Utilities.Callback<ArrayList<TL_stars.StarGiftAttribute>> callback) {
        TL_stars.getStarGiftUpgradeAttributes getstargiftupgradeattributes = new TL_stars.getStarGiftUpgradeAttributes();
        getstargiftupgradeattributes.gift_id = j;
        getConnectionsManager().sendRequestTyped(getstargiftupgradeattributes, new AiTonesController$$ExternalSyntheticLambda0(), new MediaDataController$$ExternalSyntheticLambda32(1, callback));
    }

    public int requestGiftAuctionById(long j, Utilities.Callback2<TL_payments.TL_StarGiftAuctionState, TLRPC.TL_error> callback2) {
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j;
        return requestGiftAuctionInternal(tL_inputStarGiftAuction, callback2);
    }

    public int requestGiftAuctionBySlug(String str, Utilities.Callback2<TL_payments.TL_StarGiftAuctionState, TLRPC.TL_error> callback2) {
        TL_stars.TL_inputStarGiftAuctionSlug tL_inputStarGiftAuctionSlug = new TL_stars.TL_inputStarGiftAuctionSlug();
        tL_inputStarGiftAuctionSlug.slug = str;
        return requestGiftAuctionInternal(tL_inputStarGiftAuctionSlug, callback2);
    }

    public void requestUserAuctions() {
        TL_payments.TL_getStarGiftActiveAuctions tL_getStarGiftActiveAuctions = new TL_payments.TL_getStarGiftActiveAuctions();
        tL_getStarGiftActiveAuctions.hash = calculateUserAuctionsHash();
        getConnectionsManager().sendRequestTyped(tL_getStarGiftActiveAuctions, new AiTonesController$$ExternalSyntheticLambda0(), new AiTonesController$$ExternalSyntheticLambda1(this, 3));
    }

    public void sendBid(long j, AuctionBidSheet.Params params, long j2, Utilities.Callback2<Boolean, String> callback2) {
        AuctionInternal auctionInternal = this.auctions.get(j);
        if (auctionInternal == null || auctionInternal.pendingBid) {
            callback2.run(Boolean.FALSE, null);
            return;
        }
        if (!StarsController.getInstance(this.currentAccount, false).balanceLoaded) {
            StarsController.getInstance(this.currentAccount, false).getBalance(true, false, new MediaController$$ExternalSyntheticLambda8(this, callback2, j, params, j2));
            return;
        }
        boolean zHasBid = auctionInternal.hasBid();
        auctionInternal.pendingBid = true;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceStarGiftAuctionBid tL_inputInvoiceStarGiftAuctionBid = new TLRPC.TL_inputInvoiceStarGiftAuctionBid();
        tL_inputInvoiceStarGiftAuctionBid.gift_id = j;
        tL_inputInvoiceStarGiftAuctionBid.bid_amount = j2;
        tL_inputInvoiceStarGiftAuctionBid.update_bid = zHasBid;
        if (params != null) {
            long j3 = params.dialogId;
            if (j3 == 0) {
                tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
            } else {
                tL_inputInvoiceStarGiftAuctionBid.peer = getMessagesController().getInputPeer(j3);
            }
            tL_inputInvoiceStarGiftAuctionBid.message = params.message;
            tL_inputInvoiceStarGiftAuctionBid.hide_name = params.hideName;
        } else if (!zHasBid) {
            tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
            tL_inputInvoiceStarGiftAuctionBid.hide_name = false;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftAuctionBid;
        getConnectionsManager().sendRequestTyped(tL_payments_getPaymentForm, new AiTonesController$$ExternalSyntheticLambda0(), new MediaDataController$$ExternalSyntheticLambda72(this, callback2, auctionInternal, tL_payments_getPaymentForm, 1));
    }

    public void subscribeToActiveAuctionsUpdates(OnActiveAuctionsUpdateListeners onActiveAuctionsUpdateListeners) {
        this.onActiveAuctionsUpdateListeners.add(onActiveAuctionsUpdateListeners);
    }

    public Auction subscribeToGiftAuction(long j, OnAuctionUpdateListener onAuctionUpdateListener) {
        ReferenceMap referenceMap = this.listeners;
        Long lValueOf = Long.valueOf(j);
        synchronized (referenceMap.map) {
            try {
                ReferenceList referenceList = (ReferenceList) referenceMap.map.get(lValueOf);
                if (referenceList == null) {
                    referenceList = referenceMap.reuse;
                    if (referenceList != null) {
                        referenceMap.reuse = referenceList.next;
                        referenceList.next = null;
                    } else {
                        referenceList = new ReferenceList(referenceMap.cacheIterator);
                    }
                    referenceMap.map.put(lValueOf, referenceList);
                }
                referenceList.add(onAuctionUpdateListener);
            } catch (Throwable th) {
                throw th;
            }
        }
        subscribeToGiftAuctionStateInternal(j);
        return getAuction(j);
    }

    public void unsubscribeFromActiveAuctionsUpdates(OnActiveAuctionsUpdateListeners onActiveAuctionsUpdateListeners) {
        this.onActiveAuctionsUpdateListeners.remove(onActiveAuctionsUpdateListeners);
    }

    public void unsubscribeFromGiftAuction(long j, OnAuctionUpdateListener onAuctionUpdateListener) {
        ReferenceMap referenceMap = this.listeners;
        Long lValueOf = Long.valueOf(j);
        synchronized (referenceMap.map) {
            try {
                ReferenceList referenceList = (ReferenceList) referenceMap.map.get(lValueOf);
                if (referenceList != null) {
                    referenceList.remove(onAuctionUpdateListener);
                    if (referenceList.isEmpty()) {
                        referenceMap.map.remove(lValueOf);
                        referenceList.next = referenceMap.reuse;
                        referenceMap.reuse = referenceList;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AuctionInternal auctionInternal = this.auctions.get(j);
        if (auctionInternal == null) {
            return;
        }
        auctionInternal.subscription = this.listeners.has(Long.valueOf(j));
        if (auctionInternal.resubscribe != null) {
            AndroidUtilities.cancelRunOnUIThread(auctionInternal.resubscribe);
            auctionInternal.resubscribe = null;
        }
    }

    public void processUpdate(TL_update.TL_updateStarGiftAuctionUserState tL_updateStarGiftAuctionUserState) {
        AuctionInternal auctionInternal = this.auctions.get(tL_updateStarGiftAuctionUserState.gift_id);
        if (auctionInternal == null || auctionInternal.internalState == null || !auctionInternal.internalState.applyUserState(tL_updateStarGiftAuctionUserState.user_state)) {
            return;
        }
        updateActiveAuctions();
        performAuctionUpdate(auctionInternal.giftId);
    }
}

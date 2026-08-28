package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import j$.util.Comparator$CC;
import j$.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
public class GiftAuctionController extends BaseController {
    private static volatile GiftAuctionController[] Instance = new GiftAuctionController[4];
    private final ArrayList<Auction> activeAuctions;
    private final LongSparseArray<AuctionInternal> auctions;
    private final xd.c listeners;
    private final xd.b onActiveAuctionsUpdateListeners;
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
                if (this != OUTBID && this != RETURNED) {
                    return false;
                }
                return true;
            }
        }

        public boolean applyAuctionState(TL_stars.StarGiftAuctionState starGiftAuctionState) {
            if (starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionState) {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = (TL_stars.TL_starGiftAuctionState) starGiftAuctionState;
                if (tL_starGiftAuctionState.version > getVersion()) {
                    this.auctionState = starGiftAuctionState;
                    this.auctionStateActive = tL_starGiftAuctionState;
                    onUpdateUserOrAuctionState();
                    return true;
                }
                return false;
            } else if ((starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionStateFinished) && !isFinished()) {
                this.auctionState = starGiftAuctionState;
                this.auctionStateFinished = (TL_stars.TL_starGiftAuctionStateFinished) starGiftAuctionState;
                return true;
            } else {
                return false;
            }
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
                for (int i9 = 0; i9 < this.auctionStateActive.top_bidders.size(); i9++) {
                    if (clientUserId == this.auctionStateActive.top_bidders.get(i9).longValue()) {
                        return i9 + 1;
                    }
                }
            }
            TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.auctionUserState;
            long j10 = tL_StarGiftAuctionUserState.bid_amount;
            if (j10 <= 0 || tL_StarGiftAuctionUserState.returned) {
                return -1;
            }
            return approximatePlaceFromStars(j10, tL_StarGiftAuctionUserState.bid_date);
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

        public long approximateBidAmountFromPlace(int i9) {
            ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auctionStateActive;
            if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i10);
                    i10++;
                    TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
                    if (i9 <= tL_AuctionBidLevel2.pos) {
                        return tL_AuctionBidLevel2.amount;
                    }
                }
                return getMinimumBid();
            }
            return getMinimumBid();
        }

        public int approximatePlaceFromStars(long j10) {
            return approximatePlaceFromStars(j10, ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
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
            if (getApproximatedMyPlace() <= this.gift.gifts_per_round) {
                return BidStatus.WINNING;
            }
            return BidStatus.OUTBID;
        }

        public long getCurrentMyBid() {
            return this.auctionUserState.bid_amount;
        }

        public long getCurrentTopBid() {
            ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auctionStateActive;
            if (tL_starGiftAuctionState != null && (arrayList = tL_starGiftAuctionState.bid_levels) != null && !arrayList.isEmpty()) {
                return this.auctionStateActive.bid_levels.get(0).amount;
            }
            return 0L;
        }

        public long getMaximumBid() {
            return Math.max(50000L, (getCurrentTopBid() * 3) / 2);
        }

        public long getMinimumBid() {
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auctionStateActive;
            if (tL_starGiftAuctionState != null) {
                long j10 = this.auctionUserState.min_bid_amount;
                if (j10 > 0) {
                    return Math.max(tL_starGiftAuctionState.min_bid_amount, j10);
                }
            }
            long j11 = this.auctionUserState.min_bid_amount;
            if (j11 > 0) {
                return j11;
            }
            if (tL_starGiftAuctionState == null) {
                return 0L;
            }
            return tL_starGiftAuctionState.min_bid_amount;
        }

        public boolean isFinished() {
            if (this.auctionStateFinished != null) {
                return true;
            }
            return false;
        }

        public boolean isUpcoming() {
            return isUpcoming(ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime());
        }

        private Auction(int i9, TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
            this.currentAccount = i9;
            this.gift = starGift;
            this.auctionState = starGiftAuctionState;
            this.auctionUserState = tL_StarGiftAuctionUserState;
            this.giftId = starGift.f22607id;
            TLRPC.Document document = starGift.sticker;
            this.giftDocumentId = document != null ? document.f22386id : 0L;
            this.giftAuctionSlug = starGift.auction_slug;
            applyAuctionState(starGiftAuctionState);
        }

        public int approximatePlaceFromStars(long j10, int i9) {
            ArrayList<TL_stars.TL_AuctionBidLevel> arrayList;
            TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.auctionStateActive;
            if (tL_starGiftAuctionState == null || (arrayList = tL_starGiftAuctionState.bid_levels) == null) {
                return -1;
            }
            int size = arrayList.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel = arrayList.get(i11);
                i11++;
                TL_stars.TL_AuctionBidLevel tL_AuctionBidLevel2 = tL_AuctionBidLevel;
                long j11 = tL_AuctionBidLevel2.amount;
                if (j10 <= j11 && (j10 != j11 || i9 > tL_AuctionBidLevel2.date)) {
                    i10 = tL_AuctionBidLevel2.pos;
                } else {
                    return tL_AuctionBidLevel2.pos;
                }
            }
            return i10 + 1;
        }

        public boolean isUpcoming(int i9) {
            return this.gift.auction_start_date > i9;
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
            if (auction != null && auction.auctionUserState.bid_amount > 0) {
                return true;
            }
            return false;
        }

        private AuctionInternal(long j10) {
            this.giftId = j10;
        }
    }

    public interface OnActiveAuctionsUpdateListeners {
        void onActiveAuctionsUpdate(List<Auction> list);
    }

    public interface OnAuctionUpdateListener {
        void onUpdate(Auction auction);
    }

    private GiftAuctionController(int i9) {
        super(i9);
        this.listeners = new xd.c();
        this.auctions = new LongSparseArray<>();
        this.activeAuctions = new ArrayList<>();
        this.upgrades = new LongSparseArray<>();
        this.onActiveAuctionsUpdateListeners = new xd.b(true);
    }

    private void applyGiftAuctionStateAndPerformUpdate(TL_stars.StarGift starGift, TL_stars.StarGiftAuctionState starGiftAuctionState, TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
        TL_stars.StarGift starGift2;
        boolean applyGift;
        AuctionInternal orCreateAuction = getOrCreateAuction(starGift.f22607id);
        if (orCreateAuction.internalState == null) {
            starGift2 = starGift;
            orCreateAuction.internalState = new Auction(this.currentAccount, starGift2, starGiftAuctionState, tL_StarGiftAuctionUserState);
            orCreateAuction.internalState.previewAttributes = orCreateAuction.previewAttributes;
            applyGift = true;
        } else {
            starGift2 = starGift;
            applyGift = orCreateAuction.internalState.applyGift(starGift2) | orCreateAuction.internalState.applyAuctionState(starGiftAuctionState) | orCreateAuction.internalState.applyUserState(tL_StarGiftAuctionUserState);
        }
        if (applyGift) {
            updateActiveAuctions();
            performAuctionUpdate(starGift2.f22607id);
        }
    }

    private long calculateUserAuctionsHash() {
        ArrayList arrayList = new ArrayList();
        int size = this.auctions.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            AuctionInternal valueAt = this.auctions.valueAt(i10);
            if (valueAt.internalState != null && !valueAt.internalState.isFinished() && valueAt.internalState.auctionStateActive != null && valueAt.internalState.auctionUserState.bid_date > 0) {
                arrayList.add(Long.valueOf(valueAt.internalState.auctionStateActive.version | (valueAt.internalState.auctionUserState.bid_date << 32)));
            }
        }
        Collections.sort(arrayList);
        int size2 = arrayList.size();
        long j10 = 0;
        while (i9 < size2) {
            Object obj = arrayList.get(i9);
            i9++;
            Long l10 = (Long) obj;
            j10 = MediaDataController.calcHash(MediaDataController.calcHash(j10, l10.longValue() & 4294967295L), l10.longValue() >> 32);
        }
        return j10;
    }

    public static ArrayList<TL_stars.StarGiftAttribute> filterAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList, boolean z10) {
        boolean z11;
        ArrayList<TL_stars.StarGiftAttribute> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            TL_stars.StarGiftAttribute starGiftAttribute = arrayList.get(i9);
            i9++;
            TL_stars.StarGiftAttribute starGiftAttribute2 = starGiftAttribute;
            if (starGiftAttribute2.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                if (z10 && (starGiftAttribute2 instanceof TL_stars.starGiftAttributeModel)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            } else {
                z11 = !z10;
            }
            if (!z11) {
                arrayList2.add(starGiftAttribute2);
            }
        }
        return arrayList2;
    }

    private Auction findAuctionBySlug(String str) {
        int size = this.auctions.size();
        for (int i9 = 0; i9 < size; i9++) {
            AuctionInternal valueAt = this.auctions.valueAt(i9);
            if (valueAt.internalState != null && TextUtils.equals(valueAt.internalState.gift.auction_slug, str)) {
                if (valueAt.internalState != null) {
                    return valueAt.internalState;
                }
                return null;
            }
        }
        return null;
    }

    public static GiftAuctionController getInstance(int i9) {
        GiftAuctionController giftAuctionController;
        GiftAuctionController giftAuctionController2 = Instance[i9];
        if (giftAuctionController2 == null) {
            synchronized (GiftAuctionController.class) {
                try {
                    giftAuctionController = Instance[i9];
                    if (giftAuctionController == null) {
                        GiftAuctionController[] giftAuctionControllerArr = Instance;
                        GiftAuctionController giftAuctionController3 = new GiftAuctionController(i9);
                        giftAuctionControllerArr[i9] = giftAuctionController3;
                        giftAuctionController = giftAuctionController3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return giftAuctionController;
        }
        return giftAuctionController2;
    }

    private AuctionInternal getOrCreateAuction(long j10) {
        AuctionInternal auctionInternal = this.auctions.get(j10);
        if (auctionInternal == null) {
            AuctionInternal auctionInternal2 = new AuctionInternal(j10);
            this.auctions.put(j10, auctionInternal2);
            return auctionInternal2;
        }
        return auctionInternal;
    }

    public static boolean hasAllAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        if (gh.v7.l(arrayList, TL_stars.starGiftAttributeModel.class) != null && gh.v7.l(arrayList, TL_stars.starGiftAttributePattern.class) != null && gh.v7.l(arrayList, TL_stars.starGiftAttributeBackdrop.class) != null) {
            return true;
        }
        return false;
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

    public void lambda$getOrRequestAuction$12(Utilities.Callback2 callback2, long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, TLRPC.TL_error tL_error) {
        callback2.run(getAuction(j10), tL_error);
    }

    public void lambda$onGiftAuctionStateReceivedInternal$2(AuctionInternal auctionInternal, long j10) {
        auctionInternal.resubscribe = null;
        subscribeToGiftAuctionStateInternal(j10);
    }

    public static void lambda$requestAuctionUpgrades$5(Utilities.Callback callback, TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes, TLRPC.TL_error tL_error) {
        if (stargiftupgradeattributes != null) {
            callback.run(stargiftupgradeattributes.attributes);
        } else {
            callback.run(null);
        }
    }

    public void lambda$requestGiftAuctionInternal$3(TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, Utilities.Callback2 callback2, TLRPC.TL_error tL_error, ArrayList arrayList) {
        getOrCreateAuction(tL_StarGiftAuctionState.gift.f22607id).previewAttributes = arrayList;
        onGiftAuctionStateReceivedInternal(tL_StarGiftAuctionState.gift.f22607id, tL_StarGiftAuctionState);
        callback2.run(tL_StarGiftAuctionState, tL_error);
    }

    public void lambda$requestGiftAuctionInternal$4(final Utilities.Callback2 callback2, final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, final TLRPC.TL_error tL_error) {
        if (tL_StarGiftAuctionState != null) {
            getMessagesController().putUsers(tL_StarGiftAuctionState.users, false);
            getMessagesController().putChats(tL_StarGiftAuctionState.chats, false);
        }
        if (tL_StarGiftAuctionState != null && !this.upgrades.get(tL_StarGiftAuctionState.gift.f22607id, Boolean.FALSE).booleanValue()) {
            this.upgrades.put(tL_StarGiftAuctionState.gift.f22607id, Boolean.TRUE);
            requestAuctionUpgrades(tL_StarGiftAuctionState.gift.f22607id, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    GiftAuctionController.this.lambda$requestGiftAuctionInternal$3(tL_StarGiftAuctionState, callback2, tL_error, (ArrayList) obj);
                }
            });
            return;
        }
        if (tL_StarGiftAuctionState != null) {
            onGiftAuctionStateReceivedInternal(tL_StarGiftAuctionState.gift.f22607id, tL_StarGiftAuctionState);
        }
        callback2.run(tL_StarGiftAuctionState, tL_error);
    }

    public void lambda$requestUserAuctions$10(TL_payments.StarGiftActiveAuctions starGiftActiveAuctions, TLRPC.TL_error tL_error) {
        if (starGiftActiveAuctions != null && tL_error == null && (starGiftActiveAuctions instanceof TL_payments.TL_starGiftActiveAuctions)) {
            TL_payments.TL_starGiftActiveAuctions tL_starGiftActiveAuctions = (TL_payments.TL_starGiftActiveAuctions) starGiftActiveAuctions;
            int i9 = 0;
            getMessagesController().putUsers(tL_starGiftActiveAuctions.users, false);
            getMessagesController().putChats(tL_starGiftActiveAuctions.chats, false);
            ArrayList<TL_stars.TL_StarGiftActiveAuctionState> arrayList = tL_starGiftActiveAuctions.auctions;
            int size = arrayList.size();
            while (i9 < size) {
                TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState = arrayList.get(i9);
                i9++;
                TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState2 = tL_StarGiftActiveAuctionState;
                applyGiftAuctionStateAndPerformUpdate(tL_StarGiftActiveAuctionState2.gift, tL_StarGiftActiveAuctionState2.state, tL_StarGiftActiveAuctionState2.user_state);
            }
        }
    }

    public void lambda$sendBid$6(Utilities.Callback2 callback2, long j10, fh.w wVar, long j11) {
        if (!gh.v7.y(this.currentAccount, false).f9048e) {
            if (callback2 != null) {
                callback2.run(Boolean.FALSE, "NO_BALANCE");
                return;
            }
            return;
        }
        sendBid(j10, wVar, j11, callback2);
    }

    public void lambda$sendBid$7(TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
        MessagesController.getInstance(this.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
    }

    public void lambda$sendBid$8(AuctionInternal auctionInternal, Utilities.Callback2 callback2, TLRPC.payments_PaymentResult payments_paymentresult, TLRPC.TL_error tL_error) {
        auctionInternal.pendingBid = false;
        if (payments_paymentresult instanceof TLRPC.TL_payments_paymentResult) {
            Utilities.stageQueue.postRunnable(new c2(11, this, (TLRPC.TL_payments_paymentResult) payments_paymentresult));
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
            getConnectionsManager().sendRequestTyped(tL_payments_sendStarsForm, new Object(), new x3(this, auctionInternal, callback2));
        }
    }

    public void lambda$subscribeToGiftAuctionStateInternal$0(long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, ArrayList arrayList) {
        getOrCreateAuction(j10).previewAttributes = arrayList;
        onGiftAuctionStateReceivedInternal(j10, tL_StarGiftAuctionState);
    }

    public void lambda$subscribeToGiftAuctionStateInternal$1(long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, TLRPC.TL_error tL_error) {
        if (tL_StarGiftAuctionState != null) {
            getMessagesController().putUsers(tL_StarGiftAuctionState.users, false);
            getMessagesController().putChats(tL_StarGiftAuctionState.chats, false);
        }
        if (tL_StarGiftAuctionState != null && !this.upgrades.get(j10, Boolean.FALSE).booleanValue()) {
            this.upgrades.put(j10, Boolean.TRUE);
            requestAuctionUpgrades(j10, new c4(this, j10, tL_StarGiftAuctionState));
        } else if (tL_StarGiftAuctionState != null) {
            onGiftAuctionStateReceivedInternal(j10, tL_StarGiftAuctionState);
        }
    }

    public static int lambda$updateActiveAuctions$13(Auction auction) {
        return auction.auctionUserState.bid_date;
    }

    private void onGiftAuctionStateReceivedInternal(long j10, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        applyGiftAuctionStateAndPerformUpdate(tL_StarGiftAuctionState.gift, tL_StarGiftAuctionState.state, tL_StarGiftAuctionState.user_state);
        AuctionInternal auctionInternal = this.auctions.get(j10);
        if (auctionInternal != null && auctionInternal.subscription) {
            auctionInternal.resubscribe = new a4(this, auctionInternal, j10, 0);
            AndroidUtilities.runOnUIThread(auctionInternal.resubscribe, tL_StarGiftAuctionState.timeout * 1000);
        }
    }

    private void performAuctionUpdate(long j10) {
        Iterator it;
        Auction auction = getAuction(j10);
        xd.c cVar = this.listeners;
        Long valueOf = Long.valueOf(j10);
        synchronized (cVar.f49116c) {
            try {
                xd.b bVar = (xd.b) cVar.f49116c.get(valueOf);
                if (bVar != null) {
                    it = bVar.iterator();
                } else {
                    it = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (auction != null && it != null) {
            while (it.hasNext()) {
                ((OnAuctionUpdateListener) it.next()).onUpdate(auction);
            }
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
        return getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new Object(), new d1(1, this, callback2));
    }

    private void subscribeToGiftAuctionStateInternal(long j10) {
        AuctionInternal orCreateAuction = getOrCreateAuction(j10);
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
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new Object(), new fh.m(this, j10, 2));
    }

    private void updateActiveAuctions() {
        getMessagesController().putLastGiftAuctionUpdate();
        this.activeAuctions.clear();
        int size = this.auctions.size();
        for (int i9 = 0; i9 < size; i9++) {
            AuctionInternal valueAt = this.auctions.valueAt(i9);
            if (valueAt.internalState != null && !valueAt.internalState.isFinished() && valueAt.internalState.auctionUserState.bid_amount > 0) {
                this.activeAuctions.add(valueAt.internalState);
            }
        }
        List.EL.sort(this.activeAuctions, Comparator$CC.comparingInt(new b4(0)));
        performUpdateActiveAuctions();
    }

    public ArrayList<Auction> getActiveAuctions() {
        return this.activeAuctions;
    }

    public Auction getAuction(long j10) {
        AuctionInternal auctionInternal = this.auctions.get(j10);
        if (auctionInternal != null) {
            return auctionInternal.internalState;
        }
        return null;
    }

    public void getOrRequestAcquiredGifts(long j10, Utilities.Callback<java.util.List<TL_stars.TL_StarGiftAuctionAcquiredGift>> callback) {
        AuctionInternal auctionInternal = this.auctions.get(j10);
        if (auctionInternal != null && auctionInternal.internalState != null) {
            if (auctionInternal.acquiredGifts != null && auctionInternal.internalState.auctionUserState.acquired_count == auctionInternal.acquiredGifts.size()) {
                callback.run(auctionInternal.acquiredGifts);
                return;
            }
            TL_payments.TL_getStarGiftAuctionAcquiredGifts tL_getStarGiftAuctionAcquiredGifts = new TL_payments.TL_getStarGiftAuctionAcquiredGifts();
            tL_getStarGiftAuctionAcquiredGifts.gift_id = j10;
            getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionAcquiredGifts, new Object(), new x3(this, callback, auctionInternal));
            return;
        }
        callback.run(null);
    }

    public void getOrRequestAuction(long j10, Utilities.Callback2<Auction, TLRPC.TL_error> callback2) {
        Auction auction = getAuction(j10);
        if (auction != null) {
            callback2.run(auction, null);
        } else {
            requestGiftAuctionById(j10, new hh(this, callback2, j10, 2));
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

    public void requestAuctionUpgrades(long j10, Utilities.Callback<ArrayList<TL_stars.StarGiftAttribute>> callback) {
        TL_stars.getStarGiftUpgradeAttributes getstargiftupgradeattributes = new TL_stars.getStarGiftUpgradeAttributes();
        getstargiftupgradeattributes.gift_id = j10;
        getConnectionsManager().sendRequestTyped(getstargiftupgradeattributes, new Object(), new d4(0, callback));
    }

    public int requestGiftAuctionById(long j10, Utilities.Callback2<TL_payments.TL_StarGiftAuctionState, TLRPC.TL_error> callback2) {
        TL_stars.TL_inputStarGiftAuction tL_inputStarGiftAuction = new TL_stars.TL_inputStarGiftAuction();
        tL_inputStarGiftAuction.gift_id = j10;
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
        getConnectionsManager().sendRequestTyped(tL_getStarGiftActiveAuctions, new Object(), new he(this, 3));
    }

    public void sendBid(long j10, fh.w wVar, long j11, Utilities.Callback2<Boolean, String> callback2) {
        AuctionInternal auctionInternal = this.auctions.get(j10);
        if (auctionInternal != null && !auctionInternal.pendingBid) {
            if (!gh.v7.y(this.currentAccount, false).f9048e) {
                gh.v7.y(this.currentAccount, false).r(new bg.x0(this, callback2, j10, wVar, j11));
                return;
            }
            boolean hasBid = auctionInternal.hasBid();
            auctionInternal.pendingBid = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            TLRPC.TL_inputInvoiceStarGiftAuctionBid tL_inputInvoiceStarGiftAuctionBid = new TLRPC.TL_inputInvoiceStarGiftAuctionBid();
            tL_inputInvoiceStarGiftAuctionBid.gift_id = j10;
            tL_inputInvoiceStarGiftAuctionBid.bid_amount = j11;
            tL_inputInvoiceStarGiftAuctionBid.update_bid = hasBid;
            if (wVar != null) {
                long j12 = wVar.f6826a;
                if (j12 == 0) {
                    tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                } else {
                    tL_inputInvoiceStarGiftAuctionBid.peer = getMessagesController().getInputPeer(j12);
                }
                tL_inputInvoiceStarGiftAuctionBid.message = wVar.f6828c;
                tL_inputInvoiceStarGiftAuctionBid.hide_name = wVar.f6827b;
            } else if (!hasBid) {
                tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
                tL_inputInvoiceStarGiftAuctionBid.hide_name = false;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftAuctionBid;
            getConnectionsManager().sendRequestTyped(tL_payments_getPaymentForm, new Object(), new y3(this, callback2, auctionInternal, tL_payments_getPaymentForm, 0));
            return;
        }
        callback2.run(Boolean.FALSE, null);
    }

    public void subscribeToActiveAuctionsUpdates(OnActiveAuctionsUpdateListeners onActiveAuctionsUpdateListeners) {
        this.onActiveAuctionsUpdateListeners.add(onActiveAuctionsUpdateListeners);
    }

    public Auction subscribeToGiftAuction(long j10, OnAuctionUpdateListener onAuctionUpdateListener) {
        xd.c cVar = this.listeners;
        Long valueOf = Long.valueOf(j10);
        synchronized (cVar.f49116c) {
            try {
                xd.b bVar = (xd.b) cVar.f49116c.get(valueOf);
                if (bVar == null) {
                    bVar = cVar.f49115b;
                    if (bVar != null) {
                        cVar.f49115b = bVar.h;
                        bVar.h = null;
                    } else {
                        bVar = new xd.b(cVar.f49114a);
                    }
                    cVar.f49116c.put(valueOf, bVar);
                }
                bVar.add(onAuctionUpdateListener);
            } catch (Throwable th) {
                throw th;
            }
        }
        subscribeToGiftAuctionStateInternal(j10);
        return getAuction(j10);
    }

    public void unsubscribeFromActiveAuctionsUpdates(OnActiveAuctionsUpdateListeners onActiveAuctionsUpdateListeners) {
        this.onActiveAuctionsUpdateListeners.remove(onActiveAuctionsUpdateListeners);
    }

    public void unsubscribeFromGiftAuction(long j10, OnAuctionUpdateListener onAuctionUpdateListener) {
        xd.c cVar = this.listeners;
        Long valueOf = Long.valueOf(j10);
        synchronized (cVar.f49116c) {
            try {
                xd.b bVar = (xd.b) cVar.f49116c.get(valueOf);
                if (bVar != null) {
                    bVar.remove(onAuctionUpdateListener);
                    if (bVar.isEmpty()) {
                        cVar.f49116c.remove(valueOf);
                        bVar.h = cVar.f49115b;
                        cVar.f49115b = bVar;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AuctionInternal auctionInternal = this.auctions.get(j10);
        if (auctionInternal != null) {
            auctionInternal.subscription = this.listeners.a(Long.valueOf(j10));
            if (auctionInternal.resubscribe != null) {
                AndroidUtilities.cancelRunOnUIThread(auctionInternal.resubscribe);
                auctionInternal.resubscribe = null;
            }
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

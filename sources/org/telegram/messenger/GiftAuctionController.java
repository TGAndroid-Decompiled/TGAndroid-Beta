package org.telegram.messenger;

import android.text.TextUtils;
import android.util.LongSparseArray;
import j$.util.Comparator$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.ToIntFunction;
import me.vkryl.core.reference.ReferenceList;
import me.vkryl.core.reference.ReferenceMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.Stars.StarsController;

public class GiftAuctionController extends BaseController {
    private static volatile GiftAuctionController[] Instance = new GiftAuctionController[4];
    private final ArrayList<Auction> activeAuctions;
    private final LongSparseArray<AuctionInternal> auctions;
    private final ReferenceMap listeners;
    private final ReferenceList onActiveAuctionsUpdateListeners;
    private final LongSparseArray<Boolean> upgrades;
    private boolean wasRequestedActiveAuctions;

    public interface OnActiveAuctionsUpdateListeners {
        void onActiveAuctionsUpdate(List<Auction> list);
    }

    public interface OnAuctionUpdateListener {
        void onUpdate(Auction auction);
    }

    public boolean hasActiveAuctions() {
        if (!this.wasRequestedActiveAuctions && getMessagesController().giftAuctionUpdateWasRecently()) {
            this.wasRequestedActiveAuctions = true;
            requestUserAuctions();
        }
        return !this.activeAuctions.isEmpty();
    }

    public ArrayList<Auction> getActiveAuctions() {
        return this.activeAuctions;
    }

    public Auction subscribeToGiftAuction(long j, OnAuctionUpdateListener onAuctionUpdateListener) {
        this.listeners.add(Long.valueOf(j), onAuctionUpdateListener);
        subscribeToGiftAuctionStateInternal(j);
        return getAuction(j);
    }

    public void unsubscribeFromGiftAuction(long j, OnAuctionUpdateListener onAuctionUpdateListener) {
        this.listeners.remove(Long.valueOf(j), onAuctionUpdateListener);
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

    private void subscribeToGiftAuctionStateInternal(final long j) {
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
        getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                GiftAuctionController.$r8$lambda$o24ijBfJ9O3RMzGX3olh6sMS_ys(this.f$0, j, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void $r8$lambda$o24ijBfJ9O3RMzGX3olh6sMS_ys(final GiftAuctionController giftAuctionController, final long j, final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, TLRPC.TL_error tL_error) {
        if (tL_StarGiftAuctionState != null) {
            giftAuctionController.getMessagesController().putUsers(tL_StarGiftAuctionState.users, false);
            giftAuctionController.getMessagesController().putChats(tL_StarGiftAuctionState.chats, false);
        }
        if (tL_StarGiftAuctionState != null && !giftAuctionController.upgrades.get(j, Boolean.FALSE).booleanValue()) {
            giftAuctionController.upgrades.put(j, Boolean.TRUE);
            giftAuctionController.requestAuctionUpgrades(j, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    GiftAuctionController.$r8$lambda$UphVxDqyZ9lNTPIjrH00quo9Pxs(this.f$0, j, tL_StarGiftAuctionState, (ArrayList) obj);
                }
            });
        } else if (tL_StarGiftAuctionState != null) {
            giftAuctionController.onGiftAuctionStateReceivedInternal(j, tL_StarGiftAuctionState);
        } else {
            giftAuctionController.getClass();
        }
    }

    public static void $r8$lambda$UphVxDqyZ9lNTPIjrH00quo9Pxs(GiftAuctionController giftAuctionController, long j, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, ArrayList arrayList) {
        giftAuctionController.getOrCreateAuction(j).previewAttributes = arrayList;
        giftAuctionController.onGiftAuctionStateReceivedInternal(j, tL_StarGiftAuctionState);
    }

    private void onGiftAuctionStateReceivedInternal(final long j, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState) {
        applyGiftAuctionStateAndPerformUpdate(tL_StarGiftAuctionState.gift, tL_StarGiftAuctionState.state, tL_StarGiftAuctionState.user_state);
        final AuctionInternal auctionInternal = this.auctions.get(j);
        if (auctionInternal == null || !auctionInternal.subscription) {
            return;
        }
        auctionInternal.resubscribe = new Runnable() {
            @Override
            public final void run() {
                GiftAuctionController.$r8$lambda$jyZvpOXy0oHOoMpq_STmT2tjNYw(this.f$0, auctionInternal, j);
            }
        };
        AndroidUtilities.runOnUIThread(auctionInternal.resubscribe, ((long) tL_StarGiftAuctionState.timeout) * 1000);
    }

    public static void $r8$lambda$jyZvpOXy0oHOoMpq_STmT2tjNYw(GiftAuctionController giftAuctionController, AuctionInternal auctionInternal, long j) {
        giftAuctionController.getClass();
        auctionInternal.resubscribe = null;
        giftAuctionController.subscribeToGiftAuctionStateInternal(j);
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

    private int requestGiftAuctionInternal(TL_stars.InputStarGiftAuction inputStarGiftAuction, final Utilities.Callback2<TL_payments.TL_StarGiftAuctionState, TLRPC.TL_error> callback2) {
        TL_payments.TL_getStarGiftAuctionState tL_getStarGiftAuctionState = new TL_payments.TL_getStarGiftAuctionState();
        tL_getStarGiftAuctionState.auction = inputStarGiftAuction;
        tL_getStarGiftAuctionState.version = 0;
        return getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionState, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                GiftAuctionController.$r8$lambda$dHsfylGoTS0XXPpluVLbwicI43U(this.f$0, callback2, (TL_payments.TL_StarGiftAuctionState) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void $r8$lambda$dHsfylGoTS0XXPpluVLbwicI43U(final GiftAuctionController giftAuctionController, final Utilities.Callback2 callback2, final TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, final TLRPC.TL_error tL_error) {
        if (tL_StarGiftAuctionState != null) {
            giftAuctionController.getMessagesController().putUsers(tL_StarGiftAuctionState.users, false);
            giftAuctionController.getMessagesController().putChats(tL_StarGiftAuctionState.chats, false);
        }
        if (tL_StarGiftAuctionState == null) {
            giftAuctionController.getClass();
        } else if (!giftAuctionController.upgrades.get(tL_StarGiftAuctionState.gift.id, Boolean.FALSE).booleanValue()) {
            giftAuctionController.upgrades.put(tL_StarGiftAuctionState.gift.id, Boolean.TRUE);
            giftAuctionController.requestAuctionUpgrades(tL_StarGiftAuctionState.gift.id, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    GiftAuctionController.$r8$lambda$MQtnDqAHlP6QhNkJzGCbhnA80y4(this.f$0, tL_StarGiftAuctionState, callback2, tL_error, (ArrayList) obj);
                }
            });
            return;
        }
        if (tL_StarGiftAuctionState != null) {
            giftAuctionController.onGiftAuctionStateReceivedInternal(tL_StarGiftAuctionState.gift.id, tL_StarGiftAuctionState);
        }
        callback2.run(tL_StarGiftAuctionState, tL_error);
    }

    public static void $r8$lambda$MQtnDqAHlP6QhNkJzGCbhnA80y4(GiftAuctionController giftAuctionController, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, Utilities.Callback2 callback2, TLRPC.TL_error tL_error, ArrayList arrayList) {
        giftAuctionController.getClass();
        giftAuctionController.getOrCreateAuction(tL_StarGiftAuctionState.gift.id).previewAttributes = arrayList;
        giftAuctionController.onGiftAuctionStateReceivedInternal(tL_StarGiftAuctionState.gift.id, tL_StarGiftAuctionState);
        callback2.run(tL_StarGiftAuctionState, tL_error);
    }

    public void requestAuctionUpgrades(long j, final Utilities.Callback<ArrayList<TL_stars.StarGiftAttribute>> callback) {
        TL_stars.getStarGiftUpgradeAttributes getstargiftupgradeattributes = new TL_stars.getStarGiftUpgradeAttributes();
        getstargiftupgradeattributes.gift_id = j;
        getConnectionsManager().sendRequestTyped(getstargiftupgradeattributes, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                GiftAuctionController.$r8$lambda$m0WTiozIdKGkc19Ify0S1ASljAE(callback, (TL_stars.starGiftUpgradeAttributes) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void $r8$lambda$m0WTiozIdKGkc19Ify0S1ASljAE(Utilities.Callback callback, TL_stars.starGiftUpgradeAttributes stargiftupgradeattributes, TLRPC.TL_error tL_error) {
        if (stargiftupgradeattributes != null) {
            callback.run(stargiftupgradeattributes.attributes);
        } else {
            callback.run(null);
        }
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

    public static boolean hasAllAttributes(ArrayList<TL_stars.StarGiftAttribute> arrayList) {
        return (StarsController.findAttribute(arrayList, TL_stars.starGiftAttributeModel.class) == null || StarsController.findAttribute(arrayList, TL_stars.starGiftAttributePattern.class) == null || StarsController.findAttribute(arrayList, TL_stars.starGiftAttributeBackdrop.class) == null) ? false : true;
    }

    public void sendBid(final long j, final AuctionBidSheet.Params params, final long j2, final Utilities.Callback2<Boolean, String> callback2) {
        final AuctionInternal auctionInternal = this.auctions.get(j);
        if (auctionInternal == null || auctionInternal.pendingBid) {
            callback2.run(Boolean.FALSE, null);
            return;
        }
        if (!StarsController.getInstance(this.currentAccount).balanceAvailable()) {
            StarsController.getInstance(this.currentAccount).getBalance(new Runnable() {
                @Override
                public final void run() {
                    GiftAuctionController.m474$r8$lambda$7E4L5QssfAIusB7dvKoHXdRpHQ(this.f$0, callback2, j, params, j2);
                }
            });
            return;
        }
        boolean zHasBid = auctionInternal.hasBid();
        auctionInternal.pendingBid = true;
        final TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        TLRPC.TL_inputInvoiceStarGiftAuctionBid tL_inputInvoiceStarGiftAuctionBid = new TLRPC.TL_inputInvoiceStarGiftAuctionBid();
        tL_inputInvoiceStarGiftAuctionBid.gift_id = j;
        tL_inputInvoiceStarGiftAuctionBid.bid_amount = j2;
        tL_inputInvoiceStarGiftAuctionBid.update_bid = zHasBid;
        if (params != null) {
            if (params.dialogId == 0) {
                tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
            } else {
                tL_inputInvoiceStarGiftAuctionBid.peer = getMessagesController().getInputPeer(params.dialogId);
            }
            tL_inputInvoiceStarGiftAuctionBid.message = params.message;
            tL_inputInvoiceStarGiftAuctionBid.hide_name = params.hideName;
        } else if (!zHasBid) {
            tL_inputInvoiceStarGiftAuctionBid.peer = new TLRPC.TL_inputPeerSelf();
            tL_inputInvoiceStarGiftAuctionBid.hide_name = false;
        }
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftAuctionBid;
        getConnectionsManager().sendRequestTyped(tL_payments_getPaymentForm, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                GiftAuctionController.$r8$lambda$7jXKEvcmoYmxDOfNBPZeoKppzZU(this.f$0, callback2, auctionInternal, tL_payments_getPaymentForm, (TLRPC.PaymentForm) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void m474$r8$lambda$7E4L5QssfAIusB7dvKoHXdRpHQ(GiftAuctionController giftAuctionController, Utilities.Callback2 callback2, long j, AuctionBidSheet.Params params, long j2) {
        if (StarsController.getInstance(giftAuctionController.currentAccount).balanceAvailable()) {
            giftAuctionController.sendBid(j, params, j2, callback2);
        } else if (callback2 != null) {
            callback2.run(Boolean.FALSE, "NO_BALANCE");
        }
    }

    public static void $r8$lambda$7jXKEvcmoYmxDOfNBPZeoKppzZU(final GiftAuctionController giftAuctionController, final Utilities.Callback2 callback2, final AuctionInternal auctionInternal, TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm, TLRPC.PaymentForm paymentForm, TLRPC.TL_error tL_error) {
        giftAuctionController.getClass();
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
            giftAuctionController.getConnectionsManager().sendRequestTyped(tL_payments_sendStarsForm, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    GiftAuctionController.m476$r8$lambda$_M0c0sp4nkrCsxe1dpd9cCfnJg(this.f$0, auctionInternal, callback2, (TLRPC.payments_PaymentResult) obj, (TLRPC.TL_error) obj2);
                }
            });
        }
    }

    public static void m476$r8$lambda$_M0c0sp4nkrCsxe1dpd9cCfnJg(final GiftAuctionController giftAuctionController, AuctionInternal auctionInternal, Utilities.Callback2 callback2, TLRPC.payments_PaymentResult payments_paymentresult, TLRPC.TL_error tL_error) {
        giftAuctionController.getClass();
        auctionInternal.pendingBid = false;
        if (payments_paymentresult instanceof TLRPC.TL_payments_paymentResult) {
            final TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) payments_paymentresult;
            Utilities.stageQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    MessagesController.getInstance(this.f$0.currentAccount).processUpdates(tL_payments_paymentResult.updates, false);
                }
            });
            callback2.run(Boolean.TRUE, null);
        } else if (tL_error != null) {
            callback2.run(Boolean.FALSE, tL_error.text);
        } else {
            callback2.run(Boolean.FALSE, null);
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

    public void requestUserAuctions() {
        TL_payments.TL_getStarGiftActiveAuctions tL_getStarGiftActiveAuctions = new TL_payments.TL_getStarGiftActiveAuctions();
        tL_getStarGiftActiveAuctions.hash = calculateUserAuctionsHash();
        getConnectionsManager().sendRequestTyped(tL_getStarGiftActiveAuctions, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                GiftAuctionController.$r8$lambda$PglGSUwSyzkx1OEnojobOvuosKI(this.f$0, (TL_payments.StarGiftActiveAuctions) obj, (TLRPC.TL_error) obj2);
            }
        });
    }

    public static void $r8$lambda$PglGSUwSyzkx1OEnojobOvuosKI(GiftAuctionController giftAuctionController, TL_payments.StarGiftActiveAuctions starGiftActiveAuctions, TLRPC.TL_error tL_error) {
        giftAuctionController.getClass();
        if (starGiftActiveAuctions == null || tL_error != null) {
            return;
        }
        if (starGiftActiveAuctions instanceof TL_payments.TL_starGiftActiveAuctions) {
            TL_payments.TL_starGiftActiveAuctions tL_starGiftActiveAuctions = (TL_payments.TL_starGiftActiveAuctions) starGiftActiveAuctions;
            int i = 0;
            giftAuctionController.getMessagesController().putUsers(tL_starGiftActiveAuctions.users, false);
            giftAuctionController.getMessagesController().putChats(tL_starGiftActiveAuctions.chats, false);
            ArrayList<TL_stars.TL_StarGiftActiveAuctionState> arrayList = tL_starGiftActiveAuctions.auctions;
            int size = arrayList.size();
            while (i < size) {
                TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState = arrayList.get(i);
                i++;
                TL_stars.TL_StarGiftActiveAuctionState tL_StarGiftActiveAuctionState2 = tL_StarGiftActiveAuctionState;
                giftAuctionController.applyGiftAuctionStateAndPerformUpdate(tL_StarGiftActiveAuctionState2.gift, tL_StarGiftActiveAuctionState2.state, tL_StarGiftActiveAuctionState2.user_state);
            }
            return;
        }
        boolean z = starGiftActiveAuctions instanceof TL_payments.TL_starGiftActiveAuctionsNotModified;
    }

    public void getOrRequestAcquiredGifts(long j, final Utilities.Callback<List<TL_stars.TL_StarGiftAuctionAcquiredGift>> callback) {
        final AuctionInternal auctionInternal = this.auctions.get(j);
        if (auctionInternal == null || auctionInternal.internalState == null) {
            callback.run(null);
            return;
        }
        if (auctionInternal.acquiredGifts == null || auctionInternal.internalState.auctionUserState.acquired_count != auctionInternal.acquiredGifts.size()) {
            TL_payments.TL_getStarGiftAuctionAcquiredGifts tL_getStarGiftAuctionAcquiredGifts = new TL_payments.TL_getStarGiftAuctionAcquiredGifts();
            tL_getStarGiftAuctionAcquiredGifts.gift_id = j;
            getConnectionsManager().sendRequestTyped(tL_getStarGiftAuctionAcquiredGifts, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    GiftAuctionController.$r8$lambda$DM8rh9wttkTxtpCMSXC3uBjY2fQ(this.f$0, callback, auctionInternal, (TL_payments.TL_StarGiftAuctionAcquiredGifts) obj, (TLRPC.TL_error) obj2);
                }
            });
            return;
        }
        callback.run(auctionInternal.acquiredGifts);
    }

    public static void $r8$lambda$DM8rh9wttkTxtpCMSXC3uBjY2fQ(GiftAuctionController giftAuctionController, Utilities.Callback callback, AuctionInternal auctionInternal, TL_payments.TL_StarGiftAuctionAcquiredGifts tL_StarGiftAuctionAcquiredGifts, TLRPC.TL_error tL_error) {
        if (tL_StarGiftAuctionAcquiredGifts == null) {
            giftAuctionController.getClass();
            callback.run(null);
        } else {
            giftAuctionController.getMessagesController().putUsers(tL_StarGiftAuctionAcquiredGifts.users, false);
            giftAuctionController.getMessagesController().putChats(tL_StarGiftAuctionAcquiredGifts.chats, false);
            auctionInternal.acquiredGifts = tL_StarGiftAuctionAcquiredGifts.gifts;
            callback.run(auctionInternal.acquiredGifts);
        }
    }

    public void getOrRequestAuction(final long j, final Utilities.Callback2<Auction, TLRPC.TL_error> callback2) {
        Auction auction = getAuction(j);
        if (auction != null) {
            callback2.run(auction, null);
        } else {
            requestGiftAuctionById(j, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    callback2.run(this.f$0.getAuction(j), tL_error);
                }
            });
        }
    }

    public void processUpdate(TL_update.TL_updateStarGiftAuctionState tL_updateStarGiftAuctionState) {
        AuctionInternal auctionInternal = this.auctions.get(tL_updateStarGiftAuctionState.gift_id);
        if (auctionInternal == null || auctionInternal.internalState == null || !auctionInternal.internalState.applyAuctionState(tL_updateStarGiftAuctionState.state)) {
            return;
        }
        updateActiveAuctions();
        performAuctionUpdate(auctionInternal.giftId);
    }

    public void processUpdate(TL_update.TL_updateStarGiftAuctionUserState tL_updateStarGiftAuctionUserState) {
        AuctionInternal auctionInternal = this.auctions.get(tL_updateStarGiftAuctionUserState.gift_id);
        if (auctionInternal == null || auctionInternal.internalState == null || !auctionInternal.internalState.applyUserState(tL_updateStarGiftAuctionUserState.user_state)) {
            return;
        }
        updateActiveAuctions();
        performAuctionUpdate(auctionInternal.giftId);
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

    private void performAuctionUpdate(long j) {
        Auction auction = getAuction(j);
        Iterator it = this.listeners.iterator(Long.valueOf(j));
        if (auction == null || it == null) {
            return;
        }
        while (it.hasNext()) {
            ((OnAuctionUpdateListener) it.next()).onUpdate(auction);
        }
    }

    public Auction getAuction(long j) {
        AuctionInternal auctionInternal = this.auctions.get(j);
        if (auctionInternal != null) {
            return auctionInternal.internalState;
        }
        return null;
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

    private AuctionInternal getOrCreateAuction(long j) {
        AuctionInternal auctionInternal = this.auctions.get(j);
        if (auctionInternal != null) {
            return auctionInternal;
        }
        AuctionInternal auctionInternal2 = new AuctionInternal(j);
        this.auctions.put(j, auctionInternal2);
        return auctionInternal2;
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
        j$.util.List.EL.sort(this.activeAuctions, Comparator$CC.comparingInt(new ToIntFunction() {
            @Override
            public final int applyAsInt(Object obj) {
                return ((GiftAuctionController.Auction) obj).auctionUserState.bid_date;
            }
        }));
        performUpdateActiveAuctions();
    }

    static class AuctionInternal {
        private ArrayList<TL_stars.TL_StarGiftAuctionAcquiredGift> acquiredGifts;
        public final long giftId;
        private Auction internalState;
        private boolean pendingBid;
        private ArrayList<TL_stars.StarGiftAttribute> previewAttributes;
        private Runnable resubscribe;
        private boolean subscription;

        private AuctionInternal(long j) {
            this.giftId = j;
        }

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
    }

    public void subscribeToActiveAuctionsUpdates(OnActiveAuctionsUpdateListeners onActiveAuctionsUpdateListeners) {
        this.onActiveAuctionsUpdateListeners.add(onActiveAuctionsUpdateListeners);
    }

    public void unsubscribeFromActiveAuctionsUpdates(OnActiveAuctionsUpdateListeners onActiveAuctionsUpdateListeners) {
        this.onActiveAuctionsUpdateListeners.remove(onActiveAuctionsUpdateListeners);
    }

    private void performUpdateActiveAuctions() {
        Iterator it = this.onActiveAuctionsUpdateListeners.iterator();
        while (it.hasNext()) {
            ((OnActiveAuctionsUpdateListeners) it.next()).onActiveAuctionsUpdate(this.activeAuctions);
        }
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.activeAuctionsUpdated, new Object[0]);
    }

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

        public boolean isUpcoming() {
            return isUpcoming(ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime());
        }

        public boolean isUpcoming(int i) {
            return this.gift.auction_start_date > i;
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

        public enum BidStatus {
            WINNING,
            OUTBID,
            RETURNED,
            NO_BID;

            public boolean isOutbid() {
                return this == OUTBID || this == RETURNED;
            }
        }

        public boolean isFinished() {
            return this.auctionStateFinished != null;
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

        public int getApproximatedMyPlace() {
            return this.approximatedMyPlace;
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

        public boolean applyGift(TL_stars.StarGift starGift) {
            this.gift = starGift;
            return true;
        }

        public boolean applyAuctionState(TL_stars.StarGiftAuctionState starGiftAuctionState) {
            if (starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionState) {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = (TL_stars.TL_starGiftAuctionState) starGiftAuctionState;
                if (tL_starGiftAuctionState.version <= getVersion()) {
                    return false;
                }
                this.auctionState = starGiftAuctionState;
                this.auctionStateActive = tL_starGiftAuctionState;
                onUpdateUserOrAuctionState();
                return true;
            }
            if (!(starGiftAuctionState instanceof TL_stars.TL_starGiftAuctionStateFinished) || isFinished()) {
                return false;
            }
            this.auctionState = starGiftAuctionState;
            this.auctionStateFinished = (TL_stars.TL_starGiftAuctionStateFinished) starGiftAuctionState;
            return true;
        }

        public boolean applyUserState(TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState) {
            this.auctionUserState = tL_StarGiftAuctionUserState;
            onUpdateUserOrAuctionState();
            return true;
        }

        private void onUpdateUserOrAuctionState() {
            this.approximatedMyPlace = approximateMyPlace();
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
    }

    private GiftAuctionController(int i) {
        super(i);
        this.listeners = new ReferenceMap(false);
        this.auctions = new LongSparseArray<>();
        this.activeAuctions = new ArrayList<>();
        this.upgrades = new LongSparseArray<>();
        this.onActiveAuctionsUpdateListeners = new ReferenceList(false);
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
}

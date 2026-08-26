package org.telegram.messenger;

import android.os.Bundle;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda7;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13;
import org.telegram.ui.Components.Premium.boosts.BoostViaGiftsBottomSheet$$ExternalSyntheticLambda21;
import org.telegram.ui.Components.Premium.boosts.cells.ParticipantsTypeCell;
import org.telegram.ui.Gifts.AuctionBidSheet;
import org.telegram.ui.ProfileNotificationsActivity;

public final class MediaController$$ExternalSyntheticLambda8 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final long f$3;
    public final Object f$4;

    public MediaController$$ExternalSyntheticLambda8(long j, long j2, Runnable runnable, ArrayList arrayList, TopicsController topicsController) {
        this.$r8$classId = 6;
        this.f$0 = topicsController;
        this.f$2 = j;
        this.f$1 = arrayList;
        this.f$3 = j2;
        this.f$4 = runnable;
    }

    @Override
    public final void run() {
        TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway;
        Object obj = this.f$4;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((MediaController) obj3).lambda$trimCurrentRecording$26((File) obj2, this.f$2, this.f$3, (Runnable) obj);
                break;
            case 1:
                ((FileLoadOperation) obj3).lambda$getDownloadedLengthFromOffset$4((long[]) obj2, this.f$2, this.f$3, (CountDownLatch) obj);
                break;
            case 2:
                ((GiftAuctionController) obj3).lambda$sendBid$6((Utilities.Callback2) obj2, this.f$2, (AuctionBidSheet.Params) obj, this.f$3);
                break;
            case 3:
                ((MessagesStorage) obj3).lambda$getMessage$142(this.f$2, this.f$3, (AtomicReference) obj2, (CountDownLatch) obj);
                break;
            case 4:
                ((MessagesStorage) obj3).lambda$updateDialogsWithDeletedMessages$228(this.f$2, this.f$3, (ArrayList) obj2, (ArrayList) obj);
                break;
            case 5:
                ((TopicsController) obj3).lambda$getTopicRepliesCount$29((TLObject) obj2, (TLRPC.TL_forumTopic) obj, this.f$2, this.f$3);
                break;
            case 6:
                ((TopicsController) obj3).lambda$loadTopic$27(this.f$2, (ArrayList) obj2, this.f$3, (Runnable) obj);
                break;
            case 7:
                ((ItemOptions) obj3).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f$2);
                bundle.putLong("topic_id", this.f$3);
                ((BaseFragment) obj2).presentFragment(new ProfileNotificationsActivity(bundle, (Theme.ResourcesProvider) obj));
                break;
            default:
                BoostViaGiftsBottomSheet boostViaGiftsBottomSheet = (BoostViaGiftsBottomSheet) obj3;
                long jCurrentTimeMillis = boostViaGiftsBottomSheet.selectedEndDate;
                if (jCurrentTimeMillis < System.currentTimeMillis() + 120000) {
                    jCurrentTimeMillis = System.currentTimeMillis() + 120000;
                }
                int i = (int) (jCurrentTimeMillis / 1000);
                int i2 = boostViaGiftsBottomSheet.selectedParticipantsType;
                int i3 = ParticipantsTypeCell.$r8$clinit;
                int i4 = 0;
                boolean z = i2 == 1;
                boostViaGiftsBottomSheet.actionBtn.button.setLoading(true);
                ArrayList arrayList = boostViaGiftsBottomSheet.selectedChats;
                ArrayList arrayList2 = boostViaGiftsBottomSheet.selectedCountries;
                boolean z2 = boostViaGiftsBottomSheet.isShowWinnersSelected;
                boolean z3 = boostViaGiftsBottomSheet.isAdditionalPrizeSelected;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                int i5 = prepaidGiveaway.quantity;
                String str = boostViaGiftsBottomSheet.additionalPrize;
                BoostViaGiftsBottomSheet$$ExternalSyntheticLambda21 boostViaGiftsBottomSheet$$ExternalSyntheticLambda21 = new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda21(boostViaGiftsBottomSheet, (TL_stories.TL_prepaidStarsGiveaway) obj, this.f$2, this.f$3, prepaidGiveaway);
                BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13 boostViaGiftsBottomSheet$$ExternalSyntheticLambda13 = new BoostViaGiftsBottomSheet$$ExternalSyntheticLambda13(boostViaGiftsBottomSheet, 6);
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                boolean z4 = prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway;
                TLRPC.Chat chat = boostViaGiftsBottomSheet.currentChat;
                if (z4) {
                    tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z;
                    tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z2;
                    tL_inputStorePaymentPremiumGiveaway.prize_description = str;
                    tL_inputStorePaymentPremiumGiveaway.until_date = i;
                    int i6 = tL_inputStorePaymentPremiumGiveaway.flags;
                    tL_inputStorePaymentPremiumGiveaway.flags = 6 | i6;
                    if (z3) {
                        tL_inputStorePaymentPremiumGiveaway.flags = i6 | 22;
                    }
                    tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.id);
                    tL_inputStorePaymentPremiumGiveaway.currency = "";
                    int size = arrayList2.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj4 = arrayList2.get(i7);
                        i7++;
                        tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj4)).iso2);
                    }
                    int size2 = arrayList.size();
                    while (i4 < size2) {
                        Object obj5 = arrayList.get(i4);
                        i4++;
                        TLObject tLObject = (TLObject) obj5;
                        if (tLObject instanceof TLRPC.Chat) {
                            tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).id));
                        }
                    }
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z2;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = i;
                    int i8 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i8 | 6;
                    if (z3) {
                        tL_inputStorePaymentStarsGiveaway.flags = i8 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    tL_inputStorePaymentStarsGiveaway.stars = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                    tL_inputStorePaymentStarsGiveaway.users = prepaidGiveaway.quantity;
                    int size3 = arrayList2.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj6 = arrayList2.get(i9);
                        i9++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj6)).iso2);
                    }
                    int size4 = arrayList.size();
                    while (i4 < size4) {
                        Object obj7 = arrayList.get(i4);
                        i4++;
                        TLObject tLObject2 = (TLObject) obj7;
                        if (tLObject2 instanceof TLRPC.Chat) {
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject2).id));
                        }
                    }
                    tL_inputStorePaymentPremiumGiveaway = tL_inputStorePaymentStarsGiveaway;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.id;
                tL_payments_launchPrepaidGiveaway.peer = messagesController.getInputPeer(-chat.id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentPremiumGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new BoostsActivity$$ExternalSyntheticLambda7(boostViaGiftsBottomSheet$$ExternalSyntheticLambda13, messagesController, boostViaGiftsBottomSheet$$ExternalSyntheticLambda21, 20));
                break;
        }
    }

    public MediaController$$ExternalSyntheticLambda8(Object obj, long j, long j2, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$1 = obj2;
        this.f$4 = obj3;
    }

    public MediaController$$ExternalSyntheticLambda8(Object obj, Serializable serializable, long j, long j2, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = serializable;
        this.f$2 = j;
        this.f$3 = j2;
        this.f$4 = obj2;
    }

    public MediaController$$ExternalSyntheticLambda8(Object obj, TLObject tLObject, TLObject tLObject2, long j, long j2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = tLObject;
        this.f$4 = tLObject2;
        this.f$2 = j;
        this.f$3 = j2;
    }

    public MediaController$$ExternalSyntheticLambda8(GiftAuctionController giftAuctionController, Utilities.Callback2 callback2, long j, AuctionBidSheet.Params params, long j2) {
        this.$r8$classId = 2;
        this.f$0 = giftAuctionController;
        this.f$1 = callback2;
        this.f$2 = j;
        this.f$4 = params;
        this.f$3 = j2;
    }
}

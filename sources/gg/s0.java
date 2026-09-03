package gg;

import android.os.Bundle;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.FileLoadOperation;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.p70;
import org.telegram.ui.l11;
public final class s0 implements Runnable {
    public final int f6731a;
    public final long f6732b;
    public final long f6733c;
    public final Object d;
    public final Object e;
    public final Object f6734f;

    public s0(long j10, long j11, Runnable runnable, ArrayList arrayList, TopicsController topicsController) {
        this.f6731a = 7;
        this.d = topicsController;
        this.f6732b = j10;
        this.e = arrayList;
        this.f6733c = j11;
        this.f6734f = runnable;
    }

    @Override
    public final void run() {
        boolean z4;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i10 = this.f6731a;
        Object obj = this.f6734f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                b1 b1Var = (b1) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l10 = p0.l(b1Var.f6559j0);
                int i11 = b1Var.f6556g0;
                int i12 = ig.w.f7533s;
                if (i11 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                b1Var.f6562n0.b(true);
                ArrayList arrayList = b1Var.Z;
                ArrayList arrayList2 = b1Var.f6551b0;
                TLRPC.Chat chat = b1Var.Y;
                boolean z10 = b1Var.f6569u0;
                boolean z11 = b1Var.f6568t0;
                int i13 = prepaidGiveaway.quantity;
                String str = b1Var.f6567s0;
                ArrayList arrayList3 = arrayList;
                x0 x0Var = new x0(b1Var, tL_prepaidStarsGiveaway, this.f6732b, this.f6733c, prepaidGiveaway);
                t0 t0Var = new t0(b1Var, 6);
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z4;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z10;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l10;
                    int i14 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i14 | 6;
                    if (z11) {
                        tL_inputStorePaymentStarsGiveaway.flags = i14 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.f19159id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    int size = arrayList2.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj4 = arrayList2.get(i15);
                        i15++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj4)).iso2);
                    }
                    int size2 = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        ArrayList arrayList4 = arrayList3;
                        Object obj5 = arrayList4.get(i16);
                        i16++;
                        TLObject tLObject = (TLObject) obj5;
                        if (tLObject instanceof TLRPC.Chat) {
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f19159id));
                        }
                        arrayList3 = arrayList4;
                    }
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z4;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z10;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l10;
                    int i17 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i17 | 6;
                    if (z11) {
                        tL_inputStorePaymentStarsGiveaway.flags = i17 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.f19159id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    tL_inputStorePaymentStarsGiveaway.stars = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                    tL_inputStorePaymentStarsGiveaway.users = prepaidGiveaway.quantity;
                    int size3 = arrayList2.size();
                    int i18 = 0;
                    while (i18 < size3) {
                        Object obj6 = arrayList2.get(i18);
                        i18++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj6)).iso2);
                    }
                    int size4 = arrayList3.size();
                    int i19 = 0;
                    while (i19 < size4) {
                        Object obj7 = arrayList3.get(i19);
                        i19++;
                        TLObject tLObject2 = (TLObject) obj7;
                        if (tLObject2 instanceof TLRPC.Chat) {
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject2).f19159id));
                        }
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.f19393id;
                tL_payments_launchPrepaidGiveaway.peer = messagesController.getInputPeer(-chat.f19159id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new y((Utilities.Callback) t0Var, messagesController, (Utilities.Callback) x0Var, 2));
                return;
            case 1:
                ((FileLoadOperation) obj3).lambda$getDownloadedLengthFromOffset$4((long[]) obj2, this.f6732b, this.f6733c, (CountDownLatch) obj);
                return;
            case 2:
                long j10 = this.f6733c;
                ((GiftAuctionController) obj3).lambda$sendBid$6((Utilities.Callback2) obj2, this.f6732b, (kh.r) obj, j10);
                return;
            case 3:
                ((MediaController) obj3).lambda$trimCurrentRecording$26((File) obj2, this.f6732b, this.f6733c, (Runnable) obj);
                return;
            case 4:
                ((MessagesStorage) obj3).lambda$getMessage$142(this.f6732b, this.f6733c, (AtomicReference) obj2, (CountDownLatch) obj);
                return;
            case 5:
                ((MessagesStorage) obj3).lambda$updateDialogsWithDeletedMessages$228(this.f6732b, this.f6733c, (ArrayList) obj2, (ArrayList) obj);
                return;
            case 6:
                ((TopicsController) obj3).lambda$getTopicRepliesCount$29((TLObject) obj2, (TLRPC.TL_forumTopic) obj, this.f6732b, this.f6733c);
                return;
            case 7:
                ((TopicsController) obj3).lambda$loadTopic$27(this.f6732b, (ArrayList) obj2, this.f6733c, (Runnable) obj);
                return;
            default:
                ((p70) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f6732b);
                bundle.putLong("topic_id", this.f6733c);
                ((org.telegram.ui.ActionBar.p2) obj2).presentFragment(new l11(bundle, (f6) obj));
                return;
        }
    }

    public s0(Object obj, long j10, long j11, Object obj2, Object obj3, int i10) {
        this.f6731a = i10;
        this.d = obj;
        this.f6732b = j10;
        this.f6733c = j11;
        this.e = obj2;
        this.f6734f = obj3;
    }

    public s0(Object obj, Serializable serializable, long j10, long j11, Object obj2, int i10) {
        this.f6731a = i10;
        this.d = obj;
        this.e = serializable;
        this.f6732b = j10;
        this.f6733c = j11;
        this.f6734f = obj2;
    }

    public s0(Object obj, TLObject tLObject, TLObject tLObject2, long j10, long j11, int i10) {
        this.f6731a = i10;
        this.d = obj;
        this.e = tLObject;
        this.f6734f = tLObject2;
        this.f6732b = j10;
        this.f6733c = j11;
    }

    public s0(GiftAuctionController giftAuctionController, Utilities.Callback2 callback2, long j10, kh.r rVar, long j11) {
        this.f6731a = 2;
        this.d = giftAuctionController;
        this.e = callback2;
        this.f6732b = j10;
        this.f6734f = rVar;
        this.f6733c = j11;
    }
}

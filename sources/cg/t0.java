package cg;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b70;
import org.telegram.ui.t01;

public final class t0 implements Runnable {

    public final int f2819a;

    public final long f2820b;

    public final long f2821c;
    public final Object d;

    public final Object f2822e;

    public final Object f2823f;

    public t0(long j10, long j11, Runnable runnable, ArrayList arrayList, TopicsController topicsController) {
        this.f2819a = 7;
        this.d = topicsController;
        this.f2820b = j10;
        this.f2822e = arrayList;
        this.f2821c = j11;
        this.f2823f = runnable;
    }

    @Override
    public final void run() {
        ?? tL_inputStorePaymentStarsGiveaway;
        int i10 = this.f2819a;
        Object obj = this.f2823f;
        Object obj2 = this.f2822e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                d1 d1Var = (d1) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int iL = q0.l(d1Var.f2642i0);
                int i11 = d1Var.f2639f0;
                int i12 = eg.x.f5455s;
                boolean z10 = i11 == 1;
                d1Var.m0.b(true);
                ArrayList arrayList = d1Var.Y;
                ArrayList arrayList2 = d1Var.f2634a0;
                TLRPC.Chat chat = d1Var.X;
                boolean z11 = d1Var.f2652t0;
                boolean z12 = d1Var.f2651s0;
                int i13 = prepaidGiveaway.quantity;
                String str = d1Var.f2650r0;
                ArrayList arrayList3 = arrayList;
                z0 z0Var = new z0(d1Var, tL_prepaidStarsGiveaway, this.f2820b, this.f2821c, prepaidGiveaway);
                v0 v0Var = new v0(d1Var, 6);
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = iL;
                    int i14 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i14 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i14 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.f22380id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f22380id));
                        }
                        arrayList3 = arrayList4;
                    }
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = iL;
                    int i17 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i17 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i17 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.f22380id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject2).f22380id));
                        }
                    }
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.f22616id;
                tL_payments_launchPrepaidGiveaway.peer = messagesController.getInputPeer(-chat.f22380id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new y((Utilities.Callback) v0Var, messagesController, (Utilities.Callback) z0Var, 2));
                break;
            case 1:
                ((FileLoadOperation) obj3).lambda$getDownloadedLengthFromOffset$4((long[]) obj2, this.f2820b, this.f2821c, (CountDownLatch) obj);
                break;
            case 2:
                ((GiftAuctionController) obj3).lambda$sendBid$6((Utilities.Callback2) obj2, this.f2820b, (gh.u) obj, this.f2821c);
                break;
            case 3:
                ((MediaController) obj3).lambda$trimCurrentRecording$26((File) obj2, this.f2820b, this.f2821c, (Runnable) obj);
                break;
            case 4:
                ((MessagesStorage) obj3).lambda$getMessage$142(this.f2820b, this.f2821c, (AtomicReference) obj2, (CountDownLatch) obj);
                break;
            case 5:
                ((MessagesStorage) obj3).lambda$updateDialogsWithDeletedMessages$228(this.f2820b, this.f2821c, (ArrayList) obj2, (ArrayList) obj);
                break;
            case 6:
                ((TopicsController) obj3).lambda$getTopicRepliesCount$29((TLObject) obj2, (TLRPC.TL_forumTopic) obj, this.f2820b, this.f2821c);
                break;
            case 7:
                ((TopicsController) obj3).lambda$loadTopic$27(this.f2820b, (ArrayList) obj2, this.f2821c, (Runnable) obj);
                break;
            default:
                ((b70) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f2820b);
                bundle.putLong("topic_id", this.f2821c);
                ((org.telegram.ui.ActionBar.n2) obj2).presentFragment(new t01(bundle, (c6) obj));
                break;
        }
    }

    public t0(Object obj, long j10, long j11, Object obj2, Object obj3, int i10) {
        this.f2819a = i10;
        this.d = obj;
        this.f2820b = j10;
        this.f2821c = j11;
        this.f2822e = obj2;
        this.f2823f = obj3;
    }

    public t0(Object obj, Serializable serializable, long j10, long j11, Object obj2, int i10) {
        this.f2819a = i10;
        this.d = obj;
        this.f2822e = serializable;
        this.f2820b = j10;
        this.f2821c = j11;
        this.f2823f = obj2;
    }

    public t0(Object obj, TLObject tLObject, TLObject tLObject2, long j10, long j11, int i10) {
        this.f2819a = i10;
        this.d = obj;
        this.f2822e = tLObject;
        this.f2823f = tLObject2;
        this.f2820b = j10;
        this.f2821c = j11;
    }

    public t0(GiftAuctionController giftAuctionController, Utilities.Callback2 callback2, long j10, gh.u uVar, long j11) {
        this.f2819a = 2;
        this.d = giftAuctionController;
        this.f2822e = callback2;
        this.f2820b = j10;
        this.f2823f = uVar;
        this.f2821c = j11;
    }
}

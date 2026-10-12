package org.telegram.messenger;

import android.os.Bundle;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.s80;
import org.telegram.ui.x11;
import tg.r;
public final class x2 implements Runnable {
    public final int f19520a;
    public final long f19521b;
    public final long f19522c;
    public final Object d;
    public final Object f19523e;
    public final Object f19524f;

    public x2(long j3, long j10, Runnable runnable, ArrayList arrayList, TopicsController topicsController) {
        this.f19520a = 6;
        this.d = topicsController;
        this.f19521b = j3;
        this.f19523e = arrayList;
        this.f19522c = j10;
        this.f19524f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i10;
        int i11;
        int i12 = this.f19520a;
        Object obj = this.f19524f;
        Object obj2 = this.f19523e;
        Object obj3 = this.d;
        switch (i12) {
            case 0:
                ((FileLoadOperation) obj3).lambda$getDownloadedLengthFromOffset$5((long[]) obj2, this.f19521b, this.f19522c, (CountDownLatch) obj);
                return;
            case 1:
                ((GiftAuctionController) obj3).lambda$sendBid$6((Utilities.Callback2) obj2, this.f19521b, (xh.n) obj, this.f19522c);
                return;
            case 2:
                ((MediaController) obj3).lambda$trimCurrentRecording$27((File) obj2, this.f19521b, this.f19522c, (Runnable) obj);
                return;
            case 3:
                ((MessagesStorage) obj3).lambda$getMessage$142(this.f19521b, this.f19522c, (AtomicReference) obj2, (CountDownLatch) obj);
                return;
            case 4:
                ((MessagesStorage) obj3).lambda$updateDialogsWithDeletedMessages$228(this.f19521b, this.f19522c, (ArrayList) obj2, (ArrayList) obj);
                return;
            case 5:
                ((TopicsController) obj3).lambda$getTopicRepliesCount$29((TLObject) obj2, (TLRPC.TL_forumTopic) obj, this.f19521b, this.f19522c);
                return;
            case 6:
                ((TopicsController) obj3).lambda$loadTopic$27(this.f19521b, (ArrayList) obj2, this.f19522c, (Runnable) obj);
                return;
            case 7:
                ((s80) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f19521b);
                bundle.putLong("topic_id", this.f19522c);
                ((org.telegram.ui.ActionBar.m2) obj2).presentFragment(new x11(bundle, (org.telegram.ui.ActionBar.c6) obj));
                return;
            default:
                tg.a0 a0Var = (tg.a0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l4 = r.l(a0Var.m0);
                int i13 = a0Var.f48514j0;
                int i14 = vg.u.v;
                if (i13 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a0Var.f48520q0.b(true);
                ArrayList arrayList = a0Var.f48507c0;
                ArrayList arrayList2 = a0Var.f48509e0;
                TLRPC.Chat chat = a0Var.f48506b0;
                boolean z11 = a0Var.f48527x0;
                boolean z12 = a0Var.f48526w0;
                int i15 = prepaidGiveaway.quantity;
                String str = a0Var.f48525v0;
                tg.x xVar = new tg.x(a0Var, tL_prepaidStarsGiveaway, this.f19521b, this.f19522c, prepaidGiveaway);
                tg.u uVar = new tg.u(a0Var, 6);
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l4;
                    int i16 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i16 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i16 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.f19803id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    int size = arrayList2.size();
                    int i17 = 0;
                    while (i17 < size) {
                        Object obj4 = arrayList2.get(i17);
                        i17++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj4)).iso2);
                    }
                    int size2 = arrayList.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        Object obj5 = arrayList.get(i18);
                        i18++;
                        TLObject tLObject = (TLObject) obj5;
                        if (tLObject instanceof TLRPC.Chat) {
                            i11 = size2;
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f19803id));
                        } else {
                            i11 = size2;
                        }
                        size2 = i11;
                    }
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l4;
                    int i19 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i19 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i19 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.f19803id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    tL_inputStorePaymentStarsGiveaway.stars = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                    tL_inputStorePaymentStarsGiveaway.users = prepaidGiveaway.quantity;
                    int size3 = arrayList2.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj6 = arrayList2.get(i20);
                        i20++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj6)).iso2);
                    }
                    int size4 = arrayList.size();
                    int i21 = 0;
                    while (i21 < size4) {
                        Object obj7 = arrayList.get(i21);
                        i21++;
                        TLObject tLObject2 = (TLObject) obj7;
                        if (tLObject2 instanceof TLRPC.Chat) {
                            i10 = size4;
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject2).f19803id));
                        } else {
                            i10 = size4;
                        }
                        size4 = i10;
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.f20041id;
                tL_payments_launchPrepaidGiveaway.peer = messagesController.getInputPeer(-chat.f19803id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new ai.t5(uVar, messagesController, xVar, 18));
                return;
        }
    }

    public x2(Object obj, long j3, long j10, Object obj2, Object obj3, int i10) {
        this.f19520a = i10;
        this.d = obj;
        this.f19521b = j3;
        this.f19522c = j10;
        this.f19523e = obj2;
        this.f19524f = obj3;
    }

    public x2(Object obj, Serializable serializable, long j3, long j10, Object obj2, int i10) {
        this.f19520a = i10;
        this.d = obj;
        this.f19523e = serializable;
        this.f19521b = j3;
        this.f19522c = j10;
        this.f19524f = obj2;
    }

    public x2(Object obj, TLObject tLObject, TLObject tLObject2, long j3, long j10, int i10) {
        this.f19520a = i10;
        this.d = obj;
        this.f19523e = tLObject;
        this.f19524f = tLObject2;
        this.f19521b = j3;
        this.f19522c = j10;
    }

    public x2(GiftAuctionController giftAuctionController, Utilities.Callback2 callback2, long j3, xh.n nVar, long j10) {
        this.f19520a = 1;
        this.d = giftAuctionController;
        this.f19523e = callback2;
        this.f19521b = j3;
        this.f19524f = nVar;
        this.f19522c = j10;
    }
}

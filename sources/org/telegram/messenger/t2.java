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
import org.telegram.ui.Components.n70;
import org.telegram.ui.y11;
public final class t2 implements Runnable {
    public final int f19022a;
    public final long f19023b;
    public final long f19024c;
    public final Object d;
    public final Object f19025e;
    public final Object f19026f;

    public t2(long j3, long j10, Runnable runnable, ArrayList arrayList, TopicsController topicsController) {
        this.f19022a = 6;
        this.d = topicsController;
        this.f19023b = j3;
        this.f19025e = arrayList;
        this.f19024c = j10;
        this.f19026f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i10;
        int i11;
        int i12 = this.f19022a;
        Object obj = this.f19026f;
        Object obj2 = this.f19025e;
        Object obj3 = this.d;
        switch (i12) {
            case 0:
                ((FileLoadOperation) obj3).lambda$getDownloadedLengthFromOffset$4((long[]) obj2, this.f19023b, this.f19024c, (CountDownLatch) obj);
                return;
            case 1:
                long j3 = this.f19024c;
                ((GiftAuctionController) obj3).lambda$sendBid$6((Utilities.Callback2) obj2, this.f19023b, (yh.l) obj, j3);
                return;
            case 2:
                ((MediaController) obj3).lambda$trimCurrentRecording$26((File) obj2, this.f19023b, this.f19024c, (Runnable) obj);
                return;
            case 3:
                ((MessagesStorage) obj3).lambda$getMessage$142(this.f19023b, this.f19024c, (AtomicReference) obj2, (CountDownLatch) obj);
                return;
            case 4:
                ((MessagesStorage) obj3).lambda$updateDialogsWithDeletedMessages$228(this.f19023b, this.f19024c, (ArrayList) obj2, (ArrayList) obj);
                return;
            case 5:
                ((TopicsController) obj3).lambda$getTopicRepliesCount$29((TLObject) obj2, (TLRPC.TL_forumTopic) obj, this.f19023b, this.f19024c);
                return;
            case 6:
                ((TopicsController) obj3).lambda$loadTopic$27(this.f19023b, (ArrayList) obj2, this.f19024c, (Runnable) obj);
                return;
            case 7:
                ((n70) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f19023b);
                bundle.putLong("topic_id", this.f19024c);
                ((org.telegram.ui.ActionBar.n2) obj2).presentFragment(new y11(bundle, (org.telegram.ui.ActionBar.f6) obj));
                return;
            default:
                ug.b0 b0Var = (ug.b0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l4 = ug.t.l(b0Var.m0);
                int i13 = b0Var.f47077j0;
                int i14 = wg.u.f48559s;
                if (i13 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                b0Var.f47083q0.b(true);
                ArrayList arrayList = b0Var.f47070c0;
                ArrayList arrayList2 = b0Var.f47072e0;
                TLRPC.Chat chat = b0Var.f47069b0;
                boolean z11 = b0Var.f47090x0;
                boolean z12 = b0Var.f47089w0;
                int i15 = prepaidGiveaway.quantity;
                String str = b0Var.f47088v0;
                ug.z zVar = new ug.z(b0Var, tL_prepaidStarsGiveaway, this.f19023b, this.f19024c, prepaidGiveaway);
                ug.w wVar = new ug.w(b0Var, 6);
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.f19869id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f19869id));
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.f19869id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject2).f19869id));
                        } else {
                            i10 = size4;
                        }
                        size4 = i10;
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.f20106id;
                tL_payments_launchPrepaidGiveaway.peer = messagesController.getInputPeer(-chat.f19869id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new bi.c5(wVar, messagesController, zVar, 18));
                return;
        }
    }

    public t2(Object obj, long j3, long j10, Object obj2, Object obj3, int i10) {
        this.f19022a = i10;
        this.d = obj;
        this.f19023b = j3;
        this.f19024c = j10;
        this.f19025e = obj2;
        this.f19026f = obj3;
    }

    public t2(Object obj, Serializable serializable, long j3, long j10, Object obj2, int i10) {
        this.f19022a = i10;
        this.d = obj;
        this.f19025e = serializable;
        this.f19023b = j3;
        this.f19024c = j10;
        this.f19026f = obj2;
    }

    public t2(Object obj, TLObject tLObject, TLObject tLObject2, long j3, long j10, int i10) {
        this.f19022a = i10;
        this.d = obj;
        this.f19025e = tLObject;
        this.f19026f = tLObject2;
        this.f19023b = j3;
        this.f19024c = j10;
    }

    public t2(GiftAuctionController giftAuctionController, Utilities.Callback2 callback2, long j3, yh.l lVar, long j10) {
        this.f19022a = 1;
        this.d = giftAuctionController;
        this.f19025e = callback2;
        this.f19023b = j3;
        this.f19026f = lVar;
        this.f19024c = j10;
    }
}

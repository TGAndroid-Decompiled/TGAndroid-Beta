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
import org.telegram.ui.Components.k80;
import org.telegram.ui.h11;
public final class y2 implements Runnable {
    public final int f21871a;
    public final long f21872b;
    public final long f21873c;
    public final Object d;
    public final Object e;
    public final Object f21874f;

    public y2(long j10, long j11, Runnable runnable, ArrayList arrayList, TopicsController topicsController) {
        this.f21871a = 6;
        this.d = topicsController;
        this.f21872b = j10;
        this.e = arrayList;
        this.f21873c = j11;
        this.f21874f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i10;
        int i11;
        int i12 = this.f21871a;
        Object obj = this.f21874f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i12) {
            case 0:
                ((FileLoadOperation) obj3).lambda$getDownloadedLengthFromOffset$5((long[]) obj2, this.f21872b, this.f21873c, (CountDownLatch) obj);
                return;
            case 1:
                ((GiftAuctionController) obj3).lambda$sendBid$6((Utilities.Callback2) obj2, this.f21872b, (zh.l) obj, this.f21873c);
                return;
            case 2:
                ((MediaController) obj3).lambda$trimCurrentRecording$28((File) obj2, this.f21872b, this.f21873c, (Runnable) obj);
                return;
            case 3:
                ((MessagesStorage) obj3).lambda$getMessage$145(this.f21872b, this.f21873c, (AtomicReference) obj2, (CountDownLatch) obj);
                return;
            case 4:
                ((MessagesStorage) obj3).lambda$updateDialogsWithDeletedMessages$231(this.f21872b, this.f21873c, (ArrayList) obj2, (ArrayList) obj);
                return;
            case 5:
                ((TopicsController) obj3).lambda$getTopicRepliesCount$29((TLObject) obj2, (TLRPC.TL_forumTopic) obj, this.f21872b, this.f21873c);
                return;
            case 6:
                ((TopicsController) obj3).lambda$loadTopic$27(this.f21872b, (ArrayList) obj2, this.f21873c, (Runnable) obj);
                return;
            case 7:
                ((k80) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f21872b);
                bundle.putLong("topic_id", this.f21873c);
                ((org.telegram.ui.ActionBar.r2) obj2).presentFragment(new h11(bundle, (org.telegram.ui.ActionBar.u6) obj));
                return;
            default:
                vg.a0 a0Var = (vg.a0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l4 = vg.s.l(a0Var.m0);
                int i13 = a0Var.f50127j0;
                int i14 = xg.u.v;
                if (i13 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a0Var.f50133q0.b(true);
                ArrayList arrayList = a0Var.f50120c0;
                ArrayList arrayList2 = a0Var.f50122e0;
                TLRPC.Chat chat = a0Var.f50119b0;
                boolean z11 = a0Var.f50140x0;
                boolean z12 = a0Var.f50139w0;
                int i15 = prepaidGiveaway.quantity;
                String str = a0Var.f50138v0;
                vg.y yVar = new vg.y(a0Var, tL_prepaidStarsGiveaway, this.f21872b, this.f21873c, prepaidGiveaway);
                vg.v vVar = new vg.v(a0Var, 6);
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.f22027id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f22027id));
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.f22027id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject2).f22027id));
                        } else {
                            i10 = size4;
                        }
                        size4 = i10;
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.f22265id;
                tL_payments_launchPrepaidGiveaway.peer = messagesController.getInputPeer(-chat.f22027id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new bi.h2(vVar, messagesController, yVar, 23));
                return;
        }
    }

    public y2(Object obj, long j10, long j11, Object obj2, Object obj3, int i10) {
        this.f21871a = i10;
        this.d = obj;
        this.f21872b = j10;
        this.f21873c = j11;
        this.e = obj2;
        this.f21874f = obj3;
    }

    public y2(Object obj, Serializable serializable, long j10, long j11, Object obj2, int i10) {
        this.f21871a = i10;
        this.d = obj;
        this.e = serializable;
        this.f21872b = j10;
        this.f21873c = j11;
        this.f21874f = obj2;
    }

    public y2(Object obj, TLObject tLObject, TLObject tLObject2, long j10, long j11, int i10) {
        this.f21871a = i10;
        this.d = obj;
        this.e = tLObject;
        this.f21874f = tLObject2;
        this.f21872b = j10;
        this.f21873c = j11;
    }

    public y2(GiftAuctionController giftAuctionController, Utilities.Callback2 callback2, long j10, zh.l lVar, long j11) {
        this.f21871a = 1;
        this.d = giftAuctionController;
        this.e = callback2;
        this.f21872b = j10;
        this.f21874f = lVar;
        this.f21873c = j11;
    }
}

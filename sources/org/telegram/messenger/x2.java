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
import org.telegram.ui.Components.j80;
import org.telegram.ui.d11;
public final class x2 implements Runnable {
    public final int f20106a;
    public final long f20107b;
    public final long f20108c;
    public final Object d;
    public final Object e;
    public final Object f20109f;

    public x2(long j10, long j11, Runnable runnable, ArrayList arrayList, TopicsController topicsController) {
        this.f20106a = 6;
        this.d = topicsController;
        this.f20107b = j10;
        this.e = arrayList;
        this.f20108c = j11;
        this.f20109f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i10;
        int i11;
        int i12 = this.f20106a;
        Object obj = this.f20109f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i12) {
            case 0:
                ((FileLoadOperation) obj3).lambda$getDownloadedLengthFromOffset$5((long[]) obj2, this.f20107b, this.f20108c, (CountDownLatch) obj);
                return;
            case 1:
                ((GiftAuctionController) obj3).lambda$sendBid$6((Utilities.Callback2) obj2, this.f20107b, (yh.l) obj, this.f20108c);
                return;
            case 2:
                ((MediaController) obj3).lambda$trimCurrentRecording$28((File) obj2, this.f20107b, this.f20108c, (Runnable) obj);
                return;
            case 3:
                ((MessagesStorage) obj3).lambda$getMessage$142(this.f20107b, this.f20108c, (AtomicReference) obj2, (CountDownLatch) obj);
                return;
            case 4:
                ((MessagesStorage) obj3).lambda$updateDialogsWithDeletedMessages$228(this.f20107b, this.f20108c, (ArrayList) obj2, (ArrayList) obj);
                return;
            case 5:
                ((TopicsController) obj3).lambda$getTopicRepliesCount$29((TLObject) obj2, (TLRPC.TL_forumTopic) obj, this.f20107b, this.f20108c);
                return;
            case 6:
                ((TopicsController) obj3).lambda$loadTopic$27(this.f20107b, (ArrayList) obj2, this.f20108c, (Runnable) obj);
                return;
            case 7:
                ((j80) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f20107b);
                bundle.putLong("topic_id", this.f20108c);
                ((org.telegram.ui.ActionBar.o2) obj2).presentFragment(new d11(bundle, (org.telegram.ui.ActionBar.g6) obj));
                return;
            default:
                ug.y yVar = (ug.y) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l4 = ug.q.l(yVar.m0);
                int i13 = yVar.f48249j0;
                int i14 = wg.u.v;
                if (i13 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yVar.f48255q0.b(true);
                ArrayList arrayList = yVar.f48242c0;
                ArrayList arrayList2 = yVar.f48244e0;
                TLRPC.Chat chat = yVar.f48241b0;
                boolean z11 = yVar.f48262x0;
                boolean z12 = yVar.f48261w0;
                int i15 = prepaidGiveaway.quantity;
                String str = yVar.f48260v0;
                ug.w wVar = new ug.w(yVar, tL_prepaidStarsGiveaway, this.f20107b, this.f20108c, prepaidGiveaway);
                ug.t tVar = new ug.t(yVar, 6);
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.f20343id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f20343id));
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.f20343id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject2).f20343id));
                        } else {
                            i10 = size4;
                        }
                        size4 = i10;
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.f20576id;
                tL_payments_launchPrepaidGiveaway.peer = messagesController.getInputPeer(-chat.f20343id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new ai.j2(tVar, messagesController, wVar, 23));
                return;
        }
    }

    public x2(Object obj, long j10, long j11, Object obj2, Object obj3, int i10) {
        this.f20106a = i10;
        this.d = obj;
        this.f20107b = j10;
        this.f20108c = j11;
        this.e = obj2;
        this.f20109f = obj3;
    }

    public x2(Object obj, Serializable serializable, long j10, long j11, Object obj2, int i10) {
        this.f20106a = i10;
        this.d = obj;
        this.e = serializable;
        this.f20107b = j10;
        this.f20108c = j11;
        this.f20109f = obj2;
    }

    public x2(Object obj, TLObject tLObject, TLObject tLObject2, long j10, long j11, int i10) {
        this.f20106a = i10;
        this.d = obj;
        this.e = tLObject;
        this.f20109f = tLObject2;
        this.f20107b = j10;
        this.f20108c = j11;
    }

    public x2(GiftAuctionController giftAuctionController, Utilities.Callback2 callback2, long j10, yh.l lVar, long j11) {
        this.f20106a = 1;
        this.d = giftAuctionController;
        this.e = callback2;
        this.f20107b = j10;
        this.f20109f = lVar;
        this.f20108c = j11;
    }
}

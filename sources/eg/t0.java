package eg;

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
import org.telegram.ui.Components.j70;
import org.telegram.ui.t01;
public final class t0 implements Runnable {
    public final int f6128a;
    public final long f6129b;
    public final long f6130c;
    public final Object d;
    public final Object f6131e;
    public final Object f6132f;

    public t0(long j10, long j11, Runnable runnable, ArrayList arrayList, TopicsController topicsController) {
        this.f6128a = 7;
        this.d = topicsController;
        this.f6129b = j10;
        this.f6131e = arrayList;
        this.f6130c = j11;
        this.f6132f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i10 = this.f6128a;
        Object obj = this.f6132f;
        Object obj2 = this.f6131e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                c1 c1Var = (c1) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) obj;
                int l10 = q0.l(c1Var.f5943i0);
                int i11 = c1Var.f5940f0;
                int i12 = gg.w.f7346s;
                if (i11 == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                c1Var.m0.b(true);
                ArrayList arrayList = c1Var.Y;
                ArrayList arrayList2 = c1Var.f5935a0;
                TLRPC.Chat chat = c1Var.X;
                boolean z11 = c1Var.f5953t0;
                boolean z12 = c1Var.f5952s0;
                int i13 = prepaidGiveaway.quantity;
                String str = c1Var.f5951r0;
                ArrayList arrayList3 = arrayList;
                y0 y0Var = new y0(c1Var, tL_prepaidStarsGiveaway, this.f6129b, this.f6130c, prepaidGiveaway);
                u0 u0Var = new u0(c1Var, 6);
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l10;
                    int i14 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i14 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i14 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.f22392id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f22392id));
                        }
                        arrayList3 = arrayList4;
                    }
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = l10;
                    int i17 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i17 | 6;
                    if (z12) {
                        tL_inputStorePaymentStarsGiveaway.flags = i17 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = messagesController.getInputPeer(-chat.f22392id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject2).f22392id));
                        }
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.f22628id;
                tL_payments_launchPrepaidGiveaway.peer = messagesController.getInputPeer(-chat.f22392id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new z((Utilities.Callback) u0Var, messagesController, (Utilities.Callback) y0Var, 2));
                return;
            case 1:
                ((FileLoadOperation) obj3).lambda$getDownloadedLengthFromOffset$4((long[]) obj2, this.f6129b, this.f6130c, (CountDownLatch) obj);
                return;
            case 2:
                long j10 = this.f6130c;
                ((GiftAuctionController) obj3).lambda$sendBid$6((Utilities.Callback2) obj2, this.f6129b, (ih.s) obj, j10);
                return;
            case 3:
                ((MediaController) obj3).lambda$trimCurrentRecording$26((File) obj2, this.f6129b, this.f6130c, (Runnable) obj);
                return;
            case 4:
                ((MessagesStorage) obj3).lambda$getMessage$142(this.f6129b, this.f6130c, (AtomicReference) obj2, (CountDownLatch) obj);
                return;
            case 5:
                ((MessagesStorage) obj3).lambda$updateDialogsWithDeletedMessages$228(this.f6129b, this.f6130c, (ArrayList) obj2, (ArrayList) obj);
                return;
            case 6:
                ((TopicsController) obj3).lambda$getTopicRepliesCount$29((TLObject) obj2, (TLRPC.TL_forumTopic) obj, this.f6129b, this.f6130c);
                return;
            case 7:
                ((TopicsController) obj3).lambda$loadTopic$27(this.f6129b, (ArrayList) obj2, this.f6130c, (Runnable) obj);
                return;
            default:
                ((j70) obj3).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", this.f6129b);
                bundle.putLong("topic_id", this.f6130c);
                ((org.telegram.ui.ActionBar.o2) obj2).presentFragment(new t01(bundle, (c6) obj));
                return;
        }
    }

    public t0(Object obj, long j10, long j11, Object obj2, Object obj3, int i10) {
        this.f6128a = i10;
        this.d = obj;
        this.f6129b = j10;
        this.f6130c = j11;
        this.f6131e = obj2;
        this.f6132f = obj3;
    }

    public t0(Object obj, Serializable serializable, long j10, long j11, Object obj2, int i10) {
        this.f6128a = i10;
        this.d = obj;
        this.f6131e = serializable;
        this.f6129b = j10;
        this.f6130c = j11;
        this.f6132f = obj2;
    }

    public t0(Object obj, TLObject tLObject, TLObject tLObject2, long j10, long j11, int i10) {
        this.f6128a = i10;
        this.d = obj;
        this.f6131e = tLObject;
        this.f6132f = tLObject2;
        this.f6129b = j10;
        this.f6130c = j11;
    }

    public t0(GiftAuctionController giftAuctionController, Utilities.Callback2 callback2, long j10, ih.s sVar, long j11) {
        this.f6128a = 2;
        this.d = giftAuctionController;
        this.f6131e = callback2;
        this.f6129b = j10;
        this.f6132f = sVar;
        this.f6130c = j11;
    }
}

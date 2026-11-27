package defpackage;

import android.os.Bundle;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class hv4 implements Runnable {
    public final byte a;
    public final long b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;

    public hv4(qyb qybVar, long j, ArrayList arrayList, long j2, o30 o30Var) {
        this.a = (byte) 9;
        this.d = qybVar;
        this.b = j;
        this.e = arrayList;
        this.c = j2;
        this.f = o30Var;
    }

    @Override
    public final void run() {
        boolean z;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i = 0;
        switch (this.a) {
            case 0:
                ov4 ov4Var = (ov4) this.d;
                ky kyVar = (ky) this.e;
                long j = this.b;
                ty tyVar = (ty) this.f;
                long j2 = this.c;
                if (!jxa.v(ov4Var.currentAccount, false).e) {
                    kyVar.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                } else {
                    ov4Var.k(j, tyVar, j2, kyVar);
                    return;
                }
            case 1:
                qyb qybVar = (qyb) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f;
                long j3 = this.b;
                long j4 = this.c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    qybVar.getMessagesStorage().h2(j3, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && qybVar.getMessagesController().B2(j3)) {
                        kf7 messagesStorage = qybVar.getMessagesStorage();
                        messagesStorage.a.c(new yd7(messagesStorage, j3, j4, (byte) 2));
                        qybVar.s(-j3, j4);
                    }
                    jn7.f(qybVar.currentAccount).k(323, Long.valueOf(-j3), Boolean.TRUE);
                    return;
                }
                return;
            case 2:
                ao0 ao0Var = (ao0) this.d;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) this.e;
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) this.f;
                long j5 = this.b;
                long j6 = this.c;
                int n = on0.n(ao0Var.h2);
                int i2 = ao0Var.e2;
                int i3 = ky7.w;
                if (i2 == 1) {
                    z = true;
                } else {
                    z = false;
                }
                ao0Var.l2.b(true);
                ArrayList arrayList = ao0Var.X1;
                ArrayList arrayList2 = ao0Var.Z1;
                TLRPC.Chat chat = ao0Var.W1;
                boolean z2 = ao0Var.s2;
                boolean z3 = ao0Var.r2;
                int i4 = prepaidGiveaway.quantity;
                String str = ao0Var.q2;
                wn0 wn0Var = new wn0(ao0Var, tL_prepaidStarsGiveaway, j5, j6, prepaidGiveaway);
                tn0 tn0Var = new tn0(ao0Var, (byte) 6);
                uc7 s1 = uc7.s1(yac.t0);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z2;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = n;
                    int i5 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i5 | 6;
                    if (z3) {
                        tL_inputStorePaymentStarsGiveaway.flags = i5 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = s1.j1(-chat.id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    int size = arrayList2.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList2.get(i6);
                        i6++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj)).iso2);
                    }
                    int size2 = arrayList.size();
                    int i7 = 0;
                    while (i7 < size2) {
                        Object obj2 = arrayList.get(i7);
                        i7++;
                        TLObject tLObject2 = (TLObject) obj2;
                        if (tLObject2 instanceof TLRPC.Chat) {
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(s1.j1(-((TLRPC.Chat) tLObject2).id));
                        }
                    }
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                    tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z;
                    tL_inputStorePaymentStarsGiveaway.winners_are_visible = z2;
                    tL_inputStorePaymentStarsGiveaway.prize_description = str;
                    tL_inputStorePaymentStarsGiveaway.until_date = n;
                    int i8 = tL_inputStorePaymentStarsGiveaway.flags;
                    tL_inputStorePaymentStarsGiveaway.flags = i8 | 6;
                    if (z3) {
                        tL_inputStorePaymentStarsGiveaway.flags = i8 | 22;
                    }
                    tL_inputStorePaymentStarsGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentStarsGiveaway.additional_peers = new ArrayList<>();
                    tL_inputStorePaymentStarsGiveaway.boost_peer = s1.j1(-chat.id);
                    tL_inputStorePaymentStarsGiveaway.currency = "";
                    tL_inputStorePaymentStarsGiveaway.stars = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                    tL_inputStorePaymentStarsGiveaway.users = prepaidGiveaway.quantity;
                    int size3 = arrayList2.size();
                    int i9 = 0;
                    while (i9 < size3) {
                        Object obj3 = arrayList2.get(i9);
                        i9++;
                        tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj3)).iso2);
                    }
                    int size4 = arrayList.size();
                    int i10 = 0;
                    while (i10 < size4) {
                        Object obj4 = arrayList.get(i10);
                        i10++;
                        TLObject tLObject3 = (TLObject) obj4;
                        if (tLObject3 instanceof TLRPC.Chat) {
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(s1.j1(-((TLRPC.Chat) tLObject3).id));
                        }
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.id;
                tL_payments_launchPrepaidGiveaway.peer = s1.j1(-chat.id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new fn0((pcc) tn0Var, s1, (pcc) wn0Var, (byte) 2));
                return;
            case 3:
                long j7 = this.b;
                long j8 = this.c;
                ((fu5) this.d).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", j7);
                bundle.putLong("topic_id", j8);
                ((zu1) this.e).presentFragment(new zu8(bundle, (vnb) this.f));
                return;
            case 4:
                hb4 hb4Var = (hb4) this.d;
                long[] jArr = (long[]) this.e;
                long j9 = this.b;
                long j10 = this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f;
                try {
                    jArr[0] = hb4Var.f(j9, j10, hb4Var.M);
                } catch (Throwable th) {
                    cc4.g(th, true);
                    jArr[0] = 0;
                }
                if (hb4Var.Y == 3) {
                    jArr[1] = 1;
                }
                countDownLatch.countDown();
                return;
            case 5:
                MediaController mediaController = (MediaController) this.d;
                vn6 vn6Var = (vn6) this.e;
                long j11 = this.b;
                long j12 = this.c;
                go1 go1Var = (go1) this.f;
                String[] strArr = MediaController.W1;
                if (MediaController.cropOpusFile(mediaController.k1.getAbsolutePath(), vn6Var.getAbsolutePath(), j11, j12)) {
                    File file = mediaController.k1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.k1 = vn6Var;
                    mediaController.l1 = j12 - j11;
                    hl.c3(go1Var);
                    return;
                }
                return;
            case 6:
                ((ls6) this.d).getNotificationCenter().k(74, Long.valueOf(this.b), (ArrayList) this.e, (ArrayList) this.f, Long.valueOf(this.c));
                return;
            case 7:
                kf7 kf7Var = (kf7) this.d;
                long j13 = this.b;
                long j14 = this.c;
                AtomicReference atomicReference = (AtomicReference) this.e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f;
                kf7Var.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        sQLiteCursor = kf7Var.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j13 + " AND mid = " + j14 + " LIMIT 1", new Object[0]);
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                byteBufferValue.reuse();
                                atomicReference.set(TLdeserialize);
                            }
                        }
                        sQLiteCursor.dispose();
                    } catch (Exception e) {
                        kf7Var.p(e, true);
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                    }
                    countDownLatch2.countDown();
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    countDownLatch2.countDown();
                    throw th2;
                }
            case 8:
                ((kf7) this.d).U1(this.b, this.c, (ArrayList) this.e, (ArrayList) this.f);
                return;
            default:
                qyb qybVar2 = (qyb) this.d;
                long j15 = this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                long j16 = this.c;
                o30 o30Var = (o30) this.f;
                qybVar2.getClass();
                if (f11.a) {
                    StringBuilder o = ik8.o(j15, "loaded from cache ", " topics_count=");
                    if (arrayList3 != null) {
                        i = arrayList3.size();
                    }
                    c00.q(i, o);
                }
                qybVar2.u(j15, arrayList3, null, true, 0, -1);
                qybVar2.y(j15, true);
                if (qybVar2.f(j15, j16) != null) {
                    o30Var.run();
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                new TLRPC.TL_forumTopic().id = (int) j16;
                qybVar2.v(j15, arrayList4, o30Var);
                return;
        }
    }

    public hv4(ls6 ls6Var, long j, ArrayList arrayList, ArrayList arrayList2, long j2) {
        this.a = (byte) 6;
        this.d = ls6Var;
        this.b = j;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = j2;
    }

    public hv4(ov4 ov4Var, ky kyVar, long j, ty tyVar, long j2) {
        this.a = (byte) 0;
        this.d = ov4Var;
        this.e = kyVar;
        this.b = j;
        this.f = tyVar;
        this.c = j2;
    }

    public hv4(Object obj, long j, long j2, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
        this.e = obj2;
        this.f = obj3;
    }

    public hv4(Object obj, Serializable serializable, long j, long j2, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = serializable;
        this.b = j;
        this.c = j2;
        this.f = obj2;
    }

    public hv4(Object obj, TLObject tLObject, TLObject tLObject2, long j, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = tLObject;
        this.f = tLObject2;
        this.b = j;
        this.c = j2;
    }
}

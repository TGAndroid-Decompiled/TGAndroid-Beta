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
public final class dt4 implements Runnable {
    public final byte a;
    public final long b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;

    public dt4(pub pubVar, long j, ArrayList arrayList, long j2, n30 n30Var) {
        this.a = (byte) 9;
        this.d = pubVar;
        this.b = j;
        this.e = arrayList;
        this.c = j2;
        this.f = n30Var;
    }

    @Override
    public final void run() {
        boolean z;
        ?? tL_inputStorePaymentStarsGiveaway;
        int i = 0;
        switch (this.a) {
            case 0:
                kt4 kt4Var = (kt4) this.d;
                jy jyVar = (jy) this.e;
                long j = this.b;
                sy syVar = (sy) this.f;
                long j2 = this.c;
                if (!gta.v(kt4Var.currentAccount, false).e) {
                    jyVar.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                } else {
                    kt4Var.k(j, syVar, j2, jyVar);
                    return;
                }
            case 1:
                pub pubVar = (pub) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f;
                long j3 = this.b;
                long j4 = this.c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    pubVar.getMessagesStorage().c2(j3, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && pubVar.getMessagesController().x2(j3)) {
                        ad7 messagesStorage = pubVar.getMessagesStorage();
                        messagesStorage.a.c(new sa7(messagesStorage, j3, j4, (byte) 1));
                        pubVar.s(-j3, j4);
                    }
                    kk7.f(pubVar.currentAccount).k(322, Long.valueOf(-j3), Boolean.TRUE);
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
                int i3 = dv7.w;
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
                na7 q1 = na7.q1(y6c.t0);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y6c.t0);
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = q1.h1(-chat.id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(q1.h1(-((TLRPC.Chat) tLObject2).id));
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
                    tL_inputStorePaymentStarsGiveaway.boost_peer = q1.h1(-chat.id);
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
                            tL_inputStorePaymentStarsGiveaway.additional_peers.add(q1.h1(-((TLRPC.Chat) tLObject3).id));
                        }
                    }
                } else {
                    return;
                }
                TLRPC.TL_payments_launchPrepaidGiveaway tL_payments_launchPrepaidGiveaway = new TLRPC.TL_payments_launchPrepaidGiveaway();
                tL_payments_launchPrepaidGiveaway.giveaway_id = prepaidGiveaway.id;
                tL_payments_launchPrepaidGiveaway.peer = q1.h1(-chat.id);
                tL_payments_launchPrepaidGiveaway.purpose = tL_inputStorePaymentStarsGiveaway;
                connectionsManager.sendRequest(tL_payments_launchPrepaidGiveaway, new en0((p8c) tn0Var, q1, (p8c) wn0Var, (byte) 2));
                return;
            case 3:
                long j7 = this.b;
                long j8 = this.c;
                ((cs5) this.d).u();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", j7);
                bundle.putLong("topic_id", j8);
                ((mu1) this.e).presentFragment(new pr8(bundle, (wjb) this.f));
                return;
            case 4:
                l94 l94Var = (l94) this.d;
                long[] jArr = (long[]) this.e;
                long j9 = this.b;
                long j10 = this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f;
                try {
                    jArr[0] = l94Var.f(j9, j10, l94Var.M);
                } catch (Throwable th) {
                    fa4.g(th, true);
                    jArr[0] = 0;
                }
                if (l94Var.Y == 3) {
                    jArr[1] = 1;
                }
                countDownLatch.countDown();
                return;
            case 5:
                MediaController mediaController = (MediaController) this.d;
                pl6 pl6Var = (pl6) this.e;
                long j11 = this.b;
                long j12 = this.c;
                hq1 hq1Var = (hq1) this.f;
                String[] strArr = MediaController.W1;
                if (MediaController.cropOpusFile(mediaController.k1.getAbsolutePath(), pl6Var.getAbsolutePath(), j11, j12)) {
                    File file = mediaController.k1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.k1 = pl6Var;
                    mediaController.l1 = j12 - j11;
                    gl.c3(hq1Var);
                    return;
                }
                return;
            case 6:
                ((hq6) this.d).getNotificationCenter().k(73, Long.valueOf(this.b), (ArrayList) this.e, (ArrayList) this.f, Long.valueOf(this.c));
                return;
            case 7:
                ad7 ad7Var = (ad7) this.d;
                long j13 = this.b;
                long j14 = this.c;
                AtomicReference atomicReference = (AtomicReference) this.e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f;
                ad7Var.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        sQLiteCursor = ad7Var.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j13 + " AND mid = " + j14 + " LIMIT 1", new Object[0]);
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
                        ad7Var.n(e, true);
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
                ((ad7) this.d).P1(this.b, this.c, (ArrayList) this.e, (ArrayList) this.f);
                return;
            default:
                pub pubVar2 = (pub) this.d;
                long j15 = this.b;
                ArrayList arrayList3 = (ArrayList) this.e;
                long j16 = this.c;
                n30 n30Var = (n30) this.f;
                pubVar2.getClass();
                if (w01.a) {
                    StringBuilder o = ug8.o(j15, "loaded from cache ", " topics_count=");
                    if (arrayList3 != null) {
                        i = arrayList3.size();
                    }
                    b00.p(i, o);
                }
                pubVar2.u(j15, arrayList3, null, true, 0, -1);
                pubVar2.y(j15, true);
                if (pubVar2.f(j15, j16) != null) {
                    n30Var.run();
                    return;
                }
                ArrayList arrayList4 = new ArrayList();
                new TLRPC.TL_forumTopic().id = (int) j16;
                pubVar2.v(j15, arrayList4, n30Var);
                return;
        }
    }

    public dt4(hq6 hq6Var, long j, ArrayList arrayList, ArrayList arrayList2, long j2) {
        this.a = (byte) 6;
        this.d = hq6Var;
        this.b = j;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = j2;
    }

    public dt4(kt4 kt4Var, jy jyVar, long j, sy syVar, long j2) {
        this.a = (byte) 0;
        this.d = kt4Var;
        this.e = jyVar;
        this.b = j;
        this.f = syVar;
        this.c = j2;
    }

    public dt4(Object obj, long j, long j2, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = j;
        this.c = j2;
        this.e = obj2;
        this.f = obj3;
    }

    public dt4(Object obj, Serializable serializable, long j, long j2, Object obj2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = serializable;
        this.b = j;
        this.c = j2;
        this.f = obj2;
    }

    public dt4(Object obj, TLObject tLObject, TLObject tLObject2, long j, long j2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = tLObject;
        this.f = tLObject2;
        this.b = j;
        this.c = j2;
    }
}

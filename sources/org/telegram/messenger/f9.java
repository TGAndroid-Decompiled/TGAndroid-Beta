package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f9 implements Runnable {
    public final int f22467a;
    public final long f22468b;
    public final long f22469c;
    public final Object d;
    public final Object f22470e;
    public final Object f22471f;

    public f9(Object obj, Serializable serializable, long j10, long j11, Object obj2, int i3) {
        this.f22467a = i3;
        this.d = obj;
        this.f22470e = serializable;
        this.f22468b = j10;
        this.f22469c = j11;
        this.f22471f = obj2;
    }

    @Override
    public final void run() {
        int i3 = 0;
        switch (this.f22467a) {
            case 0:
                q9 q9Var = (q9) this.d;
                ai.r rVar = (ai.r) this.f22470e;
                long j10 = this.f22468b;
                ai.d0 d0Var = (ai.d0) this.f22471f;
                long j11 = this.f22469c;
                if (!ci.e9.y(q9Var.currentAccount, false).f5032e) {
                    rVar.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                } else {
                    q9Var.k(j10, d0Var, j11, rVar);
                    return;
                }
            case 1:
                c00 c00Var = (c00) this.d;
                TLObject tLObject = (TLObject) this.f22470e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f22471f;
                long j12 = this.f22468b;
                long j13 = this.f22469c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    c00Var.getMessagesStorage().f2(j12, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && c00Var.getMessagesController().y2(j12)) {
                        qr messagesStorage = c00Var.getMessagesStorage();
                        messagesStorage.f24934a.c(new mp(1, j12, j13, messagesStorage));
                        c00Var.s(-j12, j13);
                    }
                    hs.f(c00Var.currentAccount).k(319, Long.valueOf(-j12), Boolean.TRUE);
                    return;
                }
                return;
            case 2:
                i7 i7Var = (i7) this.d;
                long[] jArr = (long[]) this.f22470e;
                long j14 = this.f22468b;
                long j15 = this.f22469c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f22471f;
                try {
                    jArr[0] = i7Var.h(j14, j15, i7Var.M);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    jArr[0] = 0;
                }
                if (i7Var.Y == 3) {
                    jArr[1] = 1;
                }
                countDownLatch.countDown();
                return;
            case 3:
                MediaController mediaController = (MediaController) this.d;
                je jeVar = (je) this.f22470e;
                long j16 = this.f22468b;
                long j17 = this.f22469c;
                org.telegram.ui.Components.vf vfVar = (org.telegram.ui.Components.vf) this.f22471f;
                if (MediaController.cropOpusFile(mediaController.k1.getAbsolutePath(), jeVar.getAbsolutePath(), j16, j17)) {
                    File file = mediaController.k1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.k1 = jeVar;
                    mediaController.f21328l1 = j17 - j16;
                    g0.h3(vfVar);
                    return;
                }
                return;
            case 4:
                ((li) this.d).getNotificationCenter().k(73, Long.valueOf(this.f22468b), (ArrayList) this.f22470e, (ArrayList) this.f22471f, Long.valueOf(this.f22469c));
                return;
            case 5:
                qr qrVar = (qr) this.d;
                long j18 = this.f22468b;
                long j19 = this.f22469c;
                AtomicReference atomicReference = (AtomicReference) this.f22470e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f22471f;
                qrVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = qrVar.f24936b;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j18 + " AND mid = " + j19 + " LIMIT 1", new Object[0]);
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                byteBufferValue.reuse();
                                atomicReference.set(TLdeserialize);
                            }
                        }
                        sQLiteCursor.dispose();
                    } catch (Throwable th3) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        countDownLatch2.countDown();
                        throw th3;
                    }
                } catch (Exception e10) {
                    qrVar.o(e10, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
                countDownLatch2.countDown();
                return;
            case 6:
                ((qr) this.d).S1(this.f22468b, this.f22469c, (ArrayList) this.f22470e, (ArrayList) this.f22471f);
                return;
            default:
                c00 c00Var2 = (c00) this.d;
                long j20 = this.f22468b;
                ArrayList arrayList = (ArrayList) this.f22470e;
                long j21 = this.f22469c;
                c3.f0 f0Var = (c3.f0) this.f22471f;
                c00Var2.getClass();
                if (r2.f25040a) {
                    StringBuilder t10 = a1.g.t(j20, "loaded from cache ", " topics_count=");
                    if (arrayList != null) {
                        i3 = arrayList.size();
                    }
                    k2.p1.q(i3, t10);
                }
                c00Var2.u(j20, arrayList, null, true, 0, -1);
                c00Var2.y(j20, true);
                if (c00Var2.f(j20, j21) != null) {
                    f0Var.run();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                new TLRPC.TL_forumTopic().f27053id = (int) j21;
                c00Var2.v(j20, arrayList2, f0Var);
                return;
        }
    }

    public f9(q9 q9Var, ai.r rVar, long j10, ai.d0 d0Var, long j11) {
        this.f22467a = 0;
        this.d = q9Var;
        this.f22470e = rVar;
        this.f22468b = j10;
        this.f22471f = d0Var;
        this.f22469c = j11;
    }

    public f9(li liVar, long j10, ArrayList arrayList, ArrayList arrayList2, long j11) {
        this.f22467a = 4;
        this.d = liVar;
        this.f22468b = j10;
        this.f22470e = arrayList;
        this.f22471f = arrayList2;
        this.f22469c = j11;
    }

    public f9(qr qrVar, long j10, long j11, Serializable serializable, Object obj, int i3) {
        this.f22467a = i3;
        this.d = qrVar;
        this.f22468b = j10;
        this.f22469c = j11;
        this.f22470e = serializable;
        this.f22471f = obj;
    }

    public f9(c00 c00Var, long j10, ArrayList arrayList, long j11, c3.f0 f0Var) {
        this.f22467a = 7;
        this.d = c00Var;
        this.f22468b = j10;
        this.f22470e = arrayList;
        this.f22469c = j11;
        this.f22471f = f0Var;
    }

    public f9(c00 c00Var, TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j10, long j11) {
        this.f22467a = 1;
        this.d = c00Var;
        this.f22470e = tLObject;
        this.f22471f = tL_forumTopic;
        this.f22468b = j10;
        this.f22469c = j11;
    }
}

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
public final class k9 implements Runnable {
    public final int f24663a;
    public final long f24664b;
    public final long f24665c;
    public final Object d;
    public final Object f24666e;
    public final Object f24667f;

    public k9(Object obj, Serializable serializable, long j3, long j10, Object obj2, int i7) {
        this.f24663a = i7;
        this.d = obj;
        this.f24666e = serializable;
        this.f24664b = j3;
        this.f24665c = j10;
        this.f24667f = obj2;
    }

    @Override
    public final void run() {
        int i7 = 0;
        switch (this.f24663a) {
            case 0:
                v9 v9Var = (v9) this.d;
                bi.n nVar = (bi.n) this.f24666e;
                long j3 = this.f24664b;
                bi.x xVar = (bi.x) this.f24667f;
                long j10 = this.f24665c;
                if (!di.v8.y(v9Var.currentAccount, false).f9601e) {
                    nVar.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                } else {
                    v9Var.k(j3, xVar, j10, nVar);
                    return;
                }
            case 1:
                h00 h00Var = (h00) this.d;
                TLObject tLObject = (TLObject) this.f24666e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f24667f;
                long j11 = this.f24664b;
                long j12 = this.f24665c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    h00Var.getMessagesStorage().f2(j11, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && h00Var.getMessagesController().y2(j11)) {
                        vr messagesStorage = h00Var.getMessagesStorage();
                        messagesStorage.f27220a.c(new sp(1, j11, j12, messagesStorage));
                        h00Var.s(-j11, j12);
                    }
                    ns.f(h00Var.currentAccount).k(319, Long.valueOf(-j11), Boolean.TRUE);
                    return;
                }
                return;
            case 2:
                i7 i7Var = (i7) this.d;
                long[] jArr = (long[]) this.f24666e;
                long j13 = this.f24664b;
                long j14 = this.f24665c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f24667f;
                try {
                    jArr[0] = i7Var.h(j13, j14, i7Var.M);
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
                oe oeVar = (oe) this.f24666e;
                long j15 = this.f24664b;
                long j16 = this.f24665c;
                org.telegram.ui.Components.dg dgVar = (org.telegram.ui.Components.dg) this.f24667f;
                if (MediaController.cropOpusFile(mediaController.f22356k1.getAbsolutePath(), oeVar.getAbsolutePath(), j15, j16)) {
                    File file = mediaController.f22356k1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.f22356k1 = oeVar;
                    mediaController.l1 = j16 - j15;
                    g0.h3(dgVar);
                    return;
                }
                return;
            case 4:
                ((si) this.d).getNotificationCenter().k(73, Long.valueOf(this.f24664b), (ArrayList) this.f24666e, (ArrayList) this.f24667f, Long.valueOf(this.f24665c));
                return;
            case 5:
                vr vrVar = (vr) this.d;
                long j17 = this.f24664b;
                long j18 = this.f24665c;
                AtomicReference atomicReference = (AtomicReference) this.f24666e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f24667f;
                vrVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = vrVar.f27222b;
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j17 + " AND mid = " + j18 + " LIMIT 1", new Object[0]);
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
                    vrVar.o(e10, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
                countDownLatch2.countDown();
                return;
            case 6:
                ((vr) this.d).S1(this.f24664b, this.f24665c, (ArrayList) this.f24666e, (ArrayList) this.f24667f);
                return;
            default:
                h00 h00Var2 = (h00) this.d;
                long j19 = this.f24664b;
                ArrayList arrayList = (ArrayList) this.f24666e;
                long j20 = this.f24665c;
                d3.e0 e0Var = (d3.e0) this.f24667f;
                h00Var2.getClass();
                if (r2.f26198a) {
                    StringBuilder t6 = a8.p0.t(j19, "loaded from cache ", " topics_count=");
                    if (arrayList != null) {
                        i7 = arrayList.size();
                    }
                    i5.c.r(i7, t6);
                }
                h00Var2.u(j19, arrayList, null, true, 0, -1);
                h00Var2.y(j19, true);
                if (h00Var2.f(j19, j20) != null) {
                    e0Var.run();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                new TLRPC.TL_forumTopic().f28103id = (int) j20;
                h00Var2.v(j19, arrayList2, e0Var);
                return;
        }
    }

    public k9(v9 v9Var, bi.n nVar, long j3, bi.x xVar, long j10) {
        this.f24663a = 0;
        this.d = v9Var;
        this.f24666e = nVar;
        this.f24664b = j3;
        this.f24667f = xVar;
        this.f24665c = j10;
    }

    public k9(si siVar, long j3, ArrayList arrayList, ArrayList arrayList2, long j10) {
        this.f24663a = 4;
        this.d = siVar;
        this.f24664b = j3;
        this.f24666e = arrayList;
        this.f24667f = arrayList2;
        this.f24665c = j10;
    }

    public k9(vr vrVar, long j3, long j10, Serializable serializable, Object obj, int i7) {
        this.f24663a = i7;
        this.d = vrVar;
        this.f24664b = j3;
        this.f24665c = j10;
        this.f24666e = serializable;
        this.f24667f = obj;
    }

    public k9(h00 h00Var, long j3, ArrayList arrayList, long j10, d3.e0 e0Var) {
        this.f24663a = 7;
        this.d = h00Var;
        this.f24664b = j3;
        this.f24666e = arrayList;
        this.f24665c = j10;
        this.f24667f = e0Var;
    }

    public k9(h00 h00Var, TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j3, long j10) {
        this.f24663a = 1;
        this.d = h00Var;
        this.f24666e = tLObject;
        this.f24667f = tL_forumTopic;
        this.f24664b = j3;
        this.f24665c = j10;
    }
}

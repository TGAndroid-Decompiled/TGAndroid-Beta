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
    public final int f25041a;
    public final long f25042b;
    public final long f25043c;
    public final Object d;
    public final Object f25044e;
    public final Object f25045f;

    public k9(Object obj, Serializable serializable, long j3, long j10, Object obj2, int i7) {
        this.f25041a = i7;
        this.d = obj;
        this.f25044e = serializable;
        this.f25042b = j3;
        this.f25043c = j10;
        this.f25045f = obj2;
    }

    @Override
    public final void run() {
        int i7 = 0;
        switch (this.f25041a) {
            case 0:
                v9 v9Var = (v9) this.d;
                bi.n nVar = (bi.n) this.f25044e;
                long j3 = this.f25042b;
                bi.x xVar = (bi.x) this.f25045f;
                long j10 = this.f25043c;
                if (!di.y8.y(v9Var.currentAccount, false).f10088e) {
                    nVar.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                } else {
                    v9Var.k(j3, xVar, j10, nVar);
                    return;
                }
            case 1:
                f00 f00Var = (f00) this.d;
                TLObject tLObject = (TLObject) this.f25044e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f25045f;
                long j11 = this.f25042b;
                long j12 = this.f25043c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    f00Var.getMessagesStorage().f2(j11, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && f00Var.getMessagesController().E2(j11)) {
                        ur messagesStorage = f00Var.getMessagesStorage();
                        messagesStorage.f27250a.c(new op(1, j11, j12, messagesStorage));
                        f00Var.s(-j11, j12);
                    }
                    ls.f(f00Var.currentAccount).k(322, Long.valueOf(-j11), Boolean.TRUE);
                    return;
                }
                return;
            case 2:
                i7 i7Var = (i7) this.d;
                long[] jArr = (long[]) this.f25044e;
                long j13 = this.f25042b;
                long j14 = this.f25043c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f25045f;
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
                oe oeVar = (oe) this.f25044e;
                long j15 = this.f25042b;
                long j16 = this.f25043c;
                org.telegram.ui.Components.og ogVar = (org.telegram.ui.Components.og) this.f25045f;
                if (MediaController.cropOpusFile(mediaController.f22750k1.getAbsolutePath(), oeVar.getAbsolutePath(), j15, j16)) {
                    File file = mediaController.f22750k1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.f22750k1 = oeVar;
                    mediaController.l1 = j16 - j15;
                    g0.g3(ogVar);
                    return;
                }
                return;
            case 4:
                ((si) this.d).getNotificationCenter().k(73, Long.valueOf(this.f25042b), (ArrayList) this.f25044e, (ArrayList) this.f25045f, Long.valueOf(this.f25043c));
                return;
            case 5:
                ur urVar = (ur) this.d;
                long j17 = this.f25042b;
                long j18 = this.f25043c;
                AtomicReference atomicReference = (AtomicReference) this.f25044e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f25045f;
                urVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = urVar.f27252b;
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
                    urVar.o(e10, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
                countDownLatch2.countDown();
                return;
            case 6:
                ((ur) this.d).S1(this.f25042b, this.f25043c, (ArrayList) this.f25044e, (ArrayList) this.f25045f);
                return;
            default:
                f00 f00Var2 = (f00) this.d;
                long j19 = this.f25042b;
                ArrayList arrayList = (ArrayList) this.f25044e;
                long j20 = this.f25043c;
                d3.e0 e0Var = (d3.e0) this.f25045f;
                f00Var2.getClass();
                if (s2.f26730a) {
                    StringBuilder t6 = a8.p0.t(j19, "loaded from cache ", " topics_count=");
                    if (arrayList != null) {
                        i7 = arrayList.size();
                    }
                    i5.c.t(i7, t6);
                }
                f00Var2.u(j19, arrayList, null, true, 0, -1);
                f00Var2.y(j19, true);
                if (f00Var2.f(j19, j20) != null) {
                    e0Var.run();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                new TLRPC.TL_forumTopic().f28486id = (int) j20;
                f00Var2.v(j19, arrayList2, e0Var);
                return;
        }
    }

    public k9(v9 v9Var, bi.n nVar, long j3, bi.x xVar, long j10) {
        this.f25041a = 0;
        this.d = v9Var;
        this.f25044e = nVar;
        this.f25042b = j3;
        this.f25045f = xVar;
        this.f25043c = j10;
    }

    public k9(si siVar, long j3, ArrayList arrayList, ArrayList arrayList2, long j10) {
        this.f25041a = 4;
        this.d = siVar;
        this.f25042b = j3;
        this.f25044e = arrayList;
        this.f25045f = arrayList2;
        this.f25043c = j10;
    }

    public k9(ur urVar, long j3, long j10, Serializable serializable, Object obj, int i7) {
        this.f25041a = i7;
        this.d = urVar;
        this.f25042b = j3;
        this.f25043c = j10;
        this.f25044e = serializable;
        this.f25045f = obj;
    }

    public k9(f00 f00Var, long j3, ArrayList arrayList, long j10, d3.e0 e0Var) {
        this.f25041a = 7;
        this.d = f00Var;
        this.f25042b = j3;
        this.f25044e = arrayList;
        this.f25043c = j10;
        this.f25045f = e0Var;
    }

    public k9(f00 f00Var, TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j3, long j10) {
        this.f25041a = 1;
        this.d = f00Var;
        this.f25044e = tLObject;
        this.f25045f = tL_forumTopic;
        this.f25042b = j3;
        this.f25043c = j10;
    }
}

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
import org.telegram.ui.z70;
public final class n9 implements Runnable {
    public final int f17273a;
    public final long f17274b;
    public final long f17275c;
    public final Object d;
    public final Object e;
    public final Object f17276f;

    public n9(Object obj, Serializable serializable, long j10, long j11, Object obj2, int i10) {
        this.f17273a = i10;
        this.d = obj;
        this.e = serializable;
        this.f17274b = j10;
        this.f17275c = j11;
        this.f17276f = obj2;
    }

    @Override
    public final void run() {
        int i10 = 0;
        switch (this.f17273a) {
            case 0:
                y9 y9Var = (y9) this.d;
                z70 z70Var = (z70) this.e;
                long j10 = this.f17274b;
                ph.l lVar = (ph.l) this.f17276f;
                long j11 = this.f17275c;
                if (!rh.e6.y(y9Var.currentAccount, false).e) {
                    z70Var.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                } else {
                    y9Var.k(j10, lVar, j11, z70Var);
                    return;
                }
            case 1:
                y00 y00Var = (y00) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f17276f;
                long j12 = this.f17274b;
                long j13 = this.f17275c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    y00Var.getMessagesStorage().f2(j12, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && y00Var.getMessagesController().x2(j12)) {
                        is messagesStorage = y00Var.getMessagesStorage();
                        messagesStorage.f16331a.c(new bq(1, j12, j13, messagesStorage));
                        y00Var.s(-j12, j13);
                    }
                    at.f(y00Var.currentAccount).k(319, Long.valueOf(-j12), Boolean.TRUE);
                    return;
                }
                return;
            case 2:
                m7 m7Var = (m7) this.d;
                long[] jArr = (long[]) this.e;
                long j14 = this.f17274b;
                long j15 = this.f17275c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f17276f;
                try {
                    jArr[0] = m7Var.h(j14, j15, m7Var.M);
                } catch (Throwable th2) {
                    f8.g(th2, true);
                    jArr[0] = 0;
                }
                if (m7Var.Y == 3) {
                    jArr[1] = 1;
                }
                countDownLatch.countDown();
                return;
            case 3:
                MediaController mediaController = (MediaController) this.d;
                qe qeVar = (qe) this.e;
                long j16 = this.f17274b;
                long j17 = this.f17275c;
                org.telegram.ui.Components.tf tfVar = (org.telegram.ui.Components.tf) this.f17276f;
                if (MediaController.cropOpusFile(mediaController.f14459i1.getAbsolutePath(), qeVar.getAbsolutePath(), j16, j17)) {
                    File file = mediaController.f14459i1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.f14459i1 = qeVar;
                    mediaController.f14461j1 = j17 - j16;
                    i0.g3(tfVar);
                    return;
                }
                return;
            case 4:
                is isVar = (is) this.d;
                long j18 = this.f17274b;
                long j19 = this.f17275c;
                AtomicReference atomicReference = (AtomicReference) this.e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f17276f;
                isVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = isVar.f16333b;
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
                } catch (Exception e) {
                    isVar.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
                countDownLatch2.countDown();
                return;
            case 5:
                ((is) this.d).S1(this.f17274b, this.f17275c, (ArrayList) this.e, (ArrayList) this.f17276f);
                return;
            default:
                y00 y00Var2 = (y00) this.d;
                long j20 = this.f17274b;
                ArrayList arrayList = (ArrayList) this.e;
                long j21 = this.f17275c;
                a3.h0 h0Var = (a3.h0) this.f17276f;
                y00Var2.getClass();
                if (v2.f18578a) {
                    StringBuilder s10 = a1.g.s(j20, "loaded from cache ", " topics_count=");
                    if (arrayList != null) {
                        i10 = arrayList.size();
                    }
                    i0.a.p(i10, s10);
                }
                y00Var2.u(j20, arrayList, null, true, 0, -1);
                y00Var2.y(j20, true);
                if (y00Var2.f(j20, j21) != null) {
                    h0Var.run();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                new TLRPC.TL_forumTopic().f19846id = (int) j21;
                y00Var2.v(j20, arrayList2, h0Var);
                return;
        }
    }

    public n9(y9 y9Var, z70 z70Var, long j10, ph.l lVar, long j11) {
        this.f17273a = 0;
        this.d = y9Var;
        this.e = z70Var;
        this.f17274b = j10;
        this.f17276f = lVar;
        this.f17275c = j11;
    }

    public n9(is isVar, long j10, long j11, Serializable serializable, Object obj, int i10) {
        this.f17273a = i10;
        this.d = isVar;
        this.f17274b = j10;
        this.f17275c = j11;
        this.e = serializable;
        this.f17276f = obj;
    }

    public n9(y00 y00Var, long j10, ArrayList arrayList, long j11, a3.h0 h0Var) {
        this.f17273a = 6;
        this.d = y00Var;
        this.f17274b = j10;
        this.e = arrayList;
        this.f17275c = j11;
        this.f17276f = h0Var;
    }

    public n9(y00 y00Var, TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j10, long j11) {
        this.f17273a = 1;
        this.d = y00Var;
        this.e = tLObject;
        this.f17276f = tL_forumTopic;
        this.f17274b = j10;
        this.f17275c = j11;
    }
}

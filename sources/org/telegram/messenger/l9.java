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
public final class l9 implements Runnable {
    public final int f23870a;
    public final long f23871b;
    public final long f23872c;
    public final Object d;
    public final Object f23873e;
    public final Object f23874f;

    public l9(Object obj, Serializable serializable, long j3, long j10, Object obj2, int i7) {
        this.f23870a = i7;
        this.d = obj;
        this.f23873e = serializable;
        this.f23871b = j3;
        this.f23872c = j10;
        this.f23874f = obj2;
    }

    @Override
    public final void run() {
        int i7 = 0;
        switch (this.f23870a) {
            case 0:
                w9 w9Var = (w9) this.d;
                ii.g0 g0Var = (ii.g0) this.f23873e;
                long j3 = this.f23871b;
                zh.k kVar = (zh.k) this.f23874f;
                long j10 = this.f23872c;
                if (!bi.ea.y(w9Var.currentAccount, false).f3807e) {
                    g0Var.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                } else {
                    w9Var.k(j3, kVar, j10, g0Var);
                    return;
                }
            case 1:
                k00 k00Var = (k00) this.d;
                TLObject tLObject = (TLObject) this.f23873e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f23874f;
                long j11 = this.f23871b;
                long j12 = this.f23872c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    k00Var.getMessagesStorage().f2(j11, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && k00Var.getMessagesController().y2(j11)) {
                        yr messagesStorage = k00Var.getMessagesStorage();
                        messagesStorage.f26723a.c(new vp(1, j11, j12, messagesStorage));
                        k00Var.s(-j11, j12);
                    }
                    qs.f(k00Var.currentAccount).k(319, Long.valueOf(-j11), Boolean.TRUE);
                    return;
                }
                return;
            case 2:
                i7 i7Var = (i7) this.d;
                long[] jArr = (long[]) this.f23873e;
                long j13 = this.f23871b;
                long j14 = this.f23872c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f23874f;
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
                pe peVar = (pe) this.f23873e;
                long j15 = this.f23871b;
                long j16 = this.f23872c;
                org.telegram.ui.Components.wf wfVar = (org.telegram.ui.Components.wf) this.f23874f;
                if (MediaController.cropOpusFile(mediaController.f21279j1.getAbsolutePath(), peVar.getAbsolutePath(), j15, j16)) {
                    File file = mediaController.f21279j1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.f21279j1 = peVar;
                    mediaController.f21281k1 = j16 - j15;
                    g0.h3(wfVar);
                    return;
                }
                return;
            case 4:
                ((ui) this.d).getNotificationCenter().k(73, Long.valueOf(this.f23871b), (ArrayList) this.f23873e, (ArrayList) this.f23874f, Long.valueOf(this.f23872c));
                return;
            case 5:
                yr yrVar = (yr) this.d;
                long j17 = this.f23871b;
                long j18 = this.f23872c;
                AtomicReference atomicReference = (AtomicReference) this.f23873e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f23874f;
                yrVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = yrVar.f26725b;
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
                    yrVar.o(e10, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
                countDownLatch2.countDown();
                return;
            case 6:
                ((yr) this.d).S1(this.f23871b, this.f23872c, (ArrayList) this.f23873e, (ArrayList) this.f23874f);
                return;
            default:
                k00 k00Var2 = (k00) this.d;
                long j19 = this.f23871b;
                ArrayList arrayList = (ArrayList) this.f23873e;
                long j20 = this.f23872c;
                bi.h4 h4Var = (bi.h4) this.f23874f;
                k00Var2.getClass();
                if (r2.f25216a) {
                    StringBuilder t6 = a8.p0.t(j19, "loaded from cache ", " topics_count=");
                    if (arrayList != null) {
                        i7 = arrayList.size();
                    }
                    jg.g.s(i7, t6);
                }
                k00Var2.u(j19, arrayList, null, true, 0, -1);
                k00Var2.y(j19, true);
                if (k00Var2.f(j19, j20) != null) {
                    h4Var.run();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                new TLRPC.TL_forumTopic().f27012id = (int) j20;
                k00Var2.v(j19, arrayList2, h4Var);
                return;
        }
    }

    public l9(w9 w9Var, ii.g0 g0Var, long j3, zh.k kVar, long j10) {
        this.f23870a = 0;
        this.d = w9Var;
        this.f23873e = g0Var;
        this.f23871b = j3;
        this.f23874f = kVar;
        this.f23872c = j10;
    }

    public l9(ui uiVar, long j3, ArrayList arrayList, ArrayList arrayList2, long j10) {
        this.f23870a = 4;
        this.d = uiVar;
        this.f23871b = j3;
        this.f23873e = arrayList;
        this.f23874f = arrayList2;
        this.f23872c = j10;
    }

    public l9(yr yrVar, long j3, long j10, Serializable serializable, Object obj, int i7) {
        this.f23870a = i7;
        this.d = yrVar;
        this.f23871b = j3;
        this.f23872c = j10;
        this.f23873e = serializable;
        this.f23874f = obj;
    }

    public l9(k00 k00Var, long j3, ArrayList arrayList, long j10, bi.h4 h4Var) {
        this.f23870a = 7;
        this.d = k00Var;
        this.f23871b = j3;
        this.f23873e = arrayList;
        this.f23872c = j10;
        this.f23874f = h4Var;
    }

    public l9(k00 k00Var, TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j3, long j10) {
        this.f23870a = 1;
        this.d = k00Var;
        this.f23873e = tLObject;
        this.f23874f = tL_forumTopic;
        this.f23871b = j3;
        this.f23872c = j10;
    }
}

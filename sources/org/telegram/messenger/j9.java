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
public final class j9 implements Runnable {
    public final int f24826a;
    public final long f24827b;
    public final long f24828c;
    public final Object d;
    public final Object f24829e;
    public final Object f24830f;

    public j9(Object obj, Serializable serializable, long j3, long j10, Object obj2, int i7) {
        this.f24826a = i7;
        this.d = obj;
        this.f24829e = serializable;
        this.f24827b = j3;
        this.f24828c = j10;
        this.f24830f = obj2;
    }

    @Override
    public final void run() {
        int i7 = 0;
        switch (this.f24826a) {
            case 0:
                u9 u9Var = (u9) this.d;
                bi.n nVar = (bi.n) this.f24829e;
                long j3 = this.f24827b;
                bi.x xVar = (bi.x) this.f24830f;
                long j10 = this.f24828c;
                if (!di.x8.y(u9Var.currentAccount, false).f10018e) {
                    nVar.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                } else {
                    u9Var.k(j3, xVar, j10, nVar);
                    return;
                }
            case 1:
                e00 e00Var = (e00) this.d;
                TLObject tLObject = (TLObject) this.f24829e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f24830f;
                long j11 = this.f24827b;
                long j12 = this.f24828c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    e00Var.getMessagesStorage().f2(j11, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && e00Var.getMessagesController().E2(j11)) {
                        tr messagesStorage = e00Var.getMessagesStorage();
                        messagesStorage.f27052a.c(new np(1, j11, j12, messagesStorage));
                        e00Var.s(-j11, j12);
                    }
                    ks.f(e00Var.currentAccount).k(322, Long.valueOf(-j11), Boolean.TRUE);
                    return;
                }
                return;
            case 2:
                i7 i7Var = (i7) this.d;
                long[] jArr = (long[]) this.f24829e;
                long j13 = this.f24827b;
                long j14 = this.f24828c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f24830f;
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
                ne neVar = (ne) this.f24829e;
                long j15 = this.f24827b;
                long j16 = this.f24828c;
                org.telegram.ui.Components.lg lgVar = (org.telegram.ui.Components.lg) this.f24830f;
                if (MediaController.cropOpusFile(mediaController.f22719k1.getAbsolutePath(), neVar.getAbsolutePath(), j15, j16)) {
                    File file = mediaController.f22719k1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.f22719k1 = neVar;
                    mediaController.l1 = j16 - j15;
                    g0.g3(lgVar);
                    return;
                }
                return;
            case 4:
                ((ri) this.d).getNotificationCenter().k(73, Long.valueOf(this.f24827b), (ArrayList) this.f24829e, (ArrayList) this.f24830f, Long.valueOf(this.f24828c));
                return;
            case 5:
                tr trVar = (tr) this.d;
                long j17 = this.f24827b;
                long j18 = this.f24828c;
                AtomicReference atomicReference = (AtomicReference) this.f24829e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f24830f;
                trVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = trVar.f27054b;
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
                    trVar.o(e10, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
                countDownLatch2.countDown();
                return;
            case 6:
                ((tr) this.d).S1(this.f24827b, this.f24828c, (ArrayList) this.f24829e, (ArrayList) this.f24830f);
                return;
            default:
                e00 e00Var2 = (e00) this.d;
                long j19 = this.f24827b;
                ArrayList arrayList = (ArrayList) this.f24829e;
                long j20 = this.f24828c;
                d3.e0 e0Var = (d3.e0) this.f24830f;
                e00Var2.getClass();
                if (s2.f26721a) {
                    StringBuilder t6 = a8.p0.t(j19, "loaded from cache ", " topics_count=");
                    if (arrayList != null) {
                        i7 = arrayList.size();
                    }
                    i5.c.t(i7, t6);
                }
                e00Var2.u(j19, arrayList, null, true, 0, -1);
                e00Var2.y(j19, true);
                if (e00Var2.f(j19, j20) != null) {
                    e0Var.run();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                new TLRPC.TL_forumTopic().f28455id = (int) j20;
                e00Var2.v(j19, arrayList2, e0Var);
                return;
        }
    }

    public j9(u9 u9Var, bi.n nVar, long j3, bi.x xVar, long j10) {
        this.f24826a = 0;
        this.d = u9Var;
        this.f24829e = nVar;
        this.f24827b = j3;
        this.f24830f = xVar;
        this.f24828c = j10;
    }

    public j9(ri riVar, long j3, ArrayList arrayList, ArrayList arrayList2, long j10) {
        this.f24826a = 4;
        this.d = riVar;
        this.f24827b = j3;
        this.f24829e = arrayList;
        this.f24830f = arrayList2;
        this.f24828c = j10;
    }

    public j9(tr trVar, long j3, long j10, Serializable serializable, Object obj, int i7) {
        this.f24826a = i7;
        this.d = trVar;
        this.f24827b = j3;
        this.f24828c = j10;
        this.f24829e = serializable;
        this.f24830f = obj;
    }

    public j9(e00 e00Var, long j3, ArrayList arrayList, long j10, d3.e0 e0Var) {
        this.f24826a = 7;
        this.d = e00Var;
        this.f24827b = j3;
        this.f24829e = arrayList;
        this.f24828c = j10;
        this.f24830f = e0Var;
    }

    public j9(e00 e00Var, TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j3, long j10) {
        this.f24826a = 1;
        this.d = e00Var;
        this.f24829e = tLObject;
        this.f24830f = tL_forumTopic;
        this.f24827b = j3;
        this.f24828c = j10;
    }
}

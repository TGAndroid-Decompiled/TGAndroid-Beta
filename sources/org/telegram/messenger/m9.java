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
import org.telegram.ui.a80;
public final class m9 implements Runnable {
    public final int f16931a;
    public final long f16932b;
    public final long f16933c;
    public final Object d;
    public final Object e;
    public final Object f16934f;

    public m9(Object obj, Serializable serializable, long j10, long j11, Object obj2, int i10) {
        this.f16931a = i10;
        this.d = obj;
        this.e = serializable;
        this.f16932b = j10;
        this.f16933c = j11;
        this.f16934f = obj2;
    }

    @Override
    public final void run() {
        int i10 = 0;
        switch (this.f16931a) {
            case 0:
                x9 x9Var = (x9) this.d;
                a80 a80Var = (a80) this.e;
                long j10 = this.f16932b;
                ph.l lVar = (ph.l) this.f16934f;
                long j11 = this.f16933c;
                if (!rh.e6.y(x9Var.currentAccount, false).e) {
                    a80Var.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                } else {
                    x9Var.k(j10, lVar, j11, a80Var);
                    return;
                }
            case 1:
                x00 x00Var = (x00) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f16934f;
                long j12 = this.f16932b;
                long j13 = this.f16933c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    x00Var.getMessagesStorage().f2(j12, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && x00Var.getMessagesController().x2(j12)) {
                        hs messagesStorage = x00Var.getMessagesStorage();
                        messagesStorage.f15938a.c(new aq(1, j12, j13, messagesStorage));
                        x00Var.s(-j12, j13);
                    }
                    zs.f(x00Var.currentAccount).k(319, Long.valueOf(-j12), Boolean.TRUE);
                    return;
                }
                return;
            case 2:
                m7 m7Var = (m7) this.d;
                long[] jArr = (long[]) this.e;
                long j14 = this.f16932b;
                long j15 = this.f16933c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f16934f;
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
                pe peVar = (pe) this.e;
                long j16 = this.f16932b;
                long j17 = this.f16933c;
                org.telegram.ui.Components.tf tfVar = (org.telegram.ui.Components.tf) this.f16934f;
                if (MediaController.cropOpusFile(mediaController.f14458i1.getAbsolutePath(), peVar.getAbsolutePath(), j16, j17)) {
                    File file = mediaController.f14458i1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.f14458i1 = peVar;
                    mediaController.f14460j1 = j17 - j16;
                    i0.g3(tfVar);
                    return;
                }
                return;
            case 4:
                hs hsVar = (hs) this.d;
                long j18 = this.f16932b;
                long j19 = this.f16933c;
                AtomicReference atomicReference = (AtomicReference) this.e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f16934f;
                hsVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = hsVar.f15940b;
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
                    hsVar.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
                countDownLatch2.countDown();
                return;
            case 5:
                ((hs) this.d).S1(this.f16932b, this.f16933c, (ArrayList) this.e, (ArrayList) this.f16934f);
                return;
            default:
                x00 x00Var2 = (x00) this.d;
                long j20 = this.f16932b;
                ArrayList arrayList = (ArrayList) this.e;
                long j21 = this.f16933c;
                a3.h0 h0Var = (a3.h0) this.f16934f;
                x00Var2.getClass();
                if (v2.f18448a) {
                    StringBuilder s10 = a1.g.s(j20, "loaded from cache ", " topics_count=");
                    if (arrayList != null) {
                        i10 = arrayList.size();
                    }
                    i0.a.p(i10, s10);
                }
                x00Var2.u(j20, arrayList, null, true, 0, -1);
                x00Var2.y(j20, true);
                if (x00Var2.f(j20, j21) != null) {
                    h0Var.run();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                new TLRPC.TL_forumTopic().f19845id = (int) j21;
                x00Var2.v(j20, arrayList2, h0Var);
                return;
        }
    }

    public m9(x9 x9Var, a80 a80Var, long j10, ph.l lVar, long j11) {
        this.f16931a = 0;
        this.d = x9Var;
        this.e = a80Var;
        this.f16932b = j10;
        this.f16934f = lVar;
        this.f16933c = j11;
    }

    public m9(hs hsVar, long j10, long j11, Serializable serializable, Object obj, int i10) {
        this.f16931a = i10;
        this.d = hsVar;
        this.f16932b = j10;
        this.f16933c = j11;
        this.e = serializable;
        this.f16934f = obj;
    }

    public m9(x00 x00Var, long j10, ArrayList arrayList, long j11, a3.h0 h0Var) {
        this.f16931a = 6;
        this.d = x00Var;
        this.f16932b = j10;
        this.e = arrayList;
        this.f16933c = j11;
        this.f16934f = h0Var;
    }

    public m9(x00 x00Var, TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j10, long j11) {
        this.f16931a = 1;
        this.d = x00Var;
        this.e = tLObject;
        this.f16934f = tL_forumTopic;
        this.f16932b = j10;
        this.f16933c = j11;
    }
}

package org.telegram.messenger;

import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class k2 extends c1 {
    public static volatile k2[] f23644b = new k2[4];
    public final LongSparseLongArray f23645a;

    public k2(int i7) {
        super(i7);
        this.f23645a = new LongSparseLongArray();
    }

    public static k2 b(int i7) {
        k2 k2Var;
        k2 k2Var2 = f23644b[i7];
        if (k2Var2 == null) {
            synchronized (f2.class) {
                try {
                    k2Var = f23644b[i7];
                    if (k2Var == null) {
                        k2[] k2VarArr = f23644b;
                        k2 k2Var3 = new k2(i7);
                        k2VarArr[i7] = k2Var3;
                        k2Var = k2Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return k2Var;
        }
        return k2Var2;
    }

    public final void a(long j3, long j10, TLRPC.JoinChatBotResult joinChatBotResult) {
        this.f23645a.get(j10, 0L);
        getNotificationCenter().k(qs.Q5, new j2(j3, joinChatBotResult));
        HashSet hashSet = hi.a3.f14507a1;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                hi.a3 a3Var = (hi.a3) it.next();
                hi.q4 q4Var = a3Var.f14540w0;
                if (q4Var != null && q4Var.f14891g == 5) {
                    long j11 = q4Var.f14887b;
                    if (j11 == j3 || j11 == 0) {
                        TLObject tLObject = q4Var.f14900q;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j10) {
                            a3Var.o(false);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void c(final long j3, final long j10, final long j11, boolean z9) {
        org.telegram.ui.ActionBar.f2 Q;
        if (LaunchActivity.G1 == null || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
        if (!z9) {
            if (!b6.h(this.currentAccount, j10) && !getMessagesController().W6.contains(Long.valueOf(j10))) {
                org.telegram.ui.Components.v4.n(Q, a22, new Runnable() {
                    @Override
                    public final void run() {
                        long j12 = j11;
                        k2 k2Var = k2.this;
                        long j13 = j3;
                        long j14 = j10;
                        k2Var.c(j13, j14, j12, true);
                        b6.n(k2Var.currentAccount, j14);
                    }
                }, new ai.m0(22));
                return;
            } else {
                c(j3, j10, j11, true);
                return;
            }
        }
        this.f23645a.put(j11, j10);
        org.telegram.ui.ActionBar.f2 Q2 = LaunchActivity.Q();
        hi.q4 b10 = hi.q4.b(this.currentAccount, j3, j10, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        b10.d = j11;
        hi.a3 a3Var = new hi.a3(LaunchActivity.G1, null);
        a3Var.B(false);
        a3Var.B0 = true;
        a3Var.f14526l0 = LaunchActivity.G1;
        a3Var.x(Q2, b10);
        a3Var.show();
    }
}

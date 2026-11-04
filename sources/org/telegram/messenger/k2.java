package org.telegram.messenger;

import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class k2 extends c1 {
    public static volatile k2[] f23791b = new k2[4];
    public final LongSparseLongArray f23792a;

    public k2(int i3) {
        super(i3);
        this.f23792a = new LongSparseLongArray();
    }

    public static k2 b(int i3) {
        k2 k2Var;
        k2 k2Var2 = f23791b[i3];
        if (k2Var2 == null) {
            synchronized (f2.class) {
                try {
                    k2Var = f23791b[i3];
                    if (k2Var == null) {
                        k2[] k2VarArr = f23791b;
                        k2 k2Var3 = new k2(i3);
                        k2VarArr[i3] = k2Var3;
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

    public final void a(long j10, long j11, TLRPC.JoinChatBotResult joinChatBotResult) {
        this.f23792a.get(j11, 0L);
        getNotificationCenter().k(hs.Q5, new j2(j10, joinChatBotResult));
        HashSet hashSet = ii.a3.f14789b1;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ii.a3 a3Var = (ii.a3) it.next();
                ii.q4 q4Var = a3Var.f14825x0;
                if (q4Var != null && q4Var.f15169g == 5) {
                    long j12 = q4Var.f15165b;
                    if (j12 == j10 || j12 == 0) {
                        TLObject tLObject = q4Var.f15178q;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j11) {
                            a3Var.o(false);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void c(final long j10, final long j11, final long j12, boolean z10) {
        org.telegram.ui.ActionBar.d2 Q;
        if (LaunchActivity.K1 == null || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j11));
        if (!z10) {
            if (!b6.h(this.currentAccount, j11) && !getMessagesController().W6.contains(Long.valueOf(j11))) {
                org.telegram.ui.Components.t4.n(Q, a22, new Runnable() {
                    @Override
                    public final void run() {
                        long j13 = j12;
                        k2 k2Var = k2.this;
                        long j14 = j10;
                        long j15 = j11;
                        k2Var.c(j14, j15, j13, true);
                        b6.n(k2Var.currentAccount, j15);
                    }
                }, new ai.y1(26));
                return;
            } else {
                c(j10, j11, j12, true);
                return;
            }
        }
        this.f23792a.put(j12, j11);
        org.telegram.ui.ActionBar.d2 Q2 = LaunchActivity.Q();
        ii.q4 b10 = ii.q4.b(this.currentAccount, j10, j11, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        b10.d = j12;
        ii.a3 a3Var = new ii.a3(LaunchActivity.K1, null);
        a3Var.B(false);
        a3Var.C0 = true;
        a3Var.m0 = LaunchActivity.K1;
        a3Var.x(Q2, b10);
        a3Var.show();
    }
}

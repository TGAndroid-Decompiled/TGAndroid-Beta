package org.telegram.messenger;

import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class l2 extends c1 {
    public static volatile l2[] f25441b = new l2[4];
    public final LongSparseLongArray f25442a;

    public l2(int i7) {
        super(i7);
        this.f25442a = new LongSparseLongArray();
    }

    public static l2 b(int i7) {
        l2 l2Var;
        l2 l2Var2 = f25441b[i7];
        if (l2Var2 == null) {
            synchronized (f2.class) {
                try {
                    l2Var = f25441b[i7];
                    if (l2Var == null) {
                        l2[] l2VarArr = f25441b;
                        l2 l2Var3 = new l2(i7);
                        l2VarArr[i7] = l2Var3;
                        l2Var = l2Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return l2Var;
        }
        return l2Var2;
    }

    public final void a(long j3, long j10, TLRPC.JoinChatBotResult joinChatBotResult) {
        this.f25442a.get(j10, 0L);
        getNotificationCenter().k(ks.T5, new k2(j3, joinChatBotResult));
        HashSet hashSet = ki.t2.f19012b1;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ki.t2 t2Var = (ki.t2) it.next();
                ki.f4 f4Var = t2Var.f19048x0;
                if (f4Var != null && f4Var.f18772g == 5) {
                    long j11 = f4Var.f18768b;
                    if (j11 == j3 || j11 == 0) {
                        TLObject tLObject = f4Var.f18781q;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j10) {
                            t2Var.o(false);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void c(final long j3, final long j10, final long j11, boolean z10) {
        org.telegram.ui.ActionBar.g2 Q;
        if (LaunchActivity.H1 == null || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j10));
        if (!z10) {
            if (!c6.j(this.currentAccount, j10) && !getMessagesController().Z6.contains(Long.valueOf(j10))) {
                org.telegram.ui.Components.b5.n(Q, c22, new Runnable() {
                    @Override
                    public final void run() {
                        long j12 = j11;
                        l2 l2Var = l2.this;
                        long j13 = j3;
                        long j14 = j10;
                        l2Var.c(j13, j14, j12, true);
                        c6.p(l2Var.currentAccount, j14);
                    }
                }, new j2(0));
                return;
            } else {
                c(j3, j10, j11, true);
                return;
            }
        }
        this.f25442a.put(j11, j10);
        org.telegram.ui.ActionBar.g2 Q2 = LaunchActivity.Q();
        ki.f4 b10 = ki.f4.b(this.currentAccount, j3, j10, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        b10.d = j11;
        ki.t2 t2Var = new ki.t2(LaunchActivity.H1, null);
        t2Var.B(false);
        t2Var.C0 = true;
        t2Var.m0 = LaunchActivity.H1;
        t2Var.x(Q2, b10);
        t2Var.show();
    }
}

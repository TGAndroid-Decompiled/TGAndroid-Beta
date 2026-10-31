package org.telegram.messenger;

import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class o2 extends f1 {
    public static volatile o2[] f17217b = new o2[4];
    public final LongSparseLongArray f17218a;

    public o2(int i10) {
        super(i10);
        this.f17218a = new LongSparseLongArray();
    }

    public static o2 b(int i10) {
        o2 o2Var;
        o2 o2Var2 = f17217b[i10];
        if (o2Var2 == null) {
            synchronized (j2.class) {
                try {
                    o2Var = f17217b[i10];
                    if (o2Var == null) {
                        o2[] o2VarArr = f17217b;
                        o2 o2Var3 = new o2(i10);
                        o2VarArr[i10] = o2Var3;
                        o2Var = o2Var3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return o2Var;
        }
        return o2Var2;
    }

    public final void a(long j10, long j11, TLRPC.JoinChatBotResult joinChatBotResult) {
        this.f17218a.get(j11, 0L);
        getNotificationCenter().k(zs.Q5, new n2(j10, joinChatBotResult));
        HashSet hashSet = xh.m2.f53871a1;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                xh.m2 m2Var = (xh.m2) it.next();
                xh.s3 s3Var = m2Var.f53903w0;
                if (s3Var != null && s3Var.f54044g == 5) {
                    long j12 = s3Var.f54041b;
                    if (j12 == j10 || j12 == 0) {
                        TLObject tLObject = s3Var.f54053q;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j11) {
                            m2Var.o(false);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void c(long j10, long j11, long j12, boolean z10) {
        org.telegram.ui.ActionBar.k2 Q;
        if (LaunchActivity.I1 == null || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j11));
        if (!z10) {
            if (!js.h(this.currentAccount, j11) && !getMessagesController().X6.contains(Long.valueOf(j11))) {
                org.telegram.ui.Components.s4.n(Q, Z1, new m2(this, j10, j11, j12, 0), new ag.f3(13));
                return;
            } else {
                c(j10, j11, j12, true);
                return;
            }
        }
        this.f17218a.put(j12, j11);
        org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
        xh.s3 b10 = xh.s3.b(this.currentAccount, j10, j11, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        b10.d = j12;
        xh.m2 m2Var = new xh.m2(LaunchActivity.I1, null);
        m2Var.B(false);
        m2Var.B0 = true;
        m2Var.f53889l0 = LaunchActivity.I1;
        m2Var.x(Q2, b10);
        m2Var.show();
    }
}

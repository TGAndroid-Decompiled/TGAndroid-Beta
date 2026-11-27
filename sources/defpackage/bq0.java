package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class bq0 extends rf0 {
    public static volatile bq0[] b = new bq0[4];
    public final LongSparseLongArray a;

    public bq0(int i) {
        super(i);
        this.a = new LongSparseLongArray();
    }

    public static bq0 b(int i) {
        bq0 bq0Var;
        bq0 bq0Var2 = b[i];
        if (bq0Var2 == null) {
            synchronized (wp0.class) {
                bq0Var = b[i];
                if (bq0Var == null) {
                    bq0[] bq0VarArr = b;
                    bq0 bq0Var3 = new bq0(i);
                    bq0VarArr[i] = bq0Var3;
                    bq0Var = bq0Var3;
                }
            }
            return bq0Var;
        }
        return bq0Var2;
    }

    public final void a(long j, long j2, TLRPC.JoinChatBotResult joinChatBotResult) {
        this.a.get(j2, 0L);
        getNotificationCenter().k(jn7.T5, new aq0(j, joinChatBotResult));
        HashSet hashSet = xw0.b1;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                xw0 xw0Var = (xw0) it.next();
                gzc gzcVar = xw0Var.x0;
                if (gzcVar != null && gzcVar.g == 5) {
                    long j3 = gzcVar.b;
                    if (j3 == j || j3 == 0) {
                        TLObject tLObject = gzcVar.q;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j2) {
                            xw0Var.m(false);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void c(long j, long j2, long j3, boolean z) {
        e Q;
        if (LaunchActivity.H1 == null || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j2));
        if (!z) {
            if (!vye.b(this.currentAccount, j2) && !getMessagesController().T3.contains(Long.valueOf(j2))) {
                jj.n(Q, X1, new zp0(this, j, j2, j3), new kc((byte) 10));
                return;
            } else {
                c(j, j2, j3, true);
                return;
            }
        }
        this.a.put(j3, j2);
        e Q2 = LaunchActivity.Q();
        gzc b2 = gzc.b(this.currentAccount, j, j2, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        b2.d = j3;
        xw0 xw0Var = new xw0(LaunchActivity.H1, null);
        xw0Var.B(false);
        xw0Var.C0 = true;
        xw0Var.m0 = LaunchActivity.H1;
        xw0Var.x(Q2, b2);
        xw0Var.show();
    }
}

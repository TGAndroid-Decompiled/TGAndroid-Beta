package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class bq0 extends pf0 {
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
        getNotificationCenter().k(kk7.S5, new aq0(j, joinChatBotResult));
        HashSet hashSet = ow0.b1;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ow0 ow0Var = (ow0) it.next();
                quc qucVar = ow0Var.x0;
                if (qucVar != null && qucVar.g == 5) {
                    long j3 = qucVar.b;
                    if (j3 == j || j3 == 0) {
                        TLObject tLObject = qucVar.q;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j2) {
                            ow0Var.m(false);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void c(long j, long j2, long j3, boolean z) {
        d Q;
        if (LaunchActivity.H1 == null || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j2));
        if (!z) {
            if (!bue.b(this.currentAccount, j2) && !getMessagesController().S3.contains(Long.valueOf(j2))) {
                ij.n(Q, V1, new zp0(this, j, j2, j3), new jc((byte) 10));
                return;
            } else {
                c(j, j2, j3, true);
                return;
            }
        }
        this.a.put(j3, j2);
        d Q2 = LaunchActivity.Q();
        quc b2 = quc.b(this.currentAccount, j, j2, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        b2.d = j3;
        ow0 ow0Var = new ow0(LaunchActivity.H1, null);
        ow0Var.B(false);
        ow0Var.C0 = true;
        ow0Var.m0 = LaunchActivity.H1;
        ow0Var.x(Q2, b2);
        ow0Var.show();
    }
}

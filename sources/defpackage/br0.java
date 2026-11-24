package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class br0 extends pg0 {
    public static volatile br0[] b = new br0[4];
    public final LongSparseLongArray a;

    public br0(int i) {
        super(i);
        this.a = new LongSparseLongArray();
    }

    public static br0 b(int i) {
        br0 br0Var;
        br0 br0Var2 = b[i];
        if (br0Var2 == null) {
            synchronized (wq0.class) {
                br0Var = b[i];
                if (br0Var == null) {
                    br0[] br0VarArr = b;
                    br0 br0Var3 = new br0(i);
                    br0VarArr[i] = br0Var3;
                    br0Var = br0Var3;
                }
            }
            return br0Var;
        }
        return br0Var2;
    }

    public final void a(long j, long j2, TLRPC.JoinChatBotResult joinChatBotResult) {
        this.a.get(j2, 0L);
        getNotificationCenter().k(nm7.U5, new ar0(j, joinChatBotResult));
        HashSet hashSet = wx0.b1;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                wx0 wx0Var = (wx0) it.next();
                rwc rwcVar = wx0Var.x0;
                if (rwcVar != null && rwcVar.g == 5) {
                    long j3 = rwcVar.b;
                    if (j3 == j || j3 == 0) {
                        TLObject tLObject = rwcVar.q;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j2) {
                            wx0Var.m(false);
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
        TLRPC.User W1 = getMessagesController().W1(Long.valueOf(j2));
        if (!z) {
            if (!ewe.b(this.currentAccount, j2) && !getMessagesController().S3.contains(Long.valueOf(j2))) {
                ik.n(Q, W1, new zq0(this, j, j2, j3), new jd((byte) 10));
                return;
            } else {
                c(j, j2, j3, true);
                return;
            }
        }
        this.a.put(j3, j2);
        d Q2 = LaunchActivity.Q();
        rwc b2 = rwc.b(this.currentAccount, j, j2, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        b2.d = j3;
        wx0 wx0Var = new wx0(LaunchActivity.H1, null);
        wx0Var.B(false);
        wx0Var.C0 = true;
        wx0Var.m0 = LaunchActivity.H1;
        wx0Var.x(Q2, b2);
        wx0Var.show();
    }
}

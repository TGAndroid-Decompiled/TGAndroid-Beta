package di;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.qj0;
public final class y9 {
    public static final y9[] f9976f = new y9[4];
    public final int f9977a;
    public final LongSparseLongArray f9978b = new LongSparseLongArray();
    public final ArrayList f9979c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final x9 f9980e;

    public y9(int i7) {
        new ArrayList();
        this.f9980e = new x9(this);
        this.f9977a = i7;
    }

    public final void a(qj0 qj0Var) {
        long j3;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f9979c;
        arrayList.clear();
        for (int i7 = 0; i7 < qj0Var.getChildCount(); i7++) {
            View childAt = qj0Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.t2) {
                j3 = ((org.telegram.ui.Cells.t2) childAt).getDialogId();
            } else if (childAt instanceof pa) {
                j3 = ((pa) childAt).getDialogId();
            } else {
                j3 = 0;
            }
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            int i11 = this.f9977a;
            LongSparseLongArray longSparseLongArray = this.f9978b;
            if (i10 > 0) {
                TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(j3));
                if (a22 != null && !a22.bot && !a22.self && !a22.contact && (userStatus = a22.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(j3, 0L) > 3600000) {
                    longSparseLongArray.put(j3, currentTimeMillis);
                    arrayList.add(Long.valueOf(j3));
                }
            } else {
                TLRPC.Chat M0 = qp.s1(i11).M0(Long.valueOf(-j3));
                if (org.telegram.messenger.t3.T(M0) && !org.telegram.messenger.t3.p0(M0) && currentTimeMillis - longSparseLongArray.get(j3, 0L) > 3600000) {
                    longSparseLongArray.put(j3, currentTimeMillis);
                    arrayList.add(Long.valueOf(j3));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            x9 x9Var = this.f9980e;
            org.telegram.messenger.g0.r(x9Var);
            org.telegram.messenger.g0.i3(x9Var, 300L);
        }
    }
}

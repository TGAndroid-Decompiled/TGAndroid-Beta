package fi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.uj0;
public final class q9 {
    public static final q9[] f12237f = new q9[4];
    public final int f12238a;
    public final LongSparseLongArray f12239b = new LongSparseLongArray();
    public final ArrayList f12240c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final p9 f12241e;

    public q9(int i7) {
        new ArrayList();
        this.f12241e = new p9(this);
        this.f12238a = i7;
    }

    public final void a(uj0 uj0Var) {
        long j3;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f12240c;
        arrayList.clear();
        for (int i7 = 0; i7 < uj0Var.getChildCount(); i7++) {
            View childAt = uj0Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.t2) {
                j3 = ((org.telegram.ui.Cells.t2) childAt).getDialogId();
            } else if (childAt instanceof pa) {
                j3 = ((pa) childAt).getDialogId();
            } else {
                j3 = 0;
            }
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            int i11 = this.f12238a;
            LongSparseLongArray longSparseLongArray = this.f12239b;
            if (i10 > 0) {
                TLRPC.User a22 = np.s1(i11).a2(Long.valueOf(j3));
                if (a22 != null && !a22.bot && !a22.self && !a22.contact && (userStatus = a22.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(j3, 0L) > 3600000) {
                    longSparseLongArray.put(j3, currentTimeMillis);
                    arrayList.add(Long.valueOf(j3));
                }
            } else {
                TLRPC.Chat M0 = np.s1(i11).M0(Long.valueOf(-j3));
                if (org.telegram.messenger.t3.T(M0) && !org.telegram.messenger.t3.p0(M0) && currentTimeMillis - longSparseLongArray.get(j3, 0L) > 3600000) {
                    longSparseLongArray.put(j3, currentTimeMillis);
                    arrayList.add(Long.valueOf(j3));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            p9 p9Var = this.f12241e;
            org.telegram.messenger.g0.r(p9Var);
            org.telegram.messenger.g0.i3(p9Var, 300L);
        }
    }
}

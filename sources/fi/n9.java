package fi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Components.ek0;
public final class n9 {
    public static final n9[] f12352f = new n9[4];
    public final int f12353a;
    public final LongSparseLongArray f12354b = new LongSparseLongArray();
    public final ArrayList f12355c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final m9 f12356e;

    public n9(int i7) {
        new ArrayList();
        this.f12356e = new m9(this);
        this.f12353a = i7;
    }

    public final void a(ek0 ek0Var) {
        long j3;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f12355c;
        arrayList.clear();
        for (int i7 = 0; i7 < ek0Var.getChildCount(); i7++) {
            View childAt = ek0Var.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.u2) {
                j3 = ((org.telegram.ui.Cells.u2) childAt).getDialogId();
            } else if (childAt instanceof ra) {
                j3 = ((ra) childAt).getDialogId();
            } else {
                j3 = 0;
            }
            int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
            int i11 = this.f12353a;
            LongSparseLongArray longSparseLongArray = this.f12354b;
            if (i10 > 0) {
                TLRPC.User c22 = mp.u1(i11).c2(Long.valueOf(j3));
                if (c22 != null && !c22.bot && !c22.self && !c22.contact && (userStatus = c22.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(j3, 0L) > 3600000) {
                    longSparseLongArray.put(j3, currentTimeMillis);
                    arrayList.add(Long.valueOf(j3));
                }
            } else {
                TLRPC.Chat O0 = mp.u1(i11).O0(Long.valueOf(-j3));
                if (org.telegram.messenger.v3.T(O0) && !org.telegram.messenger.v3.p0(O0) && currentTimeMillis - longSparseLongArray.get(j3, 0L) > 3600000) {
                    longSparseLongArray.put(j3, currentTimeMillis);
                    arrayList.add(Long.valueOf(j3));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            m9 m9Var = this.f12356e;
            org.telegram.messenger.g0.r(m9Var);
            org.telegram.messenger.g0.h3(m9Var, 300L);
        }
    }
}

package ei;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.tj0;
public final class z9 {
    public static final z9[] f11302f = new z9[4];
    public final int f11303a;
    public final LongSparseLongArray f11304b = new LongSparseLongArray();
    public final ArrayList f11305c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final y9 f11306e;

    public z9(int i3) {
        new ArrayList();
        this.f11306e = new y9(this);
        this.f11303a = i3;
    }

    public final void a(tj0 tj0Var) {
        long j10;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.f11305c;
        arrayList.clear();
        for (int i3 = 0; i3 < tj0Var.getChildCount(); i3++) {
            View childAt = tj0Var.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.t2) {
                j10 = ((org.telegram.ui.Cells.t2) childAt).getDialogId();
            } else if (childAt instanceof pa) {
                j10 = ((pa) childAt).getDialogId();
            } else {
                j10 = 0;
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            int i11 = this.f11303a;
            LongSparseLongArray longSparseLongArray = this.f11304b;
            if (i10 > 0) {
                TLRPC.User a22 = hp.s1(i11).a2(Long.valueOf(j10));
                if (a22 != null && !a22.bot && !a22.self && !a22.contact && (userStatus = a22.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(j10, 0L) > 3600000) {
                    longSparseLongArray.put(j10, currentTimeMillis);
                    arrayList.add(Long.valueOf(j10));
                }
            } else {
                TLRPC.Chat M0 = hp.s1(i11).M0(Long.valueOf(-j10));
                if (org.telegram.messenger.t3.T(M0) && !org.telegram.messenger.t3.p0(M0) && currentTimeMillis - longSparseLongArray.get(j10, 0L) > 3600000) {
                    longSparseLongArray.put(j10, currentTimeMillis);
                    arrayList.add(Long.valueOf(j10));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            y9 y9Var = this.f11306e;
            org.telegram.messenger.g0.r(y9Var);
            org.telegram.messenger.g0.i3(y9Var, 300L);
        }
    }
}

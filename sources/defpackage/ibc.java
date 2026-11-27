package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
public final class ibc {
    public static final ibc[] f = new ibc[4];
    public final int a;
    public final LongSparseLongArray b = new LongSparseLongArray();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final hbc e = new hbc(this);

    public ibc(int i) {
        this.a = i;
    }

    public final void a(d79 d79Var) {
        long j;
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i = 0; i < d79Var.getChildCount(); i++) {
            View childAt = d79Var.getChildAt(i);
            if (childAt instanceof of3) {
                j = ((of3) childAt).getDialogId();
            } else if (childAt instanceof vac) {
                j = ((vac) childAt).getDialogId();
            } else {
                j = 0;
            }
            int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            LongSparseLongArray longSparseLongArray = this.b;
            int i3 = this.a;
            if (i2 > 0) {
                TLRPC.User X1 = uc7.s1(i3).X1(Long.valueOf(j));
                if (X1 != null && !X1.bot && !X1.self && !X1.contact && (userStatus = X1.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(j, 0L) > 3600000) {
                    longSparseLongArray.put(j, currentTimeMillis);
                    arrayList.add(Long.valueOf(j));
                }
            } else {
                TLRPC.Chat M0 = uc7.s1(i3).M0(Long.valueOf(-j));
                if (xc2.T(M0) && !xc2.p0(M0) && currentTimeMillis - longSparseLongArray.get(j, 0L) > 3600000) {
                    longSparseLongArray.put(j, currentTimeMillis);
                    arrayList.add(Long.valueOf(j));
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.d.addAll(arrayList);
            hbc hbcVar = this.e;
            hl.r(hbcVar);
            hl.d3(hbcVar, 300L);
        }
    }
}

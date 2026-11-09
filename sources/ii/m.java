package ii;

import android.content.Context;
import android.widget.TextView;
import bi.r3;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.qp;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.v4;
import org.telegram.ui.cn;
public final class m implements Runnable {
    public final int f15577a;
    public final boolean f15578b;
    public final boolean f15579c;
    public final long d;
    public final ls f15580e;

    public m(ls lsVar, boolean z9, boolean z10, long j3, int i7) {
        this.f15577a = i7;
        this.f15580e = lsVar;
        this.f15578b = z9;
        this.f15579c = z10;
        this.d = j3;
    }

    @Override
    public final void run() {
        ArrayList arrayList;
        int i7 = this.f15577a;
        int i10 = 2131751914;
        boolean z9 = this.f15579c;
        boolean z10 = this.f15578b;
        long j3 = this.d;
        ls lsVar = this.f15580e;
        switch (i7) {
            case 0:
                p pVar = (p) lsVar;
                String M0 = id.M0(2131751915, null);
                if (z10) {
                    i10 = 2131751917;
                } else if (z9) {
                    i10 = 2131751916;
                }
                v4.s0(pVar, M0, id.M0(i10, null), id.M0(2131746321, null), true, new h(pVar, j3, 0));
                return;
            case 1:
                d0 d0Var = (d0) lsVar;
                Context context = d0Var.getContext();
                g6 g6Var = d0Var.I0;
                String M02 = id.M0(2131751915, null);
                if (z10) {
                    i10 = 2131751917;
                } else if (z9) {
                    i10 = 2131751916;
                }
                u1 M = v4.M(context, g6Var, M02, id.M0(i10, null), id.M0(2131746321, null), new r3(d0Var, j3, 10));
                M.show();
                TextView textView = (TextView) M.d(-1);
                if (textView != null) {
                    s6.U(textView, l6.f28106q7, null);
                    return;
                }
                return;
            case 2:
                qp qpVar = (qp) lsVar;
                if (z10) {
                    arrayList = qpVar.f24915v0;
                } else {
                    arrayList = qpVar.f24906u0;
                }
                if (z9) {
                    if (!arrayList.contains(Long.valueOf(j3))) {
                        arrayList.add(Long.valueOf(j3));
                        return;
                    }
                    return;
                }
                arrayList.remove(Long.valueOf(j3));
                return;
            default:
                cn.y1((cn) lsVar, j3, z10, z9);
                return;
        }
    }

    public m(cn cnVar, long j3, boolean z9, boolean z10) {
        this.f15577a = 3;
        this.f15580e = cnVar;
        this.d = j3;
        this.f15578b = z9;
        this.f15579c = z10;
    }
}

package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class vg4 extends q59 {
    public final ch4 c;

    public vg4(ch4 ch4Var) {
        this.c = ch4Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override
    public final int b() {
        ch4 ch4Var = this.c;
        ArrayList arrayList = ch4Var.f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + (!ch4Var.O ? 1 : 0);
    }

    @Override
    public final int d(int i) {
        if (i >= this.c.f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        boolean z2;
        if (u69Var.f == 0) {
            hg3 hg3Var = (hg3) u69Var.a;
            ch4 ch4Var = this.c;
            k47 k47Var = (k47) ch4Var.f.get(i);
            hg3Var.P = ch4Var.q0;
            hg3Var.e0(k47.B0(k47Var.k), k47Var, k47Var.k.date, false, false);
            if (i != b() - 1) {
                z = true;
            } else {
                z = false;
            }
            hg3Var.t2 = z;
            if (hg3Var.getMessage() != null && hg3Var.getMessage().e1() == k47Var.e1()) {
                z2 = true;
            } else {
                z2 = false;
            }
            hg3Var.getViewTreeObserver().addOnPreDrawListener(new n42(this, hg3Var, k47Var, z2, (byte) 1));
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        gm3 gm3Var;
        ?? r2;
        if (i != 0) {
            if (i != 3) {
                r2 = new l55(viewGroup.getContext(), null);
                r2.setText(jb6.M0(2131745490, null));
                return kt6.h(r2, r2, -1, -2);
            }
            ?? tk4Var = new tk4(viewGroup.getContext(), null);
            tk4Var.setIsSingleCell(true);
            tk4Var.setViewType(1);
            gm3Var = tk4Var;
        } else {
            gm3Var = new gm3((byte) 1, viewGroup.getContext(), true);
        }
        r2 = gm3Var;
        return kt6.h(r2, r2, -1, -2);
    }
}

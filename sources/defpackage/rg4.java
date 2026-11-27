package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class rg4 extends c79 {
    public final yg4 c;

    public rg4(yg4 yg4Var) {
        this.c = yg4Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override
    public final int b() {
        yg4 yg4Var = this.c;
        ArrayList arrayList = yg4Var.f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + (!yg4Var.O ? 1 : 0);
    }

    @Override
    public final int d(int i) {
        if (i >= this.c.f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        boolean z2;
        if (f89Var.f == 0) {
            of3 of3Var = (of3) f89Var.a;
            yg4 yg4Var = this.c;
            r47 r47Var = (r47) yg4Var.f.get(i);
            of3Var.P = yg4Var.q0;
            of3Var.e0(r47.B0(r47Var.k), r47Var, r47Var.k.date, false, false);
            if (i != b() - 1) {
                z = true;
            } else {
                z = false;
            }
            of3Var.t2 = z;
            if (of3Var.getMessage() != null && of3Var.getMessage().e1() == r47Var.e1()) {
                z2 = true;
            } else {
                z2 = false;
            }
            of3Var.getViewTreeObserver().addOnPreDrawListener(new s32(this, of3Var, r47Var, z2, (byte) 1));
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        nl3 nl3Var;
        ?? r2;
        if (i != 0) {
            if (i != 3) {
                r2 = new p55(viewGroup.getContext(), null);
                r2.setText(ob6.M0(2131745484, null));
                return qu6.h(r2, r2, -1, -2);
            }
            ?? tk4Var = new tk4(viewGroup.getContext(), null);
            tk4Var.setIsSingleCell(true);
            tk4Var.setViewType(1);
            nl3Var = tk4Var;
        } else {
            nl3Var = new nl3((byte) 1, viewGroup.getContext(), true);
        }
        r2 = nl3Var;
        return qu6.h(r2, r2, -1, -2);
    }
}

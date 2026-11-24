package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
public final class te4 extends n39 {
    public final af4 c;

    public te4(af4 af4Var) {
        this.c = af4Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override
    public final int b() {
        af4 af4Var = this.c;
        ArrayList arrayList = af4Var.f;
        if (arrayList.isEmpty()) {
            return 0;
        }
        return arrayList.size() + (!af4Var.O ? 1 : 0);
    }

    @Override
    public final int d(int i) {
        if (i >= this.c.f.size()) {
            return 3;
        }
        return 0;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        boolean z2;
        if (s49Var.f == 0) {
            ue3 ue3Var = (ue3) s49Var.a;
            af4 af4Var = this.c;
            k27 k27Var = (k27) af4Var.f.get(i);
            ue3Var.P = af4Var.q0;
            ue3Var.f0(k27.B0(k27Var.k), k27Var, k27Var.k.date, false, false);
            if (i != b() - 1) {
                z = true;
            } else {
                z = false;
            }
            ue3Var.t2 = z;
            if (ue3Var.getMessage() != null && ue3Var.getMessage().e1() == k27Var.e1()) {
                z2 = true;
            } else {
                z2 = false;
            }
            ue3Var.getViewTreeObserver().addOnPreDrawListener(new b32(this, ue3Var, k27Var, z2, (byte) 1));
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        vk3 vk3Var;
        ?? r2;
        if (i != 0) {
            if (i != 3) {
                r2 = new l35(viewGroup.getContext(), null);
                r2.setText(k96.M0(2131745564, null));
                return ls6.h(r2, r2, -1, -2);
            }
            ?? pi4Var = new pi4(viewGroup.getContext(), null);
            pi4Var.setIsSingleCell(true);
            pi4Var.setViewType(1);
            vk3Var = pi4Var;
        } else {
            vk3Var = new vk3((byte) 1, viewGroup.getContext(), true);
        }
        r2 = vk3Var;
        return ls6.h(r2, r2, -1, -2);
    }
}

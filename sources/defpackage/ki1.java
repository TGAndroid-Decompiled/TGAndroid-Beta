package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ki1 extends q59 {
    public final Activity c;
    public final ylb d;
    public final int e;
    public final mi1 f;

    public ki1(mi1 mi1Var, Activity activity, ylb ylbVar, int i) {
        this.f = mi1Var;
        this.c = activity;
        this.d = ylbVar;
        this.e = i;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override
    public final int b() {
        fc7 fc7Var = oc7.r1(this.e).E3;
        if (fc7Var == null) {
            return 0;
        }
        return fc7Var.c.size();
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        li1 li1Var = (li1) u69Var.a;
        anb.h(cmb.c6, this.d, li1Var);
        if (i == this.f.e) {
            z = true;
        } else {
            z = false;
        }
        li1Var.s = z;
        li1Var.w.f(z, true);
        li1Var.invalidate();
        fc7 fc7Var = oc7.r1(this.e).E3;
        if (fc7Var != null) {
            ArrayList arrayList = fc7Var.c;
            if (i >= 0 && i < arrayList.size()) {
                li1Var.a((ec7) arrayList.get(i));
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        return new u69(new li1(this.f, this.c));
    }
}

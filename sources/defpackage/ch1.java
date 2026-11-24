package defpackage;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class ch1 extends n39 {
    public final Activity c;
    public final wjb d;
    public final int e;
    public final eh1 f;

    public ch1(eh1 eh1Var, Activity activity, wjb wjbVar, int i) {
        this.f = eh1Var;
        this.c = activity;
        this.d = wjbVar;
        this.e = i;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override
    public final int b() {
        ea7 ea7Var = na7.q1(this.e).E3;
        if (ea7Var == null) {
            return 0;
        }
        return ea7Var.c.size();
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        dh1 dh1Var = (dh1) s49Var.a;
        zkb.h(bkb.c6, this.d, dh1Var);
        if (i == this.f.e) {
            z = true;
        } else {
            z = false;
        }
        dh1Var.s = z;
        dh1Var.w.f(z, true);
        dh1Var.invalidate();
        ea7 ea7Var = na7.q1(this.e).E3;
        if (ea7Var != null) {
            ArrayList arrayList = ea7Var.c;
            if (i >= 0 && i < arrayList.size()) {
                dh1Var.a((da7) arrayList.get(i));
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        return new s49(new dh1(this.f, this.c));
    }
}

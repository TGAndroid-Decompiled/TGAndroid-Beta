package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class r37 extends q59 {
    public final Context c;
    public final sm0 d;
    public final n10 e;
    public final boolean f;
    public final pv7 h;

    public r37(pv7 pv7Var, Context context, sm0 sm0Var, n10 n10Var, boolean z) {
        this.h = pv7Var;
        this.c = context;
        this.d = sm0Var;
        this.e = n10Var;
        this.f = z;
    }

    @Override
    public final boolean D(u69 u69Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.h.u0.size();
    }

    @Override
    public final int d(int i) {
        ArrayList arrayList = this.h.u0;
        return ((k47) arrayList.get((arrayList.size() - 1) - i)).U;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        boolean z2;
        c47 d;
        boolean z3;
        pv7 pv7Var = this.h;
        ArrayList arrayList = pv7Var.u0;
        k47 k47Var = (k47) arrayList.get((arrayList.size() - 1) - i);
        View view = u69Var.a;
        if (view instanceof rc2) {
            rc2 rc2Var = (rc2) view;
            f47 f47Var = pv7Var.v0;
            if (f47Var != null && (d = f47Var.d(k47Var)) != null) {
                if (d.c != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = z3;
            } else {
                z = false;
            }
            f47 f47Var2 = pv7Var.v0;
            if (f47Var2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            rc2Var.z3(k47Var, f47Var2, z2, z, false, false);
        } else if (view instanceof cm1) {
            ((cm1) view).setMessageObject(k47Var);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        t37 t37Var = this.h.F0;
        Context context = this.c;
        if (i == 1) {
            return new u69(new p37(this, context, t37Var));
        }
        q37 q37Var = new q37(this, context, z8c.t0, t37Var);
        q37Var.f6 = true;
        return new u69(q37Var);
    }
}

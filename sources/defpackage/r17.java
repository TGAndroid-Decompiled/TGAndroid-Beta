package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class r17 extends n39 {
    public final Context c;
    public final sl0 d;
    public final n00 e;
    public final boolean f;
    public final ot7 h;

    public r17(ot7 ot7Var, Context context, sl0 sl0Var, n00 n00Var, boolean z) {
        this.h = ot7Var;
        this.c = context;
        this.d = sl0Var;
        this.e = n00Var;
        this.f = z;
    }

    @Override
    public final boolean D(s49 s49Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.h.u0.size();
    }

    @Override
    public final int d(int i) {
        ArrayList arrayList = this.h.u0;
        return ((k27) arrayList.get((arrayList.size() - 1) - i)).U;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        boolean z2;
        c27 d;
        boolean z3;
        ot7 ot7Var = this.h;
        ArrayList arrayList = ot7Var.u0;
        k27 k27Var = (k27) arrayList.get((arrayList.size() - 1) - i);
        View view = s49Var.a;
        if (view instanceof gb2) {
            gb2 gb2Var = (gb2) view;
            f27 f27Var = ot7Var.v0;
            if (f27Var != null && (d = f27Var.d(k27Var)) != null) {
                if (d.c != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = z3;
            } else {
                z = false;
            }
            f27 f27Var2 = ot7Var.v0;
            if (f27Var2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            gb2Var.z3(k27Var, f27Var2, z2, z, false, false);
        } else if (view instanceof uk1) {
            ((uk1) view).setMessageObject(k27Var);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        t17 t17Var = this.h.F0;
        Context context = this.c;
        if (i == 1) {
            return new s49(new p17(this, context, t17Var));
        }
        q17 q17Var = new q17(this, context, y6c.t0, t17Var);
        q17Var.f6 = true;
        return new s49(q17Var);
    }
}

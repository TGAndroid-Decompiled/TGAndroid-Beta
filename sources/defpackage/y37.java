package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
public final class y37 extends c79 {
    public final Context c;
    public final tl0 d;
    public final o00 e;
    public final boolean f;
    public final vw7 h;

    public y37(vw7 vw7Var, Context context, tl0 tl0Var, o00 o00Var, boolean z) {
        this.h = vw7Var;
        this.c = context;
        this.d = tl0Var;
        this.e = o00Var;
        this.f = z;
    }

    @Override
    public final boolean D(f89 f89Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.h.u0.size();
    }

    @Override
    public final int d(int i) {
        ArrayList arrayList = this.h.u0;
        return ((r47) arrayList.get((arrayList.size() - 1) - i)).U;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        boolean z2;
        j47 d;
        boolean z3;
        vw7 vw7Var = this.h;
        ArrayList arrayList = vw7Var.u0;
        r47 r47Var = (r47) arrayList.get((arrayList.size() - 1) - i);
        View view = f89Var.a;
        if (view instanceof wb2) {
            wb2 wb2Var = (wb2) view;
            m47 m47Var = vw7Var.v0;
            if (m47Var != null && (d = m47Var.d(r47Var)) != null) {
                if (d.c != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                z = z3;
            } else {
                z = false;
            }
            m47 m47Var2 = vw7Var.v0;
            if (m47Var2 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            wb2Var.z3(r47Var, m47Var2, z2, z, false, false);
        } else if (view instanceof dl1) {
            ((dl1) view).setMessageObject(r47Var);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        a47 a47Var = this.h.F0;
        Context context = this.c;
        if (i == 1) {
            return new f89(new w37(this, context, a47Var));
        }
        x37 x37Var = new x37(this, context, yac.t0, a47Var);
        x37Var.f6 = true;
        return new f89(x37Var);
    }
}

package bi;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.o00;
public final class hc extends f41 {
    public final int P;
    public final Object Q;

    public hc(KeyEvent.Callback callback, pj0 pj0Var, Context context, int i7, v10 v10Var, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(pj0Var, context, i7, 0, false, v10Var, f6Var);
        this.P = i10;
        this.Q = callback;
    }

    @Override
    public void t(v4.d1 d1Var, int i7) {
        di.n0 n0Var;
        di.s0 s0Var;
        switch (this.P) {
            case 1:
                super.t(d1Var, i7);
                di.g2 g2Var = (di.g2) this.Q;
                if (g2Var.D) {
                    View view = d1Var.f56927a;
                    if ((view instanceof di.n0) && (s0Var = (n0Var = (di.n0) view).K) != null && s0Var.f9736a == g2Var.f9826y) {
                        n0Var.a();
                        g2Var.D = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.t(d1Var, i7);
                return;
        }
    }

    @Override
    public v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.f6 f6Var2;
        org.telegram.ui.ActionBar.f6 f6Var3;
        switch (this.P) {
            case 0:
                dd ddVar = (dd) this.Q;
                if (i7 == 42) {
                    Activity parentActivity = ddVar.getParentActivity();
                    int i10 = org.telegram.ui.ActionBar.k6.L6;
                    f6Var = ((org.telegram.ui.ActionBar.f2) ddVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(parentActivity, i10, 21, 0, false, f6Var);
                    n4Var.setHeight(25);
                    return new v4.d1(n4Var);
                }
                return super.x(viewGroup, i7);
            case 1:
            default:
                return super.x(viewGroup, i7);
            case 2:
                gi.f fVar = (gi.f) this.Q;
                if (i7 == 42) {
                    Activity parentActivity2 = fVar.getParentActivity();
                    int i11 = org.telegram.ui.ActionBar.k6.L6;
                    f6Var2 = ((org.telegram.ui.ActionBar.f2) fVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(parentActivity2, i11, 21, 0, false, f6Var2);
                    n4Var2.setHeight(25);
                    return new v4.d1(n4Var2);
                }
                return super.x(viewGroup, i7);
            case 3:
                hi.j jVar = (hi.j) this.Q;
                if (i7 == 42) {
                    Activity parentActivity3 = jVar.getParentActivity();
                    int i12 = org.telegram.ui.ActionBar.k6.L6;
                    f6Var3 = ((org.telegram.ui.ActionBar.f2) jVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(parentActivity3, i12, 21, 0, false, f6Var3);
                    n4Var3.setHeight(25);
                    return new v4.d1(n4Var3);
                }
                return super.x(viewGroup, i7);
            case 4:
                hi.q3 q3Var = (hi.q3) this.Q;
                if (i7 == 42) {
                    org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(q3Var.getParentActivity(), org.telegram.ui.ActionBar.k6.L6, 21, 0, false, hi.q3.H0(q3Var));
                    n4Var4.setHeight(25);
                    return new v4.d1(n4Var4);
                }
                return super.x(viewGroup, i7);
            case 5:
                zh.l3 l3Var = (zh.l3) this.Q;
                if (i7 == 0) {
                    return new v4.d1(new org.telegram.ui.Cells.n4(l3Var.getContext(), org.telegram.ui.ActionBar.k6.L6, 13, 12, 4, false, false, l3Var.I0));
                }
                if (i7 == 42) {
                    return new v4.d1(new org.telegram.ui.Cells.n4(l3Var.getContext(), org.telegram.ui.ActionBar.k6.L6, 13, 12, 4, false, true, l3Var.I0));
                }
                return super.x(viewGroup, i7);
        }
    }

    @Override
    public void y(v4.d1 d1Var) {
        di.n0 n0Var;
        di.s0 s0Var;
        switch (this.P) {
            case 1:
                super.y(d1Var);
                di.g2 g2Var = (di.g2) this.Q;
                if (g2Var.D) {
                    View view = d1Var.f56927a;
                    if ((view instanceof di.n0) && (s0Var = (n0Var = (di.n0) view).K) != null && s0Var.f9736a == g2Var.f9826y) {
                        n0Var.a();
                        g2Var.D = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.y(d1Var);
                return;
        }
    }

    public hc(o00 o00Var, pj0 pj0Var, Activity activity, int i7, int i10, v10 v10Var, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(pj0Var, activity, i7, i10, true, v10Var, f6Var);
        this.P = i11;
        this.Q = o00Var;
    }
}

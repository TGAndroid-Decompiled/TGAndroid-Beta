package bi;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import di.lb;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.p00;
public final class x5 extends p41 {
    public final int Q;
    public final Object R;

    public x5(KeyEvent.Callback callback, uj0 uj0Var, Context context, int i7, s10 s10Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(uj0Var, context, i7, 0, false, s10Var, e6Var);
        this.Q = i10;
        this.R = callback;
    }

    @Override
    public void t(v4.e1 e1Var, int i7) {
        fi.n0 n0Var;
        fi.s0 s0Var;
        switch (this.Q) {
            case 2:
                super.t(e1Var, i7);
                fi.c2 c2Var = (fi.c2) this.R;
                if (c2Var.E) {
                    View view = e1Var.f58535a;
                    if ((view instanceof fi.n0) && (s0Var = (n0Var = (fi.n0) view).L) != null && s0Var.f12297a == c2Var.f12393y) {
                        n0Var.a();
                        c2Var.E = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.t(e1Var, i7);
                return;
        }
    }

    @Override
    public v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        org.telegram.ui.ActionBar.e6 e6Var3;
        switch (this.Q) {
            case 0:
                z5 z5Var = (z5) this.R;
                if (i7 == 0) {
                    return new v4.e1(new org.telegram.ui.Cells.n4(z5Var.getContext(), org.telegram.ui.ActionBar.j6.L6, 13, 12, 4, false, false, z5Var.J0));
                }
                if (i7 == 42) {
                    return new v4.e1(new org.telegram.ui.Cells.n4(z5Var.getContext(), org.telegram.ui.ActionBar.j6.L6, 13, 12, 4, false, true, z5Var.J0));
                }
                return super.x(viewGroup, i7);
            case 1:
                lb lbVar = (lb) this.R;
                if (i7 == 42) {
                    Activity parentActivity = lbVar.getParentActivity();
                    int i10 = org.telegram.ui.ActionBar.j6.L6;
                    e6Var = ((org.telegram.ui.ActionBar.e2) lbVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(parentActivity, i10, 21, 0, false, e6Var);
                    n4Var.setHeight(25);
                    return new v4.e1(n4Var);
                }
                return super.x(viewGroup, i7);
            case 2:
            default:
                return super.x(viewGroup, i7);
            case 3:
                ii.f fVar = (ii.f) this.R;
                if (i7 == 42) {
                    Activity parentActivity2 = fVar.getParentActivity();
                    int i11 = org.telegram.ui.ActionBar.j6.L6;
                    e6Var2 = ((org.telegram.ui.ActionBar.e2) fVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(parentActivity2, i11, 21, 0, false, e6Var2);
                    n4Var2.setHeight(25);
                    return new v4.e1(n4Var2);
                }
                return super.x(viewGroup, i7);
            case 4:
                ki.k kVar = (ki.k) this.R;
                if (i7 == 42) {
                    Activity parentActivity3 = kVar.getParentActivity();
                    int i12 = org.telegram.ui.ActionBar.j6.L6;
                    e6Var3 = ((org.telegram.ui.ActionBar.e2) kVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(parentActivity3, i12, 21, 0, false, e6Var3);
                    n4Var3.setHeight(25);
                    return new v4.e1(n4Var3);
                }
                return super.x(viewGroup, i7);
            case 5:
                ki.n3 n3Var = (ki.n3) this.R;
                if (i7 == 42) {
                    org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(n3Var.getParentActivity(), org.telegram.ui.ActionBar.j6.L6, 21, 0, false, ki.n3.H0(n3Var));
                    n4Var4.setHeight(25);
                    return new v4.e1(n4Var4);
                }
                return super.x(viewGroup, i7);
        }
    }

    @Override
    public void y(v4.e1 e1Var) {
        fi.n0 n0Var;
        fi.s0 s0Var;
        switch (this.Q) {
            case 2:
                super.y(e1Var);
                fi.c2 c2Var = (fi.c2) this.R;
                if (c2Var.E) {
                    View view = e1Var.f58535a;
                    if ((view instanceof fi.n0) && (s0Var = (n0Var = (fi.n0) view).L) != null && s0Var.f12297a == c2Var.f12393y) {
                        n0Var.a();
                        c2Var.E = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.y(e1Var);
                return;
        }
    }

    public x5(p00 p00Var, uj0 uj0Var, Activity activity, int i7, int i10, s10 s10Var, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(uj0Var, activity, i7, i10, true, s10Var, e6Var);
        this.Q = i11;
        this.R = p00Var;
    }
}

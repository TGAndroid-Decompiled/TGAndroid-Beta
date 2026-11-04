package ai;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import ci.wb;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.l00;
public final class f6 extends f41 {
    public final int Q;
    public final Object R;

    public f6(KeyEvent.Callback callback, tj0 tj0Var, Context context, int i3, n10 n10Var, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(tj0Var, context, i3, 0, false, n10Var, e6Var);
        this.Q = i10;
        this.R = callback;
    }

    @Override
    public void t(u4.d1 d1Var, int i3) {
        ei.p0 p0Var;
        ei.u0 u0Var;
        switch (this.Q) {
            case 2:
                super.t(d1Var, i3);
                ei.k2 k2Var = (ei.k2) this.R;
                if (k2Var.E) {
                    View view = d1Var.f55540a;
                    if ((view instanceof ei.p0) && (u0Var = (p0Var = (ei.p0) view).L) != null && u0Var.f11069a == k2Var.f11164y) {
                        p0Var.a();
                        k2Var.E = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.t(d1Var, i3);
                return;
        }
    }

    @Override
    public u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.e6 e6Var2;
        switch (this.Q) {
            case 0:
                h6 h6Var = (h6) this.R;
                if (i3 == 0) {
                    return new u4.d1(new org.telegram.ui.Cells.n4(h6Var.getContext(), org.telegram.ui.ActionBar.k6.L6, 13, 12, 4, false, false, h6Var.J0));
                }
                if (i3 == 42) {
                    return new u4.d1(new org.telegram.ui.Cells.n4(h6Var.getContext(), org.telegram.ui.ActionBar.k6.L6, 13, 12, 4, false, true, h6Var.J0));
                }
                return super.x(viewGroup, i3);
            case 1:
                wb wbVar = (wb) this.R;
                if (i3 == 42) {
                    Activity parentActivity = wbVar.getParentActivity();
                    int i10 = org.telegram.ui.ActionBar.k6.L6;
                    e6Var = ((org.telegram.ui.ActionBar.d2) wbVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(parentActivity, i10, 21, 0, false, e6Var);
                    n4Var.setHeight(25);
                    return new u4.d1(n4Var);
                }
                return super.x(viewGroup, i3);
            case 2:
            default:
                return super.x(viewGroup, i3);
            case 3:
                hi.g gVar = (hi.g) this.R;
                if (i3 == 42) {
                    org.telegram.ui.Cells.n4 n4Var2 = new org.telegram.ui.Cells.n4(gVar.getParentActivity(), org.telegram.ui.ActionBar.k6.L6, 21, 0, false, hi.g.B0(gVar));
                    n4Var2.setHeight(25);
                    return new u4.d1(n4Var2);
                }
                return super.x(viewGroup, i3);
            case 4:
                ii.k kVar = (ii.k) this.R;
                if (i3 == 42) {
                    Activity parentActivity2 = kVar.getParentActivity();
                    int i11 = org.telegram.ui.ActionBar.k6.L6;
                    e6Var2 = ((org.telegram.ui.ActionBar.d2) kVar).resourceProvider;
                    org.telegram.ui.Cells.n4 n4Var3 = new org.telegram.ui.Cells.n4(parentActivity2, i11, 21, 0, false, e6Var2);
                    n4Var3.setHeight(25);
                    return new u4.d1(n4Var3);
                }
                return super.x(viewGroup, i3);
            case 5:
                ii.q3 q3Var = (ii.q3) this.R;
                if (i3 == 42) {
                    org.telegram.ui.Cells.n4 n4Var4 = new org.telegram.ui.Cells.n4(q3Var.getParentActivity(), org.telegram.ui.ActionBar.k6.L6, 21, 0, false, ii.q3.H0(q3Var));
                    n4Var4.setHeight(25);
                    return new u4.d1(n4Var4);
                }
                return super.x(viewGroup, i3);
        }
    }

    @Override
    public void y(u4.d1 d1Var) {
        ei.p0 p0Var;
        ei.u0 u0Var;
        switch (this.Q) {
            case 2:
                super.y(d1Var);
                ei.k2 k2Var = (ei.k2) this.R;
                if (k2Var.E) {
                    View view = d1Var.f55540a;
                    if ((view instanceof ei.p0) && (u0Var = (p0Var = (ei.p0) view).L) != null && u0Var.f11069a == k2Var.f11164y) {
                        p0Var.a();
                        k2Var.E = false;
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

    public f6(l00 l00Var, tj0 tj0Var, Activity activity, int i3, int i10, n10 n10Var, org.telegram.ui.ActionBar.e6 e6Var, int i11) {
        super(tj0Var, activity, i3, i10, true, n10Var, e6Var);
        this.Q = i11;
        this.R = l00Var;
    }
}

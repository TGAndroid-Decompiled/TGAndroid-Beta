package bi;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import di.pb;
import org.telegram.messenger.r10;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.s00;
public final class j8 extends c51 {
    public final int Q;
    public final Object R;

    public j8(KeyEvent.Callback callback, ek0 ek0Var, Context context, int i7, r10 r10Var, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        super(ek0Var, context, i7, 0, false, r10Var, h6Var);
        this.Q = i10;
        this.R = callback;
    }

    @Override
    public void t(v4.e1 e1Var, int i7) {
        fi.m0 m0Var;
        fi.r0 r0Var;
        switch (this.Q) {
            case 2:
                super.t(e1Var, i7);
                fi.a2 a2Var = (fi.a2) this.R;
                if (a2Var.E) {
                    View view = e1Var.f59111a;
                    if ((view instanceof fi.m0) && (r0Var = (m0Var = (fi.m0) view).L) != null && r0Var.f12478a == a2Var.f12567y) {
                        m0Var.a();
                        a2Var.E = false;
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
        org.telegram.ui.ActionBar.h6 h6Var;
        org.telegram.ui.ActionBar.h6 h6Var2;
        org.telegram.ui.ActionBar.h6 h6Var3;
        switch (this.Q) {
            case 0:
                l8 l8Var = (l8) this.R;
                if (i7 == 0) {
                    return new v4.e1(new org.telegram.ui.Cells.o4(l8Var.getContext(), org.telegram.ui.ActionBar.m6.L6, 13, 12, 4, false, false, l8Var.J0));
                }
                if (i7 == 42) {
                    return new v4.e1(new org.telegram.ui.Cells.o4(l8Var.getContext(), org.telegram.ui.ActionBar.m6.L6, 13, 12, 4, false, true, l8Var.J0));
                }
                return super.x(viewGroup, i7);
            case 1:
                pb pbVar = (pb) this.R;
                if (i7 == 42) {
                    Activity parentActivity = pbVar.getParentActivity();
                    int i10 = org.telegram.ui.ActionBar.m6.L6;
                    h6Var = ((org.telegram.ui.ActionBar.g2) pbVar).resourceProvider;
                    org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(parentActivity, i10, 21, 0, false, h6Var);
                    o4Var.setHeight(25);
                    return new v4.e1(o4Var);
                }
                return super.x(viewGroup, i7);
            case 2:
            default:
                return super.x(viewGroup, i7);
            case 3:
                ii.t tVar = (ii.t) this.R;
                if (i7 == 42) {
                    Activity parentActivity2 = tVar.getParentActivity();
                    int i11 = org.telegram.ui.ActionBar.m6.L6;
                    h6Var2 = ((org.telegram.ui.ActionBar.g2) tVar).resourceProvider;
                    org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(parentActivity2, i11, 21, 0, false, h6Var2);
                    o4Var2.setHeight(25);
                    return new v4.e1(o4Var2);
                }
                return super.x(viewGroup, i7);
            case 4:
                ki.j jVar = (ki.j) this.R;
                if (i7 == 42) {
                    Activity parentActivity3 = jVar.getParentActivity();
                    int i12 = org.telegram.ui.ActionBar.m6.L6;
                    h6Var3 = ((org.telegram.ui.ActionBar.g2) jVar).resourceProvider;
                    org.telegram.ui.Cells.o4 o4Var3 = new org.telegram.ui.Cells.o4(parentActivity3, i12, 21, 0, false, h6Var3);
                    o4Var3.setHeight(25);
                    return new v4.e1(o4Var3);
                }
                return super.x(viewGroup, i7);
            case 5:
                ki.h3 h3Var = (ki.h3) this.R;
                if (i7 == 42) {
                    org.telegram.ui.Cells.o4 o4Var4 = new org.telegram.ui.Cells.o4(h3Var.getParentActivity(), org.telegram.ui.ActionBar.m6.L6, 21, 0, false, ki.h3.H0(h3Var));
                    o4Var4.setHeight(25);
                    return new v4.e1(o4Var4);
                }
                return super.x(viewGroup, i7);
        }
    }

    @Override
    public void y(v4.e1 e1Var) {
        fi.m0 m0Var;
        fi.r0 r0Var;
        switch (this.Q) {
            case 2:
                super.y(e1Var);
                fi.a2 a2Var = (fi.a2) this.R;
                if (a2Var.E) {
                    View view = e1Var.f59111a;
                    if ((view instanceof fi.m0) && (r0Var = (m0Var = (fi.m0) view).L) != null && r0Var.f12478a == a2Var.f12567y) {
                        m0Var.a();
                        a2Var.E = false;
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

    public j8(s00 s00Var, ek0 ek0Var, Activity activity, int i7, int i10, r10 r10Var, org.telegram.ui.ActionBar.h6 h6Var, int i11) {
        super(ek0Var, activity, i7, i10, true, r10Var, h6Var);
        this.Q = i11;
        this.R = s00Var;
    }
}

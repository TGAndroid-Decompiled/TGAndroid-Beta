package bi;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import di.pb;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.s00;
public final class d8 extends z41 {
    public final int Q;
    public final Object R;

    public d8(KeyEvent.Callback callback, ck0 ck0Var, Context context, int i7, q10 q10Var, org.telegram.ui.ActionBar.i6 i6Var, int i10) {
        super(ck0Var, context, i7, 0, false, q10Var, i6Var);
        this.Q = i10;
        this.R = callback;
    }

    @Override
    public void t(v4.f1 f1Var, int i7) {
        fi.m0 m0Var;
        fi.r0 r0Var;
        switch (this.Q) {
            case 2:
                super.t(f1Var, i7);
                fi.a2 a2Var = (fi.a2) this.R;
                if (a2Var.E) {
                    View view = f1Var.f59123a;
                    if ((view instanceof fi.m0) && (r0Var = (m0Var = (fi.m0) view).L) != null && r0Var.f12483a == a2Var.f12572y) {
                        m0Var.a();
                        a2Var.E = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.t(f1Var, i7);
                return;
        }
    }

    @Override
    public v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.i6 i6Var2;
        org.telegram.ui.ActionBar.i6 i6Var3;
        switch (this.Q) {
            case 0:
                f8 f8Var = (f8) this.R;
                if (i7 == 0) {
                    return new v4.f1(new org.telegram.ui.Cells.o4(f8Var.getContext(), org.telegram.ui.ActionBar.n6.L6, 13, 12, 4, false, false, f8Var.J0));
                }
                if (i7 == 42) {
                    return new v4.f1(new org.telegram.ui.Cells.o4(f8Var.getContext(), org.telegram.ui.ActionBar.n6.L6, 13, 12, 4, false, true, f8Var.J0));
                }
                return super.x(viewGroup, i7);
            case 1:
                pb pbVar = (pb) this.R;
                if (i7 == 42) {
                    Activity parentActivity = pbVar.getParentActivity();
                    int i10 = org.telegram.ui.ActionBar.n6.L6;
                    i6Var = ((org.telegram.ui.ActionBar.h2) pbVar).resourceProvider;
                    org.telegram.ui.Cells.o4 o4Var = new org.telegram.ui.Cells.o4(parentActivity, i10, 21, 0, false, i6Var);
                    o4Var.setHeight(25);
                    return new v4.f1(o4Var);
                }
                return super.x(viewGroup, i7);
            case 2:
            default:
                return super.x(viewGroup, i7);
            case 3:
                ii.t tVar = (ii.t) this.R;
                if (i7 == 42) {
                    Activity parentActivity2 = tVar.getParentActivity();
                    int i11 = org.telegram.ui.ActionBar.n6.L6;
                    i6Var2 = ((org.telegram.ui.ActionBar.h2) tVar).resourceProvider;
                    org.telegram.ui.Cells.o4 o4Var2 = new org.telegram.ui.Cells.o4(parentActivity2, i11, 21, 0, false, i6Var2);
                    o4Var2.setHeight(25);
                    return new v4.f1(o4Var2);
                }
                return super.x(viewGroup, i7);
            case 4:
                ki.k kVar = (ki.k) this.R;
                if (i7 == 42) {
                    Activity parentActivity3 = kVar.getParentActivity();
                    int i12 = org.telegram.ui.ActionBar.n6.L6;
                    i6Var3 = ((org.telegram.ui.ActionBar.h2) kVar).resourceProvider;
                    org.telegram.ui.Cells.o4 o4Var3 = new org.telegram.ui.Cells.o4(parentActivity3, i12, 21, 0, false, i6Var3);
                    o4Var3.setHeight(25);
                    return new v4.f1(o4Var3);
                }
                return super.x(viewGroup, i7);
            case 5:
                ki.i3 i3Var = (ki.i3) this.R;
                if (i7 == 42) {
                    org.telegram.ui.Cells.o4 o4Var4 = new org.telegram.ui.Cells.o4(i3Var.getParentActivity(), org.telegram.ui.ActionBar.n6.L6, 21, 0, false, ki.i3.H0(i3Var));
                    o4Var4.setHeight(25);
                    return new v4.f1(o4Var4);
                }
                return super.x(viewGroup, i7);
        }
    }

    @Override
    public void y(v4.f1 f1Var) {
        fi.m0 m0Var;
        fi.r0 r0Var;
        switch (this.Q) {
            case 2:
                super.y(f1Var);
                fi.a2 a2Var = (fi.a2) this.R;
                if (a2Var.E) {
                    View view = f1Var.f59123a;
                    if ((view instanceof fi.m0) && (r0Var = (m0Var = (fi.m0) view).L) != null && r0Var.f12483a == a2Var.f12572y) {
                        m0Var.a();
                        a2Var.E = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.y(f1Var);
                return;
        }
    }

    public d8(s00 s00Var, ck0 ck0Var, Activity activity, int i7, int i10, q10 q10Var, org.telegram.ui.ActionBar.i6 i6Var, int i11) {
        super(ck0Var, activity, i7, i10, true, q10Var, i6Var);
        this.Q = i11;
        this.R = s00Var;
    }
}

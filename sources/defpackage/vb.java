package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d;
public final class vb extends l7c {
    public final byte Q;
    public final Object R;

    public vb(KeyEvent.Callback callback, r59 r59Var, Context context, int i, jac jacVar, ylb ylbVar, byte b) {
        super(r59Var, context, i, 0, false, jacVar, ylbVar);
        this.Q = b;
        this.R = callback;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        d96 d96Var;
        i96 i96Var;
        switch (this.Q) {
            case 2:
                super.t(u69Var, i);
                n38 n38Var = (n38) this.R;
                if (n38Var.E) {
                    View view = u69Var.a;
                    if ((view instanceof d96) && (i96Var = (d96Var = (d96) view).L) != null && i96Var.a == n38Var.y) {
                        d96Var.a();
                        n38Var.E = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.t(u69Var, i);
                return;
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        ylb ylbVar;
        ylb ylbVar2;
        ylb ylbVar3;
        byte b = this.Q;
        Object obj = this.R;
        switch (b) {
            case 0:
                bc bcVar = (bc) obj;
                if (i == 42) {
                    Activity parentActivity = bcVar.getParentActivity();
                    int i2 = cmb.K6;
                    ylbVar = ((d) bcVar).resourceProvider;
                    jf5 jf5Var = new jf5(parentActivity, i2, 21, 0, false, ylbVar);
                    jf5Var.setHeight(25);
                    return new u69(jf5Var);
                }
                return super.x(viewGroup, i);
            case 1:
                mh1 mh1Var = (mh1) obj;
                if (i == 42) {
                    jf5 jf5Var2 = new jf5(mh1Var.getParentActivity(), cmb.K6, 21, 0, false, mh1.C0(mh1Var));
                    jf5Var2.setHeight(25);
                    return new u69(jf5Var2);
                }
                return super.x(viewGroup, i);
            case 2:
            default:
                return super.x(viewGroup, i);
            case 3:
                yb9 yb9Var = (yb9) obj;
                if (i == 0) {
                    return new u69(new jf5(yb9Var.getContext(), cmb.K6, 13, 12, 4, false, false, yb9Var.J0));
                }
                if (i == 42) {
                    return new u69(new jf5(yb9Var.getContext(), cmb.K6, 13, 12, 4, false, true, yb9Var.J0));
                }
                return super.x(viewGroup, i);
            case 4:
                nxa nxaVar = (nxa) obj;
                if (i == 42) {
                    Activity parentActivity2 = nxaVar.getParentActivity();
                    int i3 = cmb.K6;
                    ylbVar2 = ((d) nxaVar).resourceProvider;
                    jf5 jf5Var3 = new jf5(parentActivity2, i3, 21, 0, false, ylbVar2);
                    jf5Var3.setHeight(25);
                    return new u69(jf5Var3);
                }
                return super.x(viewGroup, i);
            case 5:
                yfb yfbVar = (yfb) obj;
                if (i == 42) {
                    Activity parentActivity3 = yfbVar.getParentActivity();
                    int i4 = cmb.K6;
                    ylbVar3 = ((d) yfbVar).resourceProvider;
                    jf5 jf5Var4 = new jf5(parentActivity3, i4, 21, 0, false, ylbVar3);
                    jf5Var4.setHeight(25);
                    return new u69(jf5Var4);
                }
                return super.x(viewGroup, i);
        }
    }

    @Override
    public final void y(u69 u69Var) {
        d96 d96Var;
        i96 i96Var;
        switch (this.Q) {
            case 2:
                super.y(u69Var);
                n38 n38Var = (n38) this.R;
                if (n38Var.E) {
                    View view = u69Var.a;
                    if ((view instanceof d96) && (i96Var = (d96Var = (d96) view).L) != null && i96Var.a == n38Var.y) {
                        d96Var.a();
                        n38Var.E = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.y(u69Var);
                return;
        }
    }

    public vb(h15 h15Var, r59 r59Var, Activity activity, int i, int i2, jac jacVar, ylb ylbVar, byte b) {
        super(r59Var, activity, i, i2, true, jacVar, ylbVar);
        this.Q = b;
        this.R = h15Var;
    }
}

package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.d;
public final class vb extends l5c {
    public final byte Q;
    public final Object R;

    public vb(KeyEvent.Callback callback, o39 o39Var, Context context, int i, i8c i8cVar, wjb wjbVar, byte b) {
        super(o39Var, context, i, 0, false, i8cVar, wjbVar);
        this.Q = b;
        this.R = callback;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        d76 d76Var;
        i76 i76Var;
        switch (this.Q) {
            case 2:
                super.t(s49Var, i);
                l18 l18Var = (l18) this.R;
                if (l18Var.E) {
                    View view = s49Var.a;
                    if ((view instanceof d76) && (i76Var = (d76Var = (d76) view).L) != null && i76Var.a == l18Var.y) {
                        d76Var.a();
                        l18Var.E = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.t(s49Var, i);
                return;
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        wjb wjbVar;
        wjb wjbVar2;
        wjb wjbVar3;
        byte b = this.Q;
        Object obj = this.R;
        switch (b) {
            case 0:
                bc bcVar = (bc) obj;
                if (i == 42) {
                    Activity parentActivity = bcVar.getParentActivity();
                    int i2 = bkb.K6;
                    wjbVar = ((d) bcVar).resourceProvider;
                    ld5 ld5Var = new ld5(parentActivity, i2, 21, 0, false, wjbVar);
                    ld5Var.setHeight(25);
                    return new s49(ld5Var);
                }
                return super.x(viewGroup, i);
            case 1:
                eg1 eg1Var = (eg1) obj;
                if (i == 42) {
                    ld5 ld5Var2 = new ld5(eg1Var.getParentActivity(), bkb.K6, 21, 0, false, eg1.B0(eg1Var));
                    ld5Var2.setHeight(25);
                    return new s49(ld5Var2);
                }
                return super.x(viewGroup, i);
            case 2:
            default:
                return super.x(viewGroup, i);
            case 3:
                y99 y99Var = (y99) obj;
                if (i == 0) {
                    return new s49(new ld5(y99Var.getContext(), bkb.K6, 13, 12, 4, false, false, y99Var.J0));
                }
                if (i == 42) {
                    return new s49(new ld5(y99Var.getContext(), bkb.K6, 13, 12, 4, false, true, y99Var.J0));
                }
                return super.x(viewGroup, i);
            case 4:
                jva jvaVar = (jva) obj;
                if (i == 42) {
                    Activity parentActivity2 = jvaVar.getParentActivity();
                    int i3 = bkb.K6;
                    wjbVar2 = ((d) jvaVar).resourceProvider;
                    ld5 ld5Var3 = new ld5(parentActivity2, i3, 21, 0, false, wjbVar2);
                    ld5Var3.setHeight(25);
                    return new s49(ld5Var3);
                }
                return super.x(viewGroup, i);
            case 5:
                ydb ydbVar = (ydb) obj;
                if (i == 42) {
                    Activity parentActivity3 = ydbVar.getParentActivity();
                    int i4 = bkb.K6;
                    wjbVar3 = ((d) ydbVar).resourceProvider;
                    ld5 ld5Var4 = new ld5(parentActivity3, i4, 21, 0, false, wjbVar3);
                    ld5Var4.setHeight(25);
                    return new s49(ld5Var4);
                }
                return super.x(viewGroup, i);
        }
    }

    @Override
    public final void y(s49 s49Var) {
        d76 d76Var;
        i76 i76Var;
        switch (this.Q) {
            case 2:
                super.y(s49Var);
                l18 l18Var = (l18) this.R;
                if (l18Var.E) {
                    View view = s49Var.a;
                    if ((view instanceof d76) && (i76Var = (d76Var = (d76) view).L) != null && i76Var.a == l18Var.y) {
                        d76Var.a();
                        l18Var.E = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.y(s49Var);
                return;
        }
    }

    public vb(iz4 iz4Var, o39 o39Var, Activity activity, int i, int i2, i8c i8cVar, wjb wjbVar, byte b) {
        super(o39Var, activity, i, i2, true, i8cVar, wjbVar);
        this.Q = b;
        this.R = iz4Var;
    }
}

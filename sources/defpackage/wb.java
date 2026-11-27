package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.ActionBar.e;
public final class wb extends l9c {
    public final byte Q;
    public final Object R;

    public wb(KeyEvent.Callback callback, d79 d79Var, Context context, int i, icc iccVar, vnb vnbVar, byte b) {
        super(d79Var, context, i, 0, false, iccVar, vnbVar);
        this.Q = b;
        this.R = callback;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        h96 h96Var;
        m96 m96Var;
        switch (this.Q) {
            case 2:
                super.t(f89Var, i);
                c58 c58Var = (c58) this.R;
                if (c58Var.E) {
                    View view = f89Var.a;
                    if ((view instanceof h96) && (m96Var = (h96Var = (h96) view).L) != null && m96Var.a == c58Var.y) {
                        h96Var.a();
                        c58Var.E = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.t(f89Var, i);
                return;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        vnb vnbVar;
        vnb vnbVar2;
        vnb vnbVar3;
        byte b = this.Q;
        Object obj = this.R;
        switch (b) {
            case 0:
                cc ccVar = (cc) obj;
                if (i == 42) {
                    Activity parentActivity = ccVar.getParentActivity();
                    int i2 = aob.L6;
                    vnbVar = ((e) ccVar).resourceProvider;
                    mf5 mf5Var = new mf5(parentActivity, i2, 21, 0, false, vnbVar);
                    mf5Var.setHeight(25);
                    return new f89(mf5Var);
                }
                return super.x(viewGroup, i);
            case 1:
                ng1 ng1Var = (ng1) obj;
                if (i == 42) {
                    mf5 mf5Var2 = new mf5(ng1Var.getParentActivity(), aob.L6, 21, 0, false, ng1.C0(ng1Var));
                    mf5Var2.setHeight(25);
                    return new f89(mf5Var2);
                }
                return super.x(viewGroup, i);
            case 2:
            default:
                return super.x(viewGroup, i);
            case 3:
                md9 md9Var = (md9) obj;
                if (i == 0) {
                    return new f89(new mf5(md9Var.getContext(), aob.L6, 13, 12, 4, false, false, md9Var.J0));
                }
                if (i == 42) {
                    return new f89(new mf5(md9Var.getContext(), aob.L6, 13, 12, 4, false, true, md9Var.J0));
                }
                return super.x(viewGroup, i);
            case 4:
                nza nzaVar = (nza) obj;
                if (i == 42) {
                    Activity parentActivity2 = nzaVar.getParentActivity();
                    int i3 = aob.L6;
                    vnbVar2 = ((e) nzaVar).resourceProvider;
                    mf5 mf5Var3 = new mf5(parentActivity2, i3, 21, 0, false, vnbVar2);
                    mf5Var3.setHeight(25);
                    return new f89(mf5Var3);
                }
                return super.x(viewGroup, i);
            case 5:
                thb thbVar = (thb) obj;
                if (i == 42) {
                    Activity parentActivity3 = thbVar.getParentActivity();
                    int i4 = aob.L6;
                    vnbVar3 = ((e) thbVar).resourceProvider;
                    mf5 mf5Var4 = new mf5(parentActivity3, i4, 21, 0, false, vnbVar3);
                    mf5Var4.setHeight(25);
                    return new f89(mf5Var4);
                }
                return super.x(viewGroup, i);
        }
    }

    @Override
    public final void y(f89 f89Var) {
        h96 h96Var;
        m96 m96Var;
        switch (this.Q) {
            case 2:
                super.y(f89Var);
                c58 c58Var = (c58) this.R;
                if (c58Var.E) {
                    View view = f89Var.a;
                    if ((view instanceof h96) && (m96Var = (h96Var = (h96) view).L) != null && m96Var.a == c58Var.y) {
                        h96Var.a();
                        c58Var.E = false;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.y(f89Var);
                return;
        }
    }

    public wb(m15 m15Var, d79 d79Var, Activity activity, int i, int i2, icc iccVar, vnb vnbVar, byte b) {
        super(d79Var, activity, i, i2, true, iccVar, vnbVar);
        this.Q = b;
        this.R = m15Var;
    }
}

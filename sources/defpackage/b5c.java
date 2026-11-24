package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.TwoStepVerificationActivity;
public final class b5c extends q59 {
    public final Context c;
    public final TwoStepVerificationActivity d;

    public b5c(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (!twoStepVerificationActivity.H && twoStepVerificationActivity.J != null) {
            return twoStepVerificationActivity.U;
        }
        return 0;
    }

    @Override
    public final int d(int i) {
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i != twoStepVerificationActivity.Q && i != twoStepVerificationActivity.T) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2;
        int i3;
        int i4 = u69Var.f;
        View view = u69Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i4 != 0) {
            if (i4 == 1) {
                njb njbVar = (njb) view;
                if (i == twoStepVerificationActivity.Q) {
                    njbVar.setText(jb6.M0(2131745282, null));
                    return;
                } else if (i == twoStepVerificationActivity.T) {
                    njbVar.setText(jb6.M0(2131751079, null));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        vkb vkbVar = (vkb) view;
        int i5 = cmb.F6;
        vkbVar.setTag(Integer.valueOf(i5));
        anb.X(vkbVar.getTextView(), i5, null);
        i2 = twoStepVerificationActivity.changePasswordRow;
        if (i == i2) {
            vkbVar.b(jb6.M0(2131752494, null), true);
        } else if (i != twoStepVerificationActivity.P) {
            i3 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i == i3) {
                vkbVar.b(jb6.M0(2131743629, null), true);
            } else if (i == twoStepVerificationActivity.S) {
                vkbVar.b(jb6.M0(2131752484, null), false);
            } else if (i == twoStepVerificationActivity.R) {
                vkbVar.b(jb6.M0(2131745249, null), false);
            }
        } else {
            vkbVar.b(jb6.M0(2131745283, null), true);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View vkbVar;
        Context context = this.c;
        if (i != 0) {
            vkbVar = new njb(context);
        } else {
            vkbVar = new vkb(context);
            anb.h(cmb.c6, null, vkbVar);
        }
        return new u69(vkbVar);
    }
}

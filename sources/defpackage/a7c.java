package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.TwoStepVerificationActivity;
public final class a7c extends c79 {
    public final Context c;
    public final TwoStepVerificationActivity d;

    public a7c(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 0) {
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
    public final void t(f89 f89Var, int i) {
        int i2;
        int i3;
        int i4 = f89Var.f;
        View view = f89Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i4 != 0) {
            if (i4 == 1) {
                ilb ilbVar = (ilb) view;
                if (i == twoStepVerificationActivity.Q) {
                    ilbVar.setText(ob6.M0(2131745276, null));
                    return;
                } else if (i == twoStepVerificationActivity.T) {
                    ilbVar.setText(ob6.M0(2131751107, null));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        qmb qmbVar = (qmb) view;
        int i5 = aob.G6;
        qmbVar.setTag(Integer.valueOf(i5));
        yob.X(qmbVar.getTextView(), i5, null);
        i2 = twoStepVerificationActivity.changePasswordRow;
        if (i == i2) {
            qmbVar.b(ob6.M0(2131752522, null), true);
        } else if (i != twoStepVerificationActivity.P) {
            i3 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i == i3) {
                qmbVar.b(ob6.M0(2131743597, null), true);
            } else if (i == twoStepVerificationActivity.S) {
                qmbVar.b(ob6.M0(2131752512, null), false);
            } else if (i == twoStepVerificationActivity.R) {
                qmbVar.b(ob6.M0(2131745243, null), false);
            }
        } else {
            qmbVar.b(ob6.M0(2131745277, null), true);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View qmbVar;
        Context context = this.c;
        if (i != 0) {
            qmbVar = new ilb(context);
        } else {
            qmbVar = new qmb(context);
            yob.h(aob.d6, null, qmbVar);
        }
        return new f89(qmbVar);
    }
}

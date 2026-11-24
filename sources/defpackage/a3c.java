package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.ui.TwoStepVerificationActivity;
public final class a3c extends n39 {
    public final Context c;
    public final TwoStepVerificationActivity d;

    public a3c(TwoStepVerificationActivity twoStepVerificationActivity, Context context) {
        this.d = twoStepVerificationActivity;
        this.c = context;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 0) {
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
    public final void t(s49 s49Var, int i) {
        int i2;
        int i3;
        int i4 = s49Var.f;
        View view = s49Var.a;
        TwoStepVerificationActivity twoStepVerificationActivity = this.d;
        if (i4 != 0) {
            if (i4 == 1) {
                mhb mhbVar = (mhb) view;
                if (i == twoStepVerificationActivity.Q) {
                    mhbVar.setText(k96.M0(2131745356, null));
                    return;
                } else if (i == twoStepVerificationActivity.T) {
                    mhbVar.setText(k96.M0(2131751130, null));
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        uib uibVar = (uib) view;
        int i5 = bkb.F6;
        uibVar.setTag(Integer.valueOf(i5));
        zkb.X(uibVar.getTextView(), i5, null);
        i2 = twoStepVerificationActivity.changePasswordRow;
        if (i == i2) {
            uibVar.b(k96.M0(2131752529, null), true);
        } else if (i != twoStepVerificationActivity.P) {
            i3 = twoStepVerificationActivity.turnPasswordOffRow;
            if (i == i3) {
                uibVar.b(k96.M0(2131743703, null), true);
            } else if (i == twoStepVerificationActivity.S) {
                uibVar.b(k96.M0(2131752519, null), false);
            } else if (i == twoStepVerificationActivity.R) {
                uibVar.b(k96.M0(2131745323, null), false);
            }
        } else {
            uibVar.b(k96.M0(2131745357, null), true);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View uibVar;
        Context context = this.c;
        if (i != 0) {
            uibVar = new mhb(context);
        } else {
            uibVar = new uib(context);
            zkb.h(bkb.c6, null, uibVar);
        }
        return new s49(uibVar);
    }
}

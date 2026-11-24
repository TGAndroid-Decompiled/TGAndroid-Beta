package defpackage;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class u10 implements m7, h59 {
    public final byte a;
    public final i30 b;

    public u10(i30 i30Var, byte b) {
        this.a = b;
        this.b = i30Var;
    }

    @Override
    public final boolean g(int i, View view) {
        if (view instanceof j30) {
            i30 i30Var = this.b;
            if (!i30Var.I0()) {
                j30 j30Var = (j30) view;
                i30Var.R0(j30Var, j30Var.getMessageObject());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void h(int i) {
        byte b = this.a;
        i30 i30Var = this.b;
        switch (b) {
            case 0:
                if (i >= 0) {
                    float[] fArr = i30.T2;
                    if (i < 6) {
                        MediaController.w().l0(true, fArr[i]);
                        i30Var.V0(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (i != 1 && i != 2) {
                    if (i == 4) {
                        if (gda.O0 == 1) {
                            gda.D(0);
                        } else {
                            gda.D(1);
                        }
                    } else if (gda.O0 == 2) {
                        gda.D(0);
                    } else {
                        gda.D(2);
                    }
                } else {
                    boolean z = gda.K0;
                    if ((z && i == 1) || (gda.J0 && i == 2)) {
                        MediaController.w().k0(0);
                    } else {
                        MediaController.w().k0(i);
                    }
                    i30Var.t1.f();
                    if (z != gda.K0) {
                        i30Var.r1.D0();
                        i30Var.M0(false);
                    }
                }
                i30Var.X0();
                return;
            default:
                i30Var.J0(i);
                return;
        }
    }
}

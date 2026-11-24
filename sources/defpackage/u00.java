package defpackage;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class u00 implements m7, e39 {
    public final byte a;
    public final i20 b;

    public u00(i20 i20Var, byte b) {
        this.a = b;
        this.b = i20Var;
    }

    @Override
    public final boolean d(int i, View view) {
        if (view instanceof j20) {
            i20 i20Var = this.b;
            if (!i20Var.I0()) {
                j20 j20Var = (j20) view;
                i20Var.R0(j20Var, j20Var.getMessageObject());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void h(int i) {
        byte b = this.a;
        i20 i20Var = this.b;
        switch (b) {
            case 0:
                if (i >= 0) {
                    float[] fArr = i20.T2;
                    if (i < 6) {
                        MediaController.w().l0(true, fArr[i]);
                        i20Var.V0(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (i != 1 && i != 2) {
                    if (i == 4) {
                        if (gba.O0 == 1) {
                            gba.D(0);
                        } else {
                            gba.D(1);
                        }
                    } else if (gba.O0 == 2) {
                        gba.D(0);
                    } else {
                        gba.D(2);
                    }
                } else {
                    boolean z = gba.K0;
                    if ((z && i == 1) || (gba.J0 && i == 2)) {
                        MediaController.w().k0(0);
                    } else {
                        MediaController.w().k0(i);
                    }
                    i20Var.t1.f();
                    if (z != gba.K0) {
                        i20Var.r1.D0();
                        i20Var.M0(false);
                    }
                }
                i20Var.X0();
                return;
            default:
                i20Var.J0(i);
                return;
        }
    }
}

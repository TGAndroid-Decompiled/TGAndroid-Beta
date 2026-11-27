package defpackage;

import android.view.View;
import org.telegram.messenger.MediaController;
public final class v00 implements n7, t69 {
    public final byte a;
    public final j20 b;

    public v00(j20 j20Var, byte b) {
        this.a = b;
        this.b = j20Var;
    }

    @Override
    public final boolean e(int i, View view) {
        if (view instanceof k20) {
            j20 j20Var = this.b;
            if (!j20Var.J0()) {
                k20 k20Var = (k20) view;
                j20Var.S0(k20Var, k20Var.getMessageObject());
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void g(int i) {
        byte b = this.a;
        j20 j20Var = this.b;
        switch (b) {
            case 0:
                if (i >= 0) {
                    float[] fArr = j20.T2;
                    if (i < 6) {
                        MediaController.z().o0(true, fArr[i]);
                        j20Var.W0(true);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (i != 1 && i != 2) {
                    if (i == 4) {
                        if (xea.O0 == 1) {
                            xea.D(0);
                        } else {
                            xea.D(1);
                        }
                    } else if (xea.O0 == 2) {
                        xea.D(0);
                    } else {
                        xea.D(2);
                    }
                } else {
                    boolean z = xea.K0;
                    if ((z && i == 1) || (xea.J0 && i == 2)) {
                        MediaController.z().n0(0);
                    } else {
                        MediaController.z().n0(i);
                    }
                    j20Var.t1.f();
                    if (z != xea.K0) {
                        j20Var.r1.E0();
                        j20Var.N0(false);
                    }
                }
                j20Var.Y0();
                return;
            default:
                j20Var.K0(i);
                return;
        }
    }
}

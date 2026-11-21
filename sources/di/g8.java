package di;

import org.telegram.messenger.x10;
import org.telegram.ui.cd0;
public final class g8 implements Runnable {
    public final int f8902a;
    public final boolean[] f8903b;
    public final x10 f8904c;

    public g8(int i7, x10 x10Var, boolean[] zArr) {
        this.f8902a = i7;
        this.f8903b = zArr;
        this.f8904c = x10Var;
    }

    @Override
    public final void run() {
        x10 x10Var;
        x10 x10Var2;
        x10 x10Var3;
        switch (this.f8902a) {
            case 0:
                boolean[] zArr = this.f8903b;
                if (!zArr[0] && (x10Var = this.f8904c) != null) {
                    x10Var.a("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f8903b;
                if (!zArr2[0] && (x10Var2 = this.f8904c) != null) {
                    zArr2[0] = true;
                    x10Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.h3(new cd0(4), 220L);
                return;
            default:
                boolean[] zArr3 = this.f8903b;
                if (!zArr3[0] && (x10Var3 = this.f8904c) != null) {
                    zArr3[0] = true;
                    x10Var3.a(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public g8(y8 y8Var, boolean[] zArr, x10 x10Var) {
        this.f8902a = 0;
        this.f8903b = zArr;
        this.f8904c = x10Var;
    }
}

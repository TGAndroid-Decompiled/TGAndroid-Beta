package di;

import org.telegram.messenger.x10;
import org.telegram.ui.dd0;
public final class f8 implements Runnable {
    public final int f8828a;
    public final boolean[] f8829b;
    public final x10 f8830c;

    public f8(int i7, x10 x10Var, boolean[] zArr) {
        this.f8828a = i7;
        this.f8829b = zArr;
        this.f8830c = x10Var;
    }

    @Override
    public final void run() {
        x10 x10Var;
        x10 x10Var2;
        x10 x10Var3;
        switch (this.f8828a) {
            case 0:
                boolean[] zArr = this.f8829b;
                if (!zArr[0] && (x10Var = this.f8830c) != null) {
                    x10Var.a("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f8829b;
                if (!zArr2[0] && (x10Var2 = this.f8830c) != null) {
                    zArr2[0] = true;
                    x10Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.h3(new dd0(4), 220L);
                return;
            default:
                boolean[] zArr3 = this.f8829b;
                if (!zArr3[0] && (x10Var3 = this.f8830c) != null) {
                    zArr3[0] = true;
                    x10Var3.a(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public f8(x8 x8Var, boolean[] zArr, x10 x10Var) {
        this.f8828a = 0;
        this.f8829b = zArr;
        this.f8830c = x10Var;
    }
}

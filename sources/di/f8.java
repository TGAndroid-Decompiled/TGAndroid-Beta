package di;

import org.telegram.messenger.x10;
import org.telegram.ui.cd0;
public final class f8 implements Runnable {
    public final int f8831a;
    public final boolean[] f8832b;
    public final x10 f8833c;

    public f8(int i7, x10 x10Var, boolean[] zArr) {
        this.f8831a = i7;
        this.f8832b = zArr;
        this.f8833c = x10Var;
    }

    @Override
    public final void run() {
        x10 x10Var;
        x10 x10Var2;
        x10 x10Var3;
        switch (this.f8831a) {
            case 0:
                boolean[] zArr = this.f8832b;
                if (!zArr[0] && (x10Var = this.f8833c) != null) {
                    x10Var.a("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f8832b;
                if (!zArr2[0] && (x10Var2 = this.f8833c) != null) {
                    zArr2[0] = true;
                    x10Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.h3(new cd0(4), 220L);
                return;
            default:
                boolean[] zArr3 = this.f8832b;
                if (!zArr3[0] && (x10Var3 = this.f8833c) != null) {
                    zArr3[0] = true;
                    x10Var3.a(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public f8(x8 x8Var, boolean[] zArr, x10 x10Var) {
        this.f8831a = 0;
        this.f8832b = zArr;
        this.f8833c = x10Var;
    }
}

package di;

import org.telegram.messenger.y10;
import org.telegram.ui.cd0;
public final class g8 implements Runnable {
    public final int f8905a;
    public final boolean[] f8906b;
    public final y10 f8907c;

    public g8(int i7, y10 y10Var, boolean[] zArr) {
        this.f8905a = i7;
        this.f8906b = zArr;
        this.f8907c = y10Var;
    }

    @Override
    public final void run() {
        y10 y10Var;
        y10 y10Var2;
        y10 y10Var3;
        switch (this.f8905a) {
            case 0:
                boolean[] zArr = this.f8906b;
                if (!zArr[0] && (y10Var = this.f8907c) != null) {
                    y10Var.a("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f8906b;
                if (!zArr2[0] && (y10Var2 = this.f8907c) != null) {
                    zArr2[0] = true;
                    y10Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.h3(new cd0(4), 220L);
                return;
            default:
                boolean[] zArr3 = this.f8906b;
                if (!zArr3[0] && (y10Var3 = this.f8907c) != null) {
                    zArr3[0] = true;
                    y10Var3.a(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public g8(y8 y8Var, boolean[] zArr, y10 y10Var) {
        this.f8905a = 0;
        this.f8906b = zArr;
        this.f8907c = y10Var;
    }
}

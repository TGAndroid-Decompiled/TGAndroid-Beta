package di;

import org.telegram.messenger.w10;
import org.telegram.ui.cd0;
public final class g8 implements Runnable {
    public final int f8866a;
    public final boolean[] f8867b;
    public final w10 f8868c;

    public g8(int i7, w10 w10Var, boolean[] zArr) {
        this.f8866a = i7;
        this.f8867b = zArr;
        this.f8868c = w10Var;
    }

    @Override
    public final void run() {
        w10 w10Var;
        w10 w10Var2;
        w10 w10Var3;
        switch (this.f8866a) {
            case 0:
                boolean[] zArr = this.f8867b;
                if (!zArr[0] && (w10Var = this.f8868c) != null) {
                    w10Var.a("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f8867b;
                if (!zArr2[0] && (w10Var2 = this.f8868c) != null) {
                    zArr2[0] = true;
                    w10Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.h3(new cd0(4), 220L);
                return;
            default:
                boolean[] zArr3 = this.f8867b;
                if (!zArr3[0] && (w10Var3 = this.f8868c) != null) {
                    zArr3[0] = true;
                    w10Var3.a(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public g8(y8 y8Var, boolean[] zArr, w10 w10Var) {
        this.f8866a = 0;
        this.f8867b = zArr;
        this.f8868c = w10Var;
    }
}

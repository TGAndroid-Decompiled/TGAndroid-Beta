package ci;

import org.telegram.messenger.u10;
import org.telegram.ui.Components.go;
public final class l8 implements Runnable {
    public final int f5497a;
    public final boolean[] f5498b;
    public final u10 f5499c;

    public l8(int i3, u10 u10Var, boolean[] zArr) {
        this.f5497a = i3;
        this.f5498b = zArr;
        this.f5499c = u10Var;
    }

    @Override
    public final void run() {
        u10 u10Var;
        u10 u10Var2;
        u10 u10Var3;
        switch (this.f5497a) {
            case 0:
                boolean[] zArr = this.f5498b;
                if (!zArr[0] && (u10Var = this.f5499c) != null) {
                    u10Var.a("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f5498b;
                if (!zArr2[0] && (u10Var2 = this.f5499c) != null) {
                    zArr2[0] = true;
                    u10Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.i3(new go(27), 220L);
                return;
            default:
                boolean[] zArr3 = this.f5498b;
                if (!zArr3[0] && (u10Var3 = this.f5499c) != null) {
                    zArr3[0] = true;
                    u10Var3.a(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public l8(e9 e9Var, boolean[] zArr, u10 u10Var) {
        this.f5497a = 0;
        this.f5498b = zArr;
        this.f5499c = u10Var;
    }
}

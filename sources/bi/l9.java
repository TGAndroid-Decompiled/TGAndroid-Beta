package bi;

import org.telegram.messenger.c20;
import org.telegram.ui.Components.l10;
public final class l9 implements Runnable {
    public final int f4281a;
    public final boolean[] f4282b;
    public final c20 f4283c;

    public l9(int i7, c20 c20Var, boolean[] zArr) {
        this.f4281a = i7;
        this.f4282b = zArr;
        this.f4283c = c20Var;
    }

    @Override
    public final void run() {
        c20 c20Var;
        c20 c20Var2;
        c20 c20Var3;
        switch (this.f4281a) {
            case 0:
                boolean[] zArr = this.f4282b;
                if (!zArr[0] && (c20Var = this.f4283c) != null) {
                    c20Var.a("cancelled");
                    zArr[0] = true;
                    return;
                }
                return;
            case 1:
                boolean[] zArr2 = this.f4282b;
                if (!zArr2[0] && (c20Var2 = this.f4283c) != null) {
                    zArr2[0] = true;
                    c20Var2.a(Boolean.TRUE);
                }
                org.telegram.messenger.g0.i3(new l10(26), 220L);
                return;
            default:
                boolean[] zArr3 = this.f4282b;
                if (!zArr3[0] && (c20Var3 = this.f4283c) != null) {
                    zArr3[0] = true;
                    c20Var3.a(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public l9(ea eaVar, boolean[] zArr, c20 c20Var) {
        this.f4281a = 0;
        this.f4282b = zArr;
        this.f4283c = c20Var;
    }
}

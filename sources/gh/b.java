package gh;

import fh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
public final class b implements d {
    public final int f12486a;
    public final u6 f12487b;

    public b(int i10, u6 u6Var) {
        this.f12486a = i10;
        this.f12487b = u6Var;
    }

    @Override
    public final int i(u6 u6Var, boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f12486a) {
            case 0:
                if (!c.c(UserConfig.selectedAccount, this.f12487b)) {
                    return i0.a.o(y6.w0(y6.Sd, u6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return y6.o1(f7, y6.w0(y6.Sd, u6Var));
            case 1:
                if (!c.c(UserConfig.selectedAccount, this.f12487b)) {
                    if (z10) {
                        i10 = y6.f23637s8;
                    } else {
                        i10 = y6.f23346ce;
                    }
                    return i0.a.o(y6.w0(i10, u6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return y6.o1(f10, y6.w0(y6.f23346ce, u6Var));
            default:
                if (!c.c(UserConfig.selectedAccount, this.f12487b)) {
                    if (z10) {
                        i11 = y6.f23637s8;
                    } else {
                        i11 = y6.f23346ce;
                    }
                    return i0.a.o(y6.w0(i11, u6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return y6.o1(f11, y6.w0(y6.f23346ce, u6Var));
        }
    }
}

package fh;

import eh.d;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public final class a implements d {
    public final int f10611a;
    public final g6 f10612b;

    public a(int i10, g6 g6Var) {
        this.f10611a = i10;
        this.f10612b = g6Var;
    }

    @Override
    public final int i(g6 g6Var, boolean z10) {
        float f7;
        float f10;
        int i10;
        float f11;
        int i11;
        switch (this.f10611a) {
            case 0:
                if (!c.c(UserConfig.selectedAccount, this.f10612b)) {
                    return i0.a.o(k6.w0(k6.Sd, g6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f7 = 0.85f;
                } else {
                    f7 = 0.76f;
                }
                return k6.o1(f7, k6.w0(k6.Sd, g6Var));
            case 1:
                if (!c.c(UserConfig.selectedAccount, this.f10612b)) {
                    if (z10) {
                        i10 = k6.f21462s8;
                    } else {
                        i10 = k6.f21172ce;
                    }
                    return i0.a.o(k6.w0(i10, g6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return k6.o1(f10, k6.w0(k6.f21172ce, g6Var));
            default:
                if (!c.c(UserConfig.selectedAccount, this.f10612b)) {
                    if (z10) {
                        i11 = k6.f21462s8;
                    } else {
                        i11 = k6.f21172ce;
                    }
                    return i0.a.o(k6.w0(i11, g6Var), 255);
                }
                if (LiteMode.isEnabled(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return k6.o1(f11, k6.w0(k6.f21172ce, g6Var));
        }
    }
}

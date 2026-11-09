package hh;

import c8.g0;
import gh.d;
import org.telegram.messenger.p10;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
public final class a implements d {
    public final int f14489a;
    public final g6 f14490b;

    public a(int i7, g6 g6Var) {
        this.f14489a = i7;
        this.f14490b = g6Var;
    }

    @Override
    public final int k(g6 g6Var, boolean z9) {
        float f10;
        float f11;
        int i7;
        float f12;
        int i10;
        switch (this.f14489a) {
            case 0:
                if (!g0.c(p10.f24470s0, this.f14490b)) {
                    return i0.a.o(l6.w0(l6.Ge, g6Var), 255);
                }
                if (sc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return l6.r1(f10, l6.w0(l6.Ge, g6Var));
            case 1:
                if (!g0.c(p10.f24470s0, this.f14490b)) {
                    if (z9) {
                        i7 = l6.f28145s8;
                    } else {
                        i7 = l6.Qe;
                    }
                    return i0.a.o(l6.w0(i7, g6Var), 255);
                }
                if (sc.e(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return l6.r1(f11, l6.w0(l6.Qe, g6Var));
            default:
                if (!g0.c(p10.f24470s0, this.f14490b)) {
                    if (z9) {
                        i10 = l6.f28145s8;
                    } else {
                        i10 = l6.Qe;
                    }
                    return i0.a.o(l6.w0(i10, g6Var), 255);
                }
                if (sc.e(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return l6.r1(f12, l6.w0(l6.Qe, g6Var));
        }
    }
}

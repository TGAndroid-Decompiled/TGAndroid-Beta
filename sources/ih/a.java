package ih;

import b8.cd;
import hh.d;
import org.telegram.messenger.h10;
import org.telegram.messenger.lc;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
public final class a implements d {
    public final int f14765a;
    public final e6 f14766b;

    public a(int i3, e6 e6Var) {
        this.f14765a = i3;
        this.f14766b = e6Var;
    }

    @Override
    public final int j(e6 e6Var, boolean z10) {
        float f10;
        float f11;
        int i3;
        float f12;
        int i10;
        switch (this.f14765a) {
            case 0:
                if (!cd.c(h10.f22829t0, this.f14766b)) {
                    return i0.a.o(k6.w0(k6.Ge, e6Var), 255);
                }
                if (lc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return k6.r1(f10, k6.w0(k6.Ge, e6Var));
            case 1:
                if (!cd.c(h10.f22829t0, this.f14766b)) {
                    if (z10) {
                        i3 = k6.f28160s8;
                    } else {
                        i3 = k6.Qe;
                    }
                    return i0.a.o(k6.w0(i3, e6Var), 255);
                }
                if (lc.e(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return k6.r1(f11, k6.w0(k6.Qe, e6Var));
            default:
                if (!cd.c(h10.f22829t0, this.f14766b)) {
                    if (z10) {
                        i10 = k6.f28160s8;
                    } else {
                        i10 = k6.Qe;
                    }
                    return i0.a.o(k6.w0(i10, e6Var), 255);
                }
                if (lc.e(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return k6.r1(f12, k6.w0(k6.Qe, e6Var));
        }
    }
}

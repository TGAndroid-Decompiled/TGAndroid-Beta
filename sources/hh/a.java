package hh;

import c8.g0;
import gh.d;
import org.telegram.messenger.p10;
import org.telegram.messenger.rc;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
public final class a implements d {
    public final int f14489a;
    public final f6 f14490b;

    public a(int i7, f6 f6Var) {
        this.f14489a = i7;
        this.f14490b = f6Var;
    }

    @Override
    public final int k(f6 f6Var, boolean z9) {
        float f10;
        float f11;
        int i7;
        float f12;
        int i10;
        switch (this.f14489a) {
            case 0:
                if (!g0.c(p10.f24459s0, this.f14490b)) {
                    return i0.a.o(k6.w0(k6.Ge, f6Var), 255);
                }
                if (rc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return k6.r1(f10, k6.w0(k6.Ge, f6Var));
            case 1:
                if (!g0.c(p10.f24459s0, this.f14490b)) {
                    if (z9) {
                        i7 = k6.f28128s8;
                    } else {
                        i7 = k6.Qe;
                    }
                    return i0.a.o(k6.w0(i7, f6Var), 255);
                }
                if (rc.e(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return k6.r1(f11, k6.w0(k6.Qe, f6Var));
            default:
                if (!g0.c(p10.f24459s0, this.f14490b)) {
                    if (z9) {
                        i10 = k6.f28128s8;
                    } else {
                        i10 = k6.Qe;
                    }
                    return i0.a.o(k6.w0(i10, f6Var), 255);
                }
                if (rc.e(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return k6.r1(f12, k6.w0(k6.Qe, f6Var));
        }
    }
}

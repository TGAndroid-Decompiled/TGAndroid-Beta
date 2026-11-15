package hh;

import c8.g0;
import gh.d;
import org.telegram.messenger.m10;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
public final class a implements d {
    public final int f13846a;
    public final e6 f13847b;

    public a(int i7, e6 e6Var) {
        this.f13846a = i7;
        this.f13847b = e6Var;
    }

    @Override
    public final int j(e6 e6Var, boolean z10) {
        float f10;
        float f11;
        int i7;
        float f12;
        int i10;
        switch (this.f13846a) {
            case 0:
                if (!g0.c(m10.f24934t0, this.f13847b)) {
                    return i0.a.o(j6.w0(j6.Je, e6Var), 255);
                }
                if (qc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return j6.r1(f10, j6.w0(j6.Je, e6Var));
            case 1:
                if (!g0.c(m10.f24934t0, this.f13847b)) {
                    if (z10) {
                        i7 = j6.f29129s8;
                    } else {
                        i7 = j6.Te;
                    }
                    return i0.a.o(j6.w0(i7, e6Var), 255);
                }
                if (qc.e(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return j6.r1(f11, j6.w0(j6.Te, e6Var));
            default:
                if (!g0.c(m10.f24934t0, this.f13847b)) {
                    if (z10) {
                        i10 = j6.f29129s8;
                    } else {
                        i10 = j6.Te;
                    }
                    return i0.a.o(j6.w0(i10, e6Var), 255);
                }
                if (qc.e(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return j6.r1(f12, j6.w0(j6.Te, e6Var));
        }
    }
}

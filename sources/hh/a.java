package hh;

import c8.g0;
import gh.d;
import org.telegram.messenger.p10;
import org.telegram.messenger.sc;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class a implements d {
    public final int f14491a;
    public final h6 f14492b;

    public a(int i7, h6 h6Var) {
        this.f14491a = i7;
        this.f14492b = h6Var;
    }

    @Override
    public final int k(h6 h6Var, boolean z9) {
        float f10;
        float f11;
        int i7;
        float f12;
        int i10;
        switch (this.f14491a) {
            case 0:
                if (!g0.c(p10.f24474s0, this.f14492b)) {
                    return i0.a.o(m6.w0(m6.Ge, h6Var), 255);
                }
                if (sc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return m6.r1(f10, m6.w0(m6.Ge, h6Var));
            case 1:
                if (!g0.c(p10.f24474s0, this.f14492b)) {
                    if (z9) {
                        i7 = m6.f28170s8;
                    } else {
                        i7 = m6.Qe;
                    }
                    return i0.a.o(m6.w0(i7, h6Var), 255);
                }
                if (sc.e(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return m6.r1(f11, m6.w0(m6.Qe, h6Var));
            default:
                if (!g0.c(p10.f24474s0, this.f14492b)) {
                    if (z9) {
                        i10 = m6.f28170s8;
                    } else {
                        i10 = m6.Qe;
                    }
                    return i0.a.o(m6.w0(i10, h6Var), 255);
                }
                if (sc.e(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return m6.r1(f12, m6.w0(m6.Qe, h6Var));
        }
    }
}

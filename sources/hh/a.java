package hh;

import c8.j0;
import gh.d;
import org.telegram.messenger.k10;
import org.telegram.messenger.qc;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
public final class a implements d {
    public final int f14155a;
    public final h6 f14156b;

    public a(int i7, h6 h6Var) {
        this.f14155a = i7;
        this.f14156b = h6Var;
    }

    @Override
    public final int j(h6 h6Var, boolean z10) {
        float f10;
        float f11;
        int i7;
        float f12;
        int i10;
        switch (this.f14155a) {
            case 0:
                if (!j0.d(k10.f24932t0, this.f14156b)) {
                    return i0.a.o(m6.w0(m6.Je, h6Var), 255);
                }
                if (qc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return m6.r1(f10, m6.w0(m6.Je, h6Var));
            case 1:
                if (!j0.d(k10.f24932t0, this.f14156b)) {
                    if (z10) {
                        i7 = m6.f29627s8;
                    } else {
                        i7 = m6.Te;
                    }
                    return i0.a.o(m6.w0(i7, h6Var), 255);
                }
                if (qc.e(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return m6.r1(f11, m6.w0(m6.Te, h6Var));
            default:
                if (!j0.d(k10.f24932t0, this.f14156b)) {
                    if (z10) {
                        i10 = m6.f29627s8;
                    } else {
                        i10 = m6.Te;
                    }
                    return i0.a.o(m6.w0(i10, h6Var), 255);
                }
                if (qc.e(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return m6.r1(f12, m6.w0(m6.Te, h6Var));
        }
    }
}

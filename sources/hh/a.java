package hh;

import c8.i0;
import gh.d;
import org.telegram.messenger.j10;
import org.telegram.messenger.pc;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
public final class a implements d {
    public final int f14160a;
    public final i6 f14161b;

    public a(int i7, i6 i6Var) {
        this.f14160a = i7;
        this.f14161b = i6Var;
    }

    @Override
    public final int j(i6 i6Var, boolean z10) {
        float f10;
        float f11;
        int i7;
        float f12;
        int i10;
        switch (this.f14160a) {
            case 0:
                if (!i0.d(j10.f24770t0, this.f14161b)) {
                    return i0.a.o(n6.w0(n6.Je, i6Var), 255);
                }
                if (pc.e(262144)) {
                    f10 = 0.85f;
                } else {
                    f10 = 0.76f;
                }
                return n6.r1(f10, n6.w0(n6.Je, i6Var));
            case 1:
                if (!i0.d(j10.f24770t0, this.f14161b)) {
                    if (z10) {
                        i7 = n6.f29674s8;
                    } else {
                        i7 = n6.Te;
                    }
                    return i0.a.o(n6.w0(i7, i6Var), 255);
                }
                if (pc.e(262144)) {
                    f11 = 0.85f;
                } else {
                    f11 = 0.76f;
                }
                return n6.r1(f11, n6.w0(n6.Te, i6Var));
            default:
                if (!i0.d(j10.f24770t0, this.f14161b)) {
                    if (z10) {
                        i10 = n6.f29674s8;
                    } else {
                        i10 = n6.Te;
                    }
                    return i0.a.o(n6.w0(i10, i6Var), 255);
                }
                if (pc.e(262144)) {
                    f12 = 0.85f;
                } else {
                    f12 = 0.76f;
                }
                return n6.r1(f12, n6.w0(n6.Te, i6Var));
        }
    }
}

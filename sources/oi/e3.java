package oi;

import java.util.ArrayList;
import org.telegram.ui.Cells.h9;
public final class e3 extends h9 {
    public final o3 F0;
    public final q3 G0;

    public e3(q3 q3Var, o3 o3Var) {
        this.G0 = q3Var;
        this.F0 = o3Var;
    }

    @Override
    public final boolean C() {
        q3 q3Var = this.G0;
        CharSequence r10 = q3Var.f21943v3.r();
        if (r10 != null && r10.length() != 0) {
            q3Var.f5(r10);
            return true;
        }
        return true;
    }

    @Override
    public final void D() {
        q3 q3Var = this.G0;
        CharSequence r10 = q3Var.f21943v3.r();
        if (r10 != null && r10.length() > 0) {
            q3Var.f5(r10);
        }
        q3Var.H2();
    }

    @Override
    public final void F() {
        super.F();
        this.F0.v();
    }

    @Override
    public final void H() {
        this.G0.f4();
    }

    @Override
    public final boolean J() {
        if (a0()) {
            return true;
        }
        return this.G0.V4();
    }

    @Override
    public final void K(float f10, float f11) {
        q3 q3Var = this.G0;
        q3Var.A3 = true;
        q3Var.B3 = f10;
        q3Var.C3 = f11;
    }

    @Override
    public final boolean j() {
        boolean z10;
        int size;
        String str;
        int length;
        q3 q3Var = this.G0;
        e3 e3Var = q3Var.f21943v3;
        ArrayList arrayList = q3Var.f21939t3;
        if (!arrayList.isEmpty() && e3Var.x() && e3Var.f30411p0 == 0 && e3Var.f30412q0 == 0 && e3Var.f30413r0 <= 0 && e3Var.f30414s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (y5.p(aVar.f21544b)) {
                str = a6.l(y5.j(aVar.f21544b));
            } else {
                str = "";
            }
            int i7 = !str.isEmpty();
            if (e3Var.f30415t0 == i7) {
                if (i7 == 1) {
                    length = str.length();
                } else {
                    length = y5.z(aVar.f21544b).length();
                }
                if (e3Var.f30416u0 >= length) {
                    z10 = true;
                    return !z10;
                }
            }
        }
        z10 = false;
        return !z10;
    }

    @Override
    public final int o() {
        return this.G0.getPaddingBottom();
    }

    @Override
    public final int p() {
        return this.G0.getPaddingTop();
    }
}

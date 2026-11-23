package oi;

import java.util.ArrayList;
import org.telegram.ui.Cells.i9;
public final class h3 extends i9 {
    public final r3 F0;
    public final t3 G0;

    public h3(t3 t3Var, r3 r3Var) {
        this.G0 = t3Var;
        this.F0 = r3Var;
    }

    @Override
    public final boolean C() {
        t3 t3Var = this.G0;
        CharSequence r10 = t3Var.f22507v3.r();
        if (r10 != null && r10.length() != 0) {
            t3Var.f5(r10);
            return true;
        }
        return true;
    }

    @Override
    public final void D() {
        t3 t3Var = this.G0;
        CharSequence r10 = t3Var.f22507v3.r();
        if (r10 != null && r10.length() > 0) {
            t3Var.f5(r10);
        }
        t3Var.H2();
    }

    @Override
    public final void F() {
        super.F();
        this.F0.y();
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
        t3 t3Var = this.G0;
        t3Var.A3 = true;
        t3Var.B3 = f10;
        t3Var.C3 = f11;
    }

    @Override
    public final boolean j() {
        boolean z10;
        int size;
        String str;
        int length;
        t3 t3Var = this.G0;
        h3 h3Var = t3Var.f22507v3;
        ArrayList arrayList = t3Var.f22503t3;
        if (!arrayList.isEmpty() && h3Var.x() && h3Var.f30923p0 == 0 && h3Var.f30924q0 == 0 && h3Var.f30925r0 <= 0 && h3Var.f30926s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (a6.p(aVar.f22001b)) {
                str = c6.l(a6.j(aVar.f22001b));
            } else {
                str = "";
            }
            int i7 = !str.isEmpty();
            if (h3Var.f30927t0 == i7) {
                if (i7 == 1) {
                    length = str.length();
                } else {
                    length = a6.z(aVar.f22001b).length();
                }
                if (h3Var.f30928u0 >= length) {
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

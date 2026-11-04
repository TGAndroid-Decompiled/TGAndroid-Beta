package mi;

import java.util.ArrayList;
import org.telegram.ui.Cells.h9;
public final class h3 extends h9 {
    public final r3 F0;
    public final t3 G0;

    public h3(t3 t3Var, r3 r3Var) {
        this.G0 = t3Var;
        this.F0 = r3Var;
    }

    @Override
    public final boolean C() {
        t3 t3Var = this.G0;
        CharSequence r5 = t3Var.f19928v3.r();
        if (r5 != null && r5.length() != 0) {
            t3Var.f5(r5);
            return true;
        }
        return true;
    }

    @Override
    public final void D() {
        t3 t3Var = this.G0;
        CharSequence r5 = t3Var.f19928v3.r();
        if (r5 != null && r5.length() > 0) {
            t3Var.f5(r5);
        }
        t3Var.H2();
    }

    @Override
    public final void F() {
        super.F();
        this.F0.a0();
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
        h3 h3Var = t3Var.f19928v3;
        ArrayList arrayList = t3Var.f19924t3;
        if (!arrayList.isEmpty() && h3Var.x() && h3Var.f29352p0 == 0 && h3Var.f29353q0 == 0 && h3Var.f29354r0 <= 0 && h3Var.f29355s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (b6.p(aVar.f19431b)) {
                str = d6.l(b6.j(aVar.f19431b));
            } else {
                str = "";
            }
            int i3 = !str.isEmpty();
            if (h3Var.f29356t0 == i3) {
                if (i3 == 1) {
                    length = str.length();
                } else {
                    length = b6.z(aVar.f19431b).length();
                }
                if (h3Var.f29357u0 >= length) {
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

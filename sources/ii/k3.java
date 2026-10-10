package ii;

import java.util.ArrayList;
import org.telegram.ui.Cells.o9;
public final class k3 extends o9 {
    public final v3 F0;
    public final x3 G0;

    public k3(x3 x3Var, v3 v3Var) {
        this.G0 = x3Var;
        this.F0 = v3Var;
    }

    @Override
    public final boolean C() {
        x3 x3Var = this.G0;
        CharSequence r10 = x3Var.f12820l3.r();
        if (r10 != null && r10.length() != 0) {
            x3Var.c5(r10);
            return true;
        }
        return true;
    }

    @Override
    public final void D() {
        x3 x3Var = this.G0;
        CharSequence r10 = x3Var.f12820l3.r();
        if (r10 != null && r10.length() > 0) {
            x3Var.c5(r10);
        }
        x3Var.F2();
    }

    @Override
    public final void F() {
        super.F();
        this.F0.l();
    }

    @Override
    public final void H() {
        this.G0.d4();
    }

    @Override
    public final boolean J() {
        if (a0()) {
            return true;
        }
        return this.G0.T4();
    }

    @Override
    public final void K(float f7, float f10) {
        x3 x3Var = this.G0;
        x3Var.f12829q3 = true;
        x3Var.f12830r3 = f7;
        x3Var.f12831s3 = f10;
    }

    @Override
    public final boolean j() {
        boolean z10;
        int size;
        String str;
        int length;
        x3 x3Var = this.G0;
        k3 k3Var = x3Var.f12820l3;
        ArrayList arrayList = x3Var.j3;
        if (!arrayList.isEmpty() && k3Var.x() && k3Var.f22613p0 == 0 && k3Var.f22614q0 == 0 && k3Var.f22615r0 <= 0 && k3Var.f22616s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (f6.p(aVar.f12234b)) {
                str = h6.l(f6.k(aVar.f12234b));
            } else {
                str = "";
            }
            int i10 = !str.isEmpty();
            if (k3Var.f22617t0 == i10) {
                if (i10 == 1) {
                    length = str.length();
                } else {
                    length = f6.z(aVar.f12234b).length();
                }
                if (k3Var.f22618u0 >= length) {
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

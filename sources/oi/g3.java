package oi;

import java.util.ArrayList;
import org.telegram.ui.Cells.j9;
public final class g3 extends j9 {
    public final q3 F0;
    public final s3 G0;

    public g3(s3 s3Var, q3 q3Var) {
        this.G0 = s3Var;
        this.F0 = q3Var;
    }

    @Override
    public final boolean C() {
        s3 s3Var = this.G0;
        CharSequence r10 = s3Var.f22377v3.r();
        if (r10 != null && r10.length() != 0) {
            s3Var.f5(r10);
            return true;
        }
        return true;
    }

    @Override
    public final void D() {
        s3 s3Var = this.G0;
        CharSequence r10 = s3Var.f22377v3.r();
        if (r10 != null && r10.length() > 0) {
            s3Var.f5(r10);
        }
        s3Var.H2();
    }

    @Override
    public final void F() {
        super.F();
        this.F0.G();
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
        s3 s3Var = this.G0;
        s3Var.A3 = true;
        s3Var.B3 = f10;
        s3Var.C3 = f11;
    }

    @Override
    public final boolean j() {
        boolean z10;
        int size;
        String str;
        int length;
        s3 s3Var = this.G0;
        g3 g3Var = s3Var.f22377v3;
        ArrayList arrayList = s3Var.f22373t3;
        if (!arrayList.isEmpty() && g3Var.x() && g3Var.f30889p0 == 0 && g3Var.f30890q0 == 0 && g3Var.f30891r0 <= 0 && g3Var.f30892s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (z5.p(aVar.f21901b)) {
                str = b6.l(z5.j(aVar.f21901b));
            } else {
                str = "";
            }
            int i7 = !str.isEmpty();
            if (g3Var.f30893t0 == i7) {
                if (i7 == 1) {
                    length = str.length();
                } else {
                    length = z5.z(aVar.f21901b).length();
                }
                if (g3Var.f30894u0 >= length) {
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

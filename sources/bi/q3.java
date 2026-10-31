package bi;

import java.util.ArrayList;
import org.telegram.ui.Cells.k9;
public final class q3 extends k9 {
    public final b4 F0;
    public final d4 G0;

    public q3(d4 d4Var, b4 b4Var) {
        this.G0 = d4Var;
        this.F0 = b4Var;
    }

    @Override
    public final boolean C() {
        d4 d4Var = this.G0;
        CharSequence r10 = d4Var.f2950u3.r();
        if (r10 != null && r10.length() != 0) {
            d4Var.e5(r10);
            return true;
        }
        return true;
    }

    @Override
    public final void D() {
        d4 d4Var = this.G0;
        CharSequence r10 = d4Var.f2950u3.r();
        if (r10 != null && r10.length() > 0) {
            d4Var.e5(r10);
        }
        d4Var.H2();
    }

    @Override
    public final void F() {
        super.F();
        this.F0.r();
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
    public final void K(float f7, float f10) {
        d4 d4Var = this.G0;
        d4Var.f2959z3 = true;
        d4Var.A3 = f7;
        d4Var.B3 = f10;
    }

    @Override
    public final boolean j() {
        boolean z10;
        int size;
        String str;
        int length;
        d4 d4Var = this.G0;
        q3 q3Var = d4Var.f2950u3;
        ArrayList arrayList = d4Var.f2946s3;
        if (!arrayList.isEmpty() && q3Var.x() && q3Var.f22186p0 == 0 && q3Var.f22187q0 == 0 && q3Var.f22188r0 <= 0 && q3Var.f22189s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (q6.p(aVar.f2818b)) {
                str = s6.l(q6.k(aVar.f2818b));
            } else {
                str = "";
            }
            int i10 = !str.isEmpty();
            if (q3Var.f22190t0 == i10) {
                if (i10 == 1) {
                    length = str.length();
                } else {
                    length = q6.z(aVar.f2818b).length();
                }
                if (q3Var.f22191u0 >= length) {
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

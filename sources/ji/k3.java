package ji;

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
        CharSequence r10 = x3Var.f13642l3.r();
        if (r10 != null && r10.length() != 0) {
            x3Var.c5(r10);
            return true;
        }
        return true;
    }

    @Override
    public final void D() {
        x3 x3Var = this.G0;
        CharSequence r10 = x3Var.f13642l3.r();
        if (r10 != null && r10.length() > 0) {
            x3Var.c5(r10);
        }
        x3Var.F2();
    }

    @Override
    public final void F() {
        super.F();
        this.F0.o();
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
        x3Var.f13651q3 = true;
        x3Var.f13652r3 = f7;
        x3Var.f13653s3 = f10;
    }

    @Override
    public final boolean j() {
        boolean z10;
        int size;
        String str;
        int length;
        x3 x3Var = this.G0;
        k3 k3Var = x3Var.f13642l3;
        ArrayList arrayList = x3Var.f13638j3;
        if (!arrayList.isEmpty() && k3Var.x() && k3Var.f21354p0 == 0 && k3Var.f21355q0 == 0 && k3Var.f21356r0 <= 0 && k3Var.f21357s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (i6.p(aVar.f13107b)) {
                str = k6.l(i6.k(aVar.f13107b));
            } else {
                str = "";
            }
            int i10 = !str.isEmpty();
            if (k3Var.f21358t0 == i10) {
                if (i10 == 1) {
                    length = str.length();
                } else {
                    length = i6.z(aVar.f13107b).length();
                }
                if (k3Var.f21359u0 >= length) {
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

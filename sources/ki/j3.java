package ki;

import java.util.ArrayList;
import org.telegram.ui.Cells.n9;
public final class j3 extends n9 {
    public final u3 F0;
    public final w3 G0;

    public j3(w3 w3Var, u3 u3Var) {
        this.G0 = w3Var;
        this.F0 = u3Var;
    }

    @Override
    public final boolean C() {
        w3 w3Var = this.G0;
        CharSequence r10 = w3Var.f15604l3.r();
        if (r10 != null && r10.length() != 0) {
            w3Var.c5(r10);
            return true;
        }
        return true;
    }

    @Override
    public final void D() {
        w3 w3Var = this.G0;
        CharSequence r10 = w3Var.f15604l3.r();
        if (r10 != null && r10.length() > 0) {
            w3Var.c5(r10);
        }
        w3Var.F2();
    }

    @Override
    public final void F() {
        super.F();
        this.F0.p();
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
        w3 w3Var = this.G0;
        w3Var.f15613q3 = true;
        w3Var.f15614r3 = f7;
        w3Var.f15615s3 = f10;
    }

    @Override
    public final boolean j() {
        boolean z10;
        int size;
        String str;
        int length;
        w3 w3Var = this.G0;
        j3 j3Var = w3Var.f15604l3;
        ArrayList arrayList = w3Var.f15600j3;
        if (!arrayList.isEmpty() && j3Var.x() && j3Var.f22660p0 == 0 && j3Var.f22661q0 == 0 && j3Var.f22662r0 <= 0 && j3Var.f22663s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (c6.p(aVar.f15095b)) {
                str = e6.l(c6.k(aVar.f15095b));
            } else {
                str = "";
            }
            int i10 = !str.isEmpty();
            if (j3Var.f22664t0 == i10) {
                if (i10 == 1) {
                    length = str.length();
                } else {
                    length = c6.z(aVar.f15095b).length();
                }
                if (j3Var.f22665u0 >= length) {
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

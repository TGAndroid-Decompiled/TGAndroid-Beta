package li;

import java.util.ArrayList;
import org.telegram.ui.Cells.s9;
public final class j3 extends s9 {
    public final t3 F0;
    public final v3 G0;

    public j3(v3 v3Var, t3 t3Var) {
        this.G0 = v3Var;
        this.F0 = t3Var;
    }

    @Override
    public final boolean C() {
        v3 v3Var = this.G0;
        CharSequence r6 = v3Var.f17569v3.r();
        if (r6 != null && r6.length() != 0) {
            v3Var.h5(r6);
            return true;
        }
        return true;
    }

    @Override
    public final void D() {
        v3 v3Var = this.G0;
        CharSequence r6 = v3Var.f17569v3.r();
        if (r6 != null && r6.length() > 0) {
            v3Var.h5(r6);
        }
        v3Var.K2();
    }

    @Override
    public final void F() {
        super.F();
        this.F0.n();
    }

    @Override
    public final void H() {
        this.G0.i4();
    }

    @Override
    public final boolean J() {
        if (a0()) {
            return true;
        }
        return this.G0.Y4();
    }

    @Override
    public final void K(float f7, float f10) {
        v3 v3Var = this.G0;
        v3Var.A3 = true;
        v3Var.B3 = f7;
        v3Var.C3 = f10;
    }

    @Override
    public final boolean j() {
        boolean z10;
        int size;
        String str;
        int length;
        v3 v3Var = this.G0;
        j3 j3Var = v3Var.f17569v3;
        ArrayList arrayList = v3Var.f17565t3;
        if (!arrayList.isEmpty() && j3Var.x() && j3Var.f25408p0 == 0 && j3Var.f25409q0 == 0 && j3Var.f25410r0 <= 0 && j3Var.f25411s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (d6.o(aVar.f17054b)) {
                str = f6.l(d6.j(aVar.f17054b));
            } else {
                str = "";
            }
            int i10 = !str.isEmpty();
            if (j3Var.f25412t0 == i10) {
                if (i10 == 1) {
                    length = str.length();
                } else {
                    length = d6.y(aVar.f17054b).length();
                }
                if (j3Var.f25413u0 >= length) {
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

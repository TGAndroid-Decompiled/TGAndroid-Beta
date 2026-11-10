package li;

import java.util.ArrayList;
import org.telegram.ui.Cells.i9;
public final class g3 extends i9 {
    public final r3 F0;
    public final t3 G0;

    public g3(t3 t3Var, r3 r3Var) {
        this.G0 = t3Var;
        this.F0 = r3Var;
    }

    @Override
    public final boolean C() {
        t3 t3Var = this.G0;
        CharSequence r10 = t3Var.f18904u3.r();
        if (r10 != null && r10.length() != 0) {
            t3Var.f5(r10);
            return true;
        }
        return true;
    }

    @Override
    public final void D() {
        t3 t3Var = this.G0;
        CharSequence r10 = t3Var.f18904u3.r();
        if (r10 != null && r10.length() > 0) {
            t3Var.f5(r10);
        }
        t3Var.H2();
    }

    @Override
    public final void F() {
        super.F();
        this.F0.h();
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
        t3Var.f18914z3 = true;
        t3Var.A3 = f10;
        t3Var.B3 = f11;
    }

    @Override
    public final boolean j() {
        boolean z9;
        int size;
        String str;
        int length;
        t3 t3Var = this.G0;
        g3 g3Var = t3Var.f18904u3;
        ArrayList arrayList = t3Var.f18900s3;
        if (!arrayList.isEmpty() && g3Var.x() && g3Var.f29332p0 == 0 && g3Var.f29333q0 == 0 && g3Var.f29334r0 <= 0 && g3Var.f29335s0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (a6.p(aVar.f18395b)) {
                str = c6.l(a6.j(aVar.f18395b));
            } else {
                str = "";
            }
            int i7 = !str.isEmpty();
            if (g3Var.f29336t0 == i7) {
                if (i7 == 1) {
                    length = str.length();
                } else {
                    length = a6.z(aVar.f18395b).length();
                }
                if (g3Var.f29337u0 >= length) {
                    z9 = true;
                    return !z9;
                }
            }
        }
        z9 = false;
        return !z9;
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

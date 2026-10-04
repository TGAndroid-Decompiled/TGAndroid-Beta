package ii;

import java.util.ArrayList;
import org.telegram.ui.Cells.q9;
public final class k3 extends q9 {
    public final v3 K0;
    public final x3 L0;

    public k3(x3 x3Var, v3 v3Var) {
        this.L0 = x3Var;
        this.K0 = v3Var;
    }

    @Override
    public final boolean D() {
        x3 x3Var = this.L0;
        CharSequence s10 = x3Var.f12781u3.s();
        if (s10 != null && s10.length() != 0) {
            x3Var.d5(s10);
            return true;
        }
        return true;
    }

    @Override
    public final void E() {
        x3 x3Var = this.L0;
        CharSequence s10 = x3Var.f12781u3.s();
        if (s10 != null && s10.length() > 0) {
            x3Var.d5(s10);
        }
        x3Var.G2();
    }

    @Override
    public final void G() {
        super.G();
        this.K0.w();
    }

    @Override
    public final void I() {
        this.L0.e4();
    }

    @Override
    public final boolean K() {
        if (b0()) {
            return true;
        }
        return this.L0.U4();
    }

    @Override
    public final void L(float f7, float f10) {
        x3 x3Var = this.L0;
        x3Var.f12790z3 = true;
        x3Var.A3 = f7;
        x3Var.B3 = f10;
    }

    @Override
    public final boolean k() {
        boolean z10;
        int size;
        String str;
        int length;
        x3 x3Var = this.L0;
        k3 k3Var = x3Var.f12781u3;
        ArrayList arrayList = x3Var.f12777s3;
        if (!arrayList.isEmpty() && k3Var.y() && k3Var.f22694u0 == 0 && k3Var.f22695v0 == 0 && k3Var.f22696w0 <= 0 && k3Var.f22697x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (f6.p(aVar.f12186b)) {
                str = h6.l(f6.k(aVar.f12186b));
            } else {
                str = "";
            }
            int i10 = !str.isEmpty();
            if (k3Var.f22698y0 == i10) {
                if (i10 == 1) {
                    length = str.length();
                } else {
                    length = f6.z(aVar.f12186b).length();
                }
                if (k3Var.f22699z0 >= length) {
                    z10 = true;
                    return !z10;
                }
            }
        }
        z10 = false;
        return !z10;
    }

    @Override
    public final int p() {
        return this.L0.getPaddingBottom();
    }

    @Override
    public final int q() {
        return this.L0.getPaddingTop();
    }
}

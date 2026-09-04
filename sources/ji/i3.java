package ji;

import java.util.ArrayList;
import org.telegram.ui.Cells.q9;
public final class i3 extends q9 {
    public final t3 K0;
    public final v3 L0;

    public i3(v3 v3Var, t3 t3Var) {
        this.L0 = v3Var;
        this.K0 = t3Var;
    }

    @Override
    public final boolean D() {
        v3 v3Var = this.L0;
        CharSequence s10 = v3Var.f14259n3.s();
        if (s10 != null && s10.length() != 0) {
            v3Var.a5(s10);
            return true;
        }
        return true;
    }

    @Override
    public final void E() {
        v3 v3Var = this.L0;
        CharSequence s10 = v3Var.f14259n3.s();
        if (s10 != null && s10.length() > 0) {
            v3Var.a5(s10);
        }
        v3Var.D2();
    }

    @Override
    public final void G() {
        super.G();
        this.K0.f();
    }

    @Override
    public final void I() {
        this.L0.b4();
    }

    @Override
    public final boolean K() {
        if (b0()) {
            return true;
        }
        return this.L0.R4();
    }

    @Override
    public final void L(float f7, float f10) {
        v3 v3Var = this.L0;
        v3Var.f14269s3 = true;
        v3Var.f14270t3 = f7;
        v3Var.f14271u3 = f10;
    }

    @Override
    public final boolean k() {
        boolean z10;
        int size;
        String str;
        int length;
        v3 v3Var = this.L0;
        i3 i3Var = v3Var.f14259n3;
        ArrayList arrayList = v3Var.f14256l3;
        if (!arrayList.isEmpty() && i3Var.y() && i3Var.f22500u0 == 0 && i3Var.f22501v0 == 0 && i3Var.f22502w0 <= 0 && i3Var.f22503x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (g6.p(aVar.f13732b)) {
                str = i6.l(g6.k(aVar.f13732b));
            } else {
                str = "";
            }
            int i10 = !str.isEmpty();
            if (i3Var.f22504y0 == i10) {
                if (i10 == 1) {
                    length = str.length();
                } else {
                    length = g6.z(aVar.f13732b).length();
                }
                if (i3Var.f22505z0 >= length) {
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

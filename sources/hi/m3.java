package hi;

import java.util.ArrayList;
import org.telegram.ui.Cells.s9;
public final class m3 extends s9 {
    public final x3 K0;
    public final z3 L0;

    public m3(z3 z3Var, x3 x3Var) {
        this.L0 = z3Var;
        this.K0 = x3Var;
    }

    @Override
    public final boolean D() {
        z3 z3Var = this.L0;
        CharSequence s10 = z3Var.f10011n3.s();
        if (s10 != null && s10.length() != 0) {
            z3Var.a5(s10);
            return true;
        }
        return true;
    }

    @Override
    public final void E() {
        z3 z3Var = this.L0;
        CharSequence s10 = z3Var.f10011n3.s();
        if (s10 != null && s10.length() > 0) {
            z3Var.a5(s10);
        }
        z3Var.D2();
    }

    @Override
    public final void G() {
        super.G();
        this.K0.s();
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
        z3 z3Var = this.L0;
        z3Var.f10021s3 = true;
        z3Var.f10022t3 = f7;
        z3Var.f10023u3 = f10;
    }

    @Override
    public final boolean k() {
        boolean z10;
        int size;
        String str;
        int length;
        z3 z3Var = this.L0;
        m3 m3Var = z3Var.f10011n3;
        ArrayList arrayList = z3Var.f10008l3;
        if (!arrayList.isEmpty() && m3Var.y() && m3Var.f20047u0 == 0 && m3Var.f20048v0 == 0 && m3Var.f20049w0 <= 0 && m3Var.f20050x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (g6.p(aVar.f9421b)) {
                str = i6.l(g6.k(aVar.f9421b));
            } else {
                str = "";
            }
            int i10 = !str.isEmpty();
            if (m3Var.f20051y0 == i10) {
                if (i10 == 1) {
                    length = str.length();
                } else {
                    length = g6.z(aVar.f9421b).length();
                }
                if (m3Var.f20052z0 >= length) {
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

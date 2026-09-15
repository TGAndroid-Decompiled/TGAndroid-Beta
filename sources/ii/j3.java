package ii;

import java.util.ArrayList;
import org.telegram.ui.Cells.q9;
public final class j3 extends q9 {
    public final u3 K0;
    public final w3 L0;

    public j3(w3 w3Var, u3 u3Var) {
        this.L0 = w3Var;
        this.K0 = u3Var;
    }

    @Override
    public final boolean D() {
        w3 w3Var = this.L0;
        CharSequence s10 = w3Var.f11721n3.s();
        if (s10 != null && s10.length() != 0) {
            w3Var.b5(s10);
            return true;
        }
        return true;
    }

    @Override
    public final void E() {
        w3 w3Var = this.L0;
        CharSequence s10 = w3Var.f11721n3.s();
        if (s10 != null && s10.length() > 0) {
            w3Var.b5(s10);
        }
        w3Var.E2();
    }

    @Override
    public final void G() {
        super.G();
        this.K0.l();
    }

    @Override
    public final void I() {
        this.L0.c4();
    }

    @Override
    public final boolean K() {
        if (b0()) {
            return true;
        }
        return this.L0.S4();
    }

    @Override
    public final void L(float f7, float f10) {
        w3 w3Var = this.L0;
        w3Var.f11731s3 = true;
        w3Var.f11732t3 = f7;
        w3Var.f11733u3 = f10;
    }

    @Override
    public final boolean k() {
        boolean z10;
        int size;
        String str;
        int length;
        w3 w3Var = this.L0;
        j3 j3Var = w3Var.f11721n3;
        ArrayList arrayList = w3Var.f11718l3;
        if (!arrayList.isEmpty() && j3Var.y() && j3Var.f20618u0 == 0 && j3Var.f20619v0 == 0 && j3Var.f20620w0 <= 0 && j3Var.f20621x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (d6.p(aVar.f11201b)) {
                str = f6.l(d6.k(aVar.f11201b));
            } else {
                str = "";
            }
            int i10 = !str.isEmpty();
            if (j3Var.f20622y0 == i10) {
                if (i10 == 1) {
                    length = str.length();
                } else {
                    length = d6.z(aVar.f11201b).length();
                }
                if (j3Var.f20623z0 >= length) {
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

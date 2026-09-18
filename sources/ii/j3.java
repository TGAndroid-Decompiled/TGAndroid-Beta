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
        CharSequence s10 = w3Var.f11724n3.s();
        if (s10 != null && s10.length() != 0) {
            w3Var.c5(s10);
            return true;
        }
        return true;
    }

    @Override
    public final void E() {
        w3 w3Var = this.L0;
        CharSequence s10 = w3Var.f11724n3.s();
        if (s10 != null && s10.length() > 0) {
            w3Var.c5(s10);
        }
        w3Var.F2();
    }

    @Override
    public final void G() {
        super.G();
        this.K0.l();
    }

    @Override
    public final void I() {
        this.L0.d4();
    }

    @Override
    public final boolean K() {
        if (b0()) {
            return true;
        }
        return this.L0.T4();
    }

    @Override
    public final void L(float f7, float f10) {
        w3 w3Var = this.L0;
        w3Var.f11734s3 = true;
        w3Var.f11735t3 = f7;
        w3Var.f11736u3 = f10;
    }

    @Override
    public final boolean k() {
        boolean z10;
        int size;
        String str;
        int length;
        w3 w3Var = this.L0;
        j3 j3Var = w3Var.f11724n3;
        ArrayList arrayList = w3Var.f11721l3;
        if (!arrayList.isEmpty() && j3Var.y() && j3Var.f20814u0 == 0 && j3Var.f20815v0 == 0 && j3Var.f20816w0 <= 0 && j3Var.f20817x0 == (size = arrayList.size() - 1)) {
            a aVar = (a) arrayList.get(size);
            if (d6.p(aVar.f11204b)) {
                str = f6.l(d6.k(aVar.f11204b));
            } else {
                str = "";
            }
            int i10 = !str.isEmpty();
            if (j3Var.f20818y0 == i10) {
                if (i10 == 1) {
                    length = str.length();
                } else {
                    length = d6.z(aVar.f11204b).length();
                }
                if (j3Var.f20819z0 >= length) {
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

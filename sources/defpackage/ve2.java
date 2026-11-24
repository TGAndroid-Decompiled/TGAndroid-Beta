package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class ve2 implements bnb {
    public boolean a = false;
    public final if2 b;

    public ve2(if2 if2Var) {
        this.b = if2Var;
    }

    @Override
    public final void a(float f) {
        ArrayList arrayList;
        if2 if2Var = this.b;
        gf2 gf2Var = if2Var.q1;
        if (f == 0.0f && !this.a) {
            if (gf2Var != null && (arrayList = gf2Var.d) != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((hf2) obj).c = if2Var.G1 ? 1 : 0;
                }
            }
            if (!if2Var.I1) {
                for (int i2 = 0; i2 < gf2Var.b(); i2++) {
                    ((hf2) gf2Var.d.get(i2)).getClass();
                }
            }
            this.a = true;
        }
        p09 p09Var = if2Var.y1;
        int i3 = cmb.Ei;
        int v0 = cmb.v0(i3, if2Var.J0);
        if2Var.d2 = v0;
        p09Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
        if2Var.x0(cmb.v0(cmb.Z6, if2Var.J0));
        if (if2Var.I1) {
            for (int i4 = 0; i4 < gf2Var.b(); i4++) {
                ((hf2) gf2Var.d.get(i4)).getClass();
            }
        }
        if (f == 1.0f && this.a) {
            if2Var.I1 = false;
            this.a = false;
        }
        if2Var.T0();
        su suVar = if2Var.S1;
        if (suVar != null) {
            int L = gm.L(0.0f);
            int v02 = cmb.v0(cmb.c6, if2Var.J0);
            int p = on2.p(cmb.v0(i3, if2Var.J0), 76);
            suVar.setBackground(cmb.i0(L, L, L, L, v02, p, p));
        }
        io ioVar = if2Var.T1;
        if (ioVar != null) {
            ioVar.setTextColor(cmb.v0(i3, if2Var.J0));
        }
        int v03 = cmb.v0(cmb.g5, if2Var.J0);
        if2Var.e2 = v03;
        if2Var.s0(v03);
    }

    @Override
    public final void b() {
        this.b.H0();
    }
}

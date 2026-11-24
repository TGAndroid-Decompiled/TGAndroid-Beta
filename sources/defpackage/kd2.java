package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class kd2 implements alb {
    public boolean a = false;
    public final xd2 b;

    public kd2(xd2 xd2Var) {
        this.b = xd2Var;
    }

    @Override
    public final void a(float f) {
        ArrayList arrayList;
        xd2 xd2Var = this.b;
        vd2 vd2Var = xd2Var.q1;
        if (f == 0.0f && !this.a) {
            if (vd2Var != null && (arrayList = vd2Var.d) != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((wd2) obj).c = xd2Var.G1 ? 1 : 0;
                }
            }
            if (!xd2Var.I1) {
                for (int i2 = 0; i2 < vd2Var.b(); i2++) {
                    ((wd2) vd2Var.d.get(i2)).getClass();
                }
            }
            this.a = true;
        }
        oy8 oy8Var = xd2Var.y1;
        int i3 = bkb.Ei;
        int v0 = bkb.v0(i3, xd2Var.J0);
        xd2Var.d2 = v0;
        oy8Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
        xd2Var.x0(bkb.v0(bkb.Z6, xd2Var.J0));
        if (xd2Var.I1) {
            for (int i4 = 0; i4 < vd2Var.b(); i4++) {
                ((wd2) vd2Var.d.get(i4)).getClass();
            }
        }
        if (f == 1.0f && this.a) {
            xd2Var.I1 = false;
            this.a = false;
        }
        xd2Var.T0();
        st stVar = xd2Var.S1;
        if (stVar != null) {
            int L = gl.L(0.0f);
            int v02 = bkb.v0(bkb.c6, xd2Var.J0);
            int o = bm2.o(bkb.v0(i3, xd2Var.J0), 76);
            stVar.setBackground(bkb.i0(L, L, L, L, v02, o, o));
        }
        hn hnVar = xd2Var.T1;
        if (hnVar != null) {
            hnVar.setTextColor(bkb.v0(i3, xd2Var.J0));
        }
        int v03 = bkb.v0(bkb.g5, xd2Var.J0);
        xd2Var.e2 = v03;
        xd2Var.s0(v03);
    }

    @Override
    public final void b() {
        this.b.H0();
    }
}

package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import java.util.ArrayList;
public final class be2 implements zob {
    public boolean a = false;
    public final oe2 b;

    public be2(oe2 oe2Var) {
        this.b = oe2Var;
    }

    @Override
    public final void a(float f) {
        ArrayList arrayList;
        oe2 oe2Var = this.b;
        me2 me2Var = oe2Var.q1;
        if (f == 0.0f && !this.a) {
            if (me2Var != null && (arrayList = me2Var.d) != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    ((ne2) obj).c = oe2Var.G1 ? 1 : 0;
                }
            }
            if (!oe2Var.I1) {
                for (int i2 = 0; i2 < me2Var.b(); i2++) {
                    ((ne2) me2Var.d.get(i2)).getClass();
                }
            }
            this.a = true;
        }
        b29 b29Var = oe2Var.y1;
        int i3 = aob.Fi;
        int v0 = aob.v0(i3, oe2Var.J0);
        oe2Var.d2 = v0;
        b29Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
        oe2Var.y0(aob.v0(aob.a7, oe2Var.J0));
        if (oe2Var.I1) {
            for (int i4 = 0; i4 < me2Var.b(); i4++) {
                ((ne2) me2Var.d.get(i4)).getClass();
            }
        }
        if (f == 1.0f && this.a) {
            oe2Var.I1 = false;
            this.a = false;
        }
        oe2Var.U0();
        tt ttVar = oe2Var.S1;
        if (ttVar != null) {
            int L = hl.L(0.0f);
            int v02 = aob.v0(aob.d6, oe2Var.J0);
            int o = vm2.o(aob.v0(i3, oe2Var.J0), 76);
            ttVar.setBackground(aob.i0(L, L, L, L, v02, o, o));
        }
        in inVar = oe2Var.T1;
        if (inVar != null) {
            inVar.setTextColor(aob.v0(i3, oe2Var.J0));
        }
        int v03 = aob.v0(aob.h5, oe2Var.J0);
        oe2Var.e2 = v03;
        oe2Var.s0(v03);
    }

    @Override
    public final void b() {
        this.b.I0();
    }
}

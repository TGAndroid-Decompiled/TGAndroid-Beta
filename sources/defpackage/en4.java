package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class en4 extends q59 {
    public final ln4 c;

    public en4(ln4 ln4Var) {
        this.c = ln4Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 2) {
            int b = u69Var.b();
            ln4 ln4Var = this.c;
            if (b >= ln4Var.m2 && u69Var.b() <= ln4Var.n2) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.c.j2;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 0;
        }
        ln4 ln4Var = this.c;
        if (i != ln4Var.k2 && i != ln4Var.o2 && i != ln4Var.s2) {
            if (i != ln4Var.l2 && i != ln4Var.p2) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void t(defpackage.u69 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.en4.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        kn4 kn4Var;
        kn4 kn4Var2;
        boolean z;
        ln4 ln4Var = this.c;
        if (i == 0) {
            Context context = ln4Var.getContext();
            if (!(ln4Var.U1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && ln4Var.V1 == null) {
                z = false;
            } else {
                z = true;
            }
            kn4Var = new kn4(ln4Var, context, z, ln4Var.a2, ln4Var.Y1, ln4Var.Z1);
            ln4Var.i2 = kn4Var;
        } else {
            kn4Var = null;
            if (i == 1) {
                ?? njbVar = new njb(ln4Var.getContext());
                anb.h(cmb.Z6, null, njbVar);
                kn4Var2 = njbVar;
            } else if (i == 2) {
                ?? xc5Var = new xc5(ln4Var.getContext(), 1, 0, false);
                anb.h(cmb.c6, null, xc5Var);
                kn4Var2 = xc5Var;
            } else if (i == 3) {
                ?? in4Var = new in4(ln4Var.getContext());
                anb.h(cmb.c6, null, in4Var);
                kn4Var2 = in4Var;
            }
            kn4Var = kn4Var2;
        }
        return new u69(kn4Var);
    }
}

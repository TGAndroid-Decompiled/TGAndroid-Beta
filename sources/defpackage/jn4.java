package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class jn4 extends c79 {
    public final qn4 c;

    public jn4(qn4 qn4Var) {
        this.c = qn4Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 2) {
            int b = f89Var.b();
            qn4 qn4Var = this.c;
            if (b >= qn4Var.m2 && f89Var.b() <= qn4Var.n2) {
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
        qn4 qn4Var = this.c;
        if (i != qn4Var.k2 && i != qn4Var.o2 && i != qn4Var.s2) {
            if (i != qn4Var.l2 && i != qn4Var.p2) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void t(defpackage.f89 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn4.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        pn4 pn4Var;
        pn4 pn4Var2;
        boolean z;
        qn4 qn4Var = this.c;
        if (i == 0) {
            Context context = qn4Var.getContext();
            if (!(qn4Var.U1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && qn4Var.V1 == null) {
                z = false;
            } else {
                z = true;
            }
            pn4Var = new pn4(qn4Var, context, z, qn4Var.a2, qn4Var.Y1, qn4Var.Z1);
            qn4Var.i2 = pn4Var;
        } else {
            pn4Var = null;
            if (i == 1) {
                ?? ilbVar = new ilb(qn4Var.getContext());
                yob.h(aob.a7, null, ilbVar);
                pn4Var2 = ilbVar;
            } else if (i == 2) {
                ?? bd5Var = new bd5(qn4Var.getContext(), 1, 0, false);
                yob.h(aob.d6, null, bd5Var);
                pn4Var2 = bd5Var;
            } else if (i == 3) {
                ?? nn4Var = new nn4(qn4Var.getContext());
                yob.h(aob.d6, null, nn4Var);
                pn4Var2 = nn4Var;
            }
            pn4Var = pn4Var2;
        }
        return new f89(pn4Var);
    }
}

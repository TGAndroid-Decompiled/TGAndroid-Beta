package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.tl.TL_chatlists;
public final class el4 extends n39 {
    public final ll4 c;

    public el4(ll4 ll4Var) {
        this.c = ll4Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 2) {
            int b = s49Var.b();
            ll4 ll4Var = this.c;
            if (b >= ll4Var.m2 && s49Var.b() <= ll4Var.n2) {
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
        ll4 ll4Var = this.c;
        if (i != ll4Var.k2 && i != ll4Var.o2 && i != ll4Var.s2) {
            if (i != ll4Var.l2 && i != ll4Var.p2) {
                return 2;
            }
            return 3;
        }
        return 1;
    }

    @Override
    public final void t(defpackage.s49 r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.el4.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        kl4 kl4Var;
        kl4 kl4Var2;
        boolean z;
        ll4 ll4Var = this.c;
        if (i == 0) {
            Context context = ll4Var.getContext();
            if (!(ll4Var.U1 instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) && ll4Var.V1 == null) {
                z = false;
            } else {
                z = true;
            }
            kl4Var = new kl4(ll4Var, context, z, ll4Var.a2, ll4Var.Y1, ll4Var.Z1);
            ll4Var.i2 = kl4Var;
        } else {
            kl4Var = null;
            if (i == 1) {
                ?? mhbVar = new mhb(ll4Var.getContext());
                zkb.h(bkb.Z6, null, mhbVar);
                kl4Var2 = mhbVar;
            } else if (i == 2) {
                ?? za5Var = new za5(ll4Var.getContext(), 1, 0, false);
                zkb.h(bkb.c6, null, za5Var);
                kl4Var2 = za5Var;
            } else if (i == 3) {
                ?? il4Var = new il4(ll4Var.getContext());
                zkb.h(bkb.c6, null, il4Var);
                kl4Var2 = il4Var;
            }
            kl4Var = kl4Var2;
        }
        return new s49(kl4Var);
    }
}

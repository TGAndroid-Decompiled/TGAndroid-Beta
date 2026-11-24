package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class od5 extends q59 {
    public final Context c;
    public final bu9 d;
    public md5 e;
    public int f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final pd5 x;

    public od5(pd5 pd5Var, Context context) {
        this.x = pd5Var;
        this.c = context;
        bu9 bu9Var = new bu9(true);
        this.d = bu9Var;
        bu9Var.a = new nd5(this);
    }

    @Override
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ij6) {
            ((ij6) view).a();
        }
    }

    @Override
    public final boolean D(u69 u69Var) {
        View view = u69Var.a;
        if ((!(view instanceof ij6) || !this.x.Z1.contains(Long.valueOf(((ij6) view).getUserId()))) && u69Var.f == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == this.r) {
            return 3;
        }
        if (i != this.w && i != this.s) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void f() {
        this.f = 1;
        bu9 bu9Var = this.d;
        int size = bu9Var.g.size();
        if (size != 0) {
            int i = this.f;
            this.s = i;
            this.f = size + 1 + i;
        } else {
            this.s = -1;
        }
        int size2 = bu9Var.e.size();
        if (size2 != 0) {
            int i2 = this.f;
            this.w = i2;
            this.f = size2 + 1 + i2;
        } else {
            this.w = -1;
        }
        int i3 = this.f;
        this.f = i3 + 1;
        this.r = i3;
        super.f();
    }

    @Override
    public final void t(defpackage.u69 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od5.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        ij6 ij6Var;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    ij6Var = new View(context);
                } else {
                    ?? view = new View(context);
                    view.setLayoutParams(new g69(-1, gm.L(56.0f)));
                    ij6Var = view;
                }
            } else {
                ?? l55Var = new l55(context, null);
                anb.h(cmb.Zg, null, l55Var);
                l55Var.setTextColor(cmb.Gh);
                ij6Var = l55Var;
            }
        } else {
            ij6 ij6Var2 = new ij6(this.c, 2, 2, false, null);
            ij6Var2.setCustomRightImage(2131232198);
            ij6Var2.setNameColor(cmb.w0(null, cmb.dh, false));
            int w0 = cmb.w0(null, cmb.bh, false);
            int w02 = cmb.w0(null, cmb.fh, false);
            ij6Var2.P = true;
            ij6Var2.I = w0;
            ij6Var2.J = w02;
            ij6Var2.setDividerColor(cmb.jh);
            ij6Var = ij6Var2;
        }
        return new u69(ij6Var);
    }
}

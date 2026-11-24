package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class qb5 extends n39 {
    public final Context c;
    public final zr9 d;
    public ob5 e;
    public int f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final rb5 x;

    public qb5(rb5 rb5Var, Context context) {
        this.x = rb5Var;
        this.c = context;
        zr9 zr9Var = new zr9(true);
        this.d = zr9Var;
        zr9Var.a = new pb5(this);
    }

    @Override
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof gh6) {
            ((gh6) view).a();
        }
    }

    @Override
    public final boolean D(s49 s49Var) {
        View view = s49Var.a;
        if ((!(view instanceof gh6) || !this.x.Z1.contains(Long.valueOf(((gh6) view).getUserId()))) && s49Var.f == 0) {
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
        zr9 zr9Var = this.d;
        int size = zr9Var.g.size();
        if (size != 0) {
            int i = this.f;
            this.s = i;
            this.f = size + 1 + i;
        } else {
            this.s = -1;
        }
        int size2 = zr9Var.e.size();
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
    public final void t(defpackage.s49 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb5.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        gh6 gh6Var;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    gh6Var = new View(context);
                } else {
                    ?? view = new View(context);
                    view.setLayoutParams(new e49(-1, gl.L(56.0f)));
                    gh6Var = view;
                }
            } else {
                ?? l35Var = new l35(context, null);
                zkb.h(bkb.Zg, null, l35Var);
                l35Var.setTextColor(bkb.Gh);
                gh6Var = l35Var;
            }
        } else {
            gh6 gh6Var2 = new gh6(this.c, 2, 2, false, null);
            gh6Var2.setCustomRightImage(2131232197);
            gh6Var2.setNameColor(bkb.w0(null, bkb.dh, false));
            int w0 = bkb.w0(null, bkb.bh, false);
            int w02 = bkb.w0(null, bkb.fh, false);
            gh6Var2.P = true;
            gh6Var2.I = w0;
            gh6Var2.J = w02;
            gh6Var2.setDividerColor(bkb.jh);
            gh6Var = gh6Var2;
        }
        return new s49(gh6Var);
    }
}

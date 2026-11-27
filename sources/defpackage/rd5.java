package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
public final class rd5 extends c79 {
    public final Context c;
    public final sv9 d;
    public pd5 e;
    public int f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public int w;
    public final sd5 x;

    public rd5(sd5 sd5Var, Context context) {
        this.x = sd5Var;
        this.c = context;
        sv9 sv9Var = new sv9(true);
        this.d = sv9Var;
        sv9Var.a = new qd5(this);
    }

    @Override
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof lj6) {
            ((lj6) view).a();
        }
    }

    @Override
    public final boolean D(f89 f89Var) {
        View view = f89Var.a;
        if ((!(view instanceof lj6) || !this.x.Z1.contains(Long.valueOf(((lj6) view).getUserId()))) && f89Var.f == 0) {
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
        sv9 sv9Var = this.d;
        int size = sv9Var.g.size();
        if (size != 0) {
            int i = this.f;
            this.s = i;
            this.f = size + 1 + i;
        } else {
            this.s = -1;
        }
        int size2 = sv9Var.e.size();
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
    public final void t(defpackage.f89 r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rd5.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        lj6 lj6Var;
        if (i != 0) {
            Context context = this.c;
            if (i != 1) {
                if (i != 2) {
                    lj6Var = new View(context);
                } else {
                    ?? view = new View(context);
                    view.setLayoutParams(new r79(-1, hl.L(56.0f)));
                    lj6Var = view;
                }
            } else {
                ?? p55Var = new p55(context, null);
                yob.h(aob.ah, null, p55Var);
                p55Var.setTextColor(aob.Hh);
                lj6Var = p55Var;
            }
        } else {
            lj6 lj6Var2 = new lj6(this.c, 2, 2, false, null);
            lj6Var2.setCustomRightImage(2131232197);
            lj6Var2.setNameColor(aob.w0(null, aob.eh, false));
            int w0 = aob.w0(null, aob.ch, false);
            int w02 = aob.w0(null, aob.gh, false);
            lj6Var2.P = true;
            lj6Var2.I = w0;
            lj6Var2.J = w02;
            lj6Var2.setDividerColor(aob.kh);
            lj6Var = lj6Var2;
        }
        return new f89(lj6Var);
    }
}

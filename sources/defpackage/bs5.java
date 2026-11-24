package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public final class bs5 extends q59 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final es5 n;

    public bs5(es5 es5Var, Context context) {
        this.n = es5Var;
        this.c = context;
    }

    @Override
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof jt5) {
            ((jt5) view).a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f != 2) {
            return true;
        }
        return false;
    }

    public final void E(String str) {
        try {
            Timer timer = this.f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            f();
            return;
        }
        Timer timer2 = new Timer();
        this.f = timer2;
        timer2.schedule(new yy2(this, str, (byte) 1), 200L, 300L);
    }

    @Override
    public final int b() {
        if (this.h) {
            return this.d.size();
        }
        return this.n.w.size() + 2;
    }

    @Override
    public final int d(int i) {
        if (!this.h) {
            if (i == 0) {
                return 1;
            }
            if (i == 1) {
                return 2;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void f() {
        int i;
        super.f();
        es5 es5Var = this.n;
        bs5 bs5Var = es5Var.s;
        if (bs5Var != null && !es5Var.y) {
            int b = bs5Var.b();
            a1b a1bVar = es5Var.r;
            if (b == 2) {
                i = 0;
            } else {
                i = 4;
            }
            a1bVar.setVisibility(i);
        }
    }

    @Override
    public final void t(u69 u69Var, int i) {
        yv2 yv2Var;
        CharSequence charSequence;
        if (u69Var.f == 0) {
            jt5 jt5Var = (jt5) u69Var.a;
            boolean z = this.h;
            es5 es5Var = this.n;
            if (z) {
                yv2Var = (yv2) this.d.get(i);
                charSequence = (CharSequence) this.e.get(i);
            } else {
                yv2Var = (yv2) es5Var.w.get(i - 2);
                charSequence = null;
            }
            jt5Var.a(yv2Var, charSequence);
            boolean containsKey = es5Var.E.containsKey(yv2Var.b);
            jh2 jh2Var = jt5Var.e;
            if (jh2Var != null) {
                jh2Var.a(containsKey, false);
            }
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        xib xibVar;
        Context context = this.c;
        if (i == 1) {
            xib xibVar2 = new xib(context);
            int i2 = cmb.F6;
            xibVar2.g(i2, i2);
            xibVar2.u(jb6.M0(2131745161, null), "", false, 2131232371, false);
            xibVar = xibVar2;
        } else if (i == 2) {
            xibVar = new bba(context, (hg9) null);
        } else {
            xibVar = new jt5(context, true);
        }
        return new u69(xibVar);
    }
}

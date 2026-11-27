package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public final class es5 extends c79 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final hs5 n;

    public es5(hs5 hs5Var, Context context) {
        this.n = hs5Var;
        this.c = context;
    }

    @Override
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof mt5) {
            ((mt5) view).a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f != 2) {
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
            cc4.g(e, true);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            f();
            return;
        }
        Timer timer2 = new Timer();
        this.f = timer2;
        timer2.schedule(new iy2(this, str, (byte) 1), 200L, 300L);
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
        hs5 hs5Var = this.n;
        es5 es5Var = hs5Var.s;
        if (es5Var != null && !hs5Var.y) {
            int b = es5Var.b();
            z2b z2bVar = hs5Var.r;
            if (b == 2) {
                i = 0;
            } else {
                i = 4;
            }
            z2bVar.setVisibility(i);
        }
    }

    @Override
    public final void t(f89 f89Var, int i) {
        iv2 iv2Var;
        CharSequence charSequence;
        if (f89Var.f == 0) {
            mt5 mt5Var = (mt5) f89Var.a;
            boolean z = this.h;
            hs5 hs5Var = this.n;
            if (z) {
                iv2Var = (iv2) this.d.get(i);
                charSequence = (CharSequence) this.e.get(i);
            } else {
                iv2Var = (iv2) hs5Var.w.get(i - 2);
                charSequence = null;
            }
            mt5Var.a(iv2Var, charSequence);
            boolean containsKey = hs5Var.E.containsKey(iv2Var.b);
            og2 og2Var = mt5Var.e;
            if (og2Var != null) {
                og2Var.a(containsKey, false);
            }
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        skb skbVar;
        Context context = this.c;
        if (i == 1) {
            skb skbVar2 = new skb(context);
            int i2 = aob.G6;
            skbVar2.g(i2, i2);
            skbVar2.u(ob6.M0(2131745155, null), "", false, 2131232370, false);
            skbVar = skbVar2;
        } else if (i == 2) {
            skbVar = new sca(context, (uh9) null);
        } else {
            skbVar = new mt5(context, true);
        }
        return new f89(skbVar);
    }
}

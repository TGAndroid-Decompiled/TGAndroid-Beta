package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
public final class dq5 extends n39 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final gq5 n;

    public dq5(gq5 gq5Var, Context context) {
        this.n = gq5Var;
        this.c = context;
    }

    @Override
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof kr5) {
            ((kr5) view).a.getImageReceiver().c();
        }
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f != 2) {
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
            fa4.g(e, true);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            f();
            return;
        }
        Timer timer2 = new Timer();
        this.f = timer2;
        timer2.schedule(new ox2(this, str, (byte) 1), 200L, 300L);
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
        gq5 gq5Var = this.n;
        dq5 dq5Var = gq5Var.s;
        if (dq5Var != null && !gq5Var.y) {
            int b = dq5Var.b();
            zya zyaVar = gq5Var.r;
            if (b == 2) {
                i = 0;
            } else {
                i = 4;
            }
            zyaVar.setVisibility(i);
        }
    }

    @Override
    public final void t(s49 s49Var, int i) {
        nu2 nu2Var;
        CharSequence charSequence;
        if (s49Var.f == 0) {
            kr5 kr5Var = (kr5) s49Var.a;
            boolean z = this.h;
            gq5 gq5Var = this.n;
            if (z) {
                nu2Var = (nu2) this.d.get(i);
                charSequence = (CharSequence) this.e.get(i);
            } else {
                nu2Var = (nu2) gq5Var.w.get(i - 2);
                charSequence = null;
            }
            kr5Var.a(nu2Var, charSequence);
            boolean containsKey = gq5Var.E.containsKey(nu2Var.b);
            wf2 wf2Var = kr5Var.e;
            if (wf2Var != null) {
                wf2Var.a(containsKey, false);
            }
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        wgb wgbVar;
        Context context = this.c;
        if (i == 1) {
            wgb wgbVar2 = new wgb(context);
            int i2 = bkb.F6;
            wgbVar2.g(i2, i2);
            wgbVar2.u(k96.M0(2131745235, null), "", false, 2131232370, false);
            wgbVar = wgbVar2;
        } else if (i == 2) {
            wgbVar = new b9a(context, (de9) null);
        } else {
            wgbVar = new kr5(context, true);
        }
        return new s49(wgbVar);
    }
}

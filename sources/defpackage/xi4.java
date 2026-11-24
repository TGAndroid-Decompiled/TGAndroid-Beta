package defpackage;

import android.view.View;
public final class xi4 {
    public final gk4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public xi4(gk4 gk4Var) {
        this.a = gk4Var;
    }

    public final void a() {
        if (this.f) {
            boolean z = this.b;
            gk4 gk4Var = this.a;
            if (!z && !this.c && !this.d && this.e) {
                View view = gk4Var.a;
                wk0 wk0Var = gk4Var.l;
                view.removeOnLayoutChangeListener(wk0Var);
                gk4Var.a.addOnLayoutChangeListener(wk0Var);
                gk4Var.c();
                this.g = System.currentTimeMillis();
                return;
            }
            ek4 ek4Var = gk4Var.b;
            if (!ek4Var.e()) {
                return;
            }
            ek4Var.G = true;
            ek4Var.x.start();
            ek4Var.D.setEmpty();
        }
    }
}

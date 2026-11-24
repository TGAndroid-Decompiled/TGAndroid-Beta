package defpackage;

import android.view.View;
public final class bl4 {
    public final hm4 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    public boolean f;
    public long g;

    public bl4(hm4 hm4Var) {
        this.a = hm4Var;
    }

    public final void a() {
        if (this.f) {
            boolean z = this.b;
            hm4 hm4Var = this.a;
            if (!z && !this.c && !this.d && this.e) {
                View view = hm4Var.a;
                wl0 wl0Var = hm4Var.l;
                view.removeOnLayoutChangeListener(wl0Var);
                hm4Var.a.addOnLayoutChangeListener(wl0Var);
                hm4Var.c();
                this.g = System.currentTimeMillis();
                return;
            }
            fm4 fm4Var = hm4Var.b;
            if (!fm4Var.e()) {
                return;
            }
            fm4Var.G = true;
            fm4Var.x.start();
            fm4Var.D.setEmpty();
        }
    }
}

package k;

import java.util.ArrayList;
import m.k3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f18131a;
    public boolean f18132b;
    public int f18133c;
    public final Object d;

    public i(ac.d dVar) {
        this.f18131a = 0;
        this.d = dVar;
        this.f18132b = false;
        this.f18133c = 0;
    }

    @Override
    public void a() {
        switch (this.f18131a) {
            case 1:
                this.f18132b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f18131a) {
            case 0:
                if (!this.f18132b) {
                    this.f18132b = true;
                    m0 m0Var = (m0) ((ac.d) this.d).f1018e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((k3) this.d).f20129a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f18131a) {
            case 0:
                int i7 = this.f18133c + 1;
                this.f18133c = i7;
                ac.d dVar = (ac.d) this.d;
                if (i7 == ((ArrayList) dVar.f1017c).size()) {
                    m0 m0Var = (m0) dVar.f1018e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f18133c = 0;
                    this.f18132b = false;
                    dVar.f1016b = false;
                    return;
                }
                return;
            default:
                if (!this.f18132b) {
                    ((k3) this.d).f20129a.setVisibility(this.f18133c);
                    return;
                }
                return;
        }
    }

    public i(k3 k3Var, int i7) {
        this.f18131a = 1;
        this.d = k3Var;
        this.f18133c = i7;
        this.f18132b = false;
    }
}

package k;

import java.util.ArrayList;
import m.k3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f18094a;
    public boolean f18095b;
    public int f18096c;
    public final Object d;

    public i(ac.d dVar) {
        this.f18094a = 0;
        this.d = dVar;
        this.f18095b = false;
        this.f18096c = 0;
    }

    @Override
    public void a() {
        switch (this.f18094a) {
            case 1:
                this.f18095b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f18094a) {
            case 0:
                if (!this.f18095b) {
                    this.f18095b = true;
                    m0 m0Var = (m0) ((ac.d) this.d).f1018e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((k3) this.d).f20095a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f18094a) {
            case 0:
                int i7 = this.f18096c + 1;
                this.f18096c = i7;
                ac.d dVar = (ac.d) this.d;
                if (i7 == ((ArrayList) dVar.f1017c).size()) {
                    m0 m0Var = (m0) dVar.f1018e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f18096c = 0;
                    this.f18095b = false;
                    dVar.f1016b = false;
                    return;
                }
                return;
            default:
                if (!this.f18095b) {
                    ((k3) this.d).f20095a.setVisibility(this.f18096c);
                    return;
                }
                return;
        }
    }

    public i(k3 k3Var, int i7) {
        this.f18094a = 1;
        this.d = k3Var;
        this.f18096c = i7;
        this.f18095b = false;
    }
}

package k;

import java.util.ArrayList;
import m.k3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f17705a;
    public boolean f17706b;
    public int f17707c;
    public final Object d;

    public i(ac.d dVar) {
        this.f17705a = 0;
        this.d = dVar;
        this.f17706b = false;
        this.f17707c = 0;
    }

    @Override
    public void a() {
        switch (this.f17705a) {
            case 1:
                this.f17706b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f17705a) {
            case 0:
                if (!this.f17706b) {
                    this.f17706b = true;
                    m0 m0Var = (m0) ((ac.d) this.d).f1019e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((k3) this.d).f19734a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f17705a) {
            case 0:
                int i7 = this.f17707c + 1;
                this.f17707c = i7;
                ac.d dVar = (ac.d) this.d;
                if (i7 == ((ArrayList) dVar.f1018c).size()) {
                    m0 m0Var = (m0) dVar.f1019e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f17707c = 0;
                    this.f17706b = false;
                    dVar.f1017b = false;
                    return;
                }
                return;
            default:
                if (!this.f17706b) {
                    ((k3) this.d).f19734a.setVisibility(this.f17707c);
                    return;
                }
                return;
        }
    }

    public i(k3 k3Var, int i7) {
        this.f17705a = 1;
        this.d = k3Var;
        this.f17707c = i7;
        this.f17706b = false;
    }
}

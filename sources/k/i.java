package k;

import java.util.ArrayList;
import m.l3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f14424a;
    public boolean f14425b;
    public int f14426c;
    public final Object d;

    public i(bc.d dVar) {
        this.f14424a = 0;
        this.d = dVar;
        this.f14425b = false;
        this.f14426c = 0;
    }

    @Override
    public void a() {
        switch (this.f14424a) {
            case 1:
                this.f14425b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f14424a) {
            case 0:
                if (!this.f14425b) {
                    this.f14425b = true;
                    m0 m0Var = (m0) ((bc.d) this.d).f2580e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((l3) this.d).f15569a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f14424a) {
            case 0:
                int i10 = this.f14426c + 1;
                this.f14426c = i10;
                bc.d dVar = (bc.d) this.d;
                if (i10 == ((ArrayList) dVar.f2579c).size()) {
                    m0 m0Var = (m0) dVar.f2580e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f14426c = 0;
                    this.f14425b = false;
                    dVar.f2578b = false;
                    return;
                }
                return;
            default:
                if (!this.f14425b) {
                    ((l3) this.d).f15569a.setVisibility(this.f14426c);
                    return;
                }
                return;
        }
    }

    public i(l3 l3Var, int i10) {
        this.f14424a = 1;
        this.d = l3Var;
        this.f14426c = i10;
        this.f14425b = false;
    }
}

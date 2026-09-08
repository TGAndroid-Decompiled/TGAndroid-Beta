package k;

import java.util.ArrayList;
import m.l3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f14450a;
    public boolean f14451b;
    public int f14452c;
    public final Object d;

    public i(bc.d dVar) {
        this.f14450a = 0;
        this.d = dVar;
        this.f14451b = false;
        this.f14452c = 0;
    }

    @Override
    public void a() {
        switch (this.f14450a) {
            case 1:
                this.f14451b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f14450a) {
            case 0:
                if (!this.f14451b) {
                    this.f14451b = true;
                    m0 m0Var = (m0) ((bc.d) this.d).f2607e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((l3) this.d).f15596a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f14450a) {
            case 0:
                int i10 = this.f14452c + 1;
                this.f14452c = i10;
                bc.d dVar = (bc.d) this.d;
                if (i10 == ((ArrayList) dVar.f2606c).size()) {
                    m0 m0Var = (m0) dVar.f2607e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f14452c = 0;
                    this.f14451b = false;
                    dVar.f2605b = false;
                    return;
                }
                return;
            default:
                if (!this.f14451b) {
                    ((l3) this.d).f15596a.setVisibility(this.f14452c);
                    return;
                }
                return;
        }
    }

    public i(l3 l3Var, int i10) {
        this.f14450a = 1;
        this.d = l3Var;
        this.f14452c = i10;
        this.f14451b = false;
    }
}

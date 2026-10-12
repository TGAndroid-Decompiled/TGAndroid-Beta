package k;

import java.util.ArrayList;
import m.n3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f14313a;
    public boolean f14314b;
    public int f14315c;
    public final Object d;

    public i(bc.d dVar) {
        this.f14313a = 0;
        this.d = dVar;
        this.f14314b = false;
        this.f14315c = 0;
    }

    @Override
    public void a() {
        switch (this.f14313a) {
            case 1:
                this.f14314b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f14313a) {
            case 0:
                if (!this.f14314b) {
                    this.f14314b = true;
                    m0 m0Var = (m0) ((bc.d) this.d).f3851e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((n3) this.d).f15497a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f14313a) {
            case 0:
                int i10 = this.f14315c + 1;
                this.f14315c = i10;
                bc.d dVar = (bc.d) this.d;
                if (i10 == ((ArrayList) dVar.f3850c).size()) {
                    m0 m0Var = (m0) dVar.f3851e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f14315c = 0;
                    this.f14314b = false;
                    dVar.f3849b = false;
                    return;
                }
                return;
            default:
                if (!this.f14314b) {
                    ((n3) this.d).f15497a.setVisibility(this.f14315c);
                    return;
                }
                return;
        }
    }

    public i(n3 n3Var, int i10) {
        this.f14313a = 1;
        this.d = n3Var;
        this.f14315c = i10;
        this.f14314b = false;
    }
}

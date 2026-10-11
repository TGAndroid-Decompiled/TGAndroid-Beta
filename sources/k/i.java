package k;

import java.util.ArrayList;
import m.m3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f14315a;
    public boolean f14316b;
    public int f14317c;
    public final Object d;

    public i(bc.d dVar) {
        this.f14315a = 0;
        this.d = dVar;
        this.f14316b = false;
        this.f14317c = 0;
    }

    @Override
    public void a() {
        switch (this.f14315a) {
            case 1:
                this.f14316b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f14315a) {
            case 0:
                if (!this.f14316b) {
                    this.f14316b = true;
                    m0 m0Var = (m0) ((bc.d) this.d).f3852e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((m3) this.d).f15796a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f14315a) {
            case 0:
                int i10 = this.f14317c + 1;
                this.f14317c = i10;
                bc.d dVar = (bc.d) this.d;
                if (i10 == ((ArrayList) dVar.f3851c).size()) {
                    m0 m0Var = (m0) dVar.f3852e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f14317c = 0;
                    this.f14316b = false;
                    dVar.f3850b = false;
                    return;
                }
                return;
            default:
                if (!this.f14316b) {
                    ((m3) this.d).f15796a.setVisibility(this.f14317c);
                    return;
                }
                return;
        }
    }

    public i(m3 m3Var, int i10) {
        this.f14315a = 1;
        this.d = m3Var;
        this.f14317c = i10;
        this.f14316b = false;
    }
}

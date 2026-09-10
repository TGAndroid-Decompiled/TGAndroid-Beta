package k;

import java.util.ArrayList;
import m.n3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f11988a;
    public boolean f11989b;
    public int f11990c;
    public final Object d;

    public i(bc.d dVar) {
        this.f11988a = 0;
        this.d = dVar;
        this.f11989b = false;
        this.f11990c = 0;
    }

    @Override
    public void a() {
        switch (this.f11988a) {
            case 1:
                this.f11989b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f11988a) {
            case 0:
                if (!this.f11989b) {
                    this.f11989b = true;
                    m0 m0Var = (m0) ((bc.d) this.d).e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((n3) this.d).f13078a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f11988a) {
            case 0:
                int i10 = this.f11990c + 1;
                this.f11990c = i10;
                bc.d dVar = (bc.d) this.d;
                if (i10 == ((ArrayList) dVar.f2191c).size()) {
                    m0 m0Var = (m0) dVar.e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f11990c = 0;
                    this.f11989b = false;
                    dVar.f2190b = false;
                    return;
                }
                return;
            default:
                if (!this.f11989b) {
                    ((n3) this.d).f13078a.setVisibility(this.f11990c);
                    return;
                }
                return;
        }
    }

    public i(n3 n3Var, int i10) {
        this.f11988a = 1;
        this.d = n3Var;
        this.f11990c = i10;
        this.f11989b = false;
    }
}

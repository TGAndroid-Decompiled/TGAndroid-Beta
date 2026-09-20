package k;

import java.util.ArrayList;
import m.l3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f13146a;
    public boolean f13147b;
    public int f13148c;
    public final Object d;

    public i(bc.d dVar) {
        this.f13146a = 0;
        this.d = dVar;
        this.f13147b = false;
        this.f13148c = 0;
    }

    @Override
    public void a() {
        switch (this.f13146a) {
            case 1:
                this.f13147b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f13146a) {
            case 0:
                if (!this.f13147b) {
                    this.f13147b = true;
                    m0 m0Var = (m0) ((bc.d) this.d).e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((l3) this.d).f14444a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f13146a) {
            case 0:
                int i10 = this.f13148c + 1;
                this.f13148c = i10;
                bc.d dVar = (bc.d) this.d;
                if (i10 == ((ArrayList) dVar.f3498c).size()) {
                    m0 m0Var = (m0) dVar.e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f13148c = 0;
                    this.f13147b = false;
                    dVar.f3497b = false;
                    return;
                }
                return;
            default:
                if (!this.f13147b) {
                    ((l3) this.d).f14444a.setVisibility(this.f13148c);
                    return;
                }
                return;
        }
    }

    public i(l3 l3Var, int i10) {
        this.f13146a = 1;
        this.d = l3Var;
        this.f13148c = i10;
        this.f13147b = false;
    }
}

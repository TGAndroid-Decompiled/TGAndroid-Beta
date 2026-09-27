package k;

import java.util.ArrayList;
import m.l3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f13137a;
    public boolean f13138b;
    public int f13139c;
    public final Object d;

    public i(bc.d dVar) {
        this.f13137a = 0;
        this.d = dVar;
        this.f13138b = false;
        this.f13139c = 0;
    }

    @Override
    public void a() {
        switch (this.f13137a) {
            case 1:
                this.f13138b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f13137a) {
            case 0:
                if (!this.f13138b) {
                    this.f13138b = true;
                    m0 m0Var = (m0) ((bc.d) this.d).e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((l3) this.d).f14491a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f13137a) {
            case 0:
                int i10 = this.f13139c + 1;
                this.f13139c = i10;
                bc.d dVar = (bc.d) this.d;
                if (i10 == ((ArrayList) dVar.f3492c).size()) {
                    m0 m0Var = (m0) dVar.e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f13139c = 0;
                    this.f13138b = false;
                    dVar.f3491b = false;
                    return;
                }
                return;
            default:
                if (!this.f13138b) {
                    ((l3) this.d).f14491a.setVisibility(this.f13139c);
                    return;
                }
                return;
        }
    }

    public i(l3 l3Var, int i10) {
        this.f13137a = 1;
        this.d = l3Var;
        this.f13139c = i10;
        this.f13138b = false;
    }
}

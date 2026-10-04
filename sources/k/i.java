package k;

import java.util.ArrayList;
import m.l3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f14279a;
    public boolean f14280b;
    public int f14281c;
    public final Object d;

    public i(bc.d dVar) {
        this.f14279a = 0;
        this.d = dVar;
        this.f14280b = false;
        this.f14281c = 0;
    }

    @Override
    public void a() {
        switch (this.f14279a) {
            case 1:
                this.f14280b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f14279a) {
            case 0:
                if (!this.f14280b) {
                    this.f14280b = true;
                    m0 m0Var = (m0) ((bc.d) this.d).f3773e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((l3) this.d).f15784a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f14279a) {
            case 0:
                int i10 = this.f14281c + 1;
                this.f14281c = i10;
                bc.d dVar = (bc.d) this.d;
                if (i10 == ((ArrayList) dVar.f3772c).size()) {
                    m0 m0Var = (m0) dVar.f3773e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f14281c = 0;
                    this.f14280b = false;
                    dVar.f3771b = false;
                    return;
                }
                return;
            default:
                if (!this.f14280b) {
                    ((l3) this.d).f15784a.setVisibility(this.f14281c);
                    return;
                }
                return;
        }
    }

    public i(l3 l3Var, int i10) {
        this.f14279a = 1;
        this.d = l3Var;
        this.f14281c = i10;
        this.f14280b = false;
    }
}

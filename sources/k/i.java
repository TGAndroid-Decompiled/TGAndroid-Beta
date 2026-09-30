package k;

import java.util.ArrayList;
import m.l3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f13149a;
    public boolean f13150b;
    public int f13151c;
    public final Object d;

    public i(bc.d dVar) {
        this.f13149a = 0;
        this.d = dVar;
        this.f13150b = false;
        this.f13151c = 0;
    }

    @Override
    public void a() {
        switch (this.f13149a) {
            case 1:
                this.f13150b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f13149a) {
            case 0:
                if (!this.f13150b) {
                    this.f13150b = true;
                    m0 m0Var = (m0) ((bc.d) this.d).e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((l3) this.d).f14480a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f13149a) {
            case 0:
                int i10 = this.f13151c + 1;
                this.f13151c = i10;
                bc.d dVar = (bc.d) this.d;
                if (i10 == ((ArrayList) dVar.f3497c).size()) {
                    m0 m0Var = (m0) dVar.e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f13151c = 0;
                    this.f13150b = false;
                    dVar.f3496b = false;
                    return;
                }
                return;
            default:
                if (!this.f13150b) {
                    ((l3) this.d).f14480a.setVisibility(this.f13151c);
                    return;
                }
                return;
        }
    }

    public i(l3 l3Var, int i10) {
        this.f13149a = 1;
        this.d = l3Var;
        this.f13151c = i10;
        this.f13150b = false;
    }
}

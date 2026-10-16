package k;

import java.util.ArrayList;
import m.p3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f13760a;
    public boolean f13761b;
    public int f13762c;
    public final Object d;

    public i(cc.d dVar) {
        this.f13760a = 0;
        this.d = dVar;
        this.f13761b = false;
        this.f13762c = 0;
    }

    @Override
    public void a() {
        switch (this.f13760a) {
            case 1:
                this.f13761b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f13760a) {
            case 0:
                if (!this.f13761b) {
                    this.f13761b = true;
                    m0 m0Var = (m0) ((cc.d) this.d).e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((p3) this.d).f14924a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f13760a) {
            case 0:
                int i10 = this.f13762c + 1;
                this.f13762c = i10;
                cc.d dVar = (cc.d) this.d;
                if (i10 == ((ArrayList) dVar.f4721c).size()) {
                    m0 m0Var = (m0) dVar.e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f13762c = 0;
                    this.f13761b = false;
                    dVar.f4720b = false;
                    return;
                }
                return;
            default:
                if (!this.f13761b) {
                    ((p3) this.d).f14924a.setVisibility(this.f13762c);
                    return;
                }
                return;
        }
    }

    public i(p3 p3Var, int i10) {
        this.f13760a = 1;
        this.d = p3Var;
        this.f13762c = i10;
        this.f13761b = false;
    }
}

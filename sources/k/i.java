package k;

import java.util.ArrayList;
import m.o3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f14559a;
    public boolean f14560b;
    public int f14561c;
    public final Object d;

    public i(cc.d dVar) {
        this.f14559a = 0;
        this.d = dVar;
        this.f14560b = false;
        this.f14561c = 0;
    }

    @Override
    public void a() {
        switch (this.f14559a) {
            case 1:
                this.f14560b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f14559a) {
            case 0:
                if (!this.f14560b) {
                    this.f14560b = true;
                    m0 m0Var = (m0) ((cc.d) this.d).e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((o3) this.d).f16275a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f14559a) {
            case 0:
                int i10 = this.f14561c + 1;
                this.f14561c = i10;
                cc.d dVar = (cc.d) this.d;
                if (i10 == ((ArrayList) dVar.f5089c).size()) {
                    m0 m0Var = (m0) dVar.e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f14561c = 0;
                    this.f14560b = false;
                    dVar.f5088b = false;
                    return;
                }
                return;
            default:
                if (!this.f14560b) {
                    ((o3) this.d).f16275a.setVisibility(this.f14561c);
                    return;
                }
                return;
        }
    }

    public i(o3 o3Var, int i10) {
        this.f14559a = 1;
        this.d = o3Var;
        this.f14561c = i10;
        this.f14560b = false;
    }
}

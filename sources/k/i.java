package k;

import java.util.ArrayList;
import m.n3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f16039a;
    public boolean f16040b;
    public int f16041c;
    public final Object d;

    public i(dc.d dVar) {
        this.f16039a = 0;
        this.d = dVar;
        this.f16040b = false;
        this.f16041c = 0;
    }

    @Override
    public void a() {
        switch (this.f16039a) {
            case 1:
                this.f16040b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f16039a) {
            case 0:
                if (!this.f16040b) {
                    this.f16040b = true;
                    m0 m0Var = (m0) ((dc.d) this.d).e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((n3) this.d).f17785a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f16039a) {
            case 0:
                int i10 = this.f16041c + 1;
                this.f16041c = i10;
                dc.d dVar = (dc.d) this.d;
                if (i10 == ((ArrayList) dVar.f8317c).size()) {
                    m0 m0Var = (m0) dVar.e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f16041c = 0;
                    this.f16040b = false;
                    dVar.f8316b = false;
                    return;
                }
                return;
            default:
                if (!this.f16040b) {
                    ((n3) this.d).f17785a.setVisibility(this.f16041c);
                    return;
                }
                return;
        }
    }

    public i(n3 n3Var, int i10) {
        this.f16039a = 1;
        this.d = n3Var;
        this.f16041c = i10;
        this.f16040b = false;
    }
}

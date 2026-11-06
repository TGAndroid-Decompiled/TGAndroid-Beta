package k;

import java.util.ArrayList;
import m.m3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f17144a;
    public boolean f17145b;
    public int f17146c;
    public final Object d;

    public i(ac.d dVar) {
        this.f17144a = 0;
        this.d = dVar;
        this.f17145b = false;
        this.f17146c = 0;
    }

    @Override
    public void a() {
        switch (this.f17144a) {
            case 1:
                this.f17145b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f17144a) {
            case 0:
                if (!this.f17145b) {
                    this.f17145b = true;
                    m0 m0Var = (m0) ((ac.d) this.d).f1021e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((m3) this.d).f19159a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f17144a) {
            case 0:
                int i7 = this.f17146c + 1;
                this.f17146c = i7;
                ac.d dVar = (ac.d) this.d;
                if (i7 == ((ArrayList) dVar.f1020c).size()) {
                    m0 m0Var = (m0) dVar.f1021e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f17146c = 0;
                    this.f17145b = false;
                    dVar.f1019b = false;
                    return;
                }
                return;
            default:
                if (!this.f17145b) {
                    ((m3) this.d).f19159a.setVisibility(this.f17146c);
                    return;
                }
                return;
        }
    }

    public i(m3 m3Var, int i7) {
        this.f17144a = 1;
        this.d = m3Var;
        this.f17146c = i7;
        this.f17145b = false;
    }
}

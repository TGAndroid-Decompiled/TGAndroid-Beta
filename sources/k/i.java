package k;

import java.util.ArrayList;
import m.m3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f17147a;
    public boolean f17148b;
    public int f17149c;
    public final Object d;

    public i(ac.d dVar) {
        this.f17147a = 0;
        this.d = dVar;
        this.f17148b = false;
        this.f17149c = 0;
    }

    @Override
    public void a() {
        switch (this.f17147a) {
            case 1:
                this.f17148b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f17147a) {
            case 0:
                if (!this.f17148b) {
                    this.f17148b = true;
                    m0 m0Var = (m0) ((ac.d) this.d).f1021e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((m3) this.d).f19162a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f17147a) {
            case 0:
                int i7 = this.f17149c + 1;
                this.f17149c = i7;
                ac.d dVar = (ac.d) this.d;
                if (i7 == ((ArrayList) dVar.f1020c).size()) {
                    m0 m0Var = (m0) dVar.f1021e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f17149c = 0;
                    this.f17148b = false;
                    dVar.f1019b = false;
                    return;
                }
                return;
            default:
                if (!this.f17148b) {
                    ((m3) this.d).f19162a.setVisibility(this.f17149c);
                    return;
                }
                return;
        }
    }

    public i(m3 m3Var, int i7) {
        this.f17147a = 1;
        this.d = m3Var;
        this.f17149c = i7;
        this.f17148b = false;
    }
}

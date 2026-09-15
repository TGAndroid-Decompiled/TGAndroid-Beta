package k;

import java.util.ArrayList;
import m.m3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f13142a;
    public boolean f13143b;
    public int f13144c;
    public final Object d;

    public i(bc.d dVar) {
        this.f13142a = 0;
        this.d = dVar;
        this.f13143b = false;
        this.f13144c = 0;
    }

    @Override
    public void a() {
        switch (this.f13142a) {
            case 1:
                this.f13143b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f13142a) {
            case 0:
                if (!this.f13143b) {
                    this.f13143b = true;
                    m0 m0Var = (m0) ((bc.d) this.d).e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((m3) this.d).f14233a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f13142a) {
            case 0:
                int i10 = this.f13144c + 1;
                this.f13144c = i10;
                bc.d dVar = (bc.d) this.d;
                if (i10 == ((ArrayList) dVar.f3493c).size()) {
                    m0 m0Var = (m0) dVar.e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f13144c = 0;
                    this.f13143b = false;
                    dVar.f3492b = false;
                    return;
                }
                return;
            default:
                if (!this.f13143b) {
                    ((m3) this.d).f14233a.setVisibility(this.f13144c);
                    return;
                }
                return;
        }
    }

    public i(m3 m3Var, int i10) {
        this.f13142a = 1;
        this.d = m3Var;
        this.f13144c = i10;
        this.f13143b = false;
    }
}

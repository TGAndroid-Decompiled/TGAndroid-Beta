package k;

import java.util.ArrayList;
import m.m3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f14316a;
    public boolean f14317b;
    public int f14318c;
    public final Object d;

    public i(bc.d dVar) {
        this.f14316a = 0;
        this.d = dVar;
        this.f14317b = false;
        this.f14318c = 0;
    }

    @Override
    public void a() {
        switch (this.f14316a) {
            case 1:
                this.f14317b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f14316a) {
            case 0:
                if (!this.f14317b) {
                    this.f14317b = true;
                    m0 m0Var = (m0) ((bc.d) this.d).f3852e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((m3) this.d).f15739a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f14316a) {
            case 0:
                int i10 = this.f14318c + 1;
                this.f14318c = i10;
                bc.d dVar = (bc.d) this.d;
                if (i10 == ((ArrayList) dVar.f3851c).size()) {
                    m0 m0Var = (m0) dVar.f3852e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f14318c = 0;
                    this.f14317b = false;
                    dVar.f3850b = false;
                    return;
                }
                return;
            default:
                if (!this.f14317b) {
                    ((m3) this.d).f15739a.setVisibility(this.f14318c);
                    return;
                }
                return;
        }
    }

    public i(m3 m3Var, int i10) {
        this.f14316a = 1;
        this.d = m3Var;
        this.f14318c = i10;
        this.f14317b = false;
    }
}

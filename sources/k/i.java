package k;

import java.util.ArrayList;
import m.o3;
import r0.n0;
import r0.o0;
public final class i extends o0 {
    public final int f9540a;
    public boolean f9541b;
    public int f9542c;
    public final Object d;

    public i(j jVar) {
        this.f9540a = 0;
        this.d = jVar;
        this.f9541b = false;
        this.f9542c = 0;
    }

    @Override
    public void a() {
        switch (this.f9540a) {
            case 1:
                this.f9541b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f9540a) {
            case 0:
                if (!this.f9541b) {
                    this.f9541b = true;
                    n0 n0Var = (n0) ((j) this.d).e;
                    if (n0Var != null) {
                        n0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((o3) this.d).f13582a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f9540a) {
            case 0:
                int i10 = this.f9542c + 1;
                this.f9542c = i10;
                j jVar = (j) this.d;
                if (i10 == ((ArrayList) jVar.f9545c).size()) {
                    n0 n0Var = (n0) jVar.e;
                    if (n0Var != null) {
                        n0Var.c();
                    }
                    this.f9542c = 0;
                    this.f9541b = false;
                    jVar.f9544b = false;
                    return;
                }
                return;
            default:
                if (!this.f9541b) {
                    ((o3) this.d).f13582a.setVisibility(this.f9542c);
                    return;
                }
                return;
        }
    }

    public i(o3 o3Var, int i10) {
        this.f9540a = 1;
        this.d = o3Var;
        this.f9542c = i10;
        this.f9541b = false;
    }
}

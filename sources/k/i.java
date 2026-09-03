package k;

import java.util.ArrayList;
import m.o3;
import r0.n0;
import r0.o0;
public final class i extends o0 {
    public final int f9521a;
    public boolean f9522b;
    public int f9523c;
    public final Object d;

    public i(j jVar) {
        this.f9521a = 0;
        this.d = jVar;
        this.f9522b = false;
        this.f9523c = 0;
    }

    @Override
    public void a() {
        switch (this.f9521a) {
            case 1:
                this.f9522b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f9521a) {
            case 0:
                if (!this.f9522b) {
                    this.f9522b = true;
                    n0 n0Var = (n0) ((j) this.d).e;
                    if (n0Var != null) {
                        n0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((o3) this.d).f13566a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f9521a) {
            case 0:
                int i10 = this.f9523c + 1;
                this.f9523c = i10;
                j jVar = (j) this.d;
                if (i10 == ((ArrayList) jVar.f9526c).size()) {
                    n0 n0Var = (n0) jVar.e;
                    if (n0Var != null) {
                        n0Var.c();
                    }
                    this.f9523c = 0;
                    this.f9522b = false;
                    jVar.f9525b = false;
                    return;
                }
                return;
            default:
                if (!this.f9522b) {
                    ((o3) this.d).f13566a.setVisibility(this.f9523c);
                    return;
                }
                return;
        }
    }

    public i(o3 o3Var, int i10) {
        this.f9521a = 1;
        this.d = o3Var;
        this.f9523c = i10;
        this.f9522b = false;
    }
}

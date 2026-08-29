package k;

import java.util.ArrayList;
import m.o3;
import r0.n0;
import r0.o0;
public final class i extends o0 {
    public final int f13236a;
    public boolean f13237b;
    public int f13238c;
    public final Object d;

    public i(j jVar) {
        this.f13236a = 0;
        this.d = jVar;
        this.f13237b = false;
        this.f13238c = 0;
    }

    @Override
    public void a() {
        switch (this.f13236a) {
            case 1:
                this.f13237b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f13236a) {
            case 0:
                if (!this.f13237b) {
                    this.f13237b = true;
                    n0 n0Var = (n0) ((j) this.d).f13242e;
                    if (n0Var != null) {
                        n0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((o3) this.d).f16625a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f13236a) {
            case 0:
                int i10 = this.f13238c + 1;
                this.f13238c = i10;
                j jVar = (j) this.d;
                if (i10 == ((ArrayList) jVar.f13241c).size()) {
                    n0 n0Var = (n0) jVar.f13242e;
                    if (n0Var != null) {
                        n0Var.c();
                    }
                    this.f13238c = 0;
                    this.f13237b = false;
                    jVar.f13240b = false;
                    return;
                }
                return;
            default:
                if (!this.f13237b) {
                    ((o3) this.d).f16625a.setVisibility(this.f13238c);
                    return;
                }
                return;
        }
    }

    public i(o3 o3Var, int i10) {
        this.f13236a = 1;
        this.d = o3Var;
        this.f13238c = i10;
        this.f13237b = false;
    }
}

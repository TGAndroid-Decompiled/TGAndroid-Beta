package k;

import java.util.ArrayList;
import m.n3;
import r0.n0;
import r0.o0;
public final class i extends o0 {
    public final int f10238a;
    public boolean f10239b;
    public int f10240c;
    public final Object d;

    public i(j jVar) {
        this.f10238a = 0;
        this.d = jVar;
        this.f10239b = false;
        this.f10240c = 0;
    }

    @Override
    public void a() {
        switch (this.f10238a) {
            case 1:
                this.f10239b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f10238a) {
            case 0:
                if (!this.f10239b) {
                    this.f10239b = true;
                    n0 n0Var = (n0) ((j) this.d).f10244e;
                    if (n0Var != null) {
                        n0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((n3) this.d).f13264a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f10238a) {
            case 0:
                int i10 = this.f10240c + 1;
                this.f10240c = i10;
                j jVar = (j) this.d;
                if (i10 == ((ArrayList) jVar.f10243c).size()) {
                    n0 n0Var = (n0) jVar.f10244e;
                    if (n0Var != null) {
                        n0Var.c();
                    }
                    this.f10240c = 0;
                    this.f10239b = false;
                    jVar.f10242b = false;
                    return;
                }
                return;
            default:
                if (!this.f10239b) {
                    ((n3) this.d).f13264a.setVisibility(this.f10240c);
                    return;
                }
                return;
        }
    }

    public i(n3 n3Var, int i10) {
        this.f10238a = 1;
        this.d = n3Var;
        this.f10240c = i10;
        this.f10239b = false;
    }
}

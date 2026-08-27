package k;

import java.util.ArrayList;
import m.p3;
import r0.n0;
import r0.o0;

public final class i extends o0 {

    public final int f14248a;

    public boolean f14249b;

    public int f14250c;
    public final Object d;

    public i(j jVar) {
        this.f14248a = 0;
        this.d = jVar;
        this.f14249b = false;
        this.f14250c = 0;
    }

    @Override
    public void a() {
        switch (this.f14248a) {
            case 1:
                this.f14249b = true;
                break;
        }
    }

    @Override
    public final void b() {
        switch (this.f14248a) {
            case 0:
                if (!this.f14249b) {
                    this.f14249b = true;
                    n0 n0Var = (n0) ((j) this.d).f14254e;
                    if (n0Var != null) {
                        n0Var.b();
                    }
                    break;
                }
                break;
            default:
                ((p3) this.d).f17412a.setVisibility(0);
                break;
        }
    }

    @Override
    public final void c() {
        switch (this.f14248a) {
            case 0:
                int i10 = this.f14250c + 1;
                this.f14250c = i10;
                j jVar = (j) this.d;
                if (i10 == ((ArrayList) jVar.f14253c).size()) {
                    n0 n0Var = (n0) jVar.f14254e;
                    if (n0Var != null) {
                        n0Var.c();
                    }
                    this.f14250c = 0;
                    this.f14249b = false;
                    jVar.f14252b = false;
                }
                break;
            default:
                if (!this.f14249b) {
                    ((p3) this.d).f17412a.setVisibility(this.f14250c);
                }
                break;
        }
    }

    public i(p3 p3Var, int i10) {
        this.f14248a = 1;
        this.d = p3Var;
        this.f14250c = i10;
        this.f14249b = false;
    }
}

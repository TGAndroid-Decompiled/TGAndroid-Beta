package k;

import java.util.ArrayList;
import m.k3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f16426a;
    public boolean f16427b;
    public int f16428c;
    public final Object d;

    public i(j jVar) {
        this.f16426a = 0;
        this.d = jVar;
        this.f16427b = false;
        this.f16428c = 0;
    }

    @Override
    public void a() {
        switch (this.f16426a) {
            case 1:
                this.f16427b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f16426a) {
            case 0:
                if (!this.f16427b) {
                    this.f16427b = true;
                    m0 m0Var = (m0) ((j) this.d).f16432e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((k3) this.d).f18622a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f16426a) {
            case 0:
                int i3 = this.f16428c + 1;
                this.f16428c = i3;
                j jVar = (j) this.d;
                if (i3 == ((ArrayList) jVar.f16431c).size()) {
                    m0 m0Var = (m0) jVar.f16432e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f16428c = 0;
                    this.f16427b = false;
                    jVar.f16430b = false;
                    return;
                }
                return;
            default:
                if (!this.f16427b) {
                    ((k3) this.d).f18622a.setVisibility(this.f16428c);
                    return;
                }
                return;
        }
    }

    public i(k3 k3Var, int i3) {
        this.f16426a = 1;
        this.d = k3Var;
        this.f16428c = i3;
        this.f16427b = false;
    }
}

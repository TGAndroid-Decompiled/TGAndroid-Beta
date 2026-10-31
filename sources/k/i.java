package k;

import java.util.ArrayList;
import m.l3;
import r0.l0;
import r0.m0;
public final class i extends m0 {
    public final int f10511a;
    public boolean f10512b;
    public int f10513c;
    public final Object d;

    public i(j jVar) {
        this.f10511a = 0;
        this.d = jVar;
        this.f10512b = false;
        this.f10513c = 0;
    }

    @Override
    public void a() {
        switch (this.f10511a) {
            case 1:
                this.f10512b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f10511a) {
            case 0:
                if (!this.f10512b) {
                    this.f10512b = true;
                    l0 l0Var = (l0) ((j) this.d).e;
                    if (l0Var != null) {
                        l0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((l3) this.d).f12458a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f10511a) {
            case 0:
                int i10 = this.f10513c + 1;
                this.f10513c = i10;
                j jVar = (j) this.d;
                if (i10 == ((ArrayList) jVar.f10516c).size()) {
                    l0 l0Var = (l0) jVar.e;
                    if (l0Var != null) {
                        l0Var.c();
                    }
                    this.f10513c = 0;
                    this.f10512b = false;
                    jVar.f10515b = false;
                    return;
                }
                return;
            default:
                if (!this.f10512b) {
                    ((l3) this.d).f12458a.setVisibility(this.f10513c);
                    return;
                }
                return;
        }
    }

    public i(l3 l3Var, int i10) {
        this.f10511a = 1;
        this.d = l3Var;
        this.f10513c = i10;
        this.f10512b = false;
    }
}

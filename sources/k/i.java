package k;

import java.util.ArrayList;
import m.l3;
import r0.l0;
import r0.m0;
public final class i extends m0 {
    public final int f10512a;
    public boolean f10513b;
    public int f10514c;
    public final Object d;

    public i(j jVar) {
        this.f10512a = 0;
        this.d = jVar;
        this.f10513b = false;
        this.f10514c = 0;
    }

    @Override
    public void a() {
        switch (this.f10512a) {
            case 1:
                this.f10513b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f10512a) {
            case 0:
                if (!this.f10513b) {
                    this.f10513b = true;
                    l0 l0Var = (l0) ((j) this.d).e;
                    if (l0Var != null) {
                        l0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((l3) this.d).f12459a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f10512a) {
            case 0:
                int i10 = this.f10514c + 1;
                this.f10514c = i10;
                j jVar = (j) this.d;
                if (i10 == ((ArrayList) jVar.f10517c).size()) {
                    l0 l0Var = (l0) jVar.e;
                    if (l0Var != null) {
                        l0Var.c();
                    }
                    this.f10514c = 0;
                    this.f10513b = false;
                    jVar.f10516b = false;
                    return;
                }
                return;
            default:
                if (!this.f10513b) {
                    ((l3) this.d).f12459a.setVisibility(this.f10514c);
                    return;
                }
                return;
        }
    }

    public i(l3 l3Var, int i10) {
        this.f10512a = 1;
        this.d = l3Var;
        this.f10514c = i10;
        this.f10513b = false;
    }
}

package k;

import java.util.ArrayList;
import m.m3;
import r0.n0;
import r0.o0;
public final class i extends o0 {
    public final int f13757a;
    public boolean f13758b;
    public int f13759c;
    public final Object d;

    public i(cc.d dVar) {
        this.f13757a = 0;
        this.d = dVar;
        this.f13758b = false;
        this.f13759c = 0;
    }

    @Override
    public void a() {
        switch (this.f13757a) {
            case 1:
                this.f13758b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f13757a) {
            case 0:
                if (!this.f13758b) {
                    this.f13758b = true;
                    n0 n0Var = (n0) ((cc.d) this.d).e;
                    if (n0Var != null) {
                        n0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((m3) this.d).f15164a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f13757a) {
            case 0:
                int i10 = this.f13759c + 1;
                this.f13759c = i10;
                cc.d dVar = (cc.d) this.d;
                if (i10 == ((ArrayList) dVar.f4718c).size()) {
                    n0 n0Var = (n0) dVar.e;
                    if (n0Var != null) {
                        n0Var.c();
                    }
                    this.f13759c = 0;
                    this.f13758b = false;
                    dVar.f4717b = false;
                    return;
                }
                return;
            default:
                if (!this.f13758b) {
                    ((m3) this.d).f15164a.setVisibility(this.f13759c);
                    return;
                }
                return;
        }
    }

    public i(m3 m3Var, int i10) {
        this.f13757a = 1;
        this.d = m3Var;
        this.f13759c = i10;
        this.f13758b = false;
    }
}

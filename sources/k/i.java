package k;

import java.util.ArrayList;
import m.p3;
import r0.n0;
import r0.o0;
public final class i extends o0 {
    public final int f14431a;
    public boolean f14432b;
    public int f14433c;
    public final Object d;

    public i(jb.d dVar) {
        this.f14431a = 0;
        this.d = dVar;
        this.f14432b = false;
        this.f14433c = 0;
    }

    @Override
    public void a() {
        switch (this.f14431a) {
            case 1:
                this.f14432b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f14431a) {
            case 0:
                if (!this.f14432b) {
                    this.f14432b = true;
                    n0 n0Var = (n0) ((jb.d) this.d).f14294e;
                    if (n0Var != null) {
                        n0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((p3) this.d).f17037a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f14431a) {
            case 0:
                int i9 = this.f14433c + 1;
                this.f14433c = i9;
                jb.d dVar = (jb.d) this.d;
                if (i9 == ((ArrayList) dVar.f14293c).size()) {
                    n0 n0Var = (n0) dVar.f14294e;
                    if (n0Var != null) {
                        n0Var.c();
                    }
                    this.f14433c = 0;
                    this.f14432b = false;
                    dVar.f14292b = false;
                    return;
                }
                return;
            default:
                if (!this.f14432b) {
                    ((p3) this.d).f17037a.setVisibility(this.f14433c);
                    return;
                }
                return;
        }
    }

    public i(p3 p3Var, int i9) {
        this.f14431a = 1;
        this.d = p3Var;
        this.f14433c = i9;
        this.f14432b = false;
    }
}

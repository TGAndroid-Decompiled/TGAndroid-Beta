package k;

import java.util.ArrayList;
import m.k3;
import r0.m0;
import r0.n0;
public final class i extends n0 {
    public final int f18100a;
    public boolean f18101b;
    public int f18102c;
    public final Object d;

    public i(ac.d dVar) {
        this.f18100a = 0;
        this.d = dVar;
        this.f18101b = false;
        this.f18102c = 0;
    }

    @Override
    public void a() {
        switch (this.f18100a) {
            case 1:
                this.f18101b = true;
                return;
            default:
                return;
        }
    }

    @Override
    public final void b() {
        switch (this.f18100a) {
            case 0:
                if (!this.f18101b) {
                    this.f18101b = true;
                    m0 m0Var = (m0) ((ac.d) this.d).f1018e;
                    if (m0Var != null) {
                        m0Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((k3) this.d).f20101a.setVisibility(0);
                return;
        }
    }

    @Override
    public final void c() {
        switch (this.f18100a) {
            case 0:
                int i7 = this.f18102c + 1;
                this.f18102c = i7;
                ac.d dVar = (ac.d) this.d;
                if (i7 == ((ArrayList) dVar.f1017c).size()) {
                    m0 m0Var = (m0) dVar.f1018e;
                    if (m0Var != null) {
                        m0Var.c();
                    }
                    this.f18102c = 0;
                    this.f18101b = false;
                    dVar.f1016b = false;
                    return;
                }
                return;
            default:
                if (!this.f18101b) {
                    ((k3) this.d).f20101a.setVisibility(this.f18102c);
                    return;
                }
                return;
        }
    }

    public i(k3 k3Var, int i7) {
        this.f18100a = 1;
        this.d = k3Var;
        this.f18102c = i7;
        this.f18101b = false;
    }
}

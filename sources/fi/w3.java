package fi;

import android.content.Context;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.up0;
public final class w3 extends r41 {
    public final int f13029m3 = 4;
    public final Object f13030n3;

    public w3(o41 o41Var, o41 o41Var2, org.telegram.ui.Components.d dVar, n41 n41Var, n41 n41Var2) {
        super(o41Var2, dVar, n41Var, n41Var2);
        this.f13030n3 = o41Var;
    }

    @Override
    public boolean E0(float f10) {
        int i7;
        switch (this.f13029m3) {
            case 1:
                ci ciVar = ((mi) this.f13030n3).f38656b;
                int L = org.telegram.messenger.g0.L(30.0f) + ciVar.Y3[0];
                if (!ciVar.f32591a2) {
                    i7 = org.telegram.messenger.g0.f22561m;
                } else {
                    i7 = 0;
                }
                if (f10 < L + i7) {
                    return false;
                }
                return true;
            default:
                return super.E0(f10);
        }
    }

    @Override
    public void F1() {
        switch (this.f13029m3) {
            case 1:
                mi miVar = (mi) this.f13030n3;
                miVar.f38656b.M1(miVar, 0);
                return;
            default:
                return;
        }
    }

    @Override
    public void K1() {
        switch (this.f13029m3) {
            case 0:
                org.telegram.messenger.g0.d0(((n9) this.f13030n3).f11672b, new ai.i(this, 22));
                return;
            default:
                return;
        }
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f13029m3) {
            case 0:
                return 0;
            default:
                return super.V0(i7);
        }
    }

    @Override
    public void l0(int i7) {
        org.telegram.ui.web.h hVar;
        switch (this.f13029m3) {
            case 3:
                if (!canScrollVertically(1) && (hVar = ((org.telegram.ui.web.j) this.f13030n3).D) != null && hVar.h) {
                    hVar.d();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f13029m3) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                mi miVar = (mi) this.f13030n3;
                miVar.f38656b.M1(miVar, 0);
                return;
            case 2:
                super.onLayout(z9, i7, i10, i11, i12);
                ((o41) this.f13030n3).f36520c = -1;
                return;
            case 3:
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
            case 4:
                super.onLayout(z9, i7, i10, i11, i12);
                ((up0) this.f13030n3).p();
                return;
        }
    }

    public w3(n9 n9Var, Context context, int i7, u3 u3Var, di.r4 r4Var, di.b bVar) {
        super(context, i7, 0, false, u3Var, r4Var, null, bVar, -1, 0);
        this.f13030n3 = n9Var;
    }

    public w3(org.telegram.ui.web.j jVar, Context context, int i7, hi.u1 u1Var, org.telegram.ui.web.a aVar, g5 g5Var) {
        super(context, i7, 0, false, u1Var, aVar, null, g5Var);
        this.f13030n3 = jVar;
    }

    public w3(mi miVar, Context context, int i7, org.telegram.ui.Components.d dVar, gi giVar, gi giVar2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, 0, false, dVar, giVar, giVar2, h6Var);
        this.f13030n3 = miVar;
    }

    public w3(Context context, int i7, zh.p0 p0Var, zh.u1 u1Var, zh.u1 u1Var2, org.telegram.ui.ActionBar.h6 h6Var, up0 up0Var) {
        super(context, i7, 0, false, p0Var, u1Var, u1Var2, h6Var, 3, 1);
        this.f13030n3 = up0Var;
    }
}

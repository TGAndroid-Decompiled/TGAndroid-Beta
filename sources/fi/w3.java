package fi;

import android.content.Context;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hi;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.up0;
public final class w3 extends p41 {
    public final int f13027m3 = 4;
    public final Object f13028n3;

    public w3(m41 m41Var, m41 m41Var2, org.telegram.ui.Components.d dVar, l41 l41Var, l41 l41Var2) {
        super(m41Var2, dVar, l41Var, l41Var2);
        this.f13028n3 = m41Var;
    }

    @Override
    public boolean E0(float f10) {
        int i7;
        switch (this.f13027m3) {
            case 1:
                di diVar = ((ni) this.f13028n3).f38948b;
                int L = org.telegram.messenger.g0.L(30.0f) + diVar.V3[0];
                if (!diVar.X1) {
                    i7 = org.telegram.messenger.g0.f22531m;
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
        switch (this.f13027m3) {
            case 1:
                ni niVar = (ni) this.f13028n3;
                niVar.f38948b.M1(niVar, 0);
                return;
            default:
                return;
        }
    }

    @Override
    public void K1() {
        switch (this.f13027m3) {
            case 0:
                org.telegram.messenger.g0.d0(((o9) this.f13028n3).f11667b, new ai.i(this, 22));
                return;
            default:
                return;
        }
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f13027m3) {
            case 0:
                return 0;
            default:
                return super.V0(i7);
        }
    }

    @Override
    public void l0(int i7) {
        org.telegram.ui.web.h hVar;
        switch (this.f13027m3) {
            case 3:
                if (!canScrollVertically(1) && (hVar = ((org.telegram.ui.web.j) this.f13028n3).D) != null && hVar.h) {
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
        switch (this.f13027m3) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                ni niVar = (ni) this.f13028n3;
                niVar.f38948b.M1(niVar, 0);
                return;
            case 2:
                super.onLayout(z9, i7, i10, i11, i12);
                ((m41) this.f13028n3).f35846c = -1;
                return;
            case 3:
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
            case 4:
                super.onLayout(z9, i7, i10, i11, i12);
                ((up0) this.f13028n3).p();
                return;
        }
    }

    public w3(o9 o9Var, Context context, int i7, u3 u3Var, di.q4 q4Var, di.b bVar) {
        super(context, i7, 0, false, u3Var, q4Var, null, bVar, -1, 0);
        this.f13028n3 = o9Var;
    }

    public w3(org.telegram.ui.web.j jVar, Context context, int i7, hi.u1 u1Var, org.telegram.ui.web.a aVar, g5 g5Var) {
        super(context, i7, 0, false, u1Var, aVar, null, g5Var);
        this.f13028n3 = jVar;
    }

    public w3(ni niVar, Context context, int i7, org.telegram.ui.Components.d dVar, hi hiVar, hi hiVar2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, 0, false, dVar, hiVar, hiVar2, f6Var);
        this.f13028n3 = niVar;
    }

    public w3(Context context, int i7, zh.q0 q0Var, zh.v1 v1Var, zh.v1 v1Var2, org.telegram.ui.ActionBar.f6 f6Var, up0 up0Var) {
        super(context, i7, 0, false, q0Var, v1Var, v1Var2, f6Var, 3, 1);
        this.f13028n3 = up0Var;
    }
}

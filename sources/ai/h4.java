package ai;

import android.content.Context;
import ei.y8;
import gi.o9;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.g41;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.h41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.ni;
import org.telegram.ui.Components.vp0;
public final class h4 extends l41 {
    public final int f678n3 = 0;
    public final Object f679o3;

    public h4(h41 h41Var, h41 h41Var2, org.telegram.ui.Components.e eVar, g41 g41Var, g41 g41Var2) {
        super(h41Var2, eVar, g41Var, g41Var2);
        this.f679o3 = h41Var;
    }

    @Override
    public boolean E0(float f10) {
        int i3;
        switch (this.f678n3) {
            case 2:
                bi biVar = ((ni) this.f679o3).f38416b;
                int L = org.telegram.messenger.g0.L(30.0f) + biVar.W3[0];
                if (!biVar.Y1) {
                    i3 = org.telegram.messenger.g0.f22602m;
                } else {
                    i3 = 0;
                }
                if (f10 < L + i3) {
                    return false;
                }
                return true;
            default:
                return super.E0(f10);
        }
    }

    @Override
    public void F1() {
        switch (this.f678n3) {
            case 2:
                ni niVar = (ni) this.f679o3;
                niVar.f38416b.M1(niVar, 0);
                return;
            default:
                return;
        }
    }

    @Override
    public void K1() {
        switch (this.f678n3) {
            case 1:
                org.telegram.messenger.g0.d0(((o9) this.f679o3).f13923b, new v2(this, 25));
                return;
            default:
                return;
        }
    }

    @Override
    public Integer V0(int i3) {
        switch (this.f678n3) {
            case 1:
                return 0;
            default:
                return super.V0(i3);
        }
    }

    @Override
    public void l0(int i3) {
        org.telegram.ui.web.j jVar;
        switch (this.f678n3) {
            case 4:
                if (!canScrollVertically(1) && (jVar = ((org.telegram.ui.web.l) this.f679o3).E) != null && jVar.h) {
                    jVar.d();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.f678n3) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                ((vp0) this.f679o3).p();
                return;
            case 1:
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                return;
            case 2:
                super.onLayout(z10, i3, i10, i11, i12);
                ni niVar = (ni) this.f679o3;
                niVar.f38416b.M1(niVar, 0);
                return;
            case 3:
                super.onLayout(z10, i3, i10, i11, i12);
                ((h41) this.f679o3).f34300c = -1;
                return;
        }
    }

    public h4(o9 o9Var, Context context, int i3, gi.t3 t3Var, y8 y8Var, ei.b bVar) {
        super(context, i3, 0, false, t3Var, y8Var, null, bVar, -1, 0);
        this.f679o3 = o9Var;
    }

    public h4(org.telegram.ui.web.l lVar, Context context, int i3, org.telegram.ui.web.b bVar, org.telegram.ui.web.a aVar, gi.e5 e5Var) {
        super(context, i3, 0, false, bVar, aVar, null, e5Var);
        this.f679o3 = lVar;
    }

    public h4(ni niVar, Context context, int i3, org.telegram.ui.Components.e eVar, gi giVar, gi giVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, 0, false, eVar, giVar, giVar2, e6Var);
        this.f679o3 = niVar;
    }

    public h4(Context context, int i3, c cVar, f4 f4Var, f4 f4Var2, org.telegram.ui.ActionBar.e6 e6Var, vp0 vp0Var) {
        super(context, i3, 0, false, cVar, f4Var, f4Var2, e6Var, 3, 1);
        this.f679o3 = vp0Var;
    }
}

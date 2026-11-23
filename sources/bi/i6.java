package bi;

import android.content.Context;
import hi.ga;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.d51;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xi;
public final class i6 extends g51 {
    public final int f3702n3 = 0;
    public final Object f3703o3;

    public i6(d51 d51Var, d51 d51Var2, org.telegram.ui.Components.d dVar, c51 c51Var, c51 c51Var2) {
        super(d51Var2, dVar, c51Var, c51Var2);
        this.f3703o3 = d51Var;
    }

    @Override
    public boolean E0(float f10) {
        int i7;
        switch (this.f3702n3) {
            case 2:
                ti tiVar = ((dj) this.f3703o3).f37135b;
                int L = org.telegram.messenger.g0.L(30.0f) + tiVar.Z3[0];
                if (!tiVar.f39959b2) {
                    i7 = org.telegram.messenger.g0.f24220m;
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
        switch (this.f3702n3) {
            case 2:
                dj djVar = (dj) this.f3703o3;
                djVar.f37135b.N1(djVar, 0);
                return;
            default:
                return;
        }
    }

    @Override
    public void K1() {
        switch (this.f3702n3) {
            case 1:
                org.telegram.messenger.g0.d0(((ga) this.f3703o3).f14529b, new ai.d0(this, 27));
                return;
            default:
                return;
        }
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f3702n3) {
            case 1:
                return 0;
            default:
                return super.V0(i7);
        }
    }

    @Override
    public void l0(int i7) {
        org.telegram.ui.web.i iVar;
        switch (this.f3702n3) {
            case 4:
                if (!canScrollVertically(1) && (iVar = ((org.telegram.ui.web.k) this.f3703o3).E) != null && iVar.h) {
                    iVar.d();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f3702n3) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                ((fq0) this.f3703o3).p();
                return;
            case 1:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                dj djVar = (dj) this.f3703o3;
                djVar.f37135b.N1(djVar, 0);
                return;
            case 3:
                super.onLayout(z10, i7, i10, i11, i12);
                ((d51) this.f3703o3).f34215c = -1;
                return;
        }
    }

    public i6(ga gaVar, Context context, int i7, hi.b4 b4Var, di.v6 v6Var, fi.b bVar) {
        super(context, i7, 0, false, b4Var, v6Var, null, bVar, -1, 0);
        this.f3703o3 = gaVar;
    }

    public i6(org.telegram.ui.web.k kVar, Context context, int i7, org.telegram.ui.web.b bVar, org.telegram.ui.web.a aVar, hi.n5 n5Var) {
        super(context, i7, 0, false, bVar, aVar, null, n5Var);
        this.f3703o3 = kVar;
    }

    public i6(dj djVar, Context context, int i7, org.telegram.ui.Components.d dVar, xi xiVar, xi xiVar2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, 0, false, dVar, xiVar, xiVar2, i6Var);
        this.f3703o3 = djVar;
    }

    public i6(Context context, int i7, b bVar, g6 g6Var, g6 g6Var2, org.telegram.ui.ActionBar.i6 i6Var, fq0 fq0Var) {
        super(context, i7, 0, false, bVar, g6Var, g6Var2, i6Var, 3, 1);
        this.f3703o3 = fq0Var;
    }
}

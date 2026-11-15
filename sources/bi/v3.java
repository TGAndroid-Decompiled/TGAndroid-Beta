package bi;

import android.content.Context;
import di.z6;
import hi.l9;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.oi;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.wp0;
public final class v3 extends u41 {
    public final int f3934n3 = 0;
    public final Object f3935o3;

    public v3(r41 r41Var, r41 r41Var2, org.telegram.ui.Components.d dVar, q41 q41Var, q41 q41Var2) {
        super(r41Var2, dVar, q41Var, q41Var2);
        this.f3935o3 = r41Var;
    }

    @Override
    public boolean E0(float f10) {
        int i7;
        switch (this.f3934n3) {
            case 2:
                ki kiVar = ((vi) this.f3935o3).f33607b;
                int L = org.telegram.messenger.g0.L(30.0f) + kiVar.Z3[0];
                if (!kiVar.f36439b2) {
                    i7 = org.telegram.messenger.g0.f23603m;
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
        switch (this.f3934n3) {
            case 2:
                vi viVar = (vi) this.f3935o3;
                viVar.f33607b.M1(viVar, 0);
                return;
            default:
                return;
        }
    }

    @Override
    public void K1() {
        switch (this.f3934n3) {
            case 1:
                org.telegram.messenger.g0.d0(((l9) this.f3935o3).f15326b, new ai.f0(this, 26));
                return;
            default:
                return;
        }
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f3934n3) {
            case 1:
                return 0;
            default:
                return super.V0(i7);
        }
    }

    @Override
    public void l0(int i7) {
        org.telegram.ui.web.i iVar;
        switch (this.f3934n3) {
            case 4:
                if (!canScrollVertically(1) && (iVar = ((org.telegram.ui.web.k) this.f3935o3).E) != null && iVar.h) {
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
        switch (this.f3934n3) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                ((wp0) this.f3935o3).p();
                return;
            case 1:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                vi viVar = (vi) this.f3935o3;
                viVar.f33607b.M1(viVar, 0);
                return;
            case 3:
                super.onLayout(z10, i7, i10, i11, i12);
                ((r41) this.f3935o3).f38884c = -1;
                return;
        }
    }

    public v3(l9 l9Var, Context context, int i7, hi.s3 s3Var, z6 z6Var, fi.b bVar) {
        super(context, i7, 0, false, s3Var, z6Var, null, bVar, -1, 0);
        this.f3935o3 = l9Var;
    }

    public v3(org.telegram.ui.web.k kVar, Context context, int i7, org.telegram.ui.web.b bVar, org.telegram.ui.web.a aVar, hi.e5 e5Var) {
        super(context, i7, 0, false, bVar, aVar, null, e5Var);
        this.f3935o3 = kVar;
    }

    public v3(vi viVar, Context context, int i7, org.telegram.ui.Components.d dVar, oi oiVar, oi oiVar2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, 0, false, dVar, oiVar, oiVar2, e6Var);
        this.f3935o3 = viVar;
    }

    public v3(Context context, int i7, b bVar, t3 t3Var, t3 t3Var2, org.telegram.ui.ActionBar.e6 e6Var, wp0 wp0Var) {
        super(context, i7, 0, false, bVar, t3Var, t3Var2, e6Var, 3, 1);
        this.f3935o3 = wp0Var;
    }
}

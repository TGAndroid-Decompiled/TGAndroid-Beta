package bi;

import android.content.Context;
import hi.m9;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.wi;
public final class c6 extends e51 {
    public final int f3500n3 = 0;
    public final Object f3501o3;

    public c6(b51 b51Var, b51 b51Var2, org.telegram.ui.Components.d dVar, a51 a51Var, a51 a51Var2) {
        super(b51Var2, dVar, a51Var, a51Var2);
        this.f3501o3 = b51Var;
    }

    @Override
    public boolean E0(float f10) {
        int i7;
        switch (this.f3500n3) {
            case 2:
                si siVar = ((cj) this.f3501o3).f36766b;
                int L = org.telegram.messenger.g0.L(30.0f) + siVar.Z3[0];
                if (!siVar.f39662b2) {
                    i7 = org.telegram.messenger.g0.f24112m;
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
        switch (this.f3500n3) {
            case 2:
                cj cjVar = (cj) this.f3501o3;
                cjVar.f36766b.N1(cjVar, 0);
                return;
            default:
                return;
        }
    }

    @Override
    public void K1() {
        switch (this.f3500n3) {
            case 1:
                org.telegram.messenger.g0.d0(((m9) this.f3501o3).f15713b, new ai.g0(this, 27));
                return;
            default:
                return;
        }
    }

    @Override
    public Integer V0(int i7) {
        switch (this.f3500n3) {
            case 1:
                return 0;
            default:
                return super.V0(i7);
        }
    }

    @Override
    public void l0(int i7) {
        org.telegram.ui.web.i iVar;
        switch (this.f3500n3) {
            case 4:
                if (!canScrollVertically(1) && (iVar = ((org.telegram.ui.web.k) this.f3501o3).E) != null && iVar.h) {
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
        switch (this.f3500n3) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                ((eq0) this.f3501o3).p();
                return;
            case 1:
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
            case 2:
                super.onLayout(z10, i7, i10, i11, i12);
                cj cjVar = (cj) this.f3501o3;
                cjVar.f36766b.N1(cjVar, 0);
                return;
            case 3:
                super.onLayout(z10, i7, i10, i11, i12);
                ((b51) this.f3501o3).f33532c = -1;
                return;
        }
    }

    public c6(m9 m9Var, Context context, int i7, hi.s3 s3Var, di.c7 c7Var, fi.b bVar) {
        super(context, i7, 0, false, s3Var, c7Var, null, bVar, -1, 0);
        this.f3501o3 = m9Var;
    }

    public c6(org.telegram.ui.web.k kVar, Context context, int i7, org.telegram.ui.web.b bVar, org.telegram.ui.web.a aVar, hi.d5 d5Var) {
        super(context, i7, 0, false, bVar, aVar, null, d5Var);
        this.f3501o3 = kVar;
    }

    public c6(cj cjVar, Context context, int i7, org.telegram.ui.Components.d dVar, wi wiVar, wi wiVar2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, 0, false, dVar, wiVar, wiVar2, i6Var);
        this.f3501o3 = cjVar;
    }

    public c6(Context context, int i7, b bVar, a6 a6Var, a6 a6Var2, org.telegram.ui.ActionBar.i6 i6Var, eq0 eq0Var) {
        super(context, i7, 0, false, bVar, a6Var, a6Var2, i6Var, 3, 1);
        this.f3501o3 = eq0Var;
    }
}

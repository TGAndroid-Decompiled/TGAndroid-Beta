package hi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.h61;
public final class f5 implements z, tg.g {
    public final pa f14443a;

    public f5(pa paVar) {
        this.f14443a = paVar;
    }

    @Override
    public void M1(tg.d dVar) {
        this.f14443a.c0(dVar);
    }

    @Override
    public FrameLayout N() {
        return this.f14443a.f15597w1;
    }

    @Override
    public long N1() {
        x7 x7Var = this.f14443a.V1;
        if (x7Var == null) {
            return 0L;
        }
        return x7Var.Z * ((float) x7Var.f15751h0);
    }

    @Override
    public org.telegram.ui.ActionBar.i6 Q() {
        return this.f14443a.f15585q1;
    }

    @Override
    public FrameLayout Q0() {
        return this.f14443a;
    }

    @Override
    public tg.d S() {
        pa paVar = this.f14443a;
        paVar.Z1 = true;
        return paVar.g0();
    }

    @Override
    public void V0(tg.n nVar) {
        this.f14443a.B0(nVar);
    }

    @Override
    public long Z0() {
        x7 x7Var = this.f14443a.V1;
        if (x7Var == null) {
            return 0L;
        }
        return x7Var.f15734a0 * ((float) x7Var.f15751h0);
    }

    @Override
    public void h() {
        pa paVar = this.f14443a;
        paVar.D0(null, true);
        if (paVar.f15596w0) {
            nb nbVar = paVar.f15198o2;
            nbVar.f15067d1.f14936f.d();
            nbVar.k0(-1, false, true);
            paVar.f15596w0 = false;
        }
        paVar.O0(false);
    }

    @Override
    public tg.d i0() {
        q5 q5Var = this.f14443a.B0;
        for (int i7 = 0; i7 < q5Var.getChildCount(); i7++) {
            if (q5Var.getChildAt(i7) instanceof tg.d) {
                return (tg.d) q5Var.getChildAt(i7);
            }
        }
        return null;
    }

    @Override
    public tg.n o() {
        return this.f14443a.f15590t0;
    }

    @Override
    public void s2(long j3) {
        l2.g0 g0Var;
        f6 f6Var = this.f14443a.Q1;
        if (f6Var != null) {
            h61 h61Var = f6Var.f14451e;
            if (h61Var != null && ((g0Var = h61Var.d) == null || !g0Var.f0())) {
                return;
            }
            f6Var.m(j3);
        }
    }

    @Override
    public long u0() {
        f6 f6Var = this.f14443a.Q1;
        if (f6Var != null) {
            return f6Var.getCurrentPosition();
        }
        return 0L;
    }

    @Override
    public void w(boolean z10) {
        f6 f6Var = this.f14443a.Q1;
        if (f6Var != null) {
            f6Var.x(-8713, z10);
        }
    }
}

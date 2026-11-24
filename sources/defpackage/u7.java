package defpackage;

import android.view.ViewGroup;
public final class u7 extends wk4 {
    public final byte e;
    public final ViewGroup f;

    public u7(ViewGroup viewGroup, byte b) {
        super(false);
        this.e = b;
        this.f = viewGroup;
    }

    @Override
    public final CharSequence d() {
        byte b = this.e;
        ViewGroup viewGroup = this.f;
        switch (b) {
            case 0:
                return dna.a(((v7) viewGroup).getSpeed()) + "x  " + jb6.M0(2131754758, null);
            case 1:
            default:
                return super.d();
            case 2:
                cx9 cx9Var = ((dx9) viewGroup).y;
                if (cx9Var == null) {
                    return null;
                }
                return cx9Var.getContentDescription();
        }
    }

    @Override
    public final float h() {
        switch (this.e) {
            case 0:
                return 0.2f;
            case 1:
            default:
                return super.h();
            case 2:
                int j0 = ((dx9) this.f).y.j0();
                if (j0 > 0) {
                    return 1.0f / j0;
                }
                return 0.05f;
        }
    }

    @Override
    public final float i() {
        switch (this.e) {
            case 0:
                return 3.0f;
            default:
                return super.i();
        }
    }

    @Override
    public final float j() {
        switch (this.e) {
            case 0:
                return 0.2f;
            default:
                return super.j();
        }
    }

    @Override
    public final float k() {
        float f;
        int i;
        int i2;
        byte b = this.e;
        ViewGroup viewGroup = this.f;
        switch (b) {
            case 0:
                return ((v7) viewGroup).getSpeed();
            case 1:
                rc2 rc2Var = (rc2) viewGroup;
                ic2 ic2Var = rc2Var.D4;
                if (rc2Var.Q5.I3()) {
                    f = ic2Var.b;
                    i = ic2Var.f;
                    i2 = ax9.E;
                } else if (k47.Q4(rc2Var.Q5.k)) {
                    if (rc2Var.C4) {
                        gx9 gx9Var = rc2Var.E4;
                        return gx9Var.a / gx9Var.g;
                    }
                    f = ic2Var.b;
                    i = ic2Var.f;
                    i2 = ax9.E;
                } else if (rc2Var.Q5.g4()) {
                    return rc2Var.Q5.b0;
                } else {
                    return 0.0f;
                }
                return f / (i - i2);
            default:
                return ((dx9) viewGroup).getProgress();
        }
    }

    @Override
    public final void l(float f) {
        byte b = this.e;
        ViewGroup viewGroup = this.f;
        switch (b) {
            case 0:
                ((v7) viewGroup).e(true, f);
                return;
            case 1:
                rc2 rc2Var = (rc2) viewGroup;
                gx9 gx9Var = rc2Var.E4;
                ic2 ic2Var = rc2Var.D4;
                if (rc2Var.Q5.I3()) {
                    ic2Var.g(f);
                } else if (k47.Q4(rc2Var.Q5.k)) {
                    if (rc2Var.C4) {
                        gx9Var.f(false, f);
                    } else {
                        ic2Var.g(f);
                    }
                } else if (rc2Var.Q5.g4()) {
                    if (rc2Var.C4) {
                        if (gx9Var != null) {
                            gx9Var.f(false, f);
                        }
                    } else if (ic2Var != null) {
                        ic2Var.g(f);
                    }
                    rc2Var.Q5.b0 = f;
                } else {
                    return;
                }
                rc2Var.f(f);
                rc2Var.invalidate();
                return;
            default:
                dx9 dx9Var = (dx9) viewGroup;
                dx9Var.x = true;
                dx9Var.setProgress(f);
                dx9Var.f(true, f);
                dx9Var.x = false;
                return;
        }
    }

    public u7(dx9 dx9Var, boolean z) {
        super(z);
        this.e = (byte) 2;
        this.f = dx9Var;
    }
}

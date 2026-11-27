package defpackage;

import android.view.ViewGroup;
public final class v7 extends wk4 {
    public final byte e;
    public final ViewGroup f;

    public v7(ViewGroup viewGroup, byte b) {
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
                return zoa.a(((w7) viewGroup).getSpeed()) + "x  " + ob6.M0(2131754754, null);
            case 1:
            default:
                return super.d();
            case 2:
                ty9 ty9Var = ((uy9) viewGroup).y;
                if (ty9Var == null) {
                    return null;
                }
                return ty9Var.getContentDescription();
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
                int i0 = ((uy9) this.f).y.i0();
                if (i0 > 0) {
                    return 1.0f / i0;
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
                return ((w7) viewGroup).getSpeed();
            case 1:
                wb2 wb2Var = (wb2) viewGroup;
                nb2 nb2Var = wb2Var.D4;
                if (wb2Var.Q5.I3()) {
                    f = nb2Var.b;
                    i = nb2Var.f;
                    i2 = ry9.E;
                } else if (r47.Q4(wb2Var.Q5.k)) {
                    if (wb2Var.C4) {
                        xy9 xy9Var = wb2Var.E4;
                        return xy9Var.a / xy9Var.g;
                    }
                    f = nb2Var.b;
                    i = nb2Var.f;
                    i2 = ry9.E;
                } else if (wb2Var.Q5.g4()) {
                    return wb2Var.Q5.b0;
                } else {
                    return 0.0f;
                }
                return f / (i - i2);
            default:
                return ((uy9) viewGroup).getProgress();
        }
    }

    @Override
    public final void l(float f) {
        byte b = this.e;
        ViewGroup viewGroup = this.f;
        switch (b) {
            case 0:
                ((w7) viewGroup).e(true, f);
                return;
            case 1:
                wb2 wb2Var = (wb2) viewGroup;
                xy9 xy9Var = wb2Var.E4;
                nb2 nb2Var = wb2Var.D4;
                if (wb2Var.Q5.I3()) {
                    nb2Var.g(f);
                } else if (r47.Q4(wb2Var.Q5.k)) {
                    if (wb2Var.C4) {
                        xy9Var.f(false, f);
                    } else {
                        nb2Var.g(f);
                    }
                } else if (wb2Var.Q5.g4()) {
                    if (wb2Var.C4) {
                        if (xy9Var != null) {
                            xy9Var.f(false, f);
                        }
                    } else if (nb2Var != null) {
                        nb2Var.g(f);
                    }
                    wb2Var.Q5.b0 = f;
                } else {
                    return;
                }
                wb2Var.g(f);
                wb2Var.invalidate();
                return;
            default:
                uy9 uy9Var = (uy9) viewGroup;
                uy9Var.x = true;
                uy9Var.setProgress(f);
                uy9Var.f(true, f);
                uy9Var.x = false;
                return;
        }
    }

    public v7(uy9 uy9Var, boolean z) {
        super(z);
        this.e = (byte) 2;
        this.f = uy9Var;
    }
}

package defpackage;

import android.view.ViewGroup;
public final class u7 extends si4 {
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
                return cla.a(((v7) viewGroup).getSpeed()) + "x  " + k96.M0(2131754758, null);
            case 1:
            default:
                return super.d();
            case 2:
                zu9 zu9Var = ((av9) viewGroup).y;
                if (zu9Var == null) {
                    return null;
                }
                return zu9Var.getContentDescription();
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
                int a0 = ((av9) this.f).y.a0();
                if (a0 > 0) {
                    return 1.0f / a0;
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
                gb2 gb2Var = (gb2) viewGroup;
                xa2 xa2Var = gb2Var.D4;
                if (gb2Var.Q5.I3()) {
                    f = xa2Var.b;
                    i = xa2Var.f;
                    i2 = xu9.E;
                } else if (k27.Q4(gb2Var.Q5.k)) {
                    if (gb2Var.C4) {
                        dv9 dv9Var = gb2Var.E4;
                        return dv9Var.a / dv9Var.g;
                    }
                    f = xa2Var.b;
                    i = xa2Var.f;
                    i2 = xu9.E;
                } else if (gb2Var.Q5.g4()) {
                    return gb2Var.Q5.b0;
                } else {
                    return 0.0f;
                }
                return f / (i - i2);
            default:
                return ((av9) viewGroup).getProgress();
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
                gb2 gb2Var = (gb2) viewGroup;
                dv9 dv9Var = gb2Var.E4;
                xa2 xa2Var = gb2Var.D4;
                if (gb2Var.Q5.I3()) {
                    xa2Var.g(f);
                } else if (k27.Q4(gb2Var.Q5.k)) {
                    if (gb2Var.C4) {
                        dv9Var.f(false, f);
                    } else {
                        xa2Var.g(f);
                    }
                } else if (gb2Var.Q5.g4()) {
                    if (gb2Var.C4) {
                        if (dv9Var != null) {
                            dv9Var.f(false, f);
                        }
                    } else if (xa2Var != null) {
                        xa2Var.g(f);
                    }
                    gb2Var.Q5.b0 = f;
                } else {
                    return;
                }
                gb2Var.f(f);
                gb2Var.invalidate();
                return;
            default:
                av9 av9Var = (av9) viewGroup;
                av9Var.x = true;
                av9Var.setProgress(f);
                av9Var.f(true, f);
                av9Var.x = false;
                return;
        }
    }

    public u7(av9 av9Var, boolean z) {
        super(z);
        this.e = (byte) 2;
        this.f = av9Var;
    }
}

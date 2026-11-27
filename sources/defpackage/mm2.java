package defpackage;

import android.view.View;
public final class mm2 extends nic {
    public final byte a;
    public final Object b;

    public mm2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void b(View view, int i, int i2) {
        boolean z;
        switch (this.a) {
            case 0:
                return;
            case 1:
                ((vo2) view).getClass();
                return;
            case 2:
                x83 x83Var = (x83) view;
                x83Var.g3 = i;
                x83Var.n3.clear();
                if (x83Var.A1(6) + x83Var.C1(6) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                x83Var.u3 = z;
                x83Var.D1();
                x83Var.E1(false);
                x83Var.x0(0);
                return;
            case 3:
            default:
                return;
        }
    }

    @Override
    public final View d(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                rg2 rg2Var = (rg2) obj;
                if (i != 1) {
                    if (i != 2) {
                        return (pm2) rg2Var.b;
                    }
                    return (rm2) rg2Var.d;
                }
                return (om2) rg2Var.c;
            case 1:
                xo2 xo2Var = (xo2) obj;
                if (i == 2) {
                    return xo2Var.w1;
                }
                if (i == 0) {
                    return xo2Var.u1;
                }
                return xo2Var.v1;
            case 2:
                a93 a93Var = (a93) obj;
                x83 x83Var = new x83(a93Var, a93Var.getParentActivity());
                a93Var.e.add(x83Var);
                return x83Var;
            case 3:
                return (View) ((tk7) obj).m1.get(i);
            default:
                h48 h48Var = (h48) obj;
                if (i == 1) {
                    return h48Var.h;
                }
                if (i == 0) {
                    return h48Var.n;
                }
                return null;
        }
    }

    @Override
    public final int e() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return 3;
            case 1:
                if (!((xo2) obj).H1) {
                    return 3;
                }
                return 1;
            case 2:
                return 4;
            case 3:
                return ((tk7) obj).m1.size();
            default:
                return 2;
        }
    }

    @Override
    public final CharSequence g(int i) {
        switch (this.a) {
            case 0:
                if (i != 1) {
                    if (i != 2) {
                        return ob6.M0(2131747396, null).toUpperCase();
                    }
                    return ob6.M0(2131747395, null).toUpperCase();
                }
                return ob6.M0(2131747390, null).toUpperCase();
            case 1:
            default:
                return super.g(i);
            case 2:
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                return "";
                            }
                            return ob6.M0(2131748049, null);
                        }
                        return ob6.M0(2131748047, null);
                    }
                    return ob6.M0(2131748050, null);
                }
                return ob6.M0(2131748051, null);
        }
    }

    @Override
    public final int h(int i) {
        switch (this.a) {
            case 0:
                return i;
            case 1:
                if (((xo2) this.b).H1 || i == 2) {
                    return 2;
                }
                if (i == 0) {
                    return 0;
                }
                return 1;
            case 2:
            default:
                return super.h(i);
            case 3:
            case 4:
                return i;
        }
    }

    private final void i(View view, int i, int i2) {
    }

    private final void j(View view, int i, int i2) {
    }

    private final void k(View view, int i, int i2) {
    }
}

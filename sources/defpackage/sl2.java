package defpackage;

import android.view.View;
public final class sl2 extends oec {
    public final byte a;
    public final Object b;

    public sl2(Object obj, byte b) {
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
                ((co2) view).getClass();
                return;
            case 2:
                e83 e83Var = (e83) view;
                e83Var.g3 = i;
                e83Var.n3.clear();
                if (e83Var.z1(6) + e83Var.B1(6) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                e83Var.u3 = z;
                e83Var.C1();
                e83Var.D1(false);
                e83Var.w0(0);
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
                zf2 zf2Var = (zf2) obj;
                if (i != 1) {
                    if (i != 2) {
                        return (vl2) zf2Var.b;
                    }
                    return (xl2) zf2Var.d;
                }
                return (ul2) zf2Var.c;
            case 1:
                eo2 eo2Var = (eo2) obj;
                if (i == 2) {
                    return eo2Var.w1;
                }
                if (i == 0) {
                    return eo2Var.u1;
                }
                return eo2Var.v1;
            case 2:
                h83 h83Var = (h83) obj;
                e83 e83Var = new e83(h83Var, h83Var.getParentActivity());
                h83Var.e.add(e83Var);
                return e83Var;
            case 3:
                return (View) ((ki7) obj).m1.get(i);
            default:
                a18 a18Var = (a18) obj;
                if (i == 1) {
                    return a18Var.h;
                }
                if (i == 0) {
                    return a18Var.n;
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
                if (!((eo2) obj).H1) {
                    return 3;
                }
                return 1;
            case 2:
                return 4;
            case 3:
                return ((ki7) obj).m1.size();
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
                        return k96.M0(2131747476, null).toUpperCase();
                    }
                    return k96.M0(2131747475, null).toUpperCase();
                }
                return k96.M0(2131747470, null).toUpperCase();
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
                            return k96.M0(2131748103, null);
                        }
                        return k96.M0(2131748101, null);
                    }
                    return k96.M0(2131748104, null);
                }
                return k96.M0(2131748105, null);
        }
    }

    @Override
    public final int h(int i) {
        switch (this.a) {
            case 0:
                return i;
            case 1:
                if (((eo2) this.b).H1 || i == 2) {
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

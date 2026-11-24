package defpackage;

import android.view.View;
public final class fn2 extends ogc {
    public final byte a;
    public final Object b;

    public fn2(Object obj, byte b) {
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
                ((np2) view).getClass();
                return;
            case 2:
                q93 q93Var = (q93) view;
                q93Var.g3 = i;
                q93Var.n3.clear();
                if (q93Var.z1(6) + q93Var.B1(6) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                q93Var.u3 = z;
                q93Var.C1();
                q93Var.D1(false);
                q93Var.w0(0);
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
                nh2 nh2Var = (nh2) obj;
                if (i != 1) {
                    if (i != 2) {
                        return (in2) nh2Var.b;
                    }
                    return (kn2) nh2Var.d;
                }
                return (hn2) nh2Var.c;
            case 1:
                pp2 pp2Var = (pp2) obj;
                if (i == 2) {
                    return pp2Var.w1;
                }
                if (i == 0) {
                    return pp2Var.u1;
                }
                return pp2Var.v1;
            case 2:
                t93 t93Var = (t93) obj;
                q93 q93Var = new q93(t93Var, t93Var.getParentActivity());
                t93Var.e.add(q93Var);
                return q93Var;
            case 3:
                return (View) ((mk7) obj).m1.get(i);
            default:
                d38 d38Var = (d38) obj;
                if (i == 1) {
                    return d38Var.h;
                }
                if (i == 0) {
                    return d38Var.n;
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
                if (!((pp2) obj).H1) {
                    return 3;
                }
                return 1;
            case 2:
                return 4;
            case 3:
                return ((mk7) obj).m1.size();
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
                        return jb6.M0(2131747402, null).toUpperCase();
                    }
                    return jb6.M0(2131747401, null).toUpperCase();
                }
                return jb6.M0(2131747396, null).toUpperCase();
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
                            return jb6.M0(2131748052, null);
                        }
                        return jb6.M0(2131748050, null);
                    }
                    return jb6.M0(2131748053, null);
                }
                return jb6.M0(2131748054, null);
        }
    }

    @Override
    public final int h(int i) {
        switch (this.a) {
            case 0:
                return i;
            case 1:
                if (((pp2) this.b).H1 || i == 2) {
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

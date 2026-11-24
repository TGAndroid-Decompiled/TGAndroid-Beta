package defpackage;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
public final class zd0 implements oac, ee {
    public final byte a;
    public final be0 b;

    public zd0(be0 be0Var, byte b) {
        this.a = b;
        this.b = be0Var;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c6c c6cVar = (c6c) obj;
        final View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        final be0 be0Var = this.b;
        if (!be0Var.c.h(c6cVar)) {
            int i = c6cVar.d;
            if (i != 2 && c6cVar.a != 17) {
                if (i == 1) {
                    be0Var.r = !be0Var.r;
                    be0Var.b.g3.O(true);
                    be0Var.Z(true);
                    return;
                } else if (i == 6) {
                    t51 t51Var = be0Var.c;
                    be0Var.s = true;
                    t51Var.h = true;
                    be0Var.b.g3.O(true);
                    be0Var.Z(true);
                    return;
                } else if (i == 7) {
                    t51 t51Var2 = be0Var.c;
                    be0Var.s = false;
                    t51Var2.h = false;
                    be0Var.b.g3.O(true);
                    be0Var.Z(true);
                    return;
                } else if (i == 3) {
                    be0Var.x = (byte) 0;
                    be0Var.b.g3.O(true);
                    be0Var.Z(true);
                    return;
                } else if (i == 4) {
                    be0Var.x = (byte) 1;
                    be0Var.b.g3.O(true);
                    be0Var.Z(true);
                    return;
                } else if (i == 5) {
                    be0Var.x = (byte) 2;
                    be0Var.b.g3.O(true);
                    be0Var.Z(true);
                    return;
                } else if (i == 8) {
                    ik.x(be0Var.getParentActivity(), jb6.M0(2131752776, null), jb6.M0(2131752778, null), be0Var.F, new gk() {
                        @Override
                        public final void y(int i2, int i3, boolean z) {
                            byte b = r3;
                            View view2 = view;
                            be0 be0Var2 = be0Var;
                            switch (b) {
                                case 0:
                                    be0Var2.F = i2;
                                    ((xib) view2).w(jb6.Q(i2), true);
                                    be0Var2.Z(true);
                                    return;
                                default:
                                    be0Var2.G = i2;
                                    ((xib) view2).w(jb6.Q(i2), true);
                                    be0Var2.Z(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i == 9) {
                    ik.x(be0Var.getParentActivity(), jb6.M0(2131752779, null), jb6.M0(2131752778, null), be0Var.G, new gk() {
                        @Override
                        public final void y(int i2, int i3, boolean z) {
                            byte b = r3;
                            View view2 = view;
                            be0 be0Var2 = be0Var;
                            switch (b) {
                                case 0:
                                    be0Var2.F = i2;
                                    ((xib) view2).w(jb6.Q(i2), true);
                                    be0Var2.Z(true);
                                    return;
                                default:
                                    be0Var2.G = i2;
                                    ((xib) view2).w(jb6.Q(i2), true);
                                    be0Var2.Z(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i == 10) {
                    boolean z = !be0Var.w;
                    be0Var.w = z;
                    ((bjb) view).setChecked(z);
                    be0Var.Z(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", be0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            be0Var.presentFragment(new yv1(bundle));
        }
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        be0 be0Var = this.b;
        switch (b) {
            case 1:
                be0Var.c0();
                return;
            default:
                be0Var.finishFragment();
                return;
        }
    }
}

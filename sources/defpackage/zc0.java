package defpackage;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
public final class zc0 implements n8c, ed {
    public final byte a;
    public final bd0 b;

    public zc0(bd0 bd0Var, byte b) {
        this.a = b;
        this.b = bd0Var;
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        c4c c4cVar = (c4c) obj;
        final View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        final bd0 bd0Var = this.b;
        if (!bd0Var.c.h(c4cVar)) {
            int i = c4cVar.d;
            if (i != 2 && c4cVar.a != 17) {
                if (i == 1) {
                    bd0Var.r = !bd0Var.r;
                    bd0Var.b.g3.O(true);
                    bd0Var.Y(true);
                    return;
                } else if (i == 6) {
                    m41 m41Var = bd0Var.c;
                    bd0Var.s = true;
                    m41Var.h = true;
                    bd0Var.b.g3.O(true);
                    bd0Var.Y(true);
                    return;
                } else if (i == 7) {
                    m41 m41Var2 = bd0Var.c;
                    bd0Var.s = false;
                    m41Var2.h = false;
                    bd0Var.b.g3.O(true);
                    bd0Var.Y(true);
                    return;
                } else if (i == 3) {
                    bd0Var.x = (byte) 0;
                    bd0Var.b.g3.O(true);
                    bd0Var.Y(true);
                    return;
                } else if (i == 4) {
                    bd0Var.x = (byte) 1;
                    bd0Var.b.g3.O(true);
                    bd0Var.Y(true);
                    return;
                } else if (i == 5) {
                    bd0Var.x = (byte) 2;
                    bd0Var.b.g3.O(true);
                    bd0Var.Y(true);
                    return;
                } else if (i == 8) {
                    ij.x(bd0Var.getParentActivity(), k96.M0(2131752811, null), k96.M0(2131752813, null), bd0Var.F, new gj() {
                        @Override
                        public final void s(int i2, int i3, boolean z) {
                            byte b = r3;
                            View view2 = view;
                            bd0 bd0Var2 = bd0Var;
                            switch (b) {
                                case 0:
                                    bd0Var2.F = i2;
                                    ((wgb) view2).w(k96.Q(i2), true);
                                    bd0Var2.Y(true);
                                    return;
                                default:
                                    bd0Var2.G = i2;
                                    ((wgb) view2).w(k96.Q(i2), true);
                                    bd0Var2.Y(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i == 9) {
                    ij.x(bd0Var.getParentActivity(), k96.M0(2131752814, null), k96.M0(2131752813, null), bd0Var.G, new gj() {
                        @Override
                        public final void s(int i2, int i3, boolean z) {
                            byte b = r3;
                            View view2 = view;
                            bd0 bd0Var2 = bd0Var;
                            switch (b) {
                                case 0:
                                    bd0Var2.F = i2;
                                    ((wgb) view2).w(k96.Q(i2), true);
                                    bd0Var2.Y(true);
                                    return;
                                default:
                                    bd0Var2.G = i2;
                                    ((wgb) view2).w(k96.Q(i2), true);
                                    bd0Var2.Y(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i == 10) {
                    boolean z = !bd0Var.w;
                    bd0Var.w = z;
                    ((ahb) view).setChecked(z);
                    bd0Var.Y(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", bd0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            bd0Var.presentFragment(new mu1(bundle));
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        bd0 bd0Var = this.b;
        switch (b) {
            case 1:
                bd0Var.b0();
                return;
            default:
                bd0Var.finishFragment();
                return;
        }
    }
}

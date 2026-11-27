package defpackage;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
public final class bd0 implements ncc, fd {
    public final byte a;
    public final dd0 b;

    public bd0(dd0 dd0Var, byte b) {
        this.a = b;
        this.b = dd0Var;
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b8c b8cVar = (b8c) obj;
        final View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        final dd0 dd0Var = this.b;
        if (!dd0Var.c.h(b8cVar)) {
            int i = b8cVar.d;
            if (i != 2 && b8cVar.a != 17) {
                if (i == 1) {
                    dd0Var.r = !dd0Var.r;
                    dd0Var.b.g3.O(true);
                    dd0Var.Y(true);
                    return;
                } else if (i == 6) {
                    u41 u41Var = dd0Var.c;
                    dd0Var.s = true;
                    u41Var.h = true;
                    dd0Var.b.g3.O(true);
                    dd0Var.Y(true);
                    return;
                } else if (i == 7) {
                    u41 u41Var2 = dd0Var.c;
                    dd0Var.s = false;
                    u41Var2.h = false;
                    dd0Var.b.g3.O(true);
                    dd0Var.Y(true);
                    return;
                } else if (i == 3) {
                    dd0Var.x = (byte) 0;
                    dd0Var.b.g3.O(true);
                    dd0Var.Y(true);
                    return;
                } else if (i == 4) {
                    dd0Var.x = (byte) 1;
                    dd0Var.b.g3.O(true);
                    dd0Var.Y(true);
                    return;
                } else if (i == 5) {
                    dd0Var.x = (byte) 2;
                    dd0Var.b.g3.O(true);
                    dd0Var.Y(true);
                    return;
                } else if (i == 8) {
                    jj.x(dd0Var.getParentActivity(), ob6.M0(2131752804, null), ob6.M0(2131752806, null), dd0Var.F, new hj() {
                        @Override
                        public final void y(int i2, int i3, boolean z) {
                            byte b = r3;
                            View view2 = view;
                            dd0 dd0Var2 = dd0Var;
                            switch (b) {
                                case 0:
                                    dd0Var2.F = i2;
                                    ((skb) view2).w(ob6.Q(i2), true);
                                    dd0Var2.Y(true);
                                    return;
                                default:
                                    dd0Var2.G = i2;
                                    ((skb) view2).w(ob6.Q(i2), true);
                                    dd0Var2.Y(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i == 9) {
                    jj.x(dd0Var.getParentActivity(), ob6.M0(2131752807, null), ob6.M0(2131752806, null), dd0Var.G, new hj() {
                        @Override
                        public final void y(int i2, int i3, boolean z) {
                            byte b = r3;
                            View view2 = view;
                            dd0 dd0Var2 = dd0Var;
                            switch (b) {
                                case 0:
                                    dd0Var2.F = i2;
                                    ((skb) view2).w(ob6.Q(i2), true);
                                    dd0Var2.Y(true);
                                    return;
                                default:
                                    dd0Var2.G = i2;
                                    ((skb) view2).w(ob6.Q(i2), true);
                                    dd0Var2.Y(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i == 10) {
                    boolean z = !dd0Var.w;
                    dd0Var.w = z;
                    ((wkb) view).setChecked(z);
                    dd0Var.Y(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", dd0Var.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            dd0Var.presentFragment(new zu1(bundle));
        }
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        dd0 dd0Var = this.b;
        switch (b) {
            case 1:
                dd0Var.b0();
                return;
            default:
                dd0Var.finishFragment();
                return;
        }
    }
}

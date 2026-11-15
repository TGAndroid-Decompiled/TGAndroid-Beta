package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.hd;
import org.telegram.messenger.x10;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.t4;
import org.telegram.ui.an;
public final class a implements x10, org.telegram.ui.ActionBar.q1 {
    public final int f17846a;
    public final c f17847b;

    public a(c cVar, int i7) {
        this.f17846a = i7;
        this.f17847b = cVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f17846a) {
            case 1:
                this.f17847b.c0();
                return;
            default:
                this.f17847b.finishFragment();
                return;
        }
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b41 b41Var = (b41) obj;
        final View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        final c cVar = this.f17847b;
        if (!cVar.f17879c.h(b41Var)) {
            int i7 = b41Var.d;
            if (i7 != 2 && b41Var.f56015a != 17) {
                if (i7 == 1) {
                    cVar.f17883r = !cVar.f17883r;
                    cVar.f17878b.f39895g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 6) {
                    a0 a0Var = cVar.f17879c;
                    cVar.f17884s = true;
                    a0Var.h = true;
                    cVar.f17878b.f39895g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 7) {
                    a0 a0Var2 = cVar.f17879c;
                    cVar.f17884s = false;
                    a0Var2.h = false;
                    cVar.f17878b.f39895g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 3) {
                    cVar.f17886x = 0;
                    cVar.f17878b.f39895g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 4) {
                    cVar.f17886x = 1;
                    cVar.f17878b.f39895g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 5) {
                    cVar.f17886x = 2;
                    cVar.f17878b.f39895g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 8) {
                    t4.x(cVar.getParentActivity(), hd.M0(2131752823, null), hd.M0(2131752825, null), cVar.F, new r4() {
                        @Override
                        public final void L(int i10, int i11, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i10;
                                    ((l8) view).w(hd.Q(i10), true);
                                    cVar2.a0(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i10;
                                    ((l8) view).w(hd.Q(i10), true);
                                    cVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i7 == 9) {
                    t4.x(cVar.getParentActivity(), hd.M0(2131752826, null), hd.M0(2131752825, null), cVar.G, new r4() {
                        @Override
                        public final void L(int i10, int i11, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i10;
                                    ((l8) view).w(hd.Q(i10), true);
                                    cVar2.a0(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i10;
                                    ((l8) view).w(hd.Q(i10), true);
                                    cVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i7 == 10) {
                    boolean z10 = !cVar.f17885w;
                    cVar.f17885w = z10;
                    ((q8) view).setChecked(z10);
                    cVar.a0(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new an(bundle));
        }
    }
}

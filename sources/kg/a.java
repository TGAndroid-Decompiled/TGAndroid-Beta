package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.hd;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.x31;
import org.telegram.ui.an;
public final class a implements a20, org.telegram.ui.ActionBar.r1 {
    public final int f17284a;
    public final c f17285b;

    public a(c cVar, int i7) {
        this.f17284a = i7;
        this.f17285b = cVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f17284a) {
            case 1:
                this.f17285b.c0();
                return;
            default:
                this.f17285b.finishFragment();
                return;
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        x31 x31Var = (x31) obj;
        final View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        final c cVar = this.f17285b;
        if (!cVar.f17317c.h(x31Var)) {
            int i7 = x31Var.d;
            if (i7 != 2 && x31Var.f54439a != 17) {
                if (i7 == 1) {
                    cVar.f17321r = !cVar.f17321r;
                    cVar.f17316b.f37160f3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 6) {
                    a0 a0Var = cVar.f17317c;
                    cVar.f17322s = true;
                    a0Var.h = true;
                    cVar.f17316b.f37160f3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 7) {
                    a0 a0Var2 = cVar.f17317c;
                    cVar.f17322s = false;
                    a0Var2.h = false;
                    cVar.f17316b.f37160f3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 3) {
                    cVar.f17324x = 0;
                    cVar.f17316b.f37160f3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 4) {
                    cVar.f17324x = 1;
                    cVar.f17316b.f37160f3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 5) {
                    cVar.f17324x = 2;
                    cVar.f17316b.f37160f3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 8) {
                    v4.x(cVar.getParentActivity(), hd.M0(2131752823, null), hd.M0(2131752825, null), cVar.E, new t4() {
                        @Override
                        public final void L(int i10, int i11, boolean z9) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.E = i10;
                                    ((m8) view).w(hd.Q(i10), true);
                                    cVar2.a0(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.F = i10;
                                    ((m8) view).w(hd.Q(i10), true);
                                    cVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i7 == 9) {
                    v4.x(cVar.getParentActivity(), hd.M0(2131752826, null), hd.M0(2131752825, null), cVar.F, new t4() {
                        @Override
                        public final void L(int i10, int i11, boolean z9) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.E = i10;
                                    ((m8) view).w(hd.Q(i10), true);
                                    cVar2.a0(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.F = i10;
                                    ((m8) view).w(hd.Q(i10), true);
                                    cVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i7 == 10) {
                    boolean z9 = !cVar.f17323w;
                    cVar.f17323w = z9;
                    ((r8) view).setChecked(z9);
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

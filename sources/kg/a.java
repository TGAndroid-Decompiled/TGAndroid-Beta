package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.id;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.y31;
import org.telegram.ui.cn;
public final class a implements a20, org.telegram.ui.ActionBar.r1 {
    public final int f17287a;
    public final c f17288b;

    public a(c cVar, int i7) {
        this.f17287a = i7;
        this.f17288b = cVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f17287a) {
            case 1:
                this.f17288b.c0();
                return;
            default:
                this.f17288b.finishFragment();
                return;
        }
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        y31 y31Var = (y31) obj;
        final View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        final c cVar = this.f17288b;
        if (!cVar.f17320c.h(y31Var)) {
            int i7 = y31Var.d;
            if (i7 != 2 && y31Var.f54544a != 17) {
                if (i7 == 1) {
                    cVar.f17324r = !cVar.f17324r;
                    cVar.f17319b.f37556f3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 6) {
                    a0 a0Var = cVar.f17320c;
                    cVar.f17325s = true;
                    a0Var.h = true;
                    cVar.f17319b.f37556f3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 7) {
                    a0 a0Var2 = cVar.f17320c;
                    cVar.f17325s = false;
                    a0Var2.h = false;
                    cVar.f17319b.f37556f3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 3) {
                    cVar.f17327x = 0;
                    cVar.f17319b.f37556f3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 4) {
                    cVar.f17327x = 1;
                    cVar.f17319b.f37556f3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 5) {
                    cVar.f17327x = 2;
                    cVar.f17319b.f37556f3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 8) {
                    v4.x(cVar.getParentActivity(), id.M0(2131752823, null), id.M0(2131752825, null), cVar.E, new t4() {
                        @Override
                        public final void L(int i10, int i11, boolean z9) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.E = i10;
                                    ((m8) view).w(id.Q(i10), true);
                                    cVar2.a0(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.F = i10;
                                    ((m8) view).w(id.Q(i10), true);
                                    cVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i7 == 9) {
                    v4.x(cVar.getParentActivity(), id.M0(2131752826, null), id.M0(2131752825, null), cVar.F, new t4() {
                        @Override
                        public final void L(int i10, int i11, boolean z9) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.E = i10;
                                    ((m8) view).w(id.Q(i10), true);
                                    cVar2.a0(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.F = i10;
                                    ((m8) view).w(id.Q(i10), true);
                                    cVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i7 == 10) {
                    boolean z9 = !cVar.f17326w;
                    cVar.f17326w = z9;
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
            cVar.presentFragment(new cn(bundle));
        }
    }
}

package lg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.bd;
import org.telegram.messenger.s10;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.t4;
import org.telegram.ui.wm;
public final class a implements s10, org.telegram.ui.ActionBar.p1 {
    public final int f18219a;
    public final c f18220b;

    public a(c cVar, int i3) {
        this.f18219a = i3;
        this.f18220b = cVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f18219a) {
            case 1:
                this.f18220b.c0();
                return;
            default:
                this.f18220b.finishFragment();
                return;
        }
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        r31 r31Var = (r31) obj;
        final View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        final c cVar = this.f18220b;
        if (!cVar.f18251c.h(r31Var)) {
            int i3 = r31Var.d;
            if (i3 != 2 && r31Var.f54715a != 17) {
                if (i3 == 1) {
                    cVar.f18255r = !cVar.f18255r;
                    cVar.f18250b.f35594g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i3 == 6) {
                    b0 b0Var = cVar.f18251c;
                    cVar.f18256s = true;
                    b0Var.h = true;
                    cVar.f18250b.f35594g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i3 == 7) {
                    b0 b0Var2 = cVar.f18251c;
                    cVar.f18256s = false;
                    b0Var2.h = false;
                    cVar.f18250b.f35594g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i3 == 3) {
                    cVar.f18258x = 0;
                    cVar.f18250b.f35594g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i3 == 4) {
                    cVar.f18258x = 1;
                    cVar.f18250b.f35594g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i3 == 5) {
                    cVar.f18258x = 2;
                    cVar.f18250b.f35594g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i3 == 8) {
                    t4.x(cVar.getParentActivity(), bd.M0(2131752823, null), bd.M0(2131752825, null), cVar.F, new r4() {
                        @Override
                        public final void L(int i10, int i11, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i10;
                                    ((l8) view).w(bd.Q(i10), true);
                                    cVar2.a0(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i10;
                                    ((l8) view).w(bd.Q(i10), true);
                                    cVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i3 == 9) {
                    t4.x(cVar.getParentActivity(), bd.M0(2131752826, null), bd.M0(2131752825, null), cVar.G, new r4() {
                        @Override
                        public final void L(int i10, int i11, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i10;
                                    ((l8) view).w(bd.Q(i10), true);
                                    cVar2.a0(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i10;
                                    ((l8) view).w(bd.Q(i10), true);
                                    cVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i3 == 10) {
                    boolean z10 = !cVar.f18257w;
                    cVar.f18257w = z10;
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
            cVar.presentFragment(new wm(bundle));
        }
    }
}

package ig;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.m61;
import org.telegram.ui.fo;
public final class a implements Utilities.Callback5, org.telegram.ui.ActionBar.z1 {
    public final int f11423a;
    public final c f11424b;

    public a(c cVar, int i10) {
        this.f11423a = i10;
        this.f11424b = cVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f11423a) {
            case 1:
                this.f11424b.X();
                return;
            default:
                this.f11424b.finishFragment();
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m61 m61Var = (m61) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.f11424b;
        if (!cVar.d.h(m61Var)) {
            int i10 = m61Var.d;
            if (i10 != 2 && m61Var.f42904a != 17) {
                if (i10 == 1) {
                    cVar.f11461s = !cVar.f11461s;
                    cVar.f11457c.W2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 6) {
                    a0 a0Var = cVar.d;
                    cVar.v = true;
                    a0Var.h = true;
                    cVar.f11457c.W2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 7) {
                    a0 a0Var2 = cVar.d;
                    cVar.v = false;
                    a0Var2.h = false;
                    cVar.f11457c.W2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 3) {
                    cVar.f11463x = 0;
                    cVar.f11457c.W2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 4) {
                    cVar.f11463x = 1;
                    cVar.f11457c.W2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 5) {
                    cVar.f11463x = 2;
                    cVar.f11457c.W2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 8) {
                    g5.x(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.F, new f5() {
                        @Override
                        public final void J(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.V(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 9) {
                    g5.x(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.G, new f5() {
                        @Override
                        public final void J(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.V(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 10) {
                    boolean z10 = !cVar.f11462w;
                    cVar.f11462w = z10;
                    ((w8) view).setChecked(z10);
                    cVar.V(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new fo(bundle));
        }
    }
}

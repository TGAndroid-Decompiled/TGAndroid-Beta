package hg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g61;
import org.telegram.ui.yn;
public final class a implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final int f11099a;
    public final c f11100b;

    public a(c cVar, int i10) {
        this.f11099a = i10;
        this.f11100b = cVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f11099a) {
            case 1:
                this.f11100b.W();
                return;
            default:
                this.f11100b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        g61 g61Var = (g61) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.f11100b;
        if (!cVar.d.h(g61Var)) {
            int i10 = g61Var.d;
            if (i10 != 2 && g61Var.f17183a != 17) {
                if (i10 == 1) {
                    cVar.f11141s = !cVar.f11141s;
                    cVar.f11136c.f25245f3.N(true);
                    cVar.T(true);
                    return;
                } else if (i10 == 6) {
                    a0 a0Var = cVar.d;
                    cVar.v = true;
                    a0Var.h = true;
                    cVar.f11136c.f25245f3.N(true);
                    cVar.T(true);
                    return;
                } else if (i10 == 7) {
                    a0 a0Var2 = cVar.d;
                    cVar.v = false;
                    a0Var2.h = false;
                    cVar.f11136c.f25245f3.N(true);
                    cVar.T(true);
                    return;
                } else if (i10 == 3) {
                    cVar.f11143x = 0;
                    cVar.f11136c.f25245f3.N(true);
                    cVar.T(true);
                    return;
                } else if (i10 == 4) {
                    cVar.f11143x = 1;
                    cVar.f11136c.f25245f3.N(true);
                    cVar.T(true);
                    return;
                } else if (i10 == 5) {
                    cVar.f11143x = 2;
                    cVar.f11136c.f25245f3.N(true);
                    cVar.T(true);
                    return;
                } else if (i10 == 8) {
                    e5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.F, new d5() {
                        @Override
                        public final void K(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.T(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.T(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 9) {
                    e5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.G, new d5() {
                        @Override
                        public final void K(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.T(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.T(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 10) {
                    boolean z10 = !cVar.f11142w;
                    cVar.f11142w = z10;
                    ((w8) view).setChecked(z10);
                    cVar.T(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new yn(bundle));
        }
    }
}

package gg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.v51;
import org.telegram.ui.eo;
public final class a implements Utilities.Callback5, org.telegram.ui.ActionBar.c2 {
    public final int f8797a;
    public final c f8798b;

    public a(c cVar, int i10) {
        this.f8797a = i10;
        this.f8798b = cVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f8797a) {
            case 1:
                this.f8798b.X();
                return;
            default:
                this.f8798b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        v51 v51Var = (v51) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.f8798b;
        if (!cVar.d.h(v51Var)) {
            int i10 = v51Var.d;
            if (i10 != 2 && v51Var.f14046a != 17) {
                if (i10 == 1) {
                    cVar.f8828s = !cVar.f8828s;
                    cVar.f8824c.Y2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 6) {
                    e0 e0Var = cVar.d;
                    cVar.v = true;
                    e0Var.h = true;
                    cVar.f8824c.Y2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 7) {
                    e0 e0Var2 = cVar.d;
                    cVar.v = false;
                    e0Var2.h = false;
                    cVar.f8824c.Y2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 3) {
                    cVar.f8830x = 0;
                    cVar.f8824c.Y2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 4) {
                    cVar.f8830x = 1;
                    cVar.f8824c.Y2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 5) {
                    cVar.f8830x = 2;
                    cVar.f8824c.Y2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 8) {
                    d5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.F, new c5() {
                        @Override
                        public final void I(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i11;
                                    ((s8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.V(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i11;
                                    ((s8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 9) {
                    d5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.G, new c5() {
                        @Override
                        public final void I(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i11;
                                    ((s8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.V(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i11;
                                    ((s8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 10) {
                    boolean z10 = !cVar.f8829w;
                    cVar.f8829w = z10;
                    ((x8) view).setChecked(z10);
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
            cVar.presentFragment(new eo(bundle));
        }
    }
}

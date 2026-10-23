package ig;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.h61;
import org.telegram.ui.qn;
public final class a implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final int f12808a;
    public final c f12809b;

    public a(c cVar, int i10) {
        this.f12808a = i10;
        this.f12809b = cVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f12808a) {
            case 1:
                this.f12809b.X();
                return;
            default:
                this.f12809b.finishFragment();
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h61 h61Var = (h61) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.f12809b;
        if (!cVar.d.h(h61Var)) {
            int i10 = h61Var.d;
            if (i10 != 2 && h61Var.f44300a != 17) {
                if (i10 == 1) {
                    cVar.f12840s = !cVar.f12840s;
                    cVar.f12836c.W2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 6) {
                    a0 a0Var = cVar.d;
                    cVar.v = true;
                    a0Var.h = true;
                    cVar.f12836c.W2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 7) {
                    a0 a0Var2 = cVar.d;
                    cVar.v = false;
                    a0Var2.h = false;
                    cVar.f12836c.W2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 3) {
                    cVar.f12842x = 0;
                    cVar.f12836c.W2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 4) {
                    cVar.f12842x = 1;
                    cVar.f12836c.W2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 5) {
                    cVar.f12842x = 2;
                    cVar.f12836c.W2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 8) {
                    f5.x(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.F, new e5() {
                        @Override
                        public final void C(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i11;
                                    ((q8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.V(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i11;
                                    ((q8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 9) {
                    f5.x(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.G, new e5() {
                        @Override
                        public final void C(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i11;
                                    ((q8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.V(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i11;
                                    ((q8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 10) {
                    boolean z10 = !cVar.f12841w;
                    cVar.f12841w = z10;
                    ((v8) view).setChecked(z10);
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
            cVar.presentFragment(new qn(bundle));
        }
    }
}

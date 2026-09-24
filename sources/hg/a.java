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
import org.telegram.ui.Components.v51;
import org.telegram.ui.wn;
public final class a implements Utilities.Callback5, org.telegram.ui.ActionBar.z1 {
    public final int f10189a;
    public final d f10190b;

    public a(d dVar, int i10) {
        this.f10189a = i10;
        this.f10190b = dVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f10189a) {
            case 1:
                this.f10190b.X();
                return;
            default:
                this.f10190b.finishFragment();
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
        final d dVar = this.f10190b;
        if (!dVar.d.h(v51Var)) {
            int i10 = v51Var.d;
            if (i10 != 2 && v51Var.f15700a != 17) {
                if (i10 == 1) {
                    dVar.f10234s = !dVar.f10234s;
                    dVar.f10230c.Y2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 6) {
                    c0 c0Var = dVar.d;
                    dVar.v = true;
                    c0Var.h = true;
                    dVar.f10230c.Y2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 7) {
                    c0 c0Var2 = dVar.d;
                    dVar.v = false;
                    c0Var2.h = false;
                    dVar.f10230c.Y2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 3) {
                    dVar.f10236x = 0;
                    dVar.f10230c.Y2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 4) {
                    dVar.f10236x = 1;
                    dVar.f10230c.Y2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 5) {
                    dVar.f10236x = 2;
                    dVar.f10230c.Y2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 8) {
                    e5.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.F, new d5() {
                        @Override
                        public final void J(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    dVar2.F = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    dVar2.V(true);
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    dVar3.G = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    dVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 9) {
                    e5.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.G, new d5() {
                        @Override
                        public final void J(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    dVar2.F = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    dVar2.V(true);
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    dVar3.G = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    dVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 10) {
                    boolean z10 = !dVar.f10235w;
                    dVar.f10235w = z10;
                    ((w8) view).setChecked(z10);
                    dVar.V(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", dVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            dVar.presentFragment(new wn(bundle));
        }
    }
}

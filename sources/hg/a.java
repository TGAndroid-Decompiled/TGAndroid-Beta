package hg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.i51;
import org.telegram.ui.bo;
public final class a implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final int f10203a;
    public final d f10204b;

    public a(d dVar, int i10) {
        this.f10203a = i10;
        this.f10204b = dVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f10203a) {
            case 1:
                this.f10204b.X();
                return;
            default:
                this.f10204b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        i51 i51Var = (i51) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final d dVar = this.f10204b;
        if (!dVar.d.h(i51Var)) {
            int i10 = i51Var.d;
            if (i10 != 2 && i51Var.f15531a != 17) {
                if (i10 == 1) {
                    dVar.f10248s = !dVar.f10248s;
                    dVar.f10244c.Y2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 6) {
                    c0 c0Var = dVar.d;
                    dVar.v = true;
                    c0Var.h = true;
                    dVar.f10244c.Y2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 7) {
                    c0 c0Var2 = dVar.d;
                    dVar.v = false;
                    c0Var2.h = false;
                    dVar.f10244c.Y2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 3) {
                    dVar.f10250x = 0;
                    dVar.f10244c.Y2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 4) {
                    dVar.f10250x = 1;
                    dVar.f10244c.Y2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 5) {
                    dVar.f10250x = 2;
                    dVar.f10244c.Y2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 8) {
                    c5.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.F, new b5() {
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
                    c5.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.G, new b5() {
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
                    boolean z10 = !dVar.f10249w;
                    dVar.f10249w = z10;
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
            dVar.presentFragment(new bo(bundle));
        }
    }
}

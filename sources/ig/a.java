package ig;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.h51;
import org.telegram.ui.co;
public final class a implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final int f11976a;
    public final c f11977b;

    public a(c cVar, int i10) {
        this.f11976a = i10;
        this.f11977b = cVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f11976a) {
            case 1:
                this.f11977b.X();
                return;
            default:
                this.f11977b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h51 h51Var = (h51) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.f11977b;
        if (!cVar.d.h(h51Var)) {
            int i10 = h51Var.d;
            if (i10 != 2 && h51Var.f44071a != 17) {
                if (i10 == 1) {
                    cVar.f12018s = !cVar.f12018s;
                    cVar.f12013c.Y2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 6) {
                    a0 a0Var = cVar.d;
                    cVar.v = true;
                    a0Var.h = true;
                    cVar.f12013c.Y2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 7) {
                    a0 a0Var2 = cVar.d;
                    cVar.v = false;
                    a0Var2.h = false;
                    cVar.f12013c.Y2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 3) {
                    cVar.f12020x = 0;
                    cVar.f12013c.Y2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 4) {
                    cVar.f12020x = 1;
                    cVar.f12013c.Y2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 5) {
                    cVar.f12020x = 2;
                    cVar.f12013c.Y2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 8) {
                    e5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.F, new d5() {
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
                    e5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.G, new d5() {
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
                    boolean z10 = !cVar.f12019w;
                    cVar.f12019w = z10;
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
            cVar.presentFragment(new co(bundle));
        }
    }
}

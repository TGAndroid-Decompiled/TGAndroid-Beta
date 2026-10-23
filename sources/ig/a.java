package ig;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.m61;
import org.telegram.ui.sn;
public final class a implements Utilities.Callback5, org.telegram.ui.ActionBar.z1 {
    public final int f12840a;
    public final c f12841b;

    public a(c cVar, int i10) {
        this.f12840a = i10;
        this.f12841b = cVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f12840a) {
            case 1:
                this.f12841b.X();
                return;
            default:
                this.f12841b.finishFragment();
                return;
        }
    }

    @Override
    public void mo0run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m61 m61Var = (m61) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.f12841b;
        if (!cVar.e.h(m61Var)) {
            int i10 = m61Var.d;
            if (i10 != 2 && m61Var.f44713a != 17) {
                if (i10 == 1) {
                    cVar.v = !cVar.v;
                    cVar.d.Z2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 6) {
                    a0 a0Var = cVar.e;
                    cVar.f12871w = true;
                    a0Var.h = true;
                    cVar.d.Z2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 7) {
                    a0 a0Var2 = cVar.e;
                    cVar.f12871w = false;
                    a0Var2.h = false;
                    cVar.d.Z2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 3) {
                    cVar.f12873y = 0;
                    cVar.d.Z2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 4) {
                    cVar.f12873y = 1;
                    cVar.d.Z2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 5) {
                    cVar.f12873y = 2;
                    cVar.d.Z2.N(true);
                    cVar.V(true);
                    return;
                } else if (i10 == 8) {
                    f5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.G, new d5() {
                        @Override
                        public final void C(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.G = i11;
                                    ((r8) view).w(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.V(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.H = i11;
                                    ((r8) view).w(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 9) {
                    f5.y(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.H, new d5() {
                        @Override
                        public final void C(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.G = i11;
                                    ((r8) view).w(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.V(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.H = i11;
                                    ((r8) view).w(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.V(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 10) {
                    boolean z10 = !cVar.f12872x;
                    cVar.f12872x = z10;
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
            cVar.presentFragment(new sn(bundle));
        }
    }
}

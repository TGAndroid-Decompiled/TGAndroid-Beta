package jg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.t61;
import org.telegram.ui.un;
public final class a implements Utilities.Callback5, org.telegram.ui.ActionBar.b2 {
    public final int f15618a;
    public final c f15619b;

    public a(c cVar, int i10) {
        this.f15618a = i10;
        this.f15619b = cVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f15618a) {
            case 1:
                this.f15619b.Y();
                return;
            default:
                this.f15619b.finishFragment();
                return;
        }
    }

    @Override
    public void mo5run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        t61 t61Var = (t61) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final c cVar = this.f15619b;
        if (!cVar.f15647c.h(t61Var)) {
            int i10 = t61Var.d;
            if (i10 != 2 && t61Var.f47040a != 17) {
                if (i10 == 1) {
                    cVar.f15650r = !cVar.f15650r;
                    cVar.f15646b.f32152g3.O(true);
                    cVar.W(true);
                    return;
                } else if (i10 == 6) {
                    b0 b0Var = cVar.f15647c;
                    cVar.f15651s = true;
                    b0Var.h = true;
                    cVar.f15646b.f32152g3.O(true);
                    cVar.W(true);
                    return;
                } else if (i10 == 7) {
                    b0 b0Var2 = cVar.f15647c;
                    cVar.f15651s = false;
                    b0Var2.h = false;
                    cVar.f15646b.f32152g3.O(true);
                    cVar.W(true);
                    return;
                } else if (i10 == 3) {
                    cVar.f15652w = 0;
                    cVar.f15646b.f32152g3.O(true);
                    cVar.W(true);
                    return;
                } else if (i10 == 4) {
                    cVar.f15652w = 1;
                    cVar.f15646b.f32152g3.O(true);
                    cVar.W(true);
                    return;
                } else if (i10 == 5) {
                    cVar.f15652w = 2;
                    cVar.f15646b.f32152g3.O(true);
                    cVar.W(true);
                    return;
                } else if (i10 == 8) {
                    g5.x(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.E, new e5() {
                        @Override
                        public final void G(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.E = i11;
                                    ((v8) view).w(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.W(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.F = i11;
                                    ((v8) view).w(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.W(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 9) {
                    g5.x(cVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), cVar.F, new e5() {
                        @Override
                        public final void G(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.E = i11;
                                    ((v8) view).w(LocaleController.formatShortDateTime(i11), true);
                                    cVar2.W(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.F = i11;
                                    ((v8) view).w(LocaleController.formatShortDateTime(i11), true);
                                    cVar3.W(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 10) {
                    boolean z10 = !cVar.v;
                    cVar.v = z10;
                    ((a9) view).setChecked(z10);
                    cVar.W(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new un(bundle));
        }
    }
}

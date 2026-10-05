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
import org.telegram.ui.Components.h61;
import org.telegram.ui.yn;
public final class a implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final int f11100a;
    public final d f11101b;

    public a(d dVar, int i10) {
        this.f11100a = i10;
        this.f11101b = dVar;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f11100a) {
            case 1:
                this.f11101b.W();
                return;
            default:
                this.f11101b.finishFragment();
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        h61 h61Var = (h61) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final d dVar = this.f11101b;
        if (!dVar.d.h(h61Var)) {
            int i10 = h61Var.d;
            if (i10 != 2 && h61Var.f17192a != 17) {
                if (i10 == 1) {
                    dVar.f11143s = !dVar.f11143s;
                    dVar.f11138c.f26034f3.N(true);
                    dVar.T(true);
                    return;
                } else if (i10 == 6) {
                    b0 b0Var = dVar.d;
                    dVar.v = true;
                    b0Var.h = true;
                    dVar.f11138c.f26034f3.N(true);
                    dVar.T(true);
                    return;
                } else if (i10 == 7) {
                    b0 b0Var2 = dVar.d;
                    dVar.v = false;
                    b0Var2.h = false;
                    dVar.f11138c.f26034f3.N(true);
                    dVar.T(true);
                    return;
                } else if (i10 == 3) {
                    dVar.f11145x = 0;
                    dVar.f11138c.f26034f3.N(true);
                    dVar.T(true);
                    return;
                } else if (i10 == 4) {
                    dVar.f11145x = 1;
                    dVar.f11138c.f26034f3.N(true);
                    dVar.T(true);
                    return;
                } else if (i10 == 5) {
                    dVar.f11145x = 2;
                    dVar.f11138c.f26034f3.N(true);
                    dVar.T(true);
                    return;
                } else if (i10 == 8) {
                    e5.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.F, new d5() {
                        @Override
                        public final void K(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    dVar2.F = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    dVar2.T(true);
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    dVar3.G = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    dVar3.T(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 9) {
                    e5.y(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.G, new d5() {
                        @Override
                        public final void K(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    d dVar2 = dVar;
                                    dVar2.getClass();
                                    dVar2.F = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    dVar2.T(true);
                                    return;
                                default:
                                    d dVar3 = dVar;
                                    dVar3.getClass();
                                    dVar3.G = i11;
                                    ((r8) view).u(LocaleController.formatShortDateTime(i11), true);
                                    dVar3.T(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 10) {
                    boolean z10 = !dVar.f11144w;
                    dVar.f11144w = z10;
                    ((w8) view).setChecked(z10);
                    dVar.T(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", dVar.getUserConfig().getClientUserId());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            dVar.presentFragment(new yn(bundle));
        }
    }
}

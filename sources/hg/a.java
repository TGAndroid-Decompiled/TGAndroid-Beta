package hg;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.p61;
import org.telegram.ui.zn;
public final class a implements Utilities.Callback5, org.telegram.ui.ActionBar.a2 {
    public final int f11148a;
    public final d f11149b;

    public a(d dVar, int i10) {
        this.f11148a = i10;
        this.f11149b = dVar;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f11148a) {
            case 1:
                this.f11149b.X();
                return;
            default:
                this.f11149b.finishFragment();
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        p61 p61Var = (p61) obj;
        final View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        final d dVar = this.f11149b;
        if (!dVar.d.h(p61Var)) {
            int i10 = p61Var.d;
            if (i10 != 2 && p61Var.f17125a != 17) {
                if (i10 == 1) {
                    dVar.f11194s = !dVar.f11194s;
                    dVar.f11189c.W2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 6) {
                    b0 b0Var = dVar.d;
                    dVar.v = true;
                    b0Var.h = true;
                    dVar.f11189c.W2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 7) {
                    b0 b0Var2 = dVar.d;
                    dVar.v = false;
                    b0Var2.h = false;
                    dVar.f11189c.W2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 3) {
                    dVar.f11196x = 0;
                    dVar.f11189c.W2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 4) {
                    dVar.f11196x = 1;
                    dVar.f11189c.W2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 5) {
                    dVar.f11196x = 2;
                    dVar.f11189c.W2.N(true);
                    dVar.V(true);
                    return;
                } else if (i10 == 8) {
                    g5.x(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomStartTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.F, new f5() {
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
                    g5.x(dVar.getParentActivity(), LocaleController.getString(R.string.BusinessAwayScheduleCustomEndTitle), LocaleController.getString(R.string.BusinessAwayScheduleCustomSetButton), dVar.G, new f5() {
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
                    boolean z10 = !dVar.f11195w;
                    dVar.f11195w = z10;
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
            dVar.presentFragment(new zn(bundle));
        }
    }
}

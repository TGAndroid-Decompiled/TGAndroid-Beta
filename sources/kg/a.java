package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.gd;
import org.telegram.messenger.u10;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.z4;
import org.telegram.ui.bn;
public final class a implements u10, org.telegram.ui.ActionBar.q1 {
    public final int f18334a;
    public final c f18335b;

    public a(c cVar, int i7) {
        this.f18334a = i7;
        this.f18335b = cVar;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18334a) {
            case 1:
                this.f18335b.c0();
                return;
            default:
                this.f18335b.finishFragment();
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        n41 n41Var = (n41) obj;
        final View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        final c cVar = this.f18335b;
        if (!cVar.f18356c.h(n41Var)) {
            int i7 = n41Var.d;
            if (i7 != 2 && n41Var.f56712a != 17) {
                if (i7 == 1) {
                    cVar.f18360r = !cVar.f18360r;
                    cVar.f18355b.f35323g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 6) {
                    b0 b0Var = cVar.f18356c;
                    cVar.f18361s = true;
                    b0Var.h = true;
                    cVar.f18355b.f35323g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 7) {
                    b0 b0Var2 = cVar.f18356c;
                    cVar.f18361s = false;
                    b0Var2.h = false;
                    cVar.f18355b.f35323g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 3) {
                    cVar.f18363x = 0;
                    cVar.f18355b.f35323g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 4) {
                    cVar.f18363x = 1;
                    cVar.f18355b.f35323g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 5) {
                    cVar.f18363x = 2;
                    cVar.f18355b.f35323g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 8) {
                    b5.x(cVar.getParentActivity(), gd.N0(2131752811, null), gd.N0(2131752813, null), cVar.F, new z4() {
                        @Override
                        public final void I(int i10, int i11, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i10;
                                    ((m8) view).w(gd.Q(i10), true);
                                    cVar2.a0(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i10;
                                    ((m8) view).w(gd.Q(i10), true);
                                    cVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i7 == 9) {
                    b5.x(cVar.getParentActivity(), gd.N0(2131752814, null), gd.N0(2131752813, null), cVar.G, new z4() {
                        @Override
                        public final void I(int i10, int i11, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i10;
                                    ((m8) view).w(gd.Q(i10), true);
                                    cVar2.a0(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i10;
                                    ((m8) view).w(gd.Q(i10), true);
                                    cVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i7 == 10) {
                    boolean z10 = !cVar.f18362w;
                    cVar.f18362w = z10;
                    ((r8) view).setChecked(z10);
                    cVar.a0(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", cVar.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            cVar.presentFragment(new bn(bundle));
        }
    }
}

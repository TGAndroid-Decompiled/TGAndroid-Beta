package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.gd;
import org.telegram.messenger.v10;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.o41;
import org.telegram.ui.bn;
public final class a implements v10, org.telegram.ui.ActionBar.q1 {
    public final int f18269a;
    public final c f18270b;

    public a(c cVar, int i7) {
        this.f18269a = i7;
        this.f18270b = cVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18269a) {
            case 1:
                this.f18270b.c0();
                return;
            default:
                this.f18270b.finishFragment();
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        o41 o41Var = (o41) obj;
        final View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        final c cVar = this.f18270b;
        if (!cVar.f18291c.h(o41Var)) {
            int i7 = o41Var.d;
            if (i7 != 2 && o41Var.f56630a != 17) {
                if (i7 == 1) {
                    cVar.f18295r = !cVar.f18295r;
                    cVar.f18290b.f35796g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 6) {
                    b0 b0Var = cVar.f18291c;
                    cVar.f18296s = true;
                    b0Var.h = true;
                    cVar.f18290b.f35796g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 7) {
                    b0 b0Var2 = cVar.f18291c;
                    cVar.f18296s = false;
                    b0Var2.h = false;
                    cVar.f18290b.f35796g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 3) {
                    cVar.f18298x = 0;
                    cVar.f18290b.f35796g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 4) {
                    cVar.f18298x = 1;
                    cVar.f18290b.f35796g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 5) {
                    cVar.f18298x = 2;
                    cVar.f18290b.f35796g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 8) {
                    c5.x(cVar.getParentActivity(), gd.N0(2131752811, null), gd.N0(2131752813, null), cVar.F, new a5() {
                        @Override
                        public final void O(int i10, int i11, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i10;
                                    ((n8) view).w(gd.Q(i10), true);
                                    cVar2.a0(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i10;
                                    ((n8) view).w(gd.Q(i10), true);
                                    cVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i7 == 9) {
                    c5.x(cVar.getParentActivity(), gd.N0(2131752814, null), gd.N0(2131752813, null), cVar.G, new a5() {
                        @Override
                        public final void O(int i10, int i11, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i10;
                                    ((n8) view).w(gd.Q(i10), true);
                                    cVar2.a0(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i10;
                                    ((n8) view).w(gd.Q(i10), true);
                                    cVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i7 == 10) {
                    boolean z10 = !cVar.f18297w;
                    cVar.f18297w = z10;
                    ((s8) view).setChecked(z10);
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

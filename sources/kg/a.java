package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.hd;
import org.telegram.messenger.w10;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.o41;
import org.telegram.ui.bn;
public final class a implements w10, org.telegram.ui.ActionBar.q1 {
    public final int f18235a;
    public final c f18236b;

    public a(c cVar, int i7) {
        this.f18235a = i7;
        this.f18236b = cVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18235a) {
            case 1:
                this.f18236b.c0();
                return;
            default:
                this.f18236b.finishFragment();
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
        final c cVar = this.f18236b;
        if (!cVar.f18260c.h(o41Var)) {
            int i7 = o41Var.d;
            if (i7 != 2 && o41Var.f56599a != 17) {
                if (i7 == 1) {
                    cVar.f18264r = !cVar.f18264r;
                    cVar.f18259b.f35742g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 6) {
                    b0 b0Var = cVar.f18260c;
                    cVar.f18265s = true;
                    b0Var.h = true;
                    cVar.f18259b.f35742g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 7) {
                    b0 b0Var2 = cVar.f18260c;
                    cVar.f18265s = false;
                    b0Var2.h = false;
                    cVar.f18259b.f35742g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 3) {
                    cVar.f18267x = 0;
                    cVar.f18259b.f35742g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 4) {
                    cVar.f18267x = 1;
                    cVar.f18259b.f35742g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 5) {
                    cVar.f18267x = 2;
                    cVar.f18259b.f35742g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 8) {
                    c5.x(cVar.getParentActivity(), hd.N0(2131752811, null), hd.N0(2131752813, null), cVar.F, new a5() {
                        @Override
                        public final void O(int i10, int i11, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i10;
                                    ((n8) view).w(hd.Q(i10), true);
                                    cVar2.a0(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i10;
                                    ((n8) view).w(hd.Q(i10), true);
                                    cVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i7 == 9) {
                    c5.x(cVar.getParentActivity(), hd.N0(2131752814, null), hd.N0(2131752813, null), cVar.G, new a5() {
                        @Override
                        public final void O(int i10, int i11, boolean z10) {
                            switch (r3) {
                                case 0:
                                    c cVar2 = cVar;
                                    cVar2.getClass();
                                    cVar2.F = i10;
                                    ((n8) view).w(hd.Q(i10), true);
                                    cVar2.a0(true);
                                    return;
                                default:
                                    c cVar3 = cVar;
                                    cVar3.getClass();
                                    cVar3.G = i10;
                                    ((n8) view).w(hd.Q(i10), true);
                                    cVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i7 == 10) {
                    boolean z10 = !cVar.f18266w;
                    cVar.f18266w = z10;
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

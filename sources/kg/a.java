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
    public final int f18272a;
    public final c f18273b;

    public a(c cVar, int i7) {
        this.f18272a = i7;
        this.f18273b = cVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f18272a) {
            case 1:
                this.f18273b.c0();
                return;
            default:
                this.f18273b.finishFragment();
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
        final c cVar = this.f18273b;
        if (!cVar.f18294c.h(o41Var)) {
            int i7 = o41Var.d;
            if (i7 != 2 && o41Var.f56634a != 17) {
                if (i7 == 1) {
                    cVar.f18298r = !cVar.f18298r;
                    cVar.f18293b.f35789g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 6) {
                    b0 b0Var = cVar.f18294c;
                    cVar.f18299s = true;
                    b0Var.h = true;
                    cVar.f18293b.f35789g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 7) {
                    b0 b0Var2 = cVar.f18294c;
                    cVar.f18299s = false;
                    b0Var2.h = false;
                    cVar.f18293b.f35789g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 3) {
                    cVar.f18301x = 0;
                    cVar.f18293b.f35789g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 4) {
                    cVar.f18301x = 1;
                    cVar.f18293b.f35789g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 5) {
                    cVar.f18301x = 2;
                    cVar.f18293b.f35789g3.O(true);
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
                    boolean z10 = !cVar.f18300w;
                    cVar.f18300w = z10;
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

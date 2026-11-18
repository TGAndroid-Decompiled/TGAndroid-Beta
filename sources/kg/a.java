package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.gd;
import org.telegram.messenger.v10;
import org.telegram.ui.Cells.n8;
import org.telegram.ui.Cells.s8;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z4;
import org.telegram.ui.bn;
public final class a implements v10, org.telegram.ui.ActionBar.r1 {
    public final int f18238a;
    public final c f18239b;

    public a(c cVar, int i7) {
        this.f18238a = i7;
        this.f18239b = cVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f18238a) {
            case 1:
                this.f18239b.c0();
                return;
            default:
                this.f18239b.finishFragment();
                return;
        }
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        l41 l41Var = (l41) obj;
        final View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        final c cVar = this.f18239b;
        if (!cVar.f18259c.h(l41Var)) {
            int i7 = l41Var.d;
            if (i7 != 2 && l41Var.f56589a != 17) {
                if (i7 == 1) {
                    cVar.f18263r = !cVar.f18263r;
                    cVar.f18258b.f34607g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 6) {
                    a0 a0Var = cVar.f18259c;
                    cVar.f18264s = true;
                    a0Var.h = true;
                    cVar.f18258b.f34607g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 7) {
                    a0 a0Var2 = cVar.f18259c;
                    cVar.f18264s = false;
                    a0Var2.h = false;
                    cVar.f18258b.f34607g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 3) {
                    cVar.f18266x = 0;
                    cVar.f18258b.f34607g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 4) {
                    cVar.f18266x = 1;
                    cVar.f18258b.f34607g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 5) {
                    cVar.f18266x = 2;
                    cVar.f18258b.f34607g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 8) {
                    b5.x(cVar.getParentActivity(), gd.M0(2131752812, null), gd.M0(2131752814, null), cVar.F, new z4() {
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
                    b5.x(cVar.getParentActivity(), gd.M0(2131752815, null), gd.M0(2131752814, null), cVar.G, new z4() {
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
                    boolean z10 = !cVar.f18265w;
                    cVar.f18265w = z10;
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

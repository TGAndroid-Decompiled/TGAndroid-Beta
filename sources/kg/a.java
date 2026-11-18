package kg;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.gd;
import org.telegram.messenger.v10;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.r8;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z4;
import org.telegram.ui.bn;
public final class a implements v10, org.telegram.ui.ActionBar.r1 {
    public final int f18241a;
    public final c f18242b;

    public a(c cVar, int i7) {
        this.f18241a = i7;
        this.f18242b = cVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f18241a) {
            case 1:
                this.f18242b.c0();
                return;
            default:
                this.f18242b.finishFragment();
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
        final c cVar = this.f18242b;
        if (!cVar.f18262c.h(l41Var)) {
            int i7 = l41Var.d;
            if (i7 != 2 && l41Var.f56589a != 17) {
                if (i7 == 1) {
                    cVar.f18266r = !cVar.f18266r;
                    cVar.f18261b.f34607g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 6) {
                    a0 a0Var = cVar.f18262c;
                    cVar.f18267s = true;
                    a0Var.h = true;
                    cVar.f18261b.f34607g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 7) {
                    a0 a0Var2 = cVar.f18262c;
                    cVar.f18267s = false;
                    a0Var2.h = false;
                    cVar.f18261b.f34607g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 3) {
                    cVar.f18269x = 0;
                    cVar.f18261b.f34607g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 4) {
                    cVar.f18269x = 1;
                    cVar.f18261b.f34607g3.O(true);
                    cVar.a0(true);
                    return;
                } else if (i7 == 5) {
                    cVar.f18269x = 2;
                    cVar.f18261b.f34607g3.O(true);
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
                    b5.x(cVar.getParentActivity(), gd.M0(2131752815, null), gd.M0(2131752814, null), cVar.G, new z4() {
                        @Override
                        public final void O(int i10, int i11, boolean z10) {
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
                    boolean z10 = !cVar.f18268w;
                    cVar.f18268w = z10;
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

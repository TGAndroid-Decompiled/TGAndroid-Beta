package ag;

import android.os.Bundle;
import android.view.View;
import java.io.Serializable;
import org.telegram.messenger.dd;
import org.telegram.messenger.p20;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.s4;
import org.telegram.ui.un;
public final class b implements p20, org.telegram.ui.ActionBar.u1 {
    public final int f463a;
    public final f f464b;

    public b(f fVar, int i10) {
        this.f463a = i10;
        this.f464b = fVar;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f463a) {
            case 1:
                this.f464b.c0();
                return;
            default:
                this.f464b.finishFragment();
                return;
        }
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b51 b51Var = (b51) obj;
        final View view = (View) obj2;
        Integer num = (Integer) number;
        Float f7 = (Float) serializable;
        Float f10 = (Float) serializable2;
        final f fVar = this.f464b;
        if (!fVar.f505c.h(b51Var)) {
            int i10 = b51Var.d;
            if (i10 != 2 && b51Var.f7681a != 17) {
                if (i10 == 1) {
                    fVar.f508r = !fVar.f508r;
                    fVar.f504b.f31183f3.O(true);
                    fVar.a0(true);
                    return;
                } else if (i10 == 6) {
                    x0 x0Var = fVar.f505c;
                    fVar.f509s = true;
                    x0Var.h = true;
                    fVar.f504b.f31183f3.O(true);
                    fVar.a0(true);
                    return;
                } else if (i10 == 7) {
                    x0 x0Var2 = fVar.f505c;
                    fVar.f509s = false;
                    x0Var2.h = false;
                    fVar.f504b.f31183f3.O(true);
                    fVar.a0(true);
                    return;
                } else if (i10 == 3) {
                    fVar.f511x = 0;
                    fVar.f504b.f31183f3.O(true);
                    fVar.a0(true);
                    return;
                } else if (i10 == 4) {
                    fVar.f511x = 1;
                    fVar.f504b.f31183f3.O(true);
                    fVar.a0(true);
                    return;
                } else if (i10 == 5) {
                    fVar.f511x = 2;
                    fVar.f504b.f31183f3.O(true);
                    fVar.a0(true);
                    return;
                } else if (i10 == 8) {
                    s4.x(fVar.getParentActivity(), dd.L0(2131752823, null), dd.L0(2131752825, null), fVar.E, new q4() {
                        @Override
                        public final void K(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    f fVar2 = fVar;
                                    fVar2.getClass();
                                    fVar2.E = i11;
                                    ((p8) view).w(dd.Q(i11), true);
                                    fVar2.a0(true);
                                    return;
                                default:
                                    f fVar3 = fVar;
                                    fVar3.getClass();
                                    fVar3.F = i11;
                                    ((p8) view).w(dd.Q(i11), true);
                                    fVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 9) {
                    s4.x(fVar.getParentActivity(), dd.L0(2131752826, null), dd.L0(2131752825, null), fVar.F, new q4() {
                        @Override
                        public final void K(int i11, int i12, boolean z10) {
                            switch (r3) {
                                case 0:
                                    f fVar2 = fVar;
                                    fVar2.getClass();
                                    fVar2.E = i11;
                                    ((p8) view).w(dd.Q(i11), true);
                                    fVar2.a0(true);
                                    return;
                                default:
                                    f fVar3 = fVar;
                                    fVar3.getClass();
                                    fVar3.F = i11;
                                    ((p8) view).w(dd.Q(i11), true);
                                    fVar3.a0(true);
                                    return;
                            }
                        }
                    });
                    return;
                } else if (i10 == 10) {
                    boolean z10 = !fVar.f510w;
                    fVar.f510w = z10;
                    ((t8) view).setChecked(z10);
                    fVar.a0(true);
                    return;
                } else {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", fVar.getUserConfig().e());
            bundle.putInt("chatMode", 5);
            bundle.putString("quick_reply", "away");
            fVar.presentFragment(new un(bundle));
        }
    }
}

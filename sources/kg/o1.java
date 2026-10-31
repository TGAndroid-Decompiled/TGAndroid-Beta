package kg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.om0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fr;
import org.telegram.ui.st0;
public final class o1 implements gk0 {
    public final int f11209a;
    public final int f11210b;
    public final org.telegram.ui.ActionBar.k2 f11211c;
    public final Object d;

    public o1(Object obj, int i10, org.telegram.ui.ActionBar.k2 k2Var, int i11) {
        this.f11209a = i11;
        this.d = obj;
        this.f11210b = i10;
        this.f11211c = k2Var;
    }

    @Override
    public final void f(int i10, View view) {
        sg.o0 o0Var;
        switch (this.f11209a) {
            case 0:
                v1 v1Var = (v1) this.d;
                if (view instanceof st0) {
                    st0 st0Var = (st0) view;
                    PremiumPreviewFragment.u0(this.f11210b, st0Var.f41647f.f37112a);
                    v1Var.t(new i1(this.f11211c, st0Var.f41647f.f37112a, false));
                    return;
                }
                return;
            default:
                rm0 rm0Var = (rm0) this.d;
                ArrayList arrayList = rm0Var.f29961r;
                ag.b1 b1Var = rm0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!d20.i(this.f11210b).q()) {
                        new i1(this.f11211c, 24, true).show();
                        return;
                    }
                    long j10 = ((om0) arrayList.get(i10)).f29100a.h;
                    if (rm0Var.h == j10) {
                        o0Var = null;
                    } else {
                        o0Var = ((om0) arrayList.get(i10)).f29100a;
                    }
                    if (rm0Var.f(o0Var)) {
                        for (int i11 = 0; i11 < b1Var.getChildCount(); i11++) {
                            if (b1Var.getChildAt(i11) == view) {
                                float f7 = 50.0f;
                                if (i11 <= 1) {
                                    if (i11 == 0) {
                                        f7 = 90.0f;
                                    }
                                    b1Var.w0(-org.telegram.messenger.i0.L(f7), 0, null);
                                } else if (i11 >= b1Var.getChildCount() - 2) {
                                    if (i11 == b1Var.getChildCount() - 1) {
                                        f7 = 80.0f;
                                    }
                                    b1Var.w0(org.telegram.messenger.i0.L(f7), 0, null);
                                }
                            }
                        }
                        b1Var.M(new fr(3));
                        if (rm0Var.h == j10) {
                            rm0Var.h = 0L;
                            return;
                        }
                        rm0Var.h = j10;
                        ((qm0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

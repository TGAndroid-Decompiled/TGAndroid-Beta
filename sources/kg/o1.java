package kg;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.e20;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.fr;
import org.telegram.ui.rt0;
public final class o1 implements hk0 {
    public final int f11210a;
    public final int f11211b;
    public final org.telegram.ui.ActionBar.k2 f11212c;
    public final Object d;

    public o1(Object obj, int i10, org.telegram.ui.ActionBar.k2 k2Var, int i11) {
        this.f11210a = i11;
        this.d = obj;
        this.f11211b = i10;
        this.f11212c = k2Var;
    }

    @Override
    public final void f(int i10, View view) {
        sg.o0 o0Var;
        switch (this.f11210a) {
            case 0:
                v1 v1Var = (v1) this.d;
                if (view instanceof rt0) {
                    rt0 rt0Var = (rt0) view;
                    PremiumPreviewFragment.v0(this.f11211b, rt0Var.f41152f.f36680a);
                    v1Var.t(new i1(this.f11212c, rt0Var.f41152f.f36680a, false));
                    return;
                }
                return;
            default:
                sm0 sm0Var = (sm0) this.d;
                ArrayList arrayList = sm0Var.f30340r;
                ag.b1 b1Var = sm0Var.d;
                if (i10 >= 0 && i10 < arrayList.size()) {
                    if (!e20.i(this.f11211b).q()) {
                        new i1(this.f11212c, 24, true).show();
                        return;
                    }
                    long j10 = ((pm0) arrayList.get(i10)).f29453a.h;
                    if (sm0Var.h == j10) {
                        o0Var = null;
                    } else {
                        o0Var = ((pm0) arrayList.get(i10)).f29453a;
                    }
                    if (sm0Var.f(o0Var)) {
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
                        if (sm0Var.h == j10) {
                            sm0Var.h = 0L;
                            return;
                        }
                        sm0Var.h = j10;
                        ((rm0) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

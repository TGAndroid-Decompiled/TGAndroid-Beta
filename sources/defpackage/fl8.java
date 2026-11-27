package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;
public final class fl8 implements r69 {
    public final byte a;
    public final int b;
    public final e c;
    public final Object d;

    public fl8(Object obj, int i, e eVar, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = eVar;
    }

    @Override
    public final void e(int i, View view) {
        w49 w49Var;
        byte b = this.a;
        e eVar = this.c;
        int i2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                kl8 kl8Var = (kl8) obj;
                if (view instanceof yk8) {
                    yk8 yk8Var = (yk8) view;
                    PremiumPreviewFragment.u0(i2, yk8Var.f.a);
                    kl8Var.u(new xk8(eVar, (int) yk8Var.f.a, false));
                    return;
                }
                return;
            default:
                ow9 ow9Var = (ow9) obj;
                ArrayList arrayList = ow9Var.r;
                gw9 gw9Var = ow9Var.d;
                if (i >= 0 && i < arrayList.size()) {
                    if (!yac.h(i2).p()) {
                        new xk8(eVar, 24, true).show();
                        return;
                    }
                    long j = ((lw9) arrayList.get(i)).a.h;
                    if (ow9Var.h == j) {
                        w49Var = null;
                    } else {
                        w49Var = ((lw9) arrayList.get(i)).a;
                    }
                    if (ow9Var.f(w49Var)) {
                        for (int i3 = 0; i3 < gw9Var.getChildCount(); i3++) {
                            if (gw9Var.getChildAt(i3) == view) {
                                float f = 50.0f;
                                if (i3 <= 1) {
                                    if (i3 == 0) {
                                        f = 90.0f;
                                    }
                                    gw9Var.y0(-hl.L(f), 0, null);
                                } else if (i3 >= gw9Var.getChildCount() - 2) {
                                    if (i3 == gw9Var.getChildCount() - 1) {
                                        f = 80.0f;
                                    }
                                    gw9Var.y0(hl.L(f), 0, null);
                                }
                            }
                        }
                        gw9Var.N(new t42((byte) 3));
                        if (ow9Var.h == j) {
                            ow9Var.h = 0L;
                            return;
                        }
                        ow9Var.h = j;
                        ((nw9) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

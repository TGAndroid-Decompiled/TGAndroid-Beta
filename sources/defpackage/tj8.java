package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
public final class tj8 implements f59 {
    public final byte a;
    public final int b;
    public final d c;
    public final Object d;

    public tj8(Object obj, int i, d dVar, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = dVar;
    }

    @Override
    public final void g(int i, View view) {
        k39 k39Var;
        byte b = this.a;
        d dVar = this.c;
        int i2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                yj8 yj8Var = (yj8) obj;
                if (view instanceof lj8) {
                    lj8 lj8Var = (lj8) view;
                    PremiumPreviewFragment.v0(i2, lj8Var.f.a);
                    yj8Var.t(new kj8(dVar, (int) lj8Var.f.a, false));
                    return;
                }
                return;
            default:
                xu9 xu9Var = (xu9) obj;
                ArrayList arrayList = xu9Var.r;
                pu9 pu9Var = xu9Var.d;
                if (i >= 0 && i < arrayList.size()) {
                    if (!z8c.h(i2).p()) {
                        new kj8(dVar, 24, true).show();
                        return;
                    }
                    long j = ((uu9) arrayList.get(i)).a.h;
                    if (xu9Var.h == j) {
                        k39Var = null;
                    } else {
                        k39Var = ((uu9) arrayList.get(i)).a;
                    }
                    if (xu9Var.f(k39Var)) {
                        for (int i3 = 0; i3 < pu9Var.getChildCount(); i3++) {
                            if (pu9Var.getChildAt(i3) == view) {
                                float f = 50.0f;
                                if (i3 <= 1) {
                                    if (i3 == 0) {
                                        f = 90.0f;
                                    }
                                    pu9Var.x0(-gm.L(f), 0, null);
                                } else if (i3 >= pu9Var.getChildCount() - 2) {
                                    if (i3 == pu9Var.getChildCount() - 1) {
                                        f = 80.0f;
                                    }
                                    pu9Var.x0(gm.L(f), 0, null);
                                }
                            }
                        }
                        pu9Var.M(new o52((byte) 3));
                        if (xu9Var.h == j) {
                            xu9Var.h = 0L;
                            return;
                        }
                        xu9Var.h = j;
                        ((wu9) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

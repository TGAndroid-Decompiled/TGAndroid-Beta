package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
public final class sh8 implements c39 {
    public final byte a;
    public final int b;
    public final d c;
    public final Object d;

    public sh8(Object obj, int i, d dVar, byte b) {
        this.a = b;
        this.d = obj;
        this.b = i;
        this.c = dVar;
    }

    @Override
    public final void d(int i, View view) {
        h19 h19Var;
        byte b = this.a;
        d dVar = this.c;
        int i2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                xh8 xh8Var = (xh8) obj;
                if (view instanceof kh8) {
                    kh8 kh8Var = (kh8) view;
                    PremiumPreviewFragment.u0(i2, kh8Var.f.a);
                    xh8Var.u(new jh8(dVar, (int) kh8Var.f.a, false));
                    return;
                }
                return;
            default:
                vs9 vs9Var = (vs9) obj;
                ArrayList arrayList = vs9Var.r;
                ns9 ns9Var = vs9Var.d;
                if (i >= 0 && i < arrayList.size()) {
                    if (!y6c.h(i2).p()) {
                        new jh8(dVar, 24, true).show();
                        return;
                    }
                    long j = ((ss9) arrayList.get(i)).a.h;
                    if (vs9Var.h == j) {
                        h19Var = null;
                    } else {
                        h19Var = ((ss9) arrayList.get(i)).a;
                    }
                    if (vs9Var.f(h19Var)) {
                        for (int i3 = 0; i3 < ns9Var.getChildCount(); i3++) {
                            if (ns9Var.getChildAt(i3) == view) {
                                float f = 50.0f;
                                if (i3 <= 1) {
                                    if (i3 == 0) {
                                        f = 90.0f;
                                    }
                                    ns9Var.x0(-gl.L(f), 0, null);
                                } else if (i3 >= ns9Var.getChildCount() - 2) {
                                    if (i3 == ns9Var.getChildCount() - 1) {
                                        f = 80.0f;
                                    }
                                    ns9Var.x0(gl.L(f), 0, null);
                                }
                            }
                        }
                        ns9Var.M(new d42((byte) 3));
                        if (vs9Var.h == j) {
                            vs9Var.h = 0L;
                            return;
                        }
                        vs9Var.h = j;
                        ((us9) view).a(true, true);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

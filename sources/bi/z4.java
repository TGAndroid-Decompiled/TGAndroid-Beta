package bi;

import a8.xa;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.k7;
import org.telegram.ui.Components.y7;
public final class z4 extends v4.t0 {
    public final int f4027a;
    public final Object f4028b;

    public z4(Object obj, int i7) {
        this.f4027a = i7;
        this.f4028b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        cj0 cj0Var;
        switch (this.f4027a) {
            case 4:
                ci.c cVar = (ci.c) this.f4028b;
                boolean z10 = true;
                if (i7 != 1) {
                    z10 = false;
                }
                cVar.f5314d0 = z10;
                if (i7 != 0) {
                    cVar.f5311b0 = ci.c.b();
                }
                cVar.invalidate();
                return;
            case 5:
                if (i7 == 0) {
                    ((ci.g0) this.f4028b).f5483w = false;
                    return;
                }
                return;
            case 12:
                fi.c5 c5Var = (fi.c5) this.f4028b;
                if (i7 == 0) {
                    c5Var.W = true;
                    c5Var.invalidate();
                }
                if (i7 == 1) {
                    c5Var.W = false;
                    xa xaVar = c5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) xaVar.f714c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) xaVar.f714c).cancel();
                        xaVar.f714c = null;
                    }
                    org.telegram.messenger.g0.v1(c5Var);
                    return;
                }
                return;
            case 14:
                hi.y1 y1Var = (hi.y1) this.f4028b;
                if (i7 == 0 && y1Var.f15412n >= 0.0f && !y1Var.f15408b.canScrollVertically(-1)) {
                    y1Var.f15412n = -1.0f;
                    return;
                }
                return;
            case 15:
                if (i7 == 0) {
                    hi.v6 v6Var = (hi.v6) this.f4028b;
                    if (v6Var.f15223e2) {
                        v6Var.f15223e2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((kg.y1) this.f4028b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 24:
                li.b0 b0Var = (li.b0) this.f4028b;
                if (i7 == 0) {
                    b0Var.f19529e = !b0Var.d.canScrollVertically(-1);
                    b0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 28:
                y7 y7Var = (y7) this.f4028b;
                k7 k7Var = y7Var.f41916s1;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i10 = y7Var.f41921u2;
                    int i11 = y7Var.f29716t0;
                    if (((i10 - i11) - L) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && k7Var.canScrollVertically(1) && (cj0Var = (cj0) k7Var.K(y7Var.f41911p2 ? 1 : 0)) != null) {
                        View view = cj0Var.f58535a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            k7Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.v1(y7Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public void b(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: bi.z4.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}

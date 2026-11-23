package bi;

import a8.xa;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.mj0;
public final class v1 extends v4.u0 {
    public final int f4136a;
    public final Object f4137b;

    public v1(Object obj, int i7) {
        this.f4136a = i7;
        this.f4137b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        mj0 mj0Var;
        switch (this.f4136a) {
            case 0:
                if (i7 == 0) {
                    f2 f2Var = (f2) this.f4137b;
                    if (f2Var.f3540n2) {
                        f2Var.f3540n2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ci.c cVar = (ci.c) this.f4137b;
                boolean z10 = true;
                if (i7 != 1) {
                    z10 = false;
                }
                cVar.f5594d0 = z10;
                if (i7 != 0) {
                    cVar.f5591b0 = ci.c.b();
                }
                cVar.invalidate();
                return;
            case 6:
                if (i7 == 0) {
                    ((ci.h0) this.f4137b).f5760w = false;
                    return;
                }
                return;
            case 13:
                fi.b5 b5Var = (fi.b5) this.f4137b;
                if (i7 == 0) {
                    b5Var.W = true;
                    b5Var.invalidate();
                }
                if (i7 == 1) {
                    b5Var.W = false;
                    xa xaVar = b5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) xaVar.f714c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) xaVar.f714c).cancel();
                        xaVar.f714c = null;
                    }
                    org.telegram.messenger.g0.v1(b5Var);
                    return;
                }
                return;
            case 15:
                hi.g2 g2Var = (hi.g2) this.f4137b;
                if (i7 == 0 && g2Var.f14524n >= 0.0f && !g2Var.f14520b.canScrollVertically(-1)) {
                    g2Var.f14524n = -1.0f;
                    return;
                }
                return;
            case 16:
                if (i7 == 0) {
                    hi.e7 e7Var = (hi.e7) this.f4137b;
                    if (e7Var.f14378e2) {
                        e7Var.f14378e2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 20:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((kg.y1) this.f4137b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 25:
                li.a0 a0Var = (li.a0) this.f4137b;
                if (i7 == 0) {
                    a0Var.f19989e = !a0Var.d.canScrollVertically(-1);
                    a0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.e8 e8Var = (org.telegram.ui.Components.e8) this.f4137b;
                org.telegram.ui.Components.q7 q7Var = e8Var.f34614s1;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i10 = e8Var.f34619u2;
                    int i11 = e8Var.f30260t0;
                    if (((i10 - i11) - L) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && q7Var.canScrollVertically(1) && (mj0Var = (mj0) q7Var.K(e8Var.f34609p2 ? 1 : 0)) != null) {
                        View view = mj0Var.f59245a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            q7Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.v1(e8Var.getCurrentFocus());
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
        throw new UnsupportedOperationException("Method not decompiled: bi.v1.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}

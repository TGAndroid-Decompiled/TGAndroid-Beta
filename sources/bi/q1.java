package bi;

import a8.xa;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.kj0;
public final class q1 extends v4.u0 {
    public final int f3962a;
    public final Object f3963b;

    public q1(Object obj, int i7) {
        this.f3962a = i7;
        this.f3963b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        kj0 kj0Var;
        switch (this.f3962a) {
            case 0:
                if (i7 == 0) {
                    a2 a2Var = (a2) this.f3963b;
                    if (a2Var.f3393n2) {
                        a2Var.f3393n2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ci.c cVar = (ci.c) this.f3963b;
                boolean z10 = true;
                if (i7 != 1) {
                    z10 = false;
                }
                cVar.f5599d0 = z10;
                if (i7 != 0) {
                    cVar.f5596b0 = ci.c.b();
                }
                cVar.invalidate();
                return;
            case 6:
                if (i7 == 0) {
                    ((ci.h0) this.f3963b).f5765w = false;
                    return;
                }
                return;
            case 13:
                fi.a5 a5Var = (fi.a5) this.f3963b;
                if (i7 == 0) {
                    a5Var.W = true;
                    a5Var.invalidate();
                }
                if (i7 == 1) {
                    a5Var.W = false;
                    xa xaVar = a5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) xaVar.f714c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) xaVar.f714c).cancel();
                        xaVar.f714c = null;
                    }
                    org.telegram.messenger.g0.v1(a5Var);
                    return;
                }
                return;
            case 15:
                hi.z1 z1Var = (hi.z1) this.f3963b;
                if (i7 == 0 && z1Var.f15803n >= 0.0f && !z1Var.f15799b.canScrollVertically(-1)) {
                    z1Var.f15803n = -1.0f;
                    return;
                }
                return;
            case 16:
                if (i7 == 0) {
                    hi.v6 v6Var = (hi.v6) this.f3963b;
                    if (v6Var.f15580e2) {
                        v6Var.f15580e2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 20:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((kg.y1) this.f3963b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 25:
                li.b0 b0Var = (li.b0) this.f3963b;
                if (i7 == 0) {
                    b0Var.f19893e = !b0Var.d.canScrollVertically(-1);
                    b0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.g8 g8Var = (org.telegram.ui.Components.g8) this.f3963b;
                org.telegram.ui.Components.r7 r7Var = g8Var.f35408s1;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i10 = g8Var.f35413u2;
                    int i11 = g8Var.f30224t0;
                    if (((i10 - i11) - L) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && r7Var.canScrollVertically(1) && (kj0Var = (kj0) r7Var.K(g8Var.f35403p2 ? 1 : 0)) != null) {
                        View view = kj0Var.f59123a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            r7Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.v1(g8Var.getCurrentFocus());
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
        throw new UnsupportedOperationException("Method not decompiled: bi.q1.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}

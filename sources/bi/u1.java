package bi;

import a8.xa;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.mj0;
public final class u1 extends v4.u0 {
    public final int f4141a;
    public final Object f4142b;

    public u1(Object obj, int i7) {
        this.f4141a = i7;
        this.f4142b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        mj0 mj0Var;
        switch (this.f4141a) {
            case 0:
                if (i7 == 0) {
                    e2 e2Var = (e2) this.f4142b;
                    if (e2Var.f3588n2) {
                        e2Var.f3588n2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 5:
                ci.c cVar = (ci.c) this.f4142b;
                boolean z10 = true;
                if (i7 != 1) {
                    z10 = false;
                }
                cVar.f5631d0 = z10;
                if (i7 != 0) {
                    cVar.f5628b0 = ci.c.b();
                }
                cVar.invalidate();
                return;
            case 6:
                if (i7 == 0) {
                    ((ci.h0) this.f4142b).f5797w = false;
                    return;
                }
                return;
            case 13:
                fi.b5 b5Var = (fi.b5) this.f4142b;
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
                hi.y1 y1Var = (hi.y1) this.f4142b;
                if (i7 == 0 && y1Var.f15784n >= 0.0f && !y1Var.f15780b.canScrollVertically(-1)) {
                    y1Var.f15784n = -1.0f;
                    return;
                }
                return;
            case 16:
                if (i7 == 0) {
                    hi.u6 u6Var = (hi.u6) this.f4142b;
                    if (u6Var.f15550e2) {
                        u6Var.f15550e2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 20:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((kg.y1) this.f4142b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 25:
                li.b0 b0Var = (li.b0) this.f4142b;
                if (i7 == 0) {
                    b0Var.f19924e = !b0Var.d.canScrollVertically(-1);
                    b0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.f8 f8Var = (org.telegram.ui.Components.f8) this.f4142b;
                org.telegram.ui.Components.r7 r7Var = f8Var.f35133s1;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i10 = f8Var.f35138u2;
                    int i11 = f8Var.f30210t0;
                    if (((i10 - i11) - L) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && r7Var.canScrollVertically(1) && (mj0Var = (mj0) r7Var.K(f8Var.f35128p2 ? 1 : 0)) != null) {
                        View view = mj0Var.f59165a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            r7Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.v1(f8Var.getCurrentFocus());
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
        throw new UnsupportedOperationException("Method not decompiled: bi.u1.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}

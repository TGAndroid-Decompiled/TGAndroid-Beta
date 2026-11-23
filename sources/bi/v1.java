package bi;

import a8.xa;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.mj0;
public final class v1 extends v4.t0 {
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
                fi.a5 a5Var = (fi.a5) this.f4137b;
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
                hi.y1 y1Var = (hi.y1) this.f4137b;
                if (i7 == 0 && y1Var.f15713n >= 0.0f && !y1Var.f15709b.canScrollVertically(-1)) {
                    y1Var.f15713n = -1.0f;
                    return;
                }
                return;
            case 16:
                if (i7 == 0) {
                    hi.v6 v6Var = (hi.v6) this.f4137b;
                    if (v6Var.f15535e2) {
                        v6Var.f15535e2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 20:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((kg.z1) this.f4137b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 25:
                li.b0 b0Var = (li.b0) this.f4137b;
                if (i7 == 0) {
                    b0Var.f19890e = !b0Var.d.canScrollVertically(-1);
                    b0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 29:
                org.telegram.ui.Components.f8 f8Var = (org.telegram.ui.Components.f8) this.f4137b;
                org.telegram.ui.Components.r7 r7Var = f8Var.f35108s1;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i10 = f8Var.f35113u2;
                    int i11 = f8Var.f30176t0;
                    if (((i10 - i11) - L) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && r7Var.canScrollVertically(1) && (mj0Var = (mj0) r7Var.K(f8Var.f35103p2 ? 1 : 0)) != null) {
                        View view = mj0Var.f59111a;
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
        throw new UnsupportedOperationException("Method not decompiled: bi.v1.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}

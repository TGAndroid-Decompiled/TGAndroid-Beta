package ai;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b8.kg;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.l7;
import org.telegram.ui.Components.z7;
public final class j5 extends u4.t0 {
    public final int f751a;
    public final Object f752b;

    public j5(Object obj, int i3) {
        this.f751a = i3;
        this.f752b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i3) {
        bj0 bj0Var;
        switch (this.f751a) {
            case 3:
                bi.c cVar = (bi.c) this.f752b;
                boolean z10 = true;
                if (i3 != 1) {
                    z10 = false;
                }
                cVar.f3667d0 = z10;
                if (i3 != 0) {
                    cVar.f3664b0 = bi.c.b();
                }
                cVar.invalidate();
                return;
            case 4:
                if (i3 == 0) {
                    ((bi.h0) this.f752b).f3846w = false;
                    return;
                }
                return;
            case 12:
                ei.k5 k5Var = (ei.k5) this.f752b;
                if (i3 == 0) {
                    k5Var.W = true;
                    k5Var.invalidate();
                }
                if (i3 == 1) {
                    k5Var.W = false;
                    kg kgVar = k5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) kgVar.f2723c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) kgVar.f2723c).cancel();
                        kgVar.f2723c = null;
                    }
                    org.telegram.messenger.g0.v1(k5Var);
                    return;
                }
                return;
            case 14:
                gi.y1 y1Var = (gi.y1) this.f752b;
                if (i3 == 0 && y1Var.f13918n >= 0.0f && !y1Var.f13914b.canScrollVertically(-1)) {
                    y1Var.f13918n = -1.0f;
                    return;
                }
                return;
            case 15:
                if (i3 == 0) {
                    gi.x6 x6Var = (gi.x6) this.f752b;
                    if (x6Var.f13845b2) {
                        x6Var.f13845b2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 21:
                ji.z zVar = (ji.z) this.f752b;
                if (i3 == 0) {
                    zVar.f16382e = !zVar.d.canScrollVertically(-1);
                    zVar.d.canScrollVertically(1);
                    return;
                }
                return;
            case 25:
                if (i3 == 1) {
                    org.telegram.messenger.g0.v1(((lg.x1) this.f752b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 28:
                z7 z7Var = (z7) this.f752b;
                l7 l7Var = z7Var.f40958p1;
                if (i3 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i10 = z7Var.f40963r2;
                    int i11 = z7Var.f28617t0;
                    if (((i10 - i11) - L) + i11 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && l7Var.canScrollVertically(1) && (bj0Var = (bj0) l7Var.K(z7Var.f40953m2 ? 1 : 0)) != null) {
                        View view = bj0Var.f55540a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            l7Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i3 == 1) {
                    org.telegram.messenger.g0.v1(z7Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    @Override
    public void b(androidx.recyclerview.widget.RecyclerView r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: ai.j5.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}

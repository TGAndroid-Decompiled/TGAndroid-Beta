package ai;

import a8.wa;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.q1;
import di.l5;
import fi.w6;
import fi.z1;
import kg.w1;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.m7;
import org.telegram.ui.Components.pi;
import org.telegram.ui.Components.xi0;
public final class b extends v4.s0 {
    public final int f1125a;
    public final Object f1126b;

    public b(Object obj, int i7) {
        this.f1125a = i7;
        this.f1126b = obj;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        xi0 xi0Var;
        int i10;
        xi0 xi0Var2;
        switch (this.f1125a) {
            case 0:
                d dVar = (d) this.f1126b;
                boolean z9 = true;
                if (i7 != 1) {
                    z9 = false;
                }
                dVar.f1144c0 = z9;
                if (i7 != 0) {
                    dVar.f1140a0 = d.b();
                }
                dVar.invalidate();
                return;
            case 1:
                if (i7 == 0) {
                    ((q0) this.f1126b).f1679w = false;
                    return;
                }
                return;
            case 9:
                l5 l5Var = (l5) this.f1126b;
                if (i7 == 0) {
                    l5Var.V = true;
                    l5Var.invalidate();
                }
                if (i7 == 1) {
                    l5Var.V = false;
                    wa waVar = l5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) waVar.f701c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) waVar.f701c).cancel();
                        waVar.f701c = null;
                    }
                    org.telegram.messenger.g0.v1(l5Var);
                    return;
                }
                return;
            case 11:
                z1 z1Var = (z1) this.f1126b;
                if (i7 == 0 && z1Var.f13241n >= 0.0f && !z1Var.f13237b.canScrollVertically(-1)) {
                    z1Var.f13241n = -1.0f;
                    return;
                }
                return;
            case 12:
                if (i7 == 0) {
                    w6 w6Var = (w6) this.f1126b;
                    if (w6Var.d2) {
                        w6Var.d2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ii.b0 b0Var = (ii.b0) this.f1126b;
                if (i7 == 0) {
                    b0Var.f15495e = !b0Var.d.canScrollVertically(-1);
                    b0Var.d.canScrollVertically(1);
                    return;
                }
                return;
            case 22:
                if (i7 == 1) {
                    org.telegram.messenger.g0.v1(((w1) this.f1126b).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 23:
                ((oi.q) this.f1126b).f21109g++;
                return;
            case 26:
                a8 a8Var = (a8) this.f1126b;
                m7 m7Var = a8Var.f31754r1;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i11 = a8Var.f31759t2;
                    int i12 = a8Var.f28704s0;
                    if (((i11 - i12) - L) + i12 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && m7Var.canScrollVertically(1) && (xi0Var = (xi0) m7Var.K(a8Var.f31749o2 ? 1 : 0)) != null) {
                        View view = xi0Var.f57052a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            m7Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.v1(a8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 29:
                pi piVar = (pi) this.f1126b;
                q1 q1Var = piVar.f36936n;
                ci ciVar = piVar.f38656b;
                if (i7 == 0) {
                    int L2 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = ciVar.X2;
                    if (r0Var != null) {
                        i10 = org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L2 + i10;
                    int i14 = ciVar.f28704s0;
                    if (((ciVar.Y3[0] - i14) - i13) + i14 < org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() && (xi0Var2 = (xi0) q1Var.K(0)) != null) {
                        View view2 = xi0Var2.f57052a;
                        if (view2.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            q1Var.w0(0, view2.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void b(androidx.recyclerview.widget.RecyclerView r9, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: ai.b.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }
}

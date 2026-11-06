package ai;

import a8.wa;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.q1;
import di.k5;
import fi.w6;
import fi.z1;
import kg.w1;
import org.telegram.ui.Components.b8;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.n7;
import org.telegram.ui.Components.qi;
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
                k5 k5Var = (k5) this.f1126b;
                if (i7 == 0) {
                    k5Var.V = true;
                    k5Var.invalidate();
                }
                if (i7 == 1) {
                    k5Var.V = false;
                    wa waVar = k5Var.d;
                    ValueAnimator valueAnimator = (ValueAnimator) waVar.f701c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) waVar.f701c).cancel();
                        waVar.f701c = null;
                    }
                    org.telegram.messenger.g0.v1(k5Var);
                    return;
                }
                return;
            case 11:
                z1 z1Var = (z1) this.f1126b;
                if (i7 == 0 && z1Var.f13239n >= 0.0f && !z1Var.f13235b.canScrollVertically(-1)) {
                    z1Var.f13239n = -1.0f;
                    return;
                }
                return;
            case 12:
                if (i7 == 0) {
                    w6 w6Var = (w6) this.f1126b;
                    if (w6Var.f13033a2) {
                        w6Var.f13033a2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 18:
                ii.b0 b0Var = (ii.b0) this.f1126b;
                if (i7 == 0) {
                    b0Var.f15490e = !b0Var.d.canScrollVertically(-1);
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
                ((oi.q) this.f1126b).f21101g++;
                return;
            case 26:
                b8 b8Var = (b8) this.f1126b;
                n7 n7Var = b8Var.f32045o1;
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    int i11 = b8Var.f32050q2;
                    int i12 = b8Var.f28644s0;
                    if (((i11 - i12) - L) + i12 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && n7Var.canScrollVertically(1) && (xi0Var = (xi0) n7Var.K(b8Var.f32041l2 ? 1 : 0)) != null) {
                        View view = xi0Var.f56952a;
                        if (view.getTop() > org.telegram.messenger.g0.L(7.0f)) {
                            n7Var.w0(0, view.getTop() - org.telegram.messenger.g0.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == 1) {
                    org.telegram.messenger.g0.v1(b8Var.getCurrentFocus());
                    return;
                } else {
                    return;
                }
            case 29:
                qi qiVar = (qi) this.f1126b;
                q1 q1Var = qiVar.f37307n;
                di diVar = qiVar.f38948b;
                if (i7 == 0) {
                    int L2 = org.telegram.messenger.g0.L(13.0f);
                    org.telegram.ui.ActionBar.r0 r0Var = diVar.U2;
                    if (r0Var != null) {
                        i10 = org.telegram.messenger.g0.L(r0Var.getAlpha() * 26.0f);
                    } else {
                        i10 = 0;
                    }
                    int i13 = L2 + i10;
                    int i14 = diVar.f28644s0;
                    if (((diVar.V3[0] - i14) - i13) + i14 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (xi0Var2 = (xi0) q1Var.K(0)) != null) {
                        View view2 = xi0Var2.f56952a;
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

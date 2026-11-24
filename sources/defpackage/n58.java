package defpackage;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PremiumPreviewFragment;
public final class n58 extends i49 {
    public final byte a;
    public final Object b;

    public n58(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        y29 y29Var;
        a aVar;
        View view;
        byte b = this.a;
        pi8 pi8Var = null;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    gl.t1(((u58) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                gf8 gf8Var = (gf8) obj;
                af8 af8Var = gf8Var.l1;
                if (i == 0) {
                    int L = gl.L(13.0f);
                    int i2 = gf8Var.y1;
                    int i3 = gf8Var.t0;
                    if (((i2 - i3) - L) + i3 < a.getCurrentActionBarHeight() && af8Var.canScrollVertically(1) && (y29Var = (y29) af8Var.K(0)) != null) {
                        View view2 = y29Var.a;
                        if (view2.getTop() > gl.L(7.0f)) {
                            af8Var.x0(0, view2.getTop() - gl.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 3:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                if (i == 0) {
                    aVar = ((d) premiumPreviewFragment).actionBar;
                    int L2 = gl.L(16.0f) + aVar.getBottom();
                    int i4 = (premiumPreviewFragment.g0 > 0.5f ? 1 : (premiumPreviewFragment.g0 == 0.5f ? 0 : -1));
                    o39 o39Var = premiumPreviewFragment.a;
                    if (i4 > 0) {
                        o39Var.x0(0, premiumPreviewFragment.d0 - L2, null);
                        return;
                    }
                    if (o39Var.getLayoutManager() != null) {
                        view = premiumPreviewFragment.a.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        premiumPreviewFragment.a.x0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                dh8 dh8Var = (dh8) obj;
                if (i == 1) {
                    dh8Var.l3 = true;
                }
                if (i == 0) {
                    for (int i5 = 0; i5 < recyclerView.getChildCount(); i5++) {
                        pi8 pi8Var2 = (pi8) dh8Var.getChildAt(i5);
                        if (pi8Var == null || pi8Var2.a > pi8Var.a) {
                            pi8Var = pi8Var2;
                        }
                    }
                    if (pi8Var != null) {
                        dh8Var.z1(pi8Var, true);
                        dh8Var.l3 = false;
                        dh8Var.x0(0, pi8Var.getTop() - ((dh8Var.getMeasuredHeight() - pi8Var.getMeasuredHeight()) / 2), gl.H);
                    }
                    dh8Var.A1();
                    return;
                }
                gl.r(dh8Var.m3);
                return;
            case 5:
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
            case 16:
            case 17:
            default:
                return;
            case 7:
                if (i == 0) {
                    ((ew8) obj).w = false;
                    return;
                }
                return;
            case 9:
                o39 o39Var2 = (o39) obj;
                boolean z2 = o39Var2.u2;
                if (i == 0) {
                    if (z2) {
                        o39Var2.u2 = false;
                        kk7.e().k(99, 512);
                    }
                } else if (!z2 && o39Var2.w1) {
                    o39Var2.u2 = true;
                    kk7.e().k(98, 512);
                }
                if (i != 0 && o39Var2.M1 != null) {
                    yq4 yq4Var = o39Var2.d1;
                    if (yq4Var != null) {
                        gl.r(yq4Var);
                        o39Var2.d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        o39Var2.L1.X(obtain);
                    } catch (Exception e) {
                        fa4.g(e, true);
                    }
                    o39Var2.M1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view3 = o39Var2.M1;
                    o39Var2.k1(view3, 0.0f, 0.0f, false);
                    o39Var2.M1 = null;
                    o39Var2.n1(view3, null);
                    o39Var2.O1 = false;
                }
                i49 i49Var = o39Var2.Z0;
                if (i49Var != null) {
                    i49Var.a(recyclerView, i);
                }
                z = (i == 1 || i == 2) ? true : true;
                o39Var2.J1 = z;
                if (z) {
                    o39Var2.K1 = true;
                    return;
                }
                return;
            case 13:
                if (i == 1) {
                    gl.t1(((qa9) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 14:
                hs9 hs9Var = (hs9) obj;
                if (i == 1) {
                    gl.t1(hs9Var.G.getCurrentFocus());
                }
                hs9Var.a();
                return;
            case 15:
                if (i == 0) {
                    yx9 yx9Var = (yx9) obj;
                    if (yx9Var.d2) {
                        yx9Var.d2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 18:
                if (i == 1) {
                    gl.t1(((zy9) obj).T1.getEditText());
                    return;
                }
                return;
            case 19:
                g0a g0aVar = (g0a) obj;
                if (i == 0) {
                    g0aVar.W = true;
                    g0aVar.invalidate();
                }
                if (i == 1) {
                    g0aVar.W = false;
                    kp kpVar = g0aVar.d;
                    ValueAnimator valueAnimator = (ValueAnimator) kpVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) kpVar.c).cancel();
                        kpVar.c = null;
                    }
                    gl.t1(g0aVar);
                    return;
                }
                return;
            case 20:
                if (i == 0) {
                    d8a d8aVar = (d8a) obj;
                    if (d8aVar.F != null) {
                        xha xhaVar = d8aVar.d;
                        if (xhaVar == null || !xhaVar.x()) {
                            float f = d8aVar.Y;
                            if (f > 0.0f && f < 1.0f) {
                                int i6 = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
                                q5c q5cVar = d8aVar.c;
                                if (i6 >= 0) {
                                    q5cVar.x0(0, (int) (-(d8aVar.a0 - d8aVar.Z)), s33.h);
                                    return;
                                } else {
                                    q5cVar.x0(0, (int) Math.ceil(d8aVar.Z - d8aVar.b0), s33.h);
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public final void b(androidx.recyclerview.widget.RecyclerView r11, int r12, int r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n58.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    private final void c(RecyclerView recyclerView, int i) {
    }
}

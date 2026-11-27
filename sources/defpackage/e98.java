package defpackage;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PremiumPreviewFragment;
public final class e98 extends v79 {
    public final byte a;
    public final Object b;

    public e98(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        n69 n69Var;
        a aVar;
        View view;
        byte b = this.a;
        cm8 cm8Var = null;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    hl.t1(((l98) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ui8 ui8Var = (ui8) obj;
                oi8 oi8Var = ui8Var.l1;
                if (i == 0) {
                    int L = hl.L(13.0f);
                    int i2 = ui8Var.y1;
                    int i3 = ui8Var.t0;
                    if (((i2 - i3) - L) + i3 < a.getCurrentActionBarHeight() && oi8Var.canScrollVertically(1) && (n69Var = (n69) oi8Var.L(0)) != null) {
                        View view2 = n69Var.a;
                        if (view2.getTop() > hl.L(7.0f)) {
                            oi8Var.y0(0, view2.getTop() - hl.L(7.0f), null);
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
                    aVar = ((e) premiumPreviewFragment).actionBar;
                    int L2 = hl.L(16.0f) + aVar.getBottom();
                    int i4 = (premiumPreviewFragment.g0 > 0.5f ? 1 : (premiumPreviewFragment.g0 == 0.5f ? 0 : -1));
                    d79 d79Var = premiumPreviewFragment.a;
                    if (i4 > 0) {
                        d79Var.y0(0, premiumPreviewFragment.d0 - L2, null);
                        return;
                    }
                    if (d79Var.getLayoutManager() != null) {
                        view = premiumPreviewFragment.a.getLayoutManager().m(0);
                    } else {
                        view = null;
                    }
                    if (view != null && view.getTop() < 0) {
                        premiumPreviewFragment.a.y0(0, view.getTop(), null);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                rk8 rk8Var = (rk8) obj;
                if (i == 1) {
                    rk8Var.l3 = true;
                }
                if (i == 0) {
                    for (int i5 = 0; i5 < recyclerView.getChildCount(); i5++) {
                        cm8 cm8Var2 = (cm8) rk8Var.getChildAt(i5);
                        if (cm8Var == null || cm8Var2.a > cm8Var.a) {
                            cm8Var = cm8Var2;
                        }
                    }
                    if (cm8Var != null) {
                        rk8Var.A1(cm8Var, true);
                        rk8Var.l3 = false;
                        rk8Var.y0(0, cm8Var.getTop() - ((rk8Var.getMeasuredHeight() - cm8Var.getMeasuredHeight()) / 2), hl.H);
                    }
                    rk8Var.B1();
                    return;
                }
                hl.r(rk8Var.m3);
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
                    ((pz8) obj).w = false;
                    return;
                }
                return;
            case 9:
                d79 d79Var2 = (d79) obj;
                boolean z2 = d79Var2.u2;
                if (i == 0) {
                    if (z2) {
                        d79Var2.u2 = false;
                        jn7.e().k(100, 512);
                    }
                } else if (!z2 && d79Var2.w1) {
                    d79Var2.u2 = true;
                    jn7.e().k(99, 512);
                }
                if (i != 0 && d79Var2.M1 != null) {
                    ct4 ct4Var = d79Var2.d1;
                    if (ct4Var != null) {
                        hl.r(ct4Var);
                        d79Var2.d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        d79Var2.L1.E(obtain);
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    d79Var2.M1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view3 = d79Var2.M1;
                    d79Var2.l1(view3, 0.0f, 0.0f, false);
                    d79Var2.M1 = null;
                    d79Var2.o1(view3, null);
                    d79Var2.O1 = false;
                }
                v79 v79Var = d79Var2.Z0;
                if (v79Var != null) {
                    v79Var.a(recyclerView, i);
                }
                z = (i == 1 || i == 2) ? true : true;
                d79Var2.J1 = z;
                if (z) {
                    d79Var2.K1 = true;
                    return;
                }
                return;
            case 13:
                if (i == 1) {
                    hl.t1(((ee9) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 14:
                aw9 aw9Var = (aw9) obj;
                if (i == 1) {
                    hl.t1(aw9Var.G.getCurrentFocus());
                }
                aw9Var.a();
                return;
            case 15:
                if (i == 0) {
                    r1a r1aVar = (r1a) obj;
                    if (r1aVar.d2) {
                        r1aVar.d2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 18:
                if (i == 1) {
                    hl.t1(((t2a) obj).T1.getEditText());
                    return;
                }
                return;
            case 19:
                z3a z3aVar = (z3a) obj;
                if (i == 0) {
                    z3aVar.W = true;
                    z3aVar.invalidate();
                }
                if (i == 1) {
                    z3aVar.W = false;
                    lp lpVar = z3aVar.d;
                    ValueAnimator valueAnimator = (ValueAnimator) lpVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) lpVar.c).cancel();
                        lpVar.c = null;
                    }
                    hl.t1(z3aVar);
                    return;
                }
                return;
            case 20:
                if (i == 0) {
                    uba ubaVar = (uba) obj;
                    if (ubaVar.F != null) {
                        sla slaVar = ubaVar.d;
                        if (slaVar == null || !slaVar.x()) {
                            float f = ubaVar.Y;
                            if (f > 0.0f && f < 1.0f) {
                                int i6 = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
                                q9c q9cVar = ubaVar.c;
                                if (i6 >= 0) {
                                    q9cVar.y0(0, (int) (-(ubaVar.a0 - ubaVar.Z)), k43.h);
                                    return;
                                } else {
                                    q9cVar.y0(0, (int) Math.ceil(ubaVar.Z - ubaVar.b0), k43.h);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e98.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    private final void c(RecyclerView recyclerView, int i) {
    }
}

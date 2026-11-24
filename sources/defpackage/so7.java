package defpackage;

import android.animation.ValueAnimator;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class so7 extends k69 {
    public final byte a;
    public final Object b;

    public so7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        b59 b59Var;
        a aVar;
        View view;
        byte b = this.a;
        rk8 rk8Var = null;
        boolean z = false;
        Object obj = this.b;
        switch (b) {
            case 0:
                if (i == 1) {
                    gm.t1(((NotificationsCustomSettingsActivity) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 1:
                if (i == 1) {
                    gm.t1(((w78) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 2:
                return;
            case 3:
                ih8 ih8Var = (ih8) obj;
                ch8 ch8Var = ih8Var.l1;
                if (i == 0) {
                    int L = gm.L(13.0f);
                    int i2 = ih8Var.y1;
                    int i3 = ih8Var.t0;
                    if (((i2 - i3) - L) + i3 < a.getCurrentActionBarHeight() && ch8Var.canScrollVertically(1) && (b59Var = (b59) ch8Var.K(0)) != null) {
                        View view2 = b59Var.a;
                        if (view2.getTop() > gm.L(7.0f)) {
                            ch8Var.x0(0, view2.getTop() - gm.L(7.0f), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                if (i == 0) {
                    aVar = ((d) premiumPreviewFragment).actionBar;
                    int L2 = gm.L(16.0f) + aVar.getBottom();
                    int i4 = (premiumPreviewFragment.g0 > 0.5f ? 1 : (premiumPreviewFragment.g0 == 0.5f ? 0 : -1));
                    r59 r59Var = premiumPreviewFragment.a;
                    if (i4 > 0) {
                        r59Var.x0(0, premiumPreviewFragment.d0 - L2, null);
                        return;
                    }
                    if (r59Var.getLayoutManager() != null) {
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
            case 5:
                fj8 fj8Var = (fj8) obj;
                if (i == 1) {
                    fj8Var.l3 = true;
                }
                if (i == 0) {
                    for (int i5 = 0; i5 < recyclerView.getChildCount(); i5++) {
                        rk8 rk8Var2 = (rk8) fj8Var.getChildAt(i5);
                        if (rk8Var == null || rk8Var2.a > rk8Var.a) {
                            rk8Var = rk8Var2;
                        }
                    }
                    if (rk8Var != null) {
                        fj8Var.z1(rk8Var, true);
                        fj8Var.l3 = false;
                        fj8Var.x0(0, rk8Var.getTop() - ((fj8Var.getMeasuredHeight() - rk8Var.getMeasuredHeight()) / 2), gm.H);
                    }
                    fj8Var.A1();
                    return;
                }
                gm.r(fj8Var.m3);
                return;
            case 6:
            case 7:
            case 9:
            case 11:
            case 12:
            case 13:
            case 17:
            case 18:
            default:
                return;
            case 8:
                if (i == 0) {
                    ((gy8) obj).w = false;
                    return;
                }
                return;
            case 10:
                r59 r59Var2 = (r59) obj;
                boolean z2 = r59Var2.u2;
                if (i == 0) {
                    if (z2) {
                        r59Var2.u2 = false;
                        nm7.e().k(100, 512);
                    }
                } else if (!z2 && r59Var2.w1) {
                    r59Var2.u2 = true;
                    nm7.e().k(99, 512);
                }
                if (i != 0 && r59Var2.M1 != null) {
                    zs4 zs4Var = r59Var2.d1;
                    if (zs4Var != null) {
                        gm.r(zs4Var);
                        r59Var2.d1 = null;
                    }
                    MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                    try {
                        r59Var2.L1.I(obtain);
                    } catch (Exception e) {
                        fc4.g(e, true);
                    }
                    r59Var2.M1.onTouchEvent(obtain);
                    obtain.recycle();
                    View view3 = r59Var2.M1;
                    r59Var2.k1(view3, 0.0f, 0.0f, false);
                    r59Var2.M1 = null;
                    r59Var2.n1(view3, null);
                    r59Var2.O1 = false;
                }
                k69 k69Var = r59Var2.Z0;
                if (k69Var != null) {
                    k69Var.a(recyclerView, i);
                }
                z = (i == 1 || i == 2) ? true : true;
                r59Var2.J1 = z;
                if (z) {
                    r59Var2.K1 = true;
                    return;
                }
                return;
            case 14:
                if (i == 1) {
                    gm.t1(((qc9) obj).getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 15:
                ju9 ju9Var = (ju9) obj;
                if (i == 1) {
                    gm.t1(ju9Var.G.getCurrentFocus());
                }
                ju9Var.a();
                return;
            case 16:
                if (i == 0) {
                    zz9 zz9Var = (zz9) obj;
                    if (zz9Var.d2) {
                        zz9Var.d2 = false;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                if (i == 1) {
                    gm.t1(((b1a) obj).T1.getEditText());
                    return;
                }
                return;
            case 20:
                i2a i2aVar = (i2a) obj;
                if (i == 0) {
                    i2aVar.W = true;
                    i2aVar.invalidate();
                }
                if (i == 1) {
                    i2aVar.W = false;
                    kq kqVar = i2aVar.d;
                    ValueAnimator valueAnimator = (ValueAnimator) kqVar.c;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        ((ValueAnimator) kqVar.c).cancel();
                        kqVar.c = null;
                    }
                    gm.t1(i2aVar);
                    return;
                }
                return;
            case 21:
                if (i == 0) {
                    daa daaVar = (daa) obj;
                    if (daaVar.F != null) {
                        zja zjaVar = daaVar.d;
                        if (zjaVar == null || !zjaVar.x()) {
                            float f = daaVar.Y;
                            if (f > 0.0f && f < 1.0f) {
                                int i6 = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
                                q7c q7cVar = daaVar.c;
                                if (i6 >= 0) {
                                    q7cVar.x0(0, (int) (-(daaVar.a0 - daaVar.Z)), d53.h);
                                    return;
                                } else {
                                    q7cVar.x0(0, (int) Math.ceil(daaVar.Z - daaVar.b0), d53.h);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so7.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    private final void c(RecyclerView recyclerView, int i) {
    }

    private final void d(RecyclerView recyclerView, int i, int i2) {
    }
}

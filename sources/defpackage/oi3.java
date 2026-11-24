package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class oi3 extends k69 {
    public boolean a;
    public final mk3 b;
    public final gk3 c;
    public final nk3 d;

    public oi3(nk3 nk3Var, mk3 mk3Var, gk3 gk3Var) {
        this.d = nk3Var;
        this.b = mk3Var;
        this.c = gk3Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        boolean z;
        nk3 nk3Var = this.d;
        if (i == 1) {
            this.a = true;
            nk3Var.g3 = true;
            kq kqVar = nk3Var.f0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) kqVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) kqVar.c).cancel();
                kqVar.c = null;
            }
            if (nk3Var.Y.r.getText().length() == 0 && nk3Var.Y.r.hasFocus()) {
                gm.t1(nk3Var.Y.r);
                nk3Var.Y.r.clearFocus();
            }
        } else {
            nk3Var.g3 = false;
        }
        if (i == 0) {
            this.a = false;
            nk3Var.g2 = false;
            boolean z2 = nk3Var.d1;
            mk3 mk3Var = this.b;
            if (z2) {
                nk3Var.d1 = false;
                if (nk3Var.f1) {
                    jk3 jk3Var = mk3Var.a;
                    int i2 = jk3.C3;
                    jk3Var.D1();
                    nk3Var.f1 = false;
                }
                mk3Var.d.f();
            }
            nk3Var.J2(mk3Var);
        }
        z = ((d) nk3Var).isPaused;
        if (!z) {
            nk3Var.w4();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        mr3 mr3Var;
        jk3 jk3Var;
        a aVar;
        a aVar2;
        View childAt;
        int i4;
        boolean z;
        Object[] objArr;
        this.c.V();
        mk3 mk3Var = this.b;
        ki3 ki3Var = mk3Var.y;
        int i5 = -i2;
        ArrayList arrayList = ki3Var.x;
        ArrayList arrayList2 = ki3Var.o;
        boolean z2 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = ((u69) arrayList2.get(i6)).a;
                view.setTranslationY(view.getTranslationY() + i5);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                View view2 = ((u69) arrayList.get(i7)).a;
                view2.setTranslationY(view2.getTranslationY() + i5);
            }
        }
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < recyclerView.getChildCount(); i10++) {
            int R = RecyclerView.R(recyclerView.getChildAt(i10));
            if (R >= 0) {
                if (i8 == -1 || R > i8) {
                    i8 = R;
                }
                if (i9 == -1 || R < i9) {
                    i9 = R;
                }
            }
        }
        nk3 nk3Var = this.d;
        nk3Var.M2(mk3Var);
        nk3Var.R = true;
        View view3 = nk3Var.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (nk3Var.T0 != 10 && this.a && recyclerView.getChildCount() > 0 && i9 != -1) {
            u69 K = recyclerView.K(i9);
            if (!nk3Var.y3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i4 = K.a.getTop();
                } else {
                    i4 = 0;
                }
                int i11 = nk3Var.a2;
                if (i11 == i9) {
                    int i12 = nk3Var.b2;
                    int i13 = i12 - i4;
                    if (i4 < i12) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (Math.abs(i13) <= 1) {
                        objArr = null;
                        if (objArr != null && nk3Var.c2 && (z || nk3Var.g3)) {
                            nk3Var.B3(z);
                        }
                        nk3Var.a2 = i9;
                        nk3Var.b2 = i4;
                        nk3Var.c2 = true;
                    }
                } else if (i9 > i11) {
                    z = true;
                } else {
                    z = false;
                }
                objArr = 1;
                if (objArr != null) {
                    nk3Var.B3(z);
                }
                nk3Var.a2 = i9;
                nk3Var.b2 = i4;
                nk3Var.c2 = true;
            }
        }
        if (!nk3Var.L && recyclerView == nk3Var.f0[0].a && !nk3Var.l2) {
            aVar = ((d) nk3Var).actionBar;
            if (aVar != null) {
                aVar2 = ((d) nk3Var).actionBar;
                if (!aVar2.y() && !nk3Var.g2 && !nk3Var.H3.c()) {
                    if (i2 > 0 && nk3Var.y3() && nk3Var.f0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i2 > 0) {
                            if (top < 0) {
                                i2 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    nk3Var.R = true;
                    View view4 = nk3Var.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        dj3 dj3Var = nk3Var.H3;
        if (dj3Var != null && dj3Var.c() && (jk3Var = mk3Var.a) != null) {
            jk3Var.invalidate();
        }
        aj3 aj3Var = nk3Var.F0;
        if (aj3Var != null && aj3Var.getPremiumHint() != null && nk3Var.F0.getPremiumHint().W) {
            nk3Var.F0.getPremiumHint().f(true);
        }
        ?? y3 = nk3Var.y3();
        View childAt2 = mk3Var.a.getChildAt(y3 == true ? 1 : 0);
        if (childAt2 != null) {
            i3 = childAt2.getTop();
        } else {
            i3 = 0;
        }
        nk3Var.e.a((i9 > y3 || (i3 - nk3Var.O) + gm.L(5.0f) < mk3Var.a.getPaddingTop()) ? true : true, true);
        if (i2 != 0 && (mr3Var = nk3Var.q4) != null && Build.VERSION.SDK_INT >= 31) {
            mr3Var.f(i, i2);
        }
    }
}

package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class ch3 extends i49 {
    public boolean a;
    public final bj3 b;
    public final vi3 c;
    public final cj3 d;

    public ch3(cj3 cj3Var, bj3 bj3Var, vi3 vi3Var) {
        this.d = cj3Var;
        this.b = bj3Var;
        this.c = vi3Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        cj3 cj3Var = this.d;
        if (i == 1) {
            this.a = true;
            cj3Var.g3 = true;
            kp kpVar = cj3Var.f0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) kpVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) kpVar.c).cancel();
                kpVar.c = null;
            }
            if (cj3Var.Y.r.getText().length() == 0 && cj3Var.Y.r.hasFocus()) {
                gl.t1(cj3Var.Y.r);
                cj3Var.Y.r.clearFocus();
            }
        } else {
            cj3Var.g3 = false;
        }
        if (i == 0) {
            this.a = false;
            cj3Var.g2 = false;
            boolean z = cj3Var.d1;
            bj3 bj3Var = this.b;
            if (z) {
                cj3Var.d1 = false;
                if (cj3Var.f1) {
                    yi3 yi3Var = bj3Var.a;
                    int i2 = yi3.C3;
                    yi3Var.D1();
                    cj3Var.f1 = false;
                }
                bj3Var.d.f();
            }
            cj3Var.H2(bj3Var);
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        cq3 cq3Var;
        yi3 yi3Var;
        a aVar;
        a aVar2;
        View childAt;
        int i4;
        boolean z;
        Object[] objArr;
        this.c.V();
        bj3 bj3Var = this.b;
        yg3 yg3Var = bj3Var.y;
        int i5 = -i2;
        ArrayList arrayList = yg3Var.x;
        ArrayList arrayList2 = yg3Var.o;
        boolean z2 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = ((s49) arrayList2.get(i6)).a;
                view.setTranslationY(view.getTranslationY() + i5);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                View view2 = ((s49) arrayList.get(i7)).a;
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
        cj3 cj3Var = this.d;
        cj3Var.K2(bj3Var);
        cj3Var.R = true;
        View view3 = cj3Var.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (cj3Var.T0 != 10 && this.a && recyclerView.getChildCount() > 0 && i9 != -1) {
            s49 K = recyclerView.K(i9);
            if (!cj3Var.w3() || (K != null && K.b() >= 0)) {
                if (K != null) {
                    i4 = K.a.getTop();
                } else {
                    i4 = 0;
                }
                int i11 = cj3Var.a2;
                if (i11 == i9) {
                    int i12 = cj3Var.b2;
                    int i13 = i12 - i4;
                    if (i4 < i12) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (Math.abs(i13) <= 1) {
                        objArr = null;
                        if (objArr != null && cj3Var.c2 && (z || cj3Var.g3)) {
                            cj3Var.z3(z);
                        }
                        cj3Var.a2 = i9;
                        cj3Var.b2 = i4;
                        cj3Var.c2 = true;
                    }
                } else if (i9 > i11) {
                    z = true;
                } else {
                    z = false;
                }
                objArr = 1;
                if (objArr != null) {
                    cj3Var.z3(z);
                }
                cj3Var.a2 = i9;
                cj3Var.b2 = i4;
                cj3Var.c2 = true;
            }
        }
        if (!cj3Var.L && recyclerView == cj3Var.f0[0].a && !cj3Var.l2) {
            aVar = ((d) cj3Var).actionBar;
            if (aVar != null) {
                aVar2 = ((d) cj3Var).actionBar;
                if (!aVar2.y() && !cj3Var.g2 && !cj3Var.H3.c()) {
                    if (i2 > 0 && cj3Var.w3() && cj3Var.f0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.T(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i2 > 0) {
                            if (top < 0) {
                                i2 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    cj3Var.R = true;
                    View view4 = cj3Var.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        rh3 rh3Var = cj3Var.H3;
        if (rh3Var != null && rh3Var.c() && (yi3Var = bj3Var.a) != null) {
            yi3Var.invalidate();
        }
        oh3 oh3Var = cj3Var.F0;
        if (oh3Var != null && oh3Var.getPremiumHint() != null && cj3Var.F0.getPremiumHint().W) {
            cj3Var.F0.getPremiumHint().f(true);
        }
        ?? w3 = cj3Var.w3();
        View childAt2 = bj3Var.a.getChildAt(w3 == true ? 1 : 0);
        if (childAt2 != null) {
            i3 = childAt2.getTop();
        } else {
            i3 = 0;
        }
        cj3Var.e.a((i9 > w3 || (i3 - cj3Var.O) + gl.L(5.0f) < bj3Var.a.getPaddingTop()) ? true : true, true);
        if (i2 != 0 && (cq3Var = cj3Var.o4) != null && Build.VERSION.SDK_INT >= 31) {
            cq3Var.f(i, i2);
        }
    }
}

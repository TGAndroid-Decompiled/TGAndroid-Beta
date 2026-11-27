package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
public final class wh3 extends v79 {
    public boolean a;
    public final tj3 b;
    public final nj3 c;
    public final uj3 d;

    public wh3(uj3 uj3Var, tj3 tj3Var, nj3 nj3Var) {
        this.d = uj3Var;
        this.b = tj3Var;
        this.c = nj3Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        boolean z;
        uj3 uj3Var = this.d;
        if (i == 1) {
            this.a = true;
            uj3Var.g3 = true;
            lp lpVar = uj3Var.f0[0].b;
            ValueAnimator valueAnimator = (ValueAnimator) lpVar.c;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                ((ValueAnimator) lpVar.c).cancel();
                lpVar.c = null;
            }
            if (uj3Var.Y.r.getText().length() == 0 && uj3Var.Y.r.hasFocus()) {
                hl.t1(uj3Var.Y.r);
                uj3Var.Y.r.clearFocus();
            }
        } else {
            uj3Var.g3 = false;
        }
        if (i == 0) {
            this.a = false;
            uj3Var.g2 = false;
            boolean z2 = uj3Var.d1;
            tj3 tj3Var = this.b;
            if (z2) {
                uj3Var.d1 = false;
                if (uj3Var.f1) {
                    qj3 qj3Var = tj3Var.a;
                    int i2 = qj3.C3;
                    qj3Var.E1();
                    uj3Var.f1 = false;
                }
                tj3Var.d.f();
            }
            uj3Var.J2(tj3Var);
        }
        z = ((e) uj3Var).isPaused;
        if (!z) {
            uj3Var.w4();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        tq3 tq3Var;
        qj3 qj3Var;
        a aVar;
        a aVar2;
        View childAt;
        int i4;
        boolean z;
        Object[] objArr;
        this.c.V();
        tj3 tj3Var = this.b;
        sh3 sh3Var = tj3Var.y;
        int i5 = -i2;
        ArrayList arrayList = sh3Var.x;
        ArrayList arrayList2 = sh3Var.o;
        boolean z2 = false;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i6 = 0; i6 < size; i6++) {
                View view = ((f89) arrayList2.get(i6)).a;
                view.setTranslationY(view.getTranslationY() + i5);
            }
        }
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            for (int i7 = 0; i7 < size2; i7++) {
                View view2 = ((f89) arrayList.get(i7)).a;
                view2.setTranslationY(view2.getTranslationY() + i5);
            }
        }
        int i8 = -1;
        int i9 = -1;
        for (int i10 = 0; i10 < recyclerView.getChildCount(); i10++) {
            int S = RecyclerView.S(recyclerView.getChildAt(i10));
            if (S >= 0) {
                if (i8 == -1 || S > i8) {
                    i8 = S;
                }
                if (i9 == -1 || S < i9) {
                    i9 = S;
                }
            }
        }
        uj3 uj3Var = this.d;
        uj3Var.M2(tj3Var);
        uj3Var.R = true;
        View view3 = uj3Var.fragmentView;
        if (view3 != null) {
            view3.invalidate();
        }
        if (uj3Var.T0 != 10 && this.a && recyclerView.getChildCount() > 0 && i9 != -1) {
            f89 L = recyclerView.L(i9);
            if (!uj3Var.y3() || (L != null && L.b() >= 0)) {
                if (L != null) {
                    i4 = L.a.getTop();
                } else {
                    i4 = 0;
                }
                int i11 = uj3Var.a2;
                if (i11 == i9) {
                    int i12 = uj3Var.b2;
                    int i13 = i12 - i4;
                    if (i4 < i12) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (Math.abs(i13) <= 1) {
                        objArr = null;
                        if (objArr != null && uj3Var.c2 && (z || uj3Var.g3)) {
                            uj3Var.B3(z);
                        }
                        uj3Var.a2 = i9;
                        uj3Var.b2 = i4;
                        uj3Var.c2 = true;
                    }
                } else if (i9 > i11) {
                    z = true;
                } else {
                    z = false;
                }
                objArr = 1;
                if (objArr != null) {
                    uj3Var.B3(z);
                }
                uj3Var.a2 = i9;
                uj3Var.b2 = i4;
                uj3Var.c2 = true;
            }
        }
        if (!uj3Var.L && recyclerView == uj3Var.f0[0].a && !uj3Var.l2) {
            aVar = ((e) uj3Var).actionBar;
            if (aVar != null) {
                aVar2 = ((e) uj3Var).actionBar;
                if (!aVar2.z() && !uj3Var.g2 && !uj3Var.H3.c()) {
                    if (i2 > 0 && uj3Var.y3() && uj3Var.f0[0].s == 0 && (childAt = recyclerView.getChildAt(0)) != null && recyclerView.U(childAt).b() == 0) {
                        int top = (childAt.getTop() - recyclerView.getPaddingTop()) + childAt.getMeasuredHeight();
                        if (top + i2 > 0) {
                            if (top < 0) {
                                i2 = -top;
                            } else {
                                return;
                            }
                        }
                    }
                    uj3Var.R = true;
                    View view4 = uj3Var.fragmentView;
                    if (view4 != null) {
                        view4.invalidate();
                    }
                }
            }
        }
        li3 li3Var = uj3Var.H3;
        if (li3Var != null && li3Var.c() && (qj3Var = tj3Var.a) != null) {
            qj3Var.invalidate();
        }
        ii3 ii3Var = uj3Var.F0;
        if (ii3Var != null && ii3Var.getPremiumHint() != null && uj3Var.F0.getPremiumHint().W) {
            uj3Var.F0.getPremiumHint().f(true);
        }
        ?? y3 = uj3Var.y3();
        View childAt2 = tj3Var.a.getChildAt(y3 == true ? 1 : 0);
        if (childAt2 != null) {
            i3 = childAt2.getTop();
        } else {
            i3 = 0;
        }
        uj3Var.e.a((i9 > y3 || (i3 - uj3Var.O) + hl.L(5.0f) < tj3Var.a.getPaddingTop()) ? true : true, true);
        if (i2 != 0 && (tq3Var = uj3Var.q4) != null && Build.VERSION.SDK_INT >= 31) {
            tq3Var.f(i, i2);
        }
    }
}

package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.us;
public final class h extends AnimatorListenerAdapter {
    public final int f6328a;
    public final n1 f6329b;
    public final int f6330c;
    public final View d;
    public final int f6331e;
    public final ViewPropertyAnimator f6332f;
    public final q1 h;

    public h(q1 q1Var, n1 n1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f6328a = i12;
        this.h = q1Var;
        this.f6329b = n1Var;
        this.f6330c = i10;
        this.d = view;
        this.f6331e = i11;
        this.f6332f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f6328a) {
            case 0:
                int i10 = this.f6330c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f6331e != 0) {
                    view.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                int i11 = this.f6330c;
                View view2 = this.d;
                if (i11 != 0) {
                    view2.setTranslationX(0.0f);
                }
                if (this.f6331e != 0) {
                    view2.setTranslationY(0.0f);
                }
                View view3 = this.f6329b.f6432a;
                if (view3 instanceof p2) {
                    ((p2) view3).setMoving(false);
                    return;
                } else if (view3 instanceof rf.k) {
                    ((rf.k) view3).f47274a = false;
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6328a) {
            case 0:
                this.f6332f.setListener(null);
                l lVar = (l) this.h;
                n1 n1Var = this.f6329b;
                lVar.P(n1Var);
                lVar.v(n1Var);
                lVar.f6414z.remove(n1Var);
                lVar.G();
                lVar.z(n1Var);
                return;
            default:
                this.f6332f.setListener(null);
                us usVar = (us) this.h;
                n1 n1Var2 = this.f6329b;
                usVar.v(n1Var2);
                usVar.f33311w.remove(n1Var2);
                usVar.A();
                View view = n1Var2.f6432a;
                if (view instanceof p2) {
                    ((p2) view).setMoving(false);
                } else if (view instanceof rf.k) {
                    ((rf.k) view).f47274a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f6328a) {
            case 0:
                ((l) this.h).getClass();
                return;
            default:
                ((us) this.h).getClass();
                return;
        }
    }
}

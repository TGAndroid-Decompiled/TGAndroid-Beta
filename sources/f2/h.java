package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Components.xs;
public final class h extends AnimatorListenerAdapter {
    public final int f5705a;
    public final l1 f5706b;
    public final int f5707c;
    public final View d;
    public final int e;
    public final ViewPropertyAnimator f5708f;
    public final o1 h;

    public h(o1 o1Var, l1 l1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f5705a = i12;
        this.h = o1Var;
        this.f5706b = l1Var;
        this.f5707c = i10;
        this.d = view;
        this.e = i11;
        this.f5708f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f5705a) {
            case 0:
                int i10 = this.f5707c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                int i11 = this.f5707c;
                View view2 = this.d;
                if (i11 != 0) {
                    view2.setTranslationX(0.0f);
                }
                if (this.e != 0) {
                    view2.setTranslationY(0.0f);
                }
                View view3 = this.f5706b.f5774a;
                if (view3 instanceof q2) {
                    ((q2) view3).setMoving(false);
                    return;
                } else if (view3 instanceof tf.j) {
                    ((tf.j) view3).f44816a = false;
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5705a) {
            case 0:
                this.f5708f.setListener(null);
                l lVar = (l) this.h;
                l1 l1Var = this.f5706b;
                lVar.P(l1Var);
                lVar.v(l1Var);
                lVar.f5772z.remove(l1Var);
                lVar.G();
                lVar.z(l1Var);
                return;
            default:
                this.f5708f.setListener(null);
                xs xsVar = (xs) this.h;
                l1 l1Var2 = this.f5706b;
                xsVar.v(l1Var2);
                xsVar.f30706w.remove(l1Var2);
                xsVar.A();
                View view = l1Var2.f5774a;
                if (view instanceof q2) {
                    ((q2) view).setMoving(false);
                } else if (view instanceof tf.j) {
                    ((tf.j) view).f44816a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f5705a) {
            case 0:
                ((l) this.h).getClass();
                return;
            default:
                ((xs) this.h).getClass();
                return;
        }
    }
}

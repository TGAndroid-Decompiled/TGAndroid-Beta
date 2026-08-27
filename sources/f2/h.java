package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.os;

public final class h extends AnimatorListenerAdapter {

    public final int f5678a;

    public final o1 f5679b;

    public final int f5680c;
    public final View d;

    public final int f5681e;

    public final ViewPropertyAnimator f5682f;
    public final r1 h;

    public h(r1 r1Var, o1 o1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f5678a = i12;
        this.h = r1Var;
        this.f5679b = o1Var;
        this.f5680c = i10;
        this.d = view;
        this.f5681e = i11;
        this.f5682f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f5678a) {
            case 0:
                int i10 = this.f5680c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f5681e != 0) {
                    view.setTranslationY(0.0f);
                }
                break;
            default:
                int i11 = this.f5680c;
                View view2 = this.d;
                if (i11 != 0) {
                    view2.setTranslationX(0.0f);
                }
                if (this.f5681e != 0) {
                    view2.setTranslationY(0.0f);
                }
                View view3 = this.f5679b.f5789a;
                if (view3 instanceof p2) {
                    ((p2) view3).setMoving(false);
                } else if (view3 instanceof pf.j) {
                    ((pf.j) view3).f45833a = false;
                }
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5678a) {
            case 0:
                this.f5682f.setListener(null);
                l lVar = (l) this.h;
                o1 o1Var = this.f5679b;
                lVar.P(o1Var);
                lVar.v(o1Var);
                lVar.f5747z.remove(o1Var);
                lVar.G();
                lVar.z(o1Var);
                break;
            default:
                this.f5682f.setListener(null);
                os osVar = (os) this.h;
                o1 o1Var2 = this.f5679b;
                osVar.v(o1Var2);
                osVar.f31403w.remove(o1Var2);
                osVar.A();
                View view = o1Var2.f5789a;
                if (view instanceof p2) {
                    ((p2) view).setMoving(false);
                } else if (view instanceof pf.j) {
                    ((pf.j) view).f45833a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                break;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f5678a) {
            case 0:
                ((l) this.h).getClass();
                break;
            default:
                ((os) this.h).getClass();
                break;
        }
    }
}

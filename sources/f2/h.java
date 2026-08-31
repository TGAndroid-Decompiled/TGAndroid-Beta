package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.at;
public final class h extends AnimatorListenerAdapter {
    public final int f5777a;
    public final m1 f5778b;
    public final int f5779c;
    public final View d;
    public final int f5780e;
    public final ViewPropertyAnimator f5781f;
    public final p1 h;

    public h(p1 p1Var, m1 m1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator, int i12) {
        this.f5777a = i12;
        this.h = p1Var;
        this.f5778b = m1Var;
        this.f5779c = i10;
        this.d = view;
        this.f5780e = i11;
        this.f5781f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f5777a) {
            case 0:
                int i10 = this.f5779c;
                View view = this.d;
                if (i10 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f5780e != 0) {
                    view.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                int i11 = this.f5779c;
                View view2 = this.d;
                if (i11 != 0) {
                    view2.setTranslationX(0.0f);
                }
                if (this.f5780e != 0) {
                    view2.setTranslationY(0.0f);
                }
                View view3 = this.f5778b.f5875a;
                if (view3 instanceof r2) {
                    ((r2) view3).setMoving(false);
                    return;
                } else if (view3 instanceof uf.j) {
                    ((uf.j) view3).f48605a = false;
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5777a) {
            case 0:
                this.f5781f.setListener(null);
                l lVar = (l) this.h;
                m1 m1Var = this.f5778b;
                lVar.P(m1Var);
                lVar.v(m1Var);
                lVar.f5862z.remove(m1Var);
                lVar.G();
                lVar.z(m1Var);
                return;
            default:
                this.f5781f.setListener(null);
                at atVar = (at) this.h;
                m1 m1Var2 = this.f5778b;
                atVar.v(m1Var2);
                atVar.f25342w.remove(m1Var2);
                atVar.A();
                View view = m1Var2.f5875a;
                if (view instanceof r2) {
                    ((r2) view).setMoving(false);
                } else if (view instanceof uf.j) {
                    ((uf.j) view).f48605a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f5777a) {
            case 0:
                ((l) this.h).getClass();
                return;
            default:
                ((at) this.h).getClass();
                return;
        }
    }
}

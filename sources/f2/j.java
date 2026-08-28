package f2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.ps;
public final class j extends AnimatorListenerAdapter {
    public final int f5390a;
    public final q1 f5391b;
    public final int f5392c;
    public final View d;
    public final int f5393e;
    public final ViewPropertyAnimator f5394f;
    public final t1 h;

    public j(t1 t1Var, q1 q1Var, int i9, View view, int i10, ViewPropertyAnimator viewPropertyAnimator, int i11) {
        this.f5390a = i11;
        this.h = t1Var;
        this.f5391b = q1Var;
        this.f5392c = i9;
        this.d = view;
        this.f5393e = i10;
        this.f5394f = viewPropertyAnimator;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f5390a) {
            case 0:
                int i9 = this.f5392c;
                View view = this.d;
                if (i9 != 0) {
                    view.setTranslationX(0.0f);
                }
                if (this.f5393e != 0) {
                    view.setTranslationY(0.0f);
                    return;
                }
                return;
            default:
                int i10 = this.f5392c;
                View view2 = this.d;
                if (i10 != 0) {
                    view2.setTranslationX(0.0f);
                }
                if (this.f5393e != 0) {
                    view2.setTranslationY(0.0f);
                }
                View view3 = this.f5391b.f5501a;
                if (view3 instanceof r2) {
                    ((r2) view3).setMoving(false);
                    return;
                } else if (view3 instanceof of.l) {
                    ((of.l) view3).f19401a = false;
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5390a) {
            case 0:
                this.f5394f.setListener(null);
                n nVar = (n) this.h;
                q1 q1Var = this.f5391b;
                nVar.P(q1Var);
                nVar.v(q1Var);
                nVar.f5459z.remove(q1Var);
                nVar.G();
                nVar.z(q1Var);
                return;
            default:
                this.f5394f.setListener(null);
                ps psVar = (ps) this.h;
                q1 q1Var2 = this.f5391b;
                psVar.v(q1Var2);
                psVar.f31742w.remove(q1Var2);
                psVar.A();
                View view = q1Var2.f5501a;
                if (view instanceof r2) {
                    ((r2) view).setMoving(false);
                } else if (view instanceof of.l) {
                    ((of.l) view).f19401a = false;
                }
                View view2 = this.d;
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f5390a) {
            case 0:
                ((n) this.h).getClass();
                return;
            default:
                ((ps) this.h).getClass();
                return;
        }
    }
}

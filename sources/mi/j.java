package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.s1;
import s4.e1;
public final class j extends AnimatorListenerAdapter {
    public final int f18527a;
    public final s4.j f18528b;
    public final ViewPropertyAnimator f18529c;
    public final View d;
    public final m e;

    public j(m mVar, s4.j jVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f18527a = i10;
        this.e = mVar;
        this.f18528b = jVar;
        this.f18529c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f18527a) {
            case 0:
                this.f18529c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof s1) {
                    ((s1) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                m mVar = this.e;
                ArrayList arrayList = mVar.B;
                s4.j jVar = this.f18528b;
                if (arrayList.remove(jVar.f47812a)) {
                    mVar.d(jVar.f47812a);
                    mVar.G();
                    return;
                }
                return;
            default:
                this.f18529c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleX(1.0f);
                if (view2 instanceof s1) {
                    ((s1) view2).setAnimationOffsetX(0.0f);
                } else {
                    view2.setTranslationX(0.0f);
                }
                view2.setTranslationY(0.0f);
                m mVar2 = this.e;
                ArrayList arrayList2 = mVar2.B;
                s4.j jVar2 = this.f18528b;
                if (arrayList2.remove(jVar2.f47813b)) {
                    mVar2.d(jVar2.f47813b);
                    mVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f18527a) {
            case 0:
                e1 e1Var = this.f18528b.f47812a;
                this.e.getClass();
                return;
            default:
                e1 e1Var2 = this.f18528b.f47813b;
                this.e.getClass();
                return;
        }
    }
}

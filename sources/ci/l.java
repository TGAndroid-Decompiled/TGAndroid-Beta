package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.q1;
import s4.c1;
public final class l extends AnimatorListenerAdapter {
    public final int f4225a;
    public final s4.h f4226b;
    public final ViewPropertyAnimator f4227c;
    public final View d;
    public final o e;

    public l(o oVar, s4.h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f4225a = i10;
        this.e = oVar;
        this.f4226b = hVar;
        this.f4227c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f4225a) {
            case 0:
                this.f4227c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof q1) {
                    ((q1) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                o oVar = this.e;
                ArrayList arrayList = oVar.B;
                s4.h hVar = this.f4226b;
                if (arrayList.remove(hVar.f47946a)) {
                    oVar.d(hVar.f47946a);
                    oVar.G();
                    return;
                }
                return;
            default:
                this.f4227c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleX(1.0f);
                if (view2 instanceof q1) {
                    ((q1) view2).setAnimationOffsetX(0.0f);
                } else {
                    view2.setTranslationX(0.0f);
                }
                view2.setTranslationY(0.0f);
                o oVar2 = this.e;
                ArrayList arrayList2 = oVar2.B;
                s4.h hVar2 = this.f4226b;
                if (arrayList2.remove(hVar2.f47947b)) {
                    oVar2.d(hVar2.f47947b);
                    oVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f4225a) {
            case 0:
                c1 c1Var = this.f4226b.f47946a;
                this.e.getClass();
                return;
            default:
                c1 c1Var2 = this.f4226b.f47947b;
                this.e.getClass();
                return;
        }
    }
}

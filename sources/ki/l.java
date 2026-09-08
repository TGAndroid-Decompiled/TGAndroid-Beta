package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.t1;
import s4.c1;
public final class l extends AnimatorListenerAdapter {
    public final int f15038a;
    public final s4.h f15039b;
    public final ViewPropertyAnimator f15040c;
    public final View d;
    public final o f15041e;

    public l(o oVar, s4.h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f15038a = i10;
        this.f15041e = oVar;
        this.f15039b = hVar;
        this.f15040c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15038a) {
            case 0:
                this.f15040c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof t1) {
                    ((t1) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                o oVar = this.f15041e;
                ArrayList arrayList = oVar.B;
                s4.h hVar = this.f15039b;
                if (arrayList.remove(hVar.f45817a)) {
                    oVar.d(hVar.f45817a);
                    oVar.G();
                    return;
                }
                return;
            default:
                this.f15040c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleX(1.0f);
                if (view2 instanceof t1) {
                    ((t1) view2).setAnimationOffsetX(0.0f);
                } else {
                    view2.setTranslationX(0.0f);
                }
                view2.setTranslationY(0.0f);
                o oVar2 = this.f15041e;
                ArrayList arrayList2 = oVar2.B;
                s4.h hVar2 = this.f15039b;
                if (arrayList2.remove(hVar2.f45818b)) {
                    oVar2.d(hVar2.f45818b);
                    oVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f15038a) {
            case 0:
                c1 c1Var = this.f15039b.f45817a;
                this.f15041e.getClass();
                return;
            default:
                c1 c1Var2 = this.f15039b.f45818b;
                this.f15041e.getClass();
                return;
        }
    }
}

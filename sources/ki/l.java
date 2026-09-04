package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.t1;
import s4.c1;
public final class l extends AnimatorListenerAdapter {
    public final int f15012a;
    public final s4.h f15013b;
    public final ViewPropertyAnimator f15014c;
    public final View d;
    public final o f15015e;

    public l(o oVar, s4.h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f15012a = i10;
        this.f15015e = oVar;
        this.f15013b = hVar;
        this.f15014c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f15012a) {
            case 0:
                this.f15014c.setListener(null);
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
                o oVar = this.f15015e;
                ArrayList arrayList = oVar.B;
                s4.h hVar = this.f15013b;
                if (arrayList.remove(hVar.f45789a)) {
                    oVar.d(hVar.f45789a);
                    oVar.G();
                    return;
                }
                return;
            default:
                this.f15014c.setListener(null);
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
                o oVar2 = this.f15015e;
                ArrayList arrayList2 = oVar2.B;
                s4.h hVar2 = this.f15013b;
                if (arrayList2.remove(hVar2.f45790b)) {
                    oVar2.d(hVar2.f45790b);
                    oVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f15012a) {
            case 0:
                c1 c1Var = this.f15013b.f45789a;
                this.f15015e.getClass();
                return;
            default:
                c1 c1Var2 = this.f15013b.f45790b;
                this.f15015e.getClass();
                return;
        }
    }
}

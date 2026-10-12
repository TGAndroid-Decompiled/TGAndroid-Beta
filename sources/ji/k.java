package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.u1;
import s4.d1;
public final class k extends AnimatorListenerAdapter {
    public final int f14241a;
    public final s4.h f14242b;
    public final ViewPropertyAnimator f14243c;
    public final View d;
    public final n f14244e;

    public k(n nVar, s4.h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f14241a = i10;
        this.f14244e = nVar;
        this.f14242b = hVar;
        this.f14243c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14241a) {
            case 0:
                this.f14243c.setListener(null);
                View view = this.d;
                view.setAlpha(1.0f);
                view.setScaleX(1.0f);
                view.setScaleX(1.0f);
                if (view instanceof u1) {
                    ((u1) view).setAnimationOffsetX(0.0f);
                } else {
                    view.setTranslationX(0.0f);
                }
                view.setTranslationY(0.0f);
                n nVar = this.f14244e;
                ArrayList arrayList = nVar.B;
                s4.h hVar = this.f14242b;
                if (arrayList.remove(hVar.f47939a)) {
                    nVar.d(hVar.f47939a);
                    nVar.G();
                    return;
                }
                return;
            default:
                this.f14243c.setListener(null);
                View view2 = this.d;
                view2.setAlpha(1.0f);
                view2.setScaleX(1.0f);
                view2.setScaleX(1.0f);
                if (view2 instanceof u1) {
                    ((u1) view2).setAnimationOffsetX(0.0f);
                } else {
                    view2.setTranslationX(0.0f);
                }
                view2.setTranslationY(0.0f);
                n nVar2 = this.f14244e;
                ArrayList arrayList2 = nVar2.B;
                s4.h hVar2 = this.f14242b;
                if (arrayList2.remove(hVar2.f47940b)) {
                    nVar2.d(hVar2.f47940b);
                    nVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f14241a) {
            case 0:
                d1 d1Var = this.f14242b.f47939a;
                this.f14244e.getClass();
                return;
            default:
                d1 d1Var2 = this.f14242b.f47940b;
                this.f14244e.getClass();
                return;
        }
    }
}

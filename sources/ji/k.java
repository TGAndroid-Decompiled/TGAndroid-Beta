package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.u1;
import s4.d1;
public final class k extends AnimatorListenerAdapter {
    public final int f14243a;
    public final s4.h f14244b;
    public final ViewPropertyAnimator f14245c;
    public final View d;
    public final n f14246e;

    public k(n nVar, s4.h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f14243a = i10;
        this.f14246e = nVar;
        this.f14244b = hVar;
        this.f14245c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14243a) {
            case 0:
                this.f14245c.setListener(null);
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
                n nVar = this.f14246e;
                ArrayList arrayList = nVar.B;
                s4.h hVar = this.f14244b;
                if (arrayList.remove(hVar.f47698a)) {
                    nVar.d(hVar.f47698a);
                    nVar.G();
                    return;
                }
                return;
            default:
                this.f14245c.setListener(null);
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
                n nVar2 = this.f14246e;
                ArrayList arrayList2 = nVar2.B;
                s4.h hVar2 = this.f14244b;
                if (arrayList2.remove(hVar2.f47699b)) {
                    nVar2.d(hVar2.f47699b);
                    nVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f14243a) {
            case 0:
                d1 d1Var = this.f14244b.f47698a;
                this.f14246e.getClass();
                return;
            default:
                d1 d1Var2 = this.f14244b.f47699b;
                this.f14246e.getClass();
                return;
        }
    }
}

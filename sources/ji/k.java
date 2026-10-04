package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.u1;
import s4.c1;
public final class k extends AnimatorListenerAdapter {
    public final int f14207a;
    public final s4.h f14208b;
    public final ViewPropertyAnimator f14209c;
    public final View d;
    public final n f14210e;

    public k(n nVar, s4.h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f14207a = i10;
        this.f14210e = nVar;
        this.f14208b = hVar;
        this.f14209c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14207a) {
            case 0:
                this.f14209c.setListener(null);
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
                n nVar = this.f14210e;
                ArrayList arrayList = nVar.B;
                s4.h hVar = this.f14208b;
                if (arrayList.remove(hVar.f46582a)) {
                    nVar.d(hVar.f46582a);
                    nVar.G();
                    return;
                }
                return;
            default:
                this.f14209c.setListener(null);
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
                n nVar2 = this.f14210e;
                ArrayList arrayList2 = nVar2.B;
                s4.h hVar2 = this.f14208b;
                if (arrayList2.remove(hVar2.f46583b)) {
                    nVar2.d(hVar2.f46583b);
                    nVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f14207a) {
            case 0:
                c1 c1Var = this.f14208b.f46582a;
                this.f14210e.getClass();
                return;
            default:
                c1 c1Var2 = this.f14208b.f46583b;
                this.f14210e.getClass();
                return;
        }
    }
}

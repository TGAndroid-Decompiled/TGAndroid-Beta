package ji;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.t1;
import s4.c1;
public final class k extends AnimatorListenerAdapter {
    public final int f13074a;
    public final s4.h f13075b;
    public final ViewPropertyAnimator f13076c;
    public final View d;
    public final n e;

    public k(n nVar, s4.h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f13074a = i10;
        this.e = nVar;
        this.f13075b = hVar;
        this.f13076c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f13074a) {
            case 0:
                this.f13076c.setListener(null);
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
                n nVar = this.e;
                ArrayList arrayList = nVar.B;
                s4.h hVar = this.f13075b;
                if (arrayList.remove(hVar.f42720a)) {
                    nVar.d(hVar.f42720a);
                    nVar.G();
                    return;
                }
                return;
            default:
                this.f13076c.setListener(null);
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
                n nVar2 = this.e;
                ArrayList arrayList2 = nVar2.B;
                s4.h hVar2 = this.f13075b;
                if (arrayList2.remove(hVar2.f42721b)) {
                    nVar2.d(hVar2.f42721b);
                    nVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f13074a) {
            case 0:
                c1 c1Var = this.f13075b.f42720a;
                this.e.getClass();
                return;
            default:
                c1 c1Var2 = this.f13075b.f42721b;
                this.e.getClass();
                return;
        }
    }
}

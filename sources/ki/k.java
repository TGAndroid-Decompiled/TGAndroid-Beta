package ki;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.u1;
import s4.b1;
public final class k extends AnimatorListenerAdapter {
    public final int f14324a;
    public final s4.i f14325b;
    public final ViewPropertyAnimator f14326c;
    public final View d;
    public final n e;

    public k(n nVar, s4.i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f14324a = i10;
        this.e = nVar;
        this.f14325b = iVar;
        this.f14326c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f14324a) {
            case 0:
                this.f14326c.setListener(null);
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
                n nVar = this.e;
                ArrayList arrayList = nVar.B;
                s4.i iVar = this.f14325b;
                if (arrayList.remove(iVar.f44891a)) {
                    nVar.d(iVar.f44891a);
                    nVar.G();
                    return;
                }
                return;
            default:
                this.f14326c.setListener(null);
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
                n nVar2 = this.e;
                ArrayList arrayList2 = nVar2.B;
                s4.i iVar2 = this.f14325b;
                if (arrayList2.remove(iVar2.f44892b)) {
                    nVar2.d(iVar2.f44892b);
                    nVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f14324a) {
            case 0:
                b1 b1Var = this.f14325b.f44891a;
                this.e.getClass();
                return;
            default:
                b1 b1Var2 = this.f14325b.f44892b;
                this.e.getClass();
                return;
        }
    }
}

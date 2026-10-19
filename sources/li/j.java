package li;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.u1;
import s4.b1;
public final class j extends AnimatorListenerAdapter {
    public final int f16118a;
    public final s4.i f16119b;
    public final ViewPropertyAnimator f16120c;
    public final View d;
    public final m e;

    public j(m mVar, s4.i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f16118a = i10;
        this.e = mVar;
        this.f16119b = iVar;
        this.f16120c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16118a) {
            case 0:
                this.f16120c.setListener(null);
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
                m mVar = this.e;
                ArrayList arrayList = mVar.B;
                s4.i iVar = this.f16119b;
                if (arrayList.remove(iVar.f45963a)) {
                    mVar.d(iVar.f45963a);
                    mVar.G();
                    return;
                }
                return;
            default:
                this.f16120c.setListener(null);
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
                m mVar2 = this.e;
                ArrayList arrayList2 = mVar2.B;
                s4.i iVar2 = this.f16119b;
                if (arrayList2.remove(iVar2.f45964b)) {
                    mVar2.d(iVar2.f45964b);
                    mVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f16118a) {
            case 0:
                b1 b1Var = this.f16119b.f45963a;
                this.e.getClass();
                return;
            default:
                b1 b1Var2 = this.f16119b.f45964b;
                this.e.getClass();
                return;
        }
    }
}

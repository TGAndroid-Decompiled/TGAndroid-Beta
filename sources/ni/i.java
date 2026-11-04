package ni;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.q1;
import u4.d1;
public final class i extends AnimatorListenerAdapter {
    public final int f20431a;
    public final u4.i f20432b;
    public final ViewPropertyAnimator f20433c;
    public final View d;
    public final l f20434e;

    public i(l lVar, u4.i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i3) {
        this.f20431a = i3;
        this.f20434e = lVar;
        this.f20432b = iVar;
        this.f20433c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20431a) {
            case 0:
                this.f20433c.setListener(null);
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
                l lVar = this.f20434e;
                ArrayList arrayList = lVar.B;
                u4.i iVar = this.f20432b;
                if (arrayList.remove(iVar.f55585a)) {
                    lVar.d(iVar.f55585a);
                    lVar.G();
                    return;
                }
                return;
            default:
                this.f20433c.setListener(null);
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
                l lVar2 = this.f20434e;
                ArrayList arrayList2 = lVar2.B;
                u4.i iVar2 = this.f20432b;
                if (arrayList2.remove(iVar2.f55586b)) {
                    lVar2.d(iVar2.f55586b);
                    lVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20431a) {
            case 0:
                d1 d1Var = this.f20432b.f55585a;
                this.f20434e.getClass();
                return;
            default:
                d1 d1Var2 = this.f20432b.f55586b;
                this.f20434e.getClass();
                return;
        }
    }
}

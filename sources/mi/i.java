package mi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.q1;
import v4.d1;
public final class i extends AnimatorListenerAdapter {
    public final int f20081a;
    public final v4.i f20082b;
    public final ViewPropertyAnimator f20083c;
    public final View d;
    public final l f20084e;

    public i(l lVar, v4.i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i7) {
        this.f20081a = i7;
        this.f20084e = lVar;
        this.f20082b = iVar;
        this.f20083c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f20081a) {
            case 0:
                this.f20083c.setListener(null);
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
                l lVar = this.f20084e;
                ArrayList arrayList = lVar.B;
                v4.i iVar = this.f20082b;
                if (arrayList.remove(iVar.f57087a)) {
                    lVar.d(iVar.f57087a);
                    lVar.G();
                    return;
                }
                return;
            default:
                this.f20083c.setListener(null);
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
                l lVar2 = this.f20084e;
                ArrayList arrayList2 = lVar2.B;
                v4.i iVar2 = this.f20082b;
                if (arrayList2.remove(iVar2.f57088b)) {
                    lVar2.d(iVar2.f57088b);
                    lVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f20081a) {
            case 0:
                d1 d1Var = this.f20082b.f57087a;
                this.f20084e.getClass();
                return;
            default:
                d1 d1Var2 = this.f20082b.f57088b;
                this.f20084e.getClass();
                return;
        }
    }
}

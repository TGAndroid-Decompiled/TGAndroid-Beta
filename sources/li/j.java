package li;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import org.telegram.ui.Cells.u1;
import s4.b1;
public final class j extends AnimatorListenerAdapter {
    public final int f16116a;
    public final s4.i f16117b;
    public final ViewPropertyAnimator f16118c;
    public final View d;
    public final m e;

    public j(m mVar, s4.i iVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f16116a = i10;
        this.e = mVar;
        this.f16117b = iVar;
        this.f16118c = viewPropertyAnimator;
        this.d = view;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f16116a) {
            case 0:
                this.f16118c.setListener(null);
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
                s4.i iVar = this.f16117b;
                if (arrayList.remove(iVar.f45973a)) {
                    mVar.d(iVar.f45973a);
                    mVar.G();
                    return;
                }
                return;
            default:
                this.f16118c.setListener(null);
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
                s4.i iVar2 = this.f16117b;
                if (arrayList2.remove(iVar2.f45974b)) {
                    mVar2.d(iVar2.f45974b);
                    mVar2.G();
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.f16116a) {
            case 0:
                b1 b1Var = this.f16117b.f45973a;
                this.e.getClass();
                return;
            default:
                b1 b1Var2 = this.f16117b.f45974b;
                this.e.getClass();
                return;
        }
    }
}

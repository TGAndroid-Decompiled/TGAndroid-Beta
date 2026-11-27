package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.ui.PhotoViewer;
public final class kc8 extends AnimatorListenerAdapter {
    public final byte a;
    public final lc8 b;

    public kc8(lc8 lc8Var, byte b) {
        this.a = b;
        this.b = lc8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        lc8 lc8Var = this.b;
        switch (b) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) lc8Var.b;
                photoViewer.R1.getNextView().setText((CharSequence) null);
                ic8 ic8Var = photoViewer.U1;
                ic8Var.l0 = false;
                if (ic8Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ic8Var.o0.getLayoutParams()).topMargin = ic8Var.m0;
                    ic8Var.m0 = -1;
                    ic8Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) lc8Var.b).R1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ic8 ic8Var = ((PhotoViewer) this.b.b).U1;
                Method method = ic8Var.f0;
                if (method != null) {
                    try {
                        method.invoke(ic8Var, null);
                        return;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        return;
                    }
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}

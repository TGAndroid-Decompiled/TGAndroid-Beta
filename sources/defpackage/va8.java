package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.ui.PhotoViewer;
public final class va8 extends AnimatorListenerAdapter {
    public final byte a;
    public final wa8 b;

    public va8(wa8 wa8Var, byte b) {
        this.a = b;
        this.b = wa8Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        wa8 wa8Var = this.b;
        switch (b) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) wa8Var.b;
                photoViewer.R1.getNextView().setText((CharSequence) null);
                ta8 ta8Var = photoViewer.U1;
                ta8Var.l0 = false;
                if (ta8Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) ta8Var.o0.getLayoutParams()).topMargin = ta8Var.m0;
                    ta8Var.m0 = -1;
                    ta8Var.requestLayout();
                    return;
                }
                return;
            default:
                ((PhotoViewer) wa8Var.b).R1.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ta8 ta8Var = ((PhotoViewer) this.b.b).U1;
                Method method = ta8Var.f0;
                if (method != null) {
                    try {
                        method.invoke(ta8Var, null);
                        return;
                    } catch (Exception e) {
                        fc4.g(e, true);
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

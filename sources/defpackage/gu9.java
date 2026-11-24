package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import java.lang.reflect.Method;
import org.telegram.ui.SecretMediaViewer;
public final class gu9 extends AnimatorListenerAdapter {
    public final byte a;
    public final u88 b;

    public gu9(u88 u88Var, byte b) {
        this.a = b;
        this.b = u88Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        u88 u88Var = this.b;
        switch (b) {
            case 0:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) u88Var.b;
                secretMediaViewer.Y.getNextView().setText((CharSequence) null);
                r88 r88Var = secretMediaViewer.Z;
                r88Var.l0 = false;
                if (r88Var.m0 >= 0) {
                    ((ViewGroup.MarginLayoutParams) r88Var.o0.getLayoutParams()).topMargin = r88Var.m0;
                    r88Var.m0 = -1;
                    r88Var.requestLayout();
                    return;
                }
                return;
            default:
                ((SecretMediaViewer) u88Var.b).Y.setTranslationY(0.0f);
                return;
        }
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                r88 r88Var = ((SecretMediaViewer) this.b.b).Z;
                Method method = r88Var.f0;
                if (method != null) {
                    try {
                        method.invoke(r88Var, null);
                        return;
                    } catch (Exception e) {
                        fa4.g(e, true);
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

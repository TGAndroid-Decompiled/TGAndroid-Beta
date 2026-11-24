package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class d98 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        y21 y21Var;
        Drawable[] drawableArr = PhotoViewer.d9;
        u31 u31Var = u31.x;
        if (u31Var != null && (y21Var = u31Var.e) != null) {
            y21Var.updatePosition();
        }
    }
}

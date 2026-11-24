package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class b78 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        q11 q11Var;
        Drawable[] drawableArr = PhotoViewer.d9;
        m21 m21Var = m21.w;
        if (m21Var != null && (q11Var = m21Var.e) != null) {
            q11Var.updatePosition();
        }
    }
}

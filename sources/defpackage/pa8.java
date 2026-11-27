package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import org.telegram.ui.PhotoViewer;
public final class pa8 implements ValueAnimator.AnimatorUpdateListener {
    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        z11 z11Var;
        Drawable[] drawableArr = PhotoViewer.d9;
        v21 v21Var = v21.x;
        if (v21Var != null && (z11Var = v21Var.e) != null) {
            z11Var.updatePosition();
        }
    }
}

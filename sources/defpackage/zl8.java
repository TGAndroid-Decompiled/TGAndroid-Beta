package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;
public final class zl8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ProfileActivity b;

    public zl8(ProfileActivity profileActivity, byte b) {
        this.a = b;
        this.b = profileActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                profileActivity.y0.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f));
                return;
            case 1:
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity.n3(valueAnimator.getAnimatedFraction());
                return;
            case 2:
                RectF rectF3 = ProfileActivity.Z6;
                View view = profileActivity.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                profileActivity.h4(true);
                return;
            default:
                RectF rectF4 = ProfileActivity.Z6;
                profileActivity.h4(true);
                return;
        }
    }
}

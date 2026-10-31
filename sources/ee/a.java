package ee;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateOvershootInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.OvershootInterpolator;
public abstract class a {
    public static final DecelerateInterpolator f6489a;

    static {
        new AnticipateOvershootInterpolator();
        f6489a = new DecelerateInterpolator();
        new AccelerateInterpolator();
        new DecelerateInterpolator(1.78f);
        new LinearInterpolator();
        new OvershootInterpolator(3.2f);
        new AccelerateDecelerateInterpolator();
    }
}

package defpackage;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class jn extends Drawable.ConstantState {
    public r9c a;
    public AnimatorSet b;
    public ArrayList c;
    public ps d;

    @Override
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}

package defpackage;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
public final class ko extends Drawable.ConstantState {
    public sbc a;
    public AnimatorSet b;
    public ArrayList c;
    public qt d;

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

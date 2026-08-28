package j0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class e extends Drawable.ConstantState {
    public int f13191a;
    public Drawable.ConstantState f13192b;
    public ColorStateList f13193c;
    public PorterDuff.Mode d;

    @Override
    public final int getChangingConfigurations() {
        int i9;
        int i10 = this.f13191a;
        Drawable.ConstantState constantState = this.f13192b;
        if (constantState != null) {
            i9 = constantState.getChangingConfigurations();
        } else {
            i9 = 0;
        }
        return i10 | i9;
    }

    @Override
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        ?? drawable = new Drawable();
        drawable.d = this;
        Drawable.ConstantState constantState = this.f13192b;
        if (constantState != null) {
            drawable.h(constantState.newDrawable(resources));
        }
        d.a();
        return drawable;
    }
}

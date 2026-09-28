package j0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class e extends Drawable.ConstantState {
    public int f12540a;
    public Drawable.ConstantState f12541b;
    public ColorStateList f12542c;
    public PorterDuff.Mode d;

    @Override
    public final int getChangingConfigurations() {
        int i10;
        int i11 = this.f12540a;
        Drawable.ConstantState constantState = this.f12541b;
        if (constantState != null) {
            i10 = constantState.getChangingConfigurations();
        } else {
            i10 = 0;
        }
        return i11 | i10;
    }

    @Override
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        ?? drawable = new Drawable();
        drawable.d = this;
        Drawable.ConstantState constantState = this.f12541b;
        if (constantState != null) {
            drawable.h(constantState.newDrawable(resources));
        }
        d.a();
        return drawable;
    }
}

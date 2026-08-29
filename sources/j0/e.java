package j0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class e extends Drawable.ConstantState {
    public int f10356a;
    public Drawable.ConstantState f10357b;
    public ColorStateList f10358c;
    public PorterDuff.Mode d;

    @Override
    public final int getChangingConfigurations() {
        int i10;
        int i11 = this.f10356a;
        Drawable.ConstantState constantState = this.f10357b;
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
        Drawable.ConstantState constantState = this.f10357b;
        if (constantState != null) {
            drawable.h(constantState.newDrawable(resources));
        }
        d.a();
        return drawable;
    }
}

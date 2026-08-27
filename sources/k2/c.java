package k2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public final class c extends Drawable.ConstantState {

    public final Drawable.ConstantState f14349a;

    public c(Drawable.ConstantState constantState) {
        this.f14349a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f14349a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f14349a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable drawableNewDrawable = this.f14349a.newDrawable();
        dVar.f14354a = drawableNewDrawable;
        drawableNewDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable drawableNewDrawable = this.f14349a.newDrawable(resources);
        dVar.f14354a = drawableNewDrawable;
        drawableNewDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable drawableNewDrawable = this.f14349a.newDrawable(resources, theme);
        dVar.f14354a = drawableNewDrawable;
        drawableNewDrawable.setCallback(dVar.d);
        return dVar;
    }
}

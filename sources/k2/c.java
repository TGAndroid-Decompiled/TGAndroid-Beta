package k2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f9621a;

    public c(Drawable.ConstantState constantState) {
        this.f9621a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f9621a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f9621a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f9621a.newDrawable();
        dVar.f9626a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f9621a.newDrawable(resources);
        dVar.f9626a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f9621a.newDrawable(resources, theme);
        dVar.f9626a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }
}

package k2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f13340a;

    public c(Drawable.ConstantState constantState) {
        this.f13340a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f13340a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f13340a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f13340a.newDrawable();
        dVar.f13345a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f13340a.newDrawable(resources);
        dVar.f13345a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f13340a.newDrawable(resources, theme);
        dVar.f13345a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }
}

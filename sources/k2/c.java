package k2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f14528a;

    public c(Drawable.ConstantState constantState) {
        this.f14528a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f14528a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f14528a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f14528a.newDrawable();
        dVar.f14533a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f14528a.newDrawable(resources);
        dVar.f14533a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f14528a.newDrawable(resources, theme);
        dVar.f14533a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }
}

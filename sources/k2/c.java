package k2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class c extends Drawable.ConstantState {
    public final Drawable.ConstantState f10350a;

    public c(Drawable.ConstantState constantState) {
        this.f10350a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f10350a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f10350a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f10350a.newDrawable();
        dVar.f10355a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f10350a.newDrawable(resources);
        dVar.f10355a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f10350a.newDrawable(resources, theme);
        dVar.f10355a = newDrawable;
        newDrawable.setCallback(dVar.d);
        return dVar;
    }
}

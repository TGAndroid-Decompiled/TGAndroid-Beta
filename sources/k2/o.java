package k2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class o extends Drawable.ConstantState {
    public final Drawable.ConstantState f9668a;

    public o(Drawable.ConstantState constantState) {
        this.f9668a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f9668a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f9668a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        p pVar = new p();
        pVar.f9626a = (VectorDrawable) this.f9668a.newDrawable();
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        p pVar = new p();
        pVar.f9626a = (VectorDrawable) this.f9668a.newDrawable(resources);
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        p pVar = new p();
        pVar.f9626a = (VectorDrawable) this.f9668a.newDrawable(resources, theme);
        return pVar;
    }
}

package k2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class o extends Drawable.ConstantState {
    public final Drawable.ConstantState f10401a;

    public o(Drawable.ConstantState constantState) {
        this.f10401a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f10401a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f10401a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        p pVar = new p();
        pVar.f10355a = (VectorDrawable) this.f10401a.newDrawable();
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        p pVar = new p();
        pVar.f10355a = (VectorDrawable) this.f10401a.newDrawable(resources);
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        p pVar = new p();
        pVar.f10355a = (VectorDrawable) this.f10401a.newDrawable(resources, theme);
        return pVar;
    }
}

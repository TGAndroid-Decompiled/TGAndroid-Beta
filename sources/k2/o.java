package k2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class o extends Drawable.ConstantState {
    public final Drawable.ConstantState f9687a;

    public o(Drawable.ConstantState constantState) {
        this.f9687a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f9687a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f9687a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        p pVar = new p();
        pVar.f9645a = (VectorDrawable) this.f9687a.newDrawable();
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        p pVar = new p();
        pVar.f9645a = (VectorDrawable) this.f9687a.newDrawable(resources);
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        p pVar = new p();
        pVar.f9645a = (VectorDrawable) this.f9687a.newDrawable(resources, theme);
        return pVar;
    }
}

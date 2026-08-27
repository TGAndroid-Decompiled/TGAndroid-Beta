package k2;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

public final class o extends Drawable.ConstantState {

    public final Drawable.ConstantState f14400a;

    public o(Drawable.ConstantState constantState) {
        this.f14400a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f14400a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f14400a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        p pVar = new p();
        pVar.f14354a = (VectorDrawable) this.f14400a.newDrawable();
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        p pVar = new p();
        pVar.f14354a = (VectorDrawable) this.f14400a.newDrawable(resources);
        return pVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        p pVar = new p();
        pVar.f14354a = (VectorDrawable) this.f14400a.newDrawable(resources, theme);
        return pVar;
    }
}

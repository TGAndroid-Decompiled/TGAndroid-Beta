package a5;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class d extends Drawable.ConstantState {
    public final Drawable.ConstantState f214a;

    public d(Drawable.ConstantState constantState) {
        this.f214a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f214a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.f214a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        e eVar = new e(null);
        Drawable newDrawable = this.f214a.newDrawable();
        eVar.f220b = newDrawable;
        newDrawable.setCallback(eVar.f216e);
        return eVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        e eVar = new e(null);
        Drawable newDrawable = this.f214a.newDrawable(resources);
        eVar.f220b = newDrawable;
        newDrawable.setCallback(eVar.f216e);
        return eVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        e eVar = new e(null);
        Drawable newDrawable = this.f214a.newDrawable(resources, theme);
        eVar.f220b = newDrawable;
        newDrawable.setCallback(eVar.f216e);
        return eVar;
    }
}

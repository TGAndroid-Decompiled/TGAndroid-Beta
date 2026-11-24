package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class kn extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public kn(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override
    public final int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        ln lnVar = new ln(null);
        Drawable newDrawable = this.a.newDrawable();
        lnVar.b = newDrawable;
        newDrawable.setCallback(lnVar.e);
        return lnVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        ln lnVar = new ln(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        lnVar.b = newDrawable;
        newDrawable.setCallback(lnVar.e);
        return lnVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        ln lnVar = new ln(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        lnVar.b = newDrawable;
        newDrawable.setCallback(lnVar.e);
        return lnVar;
    }
}

package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class lo extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public lo(Drawable.ConstantState constantState) {
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
        mo moVar = new mo(null);
        Drawable newDrawable = this.a.newDrawable();
        moVar.b = newDrawable;
        newDrawable.setCallback(moVar.e);
        return moVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        mo moVar = new mo(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        moVar.b = newDrawable;
        newDrawable.setCallback(moVar.e);
        return moVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        mo moVar = new mo(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        moVar.b = newDrawable;
        newDrawable.setCallback(moVar.e);
        return moVar;
    }
}

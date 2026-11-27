package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
public final class ln extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public ln(Drawable.ConstantState constantState) {
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
        mn mnVar = new mn(null);
        Drawable newDrawable = this.a.newDrawable();
        mnVar.b = newDrawable;
        newDrawable.setCallback(mnVar.e);
        return mnVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        mn mnVar = new mn(null);
        Drawable newDrawable = this.a.newDrawable(resources);
        mnVar.b = newDrawable;
        newDrawable.setCallback(mnVar.e);
        return mnVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        mn mnVar = new mn(null);
        Drawable newDrawable = this.a.newDrawable(resources, theme);
        mnVar.b = newDrawable;
        newDrawable.setCallback(mnVar.e);
        return mnVar;
    }
}

package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class qdc extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public qdc(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        rdc rdcVar = new rdc();
        rdcVar.b = (VectorDrawable) this.a.newDrawable();
        return rdcVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        rdc rdcVar = new rdc();
        rdcVar.b = (VectorDrawable) this.a.newDrawable(resources);
        return rdcVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        rdc rdcVar = new rdc();
        rdcVar.b = (VectorDrawable) this.a.newDrawable(resources, theme);
        return rdcVar;
    }
}

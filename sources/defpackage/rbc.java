package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class rbc extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public rbc(Drawable.ConstantState constantState) {
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
        sbc sbcVar = new sbc();
        sbcVar.b = (VectorDrawable) this.a.newDrawable();
        return sbcVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        sbc sbcVar = new sbc();
        sbcVar.b = (VectorDrawable) this.a.newDrawable(resources);
        return sbcVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        sbc sbcVar = new sbc();
        sbcVar.b = (VectorDrawable) this.a.newDrawable(resources, theme);
        return sbcVar;
    }
}

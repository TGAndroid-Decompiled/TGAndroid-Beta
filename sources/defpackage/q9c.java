package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class q9c extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public q9c(Drawable.ConstantState constantState) {
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
        r9c r9cVar = new r9c();
        r9cVar.b = (VectorDrawable) this.a.newDrawable();
        return r9cVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        r9c r9cVar = new r9c();
        r9cVar.b = (VectorDrawable) this.a.newDrawable(resources);
        return r9cVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        r9c r9cVar = new r9c();
        r9cVar.b = (VectorDrawable) this.a.newDrawable(resources, theme);
        return r9cVar;
    }
}

package a5;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
public final class p extends Drawable.ConstantState {
    public final Drawable.ConstantState f266a;

    public p(Drawable.ConstantState constantState) {
        this.f266a = constantState;
    }

    @Override
    public final boolean canApplyTheme() {
        return this.f266a.canApplyTheme();
    }

    @Override
    public int getChangingConfigurations() {
        return this.f266a.getChangingConfigurations();
    }

    @Override
    public final Drawable newDrawable() {
        q qVar = new q();
        qVar.f220b = (VectorDrawable) this.f266a.newDrawable();
        return qVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        q qVar = new q();
        qVar.f220b = (VectorDrawable) this.f266a.newDrawable(resources);
        return qVar;
    }

    @Override
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        q qVar = new q();
        qVar.f220b = (VectorDrawable) this.f266a.newDrawable(resources, theme);
        return qVar;
    }
}

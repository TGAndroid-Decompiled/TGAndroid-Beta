package j0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class e extends Drawable.ConstantState {

    public int f12288a;

    public Drawable.ConstantState f12289b;

    public ColorStateList f12290c;
    public PorterDuff.Mode d;

    @Override
    public final int getChangingConfigurations() {
        int i10 = this.f12288a;
        Drawable.ConstantState constantState = this.f12289b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override
    public final Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d();
        dVar.d = this;
        Drawable.ConstantState constantState = this.f12289b;
        if (constantState != null) {
            dVar.h(constantState.newDrawable(resources));
        }
        d.a();
        return dVar;
    }
}

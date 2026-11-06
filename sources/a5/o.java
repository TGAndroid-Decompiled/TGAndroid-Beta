package a5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class o extends Drawable.ConstantState {
    public int f256a;
    public n f257b;
    public ColorStateList f258c;
    public PorterDuff.Mode d;
    public boolean f259e;
    public Bitmap f260f;
    public ColorStateList f261g;
    public PorterDuff.Mode h;
    public int f262i;
    public boolean f263j;
    public boolean f264k;
    public Paint f265l;

    @Override
    public int getChangingConfigurations() {
        return this.f256a;
    }

    @Override
    public final Drawable newDrawable() {
        return new q(this);
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        return new q(this);
    }
}

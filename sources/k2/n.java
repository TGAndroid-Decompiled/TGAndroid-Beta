package k2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f14569a;
    public m f14570b;
    public ColorStateList f14571c;
    public PorterDuff.Mode d;
    public boolean f14572e;
    public Bitmap f14573f;
    public ColorStateList f14574g;
    public PorterDuff.Mode h;
    public int f14575i;
    public boolean f14576j;
    public boolean f14577k;
    public Paint f14578l;

    @Override
    public int getChangingConfigurations() {
        return this.f14569a;
    }

    @Override
    public final Drawable newDrawable() {
        return new p(this);
    }

    @Override
    public final Drawable newDrawable(Resources resources) {
        return new p(this);
    }
}

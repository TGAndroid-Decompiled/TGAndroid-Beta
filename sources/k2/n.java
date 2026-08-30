package k2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f9678a;
    public m f9679b;
    public ColorStateList f9680c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f9681f;
    public ColorStateList f9682g;
    public PorterDuff.Mode h;
    public int f9683i;
    public boolean f9684j;
    public boolean f9685k;
    public Paint f9686l;

    @Override
    public int getChangingConfigurations() {
        return this.f9678a;
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

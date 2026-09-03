package k2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f9659a;
    public m f9660b;
    public ColorStateList f9661c;
    public PorterDuff.Mode d;
    public boolean e;
    public Bitmap f9662f;
    public ColorStateList f9663g;
    public PorterDuff.Mode h;
    public int f9664i;
    public boolean f9665j;
    public boolean f9666k;
    public Paint f9667l;

    @Override
    public int getChangingConfigurations() {
        return this.f9659a;
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

package k2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

public final class n extends Drawable.ConstantState {

    public int f14390a;

    public m f14391b;

    public ColorStateList f14392c;
    public PorterDuff.Mode d;

    public boolean f14393e;

    public Bitmap f14394f;

    public ColorStateList f14395g;
    public PorterDuff.Mode h;

    public int f14396i;

    public boolean f14397j;

    public boolean f14398k;

    public Paint f14399l;

    @Override
    public int getChangingConfigurations() {
        return this.f14390a;
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

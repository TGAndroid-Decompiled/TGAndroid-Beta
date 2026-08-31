package k2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f10391a;
    public m f10392b;
    public ColorStateList f10393c;
    public PorterDuff.Mode d;
    public boolean f10394e;
    public Bitmap f10395f;
    public ColorStateList f10396g;
    public PorterDuff.Mode h;
    public int f10397i;
    public boolean f10398j;
    public boolean f10399k;
    public Paint f10400l;

    @Override
    public int getChangingConfigurations() {
        return this.f10391a;
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

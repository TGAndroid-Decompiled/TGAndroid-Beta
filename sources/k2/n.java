package k2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
public final class n extends Drawable.ConstantState {
    public int f13381a;
    public m f13382b;
    public ColorStateList f13383c;
    public PorterDuff.Mode d;
    public boolean f13384e;
    public Bitmap f13385f;
    public ColorStateList f13386g;
    public PorterDuff.Mode h;
    public int f13387i;
    public boolean f13388j;
    public boolean f13389k;
    public Paint f13390l;

    @Override
    public int getChangingConfigurations() {
        return this.f13381a;
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

package k2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import f7.q8;
import org.xmlpull.v1.XmlPullParser;
public final class d extends g implements Animatable {
    public final Context f14530c;
    public final eg.a d = new eg.a(this, 5);
    public final b f14529b = new Drawable.ConstantState();

    public d(Context context) {
        this.f14530c = context;
    }

    @Override
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f14529b;
        bVar.f14525a.draw(canvas);
        if (bVar.f14526b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f14529b.f14525a.getAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f14529b.getClass();
        return changingConfigurations;
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f14529b.f14525a.getColorFilter();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f14533a != null && Build.VERSION.SDK_INT >= 24) {
            return new c(this.f14533a.getConstantState());
        }
        return null;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f14529b.f14525a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f14529b.f14525a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f14529b.f14525a.getOpacity();
    }

    @Override
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        throw new UnsupportedOperationException("Method not decompiled: k2.d.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f14529b.f14525a.isAutoMirrored();
    }

    @Override
    public final boolean isRunning() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f14529b.f14526b.isRunning();
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f14529b.f14525a.isStateful();
    }

    @Override
    public final Drawable mutate() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f14529b.f14525a.setBounds(rect);
        }
    }

    @Override
    public final boolean onLevelChange(int i9) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.setLevel(i9);
        }
        return this.f14529b.f14525a.setLevel(i9);
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f14529b.f14525a.setState(iArr);
    }

    @Override
    public final void setAlpha(int i9) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setAlpha(i9);
        } else {
            this.f14529b.f14525a.setAlpha(i9);
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f14529b.f14525a.setAutoMirrored(z10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f14529b.f14525a.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setTint(int i9) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            q8.c(i9, drawable);
        } else {
            this.f14529b.f14525a.setTint(i9);
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f14529b.f14525a.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f14529b.f14525a.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f14529b.f14525a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override
    public final void start() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f14529b;
        if (bVar.f14526b.isStarted()) {
            return;
        }
        bVar.f14526b.start();
        invalidateSelf();
    }

    @Override
    public final void stop() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f14529b.f14526b.end();
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

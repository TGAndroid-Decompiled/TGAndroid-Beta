package a5;

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
import c8.o0;
import org.xmlpull.v1.XmlPullParser;
public final class e extends h implements Animatable {
    public final Context d;
    public final b f216e = new b(this, 0);
    public final c f215c = new Drawable.ConstantState();

    public e(Context context) {
        this.d = context;
    }

    @Override
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        c cVar = this.f215c;
        cVar.f211a.draw(canvas);
        if (cVar.f212b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f215c.f211a.getAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f215c.getClass();
        return changingConfigurations;
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f215c.f211a.getColorFilter();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.f220b) != null && Build.VERSION.SDK_INT >= 24) {
            return new d(((Drawable) this.f220b).getConstantState());
        }
        return null;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f215c.f211a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f215c.f211a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f215c.f211a.getOpacity();
    }

    @Override
    public final void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        throw new UnsupportedOperationException("Method not decompiled: a5.e.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f215c.f211a.isAutoMirrored();
    }

    @Override
    public final boolean isRunning() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f215c.f212b.isRunning();
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f215c.f211a.isStateful();
    }

    @Override
    public final Drawable mutate() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f215c.f211a.setBounds(rect);
        }
    }

    @Override
    public final boolean onLevelChange(int i7) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        return this.f215c.f211a.setLevel(i7);
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f215c.f211a.setState(iArr);
    }

    @Override
    public final void setAlpha(int i7) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f215c.f211a.setAlpha(i7);
        }
    }

    @Override
    public final void setAutoMirrored(boolean z9) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.setAutoMirrored(z9);
        } else {
            this.f215c.f211a.setAutoMirrored(z9);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f215c.f211a.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setTint(int i7) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            o0.a(i7, drawable);
        } else {
            this.f215c.f211a.setTint(i7);
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f215c.f211a.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f215c.f211a.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.setVisible(z9, z10);
        }
        this.f215c.f211a.setVisible(z9, z10);
        return super.setVisible(z9, z10);
    }

    @Override
    public final void start() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        c cVar = this.f215c;
        if (cVar.f212b.isStarted()) {
            return;
        }
        cVar.f212b.start();
        invalidateSelf();
    }

    @Override
    public final void stop() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f215c.f212b.end();
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

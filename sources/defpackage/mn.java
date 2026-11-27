package defpackage;

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
import org.xmlpull.v1.XmlPullParser;
public final class mn extends rp2 implements Animatable {
    public final Context d;
    public final jn e = new jn(this, (byte) 0);
    public final kn c = new Drawable.ConstantState();

    public mn(Context context) {
        this.d = context;
    }

    @Override
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        kn knVar = this.c;
        knVar.a.draw(canvas);
        if (knVar.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.c.a.getAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.c.getClass();
        return changingConfigurations;
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.c.a.getColorFilter();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.b) != null && Build.VERSION.SDK_INT >= 24) {
            return new ln(((Drawable) this.b).getConstantState());
        }
        return null;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.c.a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.c.a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.c.a.getOpacity();
    }

    @Override
    public final void inflate(android.content.res.Resources r21, org.xmlpull.v1.XmlPullParser r22, android.util.AttributeSet r23, android.content.res.Resources.Theme r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.c.a.isAutoMirrored();
    }

    @Override
    public final boolean isRunning() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.c.b.isRunning();
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.c.a.isStateful();
    }

    @Override
    public final Drawable mutate() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.c.a.setBounds(rect);
        }
    }

    @Override
    public final boolean onLevelChange(int i) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.c.a.setLevel(i);
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.c.a.setState(iArr);
    }

    @Override
    public final void setAlpha(int i) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.c.a.setAlpha(i);
        }
    }

    @Override
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.c.a.setAutoMirrored(z);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.c.a.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setTint(int i) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.c.a.setTint(i);
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.c.a.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.c.a.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.c.a.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override
    public final void start() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        kn knVar = this.c;
        if (knVar.b.isStarted()) {
            return;
        }
        knVar.b.start();
        invalidateSelf();
    }

    @Override
    public final void stop() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.c.b.end();
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

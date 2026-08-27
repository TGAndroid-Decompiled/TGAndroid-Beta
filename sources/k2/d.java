package k2;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import g7.k8;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class d extends g implements Animatable {

    public final Context f14351c;
    public final fg.a d = new fg.a(this, 5);

    public final b f14350b = new b();

    public d(Context context) {
        this.f14351c = context;
    }

    @Override
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f14350b;
        bVar.f14346a.draw(canvas);
        if (bVar.f14347b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getAlpha() : this.f14350b.f14346a.getAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f14350b.getClass();
        return changingConfigurations;
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getColorFilter() : this.f14350b.f14346a.getColorFilter();
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f14354a == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f14354a.getConstantState());
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f14350b.f14346a.getIntrinsicHeight();
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f14350b.f14346a.getIntrinsicWidth();
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getOpacity() : this.f14350b.f14346a.getOpacity();
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws Throwable {
        b bVar;
        Animator animatorA;
        p pVar;
        int next;
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            bVar = this.f14350b;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayF = h0.b.f(resources, theme, attributeSet, a.f14340e);
                    int resourceId = typedArrayF.getResourceId(0, 0);
                    if (resourceId != 0) {
                        PorterDuff.Mode mode = p.f14401s;
                        if (Build.VERSION.SDK_INT >= 24) {
                            pVar = new p();
                            ThreadLocal threadLocal = h0.k.f7728a;
                            pVar.f14354a = resources.getDrawable(resourceId, theme);
                            new o(pVar.f14354a.getConstantState());
                        } else {
                            try {
                                XmlResourceParser xml = resources.getXml(resourceId);
                                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                                do {
                                    next = xml.next();
                                    if (next == 2) {
                                        break;
                                    }
                                } while (next != 1);
                                if (next != 2) {
                                    throw new XmlPullParserException("No start tag found");
                                }
                                pVar = new p();
                                pVar.inflate(resources, xml, attributeSetAsAttributeSet, theme);
                            } catch (IOException e9) {
                                Log.e("VectorDrawableCompat", "parser error", e9);
                                pVar = null;
                            } catch (XmlPullParserException e10) {
                                Log.e("VectorDrawableCompat", "parser error", e10);
                                pVar = null;
                            }
                        }
                        pVar.f14405f = false;
                        pVar.setCallback(this.d);
                        p pVar2 = bVar.f14346a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        bVar.f14346a = pVar;
                    }
                    typedArrayF.recycle();
                } else {
                    XmlResourceParser xmlResourceParser = null;
                    if ("target".equals(name)) {
                        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, a.f14341f);
                        String string = typedArrayObtainAttributes.getString(0);
                        int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                        if (resourceId2 != 0) {
                            Context context = this.f14351c;
                            if (context == null) {
                                typedArrayObtainAttributes.recycle();
                                throw new IllegalStateException("Context can't be null when inflating animators");
                            }
                            if (Build.VERSION.SDK_INT >= 24) {
                                animatorA = AnimatorInflater.loadAnimator(context, resourceId2);
                            } else {
                                Resources resources2 = context.getResources();
                                Resources.Theme theme2 = context.getTheme();
                                try {
                                    try {
                                        XmlResourceParser animation = resources2.getAnimation(resourceId2);
                                        try {
                                            animatorA = a.a(context, resources2, theme2, animation, Xml.asAttributeSet(animation), null, 0);
                                            animation.close();
                                        } catch (IOException e11) {
                                            e = e11;
                                            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                            notFoundException.initCause(e);
                                            throw notFoundException;
                                        } catch (XmlPullParserException e12) {
                                            e = e12;
                                            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(resourceId2));
                                            notFoundException2.initCause(e);
                                            throw notFoundException2;
                                        } catch (Throwable th) {
                                            th = th;
                                            xmlResourceParser = animation;
                                            if (xmlResourceParser != null) {
                                                xmlResourceParser.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (IOException e13) {
                                    e = e13;
                                } catch (XmlPullParserException e14) {
                                    e = e14;
                                }
                            }
                            animatorA.setTarget(bVar.f14346a.f14402b.f14391b.f14389o.get(string));
                            if (bVar.f14348c == null) {
                                bVar.f14348c = new ArrayList();
                                bVar.d = new a0.f(0);
                            }
                            bVar.f14348c.add(animatorA);
                            bVar.d.put(animatorA, string);
                        }
                        typedArrayObtainAttributes.recycle();
                    } else {
                        continue;
                    }
                }
            }
            eventType = xmlPullParser.next();
        }
        if (bVar.f14347b == null) {
            bVar.f14347b = new AnimatorSet();
        }
        bVar.f14347b.playTogether(bVar.f14348c);
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.isAutoMirrored() : this.f14350b.f14346a.isAutoMirrored();
    }

    @Override
    public final boolean isRunning() {
        Drawable drawable = this.f14354a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f14350b.f14347b.isRunning();
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.isStateful() : this.f14350b.f14346a.isStateful();
    }

    @Override
    public final Drawable mutate() {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f14350b.f14346a.setBounds(rect);
        }
    }

    @Override
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.setLevel(i10) : this.f14350b.f14346a.setLevel(i10);
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.setState(iArr) : this.f14350b.f14346a.setState(iArr);
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f14350b.f14346a.setAlpha(i10);
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f14350b.f14346a.setAutoMirrored(z10);
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f14350b.f14346a.setColorFilter(colorFilter);
        }
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            k8.c(i10, drawable);
        } else {
            this.f14350b.f14346a.setTint(i10);
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f14350b.f14346a.setTintList(colorStateList);
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f14350b.f14346a.setTintMode(mode);
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f14350b.f14346a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override
    public final void start() {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f14350b;
        if (bVar.f14347b.isStarted()) {
            return;
        }
        bVar.f14347b.start();
        invalidateSelf();
    }

    @Override
    public final void stop() {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f14350b.f14347b.end();
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws Throwable {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
public final class r9c extends yo2 {
    public static final PorterDuff.Mode w = PorterDuff.Mode.SRC_IN;
    public p9c c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f;
    public boolean h;
    public final float[] n;
    public final Matrix r;
    public final Rect s;

    public r9c() {
        this.h = true;
        this.n = new float[9];
        this.r = new Matrix();
        this.s = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = w;
        constantState.b = new o9c();
        this.c = constantState;
    }

    public static r9c c(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            r9c r9cVar = new r9c();
            ThreadLocal threadLocal = ka9.a;
            r9cVar.b = resources.getDrawable(i, theme);
            new q9c(((Drawable) r9cVar.b).getConstantState());
            return r9cVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    r9c r9cVar2 = new r9c();
                    r9cVar2.inflate(resources, xml, asAttributeSet, theme);
                    return r9cVar2;
                }
            } while (next != 1);
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.s;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.e;
            if (colorFilter == null) {
                colorFilter = this.d;
            }
            Matrix matrix = this.r;
            canvas.getMatrix(matrix);
            float[] fArr = this.n;
            matrix.getValues(fArr);
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (rect.width() * abs));
            int min2 = Math.min(2048, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && getLayoutDirection() == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                p9c p9cVar = this.c;
                Bitmap bitmap = p9cVar.f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != p9cVar.f.getHeight()) {
                    p9cVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    p9cVar.k = true;
                }
                boolean z = this.h;
                p9c p9cVar2 = this.c;
                if (!z) {
                    p9cVar2.f.eraseColor(0);
                    Canvas canvas2 = new Canvas(p9cVar2.f);
                    o9c o9cVar = p9cVar2.b;
                    o9cVar.a(o9cVar.g, o9c.p, canvas2, min, min2);
                } else if (p9cVar2.k || p9cVar2.g != p9cVar2.c || p9cVar2.h != p9cVar2.d || p9cVar2.j != p9cVar2.e || p9cVar2.i != p9cVar2.b.getRootAlpha()) {
                    p9c p9cVar3 = this.c;
                    p9cVar3.f.eraseColor(0);
                    Canvas canvas3 = new Canvas(p9cVar3.f);
                    o9c o9cVar2 = p9cVar3.b;
                    o9cVar2.a(o9cVar2.g, o9c.p, canvas3, min, min2);
                    p9c p9cVar4 = this.c;
                    p9cVar4.g = p9cVar4.c;
                    p9cVar4.h = p9cVar4.d;
                    p9cVar4.i = p9cVar4.b.getRootAlpha();
                    p9cVar4.j = p9cVar4.e;
                    p9cVar4.k = false;
                }
                p9c p9cVar5 = this.c;
                if (p9cVar5.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (p9cVar5.l == null) {
                        Paint paint2 = new Paint();
                        p9cVar5.l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    p9cVar5.l.setAlpha(p9cVar5.b.getRootAlpha());
                    p9cVar5.l.setColorFilter(colorFilter);
                    paint = p9cVar5.l;
                }
                canvas.drawBitmap(p9cVar5.f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.c.b.getRootAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.c.getChangingConfigurations();
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.e;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.b) != null && Build.VERSION.SDK_INT >= 24) {
            return new q9c(((Drawable) this.b).getConstantState());
        }
        this.c.a = getChangingConfigurations();
        return this.c;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.c.b.i;
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.c.b.h;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Paint.Cap cap;
        int i6;
        Paint.Join join;
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        p9c p9cVar = this.c;
        p9cVar.b = new o9c();
        TypedArray d = bwe.d(resources, theme, attributeSet, pd0.b);
        p9c p9cVar2 = this.c;
        o9c o9cVar = p9cVar2.b;
        if (!bwe.c(xmlPullParser, "tintMode")) {
            i = -1;
        } else {
            i = d.getInt(6, -1);
        }
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            mode = PorterDuff.Mode.MULTIPLY;
                            break;
                        case 15:
                            mode = PorterDuff.Mode.SCREEN;
                            break;
                        case 16:
                            mode = PorterDuff.Mode.ADD;
                            break;
                    }
                } else {
                    mode = PorterDuff.Mode.SRC_ATOP;
                }
            }
        } else {
            mode = PorterDuff.Mode.SRC_OVER;
        }
        p9cVar2.d = mode;
        ColorStateList colorStateList = null;
        int i7 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            d.getValue(1, typedValue);
            int i8 = typedValue.type;
            if (i8 != 2) {
                if (i8 >= 28 && i8 <= 31) {
                    colorStateList = ColorStateList.valueOf(typedValue.data);
                } else {
                    Resources resources2 = d.getResources();
                    int resourceId = d.getResourceId(1, 0);
                    ThreadLocal threadLocal = am2.a;
                    try {
                        colorStateList = am2.a(resources2, resources2.getXml(resourceId), theme);
                    } catch (Exception e) {
                        Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                    }
                }
            } else {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            p9cVar2.c = colorStateList2;
        }
        boolean z = p9cVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = d.getBoolean(5, z);
        }
        p9cVar2.e = z;
        float f = o9cVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = d.getFloat(7, f);
        }
        o9cVar.j = f;
        float f2 = o9cVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = d.getFloat(8, f2);
        }
        o9cVar.k = f2;
        if (o9cVar.j > 0.0f) {
            if (f2 > 0.0f) {
                o9cVar.h = d.getDimension(3, o9cVar.h);
                float dimension = d.getDimension(2, o9cVar.i);
                o9cVar.i = dimension;
                if (o9cVar.h > 0.0f) {
                    if (dimension > 0.0f) {
                        float alpha = o9cVar.getAlpha();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                            alpha = d.getFloat(4, alpha);
                        }
                        o9cVar.setAlpha(alpha);
                        String string = d.getString(0);
                        if (string != null) {
                            o9cVar.m = string;
                            o9cVar.o.put(string, o9cVar);
                        }
                        d.recycle();
                        p9cVar.a = getChangingConfigurations();
                        p9cVar.k = true;
                        p9c p9cVar3 = this.c;
                        o9c o9cVar2 = p9cVar3.b;
                        ArrayDeque arrayDeque = new ArrayDeque();
                        l9c l9cVar = o9cVar2.g;
                        ps psVar = o9cVar2.o;
                        arrayDeque.push(l9cVar);
                        int eventType = xmlPullParser.getEventType();
                        int depth = xmlPullParser.getDepth() + 1;
                        boolean z2 = true;
                        while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                            if (eventType == 2) {
                                String name = xmlPullParser.getName();
                                l9c l9cVar2 = (l9c) arrayDeque.peek();
                                i2 = depth;
                                if ("path".equals(name)) {
                                    ?? n9cVar = new n9c();
                                    n9cVar.e = 0.0f;
                                    n9cVar.g = 1.0f;
                                    n9cVar.h = 1.0f;
                                    n9cVar.i = 0.0f;
                                    n9cVar.j = 1.0f;
                                    n9cVar.k = 0.0f;
                                    Paint.Cap cap2 = Paint.Cap.BUTT;
                                    n9cVar.l = cap2;
                                    Paint.Join join2 = Paint.Join.MITER;
                                    n9cVar.m = join2;
                                    n9cVar.n = 4.0f;
                                    TypedArray d2 = bwe.d(resources, theme, attributeSet, pd0.d);
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        String string2 = d2.getString(0);
                                        if (string2 != null) {
                                            n9cVar.b = string2;
                                        }
                                        String string3 = d2.getString(2);
                                        if (string3 != null) {
                                            n9cVar.a = mqe.c(string3);
                                        }
                                        n9cVar.f = bwe.a(d2, xmlPullParser, theme, "fillColor", 1);
                                        float f3 = n9cVar.h;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                            f3 = d2.getFloat(12, f3);
                                        }
                                        n9cVar.h = f3;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null) {
                                            i5 = d2.getInt(8, -1);
                                        } else {
                                            i5 = -1;
                                        }
                                        Paint.Cap cap3 = n9cVar.l;
                                        if (i5 != 0) {
                                            if (i5 != 1) {
                                                if (i5 != 2) {
                                                    cap = cap3;
                                                } else {
                                                    cap = Paint.Cap.SQUARE;
                                                }
                                            } else {
                                                cap = Paint.Cap.ROUND;
                                            }
                                        } else {
                                            cap = cap2;
                                        }
                                        n9cVar.l = cap;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null) {
                                            i6 = d2.getInt(9, -1);
                                        } else {
                                            i6 = -1;
                                        }
                                        Paint.Join join3 = n9cVar.m;
                                        if (i6 != 0) {
                                            if (i6 != 1) {
                                                if (i6 != 2) {
                                                    join = join3;
                                                } else {
                                                    join = Paint.Join.BEVEL;
                                                }
                                            } else {
                                                join = Paint.Join.ROUND;
                                            }
                                        } else {
                                            join = join2;
                                        }
                                        n9cVar.m = join;
                                        float f4 = n9cVar.n;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                            f4 = d2.getFloat(10, f4);
                                        }
                                        n9cVar.n = f4;
                                        n9cVar.d = bwe.a(d2, xmlPullParser, theme, "strokeColor", 3);
                                        float f5 = n9cVar.g;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                            f5 = d2.getFloat(11, f5);
                                        }
                                        n9cVar.g = f5;
                                        float f6 = n9cVar.e;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                            f6 = d2.getFloat(4, f6);
                                        }
                                        n9cVar.e = f6;
                                        float f7 = n9cVar.j;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                            f7 = d2.getFloat(6, f7);
                                        }
                                        n9cVar.j = f7;
                                        float f8 = n9cVar.k;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                            f8 = d2.getFloat(7, f8);
                                        }
                                        n9cVar.k = f8;
                                        float f9 = n9cVar.i;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                            f9 = d2.getFloat(5, f9);
                                        }
                                        n9cVar.i = f9;
                                        int i9 = n9cVar.c;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                            i9 = d2.getInt(13, i9);
                                        }
                                        n9cVar.c = i9;
                                    }
                                    d2.recycle();
                                    l9cVar2.b.add(n9cVar);
                                    if (n9cVar.getPathName() != null) {
                                        psVar.put(n9cVar.getPathName(), n9cVar);
                                    }
                                    p9cVar3.a = p9cVar3.a;
                                    z2 = false;
                                } else if ("clip-path".equals(name)) {
                                    n9c n9cVar2 = new n9c();
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        TypedArray d3 = bwe.d(resources, theme, attributeSet, pd0.e);
                                        String string4 = d3.getString(0);
                                        if (string4 != null) {
                                            n9cVar2.b = string4;
                                        }
                                        String string5 = d3.getString(1);
                                        if (string5 != null) {
                                            n9cVar2.a = mqe.c(string5);
                                        }
                                        if (!bwe.c(xmlPullParser, "fillType")) {
                                            i4 = 0;
                                        } else {
                                            i4 = d3.getInt(2, 0);
                                        }
                                        n9cVar2.c = i4;
                                        d3.recycle();
                                    }
                                    l9cVar2.b.add(n9cVar2);
                                    if (n9cVar2.getPathName() != null) {
                                        psVar.put(n9cVar2.getPathName(), n9cVar2);
                                    }
                                    p9cVar3.a = p9cVar3.a;
                                } else if ("group".equals(name)) {
                                    l9c l9cVar3 = new l9c();
                                    TypedArray d4 = bwe.d(resources, theme, attributeSet, pd0.c);
                                    float f10 = l9cVar3.c;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                                        f10 = d4.getFloat(5, f10);
                                    }
                                    l9cVar3.c = f10;
                                    l9cVar3.d = d4.getFloat(1, l9cVar3.d);
                                    l9cVar3.e = d4.getFloat(2, l9cVar3.e);
                                    float f11 = l9cVar3.f;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                        f11 = d4.getFloat(3, f11);
                                    }
                                    l9cVar3.f = f11;
                                    float f12 = l9cVar3.g;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                        f12 = d4.getFloat(4, f12);
                                    }
                                    l9cVar3.g = f12;
                                    float f13 = l9cVar3.h;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                        f13 = d4.getFloat(6, f13);
                                    }
                                    l9cVar3.h = f13;
                                    float f14 = l9cVar3.i;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                        f14 = d4.getFloat(7, f14);
                                    }
                                    l9cVar3.i = f14;
                                    String string6 = d4.getString(0);
                                    if (string6 != null) {
                                        l9cVar3.k = string6;
                                    }
                                    l9cVar3.c();
                                    d4.recycle();
                                    l9cVar2.b.add(l9cVar3);
                                    arrayDeque.push(l9cVar3);
                                    if (l9cVar3.getGroupName() != null) {
                                        psVar.put(l9cVar3.getGroupName(), l9cVar3);
                                    }
                                    p9cVar3.a = p9cVar3.a;
                                }
                                i3 = 1;
                            } else {
                                i2 = depth;
                                i3 = 1;
                                if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                    arrayDeque.pop();
                                }
                            }
                            eventType = xmlPullParser.next();
                            i7 = i3;
                            depth = i2;
                        }
                        if (!z2) {
                            this.d = d(p9cVar.c, p9cVar.d);
                            return;
                        }
                        throw new XmlPullParserException("no path defined");
                    }
                    throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires height > 0");
                }
                throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires width > 0");
            }
            throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        throw new XmlPullParserException(d.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
    }

    @Override
    public final void invalidateSelf() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.c.e;
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            p9c p9cVar = this.c;
            if (p9cVar != null) {
                o9c o9cVar = p9cVar.b;
                Boolean bool = o9cVar.n;
                if (bool == null) {
                    bool = Boolean.valueOf(o9cVar.g.a());
                    o9cVar.n = bool;
                }
                if (!bool.booleanValue()) {
                    ColorStateList colorStateList = this.c.c;
                    if (colorStateList == null || !colorStateList.isStateful()) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final Drawable mutate() {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f && super.mutate() == this) {
            p9c p9cVar = this.c;
            ?? constantState = new Drawable.ConstantState();
            constantState.c = null;
            constantState.d = w;
            if (p9cVar != null) {
                constantState.a = p9cVar.a;
                o9c o9cVar = new o9c(p9cVar.b);
                constantState.b = o9cVar;
                if (p9cVar.b.e != null) {
                    o9cVar.e = new Paint(p9cVar.b.e);
                }
                if (p9cVar.b.d != null) {
                    constantState.b.d = new Paint(p9cVar.b.d);
                }
                constantState.c = p9cVar.c;
                constantState.d = p9cVar.d;
                constantState.e = p9cVar.e;
            }
            this.c = constantState;
            this.f = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        p9c p9cVar = this.c;
        ColorStateList colorStateList = p9cVar.c;
        if (colorStateList != null && (mode = p9cVar.d) != null) {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        o9c o9cVar = p9cVar.b;
        Boolean bool = o9cVar.n;
        if (bool == null) {
            bool = Boolean.valueOf(o9cVar.g.a());
            o9cVar.n = bool;
        }
        if (bool.booleanValue()) {
            boolean b = p9cVar.b.g.b(iArr);
            p9cVar.k |= b;
            if (b) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override
    public final void setAlpha(int i) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.c.b.getRootAlpha() != i) {
            this.c.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.c.e = z;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.e = colorFilter;
        invalidateSelf();
    }

    @Override
    public final void setTint(int i) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        p9c p9cVar = this.c;
        if (p9cVar.c != colorStateList) {
            p9cVar.c = colorStateList;
            this.d = d(colorStateList, p9cVar.d);
            invalidateSelf();
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        p9c p9cVar = this.c;
        if (p9cVar.d != mode) {
            p9cVar.d = mode;
            this.d = d(p9cVar.c, mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    public r9c(p9c p9cVar) {
        this.h = true;
        this.n = new float[9];
        this.r = new Matrix();
        this.s = new Rect();
        this.c = p9cVar;
        this.d = d(p9cVar.c, p9cVar.d);
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = (Drawable) this.b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }
}

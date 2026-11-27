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
public final class rdc extends rp2 {
    public static final PorterDuff.Mode w = PorterDuff.Mode.SRC_IN;
    public pdc c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f;
    public boolean h;
    public final float[] n;
    public final Matrix r;
    public final Rect s;

    public rdc() {
        this.h = true;
        this.n = new float[9];
        this.r = new Matrix();
        this.s = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = w;
        constantState.b = new odc();
        this.c = constantState;
    }

    public static rdc c(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            rdc rdcVar = new rdc();
            ThreadLocal threadLocal = yd9.a;
            rdcVar.b = resources.getDrawable(i, theme);
            new qdc(((Drawable) rdcVar.b).getConstantState());
            return rdcVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    rdc rdcVar2 = new rdc();
                    rdcVar2.inflate(resources, xml, asAttributeSet, theme);
                    return rdcVar2;
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
                pdc pdcVar = this.c;
                Bitmap bitmap = pdcVar.f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != pdcVar.f.getHeight()) {
                    pdcVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    pdcVar.k = true;
                }
                boolean z = this.h;
                pdc pdcVar2 = this.c;
                if (!z) {
                    pdcVar2.f.eraseColor(0);
                    Canvas canvas2 = new Canvas(pdcVar2.f);
                    odc odcVar = pdcVar2.b;
                    odcVar.a(odcVar.g, odc.p, canvas2, min, min2);
                } else if (pdcVar2.k || pdcVar2.g != pdcVar2.c || pdcVar2.h != pdcVar2.d || pdcVar2.j != pdcVar2.e || pdcVar2.i != pdcVar2.b.getRootAlpha()) {
                    pdc pdcVar3 = this.c;
                    pdcVar3.f.eraseColor(0);
                    Canvas canvas3 = new Canvas(pdcVar3.f);
                    odc odcVar2 = pdcVar3.b;
                    odcVar2.a(odcVar2.g, odc.p, canvas3, min, min2);
                    pdc pdcVar4 = this.c;
                    pdcVar4.g = pdcVar4.c;
                    pdcVar4.h = pdcVar4.d;
                    pdcVar4.i = pdcVar4.b.getRootAlpha();
                    pdcVar4.j = pdcVar4.e;
                    pdcVar4.k = false;
                }
                pdc pdcVar5 = this.c;
                if (pdcVar5.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (pdcVar5.l == null) {
                        Paint paint2 = new Paint();
                        pdcVar5.l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    pdcVar5.l.setAlpha(pdcVar5.b.getRootAlpha());
                    pdcVar5.l.setColorFilter(colorFilter);
                    paint = pdcVar5.l;
                }
                canvas.drawBitmap(pdcVar5.f, (Rect) null, rect, paint);
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
            return new qdc(((Drawable) this.b).getConstantState());
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
        pdc pdcVar = this.c;
        pdcVar.b = new odc();
        TypedArray d = m1f.d(resources, theme, attributeSet, rd0.b);
        pdc pdcVar2 = this.c;
        odc odcVar = pdcVar2.b;
        if (!m1f.c(xmlPullParser, "tintMode")) {
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
        pdcVar2.d = mode;
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
                    ThreadLocal threadLocal = um2.a;
                    try {
                        colorStateList = um2.a(resources2, resources2.getXml(resourceId), theme);
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
            pdcVar2.c = colorStateList2;
        }
        boolean z = pdcVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = d.getBoolean(5, z);
        }
        pdcVar2.e = z;
        float f = odcVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = d.getFloat(7, f);
        }
        odcVar.j = f;
        float f2 = odcVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = d.getFloat(8, f2);
        }
        odcVar.k = f2;
        if (odcVar.j > 0.0f) {
            if (f2 > 0.0f) {
                odcVar.h = d.getDimension(3, odcVar.h);
                float dimension = d.getDimension(2, odcVar.i);
                odcVar.i = dimension;
                if (odcVar.h > 0.0f) {
                    if (dimension > 0.0f) {
                        float alpha = odcVar.getAlpha();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                            alpha = d.getFloat(4, alpha);
                        }
                        odcVar.setAlpha(alpha);
                        String string = d.getString(0);
                        if (string != null) {
                            odcVar.m = string;
                            odcVar.o.put(string, odcVar);
                        }
                        d.recycle();
                        pdcVar.a = getChangingConfigurations();
                        pdcVar.k = true;
                        pdc pdcVar3 = this.c;
                        odc odcVar2 = pdcVar3.b;
                        ArrayDeque arrayDeque = new ArrayDeque();
                        ldc ldcVar = odcVar2.g;
                        qs qsVar = odcVar2.o;
                        arrayDeque.push(ldcVar);
                        int eventType = xmlPullParser.getEventType();
                        int depth = xmlPullParser.getDepth() + 1;
                        boolean z2 = true;
                        while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                            if (eventType == 2) {
                                String name = xmlPullParser.getName();
                                ldc ldcVar2 = (ldc) arrayDeque.peek();
                                i2 = depth;
                                if ("path".equals(name)) {
                                    ?? ndcVar = new ndc();
                                    ndcVar.e = 0.0f;
                                    ndcVar.g = 1.0f;
                                    ndcVar.h = 1.0f;
                                    ndcVar.i = 0.0f;
                                    ndcVar.j = 1.0f;
                                    ndcVar.k = 0.0f;
                                    Paint.Cap cap2 = Paint.Cap.BUTT;
                                    ndcVar.l = cap2;
                                    Paint.Join join2 = Paint.Join.MITER;
                                    ndcVar.m = join2;
                                    ndcVar.n = 4.0f;
                                    TypedArray d2 = m1f.d(resources, theme, attributeSet, rd0.d);
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        String string2 = d2.getString(0);
                                        if (string2 != null) {
                                            ndcVar.b = string2;
                                        }
                                        String string3 = d2.getString(2);
                                        if (string3 != null) {
                                            ndcVar.a = hve.c(string3);
                                        }
                                        ndcVar.f = m1f.a(d2, xmlPullParser, theme, "fillColor", 1);
                                        float f3 = ndcVar.h;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                            f3 = d2.getFloat(12, f3);
                                        }
                                        ndcVar.h = f3;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null) {
                                            i5 = d2.getInt(8, -1);
                                        } else {
                                            i5 = -1;
                                        }
                                        Paint.Cap cap3 = ndcVar.l;
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
                                        ndcVar.l = cap;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null) {
                                            i6 = d2.getInt(9, -1);
                                        } else {
                                            i6 = -1;
                                        }
                                        Paint.Join join3 = ndcVar.m;
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
                                        ndcVar.m = join;
                                        float f4 = ndcVar.n;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                            f4 = d2.getFloat(10, f4);
                                        }
                                        ndcVar.n = f4;
                                        ndcVar.d = m1f.a(d2, xmlPullParser, theme, "strokeColor", 3);
                                        float f5 = ndcVar.g;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                            f5 = d2.getFloat(11, f5);
                                        }
                                        ndcVar.g = f5;
                                        float f6 = ndcVar.e;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                            f6 = d2.getFloat(4, f6);
                                        }
                                        ndcVar.e = f6;
                                        float f7 = ndcVar.j;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                            f7 = d2.getFloat(6, f7);
                                        }
                                        ndcVar.j = f7;
                                        float f8 = ndcVar.k;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                            f8 = d2.getFloat(7, f8);
                                        }
                                        ndcVar.k = f8;
                                        float f9 = ndcVar.i;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                            f9 = d2.getFloat(5, f9);
                                        }
                                        ndcVar.i = f9;
                                        int i9 = ndcVar.c;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                            i9 = d2.getInt(13, i9);
                                        }
                                        ndcVar.c = i9;
                                    }
                                    d2.recycle();
                                    ldcVar2.b.add(ndcVar);
                                    if (ndcVar.getPathName() != null) {
                                        qsVar.put(ndcVar.getPathName(), ndcVar);
                                    }
                                    pdcVar3.a = pdcVar3.a;
                                    z2 = false;
                                } else if ("clip-path".equals(name)) {
                                    ndc ndcVar2 = new ndc();
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        TypedArray d3 = m1f.d(resources, theme, attributeSet, rd0.e);
                                        String string4 = d3.getString(0);
                                        if (string4 != null) {
                                            ndcVar2.b = string4;
                                        }
                                        String string5 = d3.getString(1);
                                        if (string5 != null) {
                                            ndcVar2.a = hve.c(string5);
                                        }
                                        if (!m1f.c(xmlPullParser, "fillType")) {
                                            i4 = 0;
                                        } else {
                                            i4 = d3.getInt(2, 0);
                                        }
                                        ndcVar2.c = i4;
                                        d3.recycle();
                                    }
                                    ldcVar2.b.add(ndcVar2);
                                    if (ndcVar2.getPathName() != null) {
                                        qsVar.put(ndcVar2.getPathName(), ndcVar2);
                                    }
                                    pdcVar3.a = pdcVar3.a;
                                } else if ("group".equals(name)) {
                                    ldc ldcVar3 = new ldc();
                                    TypedArray d4 = m1f.d(resources, theme, attributeSet, rd0.c);
                                    float f10 = ldcVar3.c;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                                        f10 = d4.getFloat(5, f10);
                                    }
                                    ldcVar3.c = f10;
                                    ldcVar3.d = d4.getFloat(1, ldcVar3.d);
                                    ldcVar3.e = d4.getFloat(2, ldcVar3.e);
                                    float f11 = ldcVar3.f;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                        f11 = d4.getFloat(3, f11);
                                    }
                                    ldcVar3.f = f11;
                                    float f12 = ldcVar3.g;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                        f12 = d4.getFloat(4, f12);
                                    }
                                    ldcVar3.g = f12;
                                    float f13 = ldcVar3.h;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                        f13 = d4.getFloat(6, f13);
                                    }
                                    ldcVar3.h = f13;
                                    float f14 = ldcVar3.i;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                        f14 = d4.getFloat(7, f14);
                                    }
                                    ldcVar3.i = f14;
                                    String string6 = d4.getString(0);
                                    if (string6 != null) {
                                        ldcVar3.k = string6;
                                    }
                                    ldcVar3.c();
                                    d4.recycle();
                                    ldcVar2.b.add(ldcVar3);
                                    arrayDeque.push(ldcVar3);
                                    if (ldcVar3.getGroupName() != null) {
                                        qsVar.put(ldcVar3.getGroupName(), ldcVar3);
                                    }
                                    pdcVar3.a = pdcVar3.a;
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
                            this.d = d(pdcVar.c, pdcVar.d);
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
            pdc pdcVar = this.c;
            if (pdcVar != null) {
                odc odcVar = pdcVar.b;
                Boolean bool = odcVar.n;
                if (bool == null) {
                    bool = Boolean.valueOf(odcVar.g.a());
                    odcVar.n = bool;
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
            pdc pdcVar = this.c;
            ?? constantState = new Drawable.ConstantState();
            constantState.c = null;
            constantState.d = w;
            if (pdcVar != null) {
                constantState.a = pdcVar.a;
                odc odcVar = new odc(pdcVar.b);
                constantState.b = odcVar;
                if (pdcVar.b.e != null) {
                    odcVar.e = new Paint(pdcVar.b.e);
                }
                if (pdcVar.b.d != null) {
                    constantState.b.d = new Paint(pdcVar.b.d);
                }
                constantState.c = pdcVar.c;
                constantState.d = pdcVar.d;
                constantState.e = pdcVar.e;
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
        pdc pdcVar = this.c;
        ColorStateList colorStateList = pdcVar.c;
        if (colorStateList != null && (mode = pdcVar.d) != null) {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        odc odcVar = pdcVar.b;
        Boolean bool = odcVar.n;
        if (bool == null) {
            bool = Boolean.valueOf(odcVar.g.a());
            odcVar.n = bool;
        }
        if (bool.booleanValue()) {
            boolean b = pdcVar.b.g.b(iArr);
            pdcVar.k |= b;
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
        pdc pdcVar = this.c;
        if (pdcVar.c != colorStateList) {
            pdcVar.c = colorStateList;
            this.d = d(colorStateList, pdcVar.d);
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
        pdc pdcVar = this.c;
        if (pdcVar.d != mode) {
            pdcVar.d = mode;
            this.d = d(pdcVar.c, mode);
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

    public rdc(pdc pdcVar) {
        this.h = true;
        this.n = new float[9];
        this.r = new Matrix();
        this.s = new Rect();
        this.c = pdcVar;
        this.d = d(pdcVar.c, pdcVar.d);
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

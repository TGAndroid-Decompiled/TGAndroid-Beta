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
public final class sbc extends jq2 {
    public static final PorterDuff.Mode w = PorterDuff.Mode.SRC_IN;
    public qbc c;
    public PorterDuffColorFilter d;
    public ColorFilter e;
    public boolean f;
    public boolean h;
    public final float[] n;
    public final Matrix r;
    public final Rect s;

    public sbc() {
        this.h = true;
        this.n = new float[9];
        this.r = new Matrix();
        this.s = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = w;
        constantState.b = new pbc();
        this.c = constantState;
    }

    public static sbc c(Resources resources, int i, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            sbc sbcVar = new sbc();
            ThreadLocal threadLocal = kc9.a;
            sbcVar.b = resources.getDrawable(i, theme);
            new rbc(((Drawable) sbcVar.b).getConstantState());
            return sbcVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    sbc sbcVar2 = new sbc();
                    sbcVar2.inflate(resources, xml, asAttributeSet, theme);
                    return sbcVar2;
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
                qbc qbcVar = this.c;
                Bitmap bitmap = qbcVar.f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != qbcVar.f.getHeight()) {
                    qbcVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    qbcVar.k = true;
                }
                boolean z = this.h;
                qbc qbcVar2 = this.c;
                if (!z) {
                    qbcVar2.f.eraseColor(0);
                    Canvas canvas2 = new Canvas(qbcVar2.f);
                    pbc pbcVar = qbcVar2.b;
                    pbcVar.a(pbcVar.g, pbc.p, canvas2, min, min2);
                } else if (qbcVar2.k || qbcVar2.g != qbcVar2.c || qbcVar2.h != qbcVar2.d || qbcVar2.j != qbcVar2.e || qbcVar2.i != qbcVar2.b.getRootAlpha()) {
                    qbc qbcVar3 = this.c;
                    qbcVar3.f.eraseColor(0);
                    Canvas canvas3 = new Canvas(qbcVar3.f);
                    pbc pbcVar2 = qbcVar3.b;
                    pbcVar2.a(pbcVar2.g, pbc.p, canvas3, min, min2);
                    qbc qbcVar4 = this.c;
                    qbcVar4.g = qbcVar4.c;
                    qbcVar4.h = qbcVar4.d;
                    qbcVar4.i = qbcVar4.b.getRootAlpha();
                    qbcVar4.j = qbcVar4.e;
                    qbcVar4.k = false;
                }
                qbc qbcVar5 = this.c;
                if (qbcVar5.b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (qbcVar5.l == null) {
                        Paint paint2 = new Paint();
                        qbcVar5.l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    qbcVar5.l.setAlpha(qbcVar5.b.getRootAlpha());
                    qbcVar5.l.setColorFilter(colorFilter);
                    paint = qbcVar5.l;
                }
                canvas.drawBitmap(qbcVar5.f, (Rect) null, rect, paint);
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
            return new rbc(((Drawable) this.b).getConstantState());
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
        qbc qbcVar = this.c;
        qbcVar.b = new pbc();
        TypedArray d = dye.d(resources, theme, attributeSet, pe0.b);
        qbc qbcVar2 = this.c;
        pbc pbcVar = qbcVar2.b;
        if (!dye.c(xmlPullParser, "tintMode")) {
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
        qbcVar2.d = mode;
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
                    ThreadLocal threadLocal = nn2.a;
                    try {
                        colorStateList = nn2.a(resources2, resources2.getXml(resourceId), theme);
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
            qbcVar2.c = colorStateList2;
        }
        boolean z = qbcVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z = d.getBoolean(5, z);
        }
        qbcVar2.e = z;
        float f = pbcVar.j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f = d.getFloat(7, f);
        }
        pbcVar.j = f;
        float f2 = pbcVar.k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f2 = d.getFloat(8, f2);
        }
        pbcVar.k = f2;
        if (pbcVar.j > 0.0f) {
            if (f2 > 0.0f) {
                pbcVar.h = d.getDimension(3, pbcVar.h);
                float dimension = d.getDimension(2, pbcVar.i);
                pbcVar.i = dimension;
                if (pbcVar.h > 0.0f) {
                    if (dimension > 0.0f) {
                        float alpha = pbcVar.getAlpha();
                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                            alpha = d.getFloat(4, alpha);
                        }
                        pbcVar.setAlpha(alpha);
                        String string = d.getString(0);
                        if (string != null) {
                            pbcVar.m = string;
                            pbcVar.o.put(string, pbcVar);
                        }
                        d.recycle();
                        qbcVar.a = getChangingConfigurations();
                        qbcVar.k = true;
                        qbc qbcVar3 = this.c;
                        pbc pbcVar2 = qbcVar3.b;
                        ArrayDeque arrayDeque = new ArrayDeque();
                        mbc mbcVar = pbcVar2.g;
                        qt qtVar = pbcVar2.o;
                        arrayDeque.push(mbcVar);
                        int eventType = xmlPullParser.getEventType();
                        int depth = xmlPullParser.getDepth() + 1;
                        boolean z2 = true;
                        while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                            if (eventType == 2) {
                                String name = xmlPullParser.getName();
                                mbc mbcVar2 = (mbc) arrayDeque.peek();
                                i2 = depth;
                                if ("path".equals(name)) {
                                    ?? obcVar = new obc();
                                    obcVar.e = 0.0f;
                                    obcVar.g = 1.0f;
                                    obcVar.h = 1.0f;
                                    obcVar.i = 0.0f;
                                    obcVar.j = 1.0f;
                                    obcVar.k = 0.0f;
                                    Paint.Cap cap2 = Paint.Cap.BUTT;
                                    obcVar.l = cap2;
                                    Paint.Join join2 = Paint.Join.MITER;
                                    obcVar.m = join2;
                                    obcVar.n = 4.0f;
                                    TypedArray d2 = dye.d(resources, theme, attributeSet, pe0.d);
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        String string2 = d2.getString(0);
                                        if (string2 != null) {
                                            obcVar.b = string2;
                                        }
                                        String string3 = d2.getString(2);
                                        if (string3 != null) {
                                            obcVar.a = pse.c(string3);
                                        }
                                        obcVar.f = dye.a(d2, xmlPullParser, theme, "fillColor", 1);
                                        float f3 = obcVar.h;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                            f3 = d2.getFloat(12, f3);
                                        }
                                        obcVar.h = f3;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null) {
                                            i5 = d2.getInt(8, -1);
                                        } else {
                                            i5 = -1;
                                        }
                                        Paint.Cap cap3 = obcVar.l;
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
                                        obcVar.l = cap;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null) {
                                            i6 = d2.getInt(9, -1);
                                        } else {
                                            i6 = -1;
                                        }
                                        Paint.Join join3 = obcVar.m;
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
                                        obcVar.m = join;
                                        float f4 = obcVar.n;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                            f4 = d2.getFloat(10, f4);
                                        }
                                        obcVar.n = f4;
                                        obcVar.d = dye.a(d2, xmlPullParser, theme, "strokeColor", 3);
                                        float f5 = obcVar.g;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                            f5 = d2.getFloat(11, f5);
                                        }
                                        obcVar.g = f5;
                                        float f6 = obcVar.e;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                            f6 = d2.getFloat(4, f6);
                                        }
                                        obcVar.e = f6;
                                        float f7 = obcVar.j;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                            f7 = d2.getFloat(6, f7);
                                        }
                                        obcVar.j = f7;
                                        float f8 = obcVar.k;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                            f8 = d2.getFloat(7, f8);
                                        }
                                        obcVar.k = f8;
                                        float f9 = obcVar.i;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                            f9 = d2.getFloat(5, f9);
                                        }
                                        obcVar.i = f9;
                                        int i9 = obcVar.c;
                                        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                            i9 = d2.getInt(13, i9);
                                        }
                                        obcVar.c = i9;
                                    }
                                    d2.recycle();
                                    mbcVar2.b.add(obcVar);
                                    if (obcVar.getPathName() != null) {
                                        qtVar.put(obcVar.getPathName(), obcVar);
                                    }
                                    qbcVar3.a = qbcVar3.a;
                                    z2 = false;
                                } else if ("clip-path".equals(name)) {
                                    obc obcVar2 = new obc();
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                        TypedArray d3 = dye.d(resources, theme, attributeSet, pe0.e);
                                        String string4 = d3.getString(0);
                                        if (string4 != null) {
                                            obcVar2.b = string4;
                                        }
                                        String string5 = d3.getString(1);
                                        if (string5 != null) {
                                            obcVar2.a = pse.c(string5);
                                        }
                                        if (!dye.c(xmlPullParser, "fillType")) {
                                            i4 = 0;
                                        } else {
                                            i4 = d3.getInt(2, 0);
                                        }
                                        obcVar2.c = i4;
                                        d3.recycle();
                                    }
                                    mbcVar2.b.add(obcVar2);
                                    if (obcVar2.getPathName() != null) {
                                        qtVar.put(obcVar2.getPathName(), obcVar2);
                                    }
                                    qbcVar3.a = qbcVar3.a;
                                } else if ("group".equals(name)) {
                                    mbc mbcVar3 = new mbc();
                                    TypedArray d4 = dye.d(resources, theme, attributeSet, pe0.c);
                                    float f10 = mbcVar3.c;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "rotation") != null) {
                                        f10 = d4.getFloat(5, f10);
                                    }
                                    mbcVar3.c = f10;
                                    mbcVar3.d = d4.getFloat(1, mbcVar3.d);
                                    mbcVar3.e = d4.getFloat(2, mbcVar3.e);
                                    float f11 = mbcVar3.f;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                        f11 = d4.getFloat(3, f11);
                                    }
                                    mbcVar3.f = f11;
                                    float f12 = mbcVar3.g;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                        f12 = d4.getFloat(4, f12);
                                    }
                                    mbcVar3.g = f12;
                                    float f13 = mbcVar3.h;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                        f13 = d4.getFloat(6, f13);
                                    }
                                    mbcVar3.h = f13;
                                    float f14 = mbcVar3.i;
                                    if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                        f14 = d4.getFloat(7, f14);
                                    }
                                    mbcVar3.i = f14;
                                    String string6 = d4.getString(0);
                                    if (string6 != null) {
                                        mbcVar3.k = string6;
                                    }
                                    mbcVar3.c();
                                    d4.recycle();
                                    mbcVar2.b.add(mbcVar3);
                                    arrayDeque.push(mbcVar3);
                                    if (mbcVar3.getGroupName() != null) {
                                        qtVar.put(mbcVar3.getGroupName(), mbcVar3);
                                    }
                                    qbcVar3.a = qbcVar3.a;
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
                            this.d = d(qbcVar.c, qbcVar.d);
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
            qbc qbcVar = this.c;
            if (qbcVar != null) {
                pbc pbcVar = qbcVar.b;
                Boolean bool = pbcVar.n;
                if (bool == null) {
                    bool = Boolean.valueOf(pbcVar.g.a());
                    pbcVar.n = bool;
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
            qbc qbcVar = this.c;
            ?? constantState = new Drawable.ConstantState();
            constantState.c = null;
            constantState.d = w;
            if (qbcVar != null) {
                constantState.a = qbcVar.a;
                pbc pbcVar = new pbc(qbcVar.b);
                constantState.b = pbcVar;
                if (qbcVar.b.e != null) {
                    pbcVar.e = new Paint(qbcVar.b.e);
                }
                if (qbcVar.b.d != null) {
                    constantState.b.d = new Paint(qbcVar.b.d);
                }
                constantState.c = qbcVar.c;
                constantState.d = qbcVar.d;
                constantState.e = qbcVar.e;
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
        qbc qbcVar = this.c;
        ColorStateList colorStateList = qbcVar.c;
        if (colorStateList != null && (mode = qbcVar.d) != null) {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z = true;
        } else {
            z = false;
        }
        pbc pbcVar = qbcVar.b;
        Boolean bool = pbcVar.n;
        if (bool == null) {
            bool = Boolean.valueOf(pbcVar.g.a());
            pbcVar.n = bool;
        }
        if (bool.booleanValue()) {
            boolean b = qbcVar.b.g.b(iArr);
            qbcVar.k |= b;
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
        qbc qbcVar = this.c;
        if (qbcVar.c != colorStateList) {
            qbcVar.c = colorStateList;
            this.d = d(colorStateList, qbcVar.d);
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
        qbc qbcVar = this.c;
        if (qbcVar.d != mode) {
            qbcVar.d = mode;
            this.d = d(qbcVar.c, mode);
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

    public sbc(qbc qbcVar) {
        this.h = true;
        this.n = new float[9];
        this.r = new Matrix();
        this.s = new Rect();
        this.c = qbcVar;
        this.d = d(qbcVar.c, qbcVar.d);
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

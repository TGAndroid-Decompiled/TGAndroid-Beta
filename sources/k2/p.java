package k2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import j7.i8;
import j7.z7;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
public final class p extends g {
    public static final PorterDuff.Mode f10402s = PorterDuff.Mode.SRC_IN;
    public n f10403b;
    public PorterDuffColorFilter f10404c;
    public ColorFilter d;
    public boolean f10405e;
    public boolean f10406f;
    public final float[] h;
    public final Matrix f10407n;
    public final Rect f10408r;

    public p() {
        this.f10406f = true;
        this.h = new float[9];
        this.f10407n = new Matrix();
        this.f10408r = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f10393c = null;
        constantState.d = f10402s;
        constantState.f10392b = new m();
        this.f10403b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f10408r;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.d;
            if (colorFilter == null) {
                colorFilter = this.f10404c;
            }
            Matrix matrix = this.f10407n;
            canvas.getMatrix(matrix);
            float[] fArr = this.h;
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
                if (isAutoMirrored() && i8.a(this) == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                n nVar = this.f10403b;
                Bitmap bitmap = nVar.f10395f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f10395f.getHeight()) {
                    nVar.f10395f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    nVar.f10399k = true;
                }
                if (!this.f10406f) {
                    n nVar2 = this.f10403b;
                    nVar2.f10395f.eraseColor(0);
                    Canvas canvas2 = new Canvas(nVar2.f10395f);
                    m mVar = nVar2.f10392b;
                    mVar.a(mVar.f10383g, m.f10377p, canvas2, min, min2);
                } else {
                    n nVar3 = this.f10403b;
                    if (nVar3.f10399k || nVar3.f10396g != nVar3.f10393c || nVar3.h != nVar3.d || nVar3.f10398j != nVar3.f10394e || nVar3.f10397i != nVar3.f10392b.getRootAlpha()) {
                        n nVar4 = this.f10403b;
                        nVar4.f10395f.eraseColor(0);
                        Canvas canvas3 = new Canvas(nVar4.f10395f);
                        m mVar2 = nVar4.f10392b;
                        mVar2.a(mVar2.f10383g, m.f10377p, canvas3, min, min2);
                        n nVar5 = this.f10403b;
                        nVar5.f10396g = nVar5.f10393c;
                        nVar5.h = nVar5.d;
                        nVar5.f10397i = nVar5.f10392b.getRootAlpha();
                        nVar5.f10398j = nVar5.f10394e;
                        nVar5.f10399k = false;
                    }
                }
                n nVar6 = this.f10403b;
                if (nVar6.f10392b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (nVar6.f10400l == null) {
                        Paint paint2 = new Paint();
                        nVar6.f10400l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    nVar6.f10400l.setAlpha(nVar6.f10392b.getRootAlpha());
                    nVar6.f10400l.setColorFilter(colorFilter);
                    paint = nVar6.f10400l;
                }
                canvas.drawBitmap(nVar6.f10395f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f10403b.f10392b.getRootAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f10403b.getChangingConfigurations();
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.d;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f10355a != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.f10355a.getConstantState());
        }
        this.f10403b.f10391a = getChangingConfigurations();
        return this.f10403b;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f10403b.f10392b.f10384i;
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f10403b.f10392b.h;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public final void invalidateSelf() {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f10403b.f10394e;
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f10403b;
            if (nVar != null) {
                m mVar = nVar.f10392b;
                if (mVar.f10389n == null) {
                    mVar.f10389n = Boolean.valueOf(mVar.f10383g.a());
                }
                if (!mVar.f10389n.booleanValue()) {
                    ColorStateList colorStateList = this.f10403b.f10393c;
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
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f10405e && super.mutate() == this) {
            n nVar = this.f10403b;
            ?? constantState = new Drawable.ConstantState();
            constantState.f10393c = null;
            constantState.d = f10402s;
            if (nVar != null) {
                constantState.f10391a = nVar.f10391a;
                m mVar = new m(nVar.f10392b);
                constantState.f10392b = mVar;
                if (nVar.f10392b.f10381e != null) {
                    mVar.f10381e = new Paint(nVar.f10392b.f10381e);
                }
                if (nVar.f10392b.d != null) {
                    constantState.f10392b.d = new Paint(nVar.f10392b.d);
                }
                constantState.f10393c = nVar.f10393c;
                constantState.d = nVar.d;
                constantState.f10394e = nVar.f10394e;
            }
            this.f10403b = constantState;
            this.f10405e = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        boolean z4;
        PorterDuff.Mode mode;
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f10403b;
        ColorStateList colorStateList = nVar.f10393c;
        if (colorStateList != null && (mode = nVar.d) != null) {
            this.f10404c = a(colorStateList, mode);
            invalidateSelf();
            z4 = true;
        } else {
            z4 = false;
        }
        m mVar = nVar.f10392b;
        if (mVar.f10389n == null) {
            mVar.f10389n = Boolean.valueOf(mVar.f10383g.a());
        }
        if (mVar.f10389n.booleanValue()) {
            boolean b10 = nVar.f10392b.f10383g.b(iArr);
            nVar.f10399k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z4;
    }

    @Override
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f10403b.f10392b.getRootAlpha() != i10) {
            this.f10403b.f10392b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            drawable.setAutoMirrored(z4);
        } else {
            this.f10403b.f10394e = z4;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.d = colorFilter;
        invalidateSelf();
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            i8.c(i10, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f10403b;
        if (nVar.f10393c != colorStateList) {
            nVar.f10393c = colorStateList;
            this.f10404c = a(colorStateList, nVar.d);
            invalidateSelf();
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f10403b;
        if (nVar.d != mode) {
            nVar.d = mode;
            this.f10404c = a(nVar.f10393c, mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z4, boolean z10) {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            return drawable.setVisible(z4, z10);
        }
        return super.setVisible(z4, z10);
    }

    @Override
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f10355a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f10403b;
        nVar.f10392b = new m();
        TypedArray f10 = h0.b.f(resources, theme, attributeSet, a.f10338a);
        n nVar2 = this.f10403b;
        m mVar = nVar2.f10392b;
        int i11 = !h0.b.c(xmlPullParser, "tintMode") ? -1 : f10.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i11 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i11 != 5) {
            if (i11 != 9) {
                switch (i11) {
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
        nVar2.d = mode;
        ColorStateList colorStateList = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f10.getValue(1, typedValue);
            int i12 = typedValue.type;
            if (i12 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i12 >= 28 && i12 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f10.getResources();
                int resourceId = f10.getResourceId(1, 0);
                ThreadLocal threadLocal = h0.c.f7153a;
                try {
                    colorStateList = h0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e6) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e6);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f10393c = colorStateList2;
        }
        boolean z4 = nVar2.f10394e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z4 = f10.getBoolean(5, z4);
        }
        nVar2.f10394e = z4;
        float f11 = mVar.f10385j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f11 = f10.getFloat(7, f11);
        }
        mVar.f10385j = f11;
        float f12 = mVar.f10386k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f12 = f10.getFloat(8, f12);
        }
        mVar.f10386k = f12;
        if (mVar.f10385j <= 0.0f) {
            throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f12 > 0.0f) {
            mVar.h = f10.getDimension(3, mVar.h);
            float dimension = f10.getDimension(2, mVar.f10384i);
            mVar.f10384i = dimension;
            if (mVar.h <= 0.0f) {
                throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = mVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f10.getFloat(4, alpha);
                }
                mVar.setAlpha(alpha);
                String string = f10.getString(0);
                if (string != null) {
                    mVar.f10388m = string;
                    mVar.f10390o.put(string, mVar);
                }
                f10.recycle();
                nVar.f10391a = getChangingConfigurations();
                nVar.f10399k = true;
                n nVar3 = this.f10403b;
                m mVar2 = nVar3.f10392b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.f10383g;
                a0.f fVar = mVar2.f10390o;
                arrayDeque.push(jVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z10 = true;
                for (int i13 = 1; eventType != i13 && (xmlPullParser.getDepth() >= depth || eventType != 3); i13 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar2 = (j) arrayDeque.peek();
                        i10 = depth;
                        if ("path".equals(name)) {
                            ?? lVar = new l();
                            lVar.f10356e = 0.0f;
                            lVar.f10358g = 1.0f;
                            lVar.h = 1.0f;
                            lVar.f10359i = 0.0f;
                            lVar.f10360j = 1.0f;
                            lVar.f10361k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            lVar.f10362l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            lVar.f10363m = join2;
                            lVar.f10364n = 4.0f;
                            TypedArray f13 = h0.b.f(resources, theme, attributeSet, a.f10340c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f13.getString(0);
                                if (string2 != null) {
                                    lVar.f10375b = string2;
                                }
                                String string3 = f13.getString(2);
                                if (string3 != null) {
                                    lVar.f10374a = z7.c(string3);
                                }
                                lVar.f10357f = h0.b.a(f13, xmlPullParser, theme, "fillColor", 1);
                                float f14 = lVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f14 = f13.getFloat(12, f14);
                                }
                                lVar.h = f14;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f13.getInt(8, -1) : -1;
                                Paint.Cap cap3 = lVar.f10362l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                lVar.f10362l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f13.getInt(9, -1) : -1;
                                Paint.Join join3 = lVar.f10363m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                lVar.f10363m = join;
                                float f15 = lVar.f10364n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f15 = f13.getFloat(10, f15);
                                }
                                lVar.f10364n = f15;
                                lVar.d = h0.b.a(f13, xmlPullParser, theme, "strokeColor", 3);
                                float f16 = lVar.f10358g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f16 = f13.getFloat(11, f16);
                                }
                                lVar.f10358g = f16;
                                float f17 = lVar.f10356e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f17 = f13.getFloat(4, f17);
                                }
                                lVar.f10356e = f17;
                                float f18 = lVar.f10360j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f18 = f13.getFloat(6, f18);
                                }
                                lVar.f10360j = f18;
                                float f19 = lVar.f10361k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f19 = f13.getFloat(7, f19);
                                }
                                lVar.f10361k = f19;
                                float f20 = lVar.f10359i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f20 = f13.getFloat(5, f20);
                                }
                                lVar.f10359i = f20;
                                int i16 = lVar.f10376c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = f13.getInt(13, i16);
                                }
                                lVar.f10376c = i16;
                            }
                            f13.recycle();
                            jVar2.f10366b.add(lVar);
                            if (lVar.getPathName() != null) {
                                fVar.put(lVar.getPathName(), lVar);
                            }
                            nVar3.f10391a = nVar3.f10391a;
                            z10 = false;
                        } else if ("clip-path".equals(name)) {
                            l lVar2 = new l();
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                TypedArray f21 = h0.b.f(resources, theme, attributeSet, a.d);
                                String string4 = f21.getString(0);
                                if (string4 != null) {
                                    lVar2.f10375b = string4;
                                }
                                String string5 = f21.getString(1);
                                if (string5 != null) {
                                    lVar2.f10374a = z7.c(string5);
                                }
                                lVar2.f10376c = !h0.b.c(xmlPullParser, "fillType") ? 0 : f21.getInt(2, 0);
                                f21.recycle();
                            }
                            jVar2.f10366b.add(lVar2);
                            if (lVar2.getPathName() != null) {
                                fVar.put(lVar2.getPathName(), lVar2);
                            }
                            nVar3.f10391a = nVar3.f10391a;
                        } else if ("group".equals(name)) {
                            j jVar3 = new j();
                            TypedArray f22 = h0.b.f(resources, theme, attributeSet, a.f10339b);
                            float f23 = jVar3.f10367c;
                            if (h0.b.c(xmlPullParser, "rotation")) {
                                f23 = f22.getFloat(5, f23);
                            }
                            jVar3.f10367c = f23;
                            jVar3.d = f22.getFloat(1, jVar3.d);
                            jVar3.f10368e = f22.getFloat(2, jVar3.f10368e);
                            float f24 = jVar3.f10369f;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                f24 = f22.getFloat(3, f24);
                            }
                            jVar3.f10369f = f24;
                            float f25 = jVar3.f10370g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                f25 = f22.getFloat(4, f25);
                            }
                            jVar3.f10370g = f25;
                            float f26 = jVar3.h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                f26 = f22.getFloat(6, f26);
                            }
                            jVar3.h = f26;
                            float f27 = jVar3.f10371i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                f27 = f22.getFloat(7, f27);
                            }
                            jVar3.f10371i = f27;
                            String string6 = f22.getString(0);
                            if (string6 != null) {
                                jVar3.f10373k = string6;
                            }
                            jVar3.c();
                            f22.recycle();
                            jVar2.f10366b.add(jVar3);
                            arrayDeque.push(jVar3);
                            if (jVar3.getGroupName() != null) {
                                fVar.put(jVar3.getGroupName(), jVar3);
                            }
                            nVar3.f10391a = nVar3.f10391a;
                        }
                    } else {
                        i10 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i10;
                }
                if (!z10) {
                    this.f10404c = a(nVar.f10393c, nVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            } else {
                throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public p(n nVar) {
        this.f10406f = true;
        this.h = new float[9];
        this.f10407n = new Matrix();
        this.f10408r = new Rect();
        this.f10403b = nVar;
        this.f10404c = a(nVar.f10393c, nVar.d);
    }
}

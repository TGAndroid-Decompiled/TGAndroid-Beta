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
import g7.k8;
import g7.w7;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class p extends g {

    public static final PorterDuff.Mode f14401s = PorterDuff.Mode.SRC_IN;

    public n f14402b;

    public PorterDuffColorFilter f14403c;
    public ColorFilter d;

    public boolean f14404e;

    public boolean f14405f;
    public final float[] h;

    public final Matrix f14406n;

    public final Rect f14407r;

    public p() {
        this.f14405f = true;
        this.h = new float[9];
        this.f14406n = new Matrix();
        this.f14407r = new Rect();
        n nVar = new n();
        nVar.f14392c = null;
        nVar.d = f14401s;
        nVar.f14391b = new m();
        this.f14402b = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = this.f14354a;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f14407r;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.d;
        if (colorFilter == null) {
            colorFilter = this.f14403c;
        }
        Matrix matrix = this.f14406n;
        canvas.getMatrix(matrix);
        float[] fArr = this.h;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && k8.a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.f14402b;
        Bitmap bitmap = nVar.f14394f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != nVar.f14394f.getHeight()) {
            nVar.f14394f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            nVar.f14398k = true;
        }
        if (this.f14405f) {
            n nVar2 = this.f14402b;
            if (nVar2.f14398k || nVar2.f14395g != nVar2.f14392c || nVar2.h != nVar2.d || nVar2.f14397j != nVar2.f14393e || nVar2.f14396i != nVar2.f14391b.getRootAlpha()) {
                n nVar3 = this.f14402b;
                nVar3.f14394f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f14394f);
                m mVar = nVar3.f14391b;
                mVar.a(mVar.f14382g, m.f14376p, canvas2, iMin, iMin2);
                n nVar4 = this.f14402b;
                nVar4.f14395g = nVar4.f14392c;
                nVar4.h = nVar4.d;
                nVar4.f14396i = nVar4.f14391b.getRootAlpha();
                nVar4.f14397j = nVar4.f14393e;
                nVar4.f14398k = false;
            }
        } else {
            n nVar5 = this.f14402b;
            nVar5.f14394f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f14394f);
            m mVar2 = nVar5.f14391b;
            mVar2.a(mVar2.f14382g, m.f14376p, canvas3, iMin, iMin2);
        }
        n nVar6 = this.f14402b;
        if (nVar6.f14391b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f14399l == null) {
                Paint paint2 = new Paint();
                nVar6.f14399l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f14399l.setAlpha(nVar6.f14391b.getRootAlpha());
            nVar6.f14399l.setColorFilter(colorFilter);
            paint = nVar6.f14399l;
        }
        canvas.drawBitmap(nVar6.f14394f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getAlpha() : this.f14402b.f14391b.getRootAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f14402b.getChangingConfigurations();
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getColorFilter() : this.d;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f14354a != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.f14354a.getConstantState());
        }
        this.f14402b.f14390a = getChangingConfigurations();
        return this.f14402b;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f14402b.f14391b.f14383i;
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f14402b.f14391b.h;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public final void invalidateSelf() {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.isAutoMirrored() : this.f14402b.f14393e;
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        n nVar = this.f14402b;
        if (nVar == null) {
            return false;
        }
        m mVar = nVar.f14391b;
        if (mVar.f14388n == null) {
            mVar.f14388n = Boolean.valueOf(mVar.f14382g.a());
        }
        if (mVar.f14388n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f14402b.f14392c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override
    public final Drawable mutate() {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f14404e && super.mutate() == this) {
            n nVar = this.f14402b;
            n nVar2 = new n();
            nVar2.f14392c = null;
            nVar2.d = f14401s;
            if (nVar != null) {
                nVar2.f14390a = nVar.f14390a;
                m mVar = new m(nVar.f14391b);
                nVar2.f14391b = mVar;
                if (nVar.f14391b.f14380e != null) {
                    mVar.f14380e = new Paint(nVar.f14391b.f14380e);
                }
                if (nVar.f14391b.d != null) {
                    nVar2.f14391b.d = new Paint(nVar.f14391b.d);
                }
                nVar2.f14392c = nVar.f14392c;
                nVar2.d = nVar.d;
                nVar2.f14393e = nVar.f14393e;
            }
            this.f14402b = nVar2;
            this.f14404e = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f14402b;
        ColorStateList colorStateList = nVar.f14392c;
        if (colorStateList == null || (mode = nVar.d) == null) {
            z10 = false;
        } else {
            this.f14403c = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        m mVar = nVar.f14391b;
        if (mVar.f14388n == null) {
            mVar.f14388n = Boolean.valueOf(mVar.f14382g.a());
        }
        if (mVar.f14388n.booleanValue()) {
            boolean zB = nVar.f14391b.f14382g.b(iArr);
            nVar.f14398k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f14402b.f14391b.getRootAlpha() != i10) {
            this.f14402b.f14391b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f14402b.f14393e = z10;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.d = colorFilter;
            invalidateSelf();
        }
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            k8.c(i10, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f14402b;
        if (nVar.f14392c != colorStateList) {
            nVar.f14392c = colorStateList;
            this.f14403c = a(colorStateList, nVar.d);
            invalidateSelf();
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f14402b;
        if (nVar.d != mode) {
            nVar.d = mode;
            this.f14403c = a(nVar.f14392c, mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f14354a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f14354a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f14402b;
        nVar.f14391b = new m();
        TypedArray typedArrayF = h0.b.f(resources, theme, attributeSet, a.f14337a);
        n nVar2 = this.f14402b;
        m mVar = nVar2.f14391b;
        int i11 = !h0.b.c(xmlPullParser, "tintMode") ? -1 : typedArrayF.getInt(6, -1);
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
        ColorStateList colorStateListA = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayF.getValue(1, typedValue);
            int i12 = typedValue.type;
            if (i12 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i12 >= 28 && i12 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayF.getResources();
                int resourceId = typedArrayF.getResourceId(1, 0);
                ThreadLocal threadLocal = h0.c.f7712a;
                try {
                    colorStateListA = h0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e9) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e9);
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            nVar2.f14392c = colorStateList;
        }
        boolean z10 = nVar2.f14393e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = typedArrayF.getBoolean(5, z10);
        }
        nVar2.f14393e = z10;
        float f10 = mVar.f14384j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f10 = typedArrayF.getFloat(7, f10);
        }
        mVar.f14384j = f10;
        float f11 = mVar.f14385k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = typedArrayF.getFloat(8, f11);
        }
        mVar.f14385k = f11;
        if (mVar.f14384j <= 0.0f) {
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            mVar.h = typedArrayF.getDimension(3, mVar.h);
            float dimension = typedArrayF.getDimension(2, mVar.f14383i);
            mVar.f14383i = dimension;
            if (mVar.h <= 0.0f) {
                throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayF.getFloat(4, alpha);
                }
                mVar.setAlpha(alpha);
                String string = typedArrayF.getString(0);
                if (string != null) {
                    mVar.f14387m = string;
                    mVar.f14389o.put(string, mVar);
                }
                typedArrayF.recycle();
                nVar.f14390a = getChangingConfigurations();
                nVar.f14398k = true;
                n nVar3 = this.f14402b;
                m mVar2 = nVar3.f14391b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.f14382g;
                a0.f fVar = mVar2.f14389o;
                arrayDeque.push(jVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                for (int i13 = 1; eventType != i13 && (xmlPullParser.getDepth() >= depth || eventType != 3); i13 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar2 = (j) arrayDeque.peek();
                        i10 = depth;
                        if ("path".equals(name)) {
                            i iVar = new i();
                            iVar.f14355e = 0.0f;
                            iVar.f14357g = 1.0f;
                            iVar.h = 1.0f;
                            iVar.f14358i = 0.0f;
                            iVar.f14359j = 1.0f;
                            iVar.f14360k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.f14361l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            iVar.f14362m = join2;
                            iVar.f14363n = 4.0f;
                            TypedArray typedArrayF2 = h0.b.f(resources, theme, attributeSet, a.f14339c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayF2.getString(0);
                                if (string2 != null) {
                                    iVar.f14374b = string2;
                                }
                                String string3 = typedArrayF2.getString(2);
                                if (string3 != null) {
                                    iVar.f14373a = w7.c(string3);
                                }
                                iVar.f14356f = h0.b.a(typedArrayF2, xmlPullParser, theme, "fillColor", 1);
                                float f12 = iVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f12 = typedArrayF2.getFloat(12, f12);
                                }
                                iVar.h = f12;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayF2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = iVar.f14361l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                iVar.f14361l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayF2.getInt(9, -1) : -1;
                                Paint.Join join3 = iVar.f14362m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                iVar.f14362m = join;
                                float f13 = iVar.f14363n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f13 = typedArrayF2.getFloat(10, f13);
                                }
                                iVar.f14363n = f13;
                                iVar.d = h0.b.a(typedArrayF2, xmlPullParser, theme, "strokeColor", 3);
                                float f14 = iVar.f14357g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f14 = typedArrayF2.getFloat(11, f14);
                                }
                                iVar.f14357g = f14;
                                float f15 = iVar.f14355e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f15 = typedArrayF2.getFloat(4, f15);
                                }
                                iVar.f14355e = f15;
                                float f16 = iVar.f14359j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f16 = typedArrayF2.getFloat(6, f16);
                                }
                                iVar.f14359j = f16;
                                float f17 = iVar.f14360k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f17 = typedArrayF2.getFloat(7, f17);
                                }
                                iVar.f14360k = f17;
                                float f18 = iVar.f14358i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f18 = typedArrayF2.getFloat(5, f18);
                                }
                                iVar.f14358i = f18;
                                int i16 = iVar.f14375c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = typedArrayF2.getInt(13, i16);
                                }
                                iVar.f14375c = i16;
                            }
                            typedArrayF2.recycle();
                            jVar2.f14365b.add(iVar);
                            if (iVar.getPathName() != null) {
                                fVar.put(iVar.getPathName(), iVar);
                            }
                            nVar3.f14390a = nVar3.f14390a;
                            z11 = false;
                        } else if ("clip-path".equals(name)) {
                            h hVar = new h();
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                TypedArray typedArrayF3 = h0.b.f(resources, theme, attributeSet, a.d);
                                String string4 = typedArrayF3.getString(0);
                                if (string4 != null) {
                                    hVar.f14374b = string4;
                                }
                                String string5 = typedArrayF3.getString(1);
                                if (string5 != null) {
                                    hVar.f14373a = w7.c(string5);
                                }
                                hVar.f14375c = !h0.b.c(xmlPullParser, "fillType") ? 0 : typedArrayF3.getInt(2, 0);
                                typedArrayF3.recycle();
                            }
                            jVar2.f14365b.add(hVar);
                            if (hVar.getPathName() != null) {
                                fVar.put(hVar.getPathName(), hVar);
                            }
                            nVar3.f14390a = nVar3.f14390a;
                        } else if ("group".equals(name)) {
                            j jVar3 = new j();
                            TypedArray typedArrayF4 = h0.b.f(resources, theme, attributeSet, a.f14338b);
                            float f19 = jVar3.f14366c;
                            if (h0.b.c(xmlPullParser, "rotation")) {
                                f19 = typedArrayF4.getFloat(5, f19);
                            }
                            jVar3.f14366c = f19;
                            jVar3.d = typedArrayF4.getFloat(1, jVar3.d);
                            jVar3.f14367e = typedArrayF4.getFloat(2, jVar3.f14367e);
                            float f20 = jVar3.f14368f;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                f20 = typedArrayF4.getFloat(3, f20);
                            }
                            jVar3.f14368f = f20;
                            float f21 = jVar3.f14369g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                f21 = typedArrayF4.getFloat(4, f21);
                            }
                            jVar3.f14369g = f21;
                            float f22 = jVar3.h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                f22 = typedArrayF4.getFloat(6, f22);
                            }
                            jVar3.h = f22;
                            float f23 = jVar3.f14370i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                f23 = typedArrayF4.getFloat(7, f23);
                            }
                            jVar3.f14370i = f23;
                            String string6 = typedArrayF4.getString(0);
                            if (string6 != null) {
                                jVar3.f14372k = string6;
                            }
                            jVar3.c();
                            typedArrayF4.recycle();
                            jVar2.f14365b.add(jVar3);
                            arrayDeque.push(jVar3);
                            if (jVar3.getGroupName() != null) {
                                fVar.put(jVar3.getGroupName(), jVar3);
                            }
                            nVar3.f14390a = nVar3.f14390a;
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
                if (!z11) {
                    this.f14403c = a(nVar.f14392c, nVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayF.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f14405f = true;
        this.h = new float[9];
        this.f14406n = new Matrix();
        this.f14407r = new Rect();
        this.f14402b = nVar;
        this.f14403c = a(nVar.f14392c, nVar.d);
    }
}

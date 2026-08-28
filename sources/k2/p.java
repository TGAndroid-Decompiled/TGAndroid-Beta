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
import f7.i8;
import f7.q8;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
public final class p extends g {
    public static final PorterDuff.Mode f14580s = PorterDuff.Mode.SRC_IN;
    public n f14581b;
    public PorterDuffColorFilter f14582c;
    public ColorFilter d;
    public boolean f14583e;
    public boolean f14584f;
    public final float[] h;
    public final Matrix f14585n;
    public final Rect f14586r;

    public p() {
        this.f14584f = true;
        this.h = new float[9];
        this.f14585n = new Matrix();
        this.f14586r = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f14571c = null;
        constantState.d = f14580s;
        constantState.f14570b = new m();
        this.f14581b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f14586r;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.d;
            if (colorFilter == null) {
                colorFilter = this.f14582c;
            }
            Matrix matrix = this.f14585n;
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
                if (isAutoMirrored() && q8.a(this) == 1) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                n nVar = this.f14581b;
                Bitmap bitmap = nVar.f14573f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f14573f.getHeight()) {
                    nVar.f14573f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    nVar.f14577k = true;
                }
                if (!this.f14584f) {
                    n nVar2 = this.f14581b;
                    nVar2.f14573f.eraseColor(0);
                    Canvas canvas2 = new Canvas(nVar2.f14573f);
                    m mVar = nVar2.f14570b;
                    mVar.a(mVar.f14561g, m.f14555p, canvas2, min, min2);
                } else {
                    n nVar3 = this.f14581b;
                    if (nVar3.f14577k || nVar3.f14574g != nVar3.f14571c || nVar3.h != nVar3.d || nVar3.f14576j != nVar3.f14572e || nVar3.f14575i != nVar3.f14570b.getRootAlpha()) {
                        n nVar4 = this.f14581b;
                        nVar4.f14573f.eraseColor(0);
                        Canvas canvas3 = new Canvas(nVar4.f14573f);
                        m mVar2 = nVar4.f14570b;
                        mVar2.a(mVar2.f14561g, m.f14555p, canvas3, min, min2);
                        n nVar5 = this.f14581b;
                        nVar5.f14574g = nVar5.f14571c;
                        nVar5.h = nVar5.d;
                        nVar5.f14575i = nVar5.f14570b.getRootAlpha();
                        nVar5.f14576j = nVar5.f14572e;
                        nVar5.f14577k = false;
                    }
                }
                n nVar6 = this.f14581b;
                if (nVar6.f14570b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (nVar6.f14578l == null) {
                        Paint paint2 = new Paint();
                        nVar6.f14578l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    nVar6.f14578l.setAlpha(nVar6.f14570b.getRootAlpha());
                    nVar6.f14578l.setColorFilter(colorFilter);
                    paint = nVar6.f14578l;
                }
                canvas.drawBitmap(nVar6.f14573f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f14581b.f14570b.getRootAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f14581b.getChangingConfigurations();
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.d;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f14533a != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.f14533a.getConstantState());
        }
        this.f14581b.f14569a = getChangingConfigurations();
        return this.f14581b;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f14581b.f14570b.f14562i;
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f14581b.f14570b.h;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public final void invalidateSelf() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f14581b.f14572e;
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f14581b;
            if (nVar != null) {
                m mVar = nVar.f14570b;
                if (mVar.f14567n == null) {
                    mVar.f14567n = Boolean.valueOf(mVar.f14561g.a());
                }
                if (!mVar.f14567n.booleanValue()) {
                    ColorStateList colorStateList = this.f14581b.f14571c;
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
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f14583e && super.mutate() == this) {
            n nVar = this.f14581b;
            ?? constantState = new Drawable.ConstantState();
            constantState.f14571c = null;
            constantState.d = f14580s;
            if (nVar != null) {
                constantState.f14569a = nVar.f14569a;
                m mVar = new m(nVar.f14570b);
                constantState.f14570b = mVar;
                if (nVar.f14570b.f14559e != null) {
                    mVar.f14559e = new Paint(nVar.f14570b.f14559e);
                }
                if (nVar.f14570b.d != null) {
                    constantState.f14570b.d = new Paint(nVar.f14570b.d);
                }
                constantState.f14571c = nVar.f14571c;
                constantState.d = nVar.d;
                constantState.f14572e = nVar.f14572e;
            }
            this.f14581b = constantState;
            this.f14583e = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f14581b;
        ColorStateList colorStateList = nVar.f14571c;
        if (colorStateList != null && (mode = nVar.d) != null) {
            this.f14582c = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        m mVar = nVar.f14570b;
        if (mVar.f14567n == null) {
            mVar.f14567n = Boolean.valueOf(mVar.f14561g.a());
        }
        if (mVar.f14567n.booleanValue()) {
            boolean b10 = nVar.f14570b.f14561g.b(iArr);
            nVar.f14577k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i9) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setAlpha(i9);
        } else if (this.f14581b.f14570b.getRootAlpha() != i9) {
            this.f14581b.f14570b.setRootAlpha(i9);
            invalidateSelf();
        }
    }

    @Override
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f14581b.f14572e = z10;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.d = colorFilter;
        invalidateSelf();
    }

    @Override
    public final void setTint(int i9) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            q8.c(i9, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i9));
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f14581b;
        if (nVar.f14571c != colorStateList) {
            nVar.f14571c = colorStateList;
            this.f14582c = a(colorStateList, nVar.d);
            invalidateSelf();
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f14581b;
        if (nVar.d != mode) {
            nVar.d = mode;
            this.f14582c = a(nVar.f14571c, mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i9;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f14533a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f14581b;
        nVar.f14570b = new m();
        TypedArray f10 = h0.b.f(resources, theme, attributeSet, a.f14516a);
        n nVar2 = this.f14581b;
        m mVar = nVar2.f14570b;
        int i10 = !h0.b.c(xmlPullParser, "tintMode") ? -1 : f10.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i10 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i10 != 5) {
            if (i10 != 9) {
                switch (i10) {
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
            int i11 = typedValue.type;
            if (i11 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i11 >= 28 && i11 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f10.getResources();
                int resourceId = f10.getResourceId(1, 0);
                ThreadLocal threadLocal = h0.c.f9280a;
                try {
                    colorStateList = h0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e10) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f14571c = colorStateList2;
        }
        boolean z10 = nVar2.f14572e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z10 = f10.getBoolean(5, z10);
        }
        nVar2.f14572e = z10;
        float f11 = mVar.f14563j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f11 = f10.getFloat(7, f11);
        }
        mVar.f14563j = f11;
        float f12 = mVar.f14564k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f12 = f10.getFloat(8, f12);
        }
        mVar.f14564k = f12;
        if (mVar.f14563j <= 0.0f) {
            throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f12 > 0.0f) {
            mVar.h = f10.getDimension(3, mVar.h);
            float dimension = f10.getDimension(2, mVar.f14562i);
            mVar.f14562i = dimension;
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
                    mVar.f14566m = string;
                    mVar.f14568o.put(string, mVar);
                }
                f10.recycle();
                nVar.f14569a = getChangingConfigurations();
                nVar.f14577k = true;
                n nVar3 = this.f14581b;
                m mVar2 = nVar3.f14570b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.f14561g;
                a0.f fVar = mVar2.f14568o;
                arrayDeque.push(jVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z11 = true;
                for (int i12 = 1; eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != 3); i12 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar2 = (j) arrayDeque.peek();
                        i9 = depth;
                        if ("path".equals(name)) {
                            ?? lVar = new l();
                            lVar.f14534e = 0.0f;
                            lVar.f14536g = 1.0f;
                            lVar.h = 1.0f;
                            lVar.f14537i = 0.0f;
                            lVar.f14538j = 1.0f;
                            lVar.f14539k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            lVar.f14540l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            lVar.f14541m = join2;
                            lVar.f14542n = 4.0f;
                            TypedArray f13 = h0.b.f(resources, theme, attributeSet, a.f14518c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f13.getString(0);
                                if (string2 != null) {
                                    lVar.f14553b = string2;
                                }
                                String string3 = f13.getString(2);
                                if (string3 != null) {
                                    lVar.f14552a = i8.c(string3);
                                }
                                lVar.f14535f = h0.b.a(f13, xmlPullParser, theme, "fillColor", 1);
                                float f14 = lVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f14 = f13.getFloat(12, f14);
                                }
                                lVar.h = f14;
                                int i13 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f13.getInt(8, -1) : -1;
                                Paint.Cap cap3 = lVar.f14540l;
                                if (i13 == 0) {
                                    cap = cap2;
                                } else if (i13 != 1) {
                                    cap = i13 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                lVar.f14540l = cap;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f13.getInt(9, -1) : -1;
                                Paint.Join join3 = lVar.f14541m;
                                if (i14 == 0) {
                                    join = join2;
                                } else if (i14 != 1) {
                                    join = i14 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                lVar.f14541m = join;
                                float f15 = lVar.f14542n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f15 = f13.getFloat(10, f15);
                                }
                                lVar.f14542n = f15;
                                lVar.d = h0.b.a(f13, xmlPullParser, theme, "strokeColor", 3);
                                float f16 = lVar.f14536g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f16 = f13.getFloat(11, f16);
                                }
                                lVar.f14536g = f16;
                                float f17 = lVar.f14534e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f17 = f13.getFloat(4, f17);
                                }
                                lVar.f14534e = f17;
                                float f18 = lVar.f14538j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f18 = f13.getFloat(6, f18);
                                }
                                lVar.f14538j = f18;
                                float f19 = lVar.f14539k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f19 = f13.getFloat(7, f19);
                                }
                                lVar.f14539k = f19;
                                float f20 = lVar.f14537i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f20 = f13.getFloat(5, f20);
                                }
                                lVar.f14537i = f20;
                                int i15 = lVar.f14554c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i15 = f13.getInt(13, i15);
                                }
                                lVar.f14554c = i15;
                            }
                            f13.recycle();
                            jVar2.f14544b.add(lVar);
                            if (lVar.getPathName() != null) {
                                fVar.put(lVar.getPathName(), lVar);
                            }
                            nVar3.f14569a = nVar3.f14569a;
                            z11 = false;
                        } else if ("clip-path".equals(name)) {
                            l lVar2 = new l();
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                TypedArray f21 = h0.b.f(resources, theme, attributeSet, a.d);
                                String string4 = f21.getString(0);
                                if (string4 != null) {
                                    lVar2.f14553b = string4;
                                }
                                String string5 = f21.getString(1);
                                if (string5 != null) {
                                    lVar2.f14552a = i8.c(string5);
                                }
                                lVar2.f14554c = !h0.b.c(xmlPullParser, "fillType") ? 0 : f21.getInt(2, 0);
                                f21.recycle();
                            }
                            jVar2.f14544b.add(lVar2);
                            if (lVar2.getPathName() != null) {
                                fVar.put(lVar2.getPathName(), lVar2);
                            }
                            nVar3.f14569a = nVar3.f14569a;
                        } else if ("group".equals(name)) {
                            j jVar3 = new j();
                            TypedArray f22 = h0.b.f(resources, theme, attributeSet, a.f14517b);
                            float f23 = jVar3.f14545c;
                            if (h0.b.c(xmlPullParser, "rotation")) {
                                f23 = f22.getFloat(5, f23);
                            }
                            jVar3.f14545c = f23;
                            jVar3.d = f22.getFloat(1, jVar3.d);
                            jVar3.f14546e = f22.getFloat(2, jVar3.f14546e);
                            float f24 = jVar3.f14547f;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                f24 = f22.getFloat(3, f24);
                            }
                            jVar3.f14547f = f24;
                            float f25 = jVar3.f14548g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                f25 = f22.getFloat(4, f25);
                            }
                            jVar3.f14548g = f25;
                            float f26 = jVar3.h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                f26 = f22.getFloat(6, f26);
                            }
                            jVar3.h = f26;
                            float f27 = jVar3.f14549i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                f27 = f22.getFloat(7, f27);
                            }
                            jVar3.f14549i = f27;
                            String string6 = f22.getString(0);
                            if (string6 != null) {
                                jVar3.f14551k = string6;
                            }
                            jVar3.c();
                            f22.recycle();
                            jVar2.f14544b.add(jVar3);
                            arrayDeque.push(jVar3);
                            if (jVar3.getGroupName() != null) {
                                fVar.put(jVar3.getGroupName(), jVar3);
                            }
                            nVar3.f14569a = nVar3.f14569a;
                        }
                    } else {
                        i9 = depth;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    depth = i9;
                }
                if (!z11) {
                    this.f14582c = a(nVar.f14571c, nVar.d);
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
        this.f14584f = true;
        this.h = new float[9];
        this.f14585n = new Matrix();
        this.f14586r = new Rect();
        this.f14581b = nVar;
        this.f14582c = a(nVar.f14571c, nVar.d);
    }
}

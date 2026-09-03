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
    public static final PorterDuff.Mode f9669s = PorterDuff.Mode.SRC_IN;
    public n f9670b;
    public PorterDuffColorFilter f9671c;
    public ColorFilter d;
    public boolean e;
    public boolean f9672f;
    public final float[] h;
    public final Matrix f9673n;
    public final Rect f9674r;

    public p() {
        this.f9672f = true;
        this.h = new float[9];
        this.f9673n = new Matrix();
        this.f9674r = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f9661c = null;
        constantState.d = f9669s;
        constantState.f9660b = new m();
        this.f9670b = constantState;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            drawable.canApplyTheme();
            return false;
        }
        return false;
    }

    @Override
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f9674r;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.d;
            if (colorFilter == null) {
                colorFilter = this.f9671c;
            }
            Matrix matrix = this.f9673n;
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
                n nVar = this.f9670b;
                Bitmap bitmap = nVar.f9662f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f9662f.getHeight()) {
                    nVar.f9662f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    nVar.f9666k = true;
                }
                if (!this.f9672f) {
                    n nVar2 = this.f9670b;
                    nVar2.f9662f.eraseColor(0);
                    Canvas canvas2 = new Canvas(nVar2.f9662f);
                    m mVar = nVar2.f9660b;
                    mVar.a(mVar.f9651g, m.f9646p, canvas2, min, min2);
                } else {
                    n nVar3 = this.f9670b;
                    if (nVar3.f9666k || nVar3.f9663g != nVar3.f9661c || nVar3.h != nVar3.d || nVar3.f9665j != nVar3.e || nVar3.f9664i != nVar3.f9660b.getRootAlpha()) {
                        n nVar4 = this.f9670b;
                        nVar4.f9662f.eraseColor(0);
                        Canvas canvas3 = new Canvas(nVar4.f9662f);
                        m mVar2 = nVar4.f9660b;
                        mVar2.a(mVar2.f9651g, m.f9646p, canvas3, min, min2);
                        n nVar5 = this.f9670b;
                        nVar5.f9663g = nVar5.f9661c;
                        nVar5.h = nVar5.d;
                        nVar5.f9664i = nVar5.f9660b.getRootAlpha();
                        nVar5.f9665j = nVar5.e;
                        nVar5.f9666k = false;
                    }
                }
                n nVar6 = this.f9670b;
                if (nVar6.f9660b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (nVar6.f9667l == null) {
                        Paint paint2 = new Paint();
                        nVar6.f9667l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    nVar6.f9667l.setAlpha(nVar6.f9660b.getRootAlpha());
                    nVar6.f9667l.setColorFilter(colorFilter);
                    paint = nVar6.f9667l;
                }
                canvas.drawBitmap(nVar6.f9662f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f9670b.f9660b.getRootAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f9670b.getChangingConfigurations();
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.d;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (this.f9626a != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.f9626a.getConstantState());
        }
        this.f9670b.f9659a = getChangingConfigurations();
        return this.f9670b;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f9670b.f9660b.f9652i;
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f9670b.f9660b.h;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public final void invalidateSelf() {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f9670b.e;
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            n nVar = this.f9670b;
            if (nVar != null) {
                m mVar = nVar.f9660b;
                if (mVar.f9657n == null) {
                    mVar.f9657n = Boolean.valueOf(mVar.f9651g.a());
                }
                if (!mVar.f9657n.booleanValue()) {
                    ColorStateList colorStateList = this.f9670b.f9661c;
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
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.e && super.mutate() == this) {
            n nVar = this.f9670b;
            ?? constantState = new Drawable.ConstantState();
            constantState.f9661c = null;
            constantState.d = f9669s;
            if (nVar != null) {
                constantState.f9659a = nVar.f9659a;
                m mVar = new m(nVar.f9660b);
                constantState.f9660b = mVar;
                if (nVar.f9660b.e != null) {
                    mVar.e = new Paint(nVar.f9660b.e);
                }
                if (nVar.f9660b.d != null) {
                    constantState.f9660b.d = new Paint(nVar.f9660b.d);
                }
                constantState.f9661c = nVar.f9661c;
                constantState.d = nVar.d;
                constantState.e = nVar.e;
            }
            this.f9670b = constantState;
            this.e = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        boolean z4;
        PorterDuff.Mode mode;
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f9670b;
        ColorStateList colorStateList = nVar.f9661c;
        if (colorStateList != null && (mode = nVar.d) != null) {
            this.f9671c = a(colorStateList, mode);
            invalidateSelf();
            z4 = true;
        } else {
            z4 = false;
        }
        m mVar = nVar.f9660b;
        if (mVar.f9657n == null) {
            mVar.f9657n = Boolean.valueOf(mVar.f9651g.a());
        }
        if (mVar.f9657n.booleanValue()) {
            boolean b10 = nVar.f9660b.f9651g.b(iArr);
            nVar.f9666k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z4;
    }

    @Override
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override
    public final void setAlpha(int i10) {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f9670b.f9660b.getRootAlpha() != i10) {
            this.f9670b.f9660b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override
    public final void setAutoMirrored(boolean z4) {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            drawable.setAutoMirrored(z4);
        } else {
            this.f9670b.e = z4;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.d = colorFilter;
        invalidateSelf();
    }

    @Override
    public final void setTint(int i10) {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            i8.c(i10, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f9670b;
        if (nVar.f9661c != colorStateList) {
            nVar.f9661c = colorStateList;
            this.f9671c = a(colorStateList, nVar.d);
            invalidateSelf();
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f9670b;
        if (nVar.d != mode) {
            nVar.d = mode;
            this.f9671c = a(nVar.f9661c, mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z4, boolean z10) {
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            return drawable.setVisible(z4, z10);
        }
        return super.setVisible(z4, z10);
    }

    @Override
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f9626a;
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
        Drawable drawable = this.f9626a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f9670b;
        nVar.f9660b = new m();
        TypedArray f10 = h0.b.f(resources, theme, attributeSet, a.f9610a);
        n nVar2 = this.f9670b;
        m mVar = nVar2.f9660b;
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
                ThreadLocal threadLocal = h0.c.f6846a;
                try {
                    colorStateList = h0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f9661c = colorStateList2;
        }
        boolean z4 = nVar2.e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z4 = f10.getBoolean(5, z4);
        }
        nVar2.e = z4;
        float f11 = mVar.f9653j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f11 = f10.getFloat(7, f11);
        }
        mVar.f9653j = f11;
        float f12 = mVar.f9654k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f12 = f10.getFloat(8, f12);
        }
        mVar.f9654k = f12;
        if (mVar.f9653j <= 0.0f) {
            throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f12 > 0.0f) {
            mVar.h = f10.getDimension(3, mVar.h);
            float dimension = f10.getDimension(2, mVar.f9652i);
            mVar.f9652i = dimension;
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
                    mVar.f9656m = string;
                    mVar.f9658o.put(string, mVar);
                }
                f10.recycle();
                nVar.f9659a = getChangingConfigurations();
                nVar.f9666k = true;
                n nVar3 = this.f9670b;
                m mVar2 = nVar3.f9660b;
                ArrayDeque arrayDeque = new ArrayDeque();
                j jVar = mVar2.f9651g;
                a0.f fVar = mVar2.f9658o;
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
                            lVar.e = 0.0f;
                            lVar.f9628g = 1.0f;
                            lVar.h = 1.0f;
                            lVar.f9629i = 0.0f;
                            lVar.f9630j = 1.0f;
                            lVar.f9631k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            lVar.f9632l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            lVar.f9633m = join2;
                            lVar.f9634n = 4.0f;
                            TypedArray f13 = h0.b.f(resources, theme, attributeSet, a.f9612c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f13.getString(0);
                                if (string2 != null) {
                                    lVar.f9644b = string2;
                                }
                                String string3 = f13.getString(2);
                                if (string3 != null) {
                                    lVar.f9643a = z7.c(string3);
                                }
                                lVar.f9627f = h0.b.a(f13, xmlPullParser, theme, "fillColor", 1);
                                float f14 = lVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f14 = f13.getFloat(12, f14);
                                }
                                lVar.h = f14;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f13.getInt(8, -1) : -1;
                                Paint.Cap cap3 = lVar.f9632l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                lVar.f9632l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f13.getInt(9, -1) : -1;
                                Paint.Join join3 = lVar.f9633m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                lVar.f9633m = join;
                                float f15 = lVar.f9634n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f15 = f13.getFloat(10, f15);
                                }
                                lVar.f9634n = f15;
                                lVar.d = h0.b.a(f13, xmlPullParser, theme, "strokeColor", 3);
                                float f16 = lVar.f9628g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f16 = f13.getFloat(11, f16);
                                }
                                lVar.f9628g = f16;
                                float f17 = lVar.e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f17 = f13.getFloat(4, f17);
                                }
                                lVar.e = f17;
                                float f18 = lVar.f9630j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f18 = f13.getFloat(6, f18);
                                }
                                lVar.f9630j = f18;
                                float f19 = lVar.f9631k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f19 = f13.getFloat(7, f19);
                                }
                                lVar.f9631k = f19;
                                float f20 = lVar.f9629i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f20 = f13.getFloat(5, f20);
                                }
                                lVar.f9629i = f20;
                                int i16 = lVar.f9645c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = f13.getInt(13, i16);
                                }
                                lVar.f9645c = i16;
                            }
                            f13.recycle();
                            jVar2.f9636b.add(lVar);
                            if (lVar.getPathName() != null) {
                                fVar.put(lVar.getPathName(), lVar);
                            }
                            nVar3.f9659a = nVar3.f9659a;
                            z10 = false;
                        } else if ("clip-path".equals(name)) {
                            l lVar2 = new l();
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                TypedArray f21 = h0.b.f(resources, theme, attributeSet, a.d);
                                String string4 = f21.getString(0);
                                if (string4 != null) {
                                    lVar2.f9644b = string4;
                                }
                                String string5 = f21.getString(1);
                                if (string5 != null) {
                                    lVar2.f9643a = z7.c(string5);
                                }
                                lVar2.f9645c = !h0.b.c(xmlPullParser, "fillType") ? 0 : f21.getInt(2, 0);
                                f21.recycle();
                            }
                            jVar2.f9636b.add(lVar2);
                            if (lVar2.getPathName() != null) {
                                fVar.put(lVar2.getPathName(), lVar2);
                            }
                            nVar3.f9659a = nVar3.f9659a;
                        } else if ("group".equals(name)) {
                            j jVar3 = new j();
                            TypedArray f22 = h0.b.f(resources, theme, attributeSet, a.f9611b);
                            float f23 = jVar3.f9637c;
                            if (h0.b.c(xmlPullParser, "rotation")) {
                                f23 = f22.getFloat(5, f23);
                            }
                            jVar3.f9637c = f23;
                            jVar3.d = f22.getFloat(1, jVar3.d);
                            jVar3.e = f22.getFloat(2, jVar3.e);
                            float f24 = jVar3.f9638f;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                f24 = f22.getFloat(3, f24);
                            }
                            jVar3.f9638f = f24;
                            float f25 = jVar3.f9639g;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                f25 = f22.getFloat(4, f25);
                            }
                            jVar3.f9639g = f25;
                            float f26 = jVar3.h;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                f26 = f22.getFloat(6, f26);
                            }
                            jVar3.h = f26;
                            float f27 = jVar3.f9640i;
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                f27 = f22.getFloat(7, f27);
                            }
                            jVar3.f9640i = f27;
                            String string6 = f22.getString(0);
                            if (string6 != null) {
                                jVar3.f9642k = string6;
                            }
                            jVar3.c();
                            f22.recycle();
                            jVar2.f9636b.add(jVar3);
                            arrayDeque.push(jVar3);
                            if (jVar3.getGroupName() != null) {
                                fVar.put(jVar3.getGroupName(), jVar3);
                            }
                            nVar3.f9659a = nVar3.f9659a;
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
                    this.f9671c = a(nVar.f9661c, nVar.d);
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
        this.f9672f = true;
        this.h = new float[9];
        this.f9673n = new Matrix();
        this.f9674r = new Rect();
        this.f9670b = nVar;
        this.f9671c = a(nVar.f9661c, nVar.d);
    }
}

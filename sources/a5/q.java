package a5;

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
import c8.i0;
import c8.o0;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
public final class q extends h {
    public static final PorterDuff.Mode f267w = PorterDuff.Mode.SRC_IN;
    public o f268c;
    public PorterDuffColorFilter d;
    public ColorFilter f269e;
    public boolean f270f;
    public boolean h;
    public final float[] f271n;
    public final Matrix f272r;
    public final Rect f273s;

    public q() {
        this.h = true;
        this.f271n = new float[9];
        this.f272r = new Matrix();
        this.f273s = new Rect();
        ?? constantState = new Drawable.ConstantState();
        constantState.f258c = null;
        constantState.d = f267w;
        constantState.f257b = new n();
        this.f268c = constantState;
    }

    public static q c(Resources resources, int i7, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            q qVar = new q();
            ThreadLocal threadLocal = h0.j.f14027a;
            qVar.f220b = resources.getDrawable(i7, theme);
            new p(((Drawable) qVar.f220b).getConstantState());
            return qVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i7);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                q qVar2 = new q();
                qVar2.inflate(resources, xml, asAttributeSet, theme);
                return qVar2;
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e10) {
            Log.e("VectorDrawableCompat", "parser error", e10);
            return null;
        } catch (XmlPullParserException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
            return null;
        }
    }

    @Override
    public final boolean canApplyTheme() {
        Drawable drawable = (Drawable) this.f220b;
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
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f273s;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f269e;
            if (colorFilter == null) {
                colorFilter = this.d;
            }
            Matrix matrix = this.f272r;
            canvas.getMatrix(matrix);
            float[] fArr = this.f271n;
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
                o oVar = this.f268c;
                Bitmap bitmap = oVar.f260f;
                if (bitmap == null || min != bitmap.getWidth() || min2 != oVar.f260f.getHeight()) {
                    oVar.f260f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                    oVar.f264k = true;
                }
                if (!this.h) {
                    o oVar2 = this.f268c;
                    oVar2.f260f.eraseColor(0);
                    Canvas canvas2 = new Canvas(oVar2.f260f);
                    n nVar = oVar2.f257b;
                    nVar.a(nVar.f248g, n.f242p, canvas2, min, min2);
                } else {
                    o oVar3 = this.f268c;
                    if (oVar3.f264k || oVar3.f261g != oVar3.f258c || oVar3.h != oVar3.d || oVar3.f263j != oVar3.f259e || oVar3.f262i != oVar3.f257b.getRootAlpha()) {
                        o oVar4 = this.f268c;
                        oVar4.f260f.eraseColor(0);
                        Canvas canvas3 = new Canvas(oVar4.f260f);
                        n nVar2 = oVar4.f257b;
                        nVar2.a(nVar2.f248g, n.f242p, canvas3, min, min2);
                        o oVar5 = this.f268c;
                        oVar5.f261g = oVar5.f258c;
                        oVar5.h = oVar5.d;
                        oVar5.f262i = oVar5.f257b.getRootAlpha();
                        oVar5.f263j = oVar5.f259e;
                        oVar5.f264k = false;
                    }
                }
                o oVar6 = this.f268c;
                if (oVar6.f257b.getRootAlpha() >= 255 && colorFilter == null) {
                    paint = null;
                } else {
                    if (oVar6.f265l == null) {
                        Paint paint2 = new Paint();
                        oVar6.f265l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    oVar6.f265l.setAlpha(oVar6.f257b.getRootAlpha());
                    oVar6.f265l.setColorFilter(colorFilter);
                    paint = oVar6.f265l;
                }
                canvas.drawBitmap(oVar6.f260f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override
    public final int getAlpha() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f268c.f257b.getRootAlpha();
    }

    @Override
    public final int getChangingConfigurations() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f268c.getChangingConfigurations();
    }

    @Override
    public final ColorFilter getColorFilter() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.f269e;
    }

    @Override
    public final Drawable.ConstantState getConstantState() {
        if (((Drawable) this.f220b) != null && Build.VERSION.SDK_INT >= 24) {
            return new p(((Drawable) this.f220b).getConstantState());
        }
        this.f268c.f256a = getChangingConfigurations();
        return this.f268c;
    }

    @Override
    public final int getIntrinsicHeight() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f268c.f257b.f249i;
    }

    @Override
    public final int getIntrinsicWidth() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f268c.f257b.h;
    }

    @Override
    public final int getOpacity() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override
    public final void invalidateSelf() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override
    public final boolean isAutoMirrored() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f268c.f259e;
    }

    @Override
    public final boolean isStateful() {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            o oVar = this.f268c;
            if (oVar != null) {
                n nVar = oVar.f257b;
                if (nVar.f254n == null) {
                    nVar.f254n = Boolean.valueOf(nVar.f248g.a());
                }
                if (!nVar.f254n.booleanValue()) {
                    ColorStateList colorStateList = this.f268c.f258c;
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
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f270f && super.mutate() == this) {
            o oVar = this.f268c;
            ?? constantState = new Drawable.ConstantState();
            constantState.f258c = null;
            constantState.d = f267w;
            if (oVar != null) {
                constantState.f256a = oVar.f256a;
                n nVar = new n(oVar.f257b);
                constantState.f257b = nVar;
                if (oVar.f257b.f246e != null) {
                    nVar.f246e = new Paint(oVar.f257b.f246e);
                }
                if (oVar.f257b.d != null) {
                    constantState.f257b.d = new Paint(oVar.f257b.d);
                }
                constantState.f258c = oVar.f258c;
                constantState.d = oVar.d;
                constantState.f259e = oVar.f259e;
            }
            this.f268c = constantState;
            this.f270f = true;
        }
        return this;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override
    public final boolean onStateChange(int[] iArr) {
        boolean z9;
        PorterDuff.Mode mode;
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        o oVar = this.f268c;
        ColorStateList colorStateList = oVar.f258c;
        if (colorStateList != null && (mode = oVar.d) != null) {
            this.d = d(colorStateList, mode);
            invalidateSelf();
            z9 = true;
        } else {
            z9 = false;
        }
        n nVar = oVar.f257b;
        if (nVar.f254n == null) {
            nVar.f254n = Boolean.valueOf(nVar.f248g.a());
        }
        if (nVar.f254n.booleanValue()) {
            boolean b10 = oVar.f257b.f248g.b(iArr);
            oVar.f264k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z9;
    }

    @Override
    public final void scheduleSelf(Runnable runnable, long j3) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j3);
        } else {
            super.scheduleSelf(runnable, j3);
        }
    }

    @Override
    public final void setAlpha(int i7) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f268c.f257b.getRootAlpha() != i7) {
            this.f268c.f257b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override
    public final void setAutoMirrored(boolean z9) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.setAutoMirrored(z9);
        } else {
            this.f268c.f259e = z9;
        }
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f269e = colorFilter;
        invalidateSelf();
    }

    @Override
    public final void setTint(int i7) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            o0.a(i7, drawable);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        o oVar = this.f268c;
        if (oVar.f258c != colorStateList) {
            oVar.f258c = colorStateList;
            this.d = d(colorStateList, oVar.d);
            invalidateSelf();
        }
    }

    @Override
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        o oVar = this.f268c;
        if (oVar.d != mode) {
            oVar.d = mode;
            this.d = d(oVar.f258c, mode);
            invalidateSelf();
        }
    }

    @Override
    public final boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            return drawable.setVisible(z9, z10);
        }
        return super.setVisible(z9, z10);
    }

    @Override
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int i7;
        char c10;
        int i10;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = (Drawable) this.f220b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        o oVar = this.f268c;
        oVar.f257b = new n();
        TypedArray f10 = h0.b.f(resources, theme, attributeSet, a.f200a);
        o oVar2 = this.f268c;
        n nVar = oVar2.f257b;
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
        oVar2.d = mode;
        ColorStateList colorStateList = null;
        int i12 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f10.getValue(1, typedValue);
            int i13 = typedValue.type;
            if (i13 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            } else if (i13 >= 28 && i13 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f10.getResources();
                int resourceId = f10.getResourceId(1, 0);
                ThreadLocal threadLocal = h0.c.f14011a;
                try {
                    colorStateList = h0.c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e10) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            oVar2.f258c = colorStateList2;
        }
        boolean z9 = oVar2.f259e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z9 = f10.getBoolean(5, z9);
        }
        oVar2.f259e = z9;
        float f11 = nVar.f250j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f11 = f10.getFloat(7, f11);
        }
        nVar.f250j = f11;
        float f12 = nVar.f251k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f12 = f10.getFloat(8, f12);
        }
        nVar.f251k = f12;
        if (nVar.f250j <= 0.0f) {
            throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f12 > 0.0f) {
            nVar.h = f10.getDimension(3, nVar.h);
            float dimension = f10.getDimension(2, nVar.f249i);
            nVar.f249i = dimension;
            if (nVar.h <= 0.0f) {
                throw new XmlPullParserException(f10.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                float alpha = nVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f10.getFloat(4, alpha);
                }
                nVar.setAlpha(alpha);
                String string = f10.getString(0);
                if (string != null) {
                    nVar.f253m = string;
                    nVar.f255o.put(string, nVar);
                }
                f10.recycle();
                oVar.f256a = getChangingConfigurations();
                oVar.f264k = true;
                o oVar3 = this.f268c;
                n nVar2 = oVar3.f257b;
                ArrayDeque arrayDeque = new ArrayDeque();
                k kVar = nVar2.f248g;
                a0.f fVar = nVar2.f255o;
                arrayDeque.push(kVar);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z10 = true;
                while (eventType != i12 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        k kVar2 = (k) arrayDeque.peek();
                        i7 = depth;
                        if ("path".equals(name)) {
                            ?? mVar = new m();
                            mVar.f221e = 0.0f;
                            mVar.f223g = 1.0f;
                            mVar.h = 1.0f;
                            mVar.f224i = 0.0f;
                            mVar.f225j = 1.0f;
                            mVar.f226k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            mVar.f227l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            mVar.f228m = join2;
                            mVar.f229n = 4.0f;
                            TypedArray f13 = h0.b.f(resources, theme, attributeSet, a.f202c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f13.getString(0);
                                if (string2 != null) {
                                    mVar.f240b = string2;
                                }
                                String string3 = f13.getString(2);
                                if (string3 != null) {
                                    mVar.f239a = i0.c(string3);
                                }
                                mVar.f222f = h0.b.a(f13, xmlPullParser, theme, "fillColor", 1);
                                float f14 = mVar.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f14 = f13.getFloat(12, f14);
                                }
                                mVar.h = f14;
                                int i14 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f13.getInt(8, -1) : -1;
                                Paint.Cap cap3 = mVar.f227l;
                                if (i14 == 0) {
                                    cap = cap2;
                                } else if (i14 != 1) {
                                    cap = i14 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                mVar.f227l = cap;
                                int i15 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f13.getInt(9, -1) : -1;
                                Paint.Join join3 = mVar.f228m;
                                if (i15 == 0) {
                                    join = join2;
                                } else if (i15 != 1) {
                                    join = i15 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                mVar.f228m = join;
                                float f15 = mVar.f229n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f15 = f13.getFloat(10, f15);
                                }
                                mVar.f229n = f15;
                                mVar.d = h0.b.a(f13, xmlPullParser, theme, "strokeColor", 3);
                                float f16 = mVar.f223g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f16 = f13.getFloat(11, f16);
                                }
                                mVar.f223g = f16;
                                float f17 = mVar.f221e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f17 = f13.getFloat(4, f17);
                                }
                                mVar.f221e = f17;
                                float f18 = mVar.f225j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f18 = f13.getFloat(6, f18);
                                }
                                mVar.f225j = f18;
                                float f19 = mVar.f226k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f19 = f13.getFloat(7, f19);
                                }
                                mVar.f226k = f19;
                                float f20 = mVar.f224i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f20 = f13.getFloat(5, f20);
                                }
                                mVar.f224i = f20;
                                int i16 = mVar.f241c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i16 = f13.getInt(13, i16);
                                }
                                mVar.f241c = i16;
                            }
                            f13.recycle();
                            kVar2.f231b.add(mVar);
                            if (mVar.getPathName() != null) {
                                fVar.put(mVar.getPathName(), mVar);
                            }
                            oVar3.f256a = oVar3.f256a;
                            z10 = false;
                            c10 = '\b';
                        } else {
                            c10 = '\b';
                            if ("clip-path".equals(name)) {
                                m mVar2 = new m();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f21 = h0.b.f(resources, theme, attributeSet, a.d);
                                    String string4 = f21.getString(0);
                                    if (string4 != null) {
                                        mVar2.f240b = string4;
                                    }
                                    String string5 = f21.getString(1);
                                    if (string5 != null) {
                                        mVar2.f239a = i0.c(string5);
                                    }
                                    mVar2.f241c = !h0.b.c(xmlPullParser, "fillType") ? 0 : f21.getInt(2, 0);
                                    f21.recycle();
                                }
                                kVar2.f231b.add(mVar2);
                                if (mVar2.getPathName() != null) {
                                    fVar.put(mVar2.getPathName(), mVar2);
                                }
                                oVar3.f256a = oVar3.f256a;
                            } else if ("group".equals(name)) {
                                k kVar3 = new k();
                                TypedArray f22 = h0.b.f(resources, theme, attributeSet, a.f201b);
                                float f23 = kVar3.f232c;
                                if (h0.b.c(xmlPullParser, "rotation")) {
                                    f23 = f22.getFloat(5, f23);
                                }
                                kVar3.f232c = f23;
                                kVar3.d = f22.getFloat(1, kVar3.d);
                                kVar3.f233e = f22.getFloat(2, kVar3.f233e);
                                float f24 = kVar3.f234f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f24 = f22.getFloat(3, f24);
                                }
                                kVar3.f234f = f24;
                                float f25 = kVar3.f235g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f25 = f22.getFloat(4, f25);
                                }
                                kVar3.f235g = f25;
                                float f26 = kVar3.h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f26 = f22.getFloat(6, f26);
                                }
                                kVar3.h = f26;
                                float f27 = kVar3.f236i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f27 = f22.getFloat(7, f27);
                                }
                                kVar3.f236i = f27;
                                String string6 = f22.getString(0);
                                if (string6 != null) {
                                    kVar3.f238k = string6;
                                }
                                kVar3.c();
                                f22.recycle();
                                kVar2.f231b.add(kVar3);
                                arrayDeque.push(kVar3);
                                if (kVar3.getGroupName() != null) {
                                    fVar.put(kVar3.getGroupName(), kVar3);
                                }
                                oVar3.f256a = oVar3.f256a;
                            }
                        }
                        i10 = 1;
                    } else {
                        i7 = depth;
                        c10 = '\b';
                        i10 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i12 = i10;
                    depth = i7;
                }
                if (!z10) {
                    this.d = d(oVar.f258c, oVar.d);
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

    public q(o oVar) {
        this.h = true;
        this.f271n = new float[9];
        this.f272r = new Matrix();
        this.f273s = new Rect();
        this.f268c = oVar;
        this.d = d(oVar.f258c, oVar.d);
    }
}

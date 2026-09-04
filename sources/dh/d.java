package dh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import v7.e8;
import w7.p;
import yf.f0;
public abstract class d extends Drawable {
    public static final float[] C = new float[8];
    public static Path D = new Path();
    public NinePatchDrawable A;
    public long B;
    public float f6831a;
    public float f6832b;
    public eh.a f6833c;
    public int d;
    public int f6834e;
    public int f6835f;
    public int f6836g;
    public final c h;
    public b f6837i;
    public int f6838j;
    public boolean f6839k;
    public float f6840l;
    public float f6841m;
    public float f6842n;
    public final Paint f6843o;
    public final Paint f6844p;
    public final Paint f6845q;
    public final Paint f6846r;
    public final Paint f6847s;
    public final Matrix f6848t;
    public final WeakReference f6849u;
    public BitmapShader v;
    public final RectF f6850w;
    public final RectF f6851x;
    public final bh.a f6852y;
    public final Rect f6853z;

    public d() {
        c cVar = new c();
        this.h = cVar;
        this.f6838j = 255;
        this.f6842n = 1.0f;
        this.f6843o = new Paint(1);
        this.f6844p = new Paint(1);
        Paint paint = new Paint(1);
        this.f6845q = paint;
        this.f6846r = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f6847s = paint2;
        this.f6848t = new Matrix();
        this.f6849u = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.f6850w = new RectF();
        this.f6851x = new RectF();
        this.f6852y = new Object();
        this.f6853z = new Rect();
        cVar.f6824i = AndroidUtilities.dpf2(1.0f);
        cVar.f6825j = AndroidUtilities.dpf2(0.6666667f);
        this.f6840l = AndroidUtilities.dpf2(1.0f);
        this.f6841m = AndroidUtilities.dpf2(0.33333334f);
    }

    public static void e(android.graphics.Canvas r17, float r18, float r19, float[] r20, float r21, boolean r22, android.graphics.Paint r23) {
        throw new UnsupportedOperationException("Method not decompiled: dh.d.e(android.graphics.Canvas, float, float, float[], float, boolean, android.graphics.Paint):void");
    }

    public static void f(Canvas canvas, RectF rectF, float f7, float f10, boolean z10, Paint paint) {
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = rectF.right;
        float f14 = rectF.bottom;
        float f15 = f10 / 2.0f;
        canvas.save();
        if (z10) {
            float f16 = f11 - f15;
            float f17 = f13 + f15;
            if (canvas.clipRect(f16, f12, f17, p.a((2.0f * f7) + f12, f12, f14))) {
                canvas.drawRoundRect(f16, f12 + f15, f17, f14 + f15, f7, f7, paint);
            }
        } else {
            float f18 = f11 - f15;
            float f19 = f13 + f15;
            if (canvas.clipRect(f18, p.a(f14 - (2.0f * f7), f12, f14), f19, f14)) {
                canvas.drawRoundRect(f18, f12 - f15, f19, f14 - f15, f7, f7, paint);
            }
        }
        canvas.restore();
    }

    public static void h(Outline outline, Rect rect, float[] fArr) {
        if (f0.c(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = D;
        if (path == null) {
            D = new Path();
        } else {
            path.rewind();
        }
        D.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(D);
    }

    public final NinePatchDrawable a(int i10, boolean z10) {
        long j3;
        int i11;
        bh.a aVar = this.f6852y;
        aVar.f2649b = 0L;
        aVar.f2648a = false;
        aVar.a(i10);
        aVar.a(this.d);
        c cVar = this.h;
        for (float f7 : cVar.f6819b) {
            aVar.c(f7);
        }
        aVar.c(this.f6840l);
        aVar.c(0.0f);
        aVar.c(this.f6841m);
        aVar.b(z10);
        if (z10) {
            aVar.a(this.f6835f);
            aVar.a(this.f6836g);
            aVar.c(cVar.f6824i);
            aVar.c(cVar.f6825j);
        }
        if (aVar.f2648a) {
            j3 = -1;
        } else {
            j3 = aVar.f2649b;
        }
        if (this.A == null || this.B != j3) {
            this.B = j3;
            if (Color.alpha(i10) == 255) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            NinePatchDrawable b10 = e8.b(null, cVar.f6819b, this.f6840l, this.f6841m, i11, new a(i10, this, z10));
            this.A = b10;
            b10.getPadding(this.f6853z);
        }
        return this.A;
    }

    public final void b() {
        Rect rect = this.h.f6828m;
        RectF rectF = this.f6850w;
        rectF.set(rect);
        rectF.offset(this.f6831a, this.f6832b);
        RectF rectF2 = this.f6851x;
        if (!rectF.equals(rectF2)) {
            rectF2.set(rectF);
            l();
        }
    }

    public final void c(Canvas canvas, gh.a aVar) {
        int i10;
        boolean z10;
        c cVar = this.h;
        Rect rect = cVar.f6828m;
        Rect rect2 = cVar.f6828m;
        if (!rect.isEmpty()) {
            if (Color.alpha(this.f6834e) == 255) {
                d(canvas, 0);
            } else if (aVar instanceof gh.c) {
                d(canvas, ((gh.c) aVar).f10652a.getColor());
            } else if (aVar instanceof gh.b) {
                gh.b bVar = (gh.b) aVar;
                Bitmap bitmap = bVar.d;
                Bitmap bitmap2 = (Bitmap) this.f6849u.get();
                Paint paint = this.f6845q;
                if (bitmap != bitmap2) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.v = bitmapShader;
                        paint.setShader(bitmapShader);
                    } else {
                        this.v = null;
                        paint.setShader(null);
                    }
                }
                if (Color.alpha(this.d) > 0) {
                    NinePatchDrawable a2 = a(0, false);
                    int i11 = rect2.left;
                    Rect rect3 = this.f6853z;
                    a2.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                    a2.setAlpha(this.f6838j);
                    a2.draw(canvas);
                }
                if (this.v != null && bitmap != null && !bitmap.isRecycled() && this.f6838j > 0) {
                    Matrix matrix = bVar.f10647b;
                    Matrix matrix2 = this.f6848t;
                    matrix2.set(matrix);
                    matrix2.postTranslate(-this.f6831a, -this.f6832b);
                    this.v.setLocalMatrix(matrix2);
                    paint.setAlpha(this.f6838j);
                    cVar.b(canvas, paint);
                }
                int l1 = j6.l1(this.f6838j / 255.0f, this.f6834e);
                if (Color.alpha(l1) > 0) {
                    Paint paint2 = this.f6846r;
                    paint2.setColor(l1);
                    cVar.b(canvas, paint2);
                }
                g(canvas);
            } else if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof gh.d)) {
                gh.d dVar = (gh.d) aVar;
                if (!canvas.isHardwareAccelerated()) {
                    c(canvas, dVar.f10653a);
                }
            } else if (aVar instanceof gh.e) {
                c(canvas, ((gh.e) aVar).f10661a);
            } else if (aVar != null && (i10 = this.f6838j) != 0) {
                int l12 = j6.l1(i10 / 255.0f, this.f6834e);
                if (Color.alpha(this.d) > 0 && this.f6838j == 255) {
                    float f7 = this.f6842n;
                    if (f7 > 0.0f) {
                        float f10 = this.f6840l;
                        float f11 = this.f6841m;
                        int l13 = j6.l1(f7, this.d);
                        Paint paint3 = this.f6847s;
                        paint3.setShadowLayer(f10, 0.0f, f11, l13);
                        cVar.c(canvas, paint3, this.f6839k);
                    }
                }
                float f12 = this.f6831a;
                float f13 = this.f6832b;
                float f14 = rect2.left;
                float f15 = f14 + f12;
                float f16 = rect2.top;
                float f17 = f16 + f13;
                float f18 = rect2.right;
                float f19 = f18 + f12;
                float f20 = rect2.bottom;
                float f21 = f20 + f13;
                int i12 = this.f6838j;
                if (i12 != 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    canvas.saveLayerAlpha(f14, f16, f18, f20, i12);
                }
                canvas.save();
                canvas.clipPath(cVar.f6826k);
                canvas.translate(rect2.left, rect2.top);
                canvas.translate(-f15, -f17);
                aVar.v(canvas, f15, f17, f19, f21);
                canvas.restore();
                if (Color.alpha(l12) > 0) {
                    Paint paint4 = this.f6843o;
                    paint4.setColor(l12);
                    cVar.b(canvas, paint4);
                }
                g(canvas);
                if (z10) {
                    canvas.restore();
                }
            }
        }
    }

    public final void d(Canvas canvas, int i10) {
        int h = i0.a.h(this.f6834e, i10);
        if (Color.alpha(h) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable a2 = a(h, true);
        Rect rect = this.h.f6828m;
        int i11 = rect.left;
        Rect rect2 = this.f6853z;
        a2.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.f6838j);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int l1 = j6.l1(this.f6838j / 255.0f, this.f6835f);
        int l12 = j6.l1(this.f6838j / 255.0f, this.f6836g);
        int alpha = Color.alpha(l1);
        c cVar = this.h;
        Paint paint = this.f6844p;
        if (alpha > 0) {
            paint.setColor(l1);
            canvas.drawPath(cVar.f6829n, paint);
        }
        if (Color.alpha(l12) > 0) {
            paint.setColor(l12);
            canvas.drawPath(cVar.f6830o, paint);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f6838j;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        c cVar = this.h;
        h(outline, cVar.f6828m, cVar.f6819b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        c cVar = this.h;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.f6821e;
    }

    public abstract gh.a i();

    public void j() {
        b();
    }

    public void k() {
        b();
    }

    public final void n(eh.a aVar) {
        this.f6833c = aVar;
        u();
        if (aVar instanceof eh.e) {
            eh.e eVar = (eh.e) aVar;
            float f7 = eVar.f9114f;
            float f10 = eVar.h;
            c cVar = this.h;
            cVar.f6824i = f7;
            cVar.f6825j = f10;
            float f11 = eVar.f9115n;
            float f12 = eVar.f9116r;
            this.f6840l = f11;
            this.f6841m = f12;
        }
    }

    public final void o(int i10) {
        c cVar = this.h;
        if (cVar.d != i10) {
            cVar.d = i10;
            cVar.a();
            j();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c cVar = this.h;
        cVar.f6818a.set(rect);
        cVar.a();
        j();
    }

    public final void p(float f7) {
        c cVar = this.h;
        Arrays.fill(cVar.f6819b, f7);
        Arrays.fill(cVar.f6820c, f7);
        cVar.a();
        j();
    }

    public final void q(float f7, float f10, float f11, float f12) {
        c cVar = this.h;
        float[] fArr = cVar.f6819b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[7] = f12;
        fArr[6] = f12;
        cVar.a();
        j();
    }

    public final void r(float f7, float f10, float f11, float f12) {
        c cVar = this.h;
        float[] fArr = cVar.f6819b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.f6820c;
        fArr2[1] = f7;
        fArr2[0] = f7;
        fArr2[3] = f10;
        fArr2[2] = f10;
        fArr2[5] = f11;
        fArr2[4] = f11;
        fArr2[7] = f12;
        fArr2[6] = f12;
        cVar.a();
        j();
    }

    public final void s(float f7, float f10) {
        if (this.f6831a == f7 && this.f6832b == f10) {
            return;
        }
        this.f6831a = f7;
        this.f6832b = f10;
        k();
    }

    @Override
    public void setAlpha(int i10) {
        this.f6838j = i10;
    }

    public final void t(int i10) {
        this.h.f6822f = i10;
        j();
    }

    public void u() {
        eh.a aVar = this.f6833c;
        if (aVar == null) {
            return;
        }
        this.f6834e = aVar.k0();
        this.d = this.f6833c.J();
        this.f6835f = this.f6833c.p();
        this.f6836g = this.f6833c.G();
    }

    public void l() {
    }

    public d m() {
        return this;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

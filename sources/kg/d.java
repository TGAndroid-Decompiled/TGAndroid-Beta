package kg;

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
import ff.m0;
import g.x;
import g7.n;
import g7.z5;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
public abstract class d extends Drawable {
    public static final float[] C = new float[8];
    public static Path D = new Path();
    public NinePatchDrawable A;
    public long B;
    public float f14815a;
    public float f14816b;
    public lg.a f14817c;
    public int d;
    public int f14818e;
    public int f14819f;
    public int f14820g;
    public final c h;
    public b f14821i;
    public int f14822j;
    public boolean f14823k;
    public float f14824l;
    public float f14825m;
    public float f14826n;
    public final Paint f14827o;
    public final Paint f14828p;
    public final Paint f14829q;
    public final Paint f14830r;
    public final Paint f14831s;
    public final Matrix f14832t;
    public final WeakReference f14833u;
    public BitmapShader v;
    public final RectF f14834w;
    public final RectF f14835x;
    public final x f14836y;
    public final Rect f14837z;

    public d() {
        c cVar = new c();
        this.h = cVar;
        this.f14822j = 255;
        this.f14826n = 1.0f;
        this.f14827o = new Paint(1);
        this.f14828p = new Paint(1);
        Paint paint = new Paint(1);
        this.f14829q = paint;
        this.f14830r = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f14831s = paint2;
        this.f14832t = new Matrix();
        this.f14833u = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.f14834w = new RectF();
        this.f14835x = new RectF();
        this.f14836y = new Object();
        this.f14837z = new Rect();
        cVar.f14808i = AndroidUtilities.dpf2(1.0f);
        cVar.f14809j = AndroidUtilities.dpf2(0.6666667f);
        this.f14824l = AndroidUtilities.dpf2(1.0f);
        this.f14825m = AndroidUtilities.dpf2(0.33333334f);
    }

    public static void e(android.graphics.Canvas r17, float r18, float r19, float[] r20, float r21, boolean r22, android.graphics.Paint r23) {
        throw new UnsupportedOperationException("Method not decompiled: kg.d.e(android.graphics.Canvas, float, float, float[], float, boolean, android.graphics.Paint):void");
    }

    public static void f(Canvas canvas, RectF rectF, float f10, float f11, boolean z10, Paint paint) {
        float f12 = rectF.left;
        float f13 = rectF.top;
        float f14 = rectF.right;
        float f15 = rectF.bottom;
        float f16 = f11 / 2.0f;
        canvas.save();
        if (z10) {
            float f17 = f12 - f16;
            float f18 = f14 + f16;
            if (canvas.clipRect(f17, f13, f18, n.a((2.0f * f10) + f13, f13, f15))) {
                canvas.drawRoundRect(f17, f13 + f16, f18, f15 + f16, f10, f10, paint);
            }
        } else {
            float f19 = f12 - f16;
            float f20 = f14 + f16;
            if (canvas.clipRect(f19, n.a(f15 - (2.0f * f10), f13, f15), f20, f15)) {
                canvas.drawRoundRect(f19, f13 - f16, f20, f15 - f16, f10, f10, paint);
            }
        }
        canvas.restore();
    }

    public static void h(Outline outline, Rect rect, float[] fArr) {
        if (m0.c(fArr)) {
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

    public final NinePatchDrawable a(int i9, boolean z10) {
        long j10;
        int i10;
        x xVar = this.f14836y;
        xVar.f7045a = 0L;
        xVar.f7046b = false;
        xVar.a(i9);
        xVar.a(this.d);
        c cVar = this.h;
        for (float f10 : cVar.f14803b) {
            xVar.c(f10);
        }
        xVar.c(this.f14824l);
        xVar.c(0.0f);
        xVar.c(this.f14825m);
        xVar.b(z10);
        if (z10) {
            xVar.a(this.f14819f);
            xVar.a(this.f14820g);
            xVar.c(cVar.f14808i);
            xVar.c(cVar.f14809j);
        }
        if (xVar.f7046b) {
            j10 = -1;
        } else {
            j10 = xVar.f7045a;
        }
        if (this.A == null || this.B != j10) {
            this.B = j10;
            if (Color.alpha(i9) == 255) {
                i10 = i9;
            } else {
                i10 = 1;
            }
            NinePatchDrawable b10 = z5.b(null, cVar.f14803b, this.f14824l, this.f14825m, i10, new a(i9, this, z10));
            this.A = b10;
            b10.getPadding(this.f14837z);
        }
        return this.A;
    }

    public final void b() {
        Rect rect = this.h.f14812m;
        RectF rectF = this.f14834w;
        rectF.set(rect);
        rectF.offset(this.f14815a, this.f14816b);
        RectF rectF2 = this.f14835x;
        if (!rectF.equals(rectF2)) {
            rectF2.set(rectF);
            l();
        }
    }

    public final void c(Canvas canvas, ng.a aVar) {
        int i9;
        boolean z10;
        c cVar = this.h;
        Rect rect = cVar.f14812m;
        Rect rect2 = cVar.f14812m;
        if (!rect.isEmpty()) {
            if (Color.alpha(this.f14818e) == 255) {
                d(canvas, 0);
            } else if (aVar instanceof ng.c) {
                d(canvas, ((ng.c) aVar).f18600a.getColor());
            } else if (aVar instanceof ng.b) {
                ng.b bVar = (ng.b) aVar;
                Bitmap bitmap = bVar.d;
                Bitmap bitmap2 = (Bitmap) this.f14833u.get();
                Paint paint = this.f14829q;
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
                    int i10 = rect2.left;
                    Rect rect3 = this.f14837z;
                    a2.setBounds(i10 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                    a2.setAlpha(this.f14822j);
                    a2.draw(canvas);
                }
                if (this.v != null && bitmap != null && !bitmap.isRecycled() && this.f14822j > 0) {
                    Matrix matrix = bVar.f18595b;
                    Matrix matrix2 = this.f14832t;
                    matrix2.set(matrix);
                    matrix2.postTranslate(-this.f14815a, -this.f14816b);
                    this.v.setLocalMatrix(matrix2);
                    paint.setAlpha(this.f14822j);
                    cVar.b(canvas, paint);
                }
                int l1 = f6.l1(this.f14822j / 255.0f, this.f14818e);
                if (Color.alpha(l1) > 0) {
                    Paint paint2 = this.f14830r;
                    paint2.setColor(l1);
                    cVar.b(canvas, paint2);
                }
                g(canvas);
            } else if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof ng.d)) {
                ng.d dVar = (ng.d) aVar;
                if (!canvas.isHardwareAccelerated()) {
                    c(canvas, dVar.f18601a);
                }
            } else if (aVar instanceof ng.e) {
                c(canvas, ((ng.e) aVar).f18609a);
            } else if (aVar != null && (i9 = this.f14822j) != 0) {
                int l12 = f6.l1(i9 / 255.0f, this.f14818e);
                if (Color.alpha(this.d) > 0 && this.f14822j == 255) {
                    float f10 = this.f14826n;
                    if (f10 > 0.0f) {
                        float f11 = this.f14824l;
                        float f12 = this.f14825m;
                        int l13 = f6.l1(f10, this.d);
                        Paint paint3 = this.f14831s;
                        paint3.setShadowLayer(f11, 0.0f, f12, l13);
                        cVar.c(canvas, paint3, this.f14823k);
                    }
                }
                float f13 = this.f14815a;
                float f14 = this.f14816b;
                float f15 = rect2.left;
                float f16 = f15 + f13;
                float f17 = rect2.top;
                float f18 = f17 + f14;
                float f19 = rect2.right;
                float f20 = f19 + f13;
                float f21 = rect2.bottom;
                float f22 = f21 + f14;
                int i11 = this.f14822j;
                if (i11 != 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    canvas.saveLayerAlpha(f15, f17, f19, f21, i11);
                }
                canvas.save();
                canvas.clipPath(cVar.f14810k);
                canvas.translate(rect2.left, rect2.top);
                canvas.translate(-f16, -f18);
                aVar.T0(canvas, f16, f18, f20, f22);
                canvas.restore();
                if (Color.alpha(l12) > 0) {
                    Paint paint4 = this.f14827o;
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

    public final void d(Canvas canvas, int i9) {
        int h = i0.a.h(this.f14818e, i9);
        if (Color.alpha(h) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable a2 = a(h, true);
        Rect rect = this.h.f14812m;
        int i10 = rect.left;
        Rect rect2 = this.f14837z;
        a2.setBounds(i10 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.f14822j);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int l1 = f6.l1(this.f14822j / 255.0f, this.f14819f);
        int l12 = f6.l1(this.f14822j / 255.0f, this.f14820g);
        int alpha = Color.alpha(l1);
        c cVar = this.h;
        Paint paint = this.f14828p;
        if (alpha > 0) {
            paint.setColor(l1);
            canvas.drawPath(cVar.f14813n, paint);
        }
        if (Color.alpha(l12) > 0) {
            paint.setColor(l12);
            canvas.drawPath(cVar.f14814o, paint);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f14822j;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        c cVar = this.h;
        h(outline, cVar.f14812m, cVar.f14803b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        c cVar = this.h;
        int i9 = cVar.d;
        rect.set(i9, i9, i9, i9);
        return cVar.f14805e;
    }

    public abstract ng.a i();

    public void j() {
        b();
    }

    public void k() {
        b();
    }

    public final void n(lg.a aVar) {
        this.f14817c = aVar;
        u();
        if (aVar instanceof lg.d) {
            lg.d dVar = (lg.d) aVar;
            float f10 = dVar.f16867f;
            float f11 = dVar.h;
            c cVar = this.h;
            cVar.f14808i = f10;
            cVar.f14809j = f11;
            float f12 = dVar.f16868n;
            float f13 = dVar.f16869r;
            this.f14824l = f12;
            this.f14825m = f13;
        }
    }

    public final void o(int i9) {
        c cVar = this.h;
        if (cVar.d != i9) {
            cVar.d = i9;
            cVar.a();
            j();
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c cVar = this.h;
        cVar.f14802a.set(rect);
        cVar.a();
        j();
    }

    public final void p(float f10) {
        c cVar = this.h;
        Arrays.fill(cVar.f14803b, f10);
        Arrays.fill(cVar.f14804c, f10);
        cVar.a();
        j();
    }

    public final void q(float f10, float f11, float f12, float f13) {
        c cVar = this.h;
        float[] fArr = cVar.f14803b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[5] = f12;
        fArr[4] = f12;
        fArr[7] = f13;
        fArr[6] = f13;
        cVar.a();
        j();
    }

    public final void r(float f10, float f11, float f12, float f13) {
        c cVar = this.h;
        float[] fArr = cVar.f14803b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.f14804c;
        fArr2[1] = f10;
        fArr2[0] = f10;
        fArr2[3] = f11;
        fArr2[2] = f11;
        fArr2[5] = f12;
        fArr2[4] = f12;
        fArr2[7] = f13;
        fArr2[6] = f13;
        cVar.a();
        j();
    }

    public final void s(float f10, float f11) {
        if (this.f14815a == f10 && this.f14816b == f11) {
            return;
        }
        this.f14815a = f10;
        this.f14816b = f11;
        k();
    }

    @Override
    public void setAlpha(int i9) {
        this.f14822j = i9;
    }

    public final void t(int i9) {
        this.h.f14806f = i9;
        j();
    }

    public void u() {
        lg.a aVar = this.f14817c;
        if (aVar == null) {
            return;
        }
        this.f14818e = aVar.k();
        this.d = this.f14817c.j();
        this.f14819f = this.f14817c.e();
        this.f14820g = this.f14817c.g();
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

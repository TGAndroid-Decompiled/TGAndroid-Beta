package bh;

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
import g.z;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.j6;
import v7.j7;
import w7.q;
import xf.f0;
public abstract class d extends Drawable {
    public static final float[] C = new float[8];
    public static Path D = new Path();
    public NinePatchDrawable A;
    public long B;
    public float f2269a;
    public float f2270b;
    public ch.a f2271c;
    public int d;
    public int e;
    public int f2272f;
    public int f2273g;
    public final c h;
    public b f2274i;
    public int f2275j;
    public boolean f2276k;
    public float f2277l;
    public float f2278m;
    public float f2279n;
    public final Paint f2280o;
    public final Paint f2281p;
    public final Paint f2282q;
    public final Paint f2283r;
    public final Paint f2284s;
    public final Matrix f2285t;
    public final WeakReference f2286u;
    public BitmapShader v;
    public final RectF f2287w;
    public final RectF f2288x;
    public final z f2289y;
    public final Rect f2290z;

    public d() {
        c cVar = new c();
        this.h = cVar;
        this.f2275j = 255;
        this.f2279n = 1.0f;
        this.f2280o = new Paint(1);
        this.f2281p = new Paint(1);
        Paint paint = new Paint(1);
        this.f2282q = paint;
        this.f2283r = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f2284s = paint2;
        this.f2285t = new Matrix();
        this.f2286u = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.f2287w = new RectF();
        this.f2288x = new RectF();
        this.f2289y = new Object();
        this.f2290z = new Rect();
        cVar.f2262i = AndroidUtilities.dpf2(1.0f);
        cVar.f2263j = AndroidUtilities.dpf2(0.6666667f);
        this.f2277l = AndroidUtilities.dpf2(1.0f);
        this.f2278m = AndroidUtilities.dpf2(0.33333334f);
    }

    public static void e(android.graphics.Canvas r17, float r18, float r19, float[] r20, float r21, boolean r22, android.graphics.Paint r23) {
        throw new UnsupportedOperationException("Method not decompiled: bh.d.e(android.graphics.Canvas, float, float, float[], float, boolean, android.graphics.Paint):void");
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
            if (canvas.clipRect(f16, f12, f17, q.a((2.0f * f7) + f12, f12, f14))) {
                canvas.drawRoundRect(f16, f12 + f15, f17, f14 + f15, f7, f7, paint);
            }
        } else {
            float f18 = f11 - f15;
            float f19 = f13 + f15;
            if (canvas.clipRect(f18, q.a(f14 - (2.0f * f7), f12, f14), f19, f14)) {
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
        z zVar = this.f2289y;
        zVar.f8455a = 0L;
        zVar.f8456b = false;
        zVar.a(i10);
        zVar.a(this.d);
        c cVar = this.h;
        for (float f7 : cVar.f2258b) {
            zVar.c(f7);
        }
        zVar.c(this.f2277l);
        zVar.c(0.0f);
        zVar.c(this.f2278m);
        zVar.b(z10);
        if (z10) {
            zVar.a(this.f2272f);
            zVar.a(this.f2273g);
            zVar.c(cVar.f2262i);
            zVar.c(cVar.f2263j);
        }
        if (zVar.f8456b) {
            j3 = -1;
        } else {
            j3 = zVar.f8455a;
        }
        if (this.A == null || this.B != j3) {
            this.B = j3;
            if (Color.alpha(i10) == 255) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            NinePatchDrawable b10 = j7.b(null, cVar.f2258b, this.f2277l, this.f2278m, i11, new a(i10, this, z10));
            this.A = b10;
            b10.getPadding(this.f2290z);
        }
        return this.A;
    }

    public final void b() {
        Rect rect = this.h.f2266m;
        RectF rectF = this.f2287w;
        rectF.set(rect);
        rectF.offset(this.f2269a, this.f2270b);
        RectF rectF2 = this.f2288x;
        if (!rectF.equals(rectF2)) {
            rectF2.set(rectF);
            l();
        }
    }

    public final void c(Canvas canvas, eh.a aVar) {
        int i10;
        boolean z10;
        c cVar = this.h;
        Rect rect = cVar.f2266m;
        Rect rect2 = cVar.f2266m;
        if (!rect.isEmpty()) {
            if (Color.alpha(this.e) == 255) {
                d(canvas, 0);
            } else if (aVar instanceof eh.c) {
                d(canvas, ((eh.c) aVar).f7517a.getColor());
            } else if (aVar instanceof eh.b) {
                eh.b bVar = (eh.b) aVar;
                Bitmap bitmap = bVar.d;
                Bitmap bitmap2 = (Bitmap) this.f2286u.get();
                Paint paint = this.f2282q;
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
                    Rect rect3 = this.f2290z;
                    a2.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                    a2.setAlpha(this.f2275j);
                    a2.draw(canvas);
                }
                if (this.v != null && bitmap != null && !bitmap.isRecycled() && this.f2275j > 0) {
                    Matrix matrix = bVar.f7513b;
                    Matrix matrix2 = this.f2285t;
                    matrix2.set(matrix);
                    matrix2.postTranslate(-this.f2269a, -this.f2270b);
                    this.v.setLocalMatrix(matrix2);
                    paint.setAlpha(this.f2275j);
                    cVar.b(canvas, paint);
                }
                int l1 = j6.l1(this.f2275j / 255.0f, this.e);
                if (Color.alpha(l1) > 0) {
                    Paint paint2 = this.f2283r;
                    paint2.setColor(l1);
                    cVar.b(canvas, paint2);
                }
                g(canvas);
            } else if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof eh.d)) {
                eh.d dVar = (eh.d) aVar;
                if (!canvas.isHardwareAccelerated()) {
                    c(canvas, dVar.f7518a);
                }
            } else if (aVar instanceof eh.e) {
                c(canvas, ((eh.e) aVar).f7525a);
            } else if (aVar != null && (i10 = this.f2275j) != 0) {
                int l12 = j6.l1(i10 / 255.0f, this.e);
                if (Color.alpha(this.d) > 0 && this.f2275j == 255) {
                    float f7 = this.f2279n;
                    if (f7 > 0.0f) {
                        float f10 = this.f2277l;
                        float f11 = this.f2278m;
                        int l13 = j6.l1(f7, this.d);
                        Paint paint3 = this.f2284s;
                        paint3.setShadowLayer(f10, 0.0f, f11, l13);
                        cVar.c(canvas, paint3, this.f2276k);
                    }
                }
                float f12 = this.f2269a;
                float f13 = this.f2270b;
                float f14 = rect2.left;
                float f15 = f14 + f12;
                float f16 = rect2.top;
                float f17 = f16 + f13;
                float f18 = rect2.right;
                float f19 = f18 + f12;
                float f20 = rect2.bottom;
                float f21 = f20 + f13;
                int i12 = this.f2275j;
                if (i12 != 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    canvas.saveLayerAlpha(f14, f16, f18, f20, i12);
                }
                canvas.save();
                canvas.clipPath(cVar.f2264k);
                canvas.translate(rect2.left, rect2.top);
                canvas.translate(-f15, -f17);
                aVar.u(canvas, f15, f17, f19, f21);
                canvas.restore();
                if (Color.alpha(l12) > 0) {
                    Paint paint4 = this.f2280o;
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
        int h = i0.a.h(this.e, i10);
        if (Color.alpha(h) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable a2 = a(h, true);
        Rect rect = this.h.f2266m;
        int i11 = rect.left;
        Rect rect2 = this.f2290z;
        a2.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.f2275j);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int l1 = j6.l1(this.f2275j / 255.0f, this.f2272f);
        int l12 = j6.l1(this.f2275j / 255.0f, this.f2273g);
        int alpha = Color.alpha(l1);
        c cVar = this.h;
        Paint paint = this.f2281p;
        if (alpha > 0) {
            paint.setColor(l1);
            canvas.drawPath(cVar.f2267n, paint);
        }
        if (Color.alpha(l12) > 0) {
            paint.setColor(l12);
            canvas.drawPath(cVar.f2268o, paint);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f2275j;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        c cVar = this.h;
        h(outline, cVar.f2266m, cVar.f2258b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        c cVar = this.h;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.e;
    }

    public abstract eh.a i();

    public void j() {
        b();
    }

    public void k() {
        b();
    }

    public final void n(ch.a aVar) {
        this.f2271c = aVar;
        u();
        if (aVar instanceof ch.e) {
            ch.e eVar = (ch.e) aVar;
            float f7 = eVar.f4691f;
            float f10 = eVar.h;
            c cVar = this.h;
            cVar.f2262i = f7;
            cVar.f2263j = f10;
            float f11 = eVar.f4692n;
            float f12 = eVar.f4693r;
            this.f2277l = f11;
            this.f2278m = f12;
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
        cVar.f2257a.set(rect);
        cVar.a();
        j();
    }

    public final void p(float f7) {
        c cVar = this.h;
        Arrays.fill(cVar.f2258b, f7);
        Arrays.fill(cVar.f2259c, f7);
        cVar.a();
        j();
    }

    public final void q(float f7, float f10, float f11, float f12) {
        c cVar = this.h;
        float[] fArr = cVar.f2258b;
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
        float[] fArr = cVar.f2258b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.f2259c;
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
        if (this.f2269a == f7 && this.f2270b == f10) {
            return;
        }
        this.f2269a = f7;
        this.f2270b = f10;
        k();
    }

    @Override
    public void setAlpha(int i10) {
        this.f2275j = i10;
    }

    public final void t(int i10) {
        this.h.f2260f = i10;
        j();
    }

    public void u() {
        ch.a aVar = this.f2271c;
        if (aVar == null) {
            return;
        }
        this.e = aVar.x();
        this.d = this.f2271c.w();
        this.f2272f = this.f2271c.h();
        this.f2273g = this.f2271c.p();
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

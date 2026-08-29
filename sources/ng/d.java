package ng;

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
import g.x;
import i7.n7;
import i7.w;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import jf.l0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
public abstract class d extends Drawable {
    public static final float[] C = new float[8];
    public static Path D = new Path();
    public NinePatchDrawable A;
    public long B;
    public float f17339a;
    public float f17340b;
    public og.a f17341c;
    public int d;
    public int f17342e;
    public int f17343f;
    public int f17344g;
    public final c h;
    public b f17345i;
    public int f17346j;
    public boolean f17347k;
    public float f17348l;
    public float f17349m;
    public float f17350n;
    public final Paint f17351o;
    public final Paint f17352p;
    public final Paint f17353q;
    public final Paint f17354r;
    public final Paint f17355s;
    public final Matrix f17356t;
    public final WeakReference f17357u;
    public BitmapShader v;
    public final RectF f17358w;
    public final RectF f17359x;
    public final x f17360y;
    public final Rect f17361z;

    public d() {
        c cVar = new c();
        this.h = cVar;
        this.f17346j = 255;
        this.f17350n = 1.0f;
        this.f17351o = new Paint(1);
        this.f17352p = new Paint(1);
        Paint paint = new Paint(1);
        this.f17353q = paint;
        this.f17354r = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f17355s = paint2;
        this.f17356t = new Matrix();
        this.f17357u = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.f17358w = new RectF();
        this.f17359x = new RectF();
        this.f17360y = new Object();
        this.f17361z = new Rect();
        cVar.f17332i = AndroidUtilities.dpf2(1.0f);
        cVar.f17333j = AndroidUtilities.dpf2(0.6666667f);
        this.f17348l = AndroidUtilities.dpf2(1.0f);
        this.f17349m = AndroidUtilities.dpf2(0.33333334f);
    }

    public static void e(android.graphics.Canvas r17, float r18, float r19, float[] r20, float r21, boolean r22, android.graphics.Paint r23) {
        throw new UnsupportedOperationException("Method not decompiled: ng.d.e(android.graphics.Canvas, float, float, float[], float, boolean, android.graphics.Paint):void");
    }

    public static void f(Canvas canvas, RectF rectF, float f9, float f10, boolean z10, Paint paint) {
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = rectF.right;
        float f14 = rectF.bottom;
        float f15 = f10 / 2.0f;
        canvas.save();
        if (z10) {
            float f16 = f11 - f15;
            float f17 = f13 + f15;
            if (canvas.clipRect(f16, f12, f17, w.a((2.0f * f9) + f12, f12, f14))) {
                canvas.drawRoundRect(f16, f12 + f15, f17, f14 + f15, f9, f9, paint);
            }
        } else {
            float f18 = f11 - f15;
            float f19 = f13 + f15;
            if (canvas.clipRect(f18, w.a(f14 - (2.0f * f9), f12, f14), f19, f14)) {
                canvas.drawRoundRect(f18, f12 - f15, f19, f14 - f15, f9, f9, paint);
            }
        }
        canvas.restore();
    }

    public static void h(Outline outline, Rect rect, float[] fArr) {
        if (l0.c(fArr)) {
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
        long j10;
        int i11;
        x xVar = this.f17360y;
        xVar.f6955a = 0L;
        xVar.f6956b = false;
        xVar.a(i10);
        xVar.a(this.d);
        c cVar = this.h;
        for (float f9 : cVar.f17327b) {
            xVar.c(f9);
        }
        xVar.c(this.f17348l);
        xVar.c(0.0f);
        xVar.c(this.f17349m);
        xVar.b(z10);
        if (z10) {
            xVar.a(this.f17343f);
            xVar.a(this.f17344g);
            xVar.c(cVar.f17332i);
            xVar.c(cVar.f17333j);
        }
        if (xVar.f6956b) {
            j10 = -1;
        } else {
            j10 = xVar.f6955a;
        }
        if (this.A == null || this.B != j10) {
            this.B = j10;
            if (Color.alpha(i10) == 255) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            NinePatchDrawable b10 = n7.b(null, cVar.f17327b, this.f17348l, this.f17349m, i11, new a(i10, this, z10));
            this.A = b10;
            b10.getPadding(this.f17361z);
        }
        return this.A;
    }

    public final void b() {
        Rect rect = this.h.f17336m;
        RectF rectF = this.f17358w;
        rectF.set(rect);
        rectF.offset(this.f17339a, this.f17340b);
        RectF rectF2 = this.f17359x;
        if (!rectF.equals(rectF2)) {
            rectF2.set(rectF);
            l();
        }
    }

    public final void c(Canvas canvas, qg.a aVar) {
        int i10;
        boolean z10;
        c cVar = this.h;
        Rect rect = cVar.f17336m;
        Rect rect2 = cVar.f17336m;
        if (!rect.isEmpty()) {
            if (Color.alpha(this.f17342e) == 255) {
                d(canvas, 0);
            } else if (aVar instanceof qg.c) {
                d(canvas, ((qg.c) aVar).f46667a.getColor());
            } else if (aVar instanceof qg.b) {
                qg.b bVar = (qg.b) aVar;
                Bitmap bitmap = bVar.d;
                Bitmap bitmap2 = (Bitmap) this.f17357u.get();
                Paint paint = this.f17353q;
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
                    Rect rect3 = this.f17361z;
                    a2.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                    a2.setAlpha(this.f17346j);
                    a2.draw(canvas);
                }
                if (this.v != null && bitmap != null && !bitmap.isRecycled() && this.f17346j > 0) {
                    Matrix matrix = bVar.f46662b;
                    Matrix matrix2 = this.f17356t;
                    matrix2.set(matrix);
                    matrix2.postTranslate(-this.f17339a, -this.f17340b);
                    this.v.setLocalMatrix(matrix2);
                    paint.setAlpha(this.f17346j);
                    cVar.b(canvas, paint);
                }
                int l1 = g6.l1(this.f17346j / 255.0f, this.f17342e);
                if (Color.alpha(l1) > 0) {
                    Paint paint2 = this.f17354r;
                    paint2.setColor(l1);
                    cVar.b(canvas, paint2);
                }
                g(canvas);
            } else if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof qg.d)) {
                qg.d dVar = (qg.d) aVar;
                if (!canvas.isHardwareAccelerated()) {
                    c(canvas, dVar.f46668a);
                }
            } else if (aVar instanceof qg.e) {
                c(canvas, ((qg.e) aVar).f46676a);
            } else if (aVar != null && (i10 = this.f17346j) != 0) {
                int l12 = g6.l1(i10 / 255.0f, this.f17342e);
                if (Color.alpha(this.d) > 0 && this.f17346j == 255) {
                    float f9 = this.f17350n;
                    if (f9 > 0.0f) {
                        float f10 = this.f17348l;
                        float f11 = this.f17349m;
                        int l13 = g6.l1(f9, this.d);
                        Paint paint3 = this.f17355s;
                        paint3.setShadowLayer(f10, 0.0f, f11, l13);
                        cVar.c(canvas, paint3, this.f17347k);
                    }
                }
                float f12 = this.f17339a;
                float f13 = this.f17340b;
                float f14 = rect2.left;
                float f15 = f14 + f12;
                float f16 = rect2.top;
                float f17 = f16 + f13;
                float f18 = rect2.right;
                float f19 = f18 + f12;
                float f20 = rect2.bottom;
                float f21 = f20 + f13;
                int i12 = this.f17346j;
                if (i12 != 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    canvas.saveLayerAlpha(f14, f16, f18, f20, i12);
                }
                canvas.save();
                canvas.clipPath(cVar.f17334k);
                canvas.translate(rect2.left, rect2.top);
                canvas.translate(-f15, -f17);
                aVar.E0(canvas, f15, f17, f19, f21);
                canvas.restore();
                if (Color.alpha(l12) > 0) {
                    Paint paint4 = this.f17351o;
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
        int h = i0.a.h(this.f17342e, i10);
        if (Color.alpha(h) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable a2 = a(h, true);
        Rect rect = this.h.f17336m;
        int i11 = rect.left;
        Rect rect2 = this.f17361z;
        a2.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.f17346j);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int l1 = g6.l1(this.f17346j / 255.0f, this.f17343f);
        int l12 = g6.l1(this.f17346j / 255.0f, this.f17344g);
        int alpha = Color.alpha(l1);
        c cVar = this.h;
        Paint paint = this.f17352p;
        if (alpha > 0) {
            paint.setColor(l1);
            canvas.drawPath(cVar.f17337n, paint);
        }
        if (Color.alpha(l12) > 0) {
            paint.setColor(l12);
            canvas.drawPath(cVar.f17338o, paint);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f17346j;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        c cVar = this.h;
        h(outline, cVar.f17336m, cVar.f17327b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        c cVar = this.h;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.f17329e;
    }

    public abstract qg.a i();

    public void j() {
        b();
    }

    public void k() {
        b();
    }

    public final void n(og.a aVar) {
        this.f17341c = aVar;
        u();
        if (aVar instanceof og.d) {
            og.d dVar = (og.d) aVar;
            float f9 = dVar.f19561f;
            float f10 = dVar.h;
            c cVar = this.h;
            cVar.f17332i = f9;
            cVar.f17333j = f10;
            float f11 = dVar.f19562n;
            float f12 = dVar.f19563r;
            this.f17348l = f11;
            this.f17349m = f12;
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
        cVar.f17326a.set(rect);
        cVar.a();
        j();
    }

    public final void p(float f9) {
        c cVar = this.h;
        Arrays.fill(cVar.f17327b, f9);
        Arrays.fill(cVar.f17328c, f9);
        cVar.a();
        j();
    }

    public final void q(float f9, float f10, float f11, float f12) {
        c cVar = this.h;
        float[] fArr = cVar.f17327b;
        fArr[1] = f9;
        fArr[0] = f9;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[7] = f12;
        fArr[6] = f12;
        cVar.a();
        j();
    }

    public final void r(float f9, float f10, float f11, float f12) {
        c cVar = this.h;
        float[] fArr = cVar.f17327b;
        fArr[1] = f9;
        fArr[0] = f9;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.f17328c;
        fArr2[1] = f9;
        fArr2[0] = f9;
        fArr2[3] = f10;
        fArr2[2] = f10;
        fArr2[5] = f11;
        fArr2[4] = f11;
        fArr2[7] = f12;
        fArr2[6] = f12;
        cVar.a();
        j();
    }

    public final void s(float f9, float f10) {
        if (this.f17339a == f9 && this.f17340b == f10) {
            return;
        }
        this.f17339a = f9;
        this.f17340b = f10;
        k();
    }

    @Override
    public void setAlpha(int i10) {
        this.f17346j = i10;
    }

    public final void t(int i10) {
        this.h.f17330f = i10;
        j();
    }

    public void u() {
        og.a aVar = this.f17341c;
        if (aVar == null) {
            return;
        }
        this.f17342e = aVar.z();
        this.d = this.f17341c.v();
        this.f17343f = this.f17341c.h();
        this.f17344g = this.f17341c.m();
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

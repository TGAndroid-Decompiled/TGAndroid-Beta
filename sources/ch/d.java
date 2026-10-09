package ch;

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
import org.telegram.ui.ActionBar.i6;
import v7.r7;
import w7.o;
import yf.e0;
public abstract class d extends Drawable {
    public static final float[] E = new float[8];
    public static Path F = new Path();
    public final ah.a A;
    public final Rect B;
    public NinePatchDrawable C;
    public long D;
    public float f4678a;
    public float f4679b;
    public dh.a f4680c;
    public int d;
    public int f4681e;
    public int f4682f;
    public int f4683g;
    public int h;
    public int f4684i;
    public final c f4685j;
    public b f4686k;
    public int f4687l;
    public boolean f4688m;
    public float f4689n;
    public float f4690o;
    public float f4691p;
    public final Paint f4692q;
    public final Paint f4693r;
    public final Paint f4694s;
    public final Paint f4695t;
    public final Paint f4696u;
    public final Matrix v;
    public final WeakReference f4697w;
    public BitmapShader f4698x;
    public final RectF f4699y;
    public final RectF f4700z;

    public d() {
        c cVar = new c();
        this.f4685j = cVar;
        this.f4687l = 255;
        this.f4691p = 1.0f;
        this.f4692q = new Paint(1);
        this.f4693r = new Paint(1);
        Paint paint = new Paint(1);
        this.f4694s = paint;
        this.f4695t = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f4696u = paint2;
        this.v = new Matrix();
        this.f4697w = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.f4699y = new RectF();
        this.f4700z = new RectF();
        this.A = new Object();
        this.B = new Rect();
        cVar.f4671i = AndroidUtilities.dpf2(1.0f);
        cVar.f4672j = AndroidUtilities.dpf2(0.6666667f);
        this.f4689n = AndroidUtilities.dpf2(1.0f);
        this.f4690o = AndroidUtilities.dpf2(0.33333334f);
    }

    public static void e(android.graphics.Canvas r17, float r18, float r19, float[] r20, float r21, boolean r22, android.graphics.Paint r23) {
        throw new UnsupportedOperationException("Method not decompiled: ch.d.e(android.graphics.Canvas, float, float, float[], float, boolean, android.graphics.Paint):void");
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
            if (canvas.clipRect(f16, f12, f17, o.a((2.0f * f7) + f12, f12, f14))) {
                canvas.drawRoundRect(f16, f12 + f15, f17, f14 + f15, f7, f7, paint);
            }
        } else {
            float f18 = f11 - f15;
            float f19 = f13 + f15;
            if (canvas.clipRect(f18, o.a(f14 - (2.0f * f7), f12, f14), f19, f14)) {
                canvas.drawRoundRect(f18, f12 - f15, f19, f14 - f15, f7, f7, paint);
            }
        }
        canvas.restore();
    }

    public static void h(Outline outline, Rect rect, float[] fArr) {
        if (e0.c(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = F;
        if (path == null) {
            F = new Path();
        } else {
            path.rewind();
        }
        F.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(F);
    }

    public final NinePatchDrawable a(int i10, boolean z10) {
        long j3;
        int i11;
        ah.a aVar = this.A;
        aVar.f537b = 0L;
        aVar.f536a = false;
        aVar.a(i10);
        aVar.a(this.d);
        c cVar = this.f4685j;
        for (float f7 : cVar.f4666b) {
            aVar.c(f7);
        }
        aVar.c(this.f4689n);
        aVar.c(0.0f);
        aVar.c(this.f4690o);
        aVar.b(z10);
        if (z10) {
            aVar.a(this.f4682f);
            aVar.a(this.f4683g);
            aVar.c(cVar.f4671i);
            aVar.c(cVar.f4672j);
        }
        if (aVar.f536a) {
            j3 = -1;
        } else {
            j3 = aVar.f537b;
        }
        if (this.C == null || this.D != j3) {
            this.D = j3;
            if (Color.alpha(i10) == 255) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            NinePatchDrawable b10 = r7.b(null, cVar.f4666b, this.f4689n, this.f4690o, i11, new a(i10, this, z10));
            this.C = b10;
            b10.getPadding(this.B);
        }
        return this.C;
    }

    public final void b() {
        Rect rect = this.f4685j.f4675m;
        RectF rectF = this.f4699y;
        rectF.set(rect);
        rectF.offset(this.f4678a, this.f4679b);
        RectF rectF2 = this.f4700z;
        if (!rectF.equals(rectF2)) {
            rectF2.set(rectF);
            m();
        }
    }

    public final void c(Canvas canvas, fh.a aVar) {
        int i10;
        c cVar = this.f4685j;
        Rect rect = cVar.f4675m;
        Rect rect2 = cVar.f4675m;
        if (!rect.isEmpty()) {
            boolean z10 = false;
            if (Color.alpha(this.f4681e) == 255) {
                d(canvas, 0);
            } else if (aVar instanceof fh.c) {
                d(canvas, ((fh.c) aVar).f9933a.getColor());
            } else if (aVar instanceof fh.b) {
                fh.b bVar = (fh.b) aVar;
                Bitmap bitmap = bVar.d;
                Bitmap bitmap2 = (Bitmap) this.f4697w.get();
                Paint paint = this.f4694s;
                if (bitmap != bitmap2) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f4698x = bitmapShader;
                        paint.setShader(bitmapShader);
                    } else {
                        this.f4698x = null;
                        paint.setShader(null);
                    }
                }
                if (Color.alpha(this.d) > 0) {
                    NinePatchDrawable a2 = a(0, false);
                    int i11 = rect2.left;
                    Rect rect3 = this.B;
                    a2.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                    a2.setAlpha(this.f4687l);
                    a2.draw(canvas);
                }
                if (this.f4698x != null && bitmap != null && !bitmap.isRecycled() && this.f4687l > 0) {
                    Matrix matrix = bVar.f9928b;
                    Matrix matrix2 = this.v;
                    matrix2.set(matrix);
                    matrix2.postTranslate(-this.f4678a, -this.f4679b);
                    this.f4698x.setLocalMatrix(matrix2);
                    paint.setAlpha(this.f4687l);
                    cVar.b(canvas, paint);
                }
                int m12 = i6.m1(this.f4687l / 255.0f, this.f4681e);
                if (Color.alpha(m12) > 0) {
                    Paint paint2 = this.f4695t;
                    paint2.setColor(m12);
                    cVar.b(canvas, paint2);
                }
                g(canvas);
            } else if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof fh.d)) {
                fh.d dVar = (fh.d) aVar;
                if (!canvas.isHardwareAccelerated()) {
                    c(canvas, dVar.f9934a);
                }
            } else if (aVar instanceof fh.e) {
                c(canvas, ((fh.e) aVar).f9942a);
            } else if (aVar != null && (i10 = this.f4687l) != 0) {
                int m13 = i6.m1(i10 / 255.0f, this.f4681e);
                if (Color.alpha(this.d) > 0 && this.f4687l == 255) {
                    float f7 = this.f4691p;
                    if (f7 > 0.0f) {
                        float f10 = this.f4689n;
                        float f11 = this.f4690o;
                        int m14 = i6.m1(f7, this.d);
                        Paint paint3 = this.f4696u;
                        paint3.setShadowLayer(f10, 0.0f, f11, m14);
                        cVar.c(canvas, paint3, this.f4688m);
                    }
                }
                float f12 = this.f4678a;
                float f13 = this.f4679b;
                float f14 = rect2.left;
                float f15 = f14 + f12;
                float f16 = rect2.top;
                float f17 = f16 + f13;
                float f18 = rect2.right;
                float f19 = f18 + f12;
                float f20 = rect2.bottom;
                float f21 = f20 + f13;
                int i12 = this.f4687l;
                if (i12 != 255) {
                    z10 = true;
                }
                boolean z11 = z10;
                if (z11) {
                    canvas.saveLayerAlpha(f14, f16, f18, f20, i12);
                }
                canvas.save();
                canvas.clipPath(cVar.f4673k);
                canvas.translate(rect2.left, rect2.top);
                canvas.translate(-f15, -f17);
                aVar.v(canvas, f15, f17, f19, f21);
                canvas.restore();
                if (Color.alpha(m13) > 0) {
                    Paint paint4 = this.f4692q;
                    paint4.setColor(m13);
                    cVar.b(canvas, paint4);
                }
                g(canvas);
                if (z11) {
                    canvas.restore();
                }
            }
        }
    }

    public final void d(Canvas canvas, int i10) {
        int h = i0.a.h(this.f4681e, i10);
        if (Color.alpha(h) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable a2 = a(h, true);
        Rect rect = this.f4685j.f4675m;
        int i11 = rect.left;
        Rect rect2 = this.B;
        a2.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.f4687l);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int m12 = i6.m1(this.f4687l / 255.0f, this.f4682f);
        int m13 = i6.m1(this.f4687l / 255.0f, this.f4683g);
        int alpha = Color.alpha(m12);
        c cVar = this.f4685j;
        Paint paint = this.f4693r;
        if (alpha > 0) {
            paint.setColor(m12);
            canvas.drawPath(cVar.f4676n, paint);
        }
        if (Color.alpha(m13) > 0) {
            paint.setColor(m13);
            canvas.drawPath(cVar.f4677o, paint);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f4687l;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        c cVar = this.f4685j;
        h(outline, cVar.f4675m, cVar.f4666b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        c cVar = this.f4685j;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.f4668e;
    }

    public abstract fh.a i();

    public boolean j() {
        return false;
    }

    public void k() {
        b();
    }

    public void l() {
        b();
    }

    public final void o(dh.a aVar) {
        this.f4680c = aVar;
        v();
        if (aVar instanceof dh.e) {
            dh.e eVar = (dh.e) aVar;
            float f7 = eVar.f8367f;
            float f10 = eVar.h;
            c cVar = this.f4685j;
            cVar.f4671i = f7;
            cVar.f4672j = f10;
            float f11 = eVar.f8368n;
            float f12 = eVar.f8369r;
            this.f4689n = f11;
            this.f4690o = f12;
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c cVar = this.f4685j;
        cVar.f4665a.set(rect);
        cVar.a();
        k();
    }

    public final void p(int i10) {
        c cVar = this.f4685j;
        if (cVar.d != i10) {
            cVar.d = i10;
            cVar.a();
            k();
        }
    }

    public final void q(float f7) {
        c cVar = this.f4685j;
        Arrays.fill(cVar.f4666b, f7);
        Arrays.fill(cVar.f4667c, f7);
        cVar.a();
        k();
    }

    public final void r(float f7, float f10, float f11, float f12) {
        c cVar = this.f4685j;
        float[] fArr = cVar.f4666b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[7] = f12;
        fArr[6] = f12;
        cVar.a();
        k();
    }

    public final void s(float f7, float f10, float f11, float f12) {
        c cVar = this.f4685j;
        float[] fArr = cVar.f4666b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.f4667c;
        fArr2[1] = f7;
        fArr2[0] = f7;
        fArr2[3] = f10;
        fArr2[2] = f10;
        fArr2[5] = f11;
        fArr2[4] = f11;
        fArr2[7] = f12;
        fArr2[6] = f12;
        cVar.a();
        k();
    }

    @Override
    public void setAlpha(int i10) {
        this.f4687l = i10;
    }

    public final void t(float f7, float f10) {
        if (this.f4678a == f7 && this.f4679b == f10) {
            return;
        }
        this.f4678a = f7;
        this.f4679b = f10;
        l();
    }

    public final void u(int i10) {
        this.f4685j.f4669f = i10;
        k();
    }

    public void v() {
        dh.a aVar = this.f4680c;
        if (aVar == null) {
            return;
        }
        this.f4681e = aVar.x();
        this.d = this.f4680c.q();
        this.f4682f = this.f4680c.d();
        this.f4683g = this.f4680c.m();
    }

    public void m() {
    }

    public d n() {
        return this;
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public void w() {
    }
}

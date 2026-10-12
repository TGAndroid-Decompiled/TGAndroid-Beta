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
import org.telegram.ui.ActionBar.h6;
import v7.r7;
import w7.n;
import yf.e0;
public abstract class d extends Drawable {
    public static final float[] E = new float[8];
    public static Path F = new Path();
    public final ah.a A;
    public final Rect B;
    public NinePatchDrawable C;
    public long D;
    public float f4676a;
    public float f4677b;
    public dh.a f4678c;
    public int d;
    public int f4679e;
    public int f4680f;
    public int f4681g;
    public int h;
    public int f4682i;
    public final c f4683j;
    public b f4684k;
    public int f4685l;
    public boolean f4686m;
    public float f4687n;
    public float f4688o;
    public float f4689p;
    public final Paint f4690q;
    public final Paint f4691r;
    public final Paint f4692s;
    public final Paint f4693t;
    public final Paint f4694u;
    public final Matrix v;
    public final WeakReference f4695w;
    public BitmapShader f4696x;
    public final RectF f4697y;
    public final RectF f4698z;

    public d() {
        c cVar = new c();
        this.f4683j = cVar;
        this.f4685l = 255;
        this.f4689p = 1.0f;
        this.f4690q = new Paint(1);
        this.f4691r = new Paint(1);
        Paint paint = new Paint(1);
        this.f4692s = paint;
        this.f4693t = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f4694u = paint2;
        this.v = new Matrix();
        this.f4695w = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.f4697y = new RectF();
        this.f4698z = new RectF();
        this.A = new Object();
        this.B = new Rect();
        cVar.f4669i = AndroidUtilities.dpf2(1.0f);
        cVar.f4670j = AndroidUtilities.dpf2(0.6666667f);
        this.f4687n = AndroidUtilities.dpf2(1.0f);
        this.f4688o = AndroidUtilities.dpf2(0.33333334f);
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
            if (canvas.clipRect(f16, f12, f17, n.a((2.0f * f7) + f12, f12, f14))) {
                canvas.drawRoundRect(f16, f12 + f15, f17, f14 + f15, f7, f7, paint);
            }
        } else {
            float f18 = f11 - f15;
            float f19 = f13 + f15;
            if (canvas.clipRect(f18, n.a(f14 - (2.0f * f7), f12, f14), f19, f14)) {
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
        aVar.f539b = 0L;
        aVar.f538a = false;
        aVar.a(i10);
        aVar.a(this.d);
        c cVar = this.f4683j;
        for (float f7 : cVar.f4664b) {
            aVar.c(f7);
        }
        aVar.c(this.f4687n);
        aVar.c(0.0f);
        aVar.c(this.f4688o);
        aVar.b(z10);
        if (z10) {
            aVar.a(this.f4680f);
            aVar.a(this.f4681g);
            aVar.c(cVar.f4669i);
            aVar.c(cVar.f4670j);
        }
        if (aVar.f538a) {
            j3 = -1;
        } else {
            j3 = aVar.f539b;
        }
        if (this.C == null || this.D != j3) {
            this.D = j3;
            if (Color.alpha(i10) == 255) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            NinePatchDrawable b10 = r7.b(null, cVar.f4664b, this.f4687n, this.f4688o, i11, new a(i10, this, z10));
            this.C = b10;
            b10.getPadding(this.B);
        }
        return this.C;
    }

    public final void b() {
        Rect rect = this.f4683j.f4673m;
        RectF rectF = this.f4697y;
        rectF.set(rect);
        rectF.offset(this.f4676a, this.f4677b);
        RectF rectF2 = this.f4698z;
        if (!rectF.equals(rectF2)) {
            rectF2.set(rectF);
            m();
        }
    }

    public final void c(Canvas canvas, fh.a aVar) {
        int i10;
        c cVar = this.f4683j;
        Rect rect = cVar.f4673m;
        Rect rect2 = cVar.f4673m;
        if (!rect.isEmpty()) {
            boolean z10 = false;
            if (Color.alpha(this.f4679e) == 255) {
                d(canvas, 0);
            } else if (aVar instanceof fh.c) {
                d(canvas, ((fh.c) aVar).f9931a.getColor());
            } else if (aVar instanceof fh.b) {
                fh.b bVar = (fh.b) aVar;
                Bitmap bitmap = bVar.d;
                Bitmap bitmap2 = (Bitmap) this.f4695w.get();
                Paint paint = this.f4692s;
                if (bitmap != bitmap2) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f4696x = bitmapShader;
                        paint.setShader(bitmapShader);
                    } else {
                        this.f4696x = null;
                        paint.setShader(null);
                    }
                }
                if (Color.alpha(this.d) > 0) {
                    NinePatchDrawable a2 = a(0, false);
                    int i11 = rect2.left;
                    Rect rect3 = this.B;
                    a2.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                    a2.setAlpha(this.f4685l);
                    a2.draw(canvas);
                }
                if (this.f4696x != null && bitmap != null && !bitmap.isRecycled() && this.f4685l > 0) {
                    Matrix matrix = bVar.f9926b;
                    Matrix matrix2 = this.v;
                    matrix2.set(matrix);
                    matrix2.postTranslate(-this.f4676a, -this.f4677b);
                    this.f4696x.setLocalMatrix(matrix2);
                    paint.setAlpha(this.f4685l);
                    cVar.b(canvas, paint);
                }
                int m12 = h6.m1(this.f4685l / 255.0f, this.f4679e);
                if (Color.alpha(m12) > 0) {
                    Paint paint2 = this.f4693t;
                    paint2.setColor(m12);
                    cVar.b(canvas, paint2);
                }
                g(canvas);
            } else if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof fh.d)) {
                fh.d dVar = (fh.d) aVar;
                if (!canvas.isHardwareAccelerated()) {
                    c(canvas, dVar.f9932a);
                }
            } else if (aVar instanceof fh.e) {
                c(canvas, ((fh.e) aVar).f9940a);
            } else if (aVar != null && (i10 = this.f4685l) != 0) {
                int m13 = h6.m1(i10 / 255.0f, this.f4679e);
                if (Color.alpha(this.d) > 0 && this.f4685l == 255) {
                    float f7 = this.f4689p;
                    if (f7 > 0.0f) {
                        float f10 = this.f4687n;
                        float f11 = this.f4688o;
                        int m14 = h6.m1(f7, this.d);
                        Paint paint3 = this.f4694u;
                        paint3.setShadowLayer(f10, 0.0f, f11, m14);
                        cVar.c(canvas, paint3, this.f4686m);
                    }
                }
                float f12 = this.f4676a;
                float f13 = this.f4677b;
                float f14 = rect2.left;
                float f15 = f14 + f12;
                float f16 = rect2.top;
                float f17 = f16 + f13;
                float f18 = rect2.right;
                float f19 = f18 + f12;
                float f20 = rect2.bottom;
                float f21 = f20 + f13;
                int i12 = this.f4685l;
                if (i12 != 255) {
                    z10 = true;
                }
                boolean z11 = z10;
                if (z11) {
                    canvas.saveLayerAlpha(f14, f16, f18, f20, i12);
                }
                canvas.save();
                canvas.clipPath(cVar.f4671k);
                canvas.translate(rect2.left, rect2.top);
                canvas.translate(-f15, -f17);
                aVar.v(canvas, f15, f17, f19, f21);
                canvas.restore();
                if (Color.alpha(m13) > 0) {
                    Paint paint4 = this.f4690q;
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
        int h = i0.a.h(this.f4679e, i10);
        if (Color.alpha(h) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable a2 = a(h, true);
        Rect rect = this.f4683j.f4673m;
        int i11 = rect.left;
        Rect rect2 = this.B;
        a2.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.f4685l);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int m12 = h6.m1(this.f4685l / 255.0f, this.f4680f);
        int m13 = h6.m1(this.f4685l / 255.0f, this.f4681g);
        int alpha = Color.alpha(m12);
        c cVar = this.f4683j;
        Paint paint = this.f4691r;
        if (alpha > 0) {
            paint.setColor(m12);
            canvas.drawPath(cVar.f4674n, paint);
        }
        if (Color.alpha(m13) > 0) {
            paint.setColor(m13);
            canvas.drawPath(cVar.f4675o, paint);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f4685l;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        c cVar = this.f4683j;
        h(outline, cVar.f4673m, cVar.f4664b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        c cVar = this.f4683j;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.f4666e;
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
        this.f4678c = aVar;
        v();
        if (aVar instanceof dh.e) {
            dh.e eVar = (dh.e) aVar;
            float f7 = eVar.f8364f;
            float f10 = eVar.h;
            c cVar = this.f4683j;
            cVar.f4669i = f7;
            cVar.f4670j = f10;
            float f11 = eVar.f8365n;
            float f12 = eVar.f8366r;
            this.f4687n = f11;
            this.f4688o = f12;
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c cVar = this.f4683j;
        cVar.f4663a.set(rect);
        cVar.a();
        k();
    }

    public final void p(int i10) {
        c cVar = this.f4683j;
        if (cVar.d != i10) {
            cVar.d = i10;
            cVar.a();
            k();
        }
    }

    public final void q(float f7) {
        c cVar = this.f4683j;
        Arrays.fill(cVar.f4664b, f7);
        Arrays.fill(cVar.f4665c, f7);
        cVar.a();
        k();
    }

    public final void r(float f7, float f10, float f11, float f12) {
        c cVar = this.f4683j;
        float[] fArr = cVar.f4664b;
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
        c cVar = this.f4683j;
        float[] fArr = cVar.f4664b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.f4665c;
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
        this.f4685l = i10;
    }

    public final void t(float f7, float f10) {
        if (this.f4676a == f7 && this.f4677b == f10) {
            return;
        }
        this.f4676a = f7;
        this.f4677b = f10;
        l();
    }

    public final void u(int i10) {
        this.f4683j.f4667f = i10;
        k();
    }

    public void v() {
        dh.a aVar = this.f4678c;
        if (aVar == null) {
            return;
        }
        this.f4679e = aVar.C();
        this.d = this.f4678c.v();
        this.f4680f = this.f4678c.b();
        this.f4681g = this.f4678c.d();
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

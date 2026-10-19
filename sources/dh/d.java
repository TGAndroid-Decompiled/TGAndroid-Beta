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
import org.telegram.ui.ActionBar.h6;
import v7.v7;
import w7.r;
import zf.f0;
public abstract class d extends Drawable {
    public static final float[] E = new float[8];
    public static Path F = new Path();
    public final bh.a A;
    public final Rect B;
    public NinePatchDrawable C;
    public long D;
    public float f8010a;
    public float f8011b;
    public eh.a f8012c;
    public int d;
    public int e;
    public int f8013f;
    public int f8014g;
    public int h;
    public int f8015i;
    public final c f8016j;
    public b f8017k;
    public int f8018l;
    public boolean f8019m;
    public float f8020n;
    public float f8021o;
    public float f8022p;
    public final Paint f8023q;
    public final Paint f8024r;
    public final Paint f8025s;
    public final Paint f8026t;
    public final Paint f8027u;
    public final Matrix v;
    public final WeakReference f8028w;
    public BitmapShader f8029x;
    public final RectF f8030y;
    public final RectF f8031z;

    public d() {
        c cVar = new c();
        this.f8016j = cVar;
        this.f8018l = 255;
        this.f8022p = 1.0f;
        this.f8023q = new Paint(1);
        this.f8024r = new Paint(1);
        Paint paint = new Paint(1);
        this.f8025s = paint;
        this.f8026t = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f8027u = paint2;
        this.v = new Matrix();
        this.f8028w = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.f8030y = new RectF();
        this.f8031z = new RectF();
        this.A = new Object();
        this.B = new Rect();
        cVar.f8003i = AndroidUtilities.dpf2(1.0f);
        cVar.f8004j = AndroidUtilities.dpf2(0.6666667f);
        this.f8020n = AndroidUtilities.dpf2(1.0f);
        this.f8021o = AndroidUtilities.dpf2(0.33333334f);
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
            if (canvas.clipRect(f16, f12, f17, r.a((2.0f * f7) + f12, f12, f14))) {
                canvas.drawRoundRect(f16, f12 + f15, f17, f14 + f15, f7, f7, paint);
            }
        } else {
            float f18 = f11 - f15;
            float f19 = f13 + f15;
            if (canvas.clipRect(f18, r.a(f14 - (2.0f * f7), f12, f14), f19, f14)) {
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
        long j10;
        int i11;
        bh.a aVar = this.A;
        aVar.f4356b = 0L;
        aVar.f4355a = false;
        aVar.a(i10);
        aVar.a(this.d);
        c cVar = this.f8016j;
        for (float f7 : cVar.f7999b) {
            aVar.c(f7);
        }
        aVar.c(this.f8020n);
        aVar.c(0.0f);
        aVar.c(this.f8021o);
        aVar.b(z10);
        if (z10) {
            aVar.a(this.f8013f);
            aVar.a(this.f8014g);
            aVar.c(cVar.f8003i);
            aVar.c(cVar.f8004j);
        }
        if (aVar.f4355a) {
            j10 = -1;
        } else {
            j10 = aVar.f4356b;
        }
        if (this.C == null || this.D != j10) {
            this.D = j10;
            if (Color.alpha(i10) == 255) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            NinePatchDrawable b10 = v7.b(null, cVar.f7999b, this.f8020n, this.f8021o, i11, new a(i10, this, z10));
            this.C = b10;
            b10.getPadding(this.B);
        }
        return this.C;
    }

    public final void b() {
        Rect rect = this.f8016j.f8007m;
        RectF rectF = this.f8030y;
        rectF.set(rect);
        rectF.offset(this.f8010a, this.f8011b);
        RectF rectF2 = this.f8031z;
        if (!rectF.equals(rectF2)) {
            rectF2.set(rectF);
            m();
        }
    }

    public final void c(Canvas canvas, gh.a aVar) {
        int i10;
        c cVar = this.f8016j;
        Rect rect = cVar.f8007m;
        Rect rect2 = cVar.f8007m;
        if (!rect.isEmpty()) {
            boolean z10 = false;
            if (Color.alpha(this.e) == 255) {
                d(canvas, 0);
            } else if (aVar instanceof gh.c) {
                d(canvas, ((gh.c) aVar).f11057a.getColor());
            } else if (aVar instanceof gh.b) {
                gh.b bVar = (gh.b) aVar;
                Bitmap bitmap = bVar.d;
                Bitmap bitmap2 = (Bitmap) this.f8028w.get();
                Paint paint = this.f8025s;
                if (bitmap != bitmap2) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f8029x = bitmapShader;
                        paint.setShader(bitmapShader);
                    } else {
                        this.f8029x = null;
                        paint.setShader(null);
                    }
                }
                if (Color.alpha(this.d) > 0) {
                    NinePatchDrawable a2 = a(0, false);
                    int i11 = rect2.left;
                    Rect rect3 = this.B;
                    a2.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                    a2.setAlpha(this.f8018l);
                    a2.draw(canvas);
                }
                if (this.f8029x != null && bitmap != null && !bitmap.isRecycled() && this.f8018l > 0) {
                    Matrix matrix = bVar.f11053b;
                    Matrix matrix2 = this.v;
                    matrix2.set(matrix);
                    matrix2.postTranslate(-this.f8010a, -this.f8011b);
                    this.f8029x.setLocalMatrix(matrix2);
                    paint.setAlpha(this.f8018l);
                    cVar.b(canvas, paint);
                }
                int m12 = h6.m1(this.f8018l / 255.0f, this.e);
                if (Color.alpha(m12) > 0) {
                    Paint paint2 = this.f8026t;
                    paint2.setColor(m12);
                    cVar.b(canvas, paint2);
                }
                g(canvas);
            } else if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof gh.d)) {
                gh.d dVar = (gh.d) aVar;
                if (!canvas.isHardwareAccelerated()) {
                    c(canvas, dVar.f11058a);
                }
            } else if (aVar instanceof gh.e) {
                c(canvas, ((gh.e) aVar).f11065a);
            } else if (aVar != null && (i10 = this.f8018l) != 0) {
                int m13 = h6.m1(i10 / 255.0f, this.e);
                if (Color.alpha(this.d) > 0 && this.f8018l == 255) {
                    float f7 = this.f8022p;
                    if (f7 > 0.0f) {
                        float f10 = this.f8020n;
                        float f11 = this.f8021o;
                        int m14 = h6.m1(f7, this.d);
                        Paint paint3 = this.f8027u;
                        paint3.setShadowLayer(f10, 0.0f, f11, m14);
                        cVar.c(canvas, paint3, this.f8019m);
                    }
                }
                float f12 = this.f8010a;
                float f13 = this.f8011b;
                float f14 = rect2.left;
                float f15 = f14 + f12;
                float f16 = rect2.top;
                float f17 = f16 + f13;
                float f18 = rect2.right;
                float f19 = f18 + f12;
                float f20 = rect2.bottom;
                float f21 = f20 + f13;
                int i12 = this.f8018l;
                if (i12 != 255) {
                    z10 = true;
                }
                boolean z11 = z10;
                if (z11) {
                    canvas.saveLayerAlpha(f14, f16, f18, f20, i12);
                }
                canvas.save();
                canvas.clipPath(cVar.f8005k);
                canvas.translate(rect2.left, rect2.top);
                canvas.translate(-f15, -f17);
                aVar.y(canvas, f15, f17, f19, f21);
                canvas.restore();
                if (Color.alpha(m13) > 0) {
                    Paint paint4 = this.f8023q;
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
        int k10 = i0.a.k(this.e, i10);
        if (Color.alpha(k10) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable a2 = a(k10, true);
        Rect rect = this.f8016j.f8007m;
        int i11 = rect.left;
        Rect rect2 = this.B;
        a2.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.f8018l);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int m12 = h6.m1(this.f8018l / 255.0f, this.f8013f);
        int m13 = h6.m1(this.f8018l / 255.0f, this.f8014g);
        int alpha = Color.alpha(m12);
        c cVar = this.f8016j;
        Paint paint = this.f8024r;
        if (alpha > 0) {
            paint.setColor(m12);
            canvas.drawPath(cVar.f8008n, paint);
        }
        if (Color.alpha(m13) > 0) {
            paint.setColor(m13);
            canvas.drawPath(cVar.f8009o, paint);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f8018l;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        c cVar = this.f8016j;
        h(outline, cVar.f8007m, cVar.f7999b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        c cVar = this.f8016j;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.e;
    }

    public abstract gh.a i();

    public boolean j() {
        return false;
    }

    public void k() {
        b();
    }

    public void l() {
        b();
    }

    public final void o(eh.a aVar) {
        this.f8012c = aVar;
        v();
        if (aVar instanceof eh.e) {
            eh.e eVar = (eh.e) aVar;
            float f7 = eVar.f8662f;
            float f10 = eVar.h;
            c cVar = this.f8016j;
            cVar.f8003i = f7;
            cVar.f8004j = f10;
            float f11 = eVar.f8663n;
            float f12 = eVar.f8664r;
            this.f8020n = f11;
            this.f8021o = f12;
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c cVar = this.f8016j;
        cVar.f7998a.set(rect);
        cVar.a();
        k();
    }

    public final void p(int i10) {
        c cVar = this.f8016j;
        if (cVar.d != i10) {
            cVar.d = i10;
            cVar.a();
            k();
        }
    }

    public final void q(float f7) {
        c cVar = this.f8016j;
        Arrays.fill(cVar.f7999b, f7);
        Arrays.fill(cVar.f8000c, f7);
        cVar.a();
        k();
    }

    public final void r(float f7, float f10, float f11, float f12) {
        c cVar = this.f8016j;
        float[] fArr = cVar.f7999b;
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
        c cVar = this.f8016j;
        float[] fArr = cVar.f7999b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.f8000c;
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
        this.f8018l = i10;
    }

    public final void t(float f7, float f10) {
        if (this.f8010a == f7 && this.f8011b == f10) {
            return;
        }
        this.f8010a = f7;
        this.f8011b = f10;
        l();
    }

    public final void u(int i10) {
        this.f8016j.f8001f = i10;
        k();
    }

    public void v() {
        eh.a aVar = this.f8012c;
        if (aVar == null) {
            return;
        }
        this.e = aVar.a0();
        this.d = this.f8012c.E();
        this.f8013f = this.f8012c.h();
        this.f8014g = this.f8012c.u();
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

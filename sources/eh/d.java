package eh;

import a8.ee;
import a8.w0;
import a8.yc;
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
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.y6;
public abstract class d extends oi.e implements p6 {
    public static final float[] W = new float[8];
    public static Path X = new Path();
    public boolean E;
    public float F;
    public float G;
    public float H;
    public final Paint I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public final Paint M;
    public final Matrix N;
    public final WeakReference O;
    public BitmapShader P;
    public final RectF Q;
    public final RectF R;
    public final ch.a S;
    public final Rect T;
    public NinePatchDrawable U;
    public long V;
    public fh.a e;
    public int f9961f;
    public int h;
    public int f9962n;
    public int f9963r;
    public int f9964s;
    public int v;
    public int f9965w = f7.f22626b;
    public final c f9966x;
    public b f9967y;

    public d() {
        c cVar = new c();
        this.f9966x = cVar;
        this.H = 1.0f;
        this.I = new Paint(1);
        this.J = new Paint(1);
        Paint paint = new Paint(1);
        this.K = paint;
        this.L = new Paint(1);
        Paint paint2 = new Paint(1);
        this.M = paint2;
        this.N = new Matrix();
        this.O = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.Q = new RectF();
        this.R = new RectF();
        this.S = new Object();
        this.T = new Rect();
        cVar.f9954i = AndroidUtilities.dpf2(1.0f);
        cVar.f9955j = AndroidUtilities.dpf2(0.6666667f);
        this.F = AndroidUtilities.dpf2(1.0f);
        this.G = AndroidUtilities.dpf2(0.33333334f);
    }

    public static void o(android.graphics.Canvas r17, float r18, float r19, float[] r20, float r21, boolean r22, android.graphics.Paint r23) {
        throw new UnsupportedOperationException("Method not decompiled: eh.d.o(android.graphics.Canvas, float, float, float[], float, boolean, android.graphics.Paint):void");
    }

    public static void p(Canvas canvas, RectF rectF, float f7, float f10, boolean z10, Paint paint) {
        float f11 = rectF.left;
        float f12 = rectF.top;
        float f13 = rectF.right;
        float f14 = rectF.bottom;
        float f15 = f10 / 2.0f;
        canvas.save();
        if (z10) {
            float f16 = f11 - f15;
            float f17 = f13 + f15;
            if (canvas.clipRect(f16, f12, f17, ee.a((2.0f * f7) + f12, f12, f14))) {
                canvas.drawRoundRect(f16, f12 + f15, f17, f14 + f15, f7, f7, paint);
            }
        } else {
            float f18 = f11 - f15;
            float f19 = f13 + f15;
            if (canvas.clipRect(f18, ee.a(f14 - (2.0f * f7), f12, f14), f19, f14)) {
                canvas.drawRoundRect(f18, f12 - f15, f19, f14 - f15, f7, f7, paint);
            }
        }
        canvas.restore();
    }

    public static void r(Outline outline, Rect rect, float[] fArr) {
        if (w0.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = X;
        if (path == null) {
            X = new Path();
        } else {
            path.rewind();
        }
        X.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(X);
    }

    public final void A(int i10) {
        this.f9966x.f9952f = i10;
        t();
    }

    @Override
    public final void b(Rect rect) {
        rect.set(this.f9966x.f9958m);
    }

    @Override
    public final int c() {
        return this.f9964s;
    }

    @Override
    public final int d() {
        return this.v;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        c cVar = this.f9966x;
        r(outline, cVar.f9958m, cVar.f9950b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        c cVar = this.f9966x;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.e;
    }

    @Override
    public void h() {
        l();
    }

    @Override
    public boolean j() {
        return this instanceof e;
    }

    public final NinePatchDrawable k(int i10, boolean z10) {
        long j10;
        int i11;
        ch.a aVar = this.S;
        aVar.f6297b = 0L;
        aVar.f6296a = false;
        aVar.a(i10);
        aVar.a(this.f9961f);
        c cVar = this.f9966x;
        for (float f7 : cVar.f9950b) {
            aVar.c(f7);
        }
        aVar.c(this.F);
        aVar.c(0.0f);
        aVar.c(this.G);
        aVar.b(z10);
        if (z10) {
            aVar.a(this.f9962n);
            aVar.a(this.f9963r);
            aVar.c(cVar.f9954i);
            aVar.c(cVar.f9955j);
        }
        if (aVar.f6296a) {
            j10 = -1;
        } else {
            j10 = aVar.f6297b;
        }
        if (this.U == null || this.V != j10) {
            this.V = j10;
            if (Color.alpha(i10) == 255) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            NinePatchDrawable b10 = yc.b(null, cVar.f9950b, this.F, this.G, i11, new a(i10, this, z10));
            this.U = b10;
            b10.getPadding(this.T);
        }
        return this.U;
    }

    public final void l() {
        Rect rect = this.f9966x.f9958m;
        RectF rectF = this.Q;
        rectF.set(rect);
        rectF.offset(this.f19462c, this.d);
        RectF rectF2 = this.R;
        if (!rectF.equals(rectF2)) {
            rectF2.set(rectF);
        }
    }

    public final void m(Canvas canvas, hh.a aVar) {
        int i10;
        c cVar = this.f9966x;
        Rect rect = cVar.f9958m;
        Rect rect2 = cVar.f9958m;
        if (!rect.isEmpty()) {
            boolean z10 = false;
            if (Color.alpha(this.h) == 255) {
                n(canvas, 0);
            } else if (aVar instanceof hh.c) {
                n(canvas, ((hh.c) aVar).f12837b);
            } else if (aVar instanceof hh.b) {
                hh.b bVar = (hh.b) aVar;
                int i11 = this.f19461b;
                Bitmap bitmap = bVar.d;
                Bitmap bitmap2 = (Bitmap) this.O.get();
                Paint paint = this.K;
                if (bitmap != bitmap2) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.P = bitmapShader;
                        paint.setShader(bitmapShader);
                    } else {
                        this.P = null;
                        paint.setShader(null);
                    }
                }
                if (Color.alpha(this.f9961f) > 0) {
                    NinePatchDrawable k10 = k(0, false);
                    int i12 = rect2.left;
                    Rect rect3 = this.T;
                    k10.setBounds(i12 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                    k10.setAlpha(i11);
                    k10.draw(canvas);
                }
                if (this.P != null && bitmap != null && !bitmap.isRecycled() && i11 > 0) {
                    Matrix matrix = bVar.f12832b;
                    Matrix matrix2 = this.N;
                    matrix2.set(matrix);
                    matrix2.postTranslate(-this.f19462c, -this.d);
                    this.P.setLocalMatrix(matrix2);
                    paint.setAlpha(i11);
                    cVar.b(canvas, paint);
                }
                int o12 = y6.o1(i11 / 255.0f, this.h);
                if (Color.alpha(o12) > 0) {
                    Paint paint2 = this.L;
                    paint2.setColor(o12);
                    cVar.b(canvas, paint2);
                }
                q(canvas);
            } else if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof hh.d)) {
                hh.d dVar = (hh.d) aVar;
                if (!canvas.isHardwareAccelerated()) {
                    m(canvas, dVar.f12838a);
                }
            } else if (aVar instanceof hh.e) {
                m(canvas, ((hh.e) aVar).f12845a);
            } else if (aVar != null && (i10 = this.f19461b) != 0) {
                int o13 = y6.o1(i10 / 255.0f, this.h);
                if (Color.alpha(this.f9961f) > 0 && i10 == 255) {
                    float f7 = this.H;
                    if (f7 > 0.0f) {
                        float f10 = this.F;
                        float f11 = this.G;
                        int o14 = y6.o1(f7, this.f9961f);
                        Paint paint3 = this.M;
                        paint3.setShadowLayer(f10, 0.0f, f11, o14);
                        cVar.c(canvas, paint3, this.E);
                    }
                }
                float f12 = this.f19462c;
                float f13 = this.d;
                float f14 = rect2.left;
                float f15 = f14 + f12;
                float f16 = rect2.top;
                float f17 = f16 + f13;
                float f18 = rect2.right;
                float f19 = f18 + f12;
                float f20 = rect2.bottom;
                float f21 = f20 + f13;
                if (i10 != 255) {
                    z10 = true;
                }
                boolean z11 = z10;
                if (z11) {
                    canvas.saveLayerAlpha(f14, f16, f18, f20, i10);
                }
                canvas.save();
                canvas.clipPath(cVar.f9956k);
                canvas.translate(rect2.left, rect2.top);
                canvas.translate(-f15, -f17);
                aVar.w(canvas, f15, f17, f19, f21);
                canvas.restore();
                if (Color.alpha(o13) > 0) {
                    Paint paint4 = this.I;
                    paint4.setColor(o13);
                    cVar.b(canvas, paint4);
                }
                q(canvas);
                if (z11) {
                    canvas.restore();
                }
            }
        }
    }

    public final void n(Canvas canvas, int i10) {
        int i11 = this.f19461b;
        int k10 = i0.a.k(this.h, i10);
        if (Color.alpha(k10) == 0 && Color.alpha(this.f9961f) == 0) {
            return;
        }
        NinePatchDrawable k11 = k(k10, true);
        Rect rect = this.f9966x.f9958m;
        int i12 = rect.left;
        Rect rect2 = this.T;
        k11.setBounds(i12 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        k11.setAlpha(i11);
        k11.draw(canvas);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c cVar = this.f9966x;
        cVar.f9949a.set(rect);
        cVar.a();
        t();
    }

    public final void q(Canvas canvas) {
        float f7 = this.f19461b / 255.0f;
        int o12 = y6.o1(f7, this.f9962n);
        int o13 = y6.o1(f7, this.f9963r);
        int alpha = Color.alpha(o12);
        c cVar = this.f9966x;
        Paint paint = this.J;
        if (alpha > 0) {
            paint.setColor(o12);
            canvas.drawPath(cVar.f9959n, paint);
        }
        if (Color.alpha(o13) > 0) {
            paint.setColor(o13);
            canvas.drawPath(cVar.f9960o, paint);
        }
    }

    public abstract hh.a s();

    public void t() {
        l();
    }

    @Override
    public void updateColors() {
        this.f9965w = f7.f22626b;
        fh.a aVar = this.e;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof fh.b) {
            ((fh.b) aVar).c();
        }
        this.h = this.e.v0();
        this.f9961f = this.e.f0();
        this.f9962n = this.e.t();
        this.f9963r = this.e.A();
    }

    public final void v(fh.a aVar) {
        this.e = aVar;
        updateColors();
        if (aVar instanceof fh.e) {
            fh.e eVar = (fh.e) aVar;
            float f7 = eVar.f10484f;
            float f10 = eVar.h;
            c cVar = this.f9966x;
            cVar.f9954i = f7;
            cVar.f9955j = f10;
            float f11 = eVar.f10485n;
            float f12 = eVar.f10486r;
            this.F = f11;
            this.G = f12;
        }
    }

    public final void w(int i10) {
        c cVar = this.f9966x;
        if (cVar.d != i10) {
            cVar.d = i10;
            cVar.a();
            t();
        }
    }

    public final void x(float f7) {
        c cVar = this.f9966x;
        Arrays.fill(cVar.f9950b, f7);
        Arrays.fill(cVar.f9951c, f7);
        cVar.a();
        t();
    }

    public final void y(float f7, float f10, float f11, float f12) {
        c cVar = this.f9966x;
        float[] fArr = cVar.f9950b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[7] = f12;
        fArr[6] = f12;
        cVar.a();
        t();
    }

    public final void z(float f7, float f10, float f11, float f12) {
        c cVar = this.f9966x;
        float[] fArr = cVar.f9950b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.f9951c;
        fArr2[1] = f7;
        fArr2[0] = f7;
        fArr2[3] = f10;
        fArr2[2] = f10;
        fArr2[5] = f11;
        fArr2[4] = f11;
        fArr2[7] = f12;
        fArr2[6] = f12;
        cVar.a();
        t();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override
    public void a() {
    }

    public d u() {
        return this;
    }
}

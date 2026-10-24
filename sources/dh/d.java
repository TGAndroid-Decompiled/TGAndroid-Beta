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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import v7.v7;
import w7.r;
import zf.f0;
public abstract class d extends Drawable implements b6 {
    public static final float[] V = new float[8];
    public static Path W = new Path();
    public float E;
    public float F;
    public float G;
    public final Paint H;
    public final Paint I;
    public final Paint J;
    public final Paint K;
    public final Paint L;
    public final Matrix M;
    public final WeakReference N;
    public BitmapShader O;
    public final RectF P;
    public final RectF Q;
    public final bh.a R;
    public final Rect S;
    public NinePatchDrawable T;
    public long U;
    public float f8020a;
    public float f8021b;
    public eh.a f8022c;
    public int d;
    public int e;
    public int f8023f;
    public int h;
    public int f8024n;
    public int f8025r;
    public int f8026s = r6.f21818b;
    public final c v;
    public b f8027w;
    public int f8028x;
    public boolean f8029y;

    public d() {
        c cVar = new c();
        this.v = cVar;
        this.f8028x = 255;
        this.G = 1.0f;
        this.H = new Paint(1);
        this.I = new Paint(1);
        Paint paint = new Paint(1);
        this.J = paint;
        this.K = new Paint(1);
        Paint paint2 = new Paint(1);
        this.L = paint2;
        this.M = new Matrix();
        this.N = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.P = new RectF();
        this.Q = new RectF();
        this.R = new Object();
        this.S = new Rect();
        cVar.f8013i = AndroidUtilities.dpf2(1.0f);
        cVar.f8014j = AndroidUtilities.dpf2(0.6666667f);
        this.E = AndroidUtilities.dpf2(1.0f);
        this.F = AndroidUtilities.dpf2(0.33333334f);
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
        Path path = W;
        if (path == null) {
            W = new Path();
        } else {
            path.rewind();
        }
        W.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(W);
    }

    public final NinePatchDrawable a(int i10, boolean z10) {
        long j10;
        int i11;
        bh.a aVar = this.R;
        aVar.f4361b = 0L;
        aVar.f4360a = false;
        aVar.a(i10);
        aVar.a(this.d);
        c cVar = this.v;
        for (float f7 : cVar.f8009b) {
            aVar.c(f7);
        }
        aVar.c(this.E);
        aVar.c(0.0f);
        aVar.c(this.F);
        aVar.b(z10);
        if (z10) {
            aVar.a(this.f8023f);
            aVar.a(this.h);
            aVar.c(cVar.f8013i);
            aVar.c(cVar.f8014j);
        }
        if (aVar.f4360a) {
            j10 = -1;
        } else {
            j10 = aVar.f4361b;
        }
        if (this.T == null || this.U != j10) {
            this.U = j10;
            if (Color.alpha(i10) == 255) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            NinePatchDrawable b10 = v7.b(null, cVar.f8009b, this.E, this.F, i11, new a(i10, this, z10));
            this.T = b10;
            b10.getPadding(this.S);
        }
        return this.T;
    }

    public final void b() {
        Rect rect = this.v.f8017m;
        RectF rectF = this.P;
        rectF.set(rect);
        rectF.offset(this.f8020a, this.f8021b);
        RectF rectF2 = this.Q;
        if (!rectF.equals(rectF2)) {
            rectF2.set(rectF);
            m();
        }
    }

    public final void c(Canvas canvas, gh.a aVar) {
        int i10;
        c cVar = this.v;
        Rect rect = cVar.f8017m;
        Rect rect2 = cVar.f8017m;
        if (!rect.isEmpty()) {
            boolean z10 = false;
            if (Color.alpha(this.e) == 255) {
                d(canvas, 0);
            } else if (aVar instanceof gh.c) {
                d(canvas, ((gh.c) aVar).f11074a.getColor());
            } else if (aVar instanceof gh.b) {
                gh.b bVar = (gh.b) aVar;
                Bitmap bitmap = bVar.d;
                Bitmap bitmap2 = (Bitmap) this.N.get();
                Paint paint = this.J;
                if (bitmap != bitmap2) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.O = bitmapShader;
                        paint.setShader(bitmapShader);
                    } else {
                        this.O = null;
                        paint.setShader(null);
                    }
                }
                if (Color.alpha(this.d) > 0) {
                    NinePatchDrawable a2 = a(0, false);
                    int i11 = rect2.left;
                    Rect rect3 = this.S;
                    a2.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                    a2.setAlpha(this.f8028x);
                    a2.draw(canvas);
                }
                if (this.O != null && bitmap != null && !bitmap.isRecycled() && this.f8028x > 0) {
                    Matrix matrix = bVar.f11070b;
                    Matrix matrix2 = this.M;
                    matrix2.set(matrix);
                    matrix2.postTranslate(-this.f8020a, -this.f8021b);
                    this.O.setLocalMatrix(matrix2);
                    paint.setAlpha(this.f8028x);
                    cVar.b(canvas, paint);
                }
                int o12 = k6.o1(this.f8028x / 255.0f, this.e);
                if (Color.alpha(o12) > 0) {
                    Paint paint2 = this.K;
                    paint2.setColor(o12);
                    cVar.b(canvas, paint2);
                }
                g(canvas);
            } else if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof gh.d)) {
                gh.d dVar = (gh.d) aVar;
                if (!canvas.isHardwareAccelerated()) {
                    c(canvas, dVar.f11075a);
                }
            } else if (aVar instanceof gh.e) {
                c(canvas, ((gh.e) aVar).f11082a);
            } else if (aVar != null && (i10 = this.f8028x) != 0) {
                int o13 = k6.o1(i10 / 255.0f, this.e);
                if (Color.alpha(this.d) > 0 && this.f8028x == 255) {
                    float f7 = this.G;
                    if (f7 > 0.0f) {
                        float f10 = this.E;
                        float f11 = this.F;
                        int o14 = k6.o1(f7, this.d);
                        Paint paint3 = this.L;
                        paint3.setShadowLayer(f10, 0.0f, f11, o14);
                        cVar.c(canvas, paint3, this.f8029y);
                    }
                }
                float f12 = this.f8020a;
                float f13 = this.f8021b;
                float f14 = rect2.left;
                float f15 = f14 + f12;
                float f16 = rect2.top;
                float f17 = f16 + f13;
                float f18 = rect2.right;
                float f19 = f18 + f12;
                float f20 = rect2.bottom;
                float f21 = f20 + f13;
                int i12 = this.f8028x;
                if (i12 != 255) {
                    z10 = true;
                }
                boolean z11 = z10;
                if (z11) {
                    canvas.saveLayerAlpha(f14, f16, f18, f20, i12);
                }
                canvas.save();
                canvas.clipPath(cVar.f8015k);
                canvas.translate(rect2.left, rect2.top);
                canvas.translate(-f15, -f17);
                aVar.y(canvas, f15, f17, f19, f21);
                canvas.restore();
                if (Color.alpha(o13) > 0) {
                    Paint paint4 = this.H;
                    paint4.setColor(o13);
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
        Rect rect = this.v.f8017m;
        int i11 = rect.left;
        Rect rect2 = this.S;
        a2.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        a2.setAlpha(this.f8028x);
        a2.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int o12 = k6.o1(this.f8028x / 255.0f, this.f8023f);
        int o13 = k6.o1(this.f8028x / 255.0f, this.h);
        int alpha = Color.alpha(o12);
        c cVar = this.v;
        Paint paint = this.I;
        if (alpha > 0) {
            paint.setColor(o12);
            canvas.drawPath(cVar.f8018n, paint);
        }
        if (Color.alpha(o13) > 0) {
            paint.setColor(o13);
            canvas.drawPath(cVar.f8019o, paint);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f8028x;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        c cVar = this.v;
        h(outline, cVar.f8017m, cVar.f8009b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        c cVar = this.v;
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
        this.f8022c = aVar;
        updateColors();
        if (aVar instanceof eh.e) {
            eh.e eVar = (eh.e) aVar;
            float f7 = eVar.f8668f;
            float f10 = eVar.h;
            c cVar = this.v;
            cVar.f8013i = f7;
            cVar.f8014j = f10;
            float f11 = eVar.f8669n;
            float f12 = eVar.f8670r;
            this.E = f11;
            this.F = f12;
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c cVar = this.v;
        cVar.f8008a.set(rect);
        cVar.a();
        k();
    }

    public final void p(int i10) {
        c cVar = this.v;
        if (cVar.d != i10) {
            cVar.d = i10;
            cVar.a();
            k();
        }
    }

    public final void q(float f7) {
        c cVar = this.v;
        Arrays.fill(cVar.f8009b, f7);
        Arrays.fill(cVar.f8010c, f7);
        cVar.a();
        k();
    }

    public final void r(float f7, float f10, float f11, float f12) {
        c cVar = this.v;
        float[] fArr = cVar.f8009b;
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
        c cVar = this.v;
        float[] fArr = cVar.f8009b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.f8010c;
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
        this.f8028x = i10;
    }

    public final void t(float f7, float f10) {
        if (this.f8020a == f7 && this.f8021b == f10) {
            return;
        }
        this.f8020a = f7;
        this.f8021b = f10;
        l();
    }

    public final void u(int i10) {
        this.v.f8011f = i10;
        k();
    }

    @Override
    public void updateColors() {
        this.f8026s = r6.f21818b;
        eh.a aVar = this.f8022c;
        if (aVar == null) {
            return;
        }
        if (aVar instanceof eh.b) {
            ((eh.b) aVar).c();
        }
        this.e = this.f8022c.a0();
        this.d = this.f8022c.H();
        this.f8023f = this.f8022c.h();
        this.h = this.f8022c.u();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public void m() {
    }

    public d n() {
        return this;
    }

    public void v() {
    }
}

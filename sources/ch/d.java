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
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.i6;
import v7.u7;
import w7.e9;
import w7.q;
public abstract class d extends li.e {
    public static final float[] F = new float[8];
    public static Path G = new Path();
    public final RectF A;
    public final ah.a B;
    public final Rect C;
    public NinePatchDrawable D;
    public long E;
    public dh.a f4626e;
    public int f4627f;
    public int f4628g;
    public int h;
    public int f4629i;
    public int f4630j;
    public int f4631k;
    public final c f4632l;
    public b f4633m;
    public boolean f4634n;
    public float f4635o;
    public float f4636p;
    public float f4637q;
    public final Paint f4638r;
    public final Paint f4639s;
    public final Paint f4640t;
    public final Paint f4641u;
    public final Paint v;
    public final Matrix f4642w;
    public final WeakReference f4643x;
    public BitmapShader f4644y;
    public final RectF f4645z;

    public d() {
        c cVar = new c();
        this.f4632l = cVar;
        this.f4637q = 1.0f;
        this.f4638r = new Paint(1);
        this.f4639s = new Paint(1);
        Paint paint = new Paint(1);
        this.f4640t = paint;
        this.f4641u = new Paint(1);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.f4642w = new Matrix();
        this.f4643x = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.f4645z = new RectF();
        this.A = new RectF();
        this.B = new Object();
        this.C = new Rect();
        cVar.f4619i = AndroidUtilities.dpf2(1.0f);
        cVar.f4620j = AndroidUtilities.dpf2(0.6666667f);
        this.f4635o = AndroidUtilities.dpf2(1.0f);
        this.f4636p = AndroidUtilities.dpf2(0.33333334f);
    }

    public static void p(android.graphics.Canvas r17, float r18, float r19, float[] r20, float r21, boolean r22, android.graphics.Paint r23) {
        throw new UnsupportedOperationException("Method not decompiled: ch.d.p(android.graphics.Canvas, float, float, float[], float, boolean, android.graphics.Paint):void");
    }

    public static void q(Canvas canvas, RectF rectF, float f7, float f10, boolean z10, Paint paint) {
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

    public static void s(Outline outline, Rect rect, float[] fArr) {
        if (e9.a(fArr)) {
            outline.setRoundRect(rect, Math.min(fArr[0], Math.min(rect.width(), rect.height()) / 2.0f));
            return;
        }
        Path path = G;
        if (path == null) {
            G = new Path();
        } else {
            path.rewind();
        }
        G.addRoundRect(rect.left, rect.top, rect.right, rect.bottom, fArr, Path.Direction.CW);
        outline.setConvexPath(G);
    }

    public final void A(float f7, float f10, float f11, float f12) {
        c cVar = this.f4632l;
        float[] fArr = cVar.f4614b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[7] = f12;
        fArr[6] = f12;
        cVar.a();
        u();
    }

    public final void B(float f7, float f10, float f11, float f12) {
        c cVar = this.f4632l;
        float[] fArr = cVar.f4614b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.f4615c;
        fArr2[1] = f7;
        fArr2[0] = f7;
        fArr2[3] = f10;
        fArr2[2] = f10;
        fArr2[5] = f11;
        fArr2[4] = f11;
        fArr2[7] = f12;
        fArr2[6] = f12;
        cVar.a();
        u();
    }

    public final void C(int i10) {
        this.f4632l.f4617f = i10;
        u();
    }

    @Override
    public final void b(Rect rect) {
        rect.set(this.f4632l.f4623m);
    }

    @Override
    public final int c() {
        return this.f4630j;
    }

    @Override
    public final int d() {
        return this.f4631k;
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
        c cVar = this.f4632l;
        s(outline, cVar.f4623m, cVar.f4614b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        c cVar = this.f4632l;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.f4616e;
    }

    @Override
    public void h() {
        m();
    }

    @Override
    public boolean j() {
        return this instanceof e;
    }

    @Override
    public void k() {
        dh.a aVar = this.f4626e;
        if (aVar == null) {
            return;
        }
        this.f4628g = aVar.B();
        this.f4627f = this.f4626e.i();
        this.h = this.f4626e.a();
        this.f4629i = this.f4626e.c();
    }

    public final NinePatchDrawable l(int i10, boolean z10) {
        long j3;
        int i11;
        ah.a aVar = this.B;
        aVar.f451b = 0L;
        aVar.f450a = false;
        aVar.a(i10);
        aVar.a(this.f4627f);
        c cVar = this.f4632l;
        for (float f7 : cVar.f4614b) {
            aVar.c(f7);
        }
        aVar.c(this.f4635o);
        aVar.c(0.0f);
        aVar.c(this.f4636p);
        aVar.b(z10);
        if (z10) {
            aVar.a(this.h);
            aVar.a(this.f4629i);
            aVar.c(cVar.f4619i);
            aVar.c(cVar.f4620j);
        }
        if (aVar.f450a) {
            j3 = -1;
        } else {
            j3 = aVar.f451b;
        }
        if (this.D == null || this.E != j3) {
            this.E = j3;
            if (Color.alpha(i10) == 255) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            NinePatchDrawable b10 = u7.b(null, cVar.f4614b, this.f4635o, this.f4636p, i11, new a(i10, this, z10));
            this.D = b10;
            b10.getPadding(this.C);
        }
        return this.D;
    }

    public final void m() {
        Rect rect = this.f4632l.f4623m;
        RectF rectF = this.f4645z;
        rectF.set(rect);
        rectF.offset(this.f15650c, this.d);
        RectF rectF2 = this.A;
        if (!rectF.equals(rectF2)) {
            rectF2.set(rectF);
            v();
        }
    }

    public final void n(Canvas canvas, fh.a aVar) {
        int i10;
        boolean z10;
        c cVar = this.f4632l;
        Rect rect = cVar.f4623m;
        Rect rect2 = cVar.f4623m;
        if (!rect.isEmpty()) {
            if (Color.alpha(this.f4628g) == 255) {
                o(canvas, 0);
            } else if (aVar instanceof fh.c) {
                o(canvas, ((fh.c) aVar).f9857b);
            } else if (aVar instanceof fh.b) {
                fh.b bVar = (fh.b) aVar;
                int i11 = this.f15649b;
                Bitmap bitmap = bVar.d;
                Bitmap bitmap2 = (Bitmap) this.f4643x.get();
                Paint paint = this.f4640t;
                if (bitmap != bitmap2) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f4644y = bitmapShader;
                        paint.setShader(bitmapShader);
                    } else {
                        this.f4644y = null;
                        paint.setShader(null);
                    }
                }
                if (Color.alpha(this.f4627f) > 0) {
                    NinePatchDrawable l4 = l(0, false);
                    int i12 = rect2.left;
                    Rect rect3 = this.C;
                    l4.setBounds(i12 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                    l4.setAlpha(i11);
                    l4.draw(canvas);
                }
                if (this.f4644y != null && bitmap != null && !bitmap.isRecycled() && i11 > 0) {
                    Matrix matrix = bVar.f9851b;
                    Matrix matrix2 = this.f4642w;
                    matrix2.set(matrix);
                    matrix2.postTranslate(-this.f15650c, -this.d);
                    this.f4644y.setLocalMatrix(matrix2);
                    paint.setAlpha(i11);
                    cVar.b(canvas, paint);
                }
                int l1 = i6.l1(i11 / 255.0f, this.f4628g);
                if (Color.alpha(l1) > 0) {
                    Paint paint2 = this.f4641u;
                    paint2.setColor(l1);
                    cVar.b(canvas, paint2);
                }
                r(canvas);
            } else if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof fh.d)) {
                fh.d dVar = (fh.d) aVar;
                if (!canvas.isHardwareAccelerated()) {
                    n(canvas, dVar.f9858a);
                }
            } else if (aVar instanceof fh.e) {
                n(canvas, ((fh.e) aVar).f9866a);
            } else if (aVar != null && (i10 = this.f15649b) != 0) {
                int l12 = i6.l1(i10 / 255.0f, this.f4628g);
                if (Color.alpha(this.f4627f) > 0 && i10 == 255) {
                    float f7 = this.f4637q;
                    if (f7 > 0.0f) {
                        float f10 = this.f4635o;
                        float f11 = this.f4636p;
                        int l13 = i6.l1(f7, this.f4627f);
                        Paint paint3 = this.v;
                        paint3.setShadowLayer(f10, 0.0f, f11, l13);
                        cVar.c(canvas, paint3, this.f4634n);
                    }
                }
                float f12 = this.f15650c;
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
                } else {
                    z10 = false;
                }
                if (z10) {
                    canvas.saveLayerAlpha(f14, f16, f18, f20, i10);
                }
                canvas.save();
                canvas.clipPath(cVar.f4621k);
                canvas.translate(rect2.left, rect2.top);
                canvas.translate(-f15, -f17);
                aVar.y(canvas, f15, f17, f19, f21);
                canvas.restore();
                if (Color.alpha(l12) > 0) {
                    Paint paint4 = this.f4638r;
                    paint4.setColor(l12);
                    cVar.b(canvas, paint4);
                }
                r(canvas);
                if (z10) {
                    canvas.restore();
                }
            }
        }
    }

    public final void o(Canvas canvas, int i10) {
        int i11 = this.f15649b;
        int h = i0.a.h(this.f4628g, i10);
        if (Color.alpha(h) == 0 && Color.alpha(this.f4627f) == 0) {
            return;
        }
        NinePatchDrawable l4 = l(h, true);
        Rect rect = this.f4632l.f4623m;
        int i12 = rect.left;
        Rect rect2 = this.C;
        l4.setBounds(i12 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        l4.setAlpha(i11);
        l4.draw(canvas);
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c cVar = this.f4632l;
        cVar.f4613a.set(rect);
        cVar.a();
        u();
    }

    public final void r(Canvas canvas) {
        float f7 = this.f15649b / 255.0f;
        int l1 = i6.l1(f7, this.h);
        int l12 = i6.l1(f7, this.f4629i);
        int alpha = Color.alpha(l1);
        c cVar = this.f4632l;
        Paint paint = this.f4639s;
        if (alpha > 0) {
            paint.setColor(l1);
            canvas.drawPath(cVar.f4624n, paint);
        }
        if (Color.alpha(l12) > 0) {
            paint.setColor(l12);
            canvas.drawPath(cVar.f4625o, paint);
        }
    }

    public abstract fh.a t();

    public void u() {
        m();
    }

    public final void x(dh.a aVar) {
        this.f4626e = aVar;
        k();
        if (aVar instanceof dh.e) {
            dh.e eVar = (dh.e) aVar;
            float f7 = eVar.f8354f;
            float f10 = eVar.h;
            c cVar = this.f4632l;
            cVar.f4619i = f7;
            cVar.f4620j = f10;
            float f11 = eVar.f8355n;
            float f12 = eVar.f8356r;
            this.f4635o = f11;
            this.f4636p = f12;
        }
    }

    public final void y(int i10) {
        c cVar = this.f4632l;
        if (cVar.d != i10) {
            cVar.d = i10;
            cVar.a();
            u();
        }
    }

    public final void z(float f7) {
        c cVar = this.f4632l;
        Arrays.fill(cVar.f4614b, f7);
        Arrays.fill(cVar.f4615c, f7);
        cVar.a();
        u();
    }

    @Override
    public void a() {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public void v() {
    }

    public d w() {
        return this;
    }
}

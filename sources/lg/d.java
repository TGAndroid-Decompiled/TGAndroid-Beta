package lg;

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
import g.y;
import gf.m0;
import h7.l6;
import h7.n;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;

public abstract class d extends Drawable {
    public static final float[] C = new float[8];
    public static Path D = new Path();
    public NinePatchDrawable A;
    public long B;

    public float f15593a;

    public float f15594b;

    public mg.a f15595c;
    public int d;

    public int f15596e;

    public int f15597f;

    public int f15598g;
    public final c h;

    public b f15599i;

    public int f15600j;

    public boolean f15601k;

    public float f15602l;

    public float f15603m;

    public float f15604n;

    public final Paint f15605o;

    public final Paint f15606p;

    public final Paint f15607q;

    public final Paint f15608r;

    public final Paint f15609s;

    public final Matrix f15610t;

    public final WeakReference f15611u;
    public BitmapShader v;

    public final RectF f15612w;

    public final RectF f15613x;

    public final y f15614y;

    public final Rect f15615z;

    public d() {
        c cVar = new c();
        this.h = cVar;
        this.f15600j = 255;
        this.f15604n = 1.0f;
        this.f15605o = new Paint(1);
        this.f15606p = new Paint(1);
        Paint paint = new Paint(1);
        this.f15607q = paint;
        this.f15608r = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f15609s = paint2;
        this.f15610t = new Matrix();
        this.f15611u = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.f15612w = new RectF();
        this.f15613x = new RectF();
        this.f15614y = new y();
        this.f15615z = new Rect();
        cVar.f15586i = AndroidUtilities.dpf2(1.0f);
        cVar.f15587j = AndroidUtilities.dpf2(0.6666667f);
        this.f15602l = AndroidUtilities.dpf2(1.0f);
        this.f15603m = AndroidUtilities.dpf2(0.33333334f);
    }

    public static void e(Canvas canvas, float f10, float f11, float[] fArr, float f12, boolean z10, Paint paint) {
        boolean z11;
        float f13;
        if (z10) {
            float f14 = fArr[0];
            float f15 = fArr[1];
            if (f14 == f15) {
                float f16 = fArr[2];
                if (f15 == f16 && f16 == fArr[3]) {
                    z11 = true;
                }
            }
            z11 = false;
        } else {
            float f17 = fArr[4];
            float f18 = fArr[5];
            if (f17 == f18) {
                float f19 = fArr[6];
                if (f18 == f19 && f19 == fArr[7]) {
                    z11 = true;
                }
            }
            z11 = false;
        }
        float f20 = f12 / 2.0f;
        if (z10) {
            if (z11) {
                canvas.save();
                if (canvas.clipRect(0.0f, 0.0f, f10, n.a((fArr[0] * 2.0f) + 0.0f, 0.0f, f11))) {
                    float f21 = fArr[0];
                    canvas.drawRoundRect(0.0f - f20, 0.0f + f20, f10 + f20, f11 + f20, f21, f21, paint);
                }
                canvas.restore();
                return;
            }
            float f22 = (0.0f + f10) / 2.0f;
            canvas.save();
            if (canvas.clipRect(0.0f, 0.0f, f22, n.a((fArr[0] * 2.0f) + 0.0f, 0.0f, f11))) {
                f13 = 0.0f;
                canvas.drawRoundRect(0.0f - f20, 0.0f + f20, f10 + f20, f11 + f20, fArr[0], fArr[1], paint);
            } else {
                f13 = 0.0f;
            }
            canvas.restore();
            canvas.save();
            if (canvas.clipRect(f22, f13, f10, n.a((fArr[0] * 2.0f) + f13, f13, f11))) {
                canvas.drawRoundRect(f13 - f20, f13 + f20, f10 + f20, f11 + f20, fArr[2], fArr[3], paint);
            }
            canvas.restore();
            return;
        }
        if (z11) {
            canvas.save();
            if (canvas.clipRect(0.0f, n.a(f11 - (fArr[4] * 2.0f), 0.0f, f11), f10, f11)) {
                float f23 = 0.0f - f20;
                float f24 = fArr[4];
                canvas.drawRoundRect(f23, f23, f10 + f20, f11 - f20, f24, f24, paint);
            }
            canvas.restore();
            return;
        }
        float f25 = (0.0f + f10) / 2.0f;
        canvas.save();
        if (canvas.clipRect(0.0f, n.a(f11 - (fArr[4] * 2.0f), 0.0f, f11), f25, f11)) {
            float f26 = 0.0f - f20;
            canvas.drawRoundRect(f26, f26, f10 + f20, f11 - f20, fArr[6], fArr[7], paint);
        }
        canvas.restore();
        canvas.save();
        if (canvas.clipRect(f25, n.a(f11 - (fArr[4] * 2.0f), 0.0f, f11), f10, f11)) {
            float f27 = 0.0f - f20;
            canvas.drawRoundRect(f27, f27, f10 + f20, f11 - f20, fArr[4], fArr[5], paint);
        }
        canvas.restore();
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

    public final NinePatchDrawable a(int i10, boolean z10) {
        y yVar = this.f15614y;
        yVar.f6326a = 0L;
        yVar.f6327b = false;
        yVar.a(i10);
        yVar.a(this.d);
        c cVar = this.h;
        for (float f10 : cVar.f15581b) {
            yVar.c(f10);
        }
        yVar.c(this.f15602l);
        yVar.c(0.0f);
        yVar.c(this.f15603m);
        yVar.b(z10);
        if (z10) {
            yVar.a(this.f15597f);
            yVar.a(this.f15598g);
            yVar.c(cVar.f15586i);
            yVar.c(cVar.f15587j);
        }
        long j10 = yVar.f6327b ? -1L : yVar.f6326a;
        if (this.A == null || this.B != j10) {
            this.B = j10;
            NinePatchDrawable ninePatchDrawableB = l6.b(null, cVar.f15581b, this.f15602l, this.f15603m, Color.alpha(i10) == 255 ? i10 : 1, new a(i10, this, z10));
            this.A = ninePatchDrawableB;
            ninePatchDrawableB.getPadding(this.f15615z);
        }
        return this.A;
    }

    public final void b() {
        Rect rect = this.h.f15590m;
        RectF rectF = this.f15612w;
        rectF.set(rect);
        rectF.offset(this.f15593a, this.f15594b);
        RectF rectF2 = this.f15613x;
        if (rectF.equals(rectF2)) {
            return;
        }
        rectF2.set(rectF);
        l();
    }

    public final void c(Canvas canvas, og.a aVar) {
        int i10;
        c cVar = this.h;
        Rect rect = cVar.f15590m;
        Rect rect2 = cVar.f15590m;
        if (rect.isEmpty()) {
            return;
        }
        if (Color.alpha(this.f15596e) == 255) {
            d(canvas, 0);
            return;
        }
        if (aVar instanceof og.c) {
            d(canvas, ((og.c) aVar).f19449a.getColor());
            return;
        }
        if (aVar instanceof og.b) {
            og.b bVar = (og.b) aVar;
            Bitmap bitmap = bVar.d;
            Bitmap bitmap2 = (Bitmap) this.f15611u.get();
            Paint paint = this.f15607q;
            if (bitmap != bitmap2) {
                if (bitmap == null || bitmap.isRecycled()) {
                    this.v = null;
                    paint.setShader(null);
                } else {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                    this.v = bitmapShader;
                    paint.setShader(bitmapShader);
                }
            }
            if (Color.alpha(this.d) > 0) {
                NinePatchDrawable ninePatchDrawableA = a(0, false);
                int i11 = rect2.left;
                Rect rect3 = this.f15615z;
                ninePatchDrawableA.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                ninePatchDrawableA.setAlpha(this.f15600j);
                ninePatchDrawableA.draw(canvas);
            }
            if (this.v != null && bitmap != null && !bitmap.isRecycled() && this.f15600j > 0) {
                Matrix matrix = bVar.f19444b;
                Matrix matrix2 = this.f15610t;
                matrix2.set(matrix);
                matrix2.postTranslate(-this.f15593a, -this.f15594b);
                this.v.setLocalMatrix(matrix2);
                paint.setAlpha(this.f15600j);
                cVar.b(canvas, paint);
            }
            int iL1 = g6.l1(this.f15600j / 255.0f, this.f15596e);
            if (Color.alpha(iL1) > 0) {
                Paint paint2 = this.f15608r;
                paint2.setColor(iL1);
                cVar.b(canvas, paint2);
            }
            g(canvas);
            return;
        }
        if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof og.d)) {
            og.d dVar = (og.d) aVar;
            if (canvas.isHardwareAccelerated()) {
                return;
            }
            c(canvas, dVar.f19450a);
            return;
        }
        if (aVar instanceof og.e) {
            c(canvas, ((og.e) aVar).f19458a);
            return;
        }
        if (aVar == null || (i10 = this.f15600j) == 0) {
            return;
        }
        int iL2 = g6.l1(i10 / 255.0f, this.f15596e);
        if (Color.alpha(this.d) > 0 && this.f15600j == 255) {
            float f10 = this.f15604n;
            if (f10 > 0.0f) {
                float f11 = this.f15602l;
                float f12 = this.f15603m;
                int iL3 = g6.l1(f10, this.d);
                Paint paint3 = this.f15609s;
                paint3.setShadowLayer(f11, 0.0f, f12, iL3);
                cVar.c(canvas, paint3, this.f15601k);
            }
        }
        float f13 = this.f15593a;
        float f14 = this.f15594b;
        float f15 = rect2.left;
        float f16 = f15 + f13;
        float f17 = rect2.top;
        float f18 = f17 + f14;
        float f19 = rect2.right;
        float f20 = f19 + f13;
        float f21 = rect2.bottom;
        float f22 = f21 + f14;
        int i12 = this.f15600j;
        boolean z10 = i12 != 255;
        if (z10) {
            canvas.saveLayerAlpha(f15, f17, f19, f21, i12);
        }
        canvas.save();
        canvas.clipPath(cVar.f15588k);
        canvas.translate(rect2.left, rect2.top);
        canvas.translate(-f16, -f18);
        aVar.T0(canvas, f16, f18, f20, f22);
        canvas.restore();
        if (Color.alpha(iL2) > 0) {
            Paint paint4 = this.f15605o;
            paint4.setColor(iL2);
            cVar.b(canvas, paint4);
        }
        g(canvas);
        if (z10) {
            canvas.restore();
        }
    }

    public final void d(Canvas canvas, int i10) {
        int iH = i0.b.h(this.f15596e, i10);
        if (Color.alpha(iH) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable ninePatchDrawableA = a(iH, true);
        Rect rect = this.h.f15590m;
        int i11 = rect.left;
        Rect rect2 = this.f15615z;
        ninePatchDrawableA.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        ninePatchDrawableA.setAlpha(this.f15600j);
        ninePatchDrawableA.draw(canvas);
    }

    public final void g(Canvas canvas) {
        int iL1 = g6.l1(this.f15600j / 255.0f, this.f15597f);
        int iL2 = g6.l1(this.f15600j / 255.0f, this.f15598g);
        int iAlpha = Color.alpha(iL1);
        c cVar = this.h;
        Paint paint = this.f15606p;
        if (iAlpha > 0) {
            paint.setColor(iL1);
            canvas.drawPath(cVar.f15591n, paint);
        }
        if (Color.alpha(iL2) > 0) {
            paint.setColor(iL2);
            canvas.drawPath(cVar.f15592o, paint);
        }
    }

    @Override
    public final int getAlpha() {
        return this.f15600j;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        c cVar = this.h;
        h(outline, cVar.f15590m, cVar.f15581b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        c cVar = this.h;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.f15583e;
    }

    public abstract og.a i();

    public void j() {
        b();
    }

    public void k() {
        b();
    }

    public final void n(mg.a aVar) {
        this.f15595c = aVar;
        u();
        if (aVar instanceof mg.d) {
            mg.d dVar = (mg.d) aVar;
            float f10 = dVar.f18051f;
            float f11 = dVar.h;
            c cVar = this.h;
            cVar.f15586i = f10;
            cVar.f15587j = f11;
            float f12 = dVar.f18052n;
            float f13 = dVar.f18053r;
            this.f15602l = f12;
            this.f15603m = f13;
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
        cVar.f15580a.set(rect);
        cVar.a();
        j();
    }

    public final void p(float f10) {
        c cVar = this.h;
        Arrays.fill(cVar.f15581b, f10);
        Arrays.fill(cVar.f15582c, f10);
        cVar.a();
        j();
    }

    public final void q(float f10, float f11, float f12, float f13) {
        c cVar = this.h;
        float[] fArr = cVar.f15581b;
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
        float[] fArr = cVar.f15581b;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[3] = f11;
        fArr[2] = f11;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.f15582c;
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
        if (this.f15593a == f10 && this.f15594b == f11) {
            return;
        }
        this.f15593a = f10;
        this.f15594b = f11;
        k();
    }

    @Override
    public void setAlpha(int i10) {
        this.f15600j = i10;
    }

    public final void t(int i10) {
        this.h.f15584f = i10;
        j();
    }

    public void u() {
        mg.a aVar = this.f15595c;
        if (aVar == null) {
            return;
        }
        this.f15596e = aVar.p2();
        this.d = this.f15595c.J1();
        this.f15597f = this.f15595c.h0();
        this.f15598g = this.f15595c.K0();
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

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
import v7.v7;
import w7.q;
import yf.e0;
public abstract class d extends mi.c {
    public static final float[] E = new float[8];
    public static Path F = new Path();
    public final ah.a A;
    public final Rect B;
    public NinePatchDrawable C;
    public long D;
    public float f4276a;
    public float f4277b;
    public dh.a f4278c;
    public int d;
    public int e;
    public int f4279f;
    public int f4280g;
    public int h;
    public int f4281i;
    public final c f4282j;
    public b f4283k;
    public int f4284l;
    public boolean f4285m;
    public float f4286n;
    public float f4287o;
    public float f4288p;
    public final Paint f4289q;
    public final Paint f4290r;
    public final Paint f4291s;
    public final Paint f4292t;
    public final Paint f4293u;
    public final Matrix v;
    public final WeakReference f4294w;
    public BitmapShader f4295x;
    public final RectF f4296y;
    public final RectF f4297z;

    public d() {
        c cVar = new c();
        this.f4282j = cVar;
        this.f4284l = 255;
        this.f4288p = 1.0f;
        this.f4289q = new Paint(1);
        this.f4290r = new Paint(1);
        Paint paint = new Paint(1);
        this.f4291s = paint;
        this.f4292t = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f4293u = paint2;
        this.v = new Matrix();
        this.f4294w = new WeakReference(null);
        paint2.setColor(0);
        paint.setFilterBitmap(true);
        this.f4296y = new RectF();
        this.f4297z = new RectF();
        this.A = new Object();
        this.B = new Rect();
        cVar.f4269i = AndroidUtilities.dpf2(1.0f);
        cVar.f4270j = AndroidUtilities.dpf2(0.6666667f);
        this.f4286n = AndroidUtilities.dpf2(1.0f);
        this.f4287o = AndroidUtilities.dpf2(0.33333334f);
    }

    public static void l(android.graphics.Canvas r17, float r18, float r19, float[] r20, float r21, boolean r22, android.graphics.Paint r23) {
        throw new UnsupportedOperationException("Method not decompiled: ch.d.l(android.graphics.Canvas, float, float, float[], float, boolean, android.graphics.Paint):void");
    }

    public static void m(Canvas canvas, RectF rectF, float f7, float f10, boolean z10, Paint paint) {
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

    public static void o(Outline outline, Rect rect, float[] fArr) {
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

    @Override
    public final int b() {
        return this.h;
    }

    @Override
    public final int c() {
        return this.f4281i;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public final void e(float f7, float f10) {
        if (this.f4276a == f7 && this.f4277b == f10) {
            return;
        }
        this.f4276a = f7;
        this.f4277b = f10;
        r();
    }

    @Override
    public boolean f() {
        return this instanceof e;
    }

    @Override
    public void g() {
        dh.a aVar = this.f4278c;
        if (aVar == null) {
            return;
        }
        this.e = aVar.B();
        this.d = this.f4278c.m();
        this.f4279f = this.f4278c.a();
        this.f4280g = this.f4278c.c();
    }

    @Override
    public final int getAlpha() {
        return this.f4284l;
    }

    @Override
    public final int getOpacity() {
        return -3;
    }

    @Override
    public final void getOutline(Outline outline) {
        c cVar = this.f4282j;
        o(outline, cVar.f4273m, cVar.f4265b);
    }

    @Override
    public final boolean getPadding(Rect rect) {
        c cVar = this.f4282j;
        int i10 = cVar.d;
        rect.set(i10, i10, i10, i10);
        return cVar.e;
    }

    public final NinePatchDrawable h(int i10, boolean z10) {
        long j3;
        int i11;
        ah.a aVar = this.A;
        aVar.f418b = 0L;
        aVar.f417a = false;
        aVar.a(i10);
        aVar.a(this.d);
        c cVar = this.f4282j;
        for (float f7 : cVar.f4265b) {
            aVar.c(f7);
        }
        aVar.c(this.f4286n);
        aVar.c(0.0f);
        aVar.c(this.f4287o);
        aVar.b(z10);
        if (z10) {
            aVar.a(this.f4279f);
            aVar.a(this.f4280g);
            aVar.c(cVar.f4269i);
            aVar.c(cVar.f4270j);
        }
        if (aVar.f417a) {
            j3 = -1;
        } else {
            j3 = aVar.f418b;
        }
        if (this.C == null || this.D != j3) {
            this.D = j3;
            if (Color.alpha(i10) == 255) {
                i11 = i10;
            } else {
                i11 = 1;
            }
            NinePatchDrawable b10 = v7.b(null, cVar.f4265b, this.f4286n, this.f4287o, i11, new a(i10, this, z10));
            this.C = b10;
            b10.getPadding(this.B);
        }
        return this.C;
    }

    public final void i() {
        Rect rect = this.f4282j.f4273m;
        RectF rectF = this.f4296y;
        rectF.set(rect);
        rectF.offset(this.f4276a, this.f4277b);
        RectF rectF2 = this.f4297z;
        if (!rectF.equals(rectF2)) {
            rectF2.set(rectF);
            s();
        }
    }

    public final void j(Canvas canvas, fh.a aVar) {
        int i10;
        boolean z10;
        c cVar = this.f4282j;
        Rect rect = cVar.f4273m;
        Rect rect2 = cVar.f4273m;
        if (!rect.isEmpty()) {
            if (Color.alpha(this.e) == 255) {
                k(canvas, 0);
            } else if (aVar instanceof fh.c) {
                k(canvas, ((fh.c) aVar).f9058a.getColor());
            } else if (aVar instanceof fh.b) {
                fh.b bVar = (fh.b) aVar;
                Bitmap bitmap = bVar.d;
                Bitmap bitmap2 = (Bitmap) this.f4294w.get();
                Paint paint = this.f4291s;
                if (bitmap != bitmap2) {
                    if (bitmap != null && !bitmap.isRecycled()) {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                        this.f4295x = bitmapShader;
                        paint.setShader(bitmapShader);
                    } else {
                        this.f4295x = null;
                        paint.setShader(null);
                    }
                }
                if (Color.alpha(this.d) > 0) {
                    NinePatchDrawable h = h(0, false);
                    int i11 = rect2.left;
                    Rect rect3 = this.B;
                    h.setBounds(i11 - rect3.left, rect2.top - rect3.top, rect2.right + rect3.right, rect2.bottom + rect3.bottom);
                    h.setAlpha(this.f4284l);
                    h.draw(canvas);
                }
                if (this.f4295x != null && bitmap != null && !bitmap.isRecycled() && this.f4284l > 0) {
                    Matrix matrix = bVar.f9054b;
                    Matrix matrix2 = this.v;
                    matrix2.set(matrix);
                    matrix2.postTranslate(-this.f4276a, -this.f4277b);
                    this.f4295x.setLocalMatrix(matrix2);
                    paint.setAlpha(this.f4284l);
                    cVar.b(canvas, paint);
                }
                int l1 = i6.l1(this.f4284l / 255.0f, this.e);
                if (Color.alpha(l1) > 0) {
                    Paint paint2 = this.f4292t;
                    paint2.setColor(l1);
                    cVar.b(canvas, paint2);
                }
                n(canvas);
            } else if (Build.VERSION.SDK_INT >= 29 && (aVar instanceof fh.d)) {
                fh.d dVar = (fh.d) aVar;
                if (!canvas.isHardwareAccelerated()) {
                    j(canvas, dVar.f9059a);
                }
            } else if (aVar instanceof fh.e) {
                j(canvas, ((fh.e) aVar).f9068a);
            } else if (aVar != null && (i10 = this.f4284l) != 0) {
                int l12 = i6.l1(i10 / 255.0f, this.e);
                if (Color.alpha(this.d) > 0 && this.f4284l == 255) {
                    float f7 = this.f4288p;
                    if (f7 > 0.0f) {
                        float f10 = this.f4286n;
                        float f11 = this.f4287o;
                        int l13 = i6.l1(f7, this.d);
                        Paint paint3 = this.f4293u;
                        paint3.setShadowLayer(f10, 0.0f, f11, l13);
                        cVar.c(canvas, paint3, this.f4285m);
                    }
                }
                float f12 = this.f4276a;
                float f13 = this.f4277b;
                float f14 = rect2.left;
                float f15 = f14 + f12;
                float f16 = rect2.top;
                float f17 = f16 + f13;
                float f18 = rect2.right;
                float f19 = f18 + f12;
                float f20 = rect2.bottom;
                float f21 = f20 + f13;
                int i12 = this.f4284l;
                if (i12 != 255) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    canvas.saveLayerAlpha(f14, f16, f18, f20, i12);
                }
                canvas.save();
                canvas.clipPath(cVar.f4271k);
                canvas.translate(rect2.left, rect2.top);
                canvas.translate(-f15, -f17);
                aVar.y(canvas, f15, f17, f19, f21);
                canvas.restore();
                if (Color.alpha(l12) > 0) {
                    Paint paint4 = this.f4289q;
                    paint4.setColor(l12);
                    cVar.b(canvas, paint4);
                }
                n(canvas);
                if (z10) {
                    canvas.restore();
                }
            }
        }
    }

    public final void k(Canvas canvas, int i10) {
        int h = i0.a.h(this.e, i10);
        if (Color.alpha(h) == 0 && Color.alpha(this.d) == 0) {
            return;
        }
        NinePatchDrawable h10 = h(h, true);
        Rect rect = this.f4282j.f4273m;
        int i11 = rect.left;
        Rect rect2 = this.B;
        h10.setBounds(i11 - rect2.left, rect.top - rect2.top, rect.right + rect2.right, rect.bottom + rect2.bottom);
        h10.setAlpha(this.f4284l);
        h10.draw(canvas);
    }

    public final void n(Canvas canvas) {
        int l1 = i6.l1(this.f4284l / 255.0f, this.f4279f);
        int l12 = i6.l1(this.f4284l / 255.0f, this.f4280g);
        int alpha = Color.alpha(l1);
        c cVar = this.f4282j;
        Paint paint = this.f4290r;
        if (alpha > 0) {
            paint.setColor(l1);
            canvas.drawPath(cVar.f4274n, paint);
        }
        if (Color.alpha(l12) > 0) {
            paint.setColor(l12);
            canvas.drawPath(cVar.f4275o, paint);
        }
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        c cVar = this.f4282j;
        cVar.f4264a.set(rect);
        cVar.a();
        q();
    }

    public abstract fh.a p();

    public void q() {
        i();
    }

    public void r() {
        i();
    }

    @Override
    public void setAlpha(int i10) {
        this.f4284l = i10;
    }

    public final void u(dh.a aVar) {
        this.f4278c = aVar;
        g();
        if (aVar instanceof dh.e) {
            dh.e eVar = (dh.e) aVar;
            float f7 = eVar.f7726f;
            float f10 = eVar.h;
            c cVar = this.f4282j;
            cVar.f4269i = f7;
            cVar.f4270j = f10;
            float f11 = eVar.f7727n;
            float f12 = eVar.f7728r;
            this.f4286n = f11;
            this.f4287o = f12;
        }
    }

    public final void v(int i10) {
        c cVar = this.f4282j;
        if (cVar.d != i10) {
            cVar.d = i10;
            cVar.a();
            q();
        }
    }

    public final void w(float f7) {
        c cVar = this.f4282j;
        Arrays.fill(cVar.f4265b, f7);
        Arrays.fill(cVar.f4266c, f7);
        cVar.a();
        q();
    }

    public final void x(float f7, float f10, float f11, float f12) {
        c cVar = this.f4282j;
        float[] fArr = cVar.f4265b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[7] = f12;
        fArr[6] = f12;
        cVar.a();
        q();
    }

    public final void y(float f7, float f10, float f11, float f12) {
        c cVar = this.f4282j;
        float[] fArr = cVar.f4265b;
        fArr[1] = f7;
        fArr[0] = f7;
        fArr[3] = f10;
        fArr[2] = f10;
        fArr[5] = 0.0f;
        fArr[4] = 0.0f;
        fArr[7] = 0.0f;
        fArr[6] = 0.0f;
        float[] fArr2 = cVar.f4266c;
        fArr2[1] = f7;
        fArr2[0] = f7;
        fArr2[3] = f10;
        fArr2[2] = f10;
        fArr2[5] = f11;
        fArr2[4] = f11;
        fArr2[7] = f12;
        fArr2[6] = f12;
        cVar.a();
        q();
    }

    public final void z(int i10) {
        this.f4282j.f4267f = i10;
        q();
    }

    @Override
    public void a() {
    }

    public void s() {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public d t() {
        return this;
    }
}

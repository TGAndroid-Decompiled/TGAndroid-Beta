package fi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import v7.i7;
public final class b extends i7 {
    public final boolean f7104a;
    public final Paint f7105b = new Paint();
    public final Paint f7106c;
    public final Paint d;
    public int e;
    public int f7107f;
    public final g f7108g;

    public b(g gVar, boolean z10) {
        this.f7108g = gVar;
        Paint paint = new Paint(1);
        this.f7106c = paint;
        this.d = new Paint(1);
        this.e = -1;
        this.f7107f = -1;
        this.f7104a = z10;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override
    public final void b() {
        this.e = -1;
    }

    @Override
    public final void c(Canvas canvas) {
        boolean z10;
        Paint paint;
        boolean z11;
        boolean z12;
        g gVar;
        float f7;
        float f10;
        g gVar2 = this.f7108g;
        Rect bounds = gVar2.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f11 = width;
        int ceil = (int) Math.ceil(f11 / 5.0f);
        float f12 = height;
        int ceil2 = (int) Math.ceil(f12 / 5.0f);
        boolean z13 = this.f7104a;
        if (z13) {
            z10 = gVar2.f7129w;
        } else {
            z10 = gVar2.f7130x;
        }
        Paint paint2 = this.f7106c;
        Paint paint3 = this.d;
        if (!z10 && this.e == width && this.f7107f == height) {
            gVar = gVar2;
            paint = paint3;
            z11 = z13;
        } else {
            int i10 = gVar2.f7131y;
            if (i10 != 1 && i10 != 4) {
                f12 = f11;
            }
            if (z13) {
                h hVar = gVar2.D;
                hVar.getClass();
                float f13 = 0;
                paint = paint3;
                z11 = z13;
                z12 = false;
                paint2.setShader(g.k(gVar2, hVar, f12, f13, -1, 5));
                h hVar2 = gVar2.E;
                hVar2.getClass();
                paint.setShader(g.k(gVar2, hVar2, f12, f13, gVar2.H, 5));
                gVar = gVar2;
            } else {
                paint = paint3;
                z11 = z13;
                z12 = false;
                h hVar3 = gVar2.F;
                hVar3.getClass();
                gVar = gVar2;
                paint.setShader(g.k(gVar2, hVar3, f12, 0, gVar2.J, 5));
            }
            this.e = width;
            this.f7107f = height;
            if (z11) {
                gVar.f7129w = z12;
            } else {
                gVar.f7130x = z12;
            }
        }
        canvas.save();
        canvas.scale(5.0f, 5.0f);
        float f14 = ceil;
        float f15 = ceil2;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f14, f15, this.f7105b);
        if (z11) {
            canvas.drawColor((gVar.H & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f16 = gVar.d;
            float f17 = bounds.left + f16;
            float f18 = gVar.e;
            float f19 = bounds.top + f18;
            canvas.translate(-f17, -f19);
            gVar.f7125f.e(canvas, f17, f19, bounds.right + f16, bounds.bottom + f18);
            canvas.restore();
            f7 = f14;
            f10 = f15;
            canvas.drawRect(0.0f, 0.0f, f7, f10, paint2);
        } else {
            f7 = f14;
            f10 = f15;
        }
        canvas.drawRect(0.0f, 0.0f, f7, f10, paint);
        canvas.restoreToCount(saveLayer);
        canvas.restore();
    }

    @Override
    public final boolean d() {
        return false;
    }

    @Override
    public final void e(float f7) {
        this.f7105b.setAlpha(Math.round(f7 * 255.0f));
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
    }
}

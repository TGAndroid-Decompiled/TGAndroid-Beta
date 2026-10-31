package fi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import v7.i7;
public final class a extends i7 {
    public final boolean f7103a;
    public final Paint f7104b = new Paint();
    public final Paint f7105c;
    public final Paint d;
    public int e;
    public int f7106f;
    public final f f7107g;

    public a(f fVar, boolean z10) {
        this.f7107g = fVar;
        Paint paint = new Paint(1);
        this.f7105c = paint;
        this.d = new Paint(1);
        this.e = -1;
        this.f7106f = -1;
        this.f7103a = z10;
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
        f fVar;
        float f7;
        float f10;
        f fVar2 = this.f7107g;
        Rect bounds = fVar2.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f11 = width;
        int ceil = (int) Math.ceil(f11 / 5.0f);
        float f12 = height;
        int ceil2 = (int) Math.ceil(f12 / 5.0f);
        boolean z13 = this.f7103a;
        if (z13) {
            z10 = fVar2.f7128w;
        } else {
            z10 = fVar2.f7129x;
        }
        Paint paint2 = this.f7105c;
        Paint paint3 = this.d;
        if (!z10 && this.e == width && this.f7106f == height) {
            fVar = fVar2;
            paint = paint3;
            z11 = z13;
        } else {
            int i10 = fVar2.f7130y;
            if (i10 != 1 && i10 != 4) {
                f12 = f11;
            }
            if (z13) {
                g gVar = fVar2.D;
                gVar.getClass();
                float f13 = 0;
                paint = paint3;
                z11 = z13;
                z12 = false;
                paint2.setShader(f.l(fVar2, gVar, f12, f13, -1, 5));
                g gVar2 = fVar2.E;
                gVar2.getClass();
                paint.setShader(f.l(fVar2, gVar2, f12, f13, fVar2.H, 5));
                fVar = fVar2;
            } else {
                paint = paint3;
                z11 = z13;
                z12 = false;
                g gVar3 = fVar2.F;
                gVar3.getClass();
                fVar = fVar2;
                paint.setShader(f.l(fVar2, gVar3, f12, 0, fVar2.J, 5));
            }
            this.e = width;
            this.f7106f = height;
            if (z11) {
                fVar.f7128w = z12;
            } else {
                fVar.f7129x = z12;
            }
        }
        canvas.save();
        canvas.scale(5.0f, 5.0f);
        float f14 = ceil;
        float f15 = ceil2;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f14, f15, this.f7104b);
        if (z11) {
            canvas.drawColor((fVar.H & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f16 = fVar.d;
            float f17 = bounds.left + f16;
            float f18 = fVar.e;
            float f19 = bounds.top + f18;
            canvas.translate(-f17, -f19);
            fVar.f7124f.e(canvas, f17, f19, bounds.right + f16, bounds.bottom + f18);
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
        this.f7104b.setAlpha(Math.round(f7 * 255.0f));
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
    }
}

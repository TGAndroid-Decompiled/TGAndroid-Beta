package mi;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import w7.z;
public final class a extends z {
    public final boolean f16436a;
    public final Paint f16437b = new Paint();
    public final Paint f16438c;
    public final Paint d;
    public int f16439e;
    public int f16440f;
    public final f f16441g;

    public a(f fVar, boolean z10) {
        this.f16441g = fVar;
        Paint paint = new Paint(1);
        this.f16438c = paint;
        this.d = new Paint(1);
        this.f16439e = -1;
        this.f16440f = -1;
        this.f16436a = z10;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    @Override
    public final void b() {
        this.f16439e = -1;
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
        f fVar2 = this.f16441g;
        Rect bounds = fVar2.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        float f11 = width;
        int ceil = (int) Math.ceil(f11 / 5.0f);
        float f12 = height;
        int ceil2 = (int) Math.ceil(f12 / 5.0f);
        boolean z13 = this.f16436a;
        if (z13) {
            z10 = fVar2.f16464j;
        } else {
            z10 = fVar2.f16465k;
        }
        Paint paint2 = this.f16438c;
        Paint paint3 = this.d;
        if (!z10 && this.f16439e == width && this.f16440f == height) {
            fVar = fVar2;
            paint = paint3;
            z11 = z13;
        } else {
            int i10 = fVar2.f16466l;
            if (i10 != 1 && i10 != 4) {
                f12 = f11;
            }
            if (z13) {
                g gVar = fVar2.f16467m;
                gVar.getClass();
                float f13 = 0;
                paint = paint3;
                z11 = z13;
                z12 = false;
                paint2.setShader(f.m(fVar2, gVar, f12, f13, -1, 5));
                g gVar2 = fVar2.f16468n;
                gVar2.getClass();
                paint.setShader(f.m(fVar2, gVar2, f12, f13, fVar2.f16471q, 5));
                fVar = fVar2;
            } else {
                paint = paint3;
                z11 = z13;
                z12 = false;
                g gVar3 = fVar2.f16469o;
                gVar3.getClass();
                fVar = fVar2;
                paint.setShader(f.m(fVar2, gVar3, f12, 0, fVar2.f16473s, 5));
            }
            this.f16439e = width;
            this.f16440f = height;
            if (z11) {
                fVar.f16464j = z12;
            } else {
                fVar.f16465k = z12;
            }
        }
        canvas.save();
        canvas.scale(5.0f, 5.0f);
        float f14 = ceil;
        float f15 = ceil2;
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, f14, f15, this.f16437b);
        if (z11) {
            canvas.drawColor((fVar.f16471q & 16777215) | (-16777216));
            canvas.save();
            canvas.scale(0.2f, 0.2f);
            float f16 = fVar.f15651c;
            float f17 = bounds.left + f16;
            float f18 = fVar.d;
            float f19 = bounds.top + f18;
            canvas.translate(-f17, -f19);
            fVar.f16460e.v(canvas, f17, f19, bounds.right + f16, bounds.bottom + f18);
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
        this.f16437b.setAlpha(Math.round(f7 * 255.0f));
    }

    @Override
    public final void a(Rect rect, RectF rectF) {
    }
}

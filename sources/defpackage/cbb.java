package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class cbb extends View {
    public final boolean a;
    public final Canvas b;
    public final float c;
    public final float d;
    public final float e;
    public final Paint f;
    public final Bitmap h;
    public final Paint n;
    public final float r;
    public final float s;
    public final sbb w;

    public cbb(sbb sbbVar, Context context, boolean z, Canvas canvas, float f, float f2, float f3, Paint paint, Bitmap bitmap, Paint paint2, float f4, float f5) {
        super(context);
        this.w = sbbVar;
        this.a = z;
        this.b = canvas;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = paint;
        this.h = bitmap;
        this.n = paint2;
        this.r = f4;
        this.s = f5;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        sbb sbbVar = this.w;
        float f = sbbVar.E2;
        Paint paint = this.n;
        float f2 = this.e;
        float f3 = this.d;
        float f4 = this.c;
        if (this.a) {
            if (f > 0.0f) {
                this.b.drawCircle(f4, f3, f2 * f, this.f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f4, f3, (1.0f - f) * f2, paint);
        }
        canvas.save();
        canvas.translate(this.r, this.s);
        sbbVar.j1.draw(canvas);
        canvas.restore();
    }
}

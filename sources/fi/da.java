package fi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class da extends View {
    public final boolean f11798a;
    public final Canvas f11799b;
    public final float f11800c;
    public final float d;
    public final float f11801e;
    public final Paint f11802f;
    public final Bitmap h;
    public final Paint f11803n;
    public final float f11804r;
    public final float f11805s;
    public final va f11806w;

    public da(va vaVar, Context context, boolean z9, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14) {
        super(context);
        this.f11806w = vaVar;
        this.f11798a = z9;
        this.f11799b = canvas;
        this.f11800c = f10;
        this.d = f11;
        this.f11801e = f12;
        this.f11802f = paint;
        this.h = bitmap;
        this.f11803n = paint2;
        this.f11804r = f13;
        this.f11805s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z9 = this.f11798a;
        Paint paint = this.f11803n;
        float f10 = this.f11801e;
        float f11 = this.d;
        float f12 = this.f11800c;
        va vaVar = this.f11806w;
        if (z9) {
            float f13 = vaVar.D2;
            if (f13 > 0.0f) {
                this.f11799b.drawCircle(f12, f11, f10 * f13, this.f11802f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f12, f11, (1.0f - vaVar.D2) * f10, paint);
        }
        canvas.save();
        canvas.translate(this.f11804r, this.f11805s);
        vaVar.f12963i1.draw(canvas);
        canvas.restore();
    }
}

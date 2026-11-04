package gi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class da extends View {
    public final boolean f12593a;
    public final Canvas f12594b;
    public final float f12595c;
    public final float d;
    public final float f12596e;
    public final Paint f12597f;
    public final Bitmap h;
    public final Paint f12598n;
    public final float f12599r;
    public final float f12600s;
    public final va f12601w;

    public da(va vaVar, Context context, boolean z10, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14) {
        super(context);
        this.f12601w = vaVar;
        this.f12593a = z10;
        this.f12594b = canvas;
        this.f12595c = f10;
        this.d = f11;
        this.f12596e = f12;
        this.f12597f = paint;
        this.h = bitmap;
        this.f12598n = paint2;
        this.f12599r = f13;
        this.f12600s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = this.f12593a;
        Paint paint = this.f12598n;
        float f10 = this.f12596e;
        float f11 = this.d;
        float f12 = this.f12595c;
        va vaVar = this.f12601w;
        if (z10) {
            float f13 = vaVar.E2;
            if (f13 > 0.0f) {
                this.f12594b.drawCircle(f12, f11, f10 * f13, this.f12597f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f12, f11, (1.0f - vaVar.E2) * f10, paint);
        }
        canvas.save();
        canvas.translate(this.f12599r, this.f12600s);
        vaVar.f13730j1.draw(canvas);
        canvas.restore();
    }
}

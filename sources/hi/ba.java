package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ba extends View {
    public final boolean f14224a;
    public final Canvas f14225b;
    public final float f14226c;
    public final float d;
    public final float f14227e;
    public final Paint f14228f;
    public final Bitmap h;
    public final Paint f14229n;
    public final float f14230r;
    public final float f14231s;
    public final ta f14232w;

    public ba(ta taVar, Context context, boolean z10, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14) {
        super(context);
        this.f14232w = taVar;
        this.f14224a = z10;
        this.f14225b = canvas;
        this.f14226c = f10;
        this.d = f11;
        this.f14227e = f12;
        this.f14228f = paint;
        this.h = bitmap;
        this.f14229n = paint2;
        this.f14230r = f13;
        this.f14231s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = this.f14224a;
        Paint paint = this.f14229n;
        float f10 = this.f14227e;
        float f11 = this.d;
        float f12 = this.f14226c;
        ta taVar = this.f14232w;
        if (z10) {
            float f13 = taVar.E2;
            if (f13 > 0.0f) {
                this.f14225b.drawCircle(f12, f11, f10 * f13, this.f14228f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f12, f11, (1.0f - taVar.E2) * f10, paint);
        }
        canvas.save();
        canvas.translate(this.f14230r, this.f14231s);
        taVar.f15419j1.draw(canvas);
        canvas.restore();
    }
}

package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class va extends View {
    public final boolean f15609a;
    public final Canvas f15610b;
    public final float f15611c;
    public final float d;
    public final float f15612e;
    public final Paint f15613f;
    public final Bitmap h;
    public final Paint f15614n;
    public final float f15615r;
    public final float f15616s;
    public final nb f15617w;

    public va(nb nbVar, Context context, boolean z10, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14) {
        super(context);
        this.f15617w = nbVar;
        this.f15609a = z10;
        this.f15610b = canvas;
        this.f15611c = f10;
        this.d = f11;
        this.f15612e = f12;
        this.f15613f = paint;
        this.h = bitmap;
        this.f15614n = paint2;
        this.f15615r = f13;
        this.f15616s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = this.f15609a;
        Paint paint = this.f15614n;
        float f10 = this.f15612e;
        float f11 = this.d;
        float f12 = this.f15611c;
        nb nbVar = this.f15617w;
        if (z10) {
            float f13 = nbVar.E2;
            if (f13 > 0.0f) {
                this.f15610b.drawCircle(f12, f11, f10 * f13, this.f15613f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f12, f11, (1.0f - nbVar.E2) * f10, paint);
        }
        canvas.save();
        canvas.translate(this.f15615r, this.f15616s);
        nbVar.f15086j1.draw(canvas);
        canvas.restore();
    }
}

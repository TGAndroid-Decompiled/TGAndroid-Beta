package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ba extends View {
    public final boolean f14275a;
    public final Canvas f14276b;
    public final float f14277c;
    public final float d;
    public final float f14278e;
    public final Paint f14279f;
    public final Bitmap h;
    public final Paint f14280n;
    public final float f14281r;
    public final float f14282s;
    public final ta f14283w;

    public ba(ta taVar, Context context, boolean z10, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14) {
        super(context);
        this.f14283w = taVar;
        this.f14275a = z10;
        this.f14276b = canvas;
        this.f14277c = f10;
        this.d = f11;
        this.f14278e = f12;
        this.f14279f = paint;
        this.h = bitmap;
        this.f14280n = paint2;
        this.f14281r = f13;
        this.f14282s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = this.f14275a;
        Paint paint = this.f14280n;
        float f10 = this.f14278e;
        float f11 = this.d;
        float f12 = this.f14277c;
        ta taVar = this.f14283w;
        if (z10) {
            float f13 = taVar.E2;
            if (f13 > 0.0f) {
                this.f14276b.drawCircle(f12, f11, f10 * f13, this.f14279f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f12, f11, (1.0f - taVar.E2) * f10, paint);
        }
        canvas.save();
        canvas.translate(this.f14281r, this.f14282s);
        taVar.f15452j1.draw(canvas);
        canvas.restore();
    }
}

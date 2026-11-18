package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ba extends View {
    public final boolean f14278a;
    public final Canvas f14279b;
    public final float f14280c;
    public final float d;
    public final float f14281e;
    public final Paint f14282f;
    public final Bitmap h;
    public final Paint f14283n;
    public final float f14284r;
    public final float f14285s;
    public final ta f14286w;

    public ba(ta taVar, Context context, boolean z10, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14) {
        super(context);
        this.f14286w = taVar;
        this.f14278a = z10;
        this.f14279b = canvas;
        this.f14280c = f10;
        this.d = f11;
        this.f14281e = f12;
        this.f14282f = paint;
        this.h = bitmap;
        this.f14283n = paint2;
        this.f14284r = f13;
        this.f14285s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = this.f14278a;
        Paint paint = this.f14283n;
        float f10 = this.f14281e;
        float f11 = this.d;
        float f12 = this.f14280c;
        ta taVar = this.f14286w;
        if (z10) {
            float f13 = taVar.E2;
            if (f13 > 0.0f) {
                this.f14279b.drawCircle(f12, f11, f10 * f13, this.f14282f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f12, f11, (1.0f - taVar.E2) * f10, paint);
        }
        canvas.save();
        canvas.translate(this.f14284r, this.f14285s);
        taVar.f15455j1.draw(canvas);
        canvas.restore();
    }
}

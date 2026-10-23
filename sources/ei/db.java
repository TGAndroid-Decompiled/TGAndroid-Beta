package ei;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class db extends View {
    public final boolean f8915a;
    public final Canvas f8916b;
    public final float f8917c;
    public final float d;
    public final float e;
    public final Paint f8918f;
    public final Bitmap h;
    public final Paint f8919n;
    public final float f8920r;
    public final float f8921s;
    public final vb v;

    public db(vb vbVar, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13) {
        super(context);
        this.v = vbVar;
        this.f8915a = z10;
        this.f8916b = canvas;
        this.f8917c = f7;
        this.d = f10;
        this.e = f11;
        this.f8918f = paint;
        this.h = bitmap;
        this.f8919n = paint2;
        this.f8920r = f12;
        this.f8921s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = this.f8915a;
        Paint paint = this.f8919n;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.f8917c;
        vb vbVar = this.v;
        if (z10) {
            float f12 = vbVar.D2;
            if (f12 > 0.0f) {
                this.f8916b.drawCircle(f11, f10, f7 * f12, this.f8918f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f11, f10, (1.0f - vbVar.D2) * f7, paint);
        }
        canvas.save();
        canvas.translate(this.f8920r, this.f8921s);
        vbVar.f9992i1.draw(canvas);
        canvas.restore();
    }
}

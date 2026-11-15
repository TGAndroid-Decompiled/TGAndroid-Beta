package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class aa extends View {
    public final boolean f13891a;
    public final Canvas f13892b;
    public final float f13893c;
    public final float d;
    public final float f13894e;
    public final Paint f13895f;
    public final Bitmap h;
    public final Paint f13896n;
    public final float f13897r;
    public final float f13898s;
    public final sa f13899w;

    public aa(sa saVar, Context context, boolean z10, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14) {
        super(context);
        this.f13899w = saVar;
        this.f13891a = z10;
        this.f13892b = canvas;
        this.f13893c = f10;
        this.d = f11;
        this.f13894e = f12;
        this.f13895f = paint;
        this.h = bitmap;
        this.f13896n = paint2;
        this.f13897r = f13;
        this.f13898s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = this.f13891a;
        Paint paint = this.f13896n;
        float f10 = this.f13894e;
        float f11 = this.d;
        float f12 = this.f13893c;
        sa saVar = this.f13899w;
        if (z10) {
            float f13 = saVar.E2;
            if (f13 > 0.0f) {
                this.f13892b.drawCircle(f12, f11, f10 * f13, this.f13895f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f12, f11, (1.0f - saVar.E2) * f10, paint);
        }
        canvas.save();
        canvas.translate(this.f13897r, this.f13898s);
        saVar.f15067j1.draw(canvas);
        canvas.restore();
    }
}

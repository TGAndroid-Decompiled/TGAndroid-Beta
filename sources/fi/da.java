package fi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class da extends View {
    public final boolean f11802a;
    public final Canvas f11803b;
    public final float f11804c;
    public final float d;
    public final float f11805e;
    public final Paint f11806f;
    public final Bitmap h;
    public final Paint f11807n;
    public final float f11808r;
    public final float f11809s;
    public final va f11810w;

    public da(va vaVar, Context context, boolean z9, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14) {
        super(context);
        this.f11810w = vaVar;
        this.f11802a = z9;
        this.f11803b = canvas;
        this.f11804c = f10;
        this.d = f11;
        this.f11805e = f12;
        this.f11806f = paint;
        this.h = bitmap;
        this.f11807n = paint2;
        this.f11808r = f13;
        this.f11809s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z9 = this.f11802a;
        Paint paint = this.f11807n;
        float f10 = this.f11805e;
        float f11 = this.d;
        float f12 = this.f11804c;
        va vaVar = this.f11810w;
        if (z9) {
            float f13 = vaVar.D2;
            if (f13 > 0.0f) {
                this.f11803b.drawCircle(f12, f11, f10 * f13, this.f11806f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f12, f11, (1.0f - vaVar.D2) * f10, paint);
        }
        canvas.save();
        canvas.translate(this.f11808r, this.f11809s);
        vaVar.f12965i1.draw(canvas);
        canvas.restore();
    }
}

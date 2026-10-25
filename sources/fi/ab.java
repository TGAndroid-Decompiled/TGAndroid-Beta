package fi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class ab extends View {
    public final boolean f10520a;
    public final Canvas f10521b;
    public final float f10522c;
    public final float d;
    public final float e;
    public final Paint f10523f;
    public final Bitmap h;
    public final Paint f10524n;
    public final float f10525r;
    public final float f10526s;
    public final sb v;

    public ab(sb sbVar, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13) {
        super(context);
        this.v = sbVar;
        this.f10520a = z10;
        this.f10521b = canvas;
        this.f10522c = f7;
        this.d = f10;
        this.e = f11;
        this.f10523f = paint;
        this.h = bitmap;
        this.f10524n = paint2;
        this.f10525r = f12;
        this.f10526s = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = this.f10520a;
        Paint paint = this.f10524n;
        float f7 = this.e;
        float f10 = this.d;
        float f11 = this.f10522c;
        sb sbVar = this.v;
        if (z10) {
            float f12 = sbVar.D2;
            if (f12 > 0.0f) {
                this.f10521b.drawCircle(f11, f10, f7 * f12, this.f10523f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f11, f10, (1.0f - sbVar.D2) * f7, paint);
        }
        canvas.save();
        canvas.translate(this.f10525r, this.f10526s);
        sbVar.f11633i1.draw(canvas);
        canvas.restore();
    }
}

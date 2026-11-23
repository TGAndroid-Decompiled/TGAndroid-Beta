package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class aa extends View {
    public final boolean f14259a;
    public final Canvas f14260b;
    public final float f14261c;
    public final float d;
    public final float f14262e;
    public final Paint f14263f;
    public final Bitmap h;
    public final Paint f14264n;
    public final float f14265r;
    public final float f14266s;
    public final sa f14267w;

    public aa(sa saVar, Context context, boolean z10, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14) {
        super(context);
        this.f14267w = saVar;
        this.f14259a = z10;
        this.f14260b = canvas;
        this.f14261c = f10;
        this.d = f11;
        this.f14262e = f12;
        this.f14263f = paint;
        this.h = bitmap;
        this.f14264n = paint2;
        this.f14265r = f13;
        this.f14266s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = this.f14259a;
        Paint paint = this.f14264n;
        float f10 = this.f14262e;
        float f11 = this.d;
        float f12 = this.f14261c;
        sa saVar = this.f14267w;
        if (z10) {
            float f13 = saVar.E2;
            if (f13 > 0.0f) {
                this.f14260b.drawCircle(f12, f11, f10 * f13, this.f14263f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f12, f11, (1.0f - saVar.E2) * f10, paint);
        }
        canvas.save();
        canvas.translate(this.f14265r, this.f14266s);
        saVar.f15416j1.draw(canvas);
        canvas.restore();
    }
}

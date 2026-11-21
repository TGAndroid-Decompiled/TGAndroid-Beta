package hi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class aa extends View {
    public final boolean f14256a;
    public final Canvas f14257b;
    public final float f14258c;
    public final float d;
    public final float f14259e;
    public final Paint f14260f;
    public final Bitmap h;
    public final Paint f14261n;
    public final float f14262r;
    public final float f14263s;
    public final sa f14264w;

    public aa(sa saVar, Context context, boolean z10, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14) {
        super(context);
        this.f14264w = saVar;
        this.f14256a = z10;
        this.f14257b = canvas;
        this.f14258c = f10;
        this.d = f11;
        this.f14259e = f12;
        this.f14260f = paint;
        this.h = bitmap;
        this.f14261n = paint2;
        this.f14262r = f13;
        this.f14263s = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        boolean z10 = this.f14256a;
        Paint paint = this.f14261n;
        float f10 = this.f14259e;
        float f11 = this.d;
        float f12 = this.f14258c;
        sa saVar = this.f14264w;
        if (z10) {
            float f13 = saVar.E2;
            if (f13 > 0.0f) {
                this.f14257b.drawCircle(f12, f11, f10 * f13, this.f14260f);
            }
            canvas.drawBitmap(this.h, 0.0f, 0.0f, paint);
        } else {
            canvas.drawCircle(f12, f11, (1.0f - saVar.E2) * f10, paint);
        }
        canvas.save();
        canvas.translate(this.f14262r, this.f14263s);
        saVar.f15413j1.draw(canvas);
        canvas.restore();
    }
}

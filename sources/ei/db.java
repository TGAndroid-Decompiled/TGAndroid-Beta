package ei;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.wp;
public final class db extends View {
    public final int f8904a;
    public final boolean f8905b;
    public final Canvas f8906c;
    public final float d;
    public final float e;
    public final float f8907f;
    public final Paint h;
    public final Bitmap f8908n;
    public final Paint f8909r;
    public final float f8910s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f8911w;

    public db(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(context);
        this.f8904a = i10;
        this.f8911w = notificationCenterDelegate;
        this.f8905b = z10;
        this.f8906c = canvas;
        this.d = f7;
        this.e = f10;
        this.f8907f = f11;
        this.h = paint;
        this.f8908n = bitmap;
        this.f8909r = paint2;
        this.f8910s = f12;
        this.v = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f8904a) {
            case 0:
                vb vbVar = (vb) this.f8911w;
                super.onDraw(canvas);
                boolean z10 = this.f8905b;
                Paint paint = this.f8909r;
                float f7 = this.f8907f;
                float f10 = this.e;
                float f11 = this.d;
                if (z10) {
                    float f12 = vbVar.D2;
                    if (f12 > 0.0f) {
                        this.f8906c.drawCircle(f11, f10, f7 * f12, this.h);
                    }
                    canvas.drawBitmap(this.f8908n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - vbVar.D2) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f8910s, this.v);
                vbVar.f9976i1.draw(canvas);
                canvas.restore();
                return;
            default:
                wp wpVar = (wp) this.f8911w;
                super.onDraw(canvas);
                boolean z11 = this.f8905b;
                Paint paint2 = this.f8909r;
                float f13 = this.f8907f;
                float f14 = this.e;
                float f15 = this.d;
                if (z11) {
                    float f16 = wpVar.S;
                    if (f16 > 0.0f) {
                        this.f8906c.drawCircle(f15, f14, f13 * f16, this.h);
                    }
                    canvas.drawBitmap(this.f8908n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - wpVar.S) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f8910s, this.v);
                wpVar.G.draw(canvas);
                canvas.restore();
                return;
        }
    }
}

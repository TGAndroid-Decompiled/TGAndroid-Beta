package di;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.zp;
import org.telegram.ui.k31;
public final class sb extends View {
    public final int f7792a;
    public final boolean f7793b;
    public final Canvas f7794c;
    public final float d;
    public final float e;
    public final float f7795f;
    public final Paint h;
    public final Bitmap f7796n;
    public final Paint f7797r;
    public final float f7798s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f7799w;

    public sb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(context);
        this.f7792a = i10;
        this.f7799w = notificationCenterDelegate;
        this.f7793b = z10;
        this.f7794c = canvas;
        this.d = f7;
        this.e = f10;
        this.f7795f = f11;
        this.h = paint;
        this.f7796n = bitmap;
        this.f7797r = paint2;
        this.f7798s = f12;
        this.v = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f7792a) {
            case 0:
                kc kcVar = (kc) this.f7799w;
                super.onDraw(canvas);
                boolean z10 = this.f7793b;
                Paint paint = this.f7797r;
                float f7 = this.f7795f;
                float f10 = this.e;
                float f11 = this.d;
                if (z10) {
                    float f12 = kcVar.D2;
                    if (f12 > 0.0f) {
                        this.f7794c.drawCircle(f11, f10, f7 * f12, this.h);
                    }
                    canvas.drawBitmap(this.f7796n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - kcVar.D2) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f7798s, this.v);
                kcVar.f7265i1.draw(canvas);
                canvas.restore();
                return;
            case 1:
                zp zpVar = (zp) this.f7799w;
                super.onDraw(canvas);
                boolean z11 = this.f7793b;
                Paint paint2 = this.f7797r;
                float f13 = this.f7795f;
                float f14 = this.e;
                float f15 = this.d;
                if (z11) {
                    float f16 = zpVar.S;
                    if (f16 > 0.0f) {
                        this.f7794c.drawCircle(f15, f14, f13 * f16, this.h);
                    }
                    canvas.drawBitmap(this.f7796n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - zpVar.S) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f7798s, this.v);
                zpVar.G.draw(canvas);
                canvas.restore();
                return;
            default:
                k31 k31Var = (k31) this.f7799w;
                super.onDraw(canvas);
                boolean z12 = this.f7793b;
                Paint paint3 = this.f7797r;
                float f17 = this.f7795f;
                float f18 = this.e;
                float f19 = this.d;
                if (z12) {
                    float f20 = k31Var.P;
                    if (f20 > 0.0f) {
                        this.f7794c.drawCircle(f19, f18, f17 * f20, this.h);
                    }
                    canvas.drawBitmap(this.f7796n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - k31Var.P) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f7798s, this.v);
                k31Var.F.draw(canvas);
                canvas.restore();
                return;
        }
    }
}

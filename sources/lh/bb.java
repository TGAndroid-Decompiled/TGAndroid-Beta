package lh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.ap;
import org.telegram.ui.x11;

public final class bb extends View {

    public final int f15697a;

    public final boolean f15698b;

    public final Canvas f15699c;
    public final float d;

    public final float f15700e;

    public final float f15701f;
    public final Paint h;

    public final Bitmap f15702n;

    public final Paint f15703r;

    public final float f15704s;
    public final float v;

    public final NotificationCenter.NotificationCenterDelegate f15705w;

    public bb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i10) {
        super(context);
        this.f15697a = i10;
        this.f15705w = notificationCenterDelegate;
        this.f15698b = z10;
        this.f15699c = canvas;
        this.d = f10;
        this.f15700e = f11;
        this.f15701f = f12;
        this.h = paint;
        this.f15702n = bitmap;
        this.f15703r = paint2;
        this.f15704s = f13;
        this.v = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f15697a) {
            case 0:
                sb sbVar = (sb) this.f15705w;
                super.onDraw(canvas);
                boolean z10 = this.f15698b;
                Paint paint = this.f15703r;
                float f10 = this.f15701f;
                float f11 = this.f15700e;
                float f12 = this.d;
                if (z10) {
                    float f13 = sbVar.f16827z2;
                    if (f13 > 0.0f) {
                        this.f15699c.drawCircle(f12, f11, f10 * f13, this.h);
                    }
                    canvas.drawBitmap(this.f15702n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - sbVar.f16827z2) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f15704s, this.v);
                sbVar.f16758e1.draw(canvas);
                canvas.restore();
                break;
            case 1:
                ap apVar = (ap) this.f15705w;
                super.onDraw(canvas);
                boolean z11 = this.f15698b;
                Paint paint2 = this.f15703r;
                float f14 = this.f15701f;
                float f15 = this.f15700e;
                float f16 = this.d;
                if (z11) {
                    float f17 = apVar.O;
                    if (f17 > 0.0f) {
                        this.f15699c.drawCircle(f16, f15, f14 * f17, this.h);
                    }
                    canvas.drawBitmap(this.f15702n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - apVar.O) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f15704s, this.v);
                apVar.C.draw(canvas);
                canvas.restore();
                break;
            default:
                x11 x11Var = (x11) this.f15705w;
                super.onDraw(canvas);
                boolean z12 = this.f15698b;
                Paint paint3 = this.f15703r;
                float f18 = this.f15701f;
                float f19 = this.f15700e;
                float f20 = this.d;
                if (z12) {
                    float f21 = x11Var.L;
                    if (f21 > 0.0f) {
                        this.f15699c.drawCircle(f20, f19, f18 * f21, this.h);
                    }
                    canvas.drawBitmap(this.f15702n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - x11Var.L) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f15704s, this.v);
                x11Var.B.draw(canvas);
                canvas.restore();
                break;
        }
    }
}

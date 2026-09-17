package di;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.lp;
import org.telegram.ui.f31;
public final class xb extends View {
    public final int f8447a;
    public final boolean f8448b;
    public final Canvas f8449c;
    public final float d;
    public final float f8450e;
    public final float f8451f;
    public final Paint h;
    public final Bitmap f8452n;
    public final Paint f8453r;
    public final float f8454s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f8455w;

    public xb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(context);
        this.f8447a = i10;
        this.f8455w = notificationCenterDelegate;
        this.f8448b = z10;
        this.f8449c = canvas;
        this.d = f7;
        this.f8450e = f10;
        this.f8451f = f11;
        this.h = paint;
        this.f8452n = bitmap;
        this.f8453r = paint2;
        this.f8454s = f12;
        this.v = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f8447a) {
            case 0:
                pc pcVar = (pc) this.f8455w;
                super.onDraw(canvas);
                boolean z10 = this.f8448b;
                Paint paint = this.f8453r;
                float f7 = this.f8451f;
                float f10 = this.f8450e;
                float f11 = this.d;
                if (z10) {
                    float f12 = pcVar.D2;
                    if (f12 > 0.0f) {
                        this.f8449c.drawCircle(f11, f10, f7 * f12, this.h);
                    }
                    canvas.drawBitmap(this.f8452n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - pcVar.D2) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f8454s, this.v);
                pcVar.f7898i1.draw(canvas);
                canvas.restore();
                return;
            case 1:
                lp lpVar = (lp) this.f8455w;
                super.onDraw(canvas);
                boolean z11 = this.f8448b;
                Paint paint2 = this.f8453r;
                float f13 = this.f8451f;
                float f14 = this.f8450e;
                float f15 = this.d;
                if (z11) {
                    float f16 = lpVar.S;
                    if (f16 > 0.0f) {
                        this.f8449c.drawCircle(f15, f14, f13 * f16, this.h);
                    }
                    canvas.drawBitmap(this.f8452n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - lpVar.S) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f8454s, this.v);
                lpVar.G.draw(canvas);
                canvas.restore();
                return;
            default:
                f31 f31Var = (f31) this.f8455w;
                super.onDraw(canvas);
                boolean z12 = this.f8448b;
                Paint paint3 = this.f8453r;
                float f17 = this.f8451f;
                float f18 = this.f8450e;
                float f19 = this.d;
                if (z12) {
                    float f20 = f31Var.P;
                    if (f20 > 0.0f) {
                        this.f8449c.drawCircle(f19, f18, f17 * f20, this.h);
                    }
                    canvas.drawBitmap(this.f8452n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - f31Var.P) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f8454s, this.v);
                f31Var.F.draw(canvas);
                canvas.restore();
                return;
        }
    }
}

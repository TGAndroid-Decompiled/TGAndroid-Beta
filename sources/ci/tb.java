package ci;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.cq;
import org.telegram.ui.c31;
public final class tb extends View {
    public final int f6028a;
    public final boolean f6029b;
    public final Canvas f6030c;
    public final float d;
    public final float f6031e;
    public final float f6032f;
    public final Paint h;
    public final Bitmap f6033n;
    public final Paint f6034r;
    public final float f6035s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f6036w;

    public tb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(context);
        this.f6028a = i10;
        this.f6036w = notificationCenterDelegate;
        this.f6029b = z10;
        this.f6030c = canvas;
        this.d = f7;
        this.f6031e = f10;
        this.f6032f = f11;
        this.h = paint;
        this.f6033n = bitmap;
        this.f6034r = paint2;
        this.f6035s = f12;
        this.v = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f6028a) {
            case 0:
                lc lcVar = (lc) this.f6036w;
                super.onDraw(canvas);
                boolean z10 = this.f6029b;
                Paint paint = this.f6034r;
                float f7 = this.f6032f;
                float f10 = this.f6031e;
                float f11 = this.d;
                if (z10) {
                    float f12 = lcVar.D2;
                    if (f12 > 0.0f) {
                        this.f6030c.drawCircle(f11, f10, f7 * f12, this.h);
                    }
                    canvas.drawBitmap(this.f6033n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - lcVar.D2) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f6035s, this.v);
                lcVar.f5486i1.draw(canvas);
                canvas.restore();
                return;
            case 1:
                cq cqVar = (cq) this.f6036w;
                super.onDraw(canvas);
                boolean z11 = this.f6029b;
                Paint paint2 = this.f6034r;
                float f13 = this.f6032f;
                float f14 = this.f6031e;
                float f15 = this.d;
                if (z11) {
                    float f16 = cqVar.S;
                    if (f16 > 0.0f) {
                        this.f6030c.drawCircle(f15, f14, f13 * f16, this.h);
                    }
                    canvas.drawBitmap(this.f6033n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - cqVar.S) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f6035s, this.v);
                cqVar.G.draw(canvas);
                canvas.restore();
                return;
            default:
                c31 c31Var = (c31) this.f6036w;
                super.onDraw(canvas);
                boolean z12 = this.f6029b;
                Paint paint3 = this.f6034r;
                float f17 = this.f6032f;
                float f18 = this.f6031e;
                float f19 = this.d;
                if (z12) {
                    float f20 = c31Var.P;
                    if (f20 > 0.0f) {
                        this.f6030c.drawCircle(f19, f18, f17 * f20, this.h);
                    }
                    canvas.drawBitmap(this.f6033n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - c31Var.P) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f6035s, this.v);
                c31Var.F.draw(canvas);
                canvas.restore();
                return;
        }
    }
}

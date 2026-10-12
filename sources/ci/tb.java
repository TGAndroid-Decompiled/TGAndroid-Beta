package ci;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.eq;
import org.telegram.ui.f31;
public final class tb extends View {
    public final int f6027a;
    public final boolean f6028b;
    public final Canvas f6029c;
    public final float d;
    public final float f6030e;
    public final float f6031f;
    public final Paint h;
    public final Bitmap f6032n;
    public final Paint f6033r;
    public final float f6034s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f6035w;

    public tb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(context);
        this.f6027a = i10;
        this.f6035w = notificationCenterDelegate;
        this.f6028b = z10;
        this.f6029c = canvas;
        this.d = f7;
        this.f6030e = f10;
        this.f6031f = f11;
        this.h = paint;
        this.f6032n = bitmap;
        this.f6033r = paint2;
        this.f6034s = f12;
        this.v = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f6027a) {
            case 0:
                lc lcVar = (lc) this.f6035w;
                super.onDraw(canvas);
                boolean z10 = this.f6028b;
                Paint paint = this.f6033r;
                float f7 = this.f6031f;
                float f10 = this.f6030e;
                float f11 = this.d;
                if (z10) {
                    float f12 = lcVar.D2;
                    if (f12 > 0.0f) {
                        this.f6029c.drawCircle(f11, f10, f7 * f12, this.h);
                    }
                    canvas.drawBitmap(this.f6032n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - lcVar.D2) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f6034s, this.v);
                lcVar.f5485i1.draw(canvas);
                canvas.restore();
                return;
            case 1:
                eq eqVar = (eq) this.f6035w;
                super.onDraw(canvas);
                boolean z11 = this.f6028b;
                Paint paint2 = this.f6033r;
                float f13 = this.f6031f;
                float f14 = this.f6030e;
                float f15 = this.d;
                if (z11) {
                    float f16 = eqVar.S;
                    if (f16 > 0.0f) {
                        this.f6029c.drawCircle(f15, f14, f13 * f16, this.h);
                    }
                    canvas.drawBitmap(this.f6032n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - eqVar.S) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f6034s, this.v);
                eqVar.G.draw(canvas);
                canvas.restore();
                return;
            default:
                f31 f31Var = (f31) this.f6035w;
                super.onDraw(canvas);
                boolean z12 = this.f6028b;
                Paint paint3 = this.f6033r;
                float f17 = this.f6031f;
                float f18 = this.f6030e;
                float f19 = this.d;
                if (z12) {
                    float f20 = f31Var.P;
                    if (f20 > 0.0f) {
                        this.f6029c.drawCircle(f19, f18, f17 * f20, this.h);
                    }
                    canvas.drawBitmap(this.f6032n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - f31Var.P) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f6034s, this.v);
                f31Var.F.draw(canvas);
                canvas.restore();
                return;
        }
    }
}

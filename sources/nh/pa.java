package nh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.gp;
import org.telegram.ui.z11;
public final class pa extends View {
    public final int f18363a;
    public final boolean f18364b;
    public final Canvas f18365c;
    public final float d;
    public final float f18366e;
    public final float f18367f;
    public final Paint h;
    public final Bitmap f18368n;
    public final Paint f18369r;
    public final float f18370s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f18371w;

    public pa(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f9, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(context);
        this.f18363a = i10;
        this.f18371w = notificationCenterDelegate;
        this.f18364b = z10;
        this.f18365c = canvas;
        this.d = f9;
        this.f18366e = f10;
        this.f18367f = f11;
        this.h = paint;
        this.f18368n = bitmap;
        this.f18369r = paint2;
        this.f18370s = f12;
        this.v = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f18363a) {
            case 0:
                gb gbVar = (gb) this.f18371w;
                super.onDraw(canvas);
                boolean z10 = this.f18364b;
                Paint paint = this.f18369r;
                float f9 = this.f18367f;
                float f10 = this.f18366e;
                float f11 = this.d;
                if (z10) {
                    float f12 = gbVar.f17821z2;
                    if (f12 > 0.0f) {
                        this.f18365c.drawCircle(f11, f10, f9 * f12, this.h);
                    }
                    canvas.drawBitmap(this.f18368n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - gbVar.f17821z2) * f9, paint);
                }
                canvas.save();
                canvas.translate(this.f18370s, this.v);
                gbVar.f17752e1.draw(canvas);
                canvas.restore();
                return;
            case 1:
                gp gpVar = (gp) this.f18371w;
                super.onDraw(canvas);
                boolean z11 = this.f18364b;
                Paint paint2 = this.f18369r;
                float f13 = this.f18367f;
                float f14 = this.f18366e;
                float f15 = this.d;
                if (z11) {
                    float f16 = gpVar.O;
                    if (f16 > 0.0f) {
                        this.f18365c.drawCircle(f15, f14, f13 * f16, this.h);
                    }
                    canvas.drawBitmap(this.f18368n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - gpVar.O) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f18370s, this.v);
                gpVar.C.draw(canvas);
                canvas.restore();
                return;
            default:
                z11 z11Var = (z11) this.f18371w;
                super.onDraw(canvas);
                boolean z12 = this.f18364b;
                Paint paint3 = this.f18369r;
                float f17 = this.f18367f;
                float f18 = this.f18366e;
                float f19 = this.d;
                if (z12) {
                    float f20 = z11Var.L;
                    if (f20 > 0.0f) {
                        this.f18365c.drawCircle(f19, f18, f17 * f20, this.h);
                    }
                    canvas.drawBitmap(this.f18368n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - z11Var.L) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f18370s, this.v);
                z11Var.B.draw(canvas);
                canvas.restore();
                return;
        }
    }
}

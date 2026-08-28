package kh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.cp;
import org.telegram.ui.y11;
public final class eb extends View {
    public final int f15171a;
    public final boolean f15172b;
    public final Canvas f15173c;
    public final float d;
    public final float f15174e;
    public final float f15175f;
    public final Paint h;
    public final Bitmap f15176n;
    public final Paint f15177r;
    public final float f15178s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f15179w;

    public eb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f10, float f11, float f12, Paint paint, Bitmap bitmap, Paint paint2, float f13, float f14, int i9) {
        super(context);
        this.f15171a = i9;
        this.f15179w = notificationCenterDelegate;
        this.f15172b = z10;
        this.f15173c = canvas;
        this.d = f10;
        this.f15174e = f11;
        this.f15175f = f12;
        this.h = paint;
        this.f15176n = bitmap;
        this.f15177r = paint2;
        this.f15178s = f13;
        this.v = f14;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f15171a) {
            case 0:
                wb wbVar = (wb) this.f15179w;
                super.onDraw(canvas);
                boolean z10 = this.f15172b;
                Paint paint = this.f15177r;
                float f10 = this.f15175f;
                float f11 = this.f15174e;
                float f12 = this.d;
                if (z10) {
                    float f13 = wbVar.f16331z2;
                    if (f13 > 0.0f) {
                        this.f15173c.drawCircle(f12, f11, f10 * f13, this.h);
                    }
                    canvas.drawBitmap(this.f15176n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f12, f11, (1.0f - wbVar.f16331z2) * f10, paint);
                }
                canvas.save();
                canvas.translate(this.f15178s, this.v);
                wbVar.f16262e1.draw(canvas);
                canvas.restore();
                return;
            case 1:
                cp cpVar = (cp) this.f15179w;
                super.onDraw(canvas);
                boolean z11 = this.f15172b;
                Paint paint2 = this.f15177r;
                float f14 = this.f15175f;
                float f15 = this.f15174e;
                float f16 = this.d;
                if (z11) {
                    float f17 = cpVar.O;
                    if (f17 > 0.0f) {
                        this.f15173c.drawCircle(f16, f15, f14 * f17, this.h);
                    }
                    canvas.drawBitmap(this.f15176n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f16, f15, (1.0f - cpVar.O) * f14, paint2);
                }
                canvas.save();
                canvas.translate(this.f15178s, this.v);
                cpVar.C.draw(canvas);
                canvas.restore();
                return;
            default:
                y11 y11Var = (y11) this.f15179w;
                super.onDraw(canvas);
                boolean z12 = this.f15172b;
                Paint paint3 = this.f15177r;
                float f18 = this.f15175f;
                float f19 = this.f15174e;
                float f20 = this.d;
                if (z12) {
                    float f21 = y11Var.L;
                    if (f21 > 0.0f) {
                        this.f15173c.drawCircle(f20, f19, f18 * f21, this.h);
                    }
                    canvas.drawBitmap(this.f15176n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f20, f19, (1.0f - y11Var.L) * f18, paint3);
                }
                canvas.save();
                canvas.translate(this.f15178s, this.v);
                y11Var.B.draw(canvas);
                canvas.restore();
                return;
        }
    }
}

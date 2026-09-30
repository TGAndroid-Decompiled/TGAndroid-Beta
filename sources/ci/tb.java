package ci;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.pp;
import org.telegram.ui.v21;
public final class tb extends View {
    public final int f5582a;
    public final boolean f5583b;
    public final Canvas f5584c;
    public final float d;
    public final float e;
    public final float f5585f;
    public final Paint h;
    public final Bitmap f5586n;
    public final Paint f5587r;
    public final float f5588s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f5589w;

    public tb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(context);
        this.f5582a = i10;
        this.f5589w = notificationCenterDelegate;
        this.f5583b = z10;
        this.f5584c = canvas;
        this.d = f7;
        this.e = f10;
        this.f5585f = f11;
        this.h = paint;
        this.f5586n = bitmap;
        this.f5587r = paint2;
        this.f5588s = f12;
        this.v = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f5582a) {
            case 0:
                lc lcVar = (lc) this.f5589w;
                super.onDraw(canvas);
                boolean z10 = this.f5583b;
                Paint paint = this.f5587r;
                float f7 = this.f5585f;
                float f10 = this.e;
                float f11 = this.d;
                if (z10) {
                    float f12 = lcVar.D2;
                    if (f12 > 0.0f) {
                        this.f5584c.drawCircle(f11, f10, f7 * f12, this.h);
                    }
                    canvas.drawBitmap(this.f5586n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - lcVar.D2) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f5588s, this.v);
                lcVar.f5061i1.draw(canvas);
                canvas.restore();
                return;
            case 1:
                pp ppVar = (pp) this.f5589w;
                super.onDraw(canvas);
                boolean z11 = this.f5583b;
                Paint paint2 = this.f5587r;
                float f13 = this.f5585f;
                float f14 = this.e;
                float f15 = this.d;
                if (z11) {
                    float f16 = ppVar.S;
                    if (f16 > 0.0f) {
                        this.f5584c.drawCircle(f15, f14, f13 * f16, this.h);
                    }
                    canvas.drawBitmap(this.f5586n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - ppVar.S) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f5588s, this.v);
                ppVar.G.draw(canvas);
                canvas.restore();
                return;
            default:
                v21 v21Var = (v21) this.f5589w;
                super.onDraw(canvas);
                boolean z12 = this.f5583b;
                Paint paint3 = this.f5587r;
                float f17 = this.f5585f;
                float f18 = this.e;
                float f19 = this.d;
                if (z12) {
                    float f20 = v21Var.P;
                    if (f20 > 0.0f) {
                        this.f5584c.drawCircle(f19, f18, f17 * f20, this.h);
                    }
                    canvas.drawBitmap(this.f5586n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - v21Var.P) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f5588s, this.v);
                v21Var.F.draw(canvas);
                canvas.restore();
                return;
        }
    }
}

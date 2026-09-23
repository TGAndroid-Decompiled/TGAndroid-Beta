package ci;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.np;
import org.telegram.ui.w21;
public final class tb extends View {
    public final int f5573a;
    public final boolean f5574b;
    public final Canvas f5575c;
    public final float d;
    public final float e;
    public final float f5576f;
    public final Paint h;
    public final Bitmap f5577n;
    public final Paint f5578r;
    public final float f5579s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f5580w;

    public tb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(context);
        this.f5573a = i10;
        this.f5580w = notificationCenterDelegate;
        this.f5574b = z10;
        this.f5575c = canvas;
        this.d = f7;
        this.e = f10;
        this.f5576f = f11;
        this.h = paint;
        this.f5577n = bitmap;
        this.f5578r = paint2;
        this.f5579s = f12;
        this.v = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f5573a) {
            case 0:
                lc lcVar = (lc) this.f5580w;
                super.onDraw(canvas);
                boolean z10 = this.f5574b;
                Paint paint = this.f5578r;
                float f7 = this.f5576f;
                float f10 = this.e;
                float f11 = this.d;
                if (z10) {
                    float f12 = lcVar.D2;
                    if (f12 > 0.0f) {
                        this.f5575c.drawCircle(f11, f10, f7 * f12, this.h);
                    }
                    canvas.drawBitmap(this.f5577n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - lcVar.D2) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f5579s, this.v);
                lcVar.f5054i1.draw(canvas);
                canvas.restore();
                return;
            case 1:
                np npVar = (np) this.f5580w;
                super.onDraw(canvas);
                boolean z11 = this.f5574b;
                Paint paint2 = this.f5578r;
                float f13 = this.f5576f;
                float f14 = this.e;
                float f15 = this.d;
                if (z11) {
                    float f16 = npVar.S;
                    if (f16 > 0.0f) {
                        this.f5575c.drawCircle(f15, f14, f13 * f16, this.h);
                    }
                    canvas.drawBitmap(this.f5577n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - npVar.S) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f5579s, this.v);
                npVar.G.draw(canvas);
                canvas.restore();
                return;
            default:
                w21 w21Var = (w21) this.f5580w;
                super.onDraw(canvas);
                boolean z12 = this.f5574b;
                Paint paint3 = this.f5578r;
                float f17 = this.f5576f;
                float f18 = this.e;
                float f19 = this.d;
                if (z12) {
                    float f20 = w21Var.P;
                    if (f20 > 0.0f) {
                        this.f5575c.drawCircle(f19, f18, f17 * f20, this.h);
                    }
                    canvas.drawBitmap(this.f5577n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - w21Var.P) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f5579s, this.v);
                w21Var.F.draw(canvas);
                canvas.restore();
                return;
        }
    }
}

package bi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sp;
import org.telegram.ui.j31;
public final class gd extends View {
    public final int f2765a;
    public final boolean f2766b;
    public final Canvas f2767c;
    public final float d;
    public final float e;
    public final float f2768f;
    public final Paint h;
    public final Bitmap f2769n;
    public final Paint f2770r;
    public final float f2771s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f2772w;

    public gd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(context);
        this.f2765a = i10;
        this.f2772w = notificationCenterDelegate;
        this.f2766b = z10;
        this.f2767c = canvas;
        this.d = f7;
        this.e = f10;
        this.f2768f = f11;
        this.h = paint;
        this.f2769n = bitmap;
        this.f2770r = paint2;
        this.f2771s = f12;
        this.v = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f2765a) {
            case 0:
                ce ceVar = (ce) this.f2772w;
                super.onDraw(canvas);
                boolean z10 = this.f2766b;
                Paint paint = this.f2770r;
                float f7 = this.f2768f;
                float f10 = this.e;
                float f11 = this.d;
                if (z10) {
                    float f12 = ceVar.D2;
                    if (f12 > 0.0f) {
                        this.f2767c.drawCircle(f11, f10, f7 * f12, this.h);
                    }
                    canvas.drawBitmap(this.f2769n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - ceVar.D2) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f2771s, this.v);
                ceVar.f2458i1.draw(canvas);
                canvas.restore();
                return;
            case 1:
                sp spVar = (sp) this.f2772w;
                super.onDraw(canvas);
                boolean z11 = this.f2766b;
                Paint paint2 = this.f2770r;
                float f13 = this.f2768f;
                float f14 = this.e;
                float f15 = this.d;
                if (z11) {
                    float f16 = spVar.S;
                    if (f16 > 0.0f) {
                        this.f2767c.drawCircle(f15, f14, f13 * f16, this.h);
                    }
                    canvas.drawBitmap(this.f2769n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - spVar.S) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f2771s, this.v);
                spVar.G.draw(canvas);
                canvas.restore();
                return;
            default:
                j31 j31Var = (j31) this.f2772w;
                super.onDraw(canvas);
                boolean z12 = this.f2766b;
                Paint paint3 = this.f2770r;
                float f17 = this.f2768f;
                float f18 = this.e;
                float f19 = this.d;
                if (z12) {
                    float f20 = j31Var.P;
                    if (f20 > 0.0f) {
                        this.f2767c.drawCircle(f19, f18, f17 * f20, this.h);
                    }
                    canvas.drawBitmap(this.f2769n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - j31Var.P) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f2771s, this.v);
                j31Var.F.draw(canvas);
                canvas.restore();
                return;
        }
    }
}

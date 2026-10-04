package ci;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.pp;
import org.telegram.ui.x21;
public final class sb extends View {
    public final int f5925a;
    public final boolean f5926b;
    public final Canvas f5927c;
    public final float d;
    public final float f5928e;
    public final float f5929f;
    public final Paint h;
    public final Bitmap f5930n;
    public final Paint f5931r;
    public final float f5932s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f5933w;

    public sb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(context);
        this.f5925a = i10;
        this.f5933w = notificationCenterDelegate;
        this.f5926b = z10;
        this.f5927c = canvas;
        this.d = f7;
        this.f5928e = f10;
        this.f5929f = f11;
        this.h = paint;
        this.f5930n = bitmap;
        this.f5931r = paint2;
        this.f5932s = f12;
        this.v = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f5925a) {
            case 0:
                kc kcVar = (kc) this.f5933w;
                super.onDraw(canvas);
                boolean z10 = this.f5926b;
                Paint paint = this.f5931r;
                float f7 = this.f5929f;
                float f10 = this.f5928e;
                float f11 = this.d;
                if (z10) {
                    float f12 = kcVar.D2;
                    if (f12 > 0.0f) {
                        this.f5927c.drawCircle(f11, f10, f7 * f12, this.h);
                    }
                    canvas.drawBitmap(this.f5930n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - kcVar.D2) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f5932s, this.v);
                kcVar.f5402i1.draw(canvas);
                canvas.restore();
                return;
            case 1:
                pp ppVar = (pp) this.f5933w;
                super.onDraw(canvas);
                boolean z11 = this.f5926b;
                Paint paint2 = this.f5931r;
                float f13 = this.f5929f;
                float f14 = this.f5928e;
                float f15 = this.d;
                if (z11) {
                    float f16 = ppVar.S;
                    if (f16 > 0.0f) {
                        this.f5927c.drawCircle(f15, f14, f13 * f16, this.h);
                    }
                    canvas.drawBitmap(this.f5930n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - ppVar.S) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f5932s, this.v);
                ppVar.G.draw(canvas);
                canvas.restore();
                return;
            default:
                x21 x21Var = (x21) this.f5933w;
                super.onDraw(canvas);
                boolean z12 = this.f5926b;
                Paint paint3 = this.f5931r;
                float f17 = this.f5929f;
                float f18 = this.f5928e;
                float f19 = this.d;
                if (z12) {
                    float f20 = x21Var.P;
                    if (f20 > 0.0f) {
                        this.f5927c.drawCircle(f19, f18, f17 * f20, this.h);
                    }
                    canvas.drawBitmap(this.f5930n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - x21Var.P) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f5932s, this.v);
                x21Var.F.draw(canvas);
                canvas.restore();
                return;
        }
    }
}

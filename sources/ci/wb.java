package ci;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.mp;
import org.telegram.ui.e31;
public final class wb extends View {
    public final int f5719a;
    public final boolean f5720b;
    public final Canvas f5721c;
    public final float d;
    public final float e;
    public final float f5722f;
    public final Paint h;
    public final Bitmap f5723n;
    public final Paint f5724r;
    public final float f5725s;
    public final float v;
    public final NotificationCenter.NotificationCenterDelegate f5726w;

    public wb(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, boolean z10, Canvas canvas, float f7, float f10, float f11, Paint paint, Bitmap bitmap, Paint paint2, float f12, float f13, int i10) {
        super(context);
        this.f5719a = i10;
        this.f5726w = notificationCenterDelegate;
        this.f5720b = z10;
        this.f5721c = canvas;
        this.d = f7;
        this.e = f10;
        this.f5722f = f11;
        this.h = paint;
        this.f5723n = bitmap;
        this.f5724r = paint2;
        this.f5725s = f12;
        this.v = f13;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.f5719a) {
            case 0:
                oc ocVar = (oc) this.f5726w;
                super.onDraw(canvas);
                boolean z10 = this.f5720b;
                Paint paint = this.f5724r;
                float f7 = this.f5722f;
                float f10 = this.e;
                float f11 = this.d;
                if (z10) {
                    float f12 = ocVar.D2;
                    if (f12 > 0.0f) {
                        this.f5721c.drawCircle(f11, f10, f7 * f12, this.h);
                    }
                    canvas.drawBitmap(this.f5723n, 0.0f, 0.0f, paint);
                } else {
                    canvas.drawCircle(f11, f10, (1.0f - ocVar.D2) * f7, paint);
                }
                canvas.save();
                canvas.translate(this.f5725s, this.v);
                ocVar.f5233i1.draw(canvas);
                canvas.restore();
                return;
            case 1:
                mp mpVar = (mp) this.f5726w;
                super.onDraw(canvas);
                boolean z11 = this.f5720b;
                Paint paint2 = this.f5724r;
                float f13 = this.f5722f;
                float f14 = this.e;
                float f15 = this.d;
                if (z11) {
                    float f16 = mpVar.S;
                    if (f16 > 0.0f) {
                        this.f5721c.drawCircle(f15, f14, f13 * f16, this.h);
                    }
                    canvas.drawBitmap(this.f5723n, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f15, f14, (1.0f - mpVar.S) * f13, paint2);
                }
                canvas.save();
                canvas.translate(this.f5725s, this.v);
                mpVar.G.draw(canvas);
                canvas.restore();
                return;
            default:
                e31 e31Var = (e31) this.f5726w;
                super.onDraw(canvas);
                boolean z12 = this.f5720b;
                Paint paint3 = this.f5724r;
                float f17 = this.f5722f;
                float f18 = this.e;
                float f19 = this.d;
                if (z12) {
                    float f20 = e31Var.P;
                    if (f20 > 0.0f) {
                        this.f5721c.drawCircle(f19, f18, f17 * f20, this.h);
                    }
                    canvas.drawBitmap(this.f5723n, 0.0f, 0.0f, paint3);
                } else {
                    canvas.drawCircle(f19, f18, (1.0f - e31Var.P) * f17, paint3);
                }
                canvas.save();
                canvas.translate(this.f5725s, this.v);
                e31Var.F.draw(canvas);
                canvas.restore();
                return;
        }
    }
}

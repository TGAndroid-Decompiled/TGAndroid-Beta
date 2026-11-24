package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import org.telegram.ui.ActionBar.d;
public final class xg1 extends View {
    public final byte a;
    public final Canvas b;
    public final float c;
    public final float d;
    public final float e;
    public final Paint f;
    public final Bitmap h;
    public final Paint n;
    public final float r;
    public final float s;
    public final d w;

    public xg1(d dVar, Activity activity, Canvas canvas, float f, float f2, float f3, Paint paint, Bitmap bitmap, Paint paint2, float f4, float f5, byte b) {
        super(activity);
        this.a = b;
        this.w = dVar;
        this.b = canvas;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = paint;
        this.h = bitmap;
        this.n = paint2;
        this.r = f4;
        this.s = f5;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        byte b = this.a;
        float f = this.s;
        float f2 = this.r;
        Bitmap bitmap = this.h;
        Paint paint = this.f;
        Canvas canvas2 = this.b;
        d dVar = this.w;
        float f3 = this.c;
        float f4 = this.d;
        float f5 = this.e;
        Paint paint2 = this.n;
        switch (b) {
            case 0:
                super.onDraw(canvas);
                nh1 nh1Var = (nh1) dVar;
                boolean z = nh1Var.K;
                float f6 = nh1Var.o0;
                if (z) {
                    if (f6 > 0.0f) {
                        canvas2.drawCircle(f3, f4, f5 * f6, paint);
                    }
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f3, f4, (1.0f - f6) * f5, paint2);
                }
                canvas.save();
                canvas.translate(f2, f);
                nh1Var.M.draw(canvas);
                canvas.restore();
                return;
            case 1:
                super.onDraw(canvas);
                a18 a18Var = (a18) dVar;
                boolean z2 = a18Var.T;
                float f7 = a18Var.Z;
                if (z2) {
                    if (f7 > 0.0f) {
                        canvas2.drawCircle(f3, f4, f5 * f7, paint);
                    }
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f3, f4, (1.0f - f7) * f5, paint2);
                }
                canvas.save();
                canvas.translate(f2, f);
                a18Var.L.draw(canvas);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                qmb qmbVar = (qmb) dVar;
                boolean a = qmbVar.a.a();
                float f8 = qmbVar.k2;
                if (a) {
                    if (f8 > 0.0f) {
                        canvas2.drawCircle(f3, f4, f5 * f8, paint);
                    }
                    canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint2);
                } else {
                    canvas.drawCircle(f3, f4, (1.0f - f8) * f5, paint2);
                }
                canvas.save();
                canvas.translate(f2, f);
                qmbVar.Q1.draw(canvas);
                canvas.restore();
                return;
        }
    }
}

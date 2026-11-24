package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class la1 extends View {
    public final ImageReceiver a;
    public final ImageReceiver b;
    public final pc0 c;
    public final fl0 d;
    public final fl0 e;
    public final Paint f;
    public final Paint h;
    public float n;
    public float r;
    public float s;
    public boolean w;
    public long x;

    public la1(Context context) {
        super(context);
        this.a = new ImageReceiver(this);
        this.b = new ImageReceiver(this);
        this.c = new pc0((ylb) null);
        fl0 fl0Var = new fl0(9);
        this.d = fl0Var;
        fl0 fl0Var2 = new fl0(12);
        this.e = fl0Var2;
        Paint paint = new Paint(1);
        this.f = paint;
        Paint paint2 = new Paint();
        this.h = paint2;
        paint2.setColor(Integer.MIN_VALUE);
        paint.setColor(cmb.w0(null, cmb.gh, false));
        fl0Var.a = 48.0f;
        fl0Var.b = 58.999996f;
        fl0Var2.a = 51.0f;
        fl0Var2.b = 61.0f;
        fl0Var.b();
        fl0Var2.b();
    }

    public final void a(TLObject tLObject) {
        gn5 gn5Var;
        gn5 a;
        pc0 pc0Var = this.c;
        pc0Var.o(tLObject);
        this.a.U(tLObject, pc0Var, null);
        if (tLObject instanceof TLRPC.User) {
            a = gn5.l(z8c.t0, 1, (TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            a = gn5.a(1, (TLRPC.Chat) tLObject);
        } else {
            gn5Var = null;
            this.b.d0(gn5Var, "50_50_b", new ColorDrawable(cmb.w0(null, cmb.jh, false)), null, tLObject, 0);
            invalidate();
        }
        gn5Var = a;
        this.b.d0(gn5Var, "50_50_b", new ColorDrawable(cmb.w0(null, cmb.jh, false)), null, tLObject, 0);
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.I();
        this.b.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        this.b.K();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int height;
        long min;
        float f;
        int width = getWidth();
        float f2 = width;
        float height2 = getHeight();
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(0.0f, 0.0f, f2, height2);
        imageReceiver.h(canvas, null);
        canvas.drawRect(0.0f, 0.0f, f2, height2, this.h);
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.x;
        if (j == 0) {
            min = 16;
        } else {
            min = Math.min(48L, uptimeMillis - j);
        }
        this.x = uptimeMillis;
        float f3 = this.n;
        float f4 = (float) min;
        this.n = (Math.min(1.0f, f4 / 120.0f) * (this.r - f3)) + f3;
        float f5 = this.s;
        if (this.w) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        this.s = (Math.min(1.0f, f4 / 200.0f) * (f - f5)) + f5;
        float min2 = Math.min(width, height) * 0.42f;
        float f6 = f2 / 2.0f;
        float min3 = (height2 / 2.0f) - (Math.min(width, height) * 0.04f);
        if (this.s > 0.01f) {
            float f7 = this.n;
            fl0 fl0Var = this.e;
            fl0Var.e(f7, 1.0f);
            float f8 = this.n;
            fl0 fl0Var2 = this.d;
            fl0Var2.e(f8, 1.0f);
            float f9 = (((this.n * 0.8f) + 1.0f) * min2) / 100.0f;
            canvas.save();
            canvas.translate(f6, min3);
            canvas.scale(f9, f9);
            int i = (int) (this.s * 76.0f);
            Paint paint = this.f;
            paint.setAlpha(i);
            fl0Var.a(0.0f, 0.0f, canvas, paint);
            paint.setAlpha((int) (this.s * 110.0f));
            fl0Var2.a(0.0f, 0.0f, canvas, paint);
            canvas.restore();
        }
        float f10 = (this.n * 0.2f * this.s) + 1.0f;
        float f11 = min2 / 2.0f;
        ImageReceiver imageReceiver2 = this.a;
        imageReceiver2.q0((int) f11);
        imageReceiver2.i0(f6 - f11, min3 - f11, min2, min2);
        canvas.save();
        canvas.scale(f10, f10, f6, min3);
        imageReceiver2.h(canvas, null);
        canvas.restore();
        if (this.s <= 0.01f && Math.abs(this.r - this.n) <= 0.005f) {
            this.x = 0L;
        } else {
            invalidate();
        }
    }
}

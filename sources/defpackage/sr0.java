package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class sr0 extends Drawable implements zy {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public final Drawable f;
    public int h;

    public sr0(Context context, TLRPC.User user, TLRPC.User user2) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Paint(1);
        Paint paint2 = new Paint(1);
        this.c = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.e = imageReceiver2;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(gm.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-1);
        Drawable mutate = context.getResources().getDrawable(2131231132).mutate();
        this.f = mutate;
        int w0 = cmb.w0(null, cmb.K5, false);
        this.h = w0;
        mutate.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
        pc0 pc0Var = new pc0((ylb) null);
        pc0Var.q(user);
        imageReceiver.U(user, pc0Var, null);
        imageReceiver.q0(gm.L(25.0f));
        pc0 pc0Var2 = new pc0((ylb) null);
        pc0Var2.q(user2);
        imageReceiver2.U(user2, pc0Var2, null);
        imageReceiver2.q0(gm.L(25.0f));
    }

    @Override
    public final void a(s09 s09Var) {
        this.e.p0(s09Var);
        this.d.p0(s09Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.d.K();
        this.e.K();
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.d.I();
        this.e.I();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = cmb.K5;
        int w0 = cmb.w0(null, i, false);
        Paint paint = this.b;
        paint.setColor(w0);
        float L = gm.L(136.0f) / 2.0f;
        ImageReceiver imageReceiver = this.d;
        imageReceiver.i0(bounds.centerX() - L, bounds.centerY() - gm.L(25.0f), gm.L(50.0f), gm.L(50.0f));
        imageReceiver.h(canvas, null);
        float centerX = (bounds.centerX() - L) + gm.L(41.0f);
        float L2 = gm.L(16.0f) + bounds.centerY();
        canvas.drawCircle(centerX, L2, gm.L(14.0f), paint);
        canvas.drawCircle(centerX, L2, gm.L(12.0f), this.c);
        int w02 = cmb.w0(null, i, false);
        int i2 = this.h;
        Drawable drawable = this.f;
        if (w02 != i2) {
            this.h = w02;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        drawable.setBounds((int) (centerX - gm.L(9.0f)), (int) (L2 - gm.L(9.0f)), (int) (centerX + gm.L(9.0f)), (int) (L2 + gm.L(9.0f)));
        drawable.draw(canvas);
        int centerX2 = bounds.centerX();
        Paint paint2 = this.a;
        canvas.drawLine(bounds.centerX() - gm.L(3.33f), bounds.centerY() - gm.L(7.0f), gm.L(3.33f) + centerX2, bounds.centerY(), paint2);
        canvas.drawLine(bounds.centerX() - gm.L(3.33f), gm.L(7.0f) + bounds.centerY(), gm.L(3.33f) + bounds.centerX(), bounds.centerY(), paint2);
        ImageReceiver imageReceiver2 = this.e;
        imageReceiver2.i0((bounds.centerX() + L) - gm.L(50.0f), bounds.centerY() - gm.L(25.0f), gm.L(50.0f), gm.L(50.0f));
        imageReceiver2.h(canvas, null);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

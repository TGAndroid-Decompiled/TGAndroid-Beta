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
public final class sq0 extends Drawable implements zx {
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final ImageReceiver d;
    public final ImageReceiver e;
    public final Drawable f;
    public int h;

    public sq0(Context context, TLRPC.User user, TLRPC.User user2) {
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
        paint.setStrokeWidth(hl.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-1);
        Drawable mutate = context.getResources().getDrawable(2131231131).mutate();
        this.f = mutate;
        int w0 = aob.w0(null, aob.L5, false);
        this.h = w0;
        mutate.setColorFilter(new PorterDuffColorFilter(w0, PorterDuff.Mode.SRC_IN));
        rb0 rb0Var = new rb0((vnb) null);
        rb0Var.q(user);
        imageReceiver.U(user, rb0Var, null);
        imageReceiver.q0(hl.L(25.0f));
        rb0 rb0Var2 = new rb0((vnb) null);
        rb0Var2.q(user2);
        imageReceiver2.U(user2, rb0Var2, null);
        imageReceiver2.q0(hl.L(25.0f));
    }

    @Override
    public final void a(e29 e29Var) {
        this.e.p0(e29Var);
        this.d.p0(e29Var);
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
        int i = aob.L5;
        int w0 = aob.w0(null, i, false);
        Paint paint = this.b;
        paint.setColor(w0);
        float L = hl.L(136.0f) / 2.0f;
        ImageReceiver imageReceiver = this.d;
        imageReceiver.i0(bounds.centerX() - L, bounds.centerY() - hl.L(25.0f), hl.L(50.0f), hl.L(50.0f));
        imageReceiver.h(canvas, null);
        float centerX = (bounds.centerX() - L) + hl.L(41.0f);
        float L2 = hl.L(16.0f) + bounds.centerY();
        canvas.drawCircle(centerX, L2, hl.L(14.0f), paint);
        canvas.drawCircle(centerX, L2, hl.L(12.0f), this.c);
        int w02 = aob.w0(null, i, false);
        int i2 = this.h;
        Drawable drawable = this.f;
        if (w02 != i2) {
            this.h = w02;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.SRC_IN));
        }
        drawable.setBounds((int) (centerX - hl.L(9.0f)), (int) (L2 - hl.L(9.0f)), (int) (centerX + hl.L(9.0f)), (int) (L2 + hl.L(9.0f)));
        drawable.draw(canvas);
        int centerX2 = bounds.centerX();
        Paint paint2 = this.a;
        canvas.drawLine(bounds.centerX() - hl.L(3.33f), bounds.centerY() - hl.L(7.0f), hl.L(3.33f) + centerX2, bounds.centerY(), paint2);
        canvas.drawLine(bounds.centerX() - hl.L(3.33f), hl.L(7.0f) + bounds.centerY(), hl.L(3.33f) + bounds.centerX(), bounds.centerY(), paint2);
        ImageReceiver imageReceiver2 = this.e;
        imageReceiver2.i0((bounds.centerX() + L) - hl.L(50.0f), bounds.centerY() - hl.L(25.0f), hl.L(50.0f), hl.L(50.0f));
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

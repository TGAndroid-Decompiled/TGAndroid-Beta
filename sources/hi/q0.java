package hi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.w8;
public final class q0 extends Drawable implements r6 {
    public final Paint f14877a;
    public final Paint f14878b;
    public final Paint f14879c;
    public final ImageReceiver d;
    public final ImageReceiver f14880e;
    public final Drawable f14881f;
    public int h;

    public q0(Context context, TLRPC.User user, TLRPC.User user2) {
        Paint paint = new Paint(1);
        this.f14877a = paint;
        this.f14878b = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f14879c = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.f14880e = imageReceiver2;
        new RectF();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-1);
        Drawable mutate = context.getResources().getDrawable(2131231129).mutate();
        this.f14881f = mutate;
        int x02 = k6.x0(null, k6.L5, false);
        this.h = x02;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        w8 w8Var = new w8((f6) null);
        w8Var.r(user);
        imageReceiver.i0(user, w8Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(25.0f));
        w8 w8Var2 = new w8((f6) null);
        w8Var2.r(user2);
        imageReceiver2.i0(user2, w8Var2, null);
        imageReceiver2.J0(org.telegram.messenger.g0.L(25.0f));
    }

    @Override
    public final void a(ch0 ch0Var) {
        this.f14880e.H0(ch0Var);
        this.d.H0(ch0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.d.R();
        this.f14880e.R();
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.d.P();
        this.f14880e.P();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i7 = k6.L5;
        int x02 = k6.x0(null, i7, false);
        Paint paint = this.f14878b;
        paint.setColor(x02);
        float L = org.telegram.messenger.g0.L(136.0f) / 2.0f;
        ImageReceiver imageReceiver = this.d;
        imageReceiver.y0(bounds.centerX() - L, bounds.centerY() - org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
        imageReceiver.h(canvas, null);
        float centerX = (bounds.centerX() - L) + org.telegram.messenger.g0.L(41.0f);
        float L2 = org.telegram.messenger.g0.L(16.0f) + bounds.centerY();
        canvas.drawCircle(centerX, L2, org.telegram.messenger.g0.L(14.0f), paint);
        canvas.drawCircle(centerX, L2, org.telegram.messenger.g0.L(12.0f), this.f14879c);
        int x03 = k6.x0(null, i7, false);
        int i10 = this.h;
        Drawable drawable = this.f14881f;
        if (x03 != i10) {
            this.h = x03;
            drawable.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.SRC_IN));
        }
        drawable.setBounds((int) (centerX - org.telegram.messenger.g0.L(9.0f)), (int) (L2 - org.telegram.messenger.g0.L(9.0f)), (int) (centerX + org.telegram.messenger.g0.L(9.0f)), (int) (L2 + org.telegram.messenger.g0.L(9.0f)));
        drawable.draw(canvas);
        int centerX2 = bounds.centerX();
        Paint paint2 = this.f14877a;
        canvas.drawLine(bounds.centerX() - org.telegram.messenger.g0.L(3.33f), bounds.centerY() - org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(3.33f) + centerX2, bounds.centerY(), paint2);
        canvas.drawLine(bounds.centerX() - org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(7.0f) + bounds.centerY(), org.telegram.messenger.g0.L(3.33f) + bounds.centerX(), bounds.centerY(), paint2);
        ImageReceiver imageReceiver2 = this.f14880e;
        imageReceiver2.y0((bounds.centerX() + L) - org.telegram.messenger.g0.L(50.0f), bounds.centerY() - org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
        imageReceiver2.h(canvas, null);
    }

    @Override
    public final int getOpacity() {
        return -2;
    }

    @Override
    public final void setAlpha(int i7) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}

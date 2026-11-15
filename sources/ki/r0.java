package ki;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.t8;
public final class r0 extends Drawable implements p6 {
    public final Paint f18522a;
    public final Paint f18523b;
    public final Paint f18524c;
    public final ImageReceiver d;
    public final ImageReceiver f18525e;
    public final Drawable f18526f;
    public int h;

    public r0(Context context, TLRPC.User user, TLRPC.User user2) {
        Paint paint = new Paint(1);
        this.f18522a = paint;
        this.f18523b = new Paint(1);
        Paint paint2 = new Paint(1);
        this.f18524c = paint2;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.d = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.f18525e = imageReceiver2;
        new RectF();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setColor(-1);
        Drawable mutate = context.getResources().getDrawable(2131231129).mutate();
        this.f18526f = mutate;
        int x02 = j6.x0(null, j6.L5, false);
        this.h = x02;
        mutate.setColorFilter(new PorterDuffColorFilter(x02, PorterDuff.Mode.SRC_IN));
        t8 t8Var = new t8((e6) null);
        t8Var.r(user);
        imageReceiver.i0(user, t8Var, null);
        imageReceiver.J0(org.telegram.messenger.g0.L(25.0f));
        t8 t8Var2 = new t8((e6) null);
        t8Var2.r(user2);
        imageReceiver2.i0(user2, t8Var2, null);
        imageReceiver2.J0(org.telegram.messenger.g0.L(25.0f));
    }

    @Override
    public final void a(fh0 fh0Var) {
        this.f18525e.H0(fh0Var);
        this.d.H0(fh0Var);
    }

    @Override
    public final void b(ImageReceiver imageReceiver) {
        this.d.R();
        this.f18525e.R();
    }

    @Override
    public final void c(ImageReceiver imageReceiver) {
        this.d.P();
        this.f18525e.P();
    }

    @Override
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i7 = j6.L5;
        int x02 = j6.x0(null, i7, false);
        Paint paint = this.f18523b;
        paint.setColor(x02);
        float L = org.telegram.messenger.g0.L(136.0f) / 2.0f;
        ImageReceiver imageReceiver = this.d;
        imageReceiver.y0(bounds.centerX() - L, bounds.centerY() - org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(50.0f));
        imageReceiver.h(canvas, null);
        float centerX = (bounds.centerX() - L) + org.telegram.messenger.g0.L(41.0f);
        float L2 = org.telegram.messenger.g0.L(16.0f) + bounds.centerY();
        canvas.drawCircle(centerX, L2, org.telegram.messenger.g0.L(14.0f), paint);
        canvas.drawCircle(centerX, L2, org.telegram.messenger.g0.L(12.0f), this.f18524c);
        int x03 = j6.x0(null, i7, false);
        int i10 = this.h;
        Drawable drawable = this.f18526f;
        if (x03 != i10) {
            this.h = x03;
            drawable.setColorFilter(new PorterDuffColorFilter(x03, PorterDuff.Mode.SRC_IN));
        }
        drawable.setBounds((int) (centerX - org.telegram.messenger.g0.L(9.0f)), (int) (L2 - org.telegram.messenger.g0.L(9.0f)), (int) (centerX + org.telegram.messenger.g0.L(9.0f)), (int) (L2 + org.telegram.messenger.g0.L(9.0f)));
        drawable.draw(canvas);
        int centerX2 = bounds.centerX();
        Paint paint2 = this.f18522a;
        canvas.drawLine(bounds.centerX() - org.telegram.messenger.g0.L(3.33f), bounds.centerY() - org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(3.33f) + centerX2, bounds.centerY(), paint2);
        canvas.drawLine(bounds.centerX() - org.telegram.messenger.g0.L(3.33f), org.telegram.messenger.g0.L(7.0f) + bounds.centerY(), org.telegram.messenger.g0.L(3.33f) + bounds.centerX(), bounds.centerY(), paint2);
        ImageReceiver imageReceiver2 = this.f18525e;
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

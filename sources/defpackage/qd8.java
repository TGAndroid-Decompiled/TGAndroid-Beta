package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
public final class qd8 extends ld8 implements Drawable.Callback, x74 {
    public final String b;
    public final Drawable d;
    public final ih2 f;
    public kd8 h;
    public TLRPC.WebPage n;
    public final fm0 r;
    public final fm0 s;
    public final kp c = new kp((byte) 11, false);
    public final Paint e = new Paint(1);

    public qd8(String str) {
        ih2 ih2Var = new ih2(-1);
        this.f = ih2Var;
        s33 s33Var = s33.h;
        this.r = new fm0(0, this, s33Var, 320L, false);
        this.s = new fm0(0, this, s33Var, 320L, false);
        this.b = str;
        this.a.q0(gl.L(7.0f));
        this.d = b00.d(a.b, 2131231749);
        ih2Var.setCallback(this);
        ih2Var.b(bkb.w0(null, bkb.n7, false));
        ih2Var.a = gl.L(15.0f);
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (kd8) view;
    }

    @Override
    public final void b() {
        super.b();
        this.h = null;
    }

    @Override
    public final void c(Canvas canvas, int i, int i2) {
        float f = i;
        float f2 = i2;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(0.0f, 0.0f, f, f2);
        imageReceiver.h(canvas, null);
        ih2 ih2Var = this.f;
        ih2Var.setBounds(0, 0, i, i2);
        int w0 = bkb.w0(null, bkb.Z6, false);
        fm0 fm0Var = this.s;
        int f3 = bm2.f(fm0Var.e, w0, 1073741824);
        Paint paint = this.e;
        paint.setColor(f3);
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, gl.L(7.0f), gl.L(7.0f), paint);
        int f4 = bm2.f(fm0Var.e, bkb.w0(null, bkb.n7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        kp kpVar = this.c;
        kpVar.getClass();
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) kpVar.c;
        if (porterDuffColorFilter == null || kpVar.b != f4 || ((PorterDuff.Mode) kpVar.d) != mode) {
            porterDuffColorFilter = new PorterDuffColorFilter(f4, mode);
            kpVar.c = porterDuffColorFilter;
            kpVar.b = f4;
            kpVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        kq3.e(this.d, f / 2.0f, f2 / 2.0f, gl.L(24.0f), gl.L(24.0f), 17);
        fm0 fm0Var2 = this.r;
        kq3.b(canvas, drawable, 1.0f - fm0Var2.e);
        kq3.b(canvas, ih2Var, fm0Var2.e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        kd8 kd8Var = this.h;
        if (kd8Var != null) {
            kd8Var.invalidate();
        }
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        kd8 kd8Var = this.h;
        if (kd8Var != null) {
            kd8Var.invalidate();
        }
    }

    @Override
    public final void F(float f, int i) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}

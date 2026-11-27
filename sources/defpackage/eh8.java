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
public final class eh8 extends zg8 implements Drawable.Callback, s84 {
    public final String b;
    public final Drawable d;
    public final di2 f;
    public yg8 h;
    public TLRPC.WebPage n;
    public final fm0 r;
    public final fm0 s;
    public final lp c = new lp((byte) 12, false);
    public final Paint e = new Paint(1);

    public eh8(String str) {
        di2 di2Var = new di2(-1);
        this.f = di2Var;
        k43 k43Var = k43.h;
        this.r = new fm0(0, this, k43Var, 320L, false);
        this.s = new fm0(0, this, k43Var, 320L, false);
        this.b = str;
        this.a.q0(hl.L(7.0f));
        this.d = c00.e(a.b, 2131231749);
        di2Var.setCallback(this);
        di2Var.b(aob.w0(null, aob.o7, false));
        di2Var.a = hl.L(15.0f);
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (yg8) view;
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
        di2 di2Var = this.f;
        di2Var.setBounds(0, 0, i, i2);
        int w0 = aob.w0(null, aob.a7, false);
        fm0 fm0Var = this.s;
        int f3 = vm2.f(fm0Var.e, w0, 1073741824);
        Paint paint = this.e;
        paint.setColor(f3);
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, hl.L(7.0f), hl.L(7.0f), paint);
        int f4 = vm2.f(fm0Var.e, aob.w0(null, aob.o7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        lp lpVar = this.c;
        lpVar.getClass();
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) lpVar.c;
        if (porterDuffColorFilter == null || lpVar.b != f4 || ((PorterDuff.Mode) lpVar.d) != mode) {
            porterDuffColorFilter = new PorterDuffColorFilter(f4, mode);
            lpVar.c = porterDuffColorFilter;
            lpVar.b = f4;
            lpVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        br3.e(this.d, f / 2.0f, f2 / 2.0f, hl.L(24.0f), hl.L(24.0f), 17);
        fm0 fm0Var2 = this.r;
        br3.b(canvas, drawable, 1.0f - fm0Var2.e);
        br3.b(canvas, di2Var, fm0Var2.e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        yg8 yg8Var = this.h;
        if (yg8Var != null) {
            yg8Var.invalidate();
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        yg8 yg8Var = this.h;
        if (yg8Var != null) {
            yg8Var.invalidate();
        }
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void v0(float f, int i) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}

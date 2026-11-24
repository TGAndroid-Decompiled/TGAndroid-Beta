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
public final class sf8 extends nf8 implements Drawable.Callback, g94 {
    public final String b;
    public final Drawable d;
    public final wi2 f;
    public mf8 h;
    public TLRPC.WebPage n;
    public final fn0 r;
    public final fn0 s;
    public final kq c = new kq((byte) 11, false);
    public final Paint e = new Paint(1);

    public sf8(String str) {
        wi2 wi2Var = new wi2(-1);
        this.f = wi2Var;
        d53 d53Var = d53.h;
        this.r = new fn0(0, this, d53Var, 320L, false);
        this.s = new fn0(0, this, d53Var, 320L, false);
        this.b = str;
        this.a.q0(gm.L(7.0f));
        this.d = b10.d(a.b, 2131231750);
        wi2Var.setCallback(this);
        wi2Var.b(cmb.w0(null, cmb.n7, false));
        wi2Var.a = gm.L(15.0f);
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        mf8 mf8Var = this.h;
        if (mf8Var != null) {
            mf8Var.invalidate();
        }
    }

    @Override
    public final void a(View view) {
        super.a(view);
        this.h = (mf8) view;
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
        wi2 wi2Var = this.f;
        wi2Var.setBounds(0, 0, i, i2);
        int w0 = cmb.w0(null, cmb.Z6, false);
        fn0 fn0Var = this.s;
        int f3 = on2.f(fn0Var.e, w0, 1073741824);
        Paint paint = this.e;
        paint.setColor(f3);
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, gm.L(7.0f), gm.L(7.0f), paint);
        int f4 = on2.f(fn0Var.e, cmb.w0(null, cmb.n7, false), -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        kq kqVar = this.c;
        kqVar.getClass();
        PorterDuffColorFilter porterDuffColorFilter = (PorterDuffColorFilter) kqVar.c;
        if (porterDuffColorFilter == null || kqVar.b != f4 || ((PorterDuff.Mode) kqVar.d) != mode) {
            porterDuffColorFilter = new PorterDuffColorFilter(f4, mode);
            kqVar.c = porterDuffColorFilter;
            kqVar.b = f4;
            kqVar.d = mode;
        }
        Drawable drawable = this.d;
        drawable.setColorFilter(porterDuffColorFilter);
        ur3.e(this.d, f / 2.0f, f2 / 2.0f, gm.L(24.0f), gm.L(24.0f), 17);
        fn0 fn0Var2 = this.r;
        ur3.b(canvas, drawable, 1.0f - fn0Var2.e);
        ur3.b(canvas, wi2Var, fn0Var2.e);
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        mf8 mf8Var = this.h;
        if (mf8Var != null) {
            mf8Var.invalidate();
        }
    }

    @Override
    public final void V(float f, int i) {
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }
}

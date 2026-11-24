package defpackage;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class oz3 extends a2c {
    public final t14 b;

    public oz3(t14 t14Var) {
        this.b = t14Var;
    }

    @Override
    public final boolean a() {
        return this.b.u1.b();
    }

    @Override
    public final String[] b() {
        return this.b.X0;
    }

    @Override
    public final boolean c() {
        return this.b.u1.c();
    }

    @Override
    public final boolean d(t1c t1cVar, MotionEvent motionEvent) {
        xv2 e = xv2.e();
        t14 t14Var = this.b;
        t14Var.getMeasuredHeight();
        return e.g(motionEvent, t1cVar, t14Var.h2, t14Var.a2);
    }

    @Override
    public final boolean e(t1c t1cVar, f09 f09Var, MotionEvent motionEvent) {
        xv2 e = xv2.e();
        t14 t14Var = this.b;
        t14Var.getMeasuredHeight();
        return e.h(motionEvent, t1cVar, f09Var, t14Var.h2, t14Var.a2);
    }

    @Override
    public final void f(int i, Object obj, TLRPC.Document document, boolean z) {
        this.b.u1.x(null, document, null, obj, null, z, i);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z) {
        t14 t14Var = this.b;
        t14Var.u1.q(stickerSetCovered);
        if (z) {
            t14Var.Y(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.b.u1.i(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.b.X0 = strArr;
    }
}

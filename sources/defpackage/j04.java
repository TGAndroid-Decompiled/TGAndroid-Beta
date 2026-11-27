package defpackage;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class j04 extends z5c {
    public final o24 b;

    public j04(o24 o24Var) {
        this.b = o24Var;
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
    public final boolean d(s5c s5cVar, MotionEvent motionEvent) {
        rw2 e = rw2.e();
        o24 o24Var = this.b;
        o24Var.getMeasuredHeight();
        return e.g(motionEvent, s5cVar, o24Var.h2, o24Var.a2);
    }

    @Override
    public final boolean e(s5c s5cVar, t39 t39Var, MotionEvent motionEvent) {
        rw2 e = rw2.e();
        o24 o24Var = this.b;
        o24Var.getMeasuredHeight();
        return e.h(motionEvent, s5cVar, t39Var, o24Var.h2, o24Var.a2);
    }

    @Override
    public final void f(int i, Object obj, TLRPC.Document document, boolean z) {
        this.b.u1.x(null, document, null, obj, null, z, i);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z) {
        o24 o24Var = this.b;
        o24Var.u1.q(stickerSetCovered);
        if (z) {
            o24Var.X(true);
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

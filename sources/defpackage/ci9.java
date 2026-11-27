package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ci9 implements rj9 {
    public final p07 a;
    public final mk0 b;
    public final pi9 c;

    public ci9(pi9 pi9Var, p07 p07Var, mk0 mk0Var) {
        this.c = pi9Var;
        this.a = p07Var;
        this.b = mk0Var;
    }

    @Override
    public final void a() {
        p07 p07Var = this.a;
        p07Var.a = (byte) 3;
        pi9 pi9Var = this.c;
        pi9Var.h4.remove(p07Var);
        pi9Var.s4(this.b, p07Var);
        pi9Var.p3.onContentChanged();
    }

    @Override
    public final void b(int i, int i2) {
        if (i > 0 && i2 > 0) {
            p07 p07Var = this.a;
            p07Var.j = i;
            p07Var.k = i2;
        }
        View D1 = this.c.D1(this.b);
        if (D1 instanceof mj9) {
            D1.requestLayout();
            D1.invalidate();
        }
    }

    @Override
    public final void c(TLRPC.Photo photo) {
        int i;
        int i2;
        p07 p07Var = this.a;
        p07Var.g = photo;
        p07Var.a = (byte) 2;
        TLRPC.PhotoSize w = xb4.w(photo.sizes, hl.Y0(false), false, null, false);
        if (w != null && (i = w.w) > 0 && (i2 = w.h) > 0) {
            p07Var.j = i;
            p07Var.k = i2;
        }
        mk0 mk0Var = this.b;
        TL_iv.PageBlock K3 = pi9.K3(mk0Var, p07Var);
        if (K3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) K3).photo_id = photo.id;
        }
        pi9 pi9Var = this.c;
        pi9Var.h4.remove(p07Var);
        pi9Var.p4(mk0Var);
        pi9Var.p3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
        p07 p07Var = this.a;
        p07Var.h = document;
        p07Var.a = (byte) 2;
        mk0 mk0Var = this.b;
        TL_iv.PageBlock K3 = pi9.K3(mk0Var, p07Var);
        if (K3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) K3).video_id = document.id;
        }
        pi9 pi9Var = this.c;
        pi9Var.h4.remove(p07Var);
        pi9Var.p4(mk0Var);
        pi9Var.p3.onContentChanged();
    }

    @Override
    public final void g(float f) {
        this.a.f = f;
        mk0 mk0Var = this.b;
        pi9 pi9Var = this.c;
        View D1 = pi9Var.D1(mk0Var);
        if (D1 instanceof mj9) {
            D1.requestLayout();
            D1.invalidate();
        }
        pi9Var.p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void f(TLRPC.Document document) {
    }
}

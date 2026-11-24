package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pg9 implements ei9 {
    public final i07 a;
    public final ll0 b;
    public final ch9 c;

    public pg9(ch9 ch9Var, i07 i07Var, ll0 ll0Var) {
        this.c = ch9Var;
        this.a = i07Var;
        this.b = ll0Var;
    }

    @Override
    public final void a() {
        i07 i07Var = this.a;
        i07Var.a = (byte) 3;
        ch9 ch9Var = this.c;
        ch9Var.h4.remove(i07Var);
        ch9Var.r4(this.b, i07Var);
        ch9Var.p3.onContentChanged();
    }

    @Override
    public final void b(int i, int i2) {
        if (i > 0 && i2 > 0) {
            i07 i07Var = this.a;
            i07Var.j = i;
            i07Var.k = i2;
        }
        View C1 = this.c.C1(this.b);
        if (C1 instanceof zh9) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override
    public final void c(TLRPC.Photo photo) {
        int i;
        int i2;
        i07 i07Var = this.a;
        i07Var.g = photo;
        i07Var.a = (byte) 2;
        TLRPC.PhotoSize w = bc4.w(photo.sizes, gm.Y0(false), false, null, false);
        if (w != null && (i = w.w) > 0 && (i2 = w.h) > 0) {
            i07Var.j = i;
            i07Var.k = i2;
        }
        ll0 ll0Var = this.b;
        TL_iv.PageBlock J3 = ch9.J3(ll0Var, i07Var);
        if (J3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) J3).photo_id = photo.id;
        }
        ch9 ch9Var = this.c;
        ch9Var.h4.remove(i07Var);
        ch9Var.o4(ll0Var);
        ch9Var.p3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
        i07 i07Var = this.a;
        i07Var.h = document;
        i07Var.a = (byte) 2;
        ll0 ll0Var = this.b;
        TL_iv.PageBlock J3 = ch9.J3(ll0Var, i07Var);
        if (J3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) J3).video_id = document.id;
        }
        ch9 ch9Var = this.c;
        ch9Var.h4.remove(i07Var);
        ch9Var.o4(ll0Var);
        ch9Var.p3.onContentChanged();
    }

    @Override
    public final void g(float f) {
        this.a.f = f;
        ll0 ll0Var = this.b;
        ch9 ch9Var = this.c;
        View C1 = ch9Var.C1(ll0Var);
        if (C1 instanceof zh9) {
            C1.requestLayout();
            C1.invalidate();
        }
        ch9Var.p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void f(TLRPC.Document document) {
    }
}

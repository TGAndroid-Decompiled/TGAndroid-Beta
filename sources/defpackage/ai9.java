package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ai9 implements rj9 {
    public final p07 a;
    public final mk0 b;
    public final String c;
    public final pi9 d;

    public ai9(pi9 pi9Var, p07 p07Var, mk0 mk0Var, String str) {
        this.d = pi9Var;
        this.a = p07Var;
        this.b = mk0Var;
        this.c = str;
    }

    @Override
    public final void a() {
        p07 p07Var = this.a;
        p07Var.a = (byte) 3;
        pi9 pi9Var = this.d;
        pi9Var.h4.remove(p07Var);
        pi9Var.t3.remove(this.b);
        pi9Var.g3.O(true);
        pi9Var.p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        pi9 pi9Var = this.d;
        xb4.G(pi9Var.n3).e0(str, document);
        p07 p07Var = this.a;
        p07Var.h = document;
        p07Var.a = (byte) 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        pi9Var.h4.remove(p07Var);
        pi9Var.g3.O(false);
        pi9Var.p3.onContentChanged();
    }

    @Override
    public final void g(float f) {
        this.a.f = f;
        mk0 mk0Var = this.b;
        pi9 pi9Var = this.d;
        View D1 = pi9Var.D1(mk0Var);
        if (D1 instanceof xf9) {
            xf9 xf9Var = (xf9) D1;
            xf9Var.g(xf9Var.h());
            xf9Var.m();
            xf9Var.n(false);
            xf9Var.requestLayout();
            xf9Var.invalidate();
        }
        pi9Var.p3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Photo photo) {
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void f(TLRPC.Document document) {
    }

    @Override
    public final void b(int i, int i2) {
    }
}

package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class ng9 implements ei9 {
    public final i07 a;
    public final ll0 b;
    public final String c;
    public final ch9 d;

    public ng9(ch9 ch9Var, i07 i07Var, ll0 ll0Var, String str) {
        this.d = ch9Var;
        this.a = i07Var;
        this.b = ll0Var;
        this.c = str;
    }

    @Override
    public final void a() {
        i07 i07Var = this.a;
        i07Var.a = (byte) 3;
        ch9 ch9Var = this.d;
        ch9Var.h4.remove(i07Var);
        ch9Var.t3.remove(this.b);
        ch9Var.g3.O(true);
        ch9Var.p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        ch9 ch9Var = this.d;
        bc4.G(ch9Var.n3).e0(str, document);
        i07 i07Var = this.a;
        i07Var.h = document;
        i07Var.a = (byte) 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        ch9Var.h4.remove(i07Var);
        ch9Var.g3.O(false);
        ch9Var.p3.onContentChanged();
    }

    @Override
    public final void g(float f) {
        this.a.f = f;
        ll0 ll0Var = this.b;
        ch9 ch9Var = this.d;
        View C1 = ch9Var.C1(ll0Var);
        if (C1 instanceof he9) {
            he9 he9Var = (he9) C1;
            he9Var.g(he9Var.h());
            he9Var.m();
            he9Var.n(false);
            he9Var.requestLayout();
            he9Var.invalidate();
        }
        ch9Var.p3.onContentChanged();
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

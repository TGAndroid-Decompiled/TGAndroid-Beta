package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class je9 implements ag9 {
    public final iy6 a;
    public final lk0 b;
    public final String c;
    public final ye9 d;

    public je9(ye9 ye9Var, iy6 iy6Var, lk0 lk0Var, String str) {
        this.d = ye9Var;
        this.a = iy6Var;
        this.b = lk0Var;
        this.c = str;
    }

    @Override
    public final void a() {
        iy6 iy6Var = this.a;
        iy6Var.a = (byte) 3;
        ye9 ye9Var = this.d;
        ye9Var.h4.remove(iy6Var);
        ye9Var.t3.remove(this.b);
        ye9Var.g3.O(true);
        ye9Var.p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
        String str = this.c;
        document.localPath = str;
        ye9 ye9Var = this.d;
        ba4.G(ye9Var.n3).e0(str, document);
        iy6 iy6Var = this.a;
        iy6Var.h = document;
        iy6Var.a = (byte) 2;
        TL_iv.PageBlock pageBlock = this.b.b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.id;
        }
        ye9Var.h4.remove(iy6Var);
        ye9Var.g3.O(false);
        ye9Var.p3.onContentChanged();
    }

    @Override
    public final void g(float f) {
        this.a.f = f;
        lk0 lk0Var = this.b;
        ye9 ye9Var = this.d;
        View C1 = ye9Var.C1(lk0Var);
        if (C1 instanceof gc9) {
            gc9 gc9Var = (gc9) C1;
            gc9Var.g(gc9Var.h());
            gc9Var.m();
            gc9Var.n(false);
            gc9Var.requestLayout();
            gc9Var.invalidate();
        }
        ye9Var.p3.onContentChanged();
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

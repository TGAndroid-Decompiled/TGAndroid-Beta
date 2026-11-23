package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements x4 {
    public final r f22078a;
    public final a f22079b;
    public final String f22080c;
    public final t3 d;

    public e3(t3 t3Var, r rVar, a aVar, String str) {
        this.d = t3Var;
        this.f22078a = rVar;
        this.f22079b = aVar;
        this.f22080c = str;
    }

    @Override
    public final void a() {
        r rVar = this.f22078a;
        rVar.f22344a = 3;
        t3 t3Var = this.d;
        t3Var.f22419h4.remove(rVar);
        t3Var.f22436t3.remove(this.f22079b);
        t3Var.f35789g3.O(true);
        t3Var.f22428p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
        String str = this.f22080c;
        document.localPath = str;
        t3 t3Var = this.d;
        w7.G(t3Var.f22425n3).e0(str, document);
        r rVar = this.f22078a;
        rVar.h = document;
        rVar.f22344a = 2;
        TL_iv.PageBlock pageBlock = this.f22079b.f21935b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f28440id;
        }
        t3Var.f22419h4.remove(rVar);
        t3Var.f35789g3.O(false);
        t3Var.f22428p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f22078a.f22348f = f10;
        a aVar = this.f22079b;
        t3 t3Var = this.d;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof w0) {
            w0 w0Var = (w0) C1;
            w0Var.g(w0Var.h());
            w0Var.l();
            w0Var.m(false);
            w0Var.requestLayout();
            w0Var.invalidate();
        }
        t3Var.f22428p3.onContentChanged();
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
    public final void b(int i7, int i10) {
    }
}

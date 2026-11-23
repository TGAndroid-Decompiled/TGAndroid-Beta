package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements x4 {
    public final s f22144a;
    public final a f22145b;
    public final String f22146c;
    public final t3 d;

    public e3(t3 t3Var, s sVar, a aVar, String str) {
        this.d = t3Var;
        this.f22144a = sVar;
        this.f22145b = aVar;
        this.f22146c = str;
    }

    @Override
    public final void a() {
        s sVar = this.f22144a;
        sVar.f22421a = 3;
        t3 t3Var = this.d;
        t3Var.f22486h4.remove(sVar);
        t3Var.f22503t3.remove(this.f22145b);
        t3Var.f35323g3.O(true);
        t3Var.f22495p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
        String str = this.f22146c;
        document.localPath = str;
        t3 t3Var = this.d;
        w7.G(t3Var.f22492n3).e0(str, document);
        s sVar = this.f22144a;
        sVar.h = document;
        sVar.f22421a = 2;
        TL_iv.PageBlock pageBlock = this.f22145b.f22001b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f28498id;
        }
        t3Var.f22486h4.remove(sVar);
        t3Var.f35323g3.O(false);
        t3Var.f22495p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f22144a.f22425f = f10;
        a aVar = this.f22145b;
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
        t3Var.f22495p3.onContentChanged();
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

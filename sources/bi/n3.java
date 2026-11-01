package bi;

import android.view.View;
import org.telegram.messenger.b8;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class n3 implements k5 {
    public final w f3244a;
    public final a f3245b;
    public final String f3246c;
    public final d4 d;

    public n3(d4 d4Var, w wVar, a aVar, String str) {
        this.d = d4Var;
        this.f3244a = wVar;
        this.f3245b = aVar;
        this.f3246c = str;
    }

    @Override
    public final void a() {
        w wVar = this.f3244a;
        wVar.f3416a = 3;
        d4 d4Var = this.d;
        d4Var.f2929g4.remove(wVar);
        d4Var.f2946s3.remove(this.f3245b);
        d4Var.f31183f3.O(true);
        d4Var.f2938o3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
        String str = this.f3246c;
        document.localPath = str;
        d4 d4Var = this.d;
        b8.G(d4Var.f2934m3).f0(str, document);
        w wVar = this.f3244a;
        wVar.h = document;
        wVar.f3416a = 2;
        TL_iv.PageBlock pageBlock = this.f3245b.f2818b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f19800id;
        }
        d4Var.f2929g4.remove(wVar);
        d4Var.f31183f3.O(false);
        d4Var.f2938o3.onContentChanged();
    }

    @Override
    public final void g(float f7) {
        this.f3244a.f3419f = f7;
        a aVar = this.f3245b;
        d4 d4Var = this.d;
        View C1 = d4Var.C1(aVar);
        if (C1 instanceof e1) {
            e1 e1Var = (e1) C1;
            e1Var.g(e1Var.j());
            e1Var.l();
            e1Var.m(false);
            e1Var.requestLayout();
            e1Var.invalidate();
        }
        d4Var.f2938o3.onContentChanged();
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
    public final void b(int i10, int i11) {
    }
}

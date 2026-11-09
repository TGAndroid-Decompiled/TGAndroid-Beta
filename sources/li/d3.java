package li;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class d3 implements x4 {
    public final s f18520a;
    public final a f18521b;
    public final String f18522c;
    public final t3 d;

    public d3(t3 t3Var, s sVar, a aVar, String str) {
        this.d = t3Var;
        this.f18520a = sVar;
        this.f18521b = aVar;
        this.f18522c = str;
    }

    @Override
    public final void a() {
        s sVar = this.f18520a;
        sVar.f18814a = 3;
        t3 t3Var = this.d;
        t3Var.f18880g4.remove(sVar);
        t3Var.f18897s3.remove(this.f18521b);
        t3Var.f37556f3.O(true);
        t3Var.f18890o3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
        String str = this.f18522c;
        document.localPath = str;
        t3 t3Var = this.d;
        w7.G(t3Var.f18886m3).e0(str, document);
        s sVar = this.f18520a;
        sVar.h = document;
        sVar.f18814a = 2;
        TL_iv.PageBlock pageBlock = this.f18521b.f18392b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f26962id;
        }
        t3Var.f18880g4.remove(sVar);
        t3Var.f37556f3.O(false);
        t3Var.f18890o3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f18520a.f18818f = f10;
        a aVar = this.f18521b;
        t3 t3Var = this.d;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof x0) {
            x0 x0Var = (x0) C1;
            x0Var.g(x0Var.h());
            x0Var.l();
            x0Var.m(false);
            x0Var.requestLayout();
            x0Var.invalidate();
        }
        t3Var.f18890o3.onContentChanged();
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

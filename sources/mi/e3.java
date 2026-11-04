package mi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements y4 {
    public final s f19579a;
    public final a f19580b;
    public final String f19581c;
    public final t3 d;

    public e3(t3 t3Var, s sVar, a aVar, String str) {
        this.d = t3Var;
        this.f19579a = sVar;
        this.f19580b = aVar;
        this.f19581c = str;
    }

    @Override
    public final void a() {
        s sVar = this.f19579a;
        sVar.f19859a = 3;
        t3 t3Var = this.d;
        t3Var.f19907h4.remove(sVar);
        t3Var.f19924t3.remove(this.f19580b);
        t3Var.f35594g3.O(true);
        t3Var.f19916p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
        String str = this.f19581c;
        document.localPath = str;
        t3 t3Var = this.d;
        w7.G(t3Var.f19913n3).f0(str, document);
        s sVar = this.f19579a;
        sVar.h = document;
        sVar.f19859a = 2;
        TL_iv.PageBlock pageBlock = this.f19580b.f19431b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f27007id;
        }
        t3Var.f19907h4.remove(sVar);
        t3Var.f35594g3.O(false);
        t3Var.f19916p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f19579a.f19863f = f10;
        a aVar = this.f19580b;
        t3 t3Var = this.d;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof y0) {
            y0 y0Var = (y0) C1;
            y0Var.g(y0Var.h());
            y0Var.l();
            y0Var.m(false);
            y0Var.requestLayout();
            y0Var.invalidate();
        }
        t3Var.f19916p3.onContentChanged();
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
    public final void b(int i3, int i10) {
    }
}

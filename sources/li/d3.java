package li;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class d3 implements x4 {
    public final s f18523a;
    public final a f18524b;
    public final String f18525c;
    public final t3 d;

    public d3(t3 t3Var, s sVar, a aVar, String str) {
        this.d = t3Var;
        this.f18523a = sVar;
        this.f18524b = aVar;
        this.f18525c = str;
    }

    @Override
    public final void a() {
        s sVar = this.f18523a;
        sVar.f18817a = 3;
        t3 t3Var = this.d;
        t3Var.f18883g4.remove(sVar);
        t3Var.f18900s3.remove(this.f18524b);
        t3Var.f37496f3.O(true);
        t3Var.f18893o3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
        String str = this.f18525c;
        document.localPath = str;
        t3 t3Var = this.d;
        w7.G(t3Var.f18889m3).e0(str, document);
        s sVar = this.f18523a;
        sVar.h = document;
        sVar.f18817a = 2;
        TL_iv.PageBlock pageBlock = this.f18524b.f18395b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f26966id;
        }
        t3Var.f18883g4.remove(sVar);
        t3Var.f37496f3.O(false);
        t3Var.f18893o3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f18523a.f18821f = f10;
        a aVar = this.f18524b;
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
        t3Var.f18893o3.onContentChanged();
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

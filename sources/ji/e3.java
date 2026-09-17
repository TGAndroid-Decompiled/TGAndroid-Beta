package ji;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements c5 {
    public final u f13910a;
    public final a f13911b;
    public final String f13912c;
    public final v3 d;

    public e3(v3 v3Var, u uVar, a aVar, String str) {
        this.d = v3Var;
        this.f13910a = uVar;
        this.f13911b = aVar;
        this.f13912c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f13912c;
        document.localPath = str;
        v3 v3Var = this.d;
        FileLoader.getInstance(v3Var.f14271f3).setLocalPathTo(document, str);
        u uVar = this.f13910a;
        uVar.h = document;
        uVar.f14221a = 2;
        TL_iv.PageBlock pageBlock = this.f13911b.f13758b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f19902id;
        }
        v3Var.Z3.remove(uVar);
        v3Var.Y2.N(false);
        v3Var.f14275h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f13910a.f14225f = f7;
        a aVar = this.f13911b;
        v3 v3Var = this.d;
        View y12 = v3Var.y1(aVar);
        if (y12 instanceof z0) {
            z0 z0Var = (z0) y12;
            z0Var.h(z0Var.i());
            z0Var.k();
            z0Var.l(false);
            z0Var.requestLayout();
            z0Var.invalidate();
        }
        v3Var.f14275h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f13910a;
        uVar.f14221a = 3;
        v3 v3Var = this.d;
        v3Var.Z3.remove(uVar);
        v3Var.f14282l3.remove(this.f13911b);
        v3Var.Y2.N(true);
        v3Var.f14275h3.onContentChanged();
    }

    @Override
    public final void b(TLRPC.Photo photo) {
    }

    @Override
    public final void c(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void a(int i10, int i11) {
    }
}

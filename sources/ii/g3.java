package ii;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements b5 {
    public final u f12437a;
    public final a f12438b;
    public final String f12439c;
    public final x3 d;

    public g3(x3 x3Var, u uVar, a aVar, String str) {
        this.d = x3Var;
        this.f12437a = uVar;
        this.f12438b = aVar;
        this.f12439c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f12439c;
        document.localPath = str;
        x3 x3Var = this.d;
        FileLoader.getInstance(x3Var.f12804d3).setLocalPathTo(document, str);
        u uVar = this.f12437a;
        uVar.h = document;
        uVar.f12709a = 2;
        TL_iv.PageBlock pageBlock = this.f12438b.f12233b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f20038id;
        }
        x3Var.X3.remove(uVar);
        x3Var.W2.N(false);
        x3Var.f12808f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f12437a.f12713f = f7;
        a aVar = this.f12438b;
        x3 x3Var = this.d;
        View A1 = x3Var.A1(aVar);
        if (A1 instanceof a1) {
            a1 a1Var = (a1) A1;
            a1Var.h(a1Var.i());
            a1Var.k();
            a1Var.l(false);
            a1Var.requestLayout();
            a1Var.invalidate();
        }
        x3Var.f12808f3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f12437a;
        uVar.f12709a = 3;
        x3 x3Var = this.d;
        x3Var.X3.remove(uVar);
        x3Var.j3.remove(this.f12438b);
        x3Var.W2.N(true);
        x3Var.f12808f3.onContentChanged();
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

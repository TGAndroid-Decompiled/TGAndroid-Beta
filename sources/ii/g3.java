package ii;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements b5 {
    public final u f12438a;
    public final a f12439b;
    public final String f12440c;
    public final x3 d;

    public g3(x3 x3Var, u uVar, a aVar, String str) {
        this.d = x3Var;
        this.f12438a = uVar;
        this.f12439b = aVar;
        this.f12440c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f12440c;
        document.localPath = str;
        x3 x3Var = this.d;
        FileLoader.getInstance(x3Var.f12805d3).setLocalPathTo(document, str);
        u uVar = this.f12438a;
        uVar.h = document;
        uVar.f12710a = 2;
        TL_iv.PageBlock pageBlock = this.f12439b.f12234b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f20048id;
        }
        x3Var.X3.remove(uVar);
        x3Var.W2.N(false);
        x3Var.f12809f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f12438a.f12714f = f7;
        a aVar = this.f12439b;
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
        x3Var.f12809f3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f12438a;
        uVar.f12710a = 3;
        x3 x3Var = this.d;
        x3Var.X3.remove(uVar);
        x3Var.j3.remove(this.f12439b);
        x3Var.W2.N(true);
        x3Var.f12809f3.onContentChanged();
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

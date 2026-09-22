package ii;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements z4 {
    public final u f11376a;
    public final a f11377b;
    public final String f11378c;
    public final w3 d;

    public f3(w3 w3Var, u uVar, a aVar, String str) {
        this.d = w3Var;
        this.f11376a = uVar;
        this.f11377b = aVar;
        this.f11378c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f11378c;
        document.localPath = str;
        w3 w3Var = this.d;
        FileLoader.getInstance(w3Var.f11711f3).setLocalPathTo(document, str);
        u uVar = this.f11376a;
        uVar.h = document;
        uVar.f11639a = 2;
        TL_iv.PageBlock pageBlock = this.f11377b.f11205b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f18349id;
        }
        w3Var.Z3.remove(uVar);
        w3Var.Y2.N(false);
        w3Var.f11715h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11376a.f11642f = f7;
        a aVar = this.f11377b;
        w3 w3Var = this.d;
        View A1 = w3Var.A1(aVar);
        if (A1 instanceof a1) {
            a1 a1Var = (a1) A1;
            a1Var.h(a1Var.i());
            a1Var.k();
            a1Var.l(false);
            a1Var.requestLayout();
            a1Var.invalidate();
        }
        w3Var.f11715h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11376a;
        uVar.f11639a = 3;
        w3 w3Var = this.d;
        w3Var.Z3.remove(uVar);
        w3Var.f11722l3.remove(this.f11377b);
        w3Var.Y2.N(true);
        w3Var.f11715h3.onContentChanged();
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

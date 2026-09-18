package ii;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements z4 {
    public final u f11375a;
    public final a f11376b;
    public final String f11377c;
    public final w3 d;

    public f3(w3 w3Var, u uVar, a aVar, String str) {
        this.d = w3Var;
        this.f11375a = uVar;
        this.f11376b = aVar;
        this.f11377c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f11377c;
        document.localPath = str;
        w3 w3Var = this.d;
        FileLoader.getInstance(w3Var.f11710f3).setLocalPathTo(document, str);
        u uVar = this.f11375a;
        uVar.h = document;
        uVar.f11638a = 2;
        TL_iv.PageBlock pageBlock = this.f11376b.f11204b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f18127id;
        }
        w3Var.Z3.remove(uVar);
        w3Var.Y2.N(false);
        w3Var.f11714h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11375a.f11641f = f7;
        a aVar = this.f11376b;
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
        w3Var.f11714h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11375a;
        uVar.f11638a = 3;
        w3 w3Var = this.d;
        w3Var.Z3.remove(uVar);
        w3Var.f11721l3.remove(this.f11376b);
        w3Var.Y2.N(true);
        w3Var.f11714h3.onContentChanged();
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

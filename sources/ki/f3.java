package ki;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements z4 {
    public final t f15260a;
    public final a f15261b;
    public final String f15262c;
    public final w3 d;

    public f3(w3 w3Var, t tVar, a aVar, String str) {
        this.d = w3Var;
        this.f15260a = tVar;
        this.f15261b = aVar;
        this.f15262c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f15262c;
        document.localPath = str;
        w3 w3Var = this.d;
        FileLoader.getInstance(w3Var.f15588d3).setLocalPathTo(document, str);
        t tVar = this.f15260a;
        tVar.h = document;
        tVar.f15508a = 2;
        TL_iv.PageBlock pageBlock = this.f15261b.f15095b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f20286id;
        }
        w3Var.X3.remove(tVar);
        w3Var.W2.N(false);
        w3Var.f15592f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f15260a.f15511f = f7;
        a aVar = this.f15261b;
        w3 w3Var = this.d;
        View A1 = w3Var.A1(aVar);
        if (A1 instanceof z0) {
            z0 z0Var = (z0) A1;
            z0Var.h(z0Var.i());
            z0Var.k();
            z0Var.l(false);
            z0Var.requestLayout();
            z0Var.invalidate();
        }
        w3Var.f15592f3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f15260a;
        tVar.f15508a = 3;
        w3 w3Var = this.d;
        w3Var.X3.remove(tVar);
        w3Var.f15600j3.remove(this.f15261b);
        w3Var.W2.N(true);
        w3Var.f15592f3.onContentChanged();
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

package ki;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements z4 {
    public final t f15259a;
    public final a f15260b;
    public final String f15261c;
    public final w3 d;

    public f3(w3 w3Var, t tVar, a aVar, String str) {
        this.d = w3Var;
        this.f15259a = tVar;
        this.f15260b = aVar;
        this.f15261c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f15261c;
        document.localPath = str;
        w3 w3Var = this.d;
        FileLoader.getInstance(w3Var.f15587d3).setLocalPathTo(document, str);
        t tVar = this.f15259a;
        tVar.h = document;
        tVar.f15507a = 2;
        TL_iv.PageBlock pageBlock = this.f15260b.f15094b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f20278id;
        }
        w3Var.X3.remove(tVar);
        w3Var.W2.N(false);
        w3Var.f15591f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f15259a.f15510f = f7;
        a aVar = this.f15260b;
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
        w3Var.f15591f3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f15259a;
        tVar.f15507a = 3;
        w3 w3Var = this.d;
        w3Var.X3.remove(tVar);
        w3Var.f15599j3.remove(this.f15260b);
        w3Var.W2.N(true);
        w3Var.f15591f3.onContentChanged();
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

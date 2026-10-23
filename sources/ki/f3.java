package ki;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements z4 {
    public final t f15318a;
    public final a f15319b;
    public final String f15320c;
    public final w3 d;

    public f3(w3 w3Var, t tVar, a aVar, String str) {
        this.d = w3Var;
        this.f15318a = tVar;
        this.f15319b = aVar;
        this.f15320c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f15320c;
        document.localPath = str;
        w3 w3Var = this.d;
        FileLoader.getInstance(w3Var.f15652g3).setLocalPathTo(document, str);
        t tVar = this.f15318a;
        tVar.h = document;
        tVar.f15568a = 2;
        TL_iv.PageBlock pageBlock = this.f15319b.f15141b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f20349id;
        }
        w3Var.f15646a4.remove(tVar);
        w3Var.Z2.N(false);
        w3Var.f15656i3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f15318a.f15571f = f7;
        a aVar = this.f15319b;
        w3 w3Var = this.d;
        View F1 = w3Var.F1(aVar);
        if (F1 instanceof z0) {
            z0 z0Var = (z0) F1;
            z0Var.g(z0Var.h());
            z0Var.j();
            z0Var.k(false);
            z0Var.requestLayout();
            z0Var.invalidate();
        }
        w3Var.f15656i3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f15318a;
        tVar.f15568a = 3;
        w3 w3Var = this.d;
        w3Var.f15646a4.remove(tVar);
        w3Var.f15663m3.remove(this.f15319b);
        w3Var.Z2.N(true);
        w3Var.f15656i3.onContentChanged();
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

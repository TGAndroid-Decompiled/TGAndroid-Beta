package ji;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements d5 {
    public final u f13280a;
    public final a f13281b;
    public final String f13282c;
    public final x3 d;

    public g3(x3 x3Var, u uVar, a aVar, String str) {
        this.d = x3Var;
        this.f13280a = uVar;
        this.f13281b = aVar;
        this.f13282c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f13282c;
        document.localPath = str;
        x3 x3Var = this.d;
        FileLoader.getInstance(x3Var.f13623d3).setLocalPathTo(document, str);
        u uVar = this.f13280a;
        uVar.h = document;
        uVar.f13535a = 2;
        TL_iv.PageBlock pageBlock = this.f13281b.f13103b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f19222id;
        }
        x3Var.X3.remove(uVar);
        x3Var.W2.N(false);
        x3Var.f13627f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f13280a.f13538f = f7;
        a aVar = this.f13281b;
        x3 x3Var = this.d;
        View A1 = x3Var.A1(aVar);
        if (A1 instanceof z0) {
            z0 z0Var = (z0) A1;
            z0Var.h(z0Var.i());
            z0Var.k();
            z0Var.l(false);
            z0Var.requestLayout();
            z0Var.invalidate();
        }
        x3Var.f13627f3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f13280a;
        uVar.f13535a = 3;
        x3 x3Var = this.d;
        x3Var.X3.remove(uVar);
        x3Var.f13635j3.remove(this.f13281b);
        x3Var.W2.N(true);
        x3Var.f13627f3.onContentChanged();
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

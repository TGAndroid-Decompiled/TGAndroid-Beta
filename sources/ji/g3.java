package ji;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements d5 {
    public final u f13283a;
    public final a f13284b;
    public final String f13285c;
    public final x3 d;

    public g3(x3 x3Var, u uVar, a aVar, String str) {
        this.d = x3Var;
        this.f13283a = uVar;
        this.f13284b = aVar;
        this.f13285c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f13285c;
        document.localPath = str;
        x3 x3Var = this.d;
        FileLoader.getInstance(x3Var.f13626d3).setLocalPathTo(document, str);
        u uVar = this.f13283a;
        uVar.h = document;
        uVar.f13538a = 2;
        TL_iv.PageBlock pageBlock = this.f13284b.f13107b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f18922id;
        }
        x3Var.X3.remove(uVar);
        x3Var.W2.N(false);
        x3Var.f13630f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f13283a.f13541f = f7;
        a aVar = this.f13284b;
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
        x3Var.f13630f3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f13283a;
        uVar.f13538a = 3;
        x3 x3Var = this.d;
        x3Var.X3.remove(uVar);
        x3Var.f13638j3.remove(this.f13284b);
        x3Var.W2.N(true);
        x3Var.f13630f3.onContentChanged();
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

package ii;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements a5 {
    public final u f11381a;
    public final a f11382b;
    public final String f11383c;
    public final x3 d;

    public g3(x3 x3Var, u uVar, a aVar, String str) {
        this.d = x3Var;
        this.f11381a = uVar;
        this.f11382b = aVar;
        this.f11383c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f11383c;
        document.localPath = str;
        x3 x3Var = this.d;
        FileLoader.getInstance(x3Var.f11724f3).setLocalPathTo(document, str);
        u uVar = this.f11381a;
        uVar.h = document;
        uVar.f11633a = 2;
        TL_iv.PageBlock pageBlock = this.f11382b.f11191b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f18341id;
        }
        x3Var.Z3.remove(uVar);
        x3Var.Y2.N(false);
        x3Var.f11728h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11381a.f11636f = f7;
        a aVar = this.f11382b;
        x3 x3Var = this.d;
        View z12 = x3Var.z1(aVar);
        if (z12 instanceof a1) {
            a1 a1Var = (a1) z12;
            a1Var.h(a1Var.i());
            a1Var.k();
            a1Var.l(false);
            a1Var.requestLayout();
            a1Var.invalidate();
        }
        x3Var.f11728h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11381a;
        uVar.f11633a = 3;
        x3 x3Var = this.d;
        x3Var.Z3.remove(uVar);
        x3Var.f11735l3.remove(this.f11382b);
        x3Var.Y2.N(true);
        x3Var.f11728h3.onContentChanged();
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

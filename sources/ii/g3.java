package ii;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements b5 {
    public final u f12391a;
    public final a f12392b;
    public final String f12393c;
    public final x3 d;

    public g3(x3 x3Var, u uVar, a aVar, String str) {
        this.d = x3Var;
        this.f12391a = uVar;
        this.f12392b = aVar;
        this.f12393c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f12393c;
        document.localPath = str;
        x3 x3Var = this.d;
        FileLoader.getInstance(x3Var.f12766m3).setLocalPathTo(document, str);
        u uVar = this.f12391a;
        uVar.h = document;
        uVar.f12663a = 2;
        TL_iv.PageBlock pageBlock = this.f12392b.f12187b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f20053id;
        }
        x3Var.f12761g4.remove(uVar);
        x3Var.f26034f3.N(false);
        x3Var.f12770o3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f12391a.f12667f = f7;
        a aVar = this.f12392b;
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
        x3Var.f12770o3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f12391a;
        uVar.f12663a = 3;
        x3 x3Var = this.d;
        x3Var.f12761g4.remove(uVar);
        x3Var.f12778s3.remove(this.f12392b);
        x3Var.f26034f3.N(true);
        x3Var.f12770o3.onContentChanged();
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

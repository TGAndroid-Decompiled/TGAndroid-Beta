package ii;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements a5 {
    public final u f11395a;
    public final a f11396b;
    public final String f11397c;
    public final x3 d;

    public g3(x3 x3Var, u uVar, a aVar, String str) {
        this.d = x3Var;
        this.f11395a = uVar;
        this.f11396b = aVar;
        this.f11397c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f11397c;
        document.localPath = str;
        x3 x3Var = this.d;
        FileLoader.getInstance(x3Var.f11744m3).setLocalPathTo(document, str);
        u uVar = this.f11395a;
        uVar.h = document;
        uVar.f11647a = 2;
        TL_iv.PageBlock pageBlock = this.f11396b.f11205b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f18358id;
        }
        x3Var.f11739g4.remove(uVar);
        x3Var.f28778f3.N(false);
        x3Var.f11748o3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11395a.f11650f = f7;
        a aVar = this.f11396b;
        x3 x3Var = this.d;
        View B1 = x3Var.B1(aVar);
        if (B1 instanceof a1) {
            a1 a1Var = (a1) B1;
            a1Var.h(a1Var.i());
            a1Var.k();
            a1Var.l(false);
            a1Var.requestLayout();
            a1Var.invalidate();
        }
        x3Var.f11748o3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11395a;
        uVar.f11647a = 3;
        x3 x3Var = this.d;
        x3Var.f11739g4.remove(uVar);
        x3Var.f11756s3.remove(this.f11396b);
        x3Var.f28778f3.N(true);
        x3Var.f11748o3.onContentChanged();
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

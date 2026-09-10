package hi;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class i3 implements c5 {
    public final v f9658a;
    public final a f9659b;
    public final String f9660c;
    public final z3 d;

    public i3(z3 z3Var, v vVar, a aVar, String str) {
        this.d = z3Var;
        this.f9658a = vVar;
        this.f9659b = aVar;
        this.f9660c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f9660c;
        document.localPath = str;
        z3 z3Var = this.d;
        FileLoader.getInstance(z3Var.f9997f3).setLocalPathTo(document, str);
        v vVar = this.f9658a;
        vVar.h = document;
        vVar.f9894a = 2;
        TL_iv.PageBlock pageBlock = this.f9659b.f9421b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f17201id;
        }
        z3Var.Z3.remove(vVar);
        z3Var.Y2.N(false);
        z3Var.f10001h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f9658a.f9897f = f7;
        a aVar = this.f9659b;
        z3 z3Var = this.d;
        View y12 = z3Var.y1(aVar);
        if (y12 instanceof c1) {
            c1 c1Var = (c1) y12;
            c1Var.h(c1Var.i());
            c1Var.k();
            c1Var.l(false);
            c1Var.requestLayout();
            c1Var.invalidate();
        }
        z3Var.f10001h3.onContentChanged();
    }

    @Override
    public final void onError() {
        v vVar = this.f9658a;
        vVar.f9894a = 3;
        z3 z3Var = this.d;
        z3Var.Z3.remove(vVar);
        z3Var.f10008l3.remove(this.f9659b);
        z3Var.Y2.N(true);
        z3Var.f10001h3.onContentChanged();
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

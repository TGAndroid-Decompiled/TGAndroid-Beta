package ii;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements a5 {
    public final u f11384a;
    public final a f11385b;
    public final String f11386c;
    public final x3 d;

    public g3(x3 x3Var, u uVar, a aVar, String str) {
        this.d = x3Var;
        this.f11384a = uVar;
        this.f11385b = aVar;
        this.f11386c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f11386c;
        document.localPath = str;
        x3 x3Var = this.d;
        FileLoader.getInstance(x3Var.f11727f3).setLocalPathTo(document, str);
        u uVar = this.f11384a;
        uVar.h = document;
        uVar.f11636a = 2;
        TL_iv.PageBlock pageBlock = this.f11385b.f11194b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f18335id;
        }
        x3Var.Z3.remove(uVar);
        x3Var.Y2.N(false);
        x3Var.f11731h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11384a.f11639f = f7;
        a aVar = this.f11385b;
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
        x3Var.f11731h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11384a;
        uVar.f11636a = 3;
        x3 x3Var = this.d;
        x3Var.Z3.remove(uVar);
        x3Var.f11738l3.remove(this.f11385b);
        x3Var.Y2.N(true);
        x3Var.f11731h3.onContentChanged();
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

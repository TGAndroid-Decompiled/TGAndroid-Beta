package ii;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements z4 {
    public final u f11390a;
    public final a f11391b;
    public final w3 f11392c;

    public g3(a aVar, u uVar, w3 w3Var) {
        this.f11392c = w3Var;
        this.f11390a = uVar;
        this.f11391b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        u uVar = this.f11390a;
        uVar.h = document;
        uVar.f11644i = document;
        uVar.f11639a = 2;
        TL_iv.PageBlock pageBlock = this.f11391b.f11205b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f18334id;
        }
        w3 w3Var = this.f11392c;
        w3Var.Z3.remove(uVar);
        w3Var.Y2.N(false);
        w3Var.f11715h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11390a.f11642f = f7;
        a aVar = this.f11391b;
        w3 w3Var = this.f11392c;
        View A1 = w3Var.A1(aVar);
        if (A1 instanceof z) {
            ((z) A1).m(false);
            A1.invalidate();
        }
        w3Var.f11715h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11390a;
        uVar.f11639a = 3;
        w3 w3Var = this.f11392c;
        w3Var.Z3.remove(uVar);
        int indexOf = w3Var.f11722l3.indexOf(this.f11391b);
        if (indexOf >= 0) {
            w3Var.f11722l3.remove(indexOf);
            w3Var.Y2.N(true);
        }
        w3Var.f11715h3.onContentChanged();
    }

    @Override
    public final void b(TLRPC.Photo photo) {
    }

    @Override
    public final void c(TLRPC.Document document) {
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void a(int i10, int i11) {
    }
}

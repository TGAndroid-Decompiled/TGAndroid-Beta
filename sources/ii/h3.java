package ii;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h3 implements b5 {
    public final u f12457a;
    public final a f12458b;
    public final x3 f12459c;

    public h3(a aVar, u uVar, x3 x3Var) {
        this.f12459c = x3Var;
        this.f12457a = uVar;
        this.f12458b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        u uVar = this.f12457a;
        uVar.h = document;
        uVar.f12715i = document;
        uVar.f12709a = 2;
        TL_iv.PageBlock pageBlock = this.f12458b.f12233b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f20038id;
        }
        x3 x3Var = this.f12459c;
        x3Var.X3.remove(uVar);
        x3Var.W2.N(false);
        x3Var.f12808f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f12457a.f12713f = f7;
        a aVar = this.f12458b;
        x3 x3Var = this.f12459c;
        View A1 = x3Var.A1(aVar);
        if (A1 instanceof z) {
            ((z) A1).m(false);
            A1.invalidate();
        }
        x3Var.f12808f3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f12457a;
        uVar.f12709a = 3;
        x3 x3Var = this.f12459c;
        x3Var.X3.remove(uVar);
        int indexOf = x3Var.j3.indexOf(this.f12458b);
        if (indexOf >= 0) {
            x3Var.j3.remove(indexOf);
            x3Var.W2.N(true);
        }
        x3Var.f12808f3.onContentChanged();
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

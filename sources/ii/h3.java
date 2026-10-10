package ii;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h3 implements b5 {
    public final u f12458a;
    public final a f12459b;
    public final x3 f12460c;

    public h3(a aVar, u uVar, x3 x3Var) {
        this.f12460c = x3Var;
        this.f12458a = uVar;
        this.f12459b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        u uVar = this.f12458a;
        uVar.h = document;
        uVar.f12716i = document;
        uVar.f12710a = 2;
        TL_iv.PageBlock pageBlock = this.f12459b.f12234b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f20048id;
        }
        x3 x3Var = this.f12460c;
        x3Var.X3.remove(uVar);
        x3Var.W2.N(false);
        x3Var.f12809f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f12458a.f12714f = f7;
        a aVar = this.f12459b;
        x3 x3Var = this.f12460c;
        View A1 = x3Var.A1(aVar);
        if (A1 instanceof z) {
            ((z) A1).m(false);
            A1.invalidate();
        }
        x3Var.f12809f3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f12458a;
        uVar.f12710a = 3;
        x3 x3Var = this.f12460c;
        x3Var.X3.remove(uVar);
        int indexOf = x3Var.j3.indexOf(this.f12459b);
        if (indexOf >= 0) {
            x3Var.j3.remove(indexOf);
            x3Var.W2.N(true);
        }
        x3Var.f12809f3.onContentChanged();
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

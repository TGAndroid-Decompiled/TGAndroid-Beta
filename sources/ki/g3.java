package ki;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements z4 {
    public final t f15278a;
    public final a f15279b;
    public final w3 f15280c;

    public g3(a aVar, t tVar, w3 w3Var) {
        this.f15280c = w3Var;
        this.f15278a = tVar;
        this.f15279b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        t tVar = this.f15278a;
        tVar.h = document;
        tVar.f15512i = document;
        tVar.f15507a = 2;
        TL_iv.PageBlock pageBlock = this.f15279b.f15094b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f20278id;
        }
        w3 w3Var = this.f15280c;
        w3Var.X3.remove(tVar);
        w3Var.W2.N(false);
        w3Var.f15591f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f15278a.f15510f = f7;
        a aVar = this.f15279b;
        w3 w3Var = this.f15280c;
        View A1 = w3Var.A1(aVar);
        if (A1 instanceof z) {
            ((z) A1).m(false);
            A1.invalidate();
        }
        w3Var.f15591f3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f15278a;
        tVar.f15507a = 3;
        w3 w3Var = this.f15280c;
        w3Var.X3.remove(tVar);
        int indexOf = w3Var.f15599j3.indexOf(this.f15279b);
        if (indexOf >= 0) {
            w3Var.f15599j3.remove(indexOf);
            w3Var.W2.N(true);
        }
        w3Var.f15591f3.onContentChanged();
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

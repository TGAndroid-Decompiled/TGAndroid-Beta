package ki;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements z4 {
    public final t f15280a;
    public final a f15281b;
    public final w3 f15282c;

    public g3(a aVar, t tVar, w3 w3Var) {
        this.f15282c = w3Var;
        this.f15280a = tVar;
        this.f15281b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        t tVar = this.f15280a;
        tVar.h = document;
        tVar.f15514i = document;
        tVar.f15509a = 2;
        TL_iv.PageBlock pageBlock = this.f15281b.f15096b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f20285id;
        }
        w3 w3Var = this.f15282c;
        w3Var.X3.remove(tVar);
        w3Var.W2.N(false);
        w3Var.f15593f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f15280a.f15512f = f7;
        a aVar = this.f15281b;
        w3 w3Var = this.f15282c;
        View A1 = w3Var.A1(aVar);
        if (A1 instanceof z) {
            ((z) A1).m(false);
            A1.invalidate();
        }
        w3Var.f15593f3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f15280a;
        tVar.f15509a = 3;
        w3 w3Var = this.f15282c;
        w3Var.X3.remove(tVar);
        int indexOf = w3Var.f15601j3.indexOf(this.f15281b);
        if (indexOf >= 0) {
            w3Var.f15601j3.remove(indexOf);
            w3Var.W2.N(true);
        }
        w3Var.f15593f3.onContentChanged();
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

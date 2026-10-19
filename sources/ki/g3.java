package ki;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements z4 {
    public final t f15281a;
    public final a f15282b;
    public final w3 f15283c;

    public g3(a aVar, t tVar, w3 w3Var) {
        this.f15283c = w3Var;
        this.f15281a = tVar;
        this.f15282b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        t tVar = this.f15281a;
        tVar.h = document;
        tVar.f15515i = document;
        tVar.f15510a = 2;
        TL_iv.PageBlock pageBlock = this.f15282b.f15097b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f20281id;
        }
        w3 w3Var = this.f15283c;
        w3Var.X3.remove(tVar);
        w3Var.W2.N(false);
        w3Var.f15594f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f15281a.f15513f = f7;
        a aVar = this.f15282b;
        w3 w3Var = this.f15283c;
        View A1 = w3Var.A1(aVar);
        if (A1 instanceof z) {
            ((z) A1).m(false);
            A1.invalidate();
        }
        w3Var.f15594f3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f15281a;
        tVar.f15510a = 3;
        w3 w3Var = this.f15283c;
        w3Var.X3.remove(tVar);
        int indexOf = w3Var.f15602j3.indexOf(this.f15282b);
        if (indexOf >= 0) {
            w3Var.f15602j3.remove(indexOf);
            w3Var.W2.N(true);
        }
        w3Var.f15594f3.onContentChanged();
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

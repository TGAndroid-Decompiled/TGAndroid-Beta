package ki;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements z4 {
    public final t f15337a;
    public final a f15338b;
    public final w3 f15339c;

    public g3(a aVar, t tVar, w3 w3Var) {
        this.f15339c = w3Var;
        this.f15337a = tVar;
        this.f15338b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        t tVar = this.f15337a;
        tVar.h = document;
        tVar.f15573i = document;
        tVar.f15568a = 2;
        TL_iv.PageBlock pageBlock = this.f15338b.f15141b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f20349id;
        }
        w3 w3Var = this.f15339c;
        w3Var.f15646a4.remove(tVar);
        w3Var.Z2.N(false);
        w3Var.f15656i3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f15337a.f15571f = f7;
        a aVar = this.f15338b;
        w3 w3Var = this.f15339c;
        View F1 = w3Var.F1(aVar);
        if (F1 instanceof z) {
            ((z) F1).l(false);
            F1.invalidate();
        }
        w3Var.f15656i3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f15337a;
        tVar.f15568a = 3;
        w3 w3Var = this.f15339c;
        w3Var.f15646a4.remove(tVar);
        int indexOf = w3Var.f15663m3.indexOf(this.f15338b);
        if (indexOf >= 0) {
            w3Var.f15663m3.remove(indexOf);
            w3Var.Z2.N(true);
        }
        w3Var.f15656i3.onContentChanged();
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

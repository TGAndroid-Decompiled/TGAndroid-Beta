package hi;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class j3 implements c5 {
    public final v f9674a;
    public final a f9675b;
    public final z3 f9676c;

    public j3(a aVar, v vVar, z3 z3Var) {
        this.f9676c = z3Var;
        this.f9674a = vVar;
        this.f9675b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        v vVar = this.f9674a;
        vVar.h = document;
        vVar.f9899i = document;
        vVar.f9894a = 2;
        TL_iv.PageBlock pageBlock = this.f9675b.f9421b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f17201id;
        }
        z3 z3Var = this.f9676c;
        z3Var.Z3.remove(vVar);
        z3Var.Y2.N(false);
        z3Var.f10001h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f9674a.f9897f = f7;
        a aVar = this.f9675b;
        z3 z3Var = this.f9676c;
        View y12 = z3Var.y1(aVar);
        if (y12 instanceof a0) {
            ((a0) y12).m(false);
            y12.invalidate();
        }
        z3Var.f10001h3.onContentChanged();
    }

    @Override
    public final void onError() {
        v vVar = this.f9674a;
        vVar.f9894a = 3;
        z3 z3Var = this.f9676c;
        z3Var.Z3.remove(vVar);
        int indexOf = z3Var.f10008l3.indexOf(this.f9675b);
        if (indexOf >= 0) {
            z3Var.f10008l3.remove(indexOf);
            z3Var.Y2.N(true);
        }
        z3Var.f10001h3.onContentChanged();
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

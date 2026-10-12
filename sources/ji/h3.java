package ji;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h3 implements d5 {
    public final u f13305a;
    public final a f13306b;
    public final x3 f13307c;

    public h3(a aVar, u uVar, x3 x3Var) {
        this.f13307c = x3Var;
        this.f13305a = uVar;
        this.f13306b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        u uVar = this.f13305a;
        uVar.h = document;
        uVar.f13540i = document;
        uVar.f13535a = 2;
        TL_iv.PageBlock pageBlock = this.f13306b.f13103b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f19222id;
        }
        x3 x3Var = this.f13307c;
        x3Var.X3.remove(uVar);
        x3Var.W2.N(false);
        x3Var.f13627f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f13305a.f13538f = f7;
        a aVar = this.f13306b;
        x3 x3Var = this.f13307c;
        View A1 = x3Var.A1(aVar);
        if (A1 instanceof z) {
            ((z) A1).m(false);
            A1.invalidate();
        }
        x3Var.f13627f3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f13305a;
        uVar.f13535a = 3;
        x3 x3Var = this.f13307c;
        x3Var.X3.remove(uVar);
        int indexOf = x3Var.f13635j3.indexOf(this.f13306b);
        if (indexOf >= 0) {
            x3Var.f13635j3.remove(indexOf);
            x3Var.W2.N(true);
        }
        x3Var.f13627f3.onContentChanged();
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

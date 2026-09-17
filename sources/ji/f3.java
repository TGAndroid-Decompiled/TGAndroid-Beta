package ji;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements c5 {
    public final u f13922a;
    public final a f13923b;
    public final v3 f13924c;

    public f3(a aVar, u uVar, v3 v3Var) {
        this.f13924c = v3Var;
        this.f13922a = uVar;
        this.f13923b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        u uVar = this.f13922a;
        uVar.h = document;
        uVar.f14227i = document;
        uVar.f14221a = 2;
        TL_iv.PageBlock pageBlock = this.f13923b.f13758b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f19902id;
        }
        v3 v3Var = this.f13924c;
        v3Var.Z3.remove(uVar);
        v3Var.Y2.N(false);
        v3Var.f14275h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f13922a.f14225f = f7;
        a aVar = this.f13923b;
        v3 v3Var = this.f13924c;
        View y12 = v3Var.y1(aVar);
        if (y12 instanceof z) {
            ((z) y12).m(false);
            y12.invalidate();
        }
        v3Var.f14275h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f13922a;
        uVar.f14221a = 3;
        v3 v3Var = this.f13924c;
        v3Var.Z3.remove(uVar);
        int indexOf = v3Var.f14282l3.indexOf(this.f13923b);
        if (indexOf >= 0) {
            v3Var.f14282l3.remove(indexOf);
            v3Var.Y2.N(true);
        }
        v3Var.f14275h3.onContentChanged();
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

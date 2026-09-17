package ji;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements c5 {
    public final u f13896a;
    public final a f13897b;
    public final v3 f13898c;

    public f3(a aVar, u uVar, v3 v3Var) {
        this.f13898c = v3Var;
        this.f13896a = uVar;
        this.f13897b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        u uVar = this.f13896a;
        uVar.h = document;
        uVar.f14201i = document;
        uVar.f14195a = 2;
        TL_iv.PageBlock pageBlock = this.f13897b.f13732b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f19875id;
        }
        v3 v3Var = this.f13898c;
        v3Var.Z3.remove(uVar);
        v3Var.Y2.N(false);
        v3Var.f14249h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f13896a.f14199f = f7;
        a aVar = this.f13897b;
        v3 v3Var = this.f13898c;
        View y12 = v3Var.y1(aVar);
        if (y12 instanceof z) {
            ((z) y12).m(false);
            y12.invalidate();
        }
        v3Var.f14249h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f13896a;
        uVar.f14195a = 3;
        v3 v3Var = this.f13898c;
        v3Var.Z3.remove(uVar);
        int indexOf = v3Var.f14256l3.indexOf(this.f13897b);
        if (indexOf >= 0) {
            v3Var.f14256l3.remove(indexOf);
            v3Var.Y2.N(true);
        }
        v3Var.f14249h3.onContentChanged();
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

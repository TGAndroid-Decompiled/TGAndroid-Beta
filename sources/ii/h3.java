package ii;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h3 implements a5 {
    public final u f11402a;
    public final a f11403b;
    public final x3 f11404c;

    public h3(a aVar, u uVar, x3 x3Var) {
        this.f11404c = x3Var;
        this.f11402a = uVar;
        this.f11403b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        u uVar = this.f11402a;
        uVar.h = document;
        uVar.f11641i = document;
        uVar.f11636a = 2;
        TL_iv.PageBlock pageBlock = this.f11403b.f11194b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f18335id;
        }
        x3 x3Var = this.f11404c;
        x3Var.Z3.remove(uVar);
        x3Var.Y2.N(false);
        x3Var.f11731h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11402a.f11639f = f7;
        a aVar = this.f11403b;
        x3 x3Var = this.f11404c;
        View A1 = x3Var.A1(aVar);
        if (A1 instanceof z) {
            ((z) A1).m(false);
            A1.invalidate();
        }
        x3Var.f11731h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11402a;
        uVar.f11636a = 3;
        x3 x3Var = this.f11404c;
        x3Var.Z3.remove(uVar);
        int indexOf = x3Var.f11738l3.indexOf(this.f11403b);
        if (indexOf >= 0) {
            x3Var.f11738l3.remove(indexOf);
            x3Var.Y2.N(true);
        }
        x3Var.f11731h3.onContentChanged();
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

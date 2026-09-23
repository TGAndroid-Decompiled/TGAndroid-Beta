package ii;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h3 implements a5 {
    public final u f11399a;
    public final a f11400b;
    public final x3 f11401c;

    public h3(a aVar, u uVar, x3 x3Var) {
        this.f11401c = x3Var;
        this.f11399a = uVar;
        this.f11400b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        u uVar = this.f11399a;
        uVar.h = document;
        uVar.f11638i = document;
        uVar.f11633a = 2;
        TL_iv.PageBlock pageBlock = this.f11400b.f11191b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f18089id;
        }
        x3 x3Var = this.f11401c;
        x3Var.Z3.remove(uVar);
        x3Var.Y2.N(false);
        x3Var.f11728h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11399a.f11636f = f7;
        a aVar = this.f11400b;
        x3 x3Var = this.f11401c;
        View z12 = x3Var.z1(aVar);
        if (z12 instanceof z) {
            ((z) z12).m(false);
            z12.invalidate();
        }
        x3Var.f11728h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11399a;
        uVar.f11633a = 3;
        x3 x3Var = this.f11401c;
        x3Var.Z3.remove(uVar);
        int indexOf = x3Var.f11735l3.indexOf(this.f11400b);
        if (indexOf >= 0) {
            x3Var.f11735l3.remove(indexOf);
            x3Var.Y2.N(true);
        }
        x3Var.f11728h3.onContentChanged();
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

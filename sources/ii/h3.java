package ii;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h3 implements a5 {
    public final u f11413a;
    public final a f11414b;
    public final x3 f11415c;

    public h3(a aVar, u uVar, x3 x3Var) {
        this.f11415c = x3Var;
        this.f11413a = uVar;
        this.f11414b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        u uVar = this.f11413a;
        uVar.h = document;
        uVar.f11652i = document;
        uVar.f11647a = 2;
        TL_iv.PageBlock pageBlock = this.f11414b.f11205b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f18358id;
        }
        x3 x3Var = this.f11415c;
        x3Var.f11739g4.remove(uVar);
        x3Var.f28778f3.N(false);
        x3Var.f11748o3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11413a.f11650f = f7;
        a aVar = this.f11414b;
        x3 x3Var = this.f11415c;
        View B1 = x3Var.B1(aVar);
        if (B1 instanceof z) {
            ((z) B1).m(false);
            B1.invalidate();
        }
        x3Var.f11748o3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11413a;
        uVar.f11647a = 3;
        x3 x3Var = this.f11415c;
        x3Var.f11739g4.remove(uVar);
        int indexOf = x3Var.f11756s3.indexOf(this.f11414b);
        if (indexOf >= 0) {
            x3Var.f11756s3.remove(indexOf);
            x3Var.f28778f3.N(true);
        }
        x3Var.f11748o3.onContentChanged();
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

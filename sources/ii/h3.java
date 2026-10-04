package ii;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h3 implements b5 {
    public final u f12411a;
    public final a f12412b;
    public final x3 f12413c;

    public h3(a aVar, u uVar, x3 x3Var) {
        this.f12413c = x3Var;
        this.f12411a = uVar;
        this.f12412b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        u uVar = this.f12411a;
        uVar.h = document;
        uVar.f12668i = document;
        uVar.f12662a = 2;
        TL_iv.PageBlock pageBlock = this.f12412b.f12186b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f20044id;
        }
        x3 x3Var = this.f12413c;
        x3Var.f12760g4.remove(uVar);
        x3Var.f25245f3.N(false);
        x3Var.f12769o3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f12411a.f12666f = f7;
        a aVar = this.f12412b;
        x3 x3Var = this.f12413c;
        View B1 = x3Var.B1(aVar);
        if (B1 instanceof z) {
            ((z) B1).m(false);
            B1.invalidate();
        }
        x3Var.f12769o3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f12411a;
        uVar.f12662a = 3;
        x3 x3Var = this.f12413c;
        x3Var.f12760g4.remove(uVar);
        int indexOf = x3Var.f12777s3.indexOf(this.f12412b);
        if (indexOf >= 0) {
            x3Var.f12777s3.remove(indexOf);
            x3Var.f25245f3.N(true);
        }
        x3Var.f12769o3.onContentChanged();
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

package ii;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h3 implements b5 {
    public final u f12412a;
    public final a f12413b;
    public final x3 f12414c;

    public h3(a aVar, u uVar, x3 x3Var) {
        this.f12414c = x3Var;
        this.f12412a = uVar;
        this.f12413b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        u uVar = this.f12412a;
        uVar.h = document;
        uVar.f12669i = document;
        uVar.f12663a = 2;
        TL_iv.PageBlock pageBlock = this.f12413b.f12187b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f20048id;
        }
        x3 x3Var = this.f12414c;
        x3Var.f12761g4.remove(uVar);
        x3Var.f25250f3.N(false);
        x3Var.f12770o3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f12412a.f12667f = f7;
        a aVar = this.f12413b;
        x3 x3Var = this.f12414c;
        View B1 = x3Var.B1(aVar);
        if (B1 instanceof z) {
            ((z) B1).m(false);
            B1.invalidate();
        }
        x3Var.f12770o3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f12412a;
        uVar.f12663a = 3;
        x3 x3Var = this.f12414c;
        x3Var.f12761g4.remove(uVar);
        int indexOf = x3Var.f12778s3.indexOf(this.f12413b);
        if (indexOf >= 0) {
            x3Var.f12778s3.remove(indexOf);
            x3Var.f25250f3.N(true);
        }
        x3Var.f12770o3.onContentChanged();
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

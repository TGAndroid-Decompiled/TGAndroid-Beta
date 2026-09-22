package ii;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements z4 {
    public final u f11388a;
    public final a f11389b;
    public final w3 f11390c;

    public g3(a aVar, u uVar, w3 w3Var) {
        this.f11390c = w3Var;
        this.f11388a = uVar;
        this.f11389b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        u uVar = this.f11388a;
        uVar.h = document;
        uVar.f11642i = document;
        uVar.f11637a = 2;
        TL_iv.PageBlock pageBlock = this.f11389b.f11203b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f18115id;
        }
        w3 w3Var = this.f11390c;
        w3Var.Z3.remove(uVar);
        w3Var.Y2.N(false);
        w3Var.f11713h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11388a.f11640f = f7;
        a aVar = this.f11389b;
        w3 w3Var = this.f11390c;
        View z12 = w3Var.z1(aVar);
        if (z12 instanceof z) {
            ((z) z12).m(false);
            z12.invalidate();
        }
        w3Var.f11713h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11388a;
        uVar.f11637a = 3;
        w3 w3Var = this.f11390c;
        w3Var.Z3.remove(uVar);
        int indexOf = w3Var.f11720l3.indexOf(this.f11389b);
        if (indexOf >= 0) {
            w3Var.f11720l3.remove(indexOf);
            w3Var.Y2.N(true);
        }
        w3Var.f11713h3.onContentChanged();
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

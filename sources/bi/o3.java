package bi;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class o3 implements k5 {
    public final w f3261a;
    public final a f3262b;
    public final d4 f3263c;

    public o3(a aVar, w wVar, d4 d4Var) {
        this.f3263c = d4Var;
        this.f3261a = wVar;
        this.f3262b = aVar;
    }

    @Override
    public final void a() {
        w wVar = this.f3261a;
        wVar.f3416a = 3;
        d4 d4Var = this.f3263c;
        d4Var.f2929g4.remove(wVar);
        int indexOf = d4Var.f2946s3.indexOf(this.f3262b);
        if (indexOf >= 0) {
            d4Var.f2946s3.remove(indexOf);
            d4Var.f31183f3.O(true);
        }
        d4Var.f2938o3.onContentChanged();
    }

    @Override
    public final void f(TLRPC.Document document) {
        w wVar = this.f3261a;
        wVar.h = document;
        wVar.f3421i = document;
        wVar.f3416a = 2;
        TL_iv.PageBlock pageBlock = this.f3262b.f2818b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f19800id;
        }
        d4 d4Var = this.f3263c;
        d4Var.f2929g4.remove(wVar);
        d4Var.f31183f3.O(false);
        d4Var.f2938o3.onContentChanged();
    }

    @Override
    public final void g(float f7) {
        this.f3261a.f3419f = f7;
        a aVar = this.f3262b;
        d4 d4Var = this.f3263c;
        View C1 = d4Var.C1(aVar);
        if (C1 instanceof b0) {
            ((b0) C1).n(false);
            C1.invalidate();
        }
        d4Var.f2938o3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Photo photo) {
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void b(int i10, int i11) {
    }
}

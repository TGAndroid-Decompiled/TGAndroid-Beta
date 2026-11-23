package oi;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements x4 {
    public final r f22124a;
    public final a f22125b;
    public final t3 f22126c;

    public f3(a aVar, r rVar, t3 t3Var) {
        this.f22126c = t3Var;
        this.f22124a = rVar;
        this.f22125b = aVar;
    }

    @Override
    public final void a() {
        r rVar = this.f22124a;
        rVar.f22344a = 3;
        t3 t3Var = this.f22126c;
        t3Var.f22419h4.remove(rVar);
        int indexOf = t3Var.f22436t3.indexOf(this.f22125b);
        if (indexOf >= 0) {
            t3Var.f22436t3.remove(indexOf);
            t3Var.f35790g3.O(true);
        }
        t3Var.f22428p3.onContentChanged();
    }

    @Override
    public final void f(TLRPC.Document document) {
        r rVar = this.f22124a;
        rVar.h = document;
        rVar.f22350i = document;
        rVar.f22344a = 2;
        TL_iv.PageBlock pageBlock = this.f22125b.f21935b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f28440id;
        }
        t3 t3Var = this.f22126c;
        t3Var.f22419h4.remove(rVar);
        t3Var.f35790g3.O(false);
        t3Var.f22428p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f22124a.f22348f = f10;
        a aVar = this.f22125b;
        t3 t3Var = this.f22126c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof x) {
            ((x) C1).n(false);
            C1.invalidate();
        }
        t3Var.f22428p3.onContentChanged();
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
    public final void b(int i7, int i10) {
    }
}

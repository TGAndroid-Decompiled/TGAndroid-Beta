package oi;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements x4 {
    public final s f22190a;
    public final a f22191b;
    public final t3 f22192c;

    public f3(a aVar, s sVar, t3 t3Var) {
        this.f22192c = t3Var;
        this.f22190a = sVar;
        this.f22191b = aVar;
    }

    @Override
    public final void a() {
        s sVar = this.f22190a;
        sVar.f22421a = 3;
        t3 t3Var = this.f22192c;
        t3Var.f22486h4.remove(sVar);
        int indexOf = t3Var.f22503t3.indexOf(this.f22191b);
        if (indexOf >= 0) {
            t3Var.f22503t3.remove(indexOf);
            t3Var.f35323g3.O(true);
        }
        t3Var.f22495p3.onContentChanged();
    }

    @Override
    public final void f(TLRPC.Document document) {
        s sVar = this.f22190a;
        sVar.h = document;
        sVar.f22427i = document;
        sVar.f22421a = 2;
        TL_iv.PageBlock pageBlock = this.f22191b.f22001b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f28498id;
        }
        t3 t3Var = this.f22192c;
        t3Var.f22486h4.remove(sVar);
        t3Var.f35323g3.O(false);
        t3Var.f22495p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f22190a.f22425f = f10;
        a aVar = this.f22191b;
        t3 t3Var = this.f22192c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof x) {
            ((x) C1).n(false);
            C1.invalidate();
        }
        t3Var.f22495p3.onContentChanged();
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

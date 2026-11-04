package mi;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements y4 {
    public final s f19598a;
    public final a f19599b;
    public final t3 f19600c;

    public f3(a aVar, s sVar, t3 t3Var) {
        this.f19600c = t3Var;
        this.f19598a = sVar;
        this.f19599b = aVar;
    }

    @Override
    public final void a() {
        s sVar = this.f19598a;
        sVar.f19859a = 3;
        t3 t3Var = this.f19600c;
        t3Var.f19907h4.remove(sVar);
        int indexOf = t3Var.f19924t3.indexOf(this.f19599b);
        if (indexOf >= 0) {
            t3Var.f19924t3.remove(indexOf);
            t3Var.f35594g3.O(true);
        }
        t3Var.f19916p3.onContentChanged();
    }

    @Override
    public final void f(TLRPC.Document document) {
        s sVar = this.f19598a;
        sVar.h = document;
        sVar.f19865i = document;
        sVar.f19859a = 2;
        TL_iv.PageBlock pageBlock = this.f19599b.f19431b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f27007id;
        }
        t3 t3Var = this.f19600c;
        t3Var.f19907h4.remove(sVar);
        t3Var.f35594g3.O(false);
        t3Var.f19916p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f19598a.f19863f = f10;
        a aVar = this.f19599b;
        t3 t3Var = this.f19600c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof x) {
            ((x) C1).n(false);
            C1.invalidate();
        }
        t3Var.f19916p3.onContentChanged();
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
    public final void b(int i3, int i10) {
    }
}

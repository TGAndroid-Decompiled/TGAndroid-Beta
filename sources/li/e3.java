package li;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements x4 {
    public final s f18536a;
    public final a f18537b;
    public final t3 f18538c;

    public e3(a aVar, s sVar, t3 t3Var) {
        this.f18538c = t3Var;
        this.f18536a = sVar;
        this.f18537b = aVar;
    }

    @Override
    public final void a() {
        s sVar = this.f18536a;
        sVar.f18817a = 3;
        t3 t3Var = this.f18538c;
        t3Var.f18883g4.remove(sVar);
        int indexOf = t3Var.f18900s3.indexOf(this.f18537b);
        if (indexOf >= 0) {
            t3Var.f18900s3.remove(indexOf);
            t3Var.f37496f3.O(true);
        }
        t3Var.f18893o3.onContentChanged();
    }

    @Override
    public final void f(TLRPC.Document document) {
        s sVar = this.f18536a;
        sVar.h = document;
        sVar.f18823i = document;
        sVar.f18817a = 2;
        TL_iv.PageBlock pageBlock = this.f18537b.f18395b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f26966id;
        }
        t3 t3Var = this.f18538c;
        t3Var.f18883g4.remove(sVar);
        t3Var.f37496f3.O(false);
        t3Var.f18893o3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f18536a.f18821f = f10;
        a aVar = this.f18537b;
        t3 t3Var = this.f18538c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof x) {
            ((x) C1).n(false);
            C1.invalidate();
        }
        t3Var.f18893o3.onContentChanged();
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

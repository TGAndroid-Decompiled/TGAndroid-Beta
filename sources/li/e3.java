package li;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements x4 {
    public final s f18533a;
    public final a f18534b;
    public final t3 f18535c;

    public e3(a aVar, s sVar, t3 t3Var) {
        this.f18535c = t3Var;
        this.f18533a = sVar;
        this.f18534b = aVar;
    }

    @Override
    public final void a() {
        s sVar = this.f18533a;
        sVar.f18814a = 3;
        t3 t3Var = this.f18535c;
        t3Var.f18880g4.remove(sVar);
        int indexOf = t3Var.f18897s3.indexOf(this.f18534b);
        if (indexOf >= 0) {
            t3Var.f18897s3.remove(indexOf);
            t3Var.f37556f3.O(true);
        }
        t3Var.f18890o3.onContentChanged();
    }

    @Override
    public final void f(TLRPC.Document document) {
        s sVar = this.f18533a;
        sVar.h = document;
        sVar.f18820i = document;
        sVar.f18814a = 2;
        TL_iv.PageBlock pageBlock = this.f18534b.f18392b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f26962id;
        }
        t3 t3Var = this.f18535c;
        t3Var.f18880g4.remove(sVar);
        t3Var.f37556f3.O(false);
        t3Var.f18890o3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f18533a.f18818f = f10;
        a aVar = this.f18534b;
        t3 t3Var = this.f18535c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof x) {
            ((x) C1).n(false);
            C1.invalidate();
        }
        t3Var.f18890o3.onContentChanged();
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

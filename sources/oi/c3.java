package oi;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class c3 implements v4 {
    public final r f21606a;
    public final a f21607b;
    public final q3 f21608c;

    public c3(a aVar, r rVar, q3 q3Var) {
        this.f21608c = q3Var;
        this.f21606a = rVar;
        this.f21607b = aVar;
    }

    @Override
    public final void a() {
        r rVar = this.f21606a;
        rVar.f21957a = 3;
        q3 q3Var = this.f21608c;
        q3Var.f21922h4.remove(rVar);
        int indexOf = q3Var.f21939t3.indexOf(this.f21607b);
        if (indexOf >= 0) {
            q3Var.f21939t3.remove(indexOf);
            q3Var.f39895g3.O(true);
        }
        q3Var.f21931p3.onContentChanged();
    }

    @Override
    public final void f(TLRPC.Document document) {
        r rVar = this.f21606a;
        rVar.h = document;
        rVar.f21963i = document;
        rVar.f21957a = 2;
        TL_iv.PageBlock pageBlock = this.f21607b.f21544b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f28057id;
        }
        q3 q3Var = this.f21608c;
        q3Var.f21922h4.remove(rVar);
        q3Var.f39895g3.O(false);
        q3Var.f21931p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f21606a.f21961f = f10;
        a aVar = this.f21607b;
        q3 q3Var = this.f21608c;
        View C1 = q3Var.C1(aVar);
        if (C1 instanceof w) {
            ((w) C1).n(false);
            C1.invalidate();
        }
        q3Var.f21931p3.onContentChanged();
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

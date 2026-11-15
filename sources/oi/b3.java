package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class b3 implements v4 {
    public final r f21588a;
    public final a f21589b;
    public final String f21590c;
    public final q3 d;

    public b3(q3 q3Var, r rVar, a aVar, String str) {
        this.d = q3Var;
        this.f21588a = rVar;
        this.f21589b = aVar;
        this.f21590c = str;
    }

    @Override
    public final void a() {
        r rVar = this.f21588a;
        rVar.f21957a = 3;
        q3 q3Var = this.d;
        q3Var.f21922h4.remove(rVar);
        q3Var.f21939t3.remove(this.f21589b);
        q3Var.f39892g3.O(true);
        q3Var.f21931p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
        String str = this.f21590c;
        document.localPath = str;
        q3 q3Var = this.d;
        w7.G(q3Var.f21928n3).e0(str, document);
        r rVar = this.f21588a;
        rVar.h = document;
        rVar.f21957a = 2;
        TL_iv.PageBlock pageBlock = this.f21589b.f21544b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f28057id;
        }
        q3Var.f21922h4.remove(rVar);
        q3Var.f39892g3.O(false);
        q3Var.f21931p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f21588a.f21961f = f10;
        a aVar = this.f21589b;
        q3 q3Var = this.d;
        View C1 = q3Var.C1(aVar);
        if (C1 instanceof v0) {
            v0 v0Var = (v0) C1;
            v0Var.g(v0Var.h());
            v0Var.l();
            v0Var.m(false);
            v0Var.requestLayout();
            v0Var.invalidate();
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
    public final void f(TLRPC.Document document) {
    }

    @Override
    public final void b(int i7, int i10) {
    }
}

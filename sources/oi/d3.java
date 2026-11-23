package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class d3 implements w4 {
    public final r f22015a;
    public final a f22016b;
    public final String f22017c;
    public final s3 d;

    public d3(s3 s3Var, r rVar, a aVar, String str) {
        this.d = s3Var;
        this.f22015a = rVar;
        this.f22016b = aVar;
        this.f22017c = str;
    }

    @Override
    public final void a() {
        r rVar = this.f22015a;
        rVar.f22289a = 3;
        s3 s3Var = this.d;
        s3Var.f22356h4.remove(rVar);
        s3Var.f22373t3.remove(this.f22016b);
        s3Var.f35742g3.O(true);
        s3Var.f22365p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
        String str = this.f22017c;
        document.localPath = str;
        s3 s3Var = this.d;
        w7.G(s3Var.f22362n3).e0(str, document);
        r rVar = this.f22015a;
        rVar.h = document;
        rVar.f22289a = 2;
        TL_iv.PageBlock pageBlock = this.f22016b.f21901b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f28404id;
        }
        s3Var.f22356h4.remove(rVar);
        s3Var.f35742g3.O(false);
        s3Var.f22365p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f22015a.f22293f = f10;
        a aVar = this.f22016b;
        s3 s3Var = this.d;
        View C1 = s3Var.C1(aVar);
        if (C1 instanceof v0) {
            v0 v0Var = (v0) C1;
            v0Var.g(v0Var.h());
            v0Var.l();
            v0Var.m(false);
            v0Var.requestLayout();
            v0Var.invalidate();
        }
        s3Var.f22365p3.onContentChanged();
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

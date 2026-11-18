package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class d3 implements w4 {
    public final r f21986a;
    public final a f21987b;
    public final String f21988c;
    public final s3 d;

    public d3(s3 s3Var, r rVar, a aVar, String str) {
        this.d = s3Var;
        this.f21986a = rVar;
        this.f21987b = aVar;
        this.f21988c = str;
    }

    @Override
    public final void a() {
        r rVar = this.f21986a;
        rVar.f22258a = 3;
        s3 s3Var = this.d;
        s3Var.f22325h4.remove(rVar);
        s3Var.f22342t3.remove(this.f21987b);
        s3Var.f34607g3.O(true);
        s3Var.f22334p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
        String str = this.f21988c;
        document.localPath = str;
        s3 s3Var = this.d;
        w7.G(s3Var.f22331n3).e0(str, document);
        r rVar = this.f21986a;
        rVar.h = document;
        rVar.f22258a = 2;
        TL_iv.PageBlock pageBlock = this.f21987b.f21907b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f28409id;
        }
        s3Var.f22325h4.remove(rVar);
        s3Var.f34607g3.O(false);
        s3Var.f22334p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f21986a.f22262f = f10;
        a aVar = this.f21987b;
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
        s3Var.f22334p3.onContentChanged();
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

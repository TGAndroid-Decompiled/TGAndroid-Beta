package oi;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements w4 {
    public final r f22064a;
    public final a f22065b;
    public final s3 f22066c;

    public e3(a aVar, r rVar, s3 s3Var) {
        this.f22066c = s3Var;
        this.f22064a = rVar;
        this.f22065b = aVar;
    }

    @Override
    public final void a() {
        r rVar = this.f22064a;
        rVar.f22289a = 3;
        s3 s3Var = this.f22066c;
        s3Var.f22356h4.remove(rVar);
        int indexOf = s3Var.f22373t3.indexOf(this.f22065b);
        if (indexOf >= 0) {
            s3Var.f22373t3.remove(indexOf);
            s3Var.f35742g3.O(true);
        }
        s3Var.f22365p3.onContentChanged();
    }

    @Override
    public final void f(TLRPC.Document document) {
        r rVar = this.f22064a;
        rVar.h = document;
        rVar.f22295i = document;
        rVar.f22289a = 2;
        TL_iv.PageBlock pageBlock = this.f22065b.f21901b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f28404id;
        }
        s3 s3Var = this.f22066c;
        s3Var.f22356h4.remove(rVar);
        s3Var.f35742g3.O(false);
        s3Var.f22365p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f22064a.f22293f = f10;
        a aVar = this.f22065b;
        s3 s3Var = this.f22066c;
        View C1 = s3Var.C1(aVar);
        if (C1 instanceof w) {
            ((w) C1).n(false);
            C1.invalidate();
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
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void b(int i7, int i10) {
    }
}

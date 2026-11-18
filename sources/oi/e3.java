package oi;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class e3 implements w4 {
    public final r f22035a;
    public final a f22036b;
    public final s3 f22037c;

    public e3(a aVar, r rVar, s3 s3Var) {
        this.f22037c = s3Var;
        this.f22035a = rVar;
        this.f22036b = aVar;
    }

    @Override
    public final void a() {
        r rVar = this.f22035a;
        rVar.f22258a = 3;
        s3 s3Var = this.f22037c;
        s3Var.f22325h4.remove(rVar);
        int indexOf = s3Var.f22342t3.indexOf(this.f22036b);
        if (indexOf >= 0) {
            s3Var.f22342t3.remove(indexOf);
            s3Var.f34607g3.O(true);
        }
        s3Var.f22334p3.onContentChanged();
    }

    @Override
    public final void f(TLRPC.Document document) {
        r rVar = this.f22035a;
        rVar.h = document;
        rVar.f22264i = document;
        rVar.f22258a = 2;
        TL_iv.PageBlock pageBlock = this.f22036b.f21907b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f28409id;
        }
        s3 s3Var = this.f22037c;
        s3Var.f22325h4.remove(rVar);
        s3Var.f34607g3.O(false);
        s3Var.f22334p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f22035a.f22262f = f10;
        a aVar = this.f22036b;
        s3 s3Var = this.f22037c;
        View C1 = s3Var.C1(aVar);
        if (C1 instanceof w) {
            ((w) C1).n(false);
            C1.invalidate();
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
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void b(int i7, int i10) {
    }
}

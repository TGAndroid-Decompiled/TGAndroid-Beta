package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements w4 {
    public final r f22062a;
    public final a f22063b;
    public final s3 f22064c;

    public f3(a aVar, r rVar, s3 s3Var) {
        this.f22064c = s3Var;
        this.f22062a = rVar;
        this.f22063b = aVar;
    }

    @Override
    public final void a() {
        r rVar = this.f22062a;
        rVar.f22261a = 3;
        s3 s3Var = this.f22064c;
        s3Var.f22328h4.remove(rVar);
        s3Var.t4(this.f22063b, rVar);
        s3Var.f22337p3.onContentChanged();
    }

    @Override
    public final void b(int i7, int i10) {
        if (i7 > 0 && i10 > 0) {
            r rVar = this.f22062a;
            rVar.f22268j = i7;
            rVar.f22269k = i10;
        }
        View C1 = this.f22064c.C1(this.f22063b);
        if (C1 instanceof r4) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override
    public final void c(TLRPC.Photo photo) {
        int i7;
        int i10;
        r rVar = this.f22062a;
        rVar.f22266g = photo;
        rVar.f22261a = 2;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        if (w10 != null && (i7 = w10.f28430w) > 0 && (i10 = w10.h) > 0) {
            rVar.f22268j = i7;
            rVar.f22269k = i10;
        }
        a aVar = this.f22063b;
        TL_iv.PageBlock Q3 = s3.Q3(aVar, rVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.f28429id;
        }
        s3 s3Var = this.f22064c;
        s3Var.f22328h4.remove(rVar);
        s3Var.q4(aVar);
        s3Var.f22337p3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
        r rVar = this.f22062a;
        rVar.h = document;
        rVar.f22261a = 2;
        a aVar = this.f22063b;
        TL_iv.PageBlock Q3 = s3.Q3(aVar, rVar);
        if (Q3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) Q3).video_id = document.f28411id;
        }
        s3 s3Var = this.f22064c;
        s3Var.f22328h4.remove(rVar);
        s3Var.q4(aVar);
        s3Var.f22337p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f22062a.f22265f = f10;
        a aVar = this.f22063b;
        s3 s3Var = this.f22064c;
        View C1 = s3Var.C1(aVar);
        if (C1 instanceof r4) {
            C1.requestLayout();
            C1.invalidate();
        }
        s3Var.f22337p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void f(TLRPC.Document document) {
    }
}

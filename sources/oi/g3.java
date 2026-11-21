package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements x4 {
    public final r f22147a;
    public final a f22148b;
    public final t3 f22149c;

    public g3(a aVar, r rVar, t3 t3Var) {
        this.f22149c = t3Var;
        this.f22147a = rVar;
        this.f22148b = aVar;
    }

    @Override
    public final void a() {
        r rVar = this.f22147a;
        rVar.f22341a = 3;
        t3 t3Var = this.f22149c;
        t3Var.f22416h4.remove(rVar);
        t3Var.t4(this.f22148b, rVar);
        t3Var.f22425p3.onContentChanged();
    }

    @Override
    public final void b(int i7, int i10) {
        if (i7 > 0 && i10 > 0) {
            r rVar = this.f22147a;
            rVar.f22348j = i7;
            rVar.f22349k = i10;
        }
        View C1 = this.f22149c.C1(this.f22148b);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override
    public final void c(TLRPC.Photo photo) {
        int i7;
        int i10;
        r rVar = this.f22147a;
        rVar.f22346g = photo;
        rVar.f22341a = 2;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        if (w10 != null && (i7 = w10.f28456w) > 0 && (i10 = w10.h) > 0) {
            rVar.f22348j = i7;
            rVar.f22349k = i10;
        }
        a aVar = this.f22148b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, rVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.f28455id;
        }
        t3 t3Var = this.f22149c;
        t3Var.f22416h4.remove(rVar);
        t3Var.q4(aVar);
        t3Var.f22425p3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
        r rVar = this.f22147a;
        rVar.h = document;
        rVar.f22341a = 2;
        a aVar = this.f22148b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, rVar);
        if (Q3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) Q3).video_id = document.f28437id;
        }
        t3 t3Var = this.f22149c;
        t3Var.f22416h4.remove(rVar);
        t3Var.q4(aVar);
        t3Var.f22425p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f22147a.f22345f = f10;
        a aVar = this.f22148b;
        t3 t3Var = this.f22149c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
        t3Var.f22425p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void f(TLRPC.Document document) {
    }
}

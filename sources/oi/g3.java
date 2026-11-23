package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements x4 {
    public final r f22150a;
    public final a f22151b;
    public final t3 f22152c;

    public g3(a aVar, r rVar, t3 t3Var) {
        this.f22152c = t3Var;
        this.f22150a = rVar;
        this.f22151b = aVar;
    }

    @Override
    public final void a() {
        r rVar = this.f22150a;
        rVar.f22344a = 3;
        t3 t3Var = this.f22152c;
        t3Var.f22419h4.remove(rVar);
        t3Var.t4(this.f22151b, rVar);
        t3Var.f22428p3.onContentChanged();
    }

    @Override
    public final void b(int i7, int i10) {
        if (i7 > 0 && i10 > 0) {
            r rVar = this.f22150a;
            rVar.f22351j = i7;
            rVar.f22352k = i10;
        }
        View C1 = this.f22152c.C1(this.f22151b);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override
    public final void c(TLRPC.Photo photo) {
        int i7;
        int i10;
        r rVar = this.f22150a;
        rVar.f22349g = photo;
        rVar.f22344a = 2;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        if (w10 != null && (i7 = w10.f28459w) > 0 && (i10 = w10.h) > 0) {
            rVar.f22351j = i7;
            rVar.f22352k = i10;
        }
        a aVar = this.f22151b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, rVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.f28458id;
        }
        t3 t3Var = this.f22152c;
        t3Var.f22419h4.remove(rVar);
        t3Var.q4(aVar);
        t3Var.f22428p3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
        r rVar = this.f22150a;
        rVar.h = document;
        rVar.f22344a = 2;
        a aVar = this.f22151b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, rVar);
        if (Q3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) Q3).video_id = document.f28440id;
        }
        t3 t3Var = this.f22152c;
        t3Var.f22419h4.remove(rVar);
        t3Var.q4(aVar);
        t3Var.f22428p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f22150a.f22348f = f10;
        a aVar = this.f22151b;
        t3 t3Var = this.f22152c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
        t3Var.f22428p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void f(TLRPC.Document document) {
    }
}

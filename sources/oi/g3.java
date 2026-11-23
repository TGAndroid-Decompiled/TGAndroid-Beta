package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements x4 {
    public final s f22216a;
    public final a f22217b;
    public final t3 f22218c;

    public g3(a aVar, s sVar, t3 t3Var) {
        this.f22218c = t3Var;
        this.f22216a = sVar;
        this.f22217b = aVar;
    }

    @Override
    public final void a() {
        s sVar = this.f22216a;
        sVar.f22421a = 3;
        t3 t3Var = this.f22218c;
        t3Var.f22486h4.remove(sVar);
        t3Var.t4(this.f22217b, sVar);
        t3Var.f22495p3.onContentChanged();
    }

    @Override
    public final void b(int i7, int i10) {
        if (i7 > 0 && i10 > 0) {
            s sVar = this.f22216a;
            sVar.f22428j = i7;
            sVar.f22429k = i10;
        }
        View C1 = this.f22218c.C1(this.f22217b);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override
    public final void c(TLRPC.Photo photo) {
        int i7;
        int i10;
        s sVar = this.f22216a;
        sVar.f22426g = photo;
        sVar.f22421a = 2;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        if (w10 != null && (i7 = w10.f28517w) > 0 && (i10 = w10.h) > 0) {
            sVar.f22428j = i7;
            sVar.f22429k = i10;
        }
        a aVar = this.f22217b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, sVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.f28516id;
        }
        t3 t3Var = this.f22218c;
        t3Var.f22486h4.remove(sVar);
        t3Var.q4(aVar);
        t3Var.f22495p3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
        s sVar = this.f22216a;
        sVar.h = document;
        sVar.f22421a = 2;
        a aVar = this.f22217b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, sVar);
        if (Q3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) Q3).video_id = document.f28498id;
        }
        t3 t3Var = this.f22218c;
        t3Var.f22486h4.remove(sVar);
        t3Var.q4(aVar);
        t3Var.f22495p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f22216a.f22425f = f10;
        a aVar = this.f22217b;
        t3 t3Var = this.f22218c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
        t3Var.f22495p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void f(TLRPC.Document document) {
    }
}

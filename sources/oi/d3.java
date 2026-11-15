package oi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class d3 implements v4 {
    public final r f21638a;
    public final a f21639b;
    public final q3 f21640c;

    public d3(a aVar, r rVar, q3 q3Var) {
        this.f21640c = q3Var;
        this.f21638a = rVar;
        this.f21639b = aVar;
    }

    @Override
    public final void a() {
        r rVar = this.f21638a;
        rVar.f21957a = 3;
        q3 q3Var = this.f21640c;
        q3Var.f21922h4.remove(rVar);
        q3Var.t4(this.f21639b, rVar);
        q3Var.f21931p3.onContentChanged();
    }

    @Override
    public final void b(int i7, int i10) {
        if (i7 > 0 && i10 > 0) {
            r rVar = this.f21638a;
            rVar.f21964j = i7;
            rVar.f21965k = i10;
        }
        View C1 = this.f21640c.C1(this.f21639b);
        if (C1 instanceof p4) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override
    public final void c(TLRPC.Photo photo) {
        int i7;
        int i10;
        r rVar = this.f21638a;
        rVar.f21962g = photo;
        rVar.f21957a = 2;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        if (w10 != null && (i7 = w10.f28076w) > 0 && (i10 = w10.h) > 0) {
            rVar.f21964j = i7;
            rVar.f21965k = i10;
        }
        a aVar = this.f21639b;
        TL_iv.PageBlock Q3 = q3.Q3(aVar, rVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.f28075id;
        }
        q3 q3Var = this.f21640c;
        q3Var.f21922h4.remove(rVar);
        q3Var.q4(aVar);
        q3Var.f21931p3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
        r rVar = this.f21638a;
        rVar.h = document;
        rVar.f21957a = 2;
        a aVar = this.f21639b;
        TL_iv.PageBlock Q3 = q3.Q3(aVar, rVar);
        if (Q3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) Q3).video_id = document.f28057id;
        }
        q3 q3Var = this.f21640c;
        q3Var.f21922h4.remove(rVar);
        q3Var.q4(aVar);
        q3Var.f21931p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f21638a.f21961f = f10;
        a aVar = this.f21639b;
        q3 q3Var = this.f21640c;
        View C1 = q3Var.C1(aVar);
        if (C1 instanceof p4) {
            C1.requestLayout();
            C1.invalidate();
        }
        q3Var.f21931p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void f(TLRPC.Document document) {
    }
}

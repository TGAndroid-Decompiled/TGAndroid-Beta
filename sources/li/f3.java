package li;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements x4 {
    public final s f18564a;
    public final a f18565b;
    public final t3 f18566c;

    public f3(a aVar, s sVar, t3 t3Var) {
        this.f18566c = t3Var;
        this.f18564a = sVar;
        this.f18565b = aVar;
    }

    @Override
    public final void a() {
        s sVar = this.f18564a;
        sVar.f18814a = 3;
        t3 t3Var = this.f18566c;
        t3Var.f18880g4.remove(sVar);
        t3Var.t4(this.f18565b, sVar);
        t3Var.f18890o3.onContentChanged();
    }

    @Override
    public final void b(int i7, int i10) {
        if (i7 > 0 && i10 > 0) {
            s sVar = this.f18564a;
            sVar.f18821j = i7;
            sVar.f18822k = i10;
        }
        View C1 = this.f18566c.C1(this.f18565b);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override
    public final void c(TLRPC.Photo photo) {
        int i7;
        int i10;
        s sVar = this.f18564a;
        sVar.f18819g = photo;
        sVar.f18814a = 2;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        if (w10 != null && (i7 = w10.f26981w) > 0 && (i10 = w10.h) > 0) {
            sVar.f18821j = i7;
            sVar.f18822k = i10;
        }
        a aVar = this.f18565b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, sVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.f26980id;
        }
        t3 t3Var = this.f18566c;
        t3Var.f18880g4.remove(sVar);
        t3Var.q4(aVar);
        t3Var.f18890o3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
        s sVar = this.f18564a;
        sVar.h = document;
        sVar.f18814a = 2;
        a aVar = this.f18565b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, sVar);
        if (Q3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) Q3).video_id = document.f26962id;
        }
        t3 t3Var = this.f18566c;
        t3Var.f18880g4.remove(sVar);
        t3Var.q4(aVar);
        t3Var.f18890o3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f18564a.f18818f = f10;
        a aVar = this.f18565b;
        t3 t3Var = this.f18566c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
        t3Var.f18890o3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void f(TLRPC.Document document) {
    }
}

package li;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements x4 {
    public final s f18561a;
    public final a f18562b;
    public final t3 f18563c;

    public f3(a aVar, s sVar, t3 t3Var) {
        this.f18563c = t3Var;
        this.f18561a = sVar;
        this.f18562b = aVar;
    }

    @Override
    public final void a() {
        s sVar = this.f18561a;
        sVar.f18811a = 3;
        t3 t3Var = this.f18563c;
        t3Var.f18877g4.remove(sVar);
        t3Var.t4(this.f18562b, sVar);
        t3Var.f18887o3.onContentChanged();
    }

    @Override
    public final void b(int i7, int i10) {
        if (i7 > 0 && i10 > 0) {
            s sVar = this.f18561a;
            sVar.f18818j = i7;
            sVar.f18819k = i10;
        }
        View C1 = this.f18563c.C1(this.f18562b);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override
    public final void c(TLRPC.Photo photo) {
        int i7;
        int i10;
        s sVar = this.f18561a;
        sVar.f18816g = photo;
        sVar.f18811a = 2;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        if (w10 != null && (i7 = w10.f26978w) > 0 && (i10 = w10.h) > 0) {
            sVar.f18818j = i7;
            sVar.f18819k = i10;
        }
        a aVar = this.f18562b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, sVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.f26977id;
        }
        t3 t3Var = this.f18563c;
        t3Var.f18877g4.remove(sVar);
        t3Var.q4(aVar);
        t3Var.f18887o3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
        s sVar = this.f18561a;
        sVar.h = document;
        sVar.f18811a = 2;
        a aVar = this.f18562b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, sVar);
        if (Q3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) Q3).video_id = document.f26959id;
        }
        t3 t3Var = this.f18563c;
        t3Var.f18877g4.remove(sVar);
        t3Var.q4(aVar);
        t3Var.f18887o3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f18561a.f18815f = f10;
        a aVar = this.f18562b;
        t3 t3Var = this.f18563c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
        t3Var.f18887o3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void f(TLRPC.Document document) {
    }
}

package li;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements x4 {
    public final s f18567a;
    public final a f18568b;
    public final t3 f18569c;

    public f3(a aVar, s sVar, t3 t3Var) {
        this.f18569c = t3Var;
        this.f18567a = sVar;
        this.f18568b = aVar;
    }

    @Override
    public final void a() {
        s sVar = this.f18567a;
        sVar.f18817a = 3;
        t3 t3Var = this.f18569c;
        t3Var.f18883g4.remove(sVar);
        t3Var.t4(this.f18568b, sVar);
        t3Var.f18893o3.onContentChanged();
    }

    @Override
    public final void b(int i7, int i10) {
        if (i7 > 0 && i10 > 0) {
            s sVar = this.f18567a;
            sVar.f18824j = i7;
            sVar.f18825k = i10;
        }
        View C1 = this.f18569c.C1(this.f18568b);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override
    public final void c(TLRPC.Photo photo) {
        int i7;
        int i10;
        s sVar = this.f18567a;
        sVar.f18822g = photo;
        sVar.f18817a = 2;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        if (w10 != null && (i7 = w10.f26985w) > 0 && (i10 = w10.h) > 0) {
            sVar.f18824j = i7;
            sVar.f18825k = i10;
        }
        a aVar = this.f18568b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, sVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.f26984id;
        }
        t3 t3Var = this.f18569c;
        t3Var.f18883g4.remove(sVar);
        t3Var.q4(aVar);
        t3Var.f18893o3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
        s sVar = this.f18567a;
        sVar.h = document;
        sVar.f18817a = 2;
        a aVar = this.f18568b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, sVar);
        if (Q3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) Q3).video_id = document.f26966id;
        }
        t3 t3Var = this.f18569c;
        t3Var.f18883g4.remove(sVar);
        t3Var.q4(aVar);
        t3Var.f18893o3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f18567a.f18821f = f10;
        a aVar = this.f18568b;
        t3 t3Var = this.f18569c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof s4) {
            C1.requestLayout();
            C1.invalidate();
        }
        t3Var.f18893o3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void f(TLRPC.Document document) {
    }
}

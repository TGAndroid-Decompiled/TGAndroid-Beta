package mi;

import android.view.View;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements y4 {
    public final s f19628a;
    public final a f19629b;
    public final t3 f19630c;

    public g3(a aVar, s sVar, t3 t3Var) {
        this.f19630c = t3Var;
        this.f19628a = sVar;
        this.f19629b = aVar;
    }

    @Override
    public final void a() {
        s sVar = this.f19628a;
        sVar.f19859a = 3;
        t3 t3Var = this.f19630c;
        t3Var.f19907h4.remove(sVar);
        t3Var.t4(this.f19629b, sVar);
        t3Var.f19916p3.onContentChanged();
    }

    @Override
    public final void b(int i3, int i10) {
        if (i3 > 0 && i10 > 0) {
            s sVar = this.f19628a;
            sVar.f19866j = i3;
            sVar.f19867k = i10;
        }
        View C1 = this.f19630c.C1(this.f19629b);
        if (C1 instanceof t4) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override
    public final void c(TLRPC.Photo photo) {
        int i3;
        int i10;
        s sVar = this.f19628a;
        sVar.f19864g = photo;
        sVar.f19859a = 2;
        TLRPC.PhotoSize w10 = w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
        if (w10 != null && (i3 = w10.f27026w) > 0 && (i10 = w10.h) > 0) {
            sVar.f19866j = i3;
            sVar.f19867k = i10;
        }
        a aVar = this.f19629b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, sVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.f27025id;
        }
        t3 t3Var = this.f19630c;
        t3Var.f19907h4.remove(sVar);
        t3Var.q4(aVar);
        t3Var.f19916p3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
        s sVar = this.f19628a;
        sVar.h = document;
        sVar.f19859a = 2;
        a aVar = this.f19629b;
        TL_iv.PageBlock Q3 = t3.Q3(aVar, sVar);
        if (Q3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) Q3).video_id = document.f27007id;
        }
        t3 t3Var = this.f19630c;
        t3Var.f19907h4.remove(sVar);
        t3Var.q4(aVar);
        t3Var.f19916p3.onContentChanged();
    }

    @Override
    public final void g(float f10) {
        this.f19628a.f19863f = f10;
        a aVar = this.f19629b;
        t3 t3Var = this.f19630c;
        View C1 = t3Var.C1(aVar);
        if (C1 instanceof t4) {
            C1.requestLayout();
            C1.invalidate();
        }
        t3Var.f19916p3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void f(TLRPC.Document document) {
    }
}

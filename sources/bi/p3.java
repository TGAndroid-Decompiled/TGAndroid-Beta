package bi;

import android.view.View;
import org.telegram.messenger.b8;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class p3 implements k5 {
    public final w f3280a;
    public final a f3281b;
    public final d4 f3282c;

    public p3(a aVar, w wVar, d4 d4Var) {
        this.f3282c = d4Var;
        this.f3280a = wVar;
        this.f3281b = aVar;
    }

    @Override
    public final void a() {
        w wVar = this.f3280a;
        wVar.f3416a = 3;
        d4 d4Var = this.f3282c;
        d4Var.f2929g4.remove(wVar);
        d4Var.t4(this.f3281b, wVar);
        d4Var.f2938o3.onContentChanged();
    }

    @Override
    public final void b(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            w wVar = this.f3280a;
            wVar.f3422j = i10;
            wVar.f3423k = i11;
        }
        View C1 = this.f3282c.C1(this.f3281b);
        if (C1 instanceof f5) {
            C1.requestLayout();
            C1.invalidate();
        }
    }

    @Override
    public final void c(TLRPC.Photo photo) {
        int i10;
        int i11;
        w wVar = this.f3280a;
        wVar.f3420g = photo;
        wVar.f3416a = 2;
        TLRPC.PhotoSize w9 = b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
        if (w9 != null && (i10 = w9.f19819w) > 0 && (i11 = w9.h) > 0) {
            wVar.f3422j = i10;
            wVar.f3423k = i11;
        }
        a aVar = this.f3281b;
        TL_iv.PageBlock Q3 = d4.Q3(aVar, wVar);
        if (Q3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) Q3).photo_id = photo.f19818id;
        }
        d4 d4Var = this.f3282c;
        d4Var.f2929g4.remove(wVar);
        d4Var.q4(aVar);
        d4Var.f2938o3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
        w wVar = this.f3280a;
        wVar.h = document;
        wVar.f3416a = 2;
        a aVar = this.f3281b;
        TL_iv.PageBlock Q3 = d4.Q3(aVar, wVar);
        if (Q3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) Q3).video_id = document.f19800id;
        }
        d4 d4Var = this.f3282c;
        d4Var.f2929g4.remove(wVar);
        d4Var.q4(aVar);
        d4Var.f2938o3.onContentChanged();
    }

    @Override
    public final void g(float f7) {
        this.f3280a.f3419f = f7;
        a aVar = this.f3281b;
        d4 d4Var = this.f3282c;
        View C1 = d4Var.C1(aVar);
        if (C1 instanceof f5) {
            C1.requestLayout();
            C1.invalidate();
        }
        d4Var.f2938o3.onContentChanged();
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void f(TLRPC.Document document) {
    }
}

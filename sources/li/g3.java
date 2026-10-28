package li;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements z4 {
    public final t f17258a;
    public final a f17259b;
    public final v3 f17260c;

    public g3(a aVar, t tVar, v3 v3Var) {
        this.f17260c = v3Var;
        this.f17258a = tVar;
        this.f17259b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        t tVar = this.f17258a;
        tVar.h = document;
        tVar.f17481i = document;
        tVar.f17476a = 2;
        TL_iv.PageBlock pageBlock = this.f17259b.f17053b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f22034id;
        }
        v3 v3Var = this.f17260c;
        v3Var.f17547h4.remove(tVar);
        v3Var.f32504g3.O(false);
        v3Var.f17556p3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f17258a.f17479f = f7;
        a aVar = this.f17259b;
        v3 v3Var = this.f17260c;
        View F1 = v3Var.F1(aVar);
        if (F1 instanceof y) {
            ((y) F1).l(false);
            F1.invalidate();
        }
        v3Var.f17556p3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f17258a;
        tVar.f17476a = 3;
        v3 v3Var = this.f17260c;
        v3Var.f17547h4.remove(tVar);
        int indexOf = v3Var.f17564t3.indexOf(this.f17259b);
        if (indexOf >= 0) {
            v3Var.f17564t3.remove(indexOf);
            v3Var.f32504g3.O(true);
        }
        v3Var.f17556p3.onContentChanged();
    }

    @Override
    public final void b(TLRPC.Photo photo) {
    }

    @Override
    public final void c(TLRPC.Document document) {
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void a(int i10, int i11) {
    }
}

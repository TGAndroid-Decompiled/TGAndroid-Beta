package li;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class g3 implements z4 {
    public final t f17259a;
    public final a f17260b;
    public final v3 f17261c;

    public g3(a aVar, t tVar, v3 v3Var) {
        this.f17261c = v3Var;
        this.f17259a = tVar;
        this.f17260b = aVar;
    }

    @Override
    public final void e(TLRPC.Document document) {
        t tVar = this.f17259a;
        tVar.h = document;
        tVar.f17482i = document;
        tVar.f17477a = 2;
        TL_iv.PageBlock pageBlock = this.f17260b.f17054b;
        if (pageBlock instanceof TL_iv.pageBlockAudio) {
            ((TL_iv.pageBlockAudio) pageBlock).audio_id = document.f22033id;
        }
        v3 v3Var = this.f17261c;
        v3Var.f17548h4.remove(tVar);
        v3Var.f32152g3.O(false);
        v3Var.f17557p3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f17259a.f17480f = f7;
        a aVar = this.f17260b;
        v3 v3Var = this.f17261c;
        View F1 = v3Var.F1(aVar);
        if (F1 instanceof y) {
            ((y) F1).l(false);
            F1.invalidate();
        }
        v3Var.f17557p3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f17259a;
        tVar.f17477a = 3;
        v3 v3Var = this.f17261c;
        v3Var.f17548h4.remove(tVar);
        int indexOf = v3Var.f17565t3.indexOf(this.f17260b);
        if (indexOf >= 0) {
            v3Var.f17565t3.remove(indexOf);
            v3Var.f32152g3.O(true);
        }
        v3Var.f17557p3.onContentChanged();
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

package li;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements z4 {
    public final t f17231a;
    public final a f17232b;
    public final String f17233c;
    public final v3 d;

    public f3(v3 v3Var, t tVar, a aVar, String str) {
        this.d = v3Var;
        this.f17231a = tVar;
        this.f17232b = aVar;
        this.f17233c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f17233c;
        document.localPath = str;
        v3 v3Var = this.d;
        FileLoader.getInstance(v3Var.f17553n3).setLocalPathTo(document, str);
        t tVar = this.f17231a;
        tVar.h = document;
        tVar.f17477a = 2;
        TL_iv.PageBlock pageBlock = this.f17232b.f17054b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f22033id;
        }
        v3Var.f17548h4.remove(tVar);
        v3Var.f32152g3.O(false);
        v3Var.f17557p3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f17231a.f17480f = f7;
        a aVar = this.f17232b;
        v3 v3Var = this.d;
        View F1 = v3Var.F1(aVar);
        if (F1 instanceof y0) {
            y0 y0Var = (y0) F1;
            y0Var.g(y0Var.h());
            y0Var.j();
            y0Var.k(false);
            y0Var.requestLayout();
            y0Var.invalidate();
        }
        v3Var.f17557p3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f17231a;
        tVar.f17477a = 3;
        v3 v3Var = this.d;
        v3Var.f17548h4.remove(tVar);
        v3Var.f17565t3.remove(this.f17232b);
        v3Var.f32152g3.O(true);
        v3Var.f17557p3.onContentChanged();
    }

    @Override
    public final void b(TLRPC.Photo photo) {
    }

    @Override
    public final void c(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }

    @Override
    public final void a(int i10, int i11) {
    }
}

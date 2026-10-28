package li;

import android.view.View;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class f3 implements z4 {
    public final t f17230a;
    public final a f17231b;
    public final String f17232c;
    public final v3 d;

    public f3(v3 v3Var, t tVar, a aVar, String str) {
        this.d = v3Var;
        this.f17230a = tVar;
        this.f17231b = aVar;
        this.f17232c = str;
    }

    @Override
    public final void d(TLRPC.Document document) {
        String str = this.f17232c;
        document.localPath = str;
        v3 v3Var = this.d;
        FileLoader.getInstance(v3Var.f17552n3).setLocalPathTo(document, str);
        t tVar = this.f17230a;
        tVar.h = document;
        tVar.f17476a = 2;
        TL_iv.PageBlock pageBlock = this.f17231b.f17053b;
        if (pageBlock instanceof TL_iv.pageBlockDocument) {
            ((TL_iv.pageBlockDocument) pageBlock).document_id = document.f22034id;
        }
        v3Var.f17547h4.remove(tVar);
        v3Var.f32504g3.O(false);
        v3Var.f17556p3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f17230a.f17479f = f7;
        a aVar = this.f17231b;
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
        v3Var.f17556p3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f17230a;
        tVar.f17476a = 3;
        v3 v3Var = this.d;
        v3Var.f17547h4.remove(tVar);
        v3Var.f17564t3.remove(this.f17231b);
        v3Var.f32504g3.O(true);
        v3Var.f17556p3.onContentChanged();
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

package li;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class i3 implements z4 {
    public final t f17297a;
    public final a f17298b;
    public final v3 f17299c;

    public i3(a aVar, t tVar, v3 v3Var) {
        this.f17299c = v3Var;
        this.f17297a = tVar;
        this.f17298b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            t tVar = this.f17297a;
            tVar.f17483j = i10;
            tVar.f17484k = i11;
        }
        View F1 = this.f17299c.F1(this.f17298b);
        if (F1 instanceof u4) {
            F1.requestLayout();
            F1.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        t tVar = this.f17297a;
        tVar.f17481g = photo;
        tVar.f17477a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f22052w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            tVar.f17483j = i10;
            tVar.f17484k = i11;
        }
        a aVar = this.f17298b;
        TL_iv.PageBlock T3 = v3.T3(aVar, tVar);
        if (T3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) T3).photo_id = photo.f22051id;
        }
        v3 v3Var = this.f17299c;
        v3Var.f17548h4.remove(tVar);
        v3Var.t4(aVar);
        v3Var.f17557p3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        t tVar = this.f17297a;
        tVar.h = document;
        tVar.f17477a = 2;
        a aVar = this.f17298b;
        TL_iv.PageBlock T3 = v3.T3(aVar, tVar);
        if (T3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) T3).video_id = document.f22033id;
        }
        v3 v3Var = this.f17299c;
        v3Var.f17548h4.remove(tVar);
        v3Var.t4(aVar);
        v3Var.f17557p3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f17297a.f17480f = f7;
        a aVar = this.f17298b;
        v3 v3Var = this.f17299c;
        View F1 = v3Var.F1(aVar);
        if (F1 instanceof u4) {
            F1.requestLayout();
            F1.invalidate();
        }
        v3Var.f17557p3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f17297a;
        tVar.f17477a = 3;
        v3 v3Var = this.f17299c;
        v3Var.f17548h4.remove(tVar);
        v3Var.w4(this.f17298b, tVar);
        v3Var.f17557p3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

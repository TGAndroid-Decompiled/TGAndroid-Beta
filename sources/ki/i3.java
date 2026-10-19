package ki;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class i3 implements z4 {
    public final t f15332a;
    public final a f15333b;
    public final w3 f15334c;

    public i3(a aVar, t tVar, w3 w3Var) {
        this.f15334c = w3Var;
        this.f15332a = tVar;
        this.f15333b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            t tVar = this.f15332a;
            tVar.f15514j = i10;
            tVar.f15515k = i11;
        }
        View A1 = this.f15334c.A1(this.f15333b);
        if (A1 instanceof u4) {
            A1.requestLayout();
            A1.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        t tVar = this.f15332a;
        tVar.f15512g = photo;
        tVar.f15508a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f20298w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            tVar.f15514j = i10;
            tVar.f15515k = i11;
        }
        a aVar = this.f15333b;
        TL_iv.PageBlock O3 = w3.O3(aVar, tVar);
        if (O3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) O3).photo_id = photo.f20297id;
        }
        w3 w3Var = this.f15334c;
        w3Var.X3.remove(tVar);
        w3Var.o4(aVar);
        w3Var.f15592f3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        t tVar = this.f15332a;
        tVar.h = document;
        tVar.f15508a = 2;
        a aVar = this.f15333b;
        TL_iv.PageBlock O3 = w3.O3(aVar, tVar);
        if (O3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) O3).video_id = document.f20279id;
        }
        w3 w3Var = this.f15334c;
        w3Var.X3.remove(tVar);
        w3Var.o4(aVar);
        w3Var.f15592f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f15332a.f15511f = f7;
        a aVar = this.f15333b;
        w3 w3Var = this.f15334c;
        View A1 = w3Var.A1(aVar);
        if (A1 instanceof u4) {
            A1.requestLayout();
            A1.invalidate();
        }
        w3Var.f15592f3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f15332a;
        tVar.f15508a = 3;
        w3 w3Var = this.f15334c;
        w3Var.X3.remove(tVar);
        w3Var.r4(this.f15333b, tVar);
        w3Var.f15592f3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

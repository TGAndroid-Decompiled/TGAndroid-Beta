package ji;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class j3 implements d5 {
    public final u f13351a;
    public final a f13352b;
    public final x3 f13353c;

    public j3(a aVar, u uVar, x3 x3Var) {
        this.f13353c = x3Var;
        this.f13351a = uVar;
        this.f13352b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.f13351a;
            uVar.f13541j = i10;
            uVar.f13542k = i11;
        }
        View A1 = this.f13353c.A1(this.f13352b);
        if (A1 instanceof y4) {
            A1.requestLayout();
            A1.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        u uVar = this.f13351a;
        uVar.f13539g = photo;
        uVar.f13535a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f19241w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            uVar.f13541j = i10;
            uVar.f13542k = i11;
        }
        a aVar = this.f13352b;
        TL_iv.PageBlock O3 = x3.O3(aVar, uVar);
        if (O3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) O3).photo_id = photo.f19240id;
        }
        x3 x3Var = this.f13353c;
        x3Var.X3.remove(uVar);
        x3Var.o4(aVar);
        x3Var.f13627f3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        u uVar = this.f13351a;
        uVar.h = document;
        uVar.f13535a = 2;
        a aVar = this.f13352b;
        TL_iv.PageBlock O3 = x3.O3(aVar, uVar);
        if (O3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) O3).video_id = document.f19222id;
        }
        x3 x3Var = this.f13353c;
        x3Var.X3.remove(uVar);
        x3Var.o4(aVar);
        x3Var.f13627f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f13351a.f13538f = f7;
        a aVar = this.f13352b;
        x3 x3Var = this.f13353c;
        View A1 = x3Var.A1(aVar);
        if (A1 instanceof y4) {
            A1.requestLayout();
            A1.invalidate();
        }
        x3Var.f13627f3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f13351a;
        uVar.f13535a = 3;
        x3 x3Var = this.f13353c;
        x3Var.X3.remove(uVar);
        x3Var.r4(this.f13352b, uVar);
        x3Var.f13627f3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

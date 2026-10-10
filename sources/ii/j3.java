package ii;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class j3 implements b5 {
    public final u f12509a;
    public final a f12510b;
    public final x3 f12511c;

    public j3(a aVar, u uVar, x3 x3Var) {
        this.f12511c = x3Var;
        this.f12509a = uVar;
        this.f12510b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.f12509a;
            uVar.f12717j = i10;
            uVar.f12718k = i11;
        }
        View A1 = this.f12511c.A1(this.f12510b);
        if (A1 instanceof w4) {
            A1.requestLayout();
            A1.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        u uVar = this.f12509a;
        uVar.f12715g = photo;
        uVar.f12710a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f20067w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            uVar.f12717j = i10;
            uVar.f12718k = i11;
        }
        a aVar = this.f12510b;
        TL_iv.PageBlock O3 = x3.O3(aVar, uVar);
        if (O3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) O3).photo_id = photo.f20066id;
        }
        x3 x3Var = this.f12511c;
        x3Var.X3.remove(uVar);
        x3Var.o4(aVar);
        x3Var.f12809f3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        u uVar = this.f12509a;
        uVar.h = document;
        uVar.f12710a = 2;
        a aVar = this.f12510b;
        TL_iv.PageBlock O3 = x3.O3(aVar, uVar);
        if (O3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) O3).video_id = document.f20048id;
        }
        x3 x3Var = this.f12511c;
        x3Var.X3.remove(uVar);
        x3Var.o4(aVar);
        x3Var.f12809f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f12509a.f12714f = f7;
        a aVar = this.f12510b;
        x3 x3Var = this.f12511c;
        View A1 = x3Var.A1(aVar);
        if (A1 instanceof w4) {
            A1.requestLayout();
            A1.invalidate();
        }
        x3Var.f12809f3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f12509a;
        uVar.f12710a = 3;
        x3 x3Var = this.f12511c;
        x3Var.X3.remove(uVar);
        x3Var.r4(this.f12510b, uVar);
        x3Var.f12809f3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

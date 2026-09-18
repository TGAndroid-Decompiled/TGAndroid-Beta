package ii;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class i3 implements z4 {
    public final u f11444a;
    public final a f11445b;
    public final w3 f11446c;

    public i3(a aVar, u uVar, w3 w3Var) {
        this.f11446c = w3Var;
        this.f11444a = uVar;
        this.f11445b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.f11444a;
            uVar.f11644j = i10;
            uVar.f11645k = i11;
        }
        View A1 = this.f11446c.A1(this.f11445b);
        if (A1 instanceof u4) {
            A1.requestLayout();
            A1.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        u uVar = this.f11444a;
        uVar.f11642g = photo;
        uVar.f11638a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f18321w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            uVar.f11644j = i10;
            uVar.f11645k = i11;
        }
        a aVar = this.f11445b;
        TL_iv.PageBlock O3 = w3.O3(aVar, uVar);
        if (O3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) O3).photo_id = photo.f18320id;
        }
        w3 w3Var = this.f11446c;
        w3Var.Z3.remove(uVar);
        w3Var.o4(aVar);
        w3Var.f11714h3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        u uVar = this.f11444a;
        uVar.h = document;
        uVar.f11638a = 2;
        a aVar = this.f11445b;
        TL_iv.PageBlock O3 = w3.O3(aVar, uVar);
        if (O3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) O3).video_id = document.f18302id;
        }
        w3 w3Var = this.f11446c;
        w3Var.Z3.remove(uVar);
        w3Var.o4(aVar);
        w3Var.f11714h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11444a.f11641f = f7;
        a aVar = this.f11445b;
        w3 w3Var = this.f11446c;
        View A1 = w3Var.A1(aVar);
        if (A1 instanceof u4) {
            A1.requestLayout();
            A1.invalidate();
        }
        w3Var.f11714h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11444a;
        uVar.f11638a = 3;
        w3 w3Var = this.f11446c;
        w3Var.Z3.remove(uVar);
        w3Var.r4(this.f11445b, uVar);
        w3Var.f11714h3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

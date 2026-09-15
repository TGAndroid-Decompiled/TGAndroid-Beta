package ii;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class i3 implements z4 {
    public final u f11441a;
    public final a f11442b;
    public final w3 f11443c;

    public i3(a aVar, u uVar, w3 w3Var) {
        this.f11443c = w3Var;
        this.f11441a = uVar;
        this.f11442b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.f11441a;
            uVar.f11641j = i10;
            uVar.f11642k = i11;
        }
        View z12 = this.f11443c.z1(this.f11442b);
        if (z12 instanceof u4) {
            z12.requestLayout();
            z12.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        u uVar = this.f11441a;
        uVar.f11639g = photo;
        uVar.f11635a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f18137w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            uVar.f11641j = i10;
            uVar.f11642k = i11;
        }
        a aVar = this.f11442b;
        TL_iv.PageBlock N3 = w3.N3(aVar, uVar);
        if (N3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) N3).photo_id = photo.f18136id;
        }
        w3 w3Var = this.f11443c;
        w3Var.Z3.remove(uVar);
        w3Var.n4(aVar);
        w3Var.f11711h3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        u uVar = this.f11441a;
        uVar.h = document;
        uVar.f11635a = 2;
        a aVar = this.f11442b;
        TL_iv.PageBlock N3 = w3.N3(aVar, uVar);
        if (N3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) N3).video_id = document.f18118id;
        }
        w3 w3Var = this.f11443c;
        w3Var.Z3.remove(uVar);
        w3Var.n4(aVar);
        w3Var.f11711h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11441a.f11638f = f7;
        a aVar = this.f11442b;
        w3 w3Var = this.f11443c;
        View z12 = w3Var.z1(aVar);
        if (z12 instanceof u4) {
            z12.requestLayout();
            z12.invalidate();
        }
        w3Var.f11711h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11441a;
        uVar.f11635a = 3;
        w3 w3Var = this.f11443c;
        w3Var.Z3.remove(uVar);
        w3Var.q4(this.f11442b, uVar);
        w3Var.f11711h3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

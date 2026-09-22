package ii;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class i3 implements z4 {
    public final u f11443a;
    public final a f11444b;
    public final w3 f11445c;

    public i3(a aVar, u uVar, w3 w3Var) {
        this.f11445c = w3Var;
        this.f11443a = uVar;
        this.f11444b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.f11443a;
            uVar.f11643j = i10;
            uVar.f11644k = i11;
        }
        View z12 = this.f11445c.z1(this.f11444b);
        if (z12 instanceof u4) {
            z12.requestLayout();
            z12.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        u uVar = this.f11443a;
        uVar.f11641g = photo;
        uVar.f11637a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f18134w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            uVar.f11643j = i10;
            uVar.f11644k = i11;
        }
        a aVar = this.f11444b;
        TL_iv.PageBlock N3 = w3.N3(aVar, uVar);
        if (N3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) N3).photo_id = photo.f18133id;
        }
        w3 w3Var = this.f11445c;
        w3Var.Z3.remove(uVar);
        w3Var.n4(aVar);
        w3Var.f11713h3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        u uVar = this.f11443a;
        uVar.h = document;
        uVar.f11637a = 2;
        a aVar = this.f11444b;
        TL_iv.PageBlock N3 = w3.N3(aVar, uVar);
        if (N3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) N3).video_id = document.f18115id;
        }
        w3 w3Var = this.f11445c;
        w3Var.Z3.remove(uVar);
        w3Var.n4(aVar);
        w3Var.f11713h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11443a.f11640f = f7;
        a aVar = this.f11444b;
        w3 w3Var = this.f11445c;
        View z12 = w3Var.z1(aVar);
        if (z12 instanceof u4) {
            z12.requestLayout();
            z12.invalidate();
        }
        w3Var.f11713h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11443a;
        uVar.f11637a = 3;
        w3 w3Var = this.f11445c;
        w3Var.Z3.remove(uVar);
        w3Var.q4(this.f11444b, uVar);
        w3Var.f11713h3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

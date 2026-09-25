package ii;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class j3 implements a5 {
    public final u f11453a;
    public final a f11454b;
    public final x3 f11455c;

    public j3(a aVar, u uVar, x3 x3Var) {
        this.f11455c = x3Var;
        this.f11453a = uVar;
        this.f11454b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.f11453a;
            uVar.f11639j = i10;
            uVar.f11640k = i11;
        }
        View z12 = this.f11455c.z1(this.f11454b);
        if (z12 instanceof v4) {
            z12.requestLayout();
            z12.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        u uVar = this.f11453a;
        uVar.f11637g = photo;
        uVar.f11633a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f18361w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            uVar.f11639j = i10;
            uVar.f11640k = i11;
        }
        a aVar = this.f11454b;
        TL_iv.PageBlock N3 = x3.N3(aVar, uVar);
        if (N3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) N3).photo_id = photo.f18360id;
        }
        x3 x3Var = this.f11455c;
        x3Var.Z3.remove(uVar);
        x3Var.n4(aVar);
        x3Var.f11728h3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        u uVar = this.f11453a;
        uVar.h = document;
        uVar.f11633a = 2;
        a aVar = this.f11454b;
        TL_iv.PageBlock N3 = x3.N3(aVar, uVar);
        if (N3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) N3).video_id = document.f18342id;
        }
        x3 x3Var = this.f11455c;
        x3Var.Z3.remove(uVar);
        x3Var.n4(aVar);
        x3Var.f11728h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11453a.f11636f = f7;
        a aVar = this.f11454b;
        x3 x3Var = this.f11455c;
        View z12 = x3Var.z1(aVar);
        if (z12 instanceof v4) {
            z12.requestLayout();
            z12.invalidate();
        }
        x3Var.f11728h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11453a;
        uVar.f11633a = 3;
        x3 x3Var = this.f11455c;
        x3Var.Z3.remove(uVar);
        x3Var.q4(this.f11454b, uVar);
        x3Var.f11728h3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

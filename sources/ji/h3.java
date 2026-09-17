package ji;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h3 implements c5 {
    public final u f13986a;
    public final a f13987b;
    public final v3 f13988c;

    public h3(a aVar, u uVar, v3 v3Var) {
        this.f13988c = v3Var;
        this.f13986a = uVar;
        this.f13987b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.f13986a;
            uVar.f14228j = i10;
            uVar.f14229k = i11;
        }
        View y12 = this.f13988c.y1(this.f13987b);
        if (y12 instanceof w4) {
            y12.requestLayout();
            y12.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        u uVar = this.f13986a;
        uVar.f14226g = photo;
        uVar.f14221a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f19921w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            uVar.f14228j = i10;
            uVar.f14229k = i11;
        }
        a aVar = this.f13987b;
        TL_iv.PageBlock M3 = v3.M3(aVar, uVar);
        if (M3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) M3).photo_id = photo.f19920id;
        }
        v3 v3Var = this.f13988c;
        v3Var.Z3.remove(uVar);
        v3Var.m4(aVar);
        v3Var.f14275h3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        u uVar = this.f13986a;
        uVar.h = document;
        uVar.f14221a = 2;
        a aVar = this.f13987b;
        TL_iv.PageBlock M3 = v3.M3(aVar, uVar);
        if (M3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) M3).video_id = document.f19902id;
        }
        v3 v3Var = this.f13988c;
        v3Var.Z3.remove(uVar);
        v3Var.m4(aVar);
        v3Var.f14275h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f13986a.f14225f = f7;
        a aVar = this.f13987b;
        v3 v3Var = this.f13988c;
        View y12 = v3Var.y1(aVar);
        if (y12 instanceof w4) {
            y12.requestLayout();
            y12.invalidate();
        }
        v3Var.f14275h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f13986a;
        uVar.f14221a = 3;
        v3 v3Var = this.f13988c;
        v3Var.Z3.remove(uVar);
        v3Var.p4(this.f13987b, uVar);
        v3Var.f14275h3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

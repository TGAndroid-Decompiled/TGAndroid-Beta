package ji;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class h3 implements c5 {
    public final u f13960a;
    public final a f13961b;
    public final v3 f13962c;

    public h3(a aVar, u uVar, v3 v3Var) {
        this.f13962c = v3Var;
        this.f13960a = uVar;
        this.f13961b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.f13960a;
            uVar.f14202j = i10;
            uVar.f14203k = i11;
        }
        View y12 = this.f13962c.y1(this.f13961b);
        if (y12 instanceof w4) {
            y12.requestLayout();
            y12.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        u uVar = this.f13960a;
        uVar.f14200g = photo;
        uVar.f14195a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f19894w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            uVar.f14202j = i10;
            uVar.f14203k = i11;
        }
        a aVar = this.f13961b;
        TL_iv.PageBlock M3 = v3.M3(aVar, uVar);
        if (M3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) M3).photo_id = photo.f19893id;
        }
        v3 v3Var = this.f13962c;
        v3Var.Z3.remove(uVar);
        v3Var.m4(aVar);
        v3Var.f14249h3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        u uVar = this.f13960a;
        uVar.h = document;
        uVar.f14195a = 2;
        a aVar = this.f13961b;
        TL_iv.PageBlock M3 = v3.M3(aVar, uVar);
        if (M3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) M3).video_id = document.f19875id;
        }
        v3 v3Var = this.f13962c;
        v3Var.Z3.remove(uVar);
        v3Var.m4(aVar);
        v3Var.f14249h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f13960a.f14199f = f7;
        a aVar = this.f13961b;
        v3 v3Var = this.f13962c;
        View y12 = v3Var.y1(aVar);
        if (y12 instanceof w4) {
            y12.requestLayout();
            y12.invalidate();
        }
        v3Var.f14249h3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f13960a;
        uVar.f14195a = 3;
        v3 v3Var = this.f13962c;
        v3Var.Z3.remove(uVar);
        v3Var.p4(this.f13961b, uVar);
        v3Var.f14249h3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

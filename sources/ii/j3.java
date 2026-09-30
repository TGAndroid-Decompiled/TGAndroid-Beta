package ii;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class j3 implements a5 {
    public final u f11467a;
    public final a f11468b;
    public final x3 f11469c;

    public j3(a aVar, u uVar, x3 x3Var) {
        this.f11469c = x3Var;
        this.f11467a = uVar;
        this.f11468b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.f11467a;
            uVar.f11653j = i10;
            uVar.f11654k = i11;
        }
        View B1 = this.f11469c.B1(this.f11468b);
        if (B1 instanceof v4) {
            B1.requestLayout();
            B1.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        u uVar = this.f11467a;
        uVar.f11651g = photo;
        uVar.f11647a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f18377w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            uVar.f11653j = i10;
            uVar.f11654k = i11;
        }
        a aVar = this.f11468b;
        TL_iv.PageBlock P3 = x3.P3(aVar, uVar);
        if (P3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) P3).photo_id = photo.f18376id;
        }
        x3 x3Var = this.f11469c;
        x3Var.f11739g4.remove(uVar);
        x3Var.p4(aVar);
        x3Var.f11748o3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        u uVar = this.f11467a;
        uVar.h = document;
        uVar.f11647a = 2;
        a aVar = this.f11468b;
        TL_iv.PageBlock P3 = x3.P3(aVar, uVar);
        if (P3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) P3).video_id = document.f18358id;
        }
        x3 x3Var = this.f11469c;
        x3Var.f11739g4.remove(uVar);
        x3Var.p4(aVar);
        x3Var.f11748o3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f11467a.f11650f = f7;
        a aVar = this.f11468b;
        x3 x3Var = this.f11469c;
        View B1 = x3Var.B1(aVar);
        if (B1 instanceof v4) {
            B1.requestLayout();
            B1.invalidate();
        }
        x3Var.f11748o3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f11467a;
        uVar.f11647a = 3;
        x3 x3Var = this.f11469c;
        x3Var.f11739g4.remove(uVar);
        x3Var.s4(this.f11468b, uVar);
        x3Var.f11748o3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

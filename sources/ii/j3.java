package ii;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class j3 implements b5 {
    public final u f12464a;
    public final a f12465b;
    public final x3 f12466c;

    public j3(a aVar, u uVar, x3 x3Var) {
        this.f12466c = x3Var;
        this.f12464a = uVar;
        this.f12465b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.f12464a;
            uVar.f12670j = i10;
            uVar.f12671k = i11;
        }
        View B1 = this.f12466c.B1(this.f12465b);
        if (B1 instanceof w4) {
            B1.requestLayout();
            B1.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        u uVar = this.f12464a;
        uVar.f12668g = photo;
        uVar.f12663a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f20067w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            uVar.f12670j = i10;
            uVar.f12671k = i11;
        }
        a aVar = this.f12465b;
        TL_iv.PageBlock P3 = x3.P3(aVar, uVar);
        if (P3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) P3).photo_id = photo.f20066id;
        }
        x3 x3Var = this.f12466c;
        x3Var.f12761g4.remove(uVar);
        x3Var.p4(aVar);
        x3Var.f12770o3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        u uVar = this.f12464a;
        uVar.h = document;
        uVar.f12663a = 2;
        a aVar = this.f12465b;
        TL_iv.PageBlock P3 = x3.P3(aVar, uVar);
        if (P3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) P3).video_id = document.f20048id;
        }
        x3 x3Var = this.f12466c;
        x3Var.f12761g4.remove(uVar);
        x3Var.p4(aVar);
        x3Var.f12770o3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f12464a.f12667f = f7;
        a aVar = this.f12465b;
        x3 x3Var = this.f12466c;
        View B1 = x3Var.B1(aVar);
        if (B1 instanceof w4) {
            B1.requestLayout();
            B1.invalidate();
        }
        x3Var.f12770o3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f12464a;
        uVar.f12663a = 3;
        x3 x3Var = this.f12466c;
        x3Var.f12761g4.remove(uVar);
        x3Var.s4(this.f12465b, uVar);
        x3Var.f12770o3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

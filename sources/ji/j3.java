package ji;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class j3 implements d5 {
    public final u f13354a;
    public final a f13355b;
    public final x3 f13356c;

    public j3(a aVar, u uVar, x3 x3Var) {
        this.f13356c = x3Var;
        this.f13354a = uVar;
        this.f13355b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            u uVar = this.f13354a;
            uVar.f13544j = i10;
            uVar.f13545k = i11;
        }
        View A1 = this.f13356c.A1(this.f13355b);
        if (A1 instanceof y4) {
            A1.requestLayout();
            A1.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        u uVar = this.f13354a;
        uVar.f13542g = photo;
        uVar.f13538a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f18941w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            uVar.f13544j = i10;
            uVar.f13545k = i11;
        }
        a aVar = this.f13355b;
        TL_iv.PageBlock O3 = x3.O3(aVar, uVar);
        if (O3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) O3).photo_id = photo.f18940id;
        }
        x3 x3Var = this.f13356c;
        x3Var.X3.remove(uVar);
        x3Var.o4(aVar);
        x3Var.f13630f3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        u uVar = this.f13354a;
        uVar.h = document;
        uVar.f13538a = 2;
        a aVar = this.f13355b;
        TL_iv.PageBlock O3 = x3.O3(aVar, uVar);
        if (O3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) O3).video_id = document.f18922id;
        }
        x3 x3Var = this.f13356c;
        x3Var.X3.remove(uVar);
        x3Var.o4(aVar);
        x3Var.f13630f3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f13354a.f13541f = f7;
        a aVar = this.f13355b;
        x3 x3Var = this.f13356c;
        View A1 = x3Var.A1(aVar);
        if (A1 instanceof y4) {
            A1.requestLayout();
            A1.invalidate();
        }
        x3Var.f13630f3.onContentChanged();
    }

    @Override
    public final void onError() {
        u uVar = this.f13354a;
        uVar.f13538a = 3;
        x3 x3Var = this.f13356c;
        x3Var.X3.remove(uVar);
        x3Var.r4(this.f13355b, uVar);
        x3Var.f13630f3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

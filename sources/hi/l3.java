package hi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class l3 implements c5 {
    public final v f9724a;
    public final a f9725b;
    public final z3 f9726c;

    public l3(a aVar, v vVar, z3 z3Var) {
        this.f9726c = z3Var;
        this.f9724a = vVar;
        this.f9725b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            v vVar = this.f9724a;
            vVar.f9900j = i10;
            vVar.f9901k = i11;
        }
        View y12 = this.f9726c.y1(this.f9725b);
        if (y12 instanceof x4) {
            y12.requestLayout();
            y12.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        v vVar = this.f9724a;
        vVar.f9898g = photo;
        vVar.f9894a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f17220w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            vVar.f9900j = i10;
            vVar.f9901k = i11;
        }
        a aVar = this.f9725b;
        TL_iv.PageBlock M3 = z3.M3(aVar, vVar);
        if (M3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) M3).photo_id = photo.f17219id;
        }
        z3 z3Var = this.f9726c;
        z3Var.Z3.remove(vVar);
        z3Var.m4(aVar);
        z3Var.f10001h3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        v vVar = this.f9724a;
        vVar.h = document;
        vVar.f9894a = 2;
        a aVar = this.f9725b;
        TL_iv.PageBlock M3 = z3.M3(aVar, vVar);
        if (M3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) M3).video_id = document.f17201id;
        }
        z3 z3Var = this.f9726c;
        z3Var.Z3.remove(vVar);
        z3Var.m4(aVar);
        z3Var.f10001h3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f9724a.f9897f = f7;
        a aVar = this.f9725b;
        z3 z3Var = this.f9726c;
        View y12 = z3Var.y1(aVar);
        if (y12 instanceof x4) {
            y12.requestLayout();
            y12.invalidate();
        }
        z3Var.f10001h3.onContentChanged();
    }

    @Override
    public final void onError() {
        v vVar = this.f9724a;
        vVar.f9894a = 3;
        z3 z3Var = this.f9726c;
        z3Var.Z3.remove(vVar);
        z3Var.p4(this.f9725b, vVar);
        z3Var.f10001h3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

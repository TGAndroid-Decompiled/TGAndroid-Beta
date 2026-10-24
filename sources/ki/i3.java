package ki;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class i3 implements z4 {
    public final t f15392a;
    public final a f15393b;
    public final w3 f15394c;

    public i3(a aVar, t tVar, w3 w3Var) {
        this.f15394c = w3Var;
        this.f15392a = tVar;
        this.f15393b = aVar;
    }

    @Override
    public final void a(int i10, int i11) {
        if (i10 > 0 && i11 > 0) {
            t tVar = this.f15392a;
            tVar.f15574j = i10;
            tVar.f15575k = i11;
        }
        View F1 = this.f15394c.F1(this.f15393b);
        if (F1 instanceof u4) {
            F1.requestLayout();
            F1.invalidate();
        }
    }

    @Override
    public final void b(TLRPC.Photo photo) {
        int i10;
        int i11;
        t tVar = this.f15392a;
        tVar.f15572g = photo;
        tVar.f15568a = 2;
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
        if (closestPhotoSizeWithSize != null && (i10 = closestPhotoSizeWithSize.f20369w) > 0 && (i11 = closestPhotoSizeWithSize.h) > 0) {
            tVar.f15574j = i10;
            tVar.f15575k = i11;
        }
        a aVar = this.f15393b;
        TL_iv.PageBlock T3 = w3.T3(aVar, tVar);
        if (T3 instanceof TL_iv.pageBlockPhoto) {
            ((TL_iv.pageBlockPhoto) T3).photo_id = photo.f20368id;
        }
        w3 w3Var = this.f15394c;
        w3Var.f15646a4.remove(tVar);
        w3Var.t4(aVar);
        w3Var.f15656i3.onContentChanged();
    }

    @Override
    public final void c(TLRPC.Document document) {
        t tVar = this.f15392a;
        tVar.h = document;
        tVar.f15568a = 2;
        a aVar = this.f15393b;
        TL_iv.PageBlock T3 = w3.T3(aVar, tVar);
        if (T3 instanceof TL_iv.pageBlockVideo) {
            ((TL_iv.pageBlockVideo) T3).video_id = document.f20350id;
        }
        w3 w3Var = this.f15394c;
        w3Var.f15646a4.remove(tVar);
        w3Var.t4(aVar);
        w3Var.f15656i3.onContentChanged();
    }

    @Override
    public final void f(float f7) {
        this.f15392a.f15571f = f7;
        a aVar = this.f15393b;
        w3 w3Var = this.f15394c;
        View F1 = w3Var.F1(aVar);
        if (F1 instanceof u4) {
            F1.requestLayout();
            F1.invalidate();
        }
        w3Var.f15656i3.onContentChanged();
    }

    @Override
    public final void onError() {
        t tVar = this.f15392a;
        tVar.f15568a = 3;
        w3 w3Var = this.f15394c;
        w3Var.f15646a4.remove(tVar);
        w3Var.w4(this.f15393b, tVar);
        w3Var.f15656i3.onContentChanged();
    }

    @Override
    public final void d(TLRPC.Document document) {
    }

    @Override
    public final void e(TLRPC.Document document) {
    }
}

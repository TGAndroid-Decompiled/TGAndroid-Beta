package j2;

import android.graphics.Bitmap;
import b2.p0;
import e2.o;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e2;
public final class d implements o, b2, ih.b {
    public final int f15196a;

    public d(int i10) {
        this.f15196a = i10;
    }

    @Override
    public Object a(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            Bitmap stackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, Math.max(bitmap.getWidth() / 90.0f, bitmap.getHeight() / 120.0f));
            stackBlurBitmapWithScaleFactor.setHasAlpha(false);
            return stackBlurBitmapWithScaleFactor;
        }
        return null;
    }

    @Override
    public void h(e2 e2Var, int i10) {
        switch (this.f15196a) {
            case 27:
                e2Var.dismiss();
                return;
            default:
                e2Var.dismiss();
                return;
        }
    }

    @Override
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.f15196a) {
            case 0:
                bVar.getClass();
                return;
            case 1:
                bVar.getClass();
                return;
            case 2:
                bVar.getClass();
                return;
            case 3:
                bVar.getClass();
                return;
            case 4:
                bVar.getClass();
                return;
            case 5:
                bVar.getClass();
                return;
            case 6:
                bVar.getClass();
                return;
            case 7:
                bVar.getClass();
                return;
            case 8:
                bVar.getClass();
                return;
            case 9:
                bVar.getClass();
                return;
            case 10:
                bVar.getClass();
                return;
            case 11:
                bVar.getClass();
                return;
            case 12:
                bVar.getClass();
                return;
            case 13:
                bVar.getClass();
                return;
            case 14:
                bVar.getClass();
                return;
            case 15:
                bVar.getClass();
                return;
            case 16:
                bVar.getClass();
                return;
            case 17:
                bVar.getClass();
                return;
            case 18:
                bVar.getClass();
                return;
            case 19:
                bVar.getClass();
                return;
            case 20:
                bVar.getClass();
                return;
            case 21:
                bVar.getClass();
                return;
            case 22:
                bVar.getClass();
                return;
            case 23:
                bVar.getClass();
                return;
            default:
                bVar.getClass();
                return;
        }
    }

    public d(a aVar, float f7) {
        this.f15196a = 24;
    }

    public d(a aVar, int i10) {
        this.f15196a = i10;
    }

    public d(a aVar, int i10, int i11) {
        this.f15196a = i11;
    }

    public d(a aVar, long j10) {
        this.f15196a = 15;
    }

    public d(a aVar, p0 p0Var, int i10) {
        this.f15196a = 23;
    }

    public d(a aVar, Object obj, int i10) {
        this.f15196a = i10;
    }

    public d(a aVar, Object obj, Object obj2, int i10) {
        this.f15196a = i10;
    }

    public d(a aVar, boolean z10, int i10) {
        this.f15196a = i10;
    }
}

package nh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i0;
public final class j implements Runnable {
    public final int f13862a;
    public final k f13863b;
    public final int f13864c;

    public j(k kVar, int i10, int i11) {
        this.f13862a = i11;
        this.f13863b = kVar;
        this.f13864c = i10;
    }

    @Override
    public final void run() {
        switch (this.f13862a) {
            case 0:
                k kVar = this.f13863b;
                int i10 = kVar.f13873k;
                m4.c[] cVarArr = kVar.f13868c;
                int i11 = this.f13864c;
                if (cVarArr[i11] == null) {
                    cVarArr[i11] = new m4.c(i10);
                }
                Bitmap bitmap = kVar.e;
                if (bitmap == null) {
                    kVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    kVar.f13869f = new Canvas(kVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                kVar.a(kVar.f13869f, kVar.f13877o);
                Utilities.copyBitmaps(kVar.e, (Bitmap) cVarArr[i11].f12706b);
                i0.g3(new j(kVar, i11, 1));
                return;
            default:
                k kVar2 = this.f13863b;
                int i12 = this.f13864c;
                kVar2.d = i12;
                kVar2.f13870g.setShader((BitmapShader) kVar2.f13868c[i12].f12707c);
                kVar2.f13872j = false;
                kVar2.f13878p = true;
                return;
        }
    }
}

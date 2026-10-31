package nh;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.i0;
public final class j implements Runnable {
    public final int f13861a;
    public final k f13862b;
    public final int f13863c;

    public j(k kVar, int i10, int i11) {
        this.f13861a = i11;
        this.f13862b = kVar;
        this.f13863c = i10;
    }

    @Override
    public final void run() {
        switch (this.f13861a) {
            case 0:
                k kVar = this.f13862b;
                int i10 = kVar.f13872k;
                m4.c[] cVarArr = kVar.f13867c;
                int i11 = this.f13863c;
                if (cVarArr[i11] == null) {
                    cVarArr[i11] = new m4.c(i10);
                }
                Bitmap bitmap = kVar.e;
                if (bitmap == null) {
                    kVar.e = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
                    kVar.f13868f = new Canvas(kVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                kVar.a(kVar.f13868f, kVar.f13876o);
                Utilities.copyBitmaps(kVar.e, (Bitmap) cVarArr[i11].f12705b);
                i0.g3(new j(kVar, i11, 1));
                return;
            default:
                k kVar2 = this.f13862b;
                int i12 = this.f13863c;
                kVar2.d = i12;
                kVar2.f13869g.setShader((BitmapShader) kVar2.f13867c[i12].f12706c);
                kVar2.f13871j = false;
                kVar2.f13877p = true;
                return;
        }
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
public final class opa implements Runnable {
    public final byte a;
    public final ppa b;
    public final int c;

    public opa(ppa ppaVar, int i, byte b) {
        this.a = b;
        this.b = ppaVar;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        ppa ppaVar = this.b;
        switch (b) {
            case 0:
                int i2 = ppaVar.k;
                ym4[] ym4VarArr = ppaVar.c;
                if (ym4VarArr[i] == null) {
                    ym4VarArr[i] = new ym4(i2);
                }
                Bitmap bitmap = ppaVar.e;
                if (bitmap == null) {
                    ppaVar.e = Bitmap.createBitmap(i2, i2, Bitmap.Config.ALPHA_8);
                    ppaVar.f = new Canvas(ppaVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                ppaVar.a(ppaVar.f, ppaVar.o);
                Utilities.copyBitmaps(ppaVar.e, (Bitmap) ym4VarArr[i].b);
                hl.c3(new opa(ppaVar, i, (byte) 1));
                return;
            default:
                ppaVar.d = i;
                ppaVar.g.setShader((BitmapShader) ppaVar.c[i].c);
                ppaVar.j = false;
                ppaVar.p = true;
                return;
        }
    }
}

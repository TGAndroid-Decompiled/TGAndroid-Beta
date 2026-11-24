package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import org.telegram.messenger.Utilities;
public final class sna implements Runnable {
    public final byte a;
    public final tna b;
    public final int c;

    public sna(tna tnaVar, int i, byte b) {
        this.a = b;
        this.b = tnaVar;
        this.c = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = this.c;
        tna tnaVar = this.b;
        switch (b) {
            case 0:
                int i2 = tnaVar.k;
                mj4[] mj4VarArr = tnaVar.c;
                if (mj4VarArr[i] == null) {
                    mj4VarArr[i] = new mj4(i2);
                }
                Bitmap bitmap = tnaVar.e;
                if (bitmap == null) {
                    tnaVar.e = Bitmap.createBitmap(i2, i2, Bitmap.Config.ALPHA_8);
                    tnaVar.f = new Canvas(tnaVar.e);
                } else {
                    bitmap.eraseColor(0);
                }
                tnaVar.a(tnaVar.f, tnaVar.o);
                Utilities.copyBitmaps(tnaVar.e, (Bitmap) mj4VarArr[i].b);
                gm.c3(new sna(tnaVar, i, (byte) 1));
                return;
            default:
                tnaVar.d = i;
                tnaVar.g.setShader((BitmapShader) tnaVar.c[i].c);
                tnaVar.j = false;
                tnaVar.p = true;
                return;
        }
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;
public final class ul0 implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final vl0 d;

    public ul0(vl0 vl0Var) {
        this.d = vl0Var;
    }

    @Override
    public final void run() {
        int i;
        Bitmap bitmap;
        vl0 vl0Var = this.d;
        Paint paint = vl0Var.w;
        if (vl0Var.f == null) {
            vl0Var.f = new Bitmap[2];
            vl0Var.i = new Canvas[2];
        }
        int i2 = (int) (this.b / 15.0f);
        for (int i3 = 0; i3 < 2; i3++) {
            if (i3 == 0) {
                i = vl0Var.s;
            } else {
                i = this.c;
            }
            int i4 = (int) (i / 15.0f);
            Bitmap bitmap2 = vl0Var.f[i3];
            if (bitmap2 != null && ((bitmap2.getHeight() != i4 || vl0Var.f[i3].getWidth() != i2) && (bitmap = vl0Var.f[i3]) != null)) {
                bitmap.recycle();
                vl0Var.f[i3] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = vl0Var.f;
            if (bitmapArr[i3] == null) {
                try {
                    bitmapArr[i3] = Bitmap.createBitmap(i2, i4, Bitmap.Config.ARGB_8888);
                    vl0Var.i[i3] = new Canvas(vl0Var.f[i3]);
                    vl0Var.i[i3].scale(i2 / vl0Var.e[i3].getWidth(), i4 / vl0Var.e[i3].getHeight());
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
            }
            Bitmap[] bitmapArr2 = vl0Var.f;
            if (i3 == 1) {
                bitmapArr2[i3].eraseColor(cmb.v0(cmb.c6, vl0Var.y));
            } else {
                bitmapArr2[i3].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(vl0Var.e[i3], 15);
            Canvas canvas = vl0Var.i[i3];
            if (canvas != null) {
                canvas.drawBitmap(vl0Var.e[i3], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            }
        }
        gm.c3(new f00(this, (byte) 12));
    }
}

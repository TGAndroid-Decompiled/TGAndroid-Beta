package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;
public final class vk0 implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final wk0 d;

    public vk0(wk0 wk0Var) {
        this.d = wk0Var;
    }

    @Override
    public final void run() {
        int i;
        Bitmap bitmap;
        wk0 wk0Var = this.d;
        Paint paint = wk0Var.w;
        if (wk0Var.f == null) {
            wk0Var.f = new Bitmap[2];
            wk0Var.i = new Canvas[2];
        }
        int i2 = (int) (this.b / 15.0f);
        for (int i3 = 0; i3 < 2; i3++) {
            if (i3 == 0) {
                i = wk0Var.s;
            } else {
                i = this.c;
            }
            int i4 = (int) (i / 15.0f);
            Bitmap bitmap2 = wk0Var.f[i3];
            if (bitmap2 != null && ((bitmap2.getHeight() != i4 || wk0Var.f[i3].getWidth() != i2) && (bitmap = wk0Var.f[i3]) != null)) {
                bitmap.recycle();
                wk0Var.f[i3] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = wk0Var.f;
            if (bitmapArr[i3] == null) {
                try {
                    bitmapArr[i3] = Bitmap.createBitmap(i2, i4, Bitmap.Config.ARGB_8888);
                    wk0Var.i[i3] = new Canvas(wk0Var.f[i3]);
                    wk0Var.i[i3].scale(i2 / wk0Var.e[i3].getWidth(), i4 / wk0Var.e[i3].getHeight());
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
            Bitmap[] bitmapArr2 = wk0Var.f;
            if (i3 == 1) {
                bitmapArr2[i3].eraseColor(aob.v0(aob.d6, wk0Var.y));
            } else {
                bitmapArr2[i3].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(wk0Var.e[i3], 15);
            Canvas canvas = wk0Var.i[i3];
            if (canvas != null) {
                canvas.drawBitmap(wk0Var.e[i3], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            }
        }
        hl.c3(new pz(this, (byte) 10));
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.Utilities;
public final class uk0 implements Runnable {
    public boolean a;
    public int b;
    public int c;
    public final vk0 d;

    public uk0(vk0 vk0Var) {
        this.d = vk0Var;
    }

    @Override
    public final void run() {
        int i;
        Bitmap bitmap;
        vk0 vk0Var = this.d;
        Paint paint = vk0Var.w;
        if (vk0Var.f == null) {
            vk0Var.f = new Bitmap[2];
            vk0Var.i = new Canvas[2];
        }
        int i2 = (int) (this.b / 15.0f);
        for (int i3 = 0; i3 < 2; i3++) {
            if (i3 == 0) {
                i = vk0Var.s;
            } else {
                i = this.c;
            }
            int i4 = (int) (i / 15.0f);
            Bitmap bitmap2 = vk0Var.f[i3];
            if (bitmap2 != null && ((bitmap2.getHeight() != i4 || vk0Var.f[i3].getWidth() != i2) && (bitmap = vk0Var.f[i3]) != null)) {
                bitmap.recycle();
                vk0Var.f[i3] = null;
            }
            System.currentTimeMillis();
            Bitmap[] bitmapArr = vk0Var.f;
            if (bitmapArr[i3] == null) {
                try {
                    bitmapArr[i3] = Bitmap.createBitmap(i2, i4, Bitmap.Config.ARGB_8888);
                    vk0Var.i[i3] = new Canvas(vk0Var.f[i3]);
                    vk0Var.i[i3].scale(i2 / vk0Var.e[i3].getWidth(), i4 / vk0Var.e[i3].getHeight());
                } catch (Throwable th) {
                    fa4.g(th, true);
                }
            }
            Bitmap[] bitmapArr2 = vk0Var.f;
            if (i3 == 1) {
                bitmapArr2[i3].eraseColor(bkb.v0(bkb.c6, vk0Var.y));
            } else {
                bitmapArr2[i3].eraseColor(0);
            }
            paint.setAlpha(255);
            Utilities.stackBlurBitmap(vk0Var.e[i3], 15);
            Canvas canvas = vk0Var.i[i3];
            if (canvas != null) {
                canvas.drawBitmap(vk0Var.e[i3], 0.0f, 0.0f, paint);
            }
            if (this.a) {
                return;
            }
        }
        gl.d3(new oz(this, (byte) 10));
    }
}

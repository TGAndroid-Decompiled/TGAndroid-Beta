package defpackage;

import android.graphics.Bitmap;
public final class zd2 implements Runnable {
    public final byte a;
    public final long b;
    public final Bitmap c;

    public zd2(long j, Bitmap bitmap, byte b) {
        this.a = b;
        this.b = j;
        this.c = bitmap;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Bitmap bitmap = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                dye.d(dye.c(j), bitmap);
                return;
            default:
                dye.d("thumb_" + j, bitmap);
                return;
        }
    }
}

package defpackage;

import android.graphics.Bitmap;
public final class kf2 implements Runnable {
    public final byte a;
    public final long b;
    public final Bitmap c;

    public kf2(long j, Bitmap bitmap, byte b) {
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
                f0f.d(f0f.c(j), bitmap);
                return;
            default:
                f0f.d("thumb_" + j, bitmap);
                return;
        }
    }
}

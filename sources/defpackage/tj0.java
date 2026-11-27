package defpackage;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
public final class tj0 {
    public WeakReference a;
    public long b;
    public boolean c = true;

    public final boolean a(Bitmap bitmap) {
        Bitmap bitmap2;
        long j;
        if (!this.c) {
            WeakReference weakReference = this.a;
            if (weakReference != null) {
                bitmap2 = (Bitmap) weakReference.get();
            } else {
                bitmap2 = null;
            }
            if (bitmap2 == bitmap) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    j = bitmap.getGenerationId();
                } else {
                    j = 0;
                }
                if (j != this.b) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public final void b(Bitmap bitmap) {
        WeakReference weakReference;
        long j;
        if (bitmap != null) {
            weakReference = new WeakReference(bitmap);
        } else {
            weakReference = null;
        }
        this.a = weakReference;
        if (bitmap != null && !bitmap.isRecycled()) {
            j = bitmap.getGenerationId();
        } else {
            j = 0;
        }
        this.b = j;
        this.c = false;
    }
}

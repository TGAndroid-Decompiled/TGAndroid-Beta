package fh;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
public final class a {
    public WeakReference f8284a;
    public long f8285b;
    public boolean f8286c = true;

    public final boolean a(Bitmap bitmap) {
        Bitmap bitmap2;
        long j3;
        if (!this.f8286c) {
            WeakReference weakReference = this.f8284a;
            if (weakReference != null) {
                bitmap2 = (Bitmap) weakReference.get();
            } else {
                bitmap2 = null;
            }
            if (bitmap2 == bitmap) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    j3 = bitmap.getGenerationId();
                } else {
                    j3 = 0;
                }
                if (j3 != this.f8285b) {
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
        long j3;
        if (bitmap != null) {
            weakReference = new WeakReference(bitmap);
        } else {
            weakReference = null;
        }
        this.f8284a = weakReference;
        if (bitmap != null && !bitmap.isRecycled()) {
            j3 = bitmap.getGenerationId();
        } else {
            j3 = 0;
        }
        this.f8285b = j3;
        this.f8286c = false;
    }
}

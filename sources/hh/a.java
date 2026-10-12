package hh;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
public final class a {
    public WeakReference f10805a;
    public long f10806b;
    public boolean f10807c = true;

    public final boolean a(Bitmap bitmap) {
        Bitmap bitmap2;
        long j10;
        if (!this.f10807c) {
            WeakReference weakReference = this.f10805a;
            if (weakReference != null) {
                bitmap2 = (Bitmap) weakReference.get();
            } else {
                bitmap2 = null;
            }
            if (bitmap2 == bitmap) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    j10 = bitmap.getGenerationId();
                } else {
                    j10 = 0;
                }
                if (j10 != this.f10806b) {
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
        long j10;
        if (bitmap != null) {
            weakReference = new WeakReference(bitmap);
        } else {
            weakReference = null;
        }
        this.f10805a = weakReference;
        if (bitmap != null && !bitmap.isRecycled()) {
            j10 = bitmap.getGenerationId();
        } else {
            j10 = 0;
        }
        this.f10806b = j10;
        this.f10807c = false;
    }
}

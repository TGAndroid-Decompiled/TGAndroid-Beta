package gh;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
public final class a {
    public WeakReference f9985a;
    public long f9986b;
    public boolean f9987c = true;

    public final boolean a(Bitmap bitmap) {
        Bitmap bitmap2;
        long j3;
        if (!this.f9987c) {
            WeakReference weakReference = this.f9985a;
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
                if (j3 != this.f9986b) {
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
        this.f9985a = weakReference;
        if (bitmap != null && !bitmap.isRecycled()) {
            j3 = bitmap.getGenerationId();
        } else {
            j3 = 0;
        }
        this.f9986b = j3;
        this.f9987c = false;
    }
}

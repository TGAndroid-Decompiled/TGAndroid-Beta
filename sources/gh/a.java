package gh;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
public final class a {
    public WeakReference f10876a;
    public long f10877b;
    public boolean f10878c = true;

    public final boolean a(Bitmap bitmap) {
        Bitmap bitmap2;
        long j3;
        if (!this.f10878c) {
            WeakReference weakReference = this.f10876a;
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
                if (j3 != this.f10877b) {
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
        this.f10876a = weakReference;
        if (bitmap != null && !bitmap.isRecycled()) {
            j3 = bitmap.getGenerationId();
        } else {
            j3 = 0;
        }
        this.f10877b = j3;
        this.f10878c = false;
    }
}

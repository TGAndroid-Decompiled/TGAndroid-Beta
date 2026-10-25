package ih;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
public final class a {
    public WeakReference f14309a;
    public long f14310b;
    public boolean f14311c = true;

    public final boolean a(Bitmap bitmap) {
        Bitmap bitmap2;
        long j10;
        if (!this.f14311c) {
            WeakReference weakReference = this.f14309a;
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
                if (j10 != this.f14310b) {
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
        this.f14309a = weakReference;
        if (bitmap != null && !bitmap.isRecycled()) {
            j10 = bitmap.getGenerationId();
        } else {
            j10 = 0;
        }
        this.f14310b = j10;
        this.f14311c = false;
    }
}

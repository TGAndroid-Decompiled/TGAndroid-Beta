package ci;

import android.graphics.Bitmap;
import android.util.LruCache;
public final class q3 extends LruCache {
    @Override
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Bitmap bitmap = (Bitmap) obj2;
        Bitmap bitmap2 = (Bitmap) obj3;
        if (!bitmap.isRecycled() && !r3.f5438e0.containsKey(str)) {
            bitmap.recycle();
        }
    }
}

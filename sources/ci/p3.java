package ci;

import android.graphics.Bitmap;
import android.util.LruCache;
public final class p3 extends LruCache {
    @Override
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Bitmap bitmap = (Bitmap) obj2;
        Bitmap bitmap2 = (Bitmap) obj3;
        if (!bitmap.isRecycled() && !q3.f5770e0.containsKey(str)) {
            bitmap.recycle();
        }
    }
}

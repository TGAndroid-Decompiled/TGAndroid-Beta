package bi;

import android.graphics.Bitmap;
import android.util.LruCache;
public final class i4 extends LruCache {
    @Override
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Bitmap bitmap = (Bitmap) obj2;
        Bitmap bitmap2 = (Bitmap) obj3;
        if (!bitmap.isRecycled() && !j4.f2943e0.containsKey(str)) {
            bitmap.recycle();
        }
    }
}

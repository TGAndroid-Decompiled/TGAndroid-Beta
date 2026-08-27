package lh;

import android.graphics.Bitmap;
import android.util.LruCache;

public final class k3 extends LruCache {
    @Override
    public final void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        Bitmap bitmap = (Bitmap) obj2;
        if (bitmap.isRecycled() || l3.f16295a0.containsKey(str)) {
            return;
        }
        bitmap.recycle();
    }
}

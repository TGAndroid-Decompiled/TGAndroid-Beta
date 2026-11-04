package gh;

import android.graphics.Bitmap;
import android.util.LruCache;
import gi.z2;
public final class i extends LruCache {
    public final int f12343a;

    public i(int i3, int i10) {
        super(i3);
        this.f12343a = i10;
    }

    @Override
    public void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        switch (this.f12343a) {
            case 1:
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                Bitmap bitmap2 = (Bitmap) obj3;
                if (!bitmap.isRecycled() && !z2.f14006f0.containsKey(str)) {
                    bitmap.recycle();
                    return;
                }
                return;
            default:
                super.entryRemoved(z10, obj, obj2, obj3);
                return;
        }
    }

    @Override
    public int sizeOf(Object obj, Object obj2) {
        switch (this.f12343a) {
            case 0:
                Long l10 = (Long) obj;
                return ((j) obj2).d;
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}

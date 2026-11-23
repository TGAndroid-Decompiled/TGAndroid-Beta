package fh;

import android.graphics.Bitmap;
import android.util.LruCache;
import hi.i3;
public final class i extends LruCache {
    public final int f11674a;

    public i(int i7, int i10) {
        super(i7);
        this.f11674a = i10;
    }

    @Override
    public void entryRemoved(boolean z10, Object obj, Object obj2, Object obj3) {
        switch (this.f11674a) {
            case 1:
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                Bitmap bitmap2 = (Bitmap) obj3;
                if (!bitmap.isRecycled() && !i3.f14655f0.containsKey(str)) {
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
        switch (this.f11674a) {
            case 0:
                Long l10 = (Long) obj;
                return ((j) obj2).d;
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}

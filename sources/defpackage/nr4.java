package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;
public final class nr4 extends LruCache {
    public final byte a;

    public nr4(int i, byte b) {
        super(i);
        this.a = b;
    }

    @Override
    public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                Bitmap bitmap2 = (Bitmap) obj3;
                if (!bitmap.isRecycled() && !or4.f0.containsKey(str)) {
                    bitmap.recycle();
                    return;
                }
                return;
            default:
                super.entryRemoved(z, obj, obj2, obj3);
                return;
        }
    }

    @Override
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                Long l = (Long) obj;
                return ((cx4) obj2).d;
            case 2:
                Long l2 = (Long) obj;
                bb8 bb8Var = (bb8) obj2;
                return Math.max(1, gb8.a(bb8Var.q) + gb8.a(bb8Var.o) + gb8.a(bb8Var.n) + gb8.a(bb8Var.m) + gb8.a(bb8Var.l) + gb8.a(bb8Var.k) + gb8.a(bb8Var.j));
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}

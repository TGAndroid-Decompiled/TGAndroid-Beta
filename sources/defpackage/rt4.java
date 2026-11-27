package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;
public final class rt4 extends LruCache {
    public final byte a;

    public rt4(int i, byte b) {
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
                if (!bitmap.isRecycled() && !st4.f0.containsKey(str)) {
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
                return ((iz4) obj2).d;
            case 2:
                Long l2 = (Long) obj;
                qe8 qe8Var = (qe8) obj2;
                return Math.max(1, ve8.a(qe8Var.q) + ve8.a(qe8Var.o) + ve8.a(qe8Var.n) + ve8.a(qe8Var.m) + ve8.a(qe8Var.l) + ve8.a(qe8Var.k) + ve8.a(qe8Var.j));
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;
public final class ot4 extends LruCache {
    public final byte a;

    public ot4(int i, byte b) {
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
                if (!bitmap.isRecycled() && !pt4.f0.containsKey(str)) {
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
                return ((ez4) obj2).d;
            case 2:
                Long l2 = (Long) obj;
                ed8 ed8Var = (ed8) obj2;
                return Math.max(1, jd8.a(ed8Var.q) + jd8.a(ed8Var.o) + jd8.a(ed8Var.n) + jd8.a(ed8Var.m) + jd8.a(ed8Var.l) + jd8.a(ed8Var.k) + jd8.a(ed8Var.j));
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}

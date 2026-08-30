package e8;

import android.util.SparseIntArray;
public final class b {
    public static final Object f5159c = new Object();
    public static int d;
    public final SparseIntArray f5160a = new SparseIntArray();
    public final SparseIntArray f5161b = new SparseIntArray();

    public final int a(int i10) {
        synchronized (f5159c) {
            try {
                int i11 = this.f5160a.get(i10, -1);
                if (i11 != -1) {
                    return i11;
                }
                int i12 = d;
                d = i12 + 1;
                this.f5160a.append(i10, i12);
                this.f5161b.append(i12, i10);
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

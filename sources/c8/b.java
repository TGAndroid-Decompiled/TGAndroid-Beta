package c8;

import android.util.SparseIntArray;
public final class b {
    public static final Object f3005c = new Object();
    public static int d;
    public final SparseIntArray f3006a = new SparseIntArray();
    public final SparseIntArray f3007b = new SparseIntArray();

    public final int a(int i10) {
        synchronized (f3005c) {
            try {
                int i11 = this.f3006a.get(i10, -1);
                if (i11 != -1) {
                    return i11;
                }
                int i12 = d;
                d = i12 + 1;
                this.f3006a.append(i10, i12);
                this.f3007b.append(i12, i10);
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package b8;

import android.util.SparseIntArray;

public final class c {

    public static final Object f2044c = new Object();
    public static int d;

    public final SparseIntArray f2045a = new SparseIntArray();

    public final SparseIntArray f2046b = new SparseIntArray();

    public final int a(int i10) {
        synchronized (f2044c) {
            try {
                int i11 = this.f2045a.get(i10, -1);
                if (i11 != -1) {
                    return i11;
                }
                int i12 = d;
                d = i12 + 1;
                this.f2045a.append(i10, i12);
                this.f2046b.append(i12, i10);
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

package a0;

import java.util.ConcurrentModificationException;
public abstract class i {
    public static final Object f19a = new Object();
    public static final Object f20b = new Object();

    public static final void a(g gVar, int i9) {
        gVar.f13a = new int[i9];
        gVar.f14b = new Object[i9];
    }

    public static final int b(g gVar, Object obj, int i9) {
        int i10 = gVar.f15c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int a2 = b0.a.a(i10, i9, gVar.f13a);
            if (a2 < 0 || kotlin.jvm.internal.i.a(obj, gVar.f14b[a2])) {
                return a2;
            }
            int i11 = a2 + 1;
            while (i11 < i10 && gVar.f13a[i11] == i9) {
                if (kotlin.jvm.internal.i.a(obj, gVar.f14b[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a2 - 1; i12 >= 0 && gVar.f13a[i12] == i9; i12--) {
                if (kotlin.jvm.internal.i.a(obj, gVar.f14b[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}

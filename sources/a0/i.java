package a0;

import java.util.ConcurrentModificationException;
public abstract class i {
    public static final Object f20a = new Object();
    public static final Object f21b = new Object();

    public static final void a(g gVar, int i3) {
        gVar.f14a = new int[i3];
        gVar.f15b = new Object[i3];
    }

    public static final int b(g gVar, Object obj, int i3) {
        int i10 = gVar.f16c;
        if (i10 == 0) {
            return -1;
        }
        try {
            int a10 = b0.a.a(i10, i3, gVar.f14a);
            if (a10 < 0 || kotlin.jvm.internal.j.a(obj, gVar.f15b[a10])) {
                return a10;
            }
            int i11 = a10 + 1;
            while (i11 < i10 && gVar.f14a[i11] == i3) {
                if (kotlin.jvm.internal.j.a(obj, gVar.f15b[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = a10 - 1; i12 >= 0 && gVar.f14a[i12] == i3; i12--) {
                if (kotlin.jvm.internal.j.a(obj, gVar.f15b[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}

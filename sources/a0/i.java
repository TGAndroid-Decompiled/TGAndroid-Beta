package a0;

import java.util.ConcurrentModificationException;
public abstract class i {
    public static final Object f17a = new Object();
    public static final Object f18b = new Object();

    public static final void a(g gVar, int i10) {
        gVar.f11a = new int[i10];
        gVar.f12b = new Object[i10];
    }

    public static final int b(g gVar, Object obj, int i10) {
        int i11 = gVar.f13c;
        if (i11 == 0) {
            return -1;
        }
        try {
            int a2 = b0.a.a(i11, i10, gVar.f11a);
            if (a2 < 0 || kotlin.jvm.internal.j.a(obj, gVar.f12b[a2])) {
                return a2;
            }
            int i12 = a2 + 1;
            while (i12 < i11 && gVar.f11a[i12] == i10) {
                if (kotlin.jvm.internal.j.a(obj, gVar.f12b[i12])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = a2 - 1; i13 >= 0 && gVar.f11a[i13] == i10; i13--) {
                if (kotlin.jvm.internal.j.a(obj, gVar.f12b[i13])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}

package defpackage;
public abstract class pod {
    public static final int a(st stVar, Object obj, int i) {
        int i2 = stVar.c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a = ir3.a(i2, i, stVar.a);
            if (a < 0 || rr5.a(obj, stVar.b[a])) {
                return a;
            }
            int i3 = a + 1;
            while (i3 < i2 && stVar.a[i3] == i) {
                if (rr5.a(obj, stVar.b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a - 1; i4 >= 0 && stVar.a[i4] == i; i4--) {
                if (rr5.a(obj, stVar.b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            zg.b();
            return 0;
        }
    }
}

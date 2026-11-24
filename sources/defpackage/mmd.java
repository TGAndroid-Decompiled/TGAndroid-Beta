package defpackage;
public abstract class mmd {
    public static final int a(rs rsVar, Object obj, int i) {
        int i2 = rsVar.c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a = yp3.a(i2, i, rsVar.a);
            if (a < 0 || rp5.a(obj, rsVar.b[a])) {
                return a;
            }
            int i3 = a + 1;
            while (i3 < i2 && rsVar.a[i3] == i) {
                if (rp5.a(obj, rsVar.b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a - 1; i4 >= 0 && rsVar.a[i4] == i; i4--) {
                if (rp5.a(obj, rsVar.b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            ag.b();
            return 0;
        }
    }
}

package n7;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
public class t0 implements Iterable, Serializable {
    public static final t0 f17315c = new t0(u0.f17320a);
    public int f17316a = 0;
    public final byte[] f17317b;

    static {
        int i10 = r0.f17312a;
    }

    public t0(byte[] bArr) {
        bArr.getClass();
        this.f17317b = bArr;
    }

    public static int r(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(a1.g.l(i11, i12, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(i2.d.k(i10, "Beginning index: ", " < 0"));
        }
        return i13;
    }

    public static t0 s(int i10, byte[] bArr) {
        r(0, i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return new t0(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof t0) && o() == ((t0) obj).o()) {
                if (o() != 0) {
                    if (obj instanceof t0) {
                        t0 t0Var = (t0) obj;
                        int i10 = this.f17316a;
                        int i11 = t0Var.f17316a;
                        if (i10 == 0 || i11 == 0 || i10 == i11) {
                            int o10 = o();
                            if (o10 <= t0Var.o()) {
                                if (o10 <= t0Var.o()) {
                                    byte[] bArr = t0Var.f17317b;
                                    int n10 = n() + o10;
                                    int n11 = n();
                                    int n12 = t0Var.n();
                                    while (n11 < n10) {
                                        if (this.f17317b[n11] != bArr[n12]) {
                                            return false;
                                        }
                                        n11++;
                                        n12++;
                                    }
                                    return true;
                                }
                                throw new IllegalArgumentException(a1.g.l(o10, t0Var.o(), "Ran off end of other: 0, ", ", "));
                            }
                            int o11 = o();
                            throw new IllegalArgumentException("Length too large: " + o10 + o11);
                        }
                        return false;
                    }
                    return obj.equals(this);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public byte h(int i10) {
        return this.f17317b[i10];
    }

    public final int hashCode() {
        int i10 = this.f17316a;
        if (i10 == 0) {
            int o10 = o();
            int n10 = n();
            byte[] bArr = u0.f17320a;
            int i11 = o10;
            for (int i12 = n10; i12 < n10 + o10; i12++) {
                i11 = (i11 * 31) + this.f17317b[i12];
            }
            if (i11 == 0) {
                i11 = 1;
            }
            this.f17316a = i11;
            return i11;
        }
        return i10;
    }

    @Override
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte m(int i10) {
        return this.f17317b[i10];
    }

    public int n() {
        return 0;
    }

    public int o() {
        return this.f17317b.length;
    }

    public void p(int i10, byte[] bArr) {
        System.arraycopy(this.f17317b, 0, bArr, 0, i10);
    }

    public final ByteArrayInputStream q() {
        return new ByteArrayInputStream(this.f17317b, n(), o());
    }

    public final byte[] t() {
        int o10 = o();
        if (o10 == 0) {
            return u0.f17320a;
        }
        byte[] bArr = new byte[o10];
        p(o10, bArr);
        return bArr;
    }

    public final String toString() {
        t0 s0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int o10 = o();
        if (o() <= 50) {
            concat = a.d(this);
        } else {
            int r10 = r(0, 47, o());
            if (r10 == 0) {
                s0Var = f17315c;
            } else {
                s0Var = new s0(this.f17317b, n(), r10);
            }
            concat = a.d(s0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(o10);
        sb2.append(" contents=\"");
        return a1.g.s(sb2, concat, "\">");
    }
}

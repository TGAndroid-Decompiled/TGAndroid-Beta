package n7;

import i2.o1;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
public class s0 implements Iterable, Serializable {
    public static final s0 f17372c = new s0(t0.f17377a);
    public int f17373a = 0;
    public final byte[] f17374b;

    static {
        int i10 = q0.f17369a;
    }

    public s0(byte[] bArr) {
        bArr.getClass();
        this.f17374b = bArr;
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
            throw new IndexOutOfBoundsException(o1.l(i10, "Beginning index: ", " < 0"));
        }
        return i13;
    }

    public static s0 s(int i10, byte[] bArr) {
        r(0, i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return new s0(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof s0) && o() == ((s0) obj).o()) {
                if (o() != 0) {
                    if (obj instanceof s0) {
                        s0 s0Var = (s0) obj;
                        int i10 = this.f17373a;
                        int i11 = s0Var.f17373a;
                        if (i10 == 0 || i11 == 0 || i10 == i11) {
                            int o10 = o();
                            if (o10 <= s0Var.o()) {
                                if (o10 <= s0Var.o()) {
                                    byte[] bArr = s0Var.f17374b;
                                    int n10 = n() + o10;
                                    int n11 = n();
                                    int n12 = s0Var.n();
                                    while (n11 < n10) {
                                        if (this.f17374b[n11] != bArr[n12]) {
                                            return false;
                                        }
                                        n11++;
                                        n12++;
                                    }
                                    return true;
                                }
                                throw new IllegalArgumentException(a1.g.l(o10, s0Var.o(), "Ran off end of other: 0, ", ", "));
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
        return this.f17374b[i10];
    }

    public final int hashCode() {
        int i10 = this.f17373a;
        if (i10 == 0) {
            int o10 = o();
            int n10 = n();
            byte[] bArr = t0.f17377a;
            int i11 = o10;
            for (int i12 = n10; i12 < n10 + o10; i12++) {
                i11 = (i11 * 31) + this.f17374b[i12];
            }
            if (i11 == 0) {
                i11 = 1;
            }
            this.f17373a = i11;
            return i11;
        }
        return i10;
    }

    @Override
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte m(int i10) {
        return this.f17374b[i10];
    }

    public int n() {
        return 0;
    }

    public int o() {
        return this.f17374b.length;
    }

    public void p(int i10, byte[] bArr) {
        System.arraycopy(this.f17374b, 0, bArr, 0, i10);
    }

    public final ByteArrayInputStream q() {
        return new ByteArrayInputStream(this.f17374b, n(), o());
    }

    public final byte[] t() {
        int o10 = o();
        if (o10 == 0) {
            return t0.f17377a;
        }
        byte[] bArr = new byte[o10];
        p(o10, bArr);
        return bArr;
    }

    public final String toString() {
        s0 r0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int o10 = o();
        if (o() <= 50) {
            concat = a.d(this);
        } else {
            int r10 = r(0, 47, o());
            if (r10 == 0) {
                r0Var = f17372c;
            } else {
                r0Var = new r0(this.f17374b, n(), r10);
            }
            concat = a.d(r0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(o10);
        sb2.append(" contents=\"");
        return a1.g.s(sb2, concat, "\">");
    }
}

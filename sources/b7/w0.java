package b7;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
public class w0 implements Iterable, Serializable {
    public static final w0 f1747c = new w0(x0.f1750a);
    public int f1748a = 0;
    public final byte[] f1749b;

    static {
        int i10 = u0.f1744a;
    }

    public w0(byte[] bArr) {
        bArr.getClass();
        this.f1749b = bArr;
    }

    public static int s(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, i11, "Beginning index larger than ending index: ", ", "));
                }
                throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i11, i12, "End index: ", " >= "));
            }
            throw new IndexOutOfBoundsException(kf.k0.k(i10, "Beginning index: ", " < 0"));
        }
        return i13;
    }

    public static w0 t(int i10, byte[] bArr) {
        s(0, i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return new w0(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof w0) && p() == ((w0) obj).p()) {
                if (p() != 0) {
                    if (obj instanceof w0) {
                        w0 w0Var = (w0) obj;
                        int i10 = this.f1748a;
                        int i11 = w0Var.f1748a;
                        if (i10 == 0 || i11 == 0 || i10 == i11) {
                            int p10 = p();
                            if (p10 <= w0Var.p()) {
                                if (p10 <= w0Var.p()) {
                                    byte[] bArr = w0Var.f1749b;
                                    int o10 = o() + p10;
                                    int o11 = o();
                                    int o12 = w0Var.o();
                                    while (o11 < o10) {
                                        if (this.f1749b[o11] != bArr[o12]) {
                                            return false;
                                        }
                                        o11++;
                                        o12++;
                                    }
                                    return true;
                                }
                                throw new IllegalArgumentException(android.support.v4.media.a.k(p10, w0Var.p(), "Ran off end of other: 0, ", ", "));
                            }
                            int p11 = p();
                            throw new IllegalArgumentException("Length too large: " + p10 + p11);
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

    public final int hashCode() {
        int i10 = this.f1748a;
        if (i10 == 0) {
            int p10 = p();
            int o10 = o();
            byte[] bArr = x0.f1750a;
            int i11 = p10;
            for (int i12 = o10; i12 < o10 + p10; i12++) {
                i11 = (i11 * 31) + this.f1749b[i12];
            }
            if (i11 == 0) {
                i11 = 1;
            }
            this.f1748a = i11;
            return i11;
        }
        return i10;
    }

    public byte i(int i10) {
        return this.f1749b[i10];
    }

    @Override
    public final Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte n(int i10) {
        return this.f1749b[i10];
    }

    public int o() {
        return 0;
    }

    public int p() {
        return this.f1749b.length;
    }

    public void q(int i10, byte[] bArr) {
        System.arraycopy(this.f1749b, 0, bArr, 0, i10);
    }

    public final ByteArrayInputStream r() {
        return new ByteArrayInputStream(this.f1749b, o(), p());
    }

    public final String toString() {
        w0 v0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int p10 = p();
        if (p() <= 50) {
            concat = b.c(this);
        } else {
            int s6 = s(0, 47, p());
            if (s6 == 0) {
                v0Var = f1747c;
            } else {
                v0Var = new v0(this.f1749b, o(), s6);
            }
            concat = b.c(v0Var).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(p10);
        sb.append(" contents=\"");
        return android.support.v4.media.a.r(sb, concat, "\">");
    }

    public final byte[] u() {
        int p10 = p();
        if (p10 == 0) {
            return x0.f1750a;
        }
        byte[] bArr = new byte[p10];
        q(p10, bArr);
        return bArr;
    }
}

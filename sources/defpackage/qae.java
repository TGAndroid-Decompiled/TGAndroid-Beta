package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
public class qae implements Iterable, Serializable {
    public static final qae c = new qae(zce.a);
    public int a = 0;
    public final byte[] b;

    static {
        int i = b9e.a;
    }

    public qae(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int n(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    k93.i(b00.g(i, i2, "Beginning index larger than ending index: ", ", "));
                    return 0;
                }
                k93.i(b00.g(i2, i3, "End index: ", " >= "));
                return 0;
            }
            k93.i(tb4.n(i, "Beginning index: ", " < 0"));
            return 0;
        }
        return i4;
    }

    public static qae o(int i, byte[] bArr) {
        n(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new qae(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof qae) && k() == ((qae) obj).k()) {
                if (k() != 0) {
                    if (obj instanceof qae) {
                        qae qaeVar = (qae) obj;
                        int i = this.a;
                        int i2 = qaeVar.a;
                        if (i == 0 || i2 == 0 || i == i2) {
                            int k = k();
                            if (k <= qaeVar.k()) {
                                if (k <= qaeVar.k()) {
                                    byte[] bArr = qaeVar.b;
                                    int j = j() + k;
                                    int j2 = j();
                                    int j3 = qaeVar.j();
                                    while (j2 < j) {
                                        if (this.b[j2] == bArr[j3]) {
                                            j2++;
                                            j3++;
                                        }
                                    }
                                    return true;
                                }
                                w26.j(b00.g(k, qaeVar.k(), "Ran off end of other: 0, ", ", "));
                                return false;
                            }
                            haf.b(k, k());
                            return false;
                        }
                    } else {
                        return obj.equals(this);
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public byte h(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int k = k();
            int j = j();
            byte[] bArr = zce.a;
            int i2 = k;
            for (int i3 = j; i3 < j + k; i3++) {
                i2 = (i2 * 31) + this.b[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.a = i2;
            return i2;
        }
        return i;
    }

    public byte i(int i) {
        return this.b[i];
    }

    @Override
    public final Iterator iterator() {
        return new c51(this);
    }

    public int j() {
        return 0;
    }

    public int k() {
        return this.b.length;
    }

    public void l(int i, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i);
    }

    public final ByteArrayInputStream m() {
        return new ByteArrayInputStream(this.b, j(), k());
    }

    public final byte[] p() {
        int k = k();
        if (k == 0) {
            return zce.a;
        }
        byte[] bArr = new byte[k];
        l(k, bArr);
        return bArr;
    }

    public final String toString() {
        qae z9eVar;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int k = k();
        if (k() <= 50) {
            concat = d2f.a(this);
        } else {
            int n = n(0, 47, k());
            if (n == 0) {
                z9eVar = c;
            } else {
                z9eVar = new z9e(this.b, j(), n);
            }
            concat = d2f.a(z9eVar).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(k);
        sb.append(" contents=\"");
        return b00.j(sb, concat, "\">");
    }
}

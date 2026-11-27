package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
public class n51 implements Iterable, Serializable {
    public static final n51 c = new n51(pr5.b);
    public static final m51 d;
    public int a = 0;
    public final byte[] b;

    static {
        m51 fafVar;
        if (xj.a()) {
            fafVar = new uif((byte) 14);
        } else {
            fafVar = new faf((byte) 14);
        }
        d = fafVar;
    }

    public n51(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int i(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    su3.g(c00.h(i, i2, "Beginning index larger than ending index: ", ", "));
                    return 0;
                }
                su3.g(c00.h(i2, i3, "End index: ", " >= "));
                return 0;
            }
            su3.g(qd4.n(i, "Beginning index: ", " < 0"));
            return 0;
        }
        return i4;
    }

    public static n51 j(int i, int i2, byte[] bArr) {
        i(i, i + i2, bArr.length);
        return new n51(d.g(i, i2, bArr));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof n51) && size() == ((n51) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof n51) {
                        n51 n51Var = (n51) obj;
                        int i = this.a;
                        int i2 = n51Var.a;
                        if (i == 0 || i2 == 0 || i == i2) {
                            int size = size();
                            if (size <= n51Var.size()) {
                                if (size <= n51Var.size()) {
                                    byte[] bArr = n51Var.b;
                                    int l = l() + size;
                                    int l2 = l();
                                    int l3 = n51Var.l();
                                    while (l2 < l) {
                                        if (this.b[l2] == bArr[l3]) {
                                            l2++;
                                            l3++;
                                        }
                                    }
                                    return true;
                                }
                                p3d.f(n51Var.size(), uh9.m(size, "Ran off end of other: 0, ", ", "));
                                return false;
                            }
                            p3d.b(size, size());
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
            int size = size();
            int l = l();
            int i2 = size;
            for (int i3 = l; i3 < l + size; i3++) {
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

    @Override
    public final Iterator iterator() {
        return new k51(this);
    }

    public void k(int i, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i);
    }

    public int l() {
        return 0;
    }

    public byte m(int i) {
        return this.b[i];
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        n51 l51Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = yze.a(this);
        } else {
            int i = i(0, 47, size());
            if (i == 0) {
                l51Var = c;
            } else {
                l51Var = new l51(this.b, l(), i);
            }
            concat = yze.a(l51Var).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return c00.k(sb, concat, "\">");
    }
}

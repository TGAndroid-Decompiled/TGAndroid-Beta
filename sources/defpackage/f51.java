package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
public class f51 implements Iterable, Serializable {
    public static final f51 c = new f51(mp5.b);
    public static final e51 d;
    public int a = 0;
    public final byte[] b;

    static {
        e51 o5fVar;
        if (wj.a()) {
            o5fVar = new eef((byte) 14);
        } else {
            o5fVar = new o5f((byte) 14);
        }
        d = o5fVar;
    }

    public f51(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int i(int i, int i2, int i3) {
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

    public static f51 j(int i, int i2, byte[] bArr) {
        i(i, i + i2, bArr.length);
        return new f51(d.g(i, i2, bArr));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof f51) && size() == ((f51) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof f51) {
                        f51 f51Var = (f51) obj;
                        int i = this.a;
                        int i2 = f51Var.a;
                        if (i == 0 || i2 == 0 || i == i2) {
                            int size = size();
                            if (size <= f51Var.size()) {
                                if (size <= f51Var.size()) {
                                    byte[] bArr = f51Var.b;
                                    int l = l() + size;
                                    int l2 = l();
                                    int l3 = f51Var.l();
                                    while (l2 < l) {
                                        if (this.b[l2] == bArr[l3]) {
                                            l2++;
                                            l3++;
                                        }
                                    }
                                    return true;
                                }
                                fvc.e(f51Var.size(), de9.m(size, "Ran off end of other: 0, ", ", "));
                                return false;
                            }
                            haf.b(size, size());
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
        return new c51(this);
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
        f51 d51Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = gve.a(this);
        } else {
            int i = i(0, 47, size());
            if (i == 0) {
                d51Var = c;
            } else {
                d51Var = new d51(this.b, l(), i);
            }
            concat = gve.a(d51Var).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return b00.j(sb, concat, "\">");
    }
}

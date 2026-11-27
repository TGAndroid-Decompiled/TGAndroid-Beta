package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
public class jne implements Serializable, Iterable {
    public static final jne c = new jne(xse.b);
    public static final fme d;
    public int a = 0;
    public final byte[] b;

    static {
        yad yadVar;
        if (aje.a()) {
            yadVar = new yad((byte) 3);
        } else {
            yadVar = new Object();
        }
        d = yadVar;
    }

    public jne(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static jne j(int i, int i2, byte[] bArr) {
        l(i, i + i2, bArr.length);
        return new jne(d.a(i, i2, bArr));
    }

    public static int l(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    StringBuilder sb = new StringBuilder(66);
                    sb.append("Beginning index larger than ending index: ");
                    sb.append(i);
                    sb.append(", ");
                    sb.append(i2);
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("End index: ");
                sb2.append(i2);
                sb2.append(" >= ");
                sb2.append(i3);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(32);
            sb3.append("Beginning index: ");
            sb3.append(i);
            sb3.append(" < 0");
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof jne) && i() == ((jne) obj).i()) {
                if (i() != 0) {
                    if (obj instanceof jne) {
                        jne jneVar = (jne) obj;
                        int i = this.a;
                        int i2 = jneVar.a;
                        if (i == 0 || i2 == 0 || i == i2) {
                            int i3 = i();
                            if (i3 <= jneVar.i()) {
                                if (i3 <= jneVar.i()) {
                                    byte[] bArr = jneVar.b;
                                    int m = m() + i3;
                                    int m2 = m();
                                    int m3 = jneVar.m();
                                    while (m2 < m) {
                                        if (this.b[m2] != bArr[m3]) {
                                            return false;
                                        }
                                        m2++;
                                        m3++;
                                    }
                                    return true;
                                }
                                int i4 = jneVar.i();
                                StringBuilder sb = new StringBuilder(59);
                                sb.append("Ran off end of other: 0, ");
                                sb.append(i3);
                                sb.append(", ");
                                sb.append(i4);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            int i5 = i();
                            StringBuilder sb2 = new StringBuilder(40);
                            sb2.append("Length too large: ");
                            sb2.append(i3);
                            sb2.append(i5);
                            throw new IllegalArgumentException(sb2.toString());
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

    public byte h(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int i2 = i();
            int m = m();
            int i3 = i2;
            for (int i4 = m; i4 < m + i2; i4++) {
                i3 = (i3 * 31) + this.b[i4];
            }
            if (i3 == 0) {
                i3 = 1;
            }
            this.a = i3;
            return i3;
        }
        return i;
    }

    public int i() {
        return this.b.length;
    }

    @Override
    public final Iterator iterator() {
        return new k51(this);
    }

    public byte k(int i) {
        return this.b[i];
    }

    public int m() {
        return 0;
    }

    public final String toString() {
        jne qleVar;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i = i();
        if (i() <= 50) {
            concat = w7f.a(this);
        } else {
            int l = l(0, 47, i());
            if (l == 0) {
                qleVar = c;
            } else {
                qleVar = new qle(this.b, m(), l);
            }
            concat = w7f.a(qleVar).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(i);
        sb.append(" contents=\"");
        return c00.k(sb, concat, "\">");
    }
}

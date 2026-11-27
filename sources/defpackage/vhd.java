package defpackage;

import java.io.Serializable;
import java.util.Iterator;
public final class vhd implements Serializable, Iterable {
    public static final vhd c = new vhd(vnd.b);
    public static final ihd d;
    public int a = 0;
    public final byte[] b;

    static {
        ?? r0;
        if (cfd.a()) {
            r0 = new Object();
        } else {
            r0 = new Object();
        }
        d = r0;
    }

    public vhd(byte[] bArr) {
        this.b = bArr;
    }

    public static vhd i(int i, int i2, byte[] bArr) {
        return new vhd(d.c(i, i2, bArr));
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof vhd) && size() == ((vhd) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof vhd) {
                        vhd vhdVar = (vhd) obj;
                        int i = this.a;
                        int i2 = vhdVar.a;
                        if (i == 0 || i2 == 0 || i == i2) {
                            int size = size();
                            if (size <= vhdVar.size()) {
                                if (size <= vhdVar.size()) {
                                    byte[] bArr = vhdVar.b;
                                    int h = h() + size;
                                    int h2 = h();
                                    int h3 = vhdVar.h();
                                    while (h2 < h) {
                                        if (this.b[h2] != bArr[h3]) {
                                            return false;
                                        }
                                        h2++;
                                        h3++;
                                    }
                                    return true;
                                }
                                int size2 = vhdVar.size();
                                StringBuilder sb = new StringBuilder(59);
                                sb.append("Ran off end of other: 0, ");
                                sb.append(size);
                                sb.append(", ");
                                sb.append(size2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                            int size3 = size();
                            StringBuilder sb2 = new StringBuilder(40);
                            sb2.append("Length too large: ");
                            sb2.append(size);
                            sb2.append(size3);
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

    public final int h() {
        return 0;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int size = size();
            int h = h();
            int i2 = size;
            for (int i3 = h; i3 < h + size; i3++) {
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

    public final byte j(int i) {
        return this.b[i];
    }

    public final int size() {
        return this.b.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}

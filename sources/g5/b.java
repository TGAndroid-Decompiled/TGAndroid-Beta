package g5;

import f5.d0;
import java.util.Arrays;
public final class b implements j3.g {
    public static final String f7024f;
    public static final String h;
    public static final String f7025n;
    public static final String f7026r;
    public static final eg.c f7027s;
    public final int f7028a;
    public final int f7029b;
    public final int f7030c;
    public final byte[] d;
    public int f7031e;

    static {
        int i10 = d0.f6579a;
        f7024f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f7025n = Integer.toString(2, 36);
        f7026r = Integer.toString(3, 36);
        f7027s = new eg.c(13);
    }

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f7028a = i10;
        this.f7029b = i11;
        this.f7030c = i12;
        this.d = bArr;
    }

    public static int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 9) {
            return 6;
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            return -1;
        }
        return 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f7028a == bVar.f7028a && this.f7029b == bVar.f7029b && this.f7030c == bVar.f7030c && Arrays.equals(this.d, bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f7031e == 0) {
            this.f7031e = Arrays.hashCode(this.d) + ((((((527 + this.f7028a) * 31) + this.f7029b) * 31) + this.f7030c) * 31);
        }
        return this.f7031e;
    }

    public final String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f7028a);
        sb2.append(", ");
        sb2.append(this.f7029b);
        sb2.append(", ");
        sb2.append(this.f7030c);
        sb2.append(", ");
        if (this.d != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        sb2.append(z10);
        sb2.append(")");
        return sb2.toString();
    }
}

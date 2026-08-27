package e5;

import d5.g0;
import java.util.Arrays;

public final class b implements h3.g {

    public static final String f5227f;
    public static final String h;

    public static final String f5228n;

    public static final String f5229r;

    public static final a9.m f5230s;

    public final int f5231a;

    public final int f5232b;

    public final int f5233c;
    public final byte[] d;

    public int f5234e;

    static {
        int i10 = g0.f4795a;
        f5227f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f5228n = Integer.toString(2, 36);
        f5229r = Integer.toString(3, 36);
        f5230s = new a9.m(27);
    }

    public b(int i10, int i11, int i12, byte[] bArr) {
        this.f5231a = i10;
        this.f5232b = i11;
        this.f5233c = i12;
        this.d = bArr;
    }

    public static int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f5231a == bVar.f5231a && this.f5232b == bVar.f5232b && this.f5233c == bVar.f5233c && Arrays.equals(this.d, bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f5234e == 0) {
            this.f5234e = Arrays.hashCode(this.d) + ((((((527 + this.f5231a) * 31) + this.f5232b) * 31) + this.f5233c) * 31);
        }
        return this.f5234e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f5231a);
        sb2.append(", ");
        sb2.append(this.f5232b);
        sb2.append(", ");
        sb2.append(this.f5233c);
        sb2.append(", ");
        sb2.append(this.d != null);
        sb2.append(")");
        return sb2.toString();
    }
}

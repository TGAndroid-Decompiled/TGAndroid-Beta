package e5;

import d5.f0;
import java.util.Arrays;
public final class b implements h3.g {
    public static final String f4868f;
    public static final String h;
    public static final String f4869n;
    public static final String f4870r;
    public static final a9.b f4871s;
    public final int f4872a;
    public final int f4873b;
    public final int f4874c;
    public final byte[] d;
    public int f4875e;

    static {
        int i9 = f0.f4349a;
        f4868f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f4869n = Integer.toString(2, 36);
        f4870r = Integer.toString(3, 36);
        f4871s = new a9.b(21);
    }

    public b(int i9, int i10, int i11, byte[] bArr) {
        this.f4872a = i9;
        this.f4873b = i10;
        this.f4874c = i11;
        this.d = bArr;
    }

    public static int a(int i9) {
        if (i9 == 1) {
            return 1;
        }
        if (i9 == 9) {
            return 6;
        }
        if (i9 != 4 && i9 != 5 && i9 != 6 && i9 != 7) {
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
            if (this.f4872a == bVar.f4872a && this.f4873b == bVar.f4873b && this.f4874c == bVar.f4874c && Arrays.equals(this.d, bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f4875e == 0) {
            this.f4875e = Arrays.hashCode(this.d) + ((((((527 + this.f4872a) * 31) + this.f4873b) * 31) + this.f4874c) * 31);
        }
        return this.f4875e;
    }

    public final String toString() {
        boolean z10;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f4872a);
        sb2.append(", ");
        sb2.append(this.f4873b);
        sb2.append(", ");
        sb2.append(this.f4874c);
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

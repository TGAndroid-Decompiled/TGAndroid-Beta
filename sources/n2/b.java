package n2;

import j$.util.Objects;
public final class b {
    public final String f14216a;
    public final byte[] f14217b;
    public final int f14218c;

    public b(String str) {
        this.f14216a = str;
        this.f14217b = null;
        this.f14218c = 0;
    }

    public final void a(int i10) {
        String str;
        int i11 = this.f14218c;
        if (i10 == i11) {
            return;
        }
        StringBuilder sb = new StringBuilder("Wrong data accessor type detected. ");
        String str2 = "String";
        if (i11 == 0) {
            str = "String";
        } else if (i11 == 1) {
            str = "ArrayBuffer";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" expected, but got ");
        if (i10 != 0) {
            if (i10 == 1) {
                str2 = "ArrayBuffer";
            } else {
                str2 = "Unknown";
            }
        }
        sb.append(str2);
        throw new IllegalStateException(sb.toString());
    }

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f14217b = bArr;
        this.f14216a = null;
        this.f14218c = 1;
    }
}

package n2;

import j$.util.Objects;
public final class b {
    public final String f17091a;
    public final byte[] f17092b;
    public final int f17093c;

    public b(String str) {
        this.f17091a = str;
        this.f17092b = null;
        this.f17093c = 0;
    }

    public final void a(int i10) {
        String str;
        int i11 = this.f17093c;
        if (i10 == i11) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Wrong data accessor type detected. ");
        String str2 = "String";
        if (i11 == 0) {
            str = "String";
        } else if (i11 == 1) {
            str = "ArrayBuffer";
        } else {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append(" expected, but got ");
        if (i10 != 0) {
            if (i10 == 1) {
                str2 = "ArrayBuffer";
            } else {
                str2 = "Unknown";
            }
        }
        sb2.append(str2);
        throw new IllegalStateException(sb2.toString());
    }

    public b(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f17092b = bArr;
        this.f17091a = null;
        this.f17093c = 1;
    }
}

package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class cc8 implements lf7 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public cc8(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static cc8 d(yw7 yw7Var) {
        int m = yw7Var.m();
        String n = wf7.n(yw7Var.y(yw7Var.m(), StandardCharsets.US_ASCII));
        String y = yw7Var.y(yw7Var.m(), StandardCharsets.UTF_8);
        int m2 = yw7Var.m();
        int m3 = yw7Var.m();
        int m4 = yw7Var.m();
        int m5 = yw7Var.m();
        int m6 = yw7Var.m();
        byte[] bArr = new byte[m6];
        yw7Var.k(0, m6, bArr);
        return new cc8(m, n, y, m2, m3, m4, m5, bArr);
    }

    @Override
    public final go4 a() {
        return null;
    }

    @Override
    public final void b(ht6 ht6Var) {
        ht6Var.a(this.a, this.h);
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && cc8.class == obj.getClass()) {
                cc8 cc8Var = (cc8) obj;
                if (this.a == cc8Var.a && this.b.equals(cc8Var.b) && this.c.equals(cc8Var.c) && this.d == cc8Var.d && this.e == cc8Var.e && this.f == cc8Var.f && this.g == cc8Var.g && Arrays.equals(this.h, cc8Var.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((ts2.j(ts2.j((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}

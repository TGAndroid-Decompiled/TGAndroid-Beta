package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class ba8 implements jd7 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public ba8(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static ba8 d(xu7 xu7Var) {
        int m = xu7Var.m();
        String n = ud7.n(xu7Var.y(xu7Var.m(), StandardCharsets.US_ASCII));
        String y = xu7Var.y(xu7Var.m(), StandardCharsets.UTF_8);
        int m2 = xu7Var.m();
        int m3 = xu7Var.m();
        int m4 = xu7Var.m();
        int m5 = xu7Var.m();
        int m6 = xu7Var.m();
        byte[] bArr = new byte[m6];
        xu7Var.k(0, m6, bArr);
        return new ba8(m, n, y, m2, m3, m4, m5, bArr);
    }

    @Override
    public final fm4 a() {
        return null;
    }

    @Override
    public final void b(hr6 hr6Var) {
        hr6Var.a(this.a, this.h);
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ba8.class == obj.getClass()) {
                ba8 ba8Var = (ba8) obj;
                if (this.a == ba8Var.a && this.b.equals(ba8Var.b) && this.c.equals(ba8Var.c) && this.d == ba8Var.d && this.e == ba8Var.e && this.f == ba8Var.f && this.g == ba8Var.g && Arrays.equals(this.h, ba8Var.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((ir2.j(ir2.j((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}

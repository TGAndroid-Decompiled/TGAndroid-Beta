package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class rd8 implements tf7 {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final byte[] h;

    public rd8(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = bArr;
    }

    public static rd8 d(ey7 ey7Var) {
        int m = ey7Var.m();
        String n = eg7.n(ey7Var.y(ey7Var.m(), StandardCharsets.US_ASCII));
        String y = ey7Var.y(ey7Var.m(), StandardCharsets.UTF_8);
        int m2 = ey7Var.m();
        int m3 = ey7Var.m();
        int m4 = ey7Var.m();
        int m5 = ey7Var.m();
        int m6 = ey7Var.m();
        byte[] bArr = new byte[m6];
        ey7Var.k(0, m6, bArr);
        return new rd8(m, n, y, m2, m3, m4, m5, bArr);
    }

    @Override
    public final ko4 a() {
        return null;
    }

    @Override
    public final void b(lt6 lt6Var) {
        lt6Var.a(this.a, this.h);
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && rd8.class == obj.getClass()) {
                rd8 rd8Var = (rd8) obj;
                if (this.a == rd8Var.a && this.b.equals(rd8Var.b) && this.c.equals(rd8Var.c) && this.d == rd8Var.d && this.e == rd8Var.e && this.f == rd8Var.f && this.g == rd8Var.g && Arrays.equals(this.h, rd8Var.h)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((bs2.j(bs2.j((527 + this.a) * 31, 31, this.b), 31, this.c) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.b + ", description=" + this.c;
    }
}

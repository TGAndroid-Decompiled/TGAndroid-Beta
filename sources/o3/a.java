package o3;

import a1.g;
import b2.q0;
import b2.s0;
import b2.v0;
import b2.w;
import e2.x;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class a implements s0 {
    public final int f17678a;
    public final String f17679b;
    public final String f17680c;
    public final int d;
    public final int e;
    public final int f17681f;
    public final int f17682g;
    public final byte[] h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f17678a = i10;
        this.f17679b = str;
        this.f17680c = str2;
        this.d = i11;
        this.e = i12;
        this.f17681f = i13;
        this.f17682g = i14;
        this.h = bArr;
    }

    public static a d(x xVar) {
        int m10 = xVar.m();
        String n10 = v0.n(xVar.y(xVar.m(), StandardCharsets.US_ASCII));
        String y3 = xVar.y(xVar.m(), StandardCharsets.UTF_8);
        int m11 = xVar.m();
        int m12 = xVar.m();
        int m13 = xVar.m();
        int m14 = xVar.m();
        int m15 = xVar.m();
        byte[] bArr = new byte[m15];
        xVar.k(0, m15, bArr);
        return new a(m10, n10, y3, m11, m12, m13, m14, bArr);
    }

    @Override
    public final w a() {
        return null;
    }

    @Override
    public final void b(q0 q0Var) {
        q0Var.a(this.f17678a, this.h);
    }

    @Override
    public final byte[] c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f17678a == aVar.f17678a && this.f17679b.equals(aVar.f17679b) && this.f17680c.equals(aVar.f17680c) && this.d == aVar.d && this.e == aVar.e && this.f17681f == aVar.f17681f && this.f17682g == aVar.f17682g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((g.g(g.g((527 + this.f17678a) * 31, 31, this.f17679b), 31, this.f17680c) + this.d) * 31) + this.e) * 31) + this.f17681f) * 31) + this.f17682g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f17679b + ", description=" + this.f17680c;
    }
}

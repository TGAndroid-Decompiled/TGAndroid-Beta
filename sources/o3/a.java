package o3;

import a1.g;
import b2.m0;
import b2.o0;
import b2.r0;
import b2.s;
import e2.v;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class a implements o0 {
    public final int f17112a;
    public final String f17113b;
    public final String f17114c;
    public final int d;
    public final int f17115e;
    public final int f17116f;
    public final int f17117g;
    public final byte[] h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f17112a = i10;
        this.f17113b = str;
        this.f17114c = str2;
        this.d = i11;
        this.f17115e = i12;
        this.f17116f = i13;
        this.f17117g = i14;
        this.h = bArr;
    }

    public static a d(v vVar) {
        int j3 = vVar.j();
        String n10 = r0.n(vVar.v(vVar.j(), StandardCharsets.US_ASCII));
        String v = vVar.v(vVar.j(), StandardCharsets.UTF_8);
        int j10 = vVar.j();
        int j11 = vVar.j();
        int j12 = vVar.j();
        int j13 = vVar.j();
        int j14 = vVar.j();
        byte[] bArr = new byte[j14];
        vVar.h(0, j14, bArr);
        return new a(j3, n10, v, j10, j11, j12, j13, bArr);
    }

    @Override
    public final s a() {
        return null;
    }

    @Override
    public final void b(m0 m0Var) {
        m0Var.a(this.f17112a, this.h);
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
            if (this.f17112a == aVar.f17112a && this.f17113b.equals(aVar.f17113b) && this.f17114c.equals(aVar.f17114c) && this.d == aVar.d && this.f17115e == aVar.f17115e && this.f17116f == aVar.f17116f && this.f17117g == aVar.f17117g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((g.h(g.h((527 + this.f17112a) * 31, 31, this.f17113b), 31, this.f17114c) + this.d) * 31) + this.f17115e) * 31) + this.f17116f) * 31) + this.f17117g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f17113b + ", description=" + this.f17114c;
    }
}

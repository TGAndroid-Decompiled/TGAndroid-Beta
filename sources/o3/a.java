package o3;

import b2.m0;
import b2.o0;
import b2.r0;
import b2.s;
import e2.v;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class a implements o0 {
    public final int f14249a;
    public final String f14250b;
    public final String f14251c;
    public final int d;
    public final int e;
    public final int f14252f;
    public final int f14253g;
    public final byte[] h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f14249a = i10;
        this.f14250b = str;
        this.f14251c = str2;
        this.d = i11;
        this.e = i12;
        this.f14252f = i13;
        this.f14253g = i14;
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
        m0Var.a(this.f14249a, this.h);
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
            if (this.f14249a == aVar.f14249a && this.f14250b.equals(aVar.f14250b) && this.f14251c.equals(aVar.f14251c) && this.d == aVar.d && this.e == aVar.e && this.f14252f == aVar.f14252f && this.f14253g == aVar.f14253g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((a4.a.h(a4.a.h((527 + this.f14249a) * 31, 31, this.f14250b), 31, this.f14251c) + this.d) * 31) + this.e) * 31) + this.f14252f) * 31) + this.f14253g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f14250b + ", description=" + this.f14251c;
    }
}

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
    public final int f17066a;
    public final String f17067b;
    public final String f17068c;
    public final int d;
    public final int f17069e;
    public final int f17070f;
    public final int f17071g;
    public final byte[] h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f17066a = i10;
        this.f17067b = str;
        this.f17068c = str2;
        this.d = i11;
        this.f17069e = i12;
        this.f17070f = i13;
        this.f17071g = i14;
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
        m0Var.a(this.f17066a, this.h);
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
            if (this.f17066a == aVar.f17066a && this.f17067b.equals(aVar.f17067b) && this.f17068c.equals(aVar.f17068c) && this.d == aVar.d && this.f17069e == aVar.f17069e && this.f17070f == aVar.f17070f && this.f17071g == aVar.f17071g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((g.h(g.h((527 + this.f17066a) * 31, 31, this.f17067b), 31, this.f17068c) + this.d) * 31) + this.f17069e) * 31) + this.f17070f) * 31) + this.f17071g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f17067b + ", description=" + this.f17068c;
    }
}

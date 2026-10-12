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
    public final int f16814a;
    public final String f16815b;
    public final String f16816c;
    public final int d;
    public final int f16817e;
    public final int f16818f;
    public final int f16819g;
    public final byte[] h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f16814a = i10;
        this.f16815b = str;
        this.f16816c = str2;
        this.d = i11;
        this.f16817e = i12;
        this.f16818f = i13;
        this.f16819g = i14;
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
        m0Var.a(this.f16814a, this.h);
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
            if (this.f16814a == aVar.f16814a && this.f16815b.equals(aVar.f16815b) && this.f16816c.equals(aVar.f16816c) && this.d == aVar.d && this.f16817e == aVar.f16817e && this.f16818f == aVar.f16818f && this.f16819g == aVar.f16819g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((g.h(g.h((527 + this.f16814a) * 31, 31, this.f16815b), 31, this.f16816c) + this.d) * 31) + this.f16817e) * 31) + this.f16818f) * 31) + this.f16819g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f16815b + ", description=" + this.f16816c;
    }
}

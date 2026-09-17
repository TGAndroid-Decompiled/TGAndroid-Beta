package o3;

import b2.m0;
import b2.o0;
import b2.r0;
import b2.s;
import e2.v;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class a implements o0 {
    public final int f16976a;
    public final String f16977b;
    public final String f16978c;
    public final int d;
    public final int f16979e;
    public final int f16980f;
    public final int f16981g;
    public final byte[] h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f16976a = i10;
        this.f16977b = str;
        this.f16978c = str2;
        this.d = i11;
        this.f16979e = i12;
        this.f16980f = i13;
        this.f16981g = i14;
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
        m0Var.a(this.f16976a, this.h);
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
            if (this.f16976a == aVar.f16976a && this.f16977b.equals(aVar.f16977b) && this.f16978c.equals(aVar.f16978c) && this.d == aVar.d && this.f16979e == aVar.f16979e && this.f16980f == aVar.f16980f && this.f16981g == aVar.f16981g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((a4.a.h(a4.a.h((527 + this.f16976a) * 31, 31, this.f16977b), 31, this.f16978c) + this.d) * 31) + this.f16979e) * 31) + this.f16980f) * 31) + this.f16981g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f16977b + ", description=" + this.f16978c;
    }
}

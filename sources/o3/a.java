package o3;

import b2.m0;
import b2.o0;
import b2.r0;
import b2.s;
import e2.v;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class a implements o0 {
    public final int f17109a;
    public final String f17110b;
    public final String f17111c;
    public final int d;
    public final int f17112e;
    public final int f17113f;
    public final int f17114g;
    public final byte[] h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f17109a = i10;
        this.f17110b = str;
        this.f17111c = str2;
        this.d = i11;
        this.f17112e = i12;
        this.f17113f = i13;
        this.f17114g = i14;
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
        m0Var.a(this.f17109a, this.h);
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
            if (this.f17109a == aVar.f17109a && this.f17110b.equals(aVar.f17110b) && this.f17111c.equals(aVar.f17111c) && this.d == aVar.d && this.f17112e == aVar.f17112e && this.f17113f == aVar.f17113f && this.f17114g == aVar.f17114g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((a4.a.h(a4.a.h((527 + this.f17109a) * 31, 31, this.f17110b), 31, this.f17111c) + this.d) * 31) + this.f17112e) * 31) + this.f17113f) * 31) + this.f17114g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f17110b + ", description=" + this.f17111c;
    }
}

package o3;

import a1.g;
import b2.r0;
import b2.t0;
import b2.w0;
import e2.x;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class a implements t0 {
    public final int f19086a;
    public final String f19087b;
    public final String f19088c;
    public final int d;
    public final int e;
    public final int f19089f;
    public final int f19090g;
    public final byte[] h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f19086a = i10;
        this.f19087b = str;
        this.f19088c = str2;
        this.d = i11;
        this.e = i12;
        this.f19089f = i13;
        this.f19090g = i14;
        this.h = bArr;
    }

    public static a d(x xVar) {
        int m10 = xVar.m();
        String n10 = w0.n(xVar.y(xVar.m(), StandardCharsets.US_ASCII));
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
    public final b2.x a() {
        return null;
    }

    @Override
    public final void b(r0 r0Var) {
        r0Var.a(this.f19086a, this.h);
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
            if (this.f19086a == aVar.f19086a && this.f19087b.equals(aVar.f19087b) && this.f19088c.equals(aVar.f19088c) && this.d == aVar.d && this.e == aVar.e && this.f19089f == aVar.f19089f && this.f19090g == aVar.f19090g && Arrays.equals(this.h, aVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.h) + ((((((((g.f(g.f((527 + this.f19086a) * 31, 31, this.f19087b), 31, this.f19088c) + this.d) * 31) + this.e) * 31) + this.f19089f) * 31) + this.f19090g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f19087b + ", description=" + this.f19088c;
    }
}

package cc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f2278j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f2279k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f2280l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f2281m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f2282a;
    public final double f2283b;
    public final double f2284c;
    public final double d;
    public final double e;
    public final double f2285f;
    public final double f2286g;
    public final double h;
    public final double f2287i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f2282a = d13;
        this.f2283b = d14;
        this.f2284c = d15;
        this.d = d;
        this.e = d10;
        this.f2285f = d11;
        this.f2286g = d12;
        this.h = d16;
        this.f2287i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = r2.b.f(byteBuffer);
        double f11 = r2.b.f(byteBuffer);
        double e = r2.b.e(byteBuffer);
        return new d(f10, f11, r2.b.f(byteBuffer), r2.b.f(byteBuffer), e, r2.b.e(byteBuffer), r2.b.e(byteBuffer), r2.b.f(byteBuffer), r2.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        r2.b.n(byteBuffer, this.d);
        r2.b.n(byteBuffer, this.e);
        r2.b.m(byteBuffer, this.f2282a);
        r2.b.n(byteBuffer, this.f2285f);
        r2.b.n(byteBuffer, this.f2286g);
        r2.b.m(byteBuffer, this.f2283b);
        r2.b.n(byteBuffer, this.h);
        r2.b.n(byteBuffer, this.f2287i);
        r2.b.m(byteBuffer, this.f2284c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f2285f, this.f2285f) == 0 && Double.compare(dVar.f2286g, this.f2286g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f2287i, this.f2287i) == 0 && Double.compare(dVar.f2282a, this.f2282a) == 0 && Double.compare(dVar.f2283b, this.f2283b) == 0 && Double.compare(dVar.f2284c, this.f2284c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f2282a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f2283b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f2284c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f2285f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f2286g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f2287i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f2278j)) {
            return "Rotate 0°";
        }
        if (equals(f2279k)) {
            return "Rotate 90°";
        }
        if (equals(f2280l)) {
            return "Rotate 180°";
        }
        if (equals(f2281m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f2282a + ", v=" + this.f2283b + ", w=" + this.f2284c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f2285f + ", d=" + this.f2286g + ", tx=" + this.h + ", ty=" + this.f2287i + '}';
    }
}

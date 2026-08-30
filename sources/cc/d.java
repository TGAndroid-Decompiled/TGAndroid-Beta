package cc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f2255j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f2256k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f2257l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f2258m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f2259a;
    public final double f2260b;
    public final double f2261c;
    public final double d;
    public final double e;
    public final double f2262f;
    public final double f2263g;
    public final double h;
    public final double f2264i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f2259a = d13;
        this.f2260b = d14;
        this.f2261c = d15;
        this.d = d;
        this.e = d10;
        this.f2262f = d11;
        this.f2263g = d12;
        this.h = d16;
        this.f2264i = d17;
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
        r2.b.m(byteBuffer, this.f2259a);
        r2.b.n(byteBuffer, this.f2262f);
        r2.b.n(byteBuffer, this.f2263g);
        r2.b.m(byteBuffer, this.f2260b);
        r2.b.n(byteBuffer, this.h);
        r2.b.n(byteBuffer, this.f2264i);
        r2.b.m(byteBuffer, this.f2261c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f2262f, this.f2262f) == 0 && Double.compare(dVar.f2263g, this.f2263g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f2264i, this.f2264i) == 0 && Double.compare(dVar.f2259a, this.f2259a) == 0 && Double.compare(dVar.f2260b, this.f2260b) == 0 && Double.compare(dVar.f2261c, this.f2261c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f2259a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f2260b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f2261c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f2262f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f2263g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f2264i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f2255j)) {
            return "Rotate 0°";
        }
        if (equals(f2256k)) {
            return "Rotate 90°";
        }
        if (equals(f2257l)) {
            return "Rotate 180°";
        }
        if (equals(f2258m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f2259a + ", v=" + this.f2260b + ", w=" + this.f2261c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f2262f + ", d=" + this.f2263g + ", tx=" + this.h + ", ty=" + this.f2264i + '}';
    }
}

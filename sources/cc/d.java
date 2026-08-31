package cc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f2448j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f2449k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f2450l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f2451m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f2452a;
    public final double f2453b;
    public final double f2454c;
    public final double d;
    public final double f2455e;
    public final double f2456f;
    public final double f2457g;
    public final double h;
    public final double f2458i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f2452a = d13;
        this.f2453b = d14;
        this.f2454c = d15;
        this.d = d;
        this.f2455e = d10;
        this.f2456f = d11;
        this.f2457g = d12;
        this.h = d16;
        this.f2458i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = r2.b.f(byteBuffer);
        double f11 = r2.b.f(byteBuffer);
        double e6 = r2.b.e(byteBuffer);
        return new d(f10, f11, r2.b.f(byteBuffer), r2.b.f(byteBuffer), e6, r2.b.e(byteBuffer), r2.b.e(byteBuffer), r2.b.f(byteBuffer), r2.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        r2.b.n(byteBuffer, this.d);
        r2.b.n(byteBuffer, this.f2455e);
        r2.b.m(byteBuffer, this.f2452a);
        r2.b.n(byteBuffer, this.f2456f);
        r2.b.n(byteBuffer, this.f2457g);
        r2.b.m(byteBuffer, this.f2453b);
        r2.b.n(byteBuffer, this.h);
        r2.b.n(byteBuffer, this.f2458i);
        r2.b.m(byteBuffer, this.f2454c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f2455e, this.f2455e) == 0 && Double.compare(dVar.f2456f, this.f2456f) == 0 && Double.compare(dVar.f2457g, this.f2457g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f2458i, this.f2458i) == 0 && Double.compare(dVar.f2452a, this.f2452a) == 0 && Double.compare(dVar.f2453b, this.f2453b) == 0 && Double.compare(dVar.f2454c, this.f2454c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f2452a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f2453b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f2454c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f2455e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f2456f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f2457g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f2458i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f2448j)) {
            return "Rotate 0°";
        }
        if (equals(f2449k)) {
            return "Rotate 90°";
        }
        if (equals(f2450l)) {
            return "Rotate 180°";
        }
        if (equals(f2451m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f2452a + ", v=" + this.f2453b + ", w=" + this.f2454c + ", a=" + this.d + ", b=" + this.f2455e + ", c=" + this.f2456f + ", d=" + this.f2457g + ", tx=" + this.h + ", ty=" + this.f2458i + '}';
    }
}

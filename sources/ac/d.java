package ac;

import java.nio.ByteBuffer;
public final class d {
    public static final d f352j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f353k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f354l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f355m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f356a;
    public final double f357b;
    public final double f358c;
    public final double d;
    public final double f359e;
    public final double f360f;
    public final double f361g;
    public final double h;
    public final double f362i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f356a = d13;
        this.f357b = d14;
        this.f358c = d15;
        this.d = d;
        this.f359e = d10;
        this.f360f = d11;
        this.f361g = d12;
        this.h = d16;
        this.f362i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f9 = r2.b.f(byteBuffer);
        double f10 = r2.b.f(byteBuffer);
        double e10 = r2.b.e(byteBuffer);
        return new d(f9, f10, r2.b.f(byteBuffer), r2.b.f(byteBuffer), e10, r2.b.e(byteBuffer), r2.b.e(byteBuffer), r2.b.f(byteBuffer), r2.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        r2.b.n(byteBuffer, this.d);
        r2.b.n(byteBuffer, this.f359e);
        r2.b.m(byteBuffer, this.f356a);
        r2.b.n(byteBuffer, this.f360f);
        r2.b.n(byteBuffer, this.f361g);
        r2.b.m(byteBuffer, this.f357b);
        r2.b.n(byteBuffer, this.h);
        r2.b.n(byteBuffer, this.f362i);
        r2.b.m(byteBuffer, this.f358c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f359e, this.f359e) == 0 && Double.compare(dVar.f360f, this.f360f) == 0 && Double.compare(dVar.f361g, this.f361g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f362i, this.f362i) == 0 && Double.compare(dVar.f356a, this.f356a) == 0 && Double.compare(dVar.f357b, this.f357b) == 0 && Double.compare(dVar.f358c, this.f358c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f356a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f357b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f358c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f359e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f360f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f361g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f362i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f352j)) {
            return "Rotate 0°";
        }
        if (equals(f353k)) {
            return "Rotate 90°";
        }
        if (equals(f354l)) {
            return "Rotate 180°";
        }
        if (equals(f355m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f356a + ", v=" + this.f357b + ", w=" + this.f358c + ", a=" + this.d + ", b=" + this.f359e + ", c=" + this.f360f + ", d=" + this.f361g + ", tx=" + this.h + ", ty=" + this.f362i + '}';
    }
}

package jc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f9816j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f9817k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f9818l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f9819m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f9820a;
    public final double f9821b;
    public final double f9822c;
    public final double d;
    public final double e;
    public final double f9823f;
    public final double f9824g;
    public final double h;
    public final double f9825i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f9820a = d13;
        this.f9821b = d14;
        this.f9822c = d15;
        this.d = d;
        this.e = d10;
        this.f9823f = d11;
        this.f9824g = d12;
        this.h = d16;
        this.f9825i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f7 = e5.b.f(byteBuffer);
        double f10 = e5.b.f(byteBuffer);
        double e = e5.b.e(byteBuffer);
        return new d(f7, f10, e5.b.f(byteBuffer), e5.b.f(byteBuffer), e, e5.b.e(byteBuffer), e5.b.e(byteBuffer), e5.b.f(byteBuffer), e5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        e5.b.n(byteBuffer, this.d);
        e5.b.n(byteBuffer, this.e);
        e5.b.m(byteBuffer, this.f9820a);
        e5.b.n(byteBuffer, this.f9823f);
        e5.b.n(byteBuffer, this.f9824g);
        e5.b.m(byteBuffer, this.f9821b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f9825i);
        e5.b.m(byteBuffer, this.f9822c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f9823f, this.f9823f) == 0 && Double.compare(dVar.f9824g, this.f9824g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f9825i, this.f9825i) == 0 && Double.compare(dVar.f9820a, this.f9820a) == 0 && Double.compare(dVar.f9821b, this.f9821b) == 0 && Double.compare(dVar.f9822c, this.f9822c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f9820a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f9821b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f9822c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f9823f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f9824g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f9825i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f9816j)) {
            return "Rotate 0°";
        }
        if (equals(f9817k)) {
            return "Rotate 90°";
        }
        if (equals(f9818l)) {
            return "Rotate 180°";
        }
        if (equals(f9819m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f9820a + ", v=" + this.f9821b + ", w=" + this.f9822c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f9823f + ", d=" + this.f9824g + ", tx=" + this.h + ", ty=" + this.f9825i + '}';
    }
}

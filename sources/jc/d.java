package jc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f9815j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f9816k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f9817l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f9818m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f9819a;
    public final double f9820b;
    public final double f9821c;
    public final double d;
    public final double e;
    public final double f9822f;
    public final double f9823g;
    public final double h;
    public final double f9824i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f9819a = d13;
        this.f9820b = d14;
        this.f9821c = d15;
        this.d = d;
        this.e = d10;
        this.f9822f = d11;
        this.f9823g = d12;
        this.h = d16;
        this.f9824i = d17;
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
        e5.b.m(byteBuffer, this.f9819a);
        e5.b.n(byteBuffer, this.f9822f);
        e5.b.n(byteBuffer, this.f9823g);
        e5.b.m(byteBuffer, this.f9820b);
        e5.b.n(byteBuffer, this.h);
        e5.b.n(byteBuffer, this.f9824i);
        e5.b.m(byteBuffer, this.f9821c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.e, this.e) == 0 && Double.compare(dVar.f9822f, this.f9822f) == 0 && Double.compare(dVar.f9823g, this.f9823g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f9824i, this.f9824i) == 0 && Double.compare(dVar.f9819a, this.f9819a) == 0 && Double.compare(dVar.f9820b, this.f9820b) == 0 && Double.compare(dVar.f9821c, this.f9821c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f9819a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f9820b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f9821c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f9822f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f9823g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f9824i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f9815j)) {
            return "Rotate 0°";
        }
        if (equals(f9816k)) {
            return "Rotate 90°";
        }
        if (equals(f9817l)) {
            return "Rotate 180°";
        }
        if (equals(f9818m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f9819a + ", v=" + this.f9820b + ", w=" + this.f9821c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f9822f + ", d=" + this.f9823g + ", tx=" + this.h + ", ty=" + this.f9824i + '}';
    }
}

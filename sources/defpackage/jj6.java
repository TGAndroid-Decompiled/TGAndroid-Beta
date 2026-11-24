package defpackage;

import java.nio.ByteBuffer;
public final class jj6 {
    public static final jj6 j = new jj6(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final jj6 k = new jj6(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final jj6 l = new jj6(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final jj6 m = new jj6(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;

    public jj6(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.a = d5;
        this.b = d6;
        this.c = d7;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = d8;
        this.i = d9;
    }

    public static jj6 a(ByteBuffer byteBuffer) {
        double d = hle.d(byteBuffer);
        double d2 = hle.d(byteBuffer);
        double c = hle.c(byteBuffer);
        return new jj6(d, d2, hle.d(byteBuffer), hle.d(byteBuffer), c, hle.c(byteBuffer), hle.c(byteBuffer), hle.d(byteBuffer), hle.d(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        ile.b(byteBuffer, this.d);
        ile.b(byteBuffer, this.e);
        ile.a(byteBuffer, this.a);
        ile.b(byteBuffer, this.f);
        ile.b(byteBuffer, this.g);
        ile.a(byteBuffer, this.b);
        ile.b(byteBuffer, this.h);
        ile.b(byteBuffer, this.i);
        ile.a(byteBuffer, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jj6.class != obj.getClass()) {
            return false;
        }
        jj6 jj6Var = (jj6) obj;
        if (Double.compare(jj6Var.d, this.d) == 0 && Double.compare(jj6Var.e, this.e) == 0 && Double.compare(jj6Var.f, this.f) == 0 && Double.compare(jj6Var.g, this.g) == 0 && Double.compare(jj6Var.h, this.h) == 0 && Double.compare(jj6Var.i, this.i) == 0 && Double.compare(jj6Var.a, this.a) == 0 && Double.compare(jj6Var.b, this.b) == 0 && Double.compare(jj6Var.c, this.c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) (doubleToLongBits9 ^ (doubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(j)) {
            return "Rotate 0°";
        }
        if (equals(k)) {
            return "Rotate 90°";
        }
        if (equals(l)) {
            return "Rotate 180°";
        }
        if (equals(m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.a + ", v=" + this.b + ", w=" + this.c + ", a=" + this.d + ", b=" + this.e + ", c=" + this.f + ", d=" + this.g + ", tx=" + this.h + ", ty=" + this.i + '}';
    }
}

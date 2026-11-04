package mc;

import java.nio.ByteBuffer;
public final class d {
    public static final d f19264j = new d(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f19265k = new d(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f19266l = new d(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public static final d f19267m = new d(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);
    public final double f19268a;
    public final double f19269b;
    public final double f19270c;
    public final double d;
    public final double f19271e;
    public final double f19272f;
    public final double f19273g;
    public final double h;
    public final double f19274i;

    public d(double d, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17) {
        this.f19268a = d13;
        this.f19269b = d14;
        this.f19270c = d15;
        this.d = d;
        this.f19271e = d10;
        this.f19272f = d11;
        this.f19273g = d12;
        this.h = d16;
        this.f19274i = d17;
    }

    public static d a(ByteBuffer byteBuffer) {
        double f10 = g5.b.f(byteBuffer);
        double f11 = g5.b.f(byteBuffer);
        double e10 = g5.b.e(byteBuffer);
        return new d(f10, f11, g5.b.f(byteBuffer), g5.b.f(byteBuffer), e10, g5.b.e(byteBuffer), g5.b.e(byteBuffer), g5.b.f(byteBuffer), g5.b.f(byteBuffer));
    }

    public final void b(ByteBuffer byteBuffer) {
        g5.b.n(byteBuffer, this.d);
        g5.b.n(byteBuffer, this.f19271e);
        g5.b.m(byteBuffer, this.f19268a);
        g5.b.n(byteBuffer, this.f19272f);
        g5.b.n(byteBuffer, this.f19273g);
        g5.b.m(byteBuffer, this.f19269b);
        g5.b.n(byteBuffer, this.h);
        g5.b.n(byteBuffer, this.f19274i);
        g5.b.m(byteBuffer, this.f19270c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (Double.compare(dVar.d, this.d) == 0 && Double.compare(dVar.f19271e, this.f19271e) == 0 && Double.compare(dVar.f19272f, this.f19272f) == 0 && Double.compare(dVar.f19273g, this.f19273g) == 0 && Double.compare(dVar.h, this.h) == 0 && Double.compare(dVar.f19274i, this.f19274i) == 0 && Double.compare(dVar.f19268a, this.f19268a) == 0 && Double.compare(dVar.f19269b, this.f19269b) == 0 && Double.compare(dVar.f19270c, this.f19270c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f19268a);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f19269b);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f19270c);
        long doubleToLongBits4 = Double.doubleToLongBits(this.d);
        long doubleToLongBits5 = Double.doubleToLongBits(this.f19271e);
        long doubleToLongBits6 = Double.doubleToLongBits(this.f19272f);
        long doubleToLongBits7 = Double.doubleToLongBits(this.f19273g);
        long doubleToLongBits8 = Double.doubleToLongBits(this.h);
        long doubleToLongBits9 = Double.doubleToLongBits(this.f19274i);
        return (((((((((((((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)))) * 31) + ((int) (doubleToLongBits5 ^ (doubleToLongBits5 >>> 32)))) * 31) + ((int) (doubleToLongBits6 ^ (doubleToLongBits6 >>> 32)))) * 31) + ((int) (doubleToLongBits7 ^ (doubleToLongBits7 >>> 32)))) * 31) + ((int) (doubleToLongBits8 ^ (doubleToLongBits8 >>> 32)))) * 31) + ((int) ((doubleToLongBits9 >>> 32) ^ doubleToLongBits9));
    }

    public final String toString() {
        if (equals(f19264j)) {
            return "Rotate 0°";
        }
        if (equals(f19265k)) {
            return "Rotate 90°";
        }
        if (equals(f19266l)) {
            return "Rotate 180°";
        }
        if (equals(f19267m)) {
            return "Rotate 270°";
        }
        return "Matrix{u=" + this.f19268a + ", v=" + this.f19269b + ", w=" + this.f19270c + ", a=" + this.d + ", b=" + this.f19271e + ", c=" + this.f19272f + ", d=" + this.f19273g + ", tx=" + this.h + ", ty=" + this.f19274i + '}';
    }
}

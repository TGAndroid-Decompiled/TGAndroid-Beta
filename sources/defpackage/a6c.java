package defpackage;

import sun.misc.Unsafe;
public final class a6c extends c6c {
    public final byte b;

    public a6c(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override
    public final boolean a(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (d6c.g) {
                    return d6c.e(obj, j);
                }
                if (((byte) ((d6c.f(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
                    return true;
                }
                return false;
            default:
                if (d6c.g) {
                    return d6c.e(obj, j);
                }
                if (((byte) ((d6c.f(obj, (-4) & j) >>> ((int) ((j & 3) << 3))) & 255)) != 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final double b(Object obj, long j) {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(this.a.getLong(obj, j));
            default:
                return Double.longBitsToDouble(this.a.getLong(obj, j));
        }
    }

    @Override
    public final float c(Object obj, long j) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(this.a.getInt(obj, j));
            default:
                return Float.intBitsToFloat(this.a.getInt(obj, j));
        }
    }

    @Override
    public final void d(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (d6c.g) {
                    d6c.k(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    d6c.l(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (d6c.g) {
                    d6c.k(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    d6c.l(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override
    public final void e(long j, Object obj, byte b) {
        switch (this.b) {
            case 0:
                if (d6c.g) {
                    d6c.k(j, obj, b);
                    return;
                } else {
                    d6c.l(j, obj, b);
                    return;
                }
            default:
                if (d6c.g) {
                    d6c.k(j, obj, b);
                    return;
                } else {
                    d6c.l(j, obj, b);
                    return;
                }
        }
    }

    @Override
    public final void f(Object obj, long j, double d) {
        switch (this.b) {
            case 0:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                return;
            default:
                this.a.putLong(obj, j, Double.doubleToLongBits(d));
                return;
        }
    }

    @Override
    public final void g(Object obj, long j, float f) {
        switch (this.b) {
            case 0:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                return;
            default:
                this.a.putInt(obj, j, Float.floatToIntBits(f));
                return;
        }
    }

    @Override
    public final boolean i() {
        byte b = this.b;
        return false;
    }
}

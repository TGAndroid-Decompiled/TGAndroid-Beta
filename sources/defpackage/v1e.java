package defpackage;

import sun.misc.Unsafe;
public final class v1e extends c8c {
    public final byte b;

    public v1e(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override
    public final double A(Object obj, long j) {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(this.a.getLong(obj, j));
            default:
                return Double.longBitsToDouble(this.a.getLong(obj, j));
        }
    }

    @Override
    public final byte B(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (x1e.h) {
                    return x1e.m(obj, j);
                }
                return x1e.n(obj, j);
            default:
                if (x1e.h) {
                    return x1e.m(obj, j);
                }
                return x1e.n(obj, j);
        }
    }

    @Override
    public final void m(Object obj, long j, double d) {
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
    public final void n(Object obj, long j, float f) {
        byte b = this.b;
        int floatToIntBits = Float.floatToIntBits(f);
        switch (b) {
            case 0:
                this.a.putInt(obj, j, floatToIntBits);
                return;
            default:
                this.a.putInt(obj, j, floatToIntBits);
                return;
        }
    }

    @Override
    public final void o(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (x1e.h) {
                    x1e.b(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    x1e.e(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (x1e.h) {
                    x1e.b(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    x1e.e(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override
    public final boolean y(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (x1e.h) {
                    if (x1e.m(obj, j) == 0) {
                        return false;
                    }
                } else if (x1e.n(obj, j) == 0) {
                    return false;
                }
                return true;
            default:
                if (x1e.h) {
                    if (x1e.m(obj, j) == 0) {
                        return false;
                    }
                } else if (x1e.n(obj, j) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final float z(Object obj, long j) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(this.a.getInt(obj, j));
            default:
                return Float.intBitsToFloat(this.a.getInt(obj, j));
        }
    }
}

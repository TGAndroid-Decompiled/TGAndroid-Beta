package defpackage;

import sun.misc.Unsafe;
public final class i4e extends cac {
    public final byte b;

    public i4e(Unsafe unsafe, byte b) {
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
    public final byte B(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (k4e.h) {
                    return k4e.m(j, obj);
                }
                return k4e.n(j, obj);
            default:
                if (k4e.h) {
                    return k4e.m(j, obj);
                }
                return k4e.n(j, obj);
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
                if (k4e.h) {
                    k4e.b(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    k4e.e(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (k4e.h) {
                    k4e.b(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    k4e.e(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override
    public final boolean y(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (k4e.h) {
                    if (k4e.m(j, obj) == 0) {
                        return false;
                    }
                } else if (k4e.n(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (k4e.h) {
                    if (k4e.m(j, obj) == 0) {
                        return false;
                    }
                } else if (k4e.n(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final float z(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(this.a.getInt(obj, j));
            default:
                return Float.intBitsToFloat(this.a.getInt(obj, j));
        }
    }
}

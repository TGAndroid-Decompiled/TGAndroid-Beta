package defpackage;

import sun.misc.Unsafe;
public final class szd extends c6c {
    public final byte b;

    public szd(Unsafe unsafe, byte b) {
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
                if (uzd.h) {
                    return uzd.m(obj, j);
                }
                return uzd.n(obj, j);
            default:
                if (uzd.h) {
                    return uzd.m(obj, j);
                }
                return uzd.n(obj, j);
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
                if (uzd.h) {
                    uzd.b(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    uzd.e(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (uzd.h) {
                    uzd.b(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    uzd.e(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override
    public final boolean y(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (uzd.h) {
                    if (uzd.m(obj, j) == 0) {
                        return false;
                    }
                } else if (uzd.n(obj, j) == 0) {
                    return false;
                }
                return true;
            default:
                if (uzd.h) {
                    if (uzd.m(obj, j) == 0) {
                        return false;
                    }
                } else if (uzd.n(obj, j) == 0) {
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

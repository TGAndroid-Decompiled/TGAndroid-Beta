package defpackage;

import sun.misc.Unsafe;
public final class w4f extends cac {
    public final byte b;

    public w4f(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override
    public final byte j(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (a5f.g) {
                    return a5f.n(j, obj);
                }
                return a5f.o(j, obj);
            default:
                if (a5f.g) {
                    return a5f.n(j, obj);
                }
                return a5f.o(j, obj);
        }
    }

    @Override
    public final void l(long j, Object obj, byte b) {
        switch (this.b) {
            case 0:
                if (a5f.g) {
                    a5f.h(j, obj, b);
                    return;
                } else {
                    a5f.j(obj, j, b);
                    return;
                }
            default:
                if (a5f.g) {
                    a5f.h(j, obj, b);
                    return;
                } else {
                    a5f.j(obj, j, b);
                    return;
                }
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
    public final void o(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (a5f.g) {
                    a5f.h(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    a5f.j(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (a5f.g) {
                    a5f.h(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    a5f.j(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override
    public final boolean q(long j, Object obj) {
        switch (this.b) {
            case 0:
                if (a5f.g) {
                    if (a5f.n(j, obj) == 0) {
                        return false;
                    }
                } else if (a5f.o(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (a5f.g) {
                    if (a5f.n(j, obj) == 0) {
                        return false;
                    }
                } else if (a5f.o(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final float r(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(this.a.getInt(obj, j));
            default:
                return Float.intBitsToFloat(this.a.getInt(obj, j));
        }
    }

    @Override
    public final double t(long j, Object obj) {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(this.a.getLong(obj, j));
            default:
                return Double.longBitsToDouble(this.a.getLong(obj, j));
        }
    }
}

package defpackage;

import sun.misc.Unsafe;
public final class f0f extends c6c {
    public final byte b;

    public f0f(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override
    public final byte j(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (i0f.g) {
                    return i0f.n(obj, j);
                }
                return i0f.o(obj, j);
            default:
                if (i0f.g) {
                    return i0f.n(obj, j);
                }
                return i0f.o(obj, j);
        }
    }

    @Override
    public final void l(long j, Object obj, byte b) {
        switch (this.b) {
            case 0:
                if (i0f.g) {
                    i0f.h(j, obj, b);
                    return;
                } else {
                    i0f.j(obj, j, b);
                    return;
                }
            default:
                if (i0f.g) {
                    i0f.h(j, obj, b);
                    return;
                } else {
                    i0f.j(obj, j, b);
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
                if (i0f.g) {
                    i0f.h(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    i0f.j(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (i0f.g) {
                    i0f.h(j, obj, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    i0f.j(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override
    public final boolean q(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (i0f.g) {
                    if (i0f.n(obj, j) == 0) {
                        return false;
                    }
                } else if (i0f.o(obj, j) == 0) {
                    return false;
                }
                return true;
            default:
                if (i0f.g) {
                    if (i0f.n(obj, j) == 0) {
                        return false;
                    }
                } else if (i0f.o(obj, j) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final float r(Object obj, long j) {
        switch (this.b) {
            case 0:
                return Float.intBitsToFloat(this.a.getInt(obj, j));
            default:
                return Float.intBitsToFloat(this.a.getInt(obj, j));
        }
    }

    @Override
    public final double t(Object obj, long j) {
        switch (this.b) {
            case 0:
                return Double.longBitsToDouble(this.a.getLong(obj, j));
            default:
                return Double.longBitsToDouble(this.a.getLong(obj, j));
        }
    }
}

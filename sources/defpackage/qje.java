package defpackage;

import sun.misc.Unsafe;
public final class qje extends cac {
    public final byte b;

    public qje(Unsafe unsafe, byte b) {
        super(unsafe);
        this.b = b;
    }

    @Override
    public final double k(Object obj, long j) {
        byte b = this.b;
        Unsafe unsafe = this.a;
        switch (b) {
            case 0:
                return Double.longBitsToDouble(unsafe.getLong(obj, j));
            default:
                return Double.longBitsToDouble(unsafe.getLong(obj, j));
        }
    }

    @Override
    public final float p(Object obj, long j) {
        byte b = this.b;
        Unsafe unsafe = this.a;
        switch (b) {
            case 0:
                return Float.intBitsToFloat(unsafe.getInt(obj, j));
            default:
                return Float.intBitsToFloat(unsafe.getInt(obj, j));
        }
    }

    @Override
    public final void s(Object obj, long j, boolean z) {
        switch (this.b) {
            case 0:
                if (eke.g) {
                    eke.c(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    eke.d(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (eke.g) {
                    eke.c(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    eke.d(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override
    public final void u(Object obj, long j, byte b) {
        switch (this.b) {
            case 0:
                if (eke.g) {
                    eke.c(obj, j, b);
                    return;
                } else {
                    eke.d(obj, j, b);
                    return;
                }
            default:
                if (eke.g) {
                    eke.c(obj, j, b);
                    return;
                } else {
                    eke.d(obj, j, b);
                    return;
                }
        }
    }

    @Override
    public final void v(Object obj, long j, double d) {
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
    public final void w(Object obj, long j, float f) {
        byte b = this.b;
        Unsafe unsafe = this.a;
        switch (b) {
            case 0:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                return;
            default:
                unsafe.putInt(obj, j, Float.floatToIntBits(f));
                return;
        }
    }

    @Override
    public final boolean x(Object obj, long j) {
        switch (this.b) {
            case 0:
                if (eke.g) {
                    return eke.j(obj, j);
                }
                return eke.k(obj, j);
            default:
                if (eke.g) {
                    return eke.j(obj, j);
                }
                return eke.k(obj, j);
        }
    }
}

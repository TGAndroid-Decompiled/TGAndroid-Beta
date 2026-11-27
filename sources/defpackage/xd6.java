package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;
public final class xd6 {
    public static final ow5 e;
    public static final long f;
    public static final long g;
    private volatile Object _next$volatile;
    private volatile long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final AtomicReferenceArray d;

    static {
        Unsafe unsafe = fx.a;
        f = unsafe.objectFieldOffset(xd6.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(xd6.class.getDeclaredField("_state$volatile"));
        e = new ow5("REMOVE_FROZEN", (byte) 1);
    }

    public xd6(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            }
            grb.i("Check failed.");
            throw null;
        }
        grb.i("Check failed.");
        throw null;
    }

    public final int a(Runnable runnable) {
        xd6 xd6Var = this;
        while (true) {
            Unsafe unsafe = fx.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(xd6Var, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                if ((longVolatile & 2305843009213693952L) != 0) {
                    return 2;
                }
                return 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = xd6Var.c;
            if (((i2 + 2) & i3) != (i & i3)) {
                boolean z = xd6Var.b;
                AtomicReferenceArray atomicReferenceArray = xd6Var.d;
                if (!z && atomicReferenceArray.get(i2 & i3) != null) {
                    int i4 = xd6Var.a;
                    if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                        return 1;
                    }
                } else {
                    if (unsafe.compareAndSwapLong(xd6Var, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((i2 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i3 & i2, runnable);
                        xd6 xd6Var2 = this;
                        while ((fx.a.getLongVolatile(xd6Var2, j) & 1152921504606846976L) != 0) {
                            xd6Var2 = xd6Var2.c();
                            AtomicReferenceArray atomicReferenceArray2 = xd6Var2.d;
                            int i5 = xd6Var2.c & i2;
                            Object obj = atomicReferenceArray2.get(i5);
                            if ((obj instanceof wd6) && ((wd6) obj).a == i2) {
                                atomicReferenceArray2.set(i5, runnable);
                                continue;
                            } else {
                                xd6Var2 = null;
                                continue;
                            }
                            if (xd6Var2 == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                    xd6Var = this;
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = fx.a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            xd6 xd6Var = this;
            if (fx.a.compareAndSwapLong(xd6Var, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = xd6Var;
        }
    }

    public final xd6 c() {
        long j;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = fx.a;
            long j2 = g;
            long longVolatile = unsafe2.getLongVolatile(this, j2);
            if ((longVolatile & 1152921504606846976L) != 0) {
                j = longVolatile;
                break;
            }
            j = 1152921504606846976L | longVolatile;
            if (unsafe2.compareAndSwapLong(this, j2, longVolatile, j)) {
                break;
            }
        }
        while (true) {
            Unsafe unsafe3 = fx.a;
            long j3 = f;
            xd6 xd6Var = (xd6) unsafe3.getObjectVolatile(this, j3);
            if (xd6Var != null) {
                return xd6Var;
            }
            xd6 xd6Var2 = new xd6(this.a << 1, this.b);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.c;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object obj = this.d.get(i4);
                if (obj == null) {
                    obj = new wd6(i);
                }
                xd6Var2.d.set(xd6Var2.c & i, obj);
                i++;
            }
            fx.a.putLongVolatile(xd6Var2, g, j & (-1152921504606846977L));
            do {
                unsafe = fx.a;
                if (!unsafe.compareAndSwapObject(this, f, (Object) null, xd6Var2)) {
                }
            } while (unsafe.getObjectVolatile(this, j3) == null);
        }
    }

    public final java.lang.Object d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd6.d():java.lang.Object");
    }
}

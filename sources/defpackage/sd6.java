package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;
public final class sd6 {
    public static final du2 e;
    public static final long f;
    public static final long g;
    private volatile Object _next$volatile;
    private volatile long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final AtomicReferenceArray d;

    static {
        Unsafe unsafe = fy.a;
        f = unsafe.objectFieldOffset(sd6.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(sd6.class.getDeclaredField("_state$volatile"));
        e = new du2("REMOVE_FROZEN", (byte) 2);
    }

    public sd6(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            }
            dq9.m("Check failed.");
            throw null;
        }
        dq9.m("Check failed.");
        throw null;
    }

    public final int a(Runnable runnable) {
        sd6 sd6Var = this;
        while (true) {
            Unsafe unsafe = fy.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(sd6Var, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                if ((longVolatile & 2305843009213693952L) != 0) {
                    return 2;
                }
                return 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = sd6Var.c;
            if (((i2 + 2) & i3) != (i & i3)) {
                boolean z = sd6Var.b;
                AtomicReferenceArray atomicReferenceArray = sd6Var.d;
                if (!z && atomicReferenceArray.get(i2 & i3) != null) {
                    int i4 = sd6Var.a;
                    if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                        return 1;
                    }
                } else {
                    if (unsafe.compareAndSwapLong(sd6Var, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((i2 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i3 & i2, runnable);
                        sd6 sd6Var2 = this;
                        while ((fy.a.getLongVolatile(sd6Var2, j) & 1152921504606846976L) != 0) {
                            sd6Var2 = sd6Var2.c();
                            AtomicReferenceArray atomicReferenceArray2 = sd6Var2.d;
                            int i5 = sd6Var2.c & i2;
                            Object obj = atomicReferenceArray2.get(i5);
                            if ((obj instanceof rd6) && ((rd6) obj).a == i2) {
                                atomicReferenceArray2.set(i5, runnable);
                                continue;
                            } else {
                                sd6Var2 = null;
                                continue;
                            }
                            if (sd6Var2 == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                    sd6Var = this;
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = fy.a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            sd6 sd6Var = this;
            if (fy.a.compareAndSwapLong(sd6Var, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = sd6Var;
        }
    }

    public final sd6 c() {
        long j;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = fy.a;
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
            Unsafe unsafe3 = fy.a;
            long j3 = f;
            sd6 sd6Var = (sd6) unsafe3.getObjectVolatile(this, j3);
            if (sd6Var != null) {
                return sd6Var;
            }
            sd6 sd6Var2 = new sd6(this.a << 1, this.b);
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
                    obj = new rd6(i);
                }
                sd6Var2.d.set(sd6Var2.c & i, obj);
                i++;
            }
            fy.a.putLongVolatile(sd6Var2, g, j & (-1152921504606846977L));
            do {
                unsafe = fy.a;
                if (!unsafe.compareAndSwapObject(this, f, (Object) null, sd6Var2)) {
                }
            } while (unsafe.getObjectVolatile(this, j3) == null);
        }
    }

    public final java.lang.Object d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd6.d():java.lang.Object");
    }
}

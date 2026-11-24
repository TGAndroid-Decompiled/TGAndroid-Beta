package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import sun.misc.Unsafe;
public final class tb6 {
    public static final lo5 e;
    public static final long f;
    public static final long g;
    private volatile Object _next$volatile;
    private volatile long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final AtomicReferenceArray d;

    static {
        Unsafe unsafe = ex.a;
        f = unsafe.objectFieldOffset(tb6.class.getDeclaredField("_next$volatile"));
        g = unsafe.objectFieldOffset(tb6.class.getDeclaredField("_state$volatile"));
        e = new lo5("REMOVE_FROZEN");
    }

    public tb6(int i, boolean z) {
        this.a = i;
        this.b = z;
        int i2 = i - 1;
        this.c = i2;
        this.d = new AtomicReferenceArray(i);
        if (i2 <= 1073741823) {
            if ((i & i2) == 0) {
                return;
            }
            sc8.j("Check failed.");
            throw null;
        }
        sc8.j("Check failed.");
        throw null;
    }

    public final int a(Runnable runnable) {
        tb6 tb6Var = this;
        while (true) {
            Unsafe unsafe = ex.a;
            long j = g;
            long longVolatile = unsafe.getLongVolatile(tb6Var, j);
            if ((3458764513820540928L & longVolatile) != 0) {
                if ((longVolatile & 2305843009213693952L) != 0) {
                    return 2;
                }
                return 1;
            }
            int i = (int) (1073741823 & longVolatile);
            int i2 = (int) ((1152921503533105152L & longVolatile) >> 30);
            int i3 = tb6Var.c;
            if (((i2 + 2) & i3) != (i & i3)) {
                boolean z = tb6Var.b;
                AtomicReferenceArray atomicReferenceArray = tb6Var.d;
                if (!z && atomicReferenceArray.get(i2 & i3) != null) {
                    int i4 = tb6Var.a;
                    if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                        return 1;
                    }
                } else {
                    if (unsafe.compareAndSwapLong(tb6Var, g, longVolatile, ((-1152921503533105153L) & longVolatile) | (((i2 + 1) & 1073741823) << 30))) {
                        atomicReferenceArray.set(i3 & i2, runnable);
                        tb6 tb6Var2 = this;
                        while ((ex.a.getLongVolatile(tb6Var2, j) & 1152921504606846976L) != 0) {
                            tb6Var2 = tb6Var2.c();
                            AtomicReferenceArray atomicReferenceArray2 = tb6Var2.d;
                            int i5 = tb6Var2.c & i2;
                            Object obj = atomicReferenceArray2.get(i5);
                            if ((obj instanceof sb6) && ((sb6) obj).a == i2) {
                                atomicReferenceArray2.set(i5, runnable);
                                continue;
                            } else {
                                tb6Var2 = null;
                                continue;
                            }
                            if (tb6Var2 == null) {
                                return 0;
                            }
                        }
                        return 0;
                    }
                    tb6Var = this;
                }
            } else {
                return 1;
            }
        }
    }

    public final boolean b() {
        while (true) {
            long longVolatile = ex.a.getLongVolatile(this, g);
            if ((longVolatile & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & longVolatile) != 0) {
                return false;
            }
            tb6 tb6Var = this;
            if (ex.a.compareAndSwapLong(tb6Var, g, longVolatile, longVolatile | 2305843009213693952L)) {
                return true;
            }
            this = tb6Var;
        }
    }

    public final tb6 c() {
        long j;
        Unsafe unsafe;
        while (true) {
            Unsafe unsafe2 = ex.a;
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
            Unsafe unsafe3 = ex.a;
            long j3 = f;
            tb6 tb6Var = (tb6) unsafe3.getObjectVolatile(this, j3);
            if (tb6Var != null) {
                return tb6Var;
            }
            tb6 tb6Var2 = new tb6(this.a << 1, this.b);
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
                    obj = new sb6(i);
                }
                tb6Var2.d.set(tb6Var2.c & i, obj);
                i++;
            }
            ex.a.putLongVolatile(tb6Var2, g, j & (-1152921504606846977L));
            do {
                unsafe = ex.a;
                if (!unsafe.compareAndSwapObject(this, f, (Object) null, tb6Var2)) {
                }
            } while (unsafe.getObjectVolatile(this, j3) == null);
        }
    }

    public final java.lang.Object d() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tb6.d():java.lang.Object");
    }
}

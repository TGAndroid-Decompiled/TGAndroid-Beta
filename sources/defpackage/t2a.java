package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;
public class t2a {
    public static final AtomicLongFieldUpdater b;
    public static final AtomicLongFieldUpdater c;
    public static final AtomicIntegerFieldUpdater d;
    public static final long e;
    public static final long f;
    public static final long g;
    private volatile int _availablePermits$volatile;
    public final ub1 a;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    private volatile Object tail$volatile;

    static {
        Unsafe unsafe = fy.a;
        f = unsafe.objectFieldOffset(t2a.class.getDeclaredField("head$volatile"));
        b = AtomicLongFieldUpdater.newUpdater(t2a.class, "deqIdx$volatile");
        g = unsafe.objectFieldOffset(t2a.class.getDeclaredField("tail$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(t2a.class, "enqIdx$volatile");
        d = AtomicIntegerFieldUpdater.newUpdater(t2a.class, "_availablePermits$volatile");
        e = unsafe.objectFieldOffset(t2a.class.getDeclaredField("_availablePermits$volatile"));
    }

    public t2a() {
        v2a v2aVar = new v2a(0L, null, 2);
        this.head$volatile = v2aVar;
        this.tail$volatile = v2aVar;
        this._availablePermits$volatile = 1;
        this.a = new ub1(this, (byte) 2);
    }

    public final void a(defpackage.pj7 r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2a.a(pj7):void");
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2a.b():void");
    }
}

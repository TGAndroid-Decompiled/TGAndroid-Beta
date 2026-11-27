package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;
public class k4a {
    public static final AtomicLongFieldUpdater b;
    public static final AtomicLongFieldUpdater c;
    public static final AtomicIntegerFieldUpdater d;
    public static final long e;
    public static final long f;
    public static final long g;
    private volatile int _availablePermits$volatile;
    public final ua1 a;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    private volatile Object tail$volatile;

    static {
        Unsafe unsafe = fx.a;
        f = unsafe.objectFieldOffset(k4a.class.getDeclaredField("head$volatile"));
        b = AtomicLongFieldUpdater.newUpdater(k4a.class, "deqIdx$volatile");
        g = unsafe.objectFieldOffset(k4a.class.getDeclaredField("tail$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(k4a.class, "enqIdx$volatile");
        d = AtomicIntegerFieldUpdater.newUpdater(k4a.class, "_availablePermits$volatile");
        e = unsafe.objectFieldOffset(k4a.class.getDeclaredField("_availablePermits$volatile"));
    }

    public k4a() {
        m4a m4aVar = new m4a(0L, null, 2);
        this.head$volatile = m4aVar;
        this.tail$volatile = m4aVar;
        this._availablePermits$volatile = 1;
        this.a = new ua1(this, (byte) 2);
    }

    public final void a(defpackage.wj7 r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k4a.a(wj7):void");
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k4a.b():void");
    }
}

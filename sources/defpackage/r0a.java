package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;
public class r0a {
    public static final AtomicLongFieldUpdater b;
    public static final AtomicLongFieldUpdater c;
    public static final AtomicIntegerFieldUpdater d;
    public static final long e;
    public static final long f;
    public static final long g;
    private volatile int _availablePermits$volatile;
    public final ma1 a;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    private volatile Object tail$volatile;

    static {
        Unsafe unsafe = ex.a;
        f = unsafe.objectFieldOffset(r0a.class.getDeclaredField("head$volatile"));
        b = AtomicLongFieldUpdater.newUpdater(r0a.class, "deqIdx$volatile");
        g = unsafe.objectFieldOffset(r0a.class.getDeclaredField("tail$volatile"));
        c = AtomicLongFieldUpdater.newUpdater(r0a.class, "enqIdx$volatile");
        d = AtomicIntegerFieldUpdater.newUpdater(r0a.class, "_availablePermits$volatile");
        e = unsafe.objectFieldOffset(r0a.class.getDeclaredField("_availablePermits$volatile"));
    }

    public r0a() {
        t0a t0aVar = new t0a(0L, null, 2);
        this.head$volatile = t0aVar;
        this.tail$volatile = t0aVar;
        this._availablePermits$volatile = 1;
        this.a = new ma1(this, (byte) 2);
    }

    public final void a(defpackage.mh7 r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0a.a(mh7):void");
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0a.b():void");
    }
}

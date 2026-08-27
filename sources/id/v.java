package id;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class v {

    public static final AtomicIntegerFieldUpdater f11203b = AtomicIntegerFieldUpdater.newUpdater(v.class, "_handled$volatile");
    private volatile int _handled$volatile;

    public final Throwable f11204a;

    public v(Throwable th, boolean z10) {
        this.f11204a = th;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f11204a + ']';
    }
}

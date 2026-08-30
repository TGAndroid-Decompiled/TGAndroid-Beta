package ld;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public class v {
    public static final AtomicIntegerFieldUpdater f11929b = AtomicIntegerFieldUpdater.newUpdater(v.class, "_handled$volatile");
    private volatile int _handled$volatile;
    public final Throwable f11930a;

    public v(Throwable th2, boolean z4) {
        this.f11930a = th2;
        this._handled$volatile = z4 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f11930a + ']';
    }
}

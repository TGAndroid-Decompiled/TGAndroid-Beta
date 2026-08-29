package jd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public class v {
    public static final AtomicIntegerFieldUpdater f11531b = AtomicIntegerFieldUpdater.newUpdater(v.class, "_handled$volatile");
    private volatile int _handled$volatile;
    public final Throwable f11532a;

    public v(Throwable th2, boolean z10) {
        this.f11532a = th2;
        this._handled$volatile = z10 ? 1 : 0;
    }

    public final String toString() {
        return getClass().getSimpleName() + '[' + this.f11532a + ']';
    }
}

package id;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class n extends v {

    public static final AtomicIntegerFieldUpdater f11170c = AtomicIntegerFieldUpdater.newUpdater(n.class, "_resumed$volatile");
    private volatile int _resumed$volatile;

    public n(m mVar, Throwable th, boolean z10) {
        if (th == null) {
            th = new CancellationException("Continuation " + mVar + " was cancelled normally");
        }
        super(th, z10);
        this._resumed$volatile = 0;
    }
}

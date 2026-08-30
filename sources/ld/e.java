package ld;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f11871b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final h0[] f11872a;
    private volatile int notCompletedCount$volatile;

    public e(h0[] h0VarArr) {
        this.f11872a = h0VarArr;
        this.notCompletedCount$volatile = h0VarArr.length;
    }
}

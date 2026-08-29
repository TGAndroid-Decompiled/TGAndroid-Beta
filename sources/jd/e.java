package jd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f11458b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final h0[] f11459a;
    private volatile int notCompletedCount$volatile;

    public e(h0[] h0VarArr) {
        this.f11459a = h0VarArr;
        this.notCompletedCount$volatile = h0VarArr.length;
    }
}

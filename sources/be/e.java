package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f2658b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final i0[] f2659a;
    private volatile int notCompletedCount$volatile;

    public e(i0[] i0VarArr) {
        this.f2659a = i0VarArr;
        this.notCompletedCount$volatile = i0VarArr.length;
    }
}

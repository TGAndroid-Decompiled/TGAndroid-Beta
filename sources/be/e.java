package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f4274b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final i0[] f4275a;
    private volatile int notCompletedCount$volatile;

    public e(i0[] i0VarArr) {
        this.f4275a = i0VarArr;
        this.notCompletedCount$volatile = i0VarArr.length;
    }
}

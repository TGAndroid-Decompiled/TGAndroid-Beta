package be;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f4273b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final i0[] f4274a;
    private volatile int notCompletedCount$volatile;

    public e(i0[] i0VarArr) {
        this.f4274a = i0VarArr;
        this.notCompletedCount$volatile = i0VarArr.length;
    }
}

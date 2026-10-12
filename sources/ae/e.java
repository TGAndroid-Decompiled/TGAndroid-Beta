package ae;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f438b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final j0[] f439a;
    private volatile int notCompletedCount$volatile;

    public e(j0[] j0VarArr) {
        this.f439a = j0VarArr;
        this.notCompletedCount$volatile = j0VarArr.length;
    }
}

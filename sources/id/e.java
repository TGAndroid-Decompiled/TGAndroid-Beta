package id;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class e {

    public static final AtomicIntegerFieldUpdater f11132b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    public final i0[] f11133a;
    private volatile int notCompletedCount$volatile;

    public e(i0[] i0VarArr) {
        this.f11133a = i0VarArr;
        this.notCompletedCount$volatile = i0VarArr.length;
    }
}

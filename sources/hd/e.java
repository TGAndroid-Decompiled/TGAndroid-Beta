package hd;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class e {
    public static final AtomicIntegerFieldUpdater f10423b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");
    public final i0[] f10424a;
    private volatile int notCompletedCount$volatile;

    public e(i0[] i0VarArr) {
        this.f10424a = i0VarArr;
        this.notCompletedCount$volatile = i0VarArr.length;
    }
}

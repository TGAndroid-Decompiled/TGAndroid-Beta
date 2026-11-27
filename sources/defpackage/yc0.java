package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class yc0 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(yc0.class, "notCompletedCount$volatile");
    public final rd3[] a;
    private volatile int notCompletedCount$volatile;

    public yc0(rd3[] rd3VarArr) {
        this.a = rd3VarArr;
        this.notCompletedCount$volatile = rd3VarArr.length;
    }
}

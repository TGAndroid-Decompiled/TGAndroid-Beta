package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class wd0 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(wd0.class, "notCompletedCount$volatile");
    public final le3[] a;
    private volatile int notCompletedCount$volatile;

    public wd0(le3[] le3VarArr) {
        this.a = le3VarArr;
        this.notCompletedCount$volatile = le3VarArr.length;
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
public final class wc0 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(wc0.class, "notCompletedCount$volatile");
    public final zc3[] a;
    private volatile int notCompletedCount$volatile;

    public wc0(zc3[] zc3VarArr) {
        this.a = zc3VarArr;
        this.notCompletedCount$volatile = zc3VarArr.length;
    }
}

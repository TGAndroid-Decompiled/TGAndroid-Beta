package org.telegram.messenger;
public final class x10 implements r20 {
    public final boolean[] f19374a;
    public final int f19375b;
    public final Runnable f19376c;

    public x10(int i10, Runnable runnable, boolean[] zArr) {
        this.f19374a = zArr;
        this.f19375b = i10;
        this.f19376c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f19374a[this.f19375b] = ((Boolean) obj).booleanValue();
        this.f19376c.run();
    }
}

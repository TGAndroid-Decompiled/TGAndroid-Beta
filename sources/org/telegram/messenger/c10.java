package org.telegram.messenger;
public final class c10 implements x10 {
    public final boolean[] f23223a;
    public final int f23224b;
    public final Runnable f23225c;

    public c10(int i7, Runnable runnable, boolean[] zArr) {
        this.f23223a = zArr;
        this.f23224b = i7;
        this.f23225c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f23223a[this.f23224b] = ((Boolean) obj).booleanValue();
        this.f23225c.run();
    }
}

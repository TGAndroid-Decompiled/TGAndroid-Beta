package org.telegram.messenger;
public final class c10 implements x10 {
    public final boolean[] f23226a;
    public final int f23227b;
    public final Runnable f23228c;

    public c10(int i7, Runnable runnable, boolean[] zArr) {
        this.f23226a = zArr;
        this.f23227b = i7;
        this.f23228c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f23226a[this.f23227b] = ((Boolean) obj).booleanValue();
        this.f23228c.run();
    }
}

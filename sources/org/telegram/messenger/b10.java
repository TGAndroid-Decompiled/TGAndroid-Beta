package org.telegram.messenger;
public final class b10 implements w10 {
    public final boolean[] f23118a;
    public final int f23119b;
    public final Runnable f23120c;

    public b10(int i7, Runnable runnable, boolean[] zArr) {
        this.f23118a = zArr;
        this.f23119b = i7;
        this.f23120c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f23118a[this.f23119b] = ((Boolean) obj).booleanValue();
        this.f23120c.run();
    }
}

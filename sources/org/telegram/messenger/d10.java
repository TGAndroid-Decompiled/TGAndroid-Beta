package org.telegram.messenger;
public final class d10 implements y10 {
    public final boolean[] f23473a;
    public final int f23474b;
    public final Runnable f23475c;

    public d10(int i7, Runnable runnable, boolean[] zArr) {
        this.f23473a = zArr;
        this.f23474b = i7;
        this.f23475c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f23473a[this.f23474b] = ((Boolean) obj).booleanValue();
        this.f23475c.run();
    }
}

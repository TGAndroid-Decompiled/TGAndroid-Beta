package org.telegram.messenger;
public final class d10 implements y10 {
    public final boolean[] f23437a;
    public final int f23438b;
    public final Runnable f23439c;

    public d10(int i7, Runnable runnable, boolean[] zArr) {
        this.f23437a = zArr;
        this.f23438b = i7;
        this.f23439c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f23437a[this.f23438b] = ((Boolean) obj).booleanValue();
        this.f23439c.run();
    }
}

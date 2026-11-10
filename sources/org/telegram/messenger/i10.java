package org.telegram.messenger;
public final class i10 implements c20 {
    public final boolean[] f23018a;
    public final int f23019b;
    public final Runnable f23020c;

    public i10(int i7, Runnable runnable, boolean[] zArr) {
        this.f23018a = zArr;
        this.f23019b = i7;
        this.f23020c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f23018a[this.f23019b] = ((Boolean) obj).booleanValue();
        this.f23020c.run();
    }
}

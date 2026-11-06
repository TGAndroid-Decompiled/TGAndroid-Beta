package org.telegram.messenger;
public final class i10 implements c20 {
    public final boolean[] f23016a;
    public final int f23017b;
    public final Runnable f23018c;

    public i10(int i7, Runnable runnable, boolean[] zArr) {
        this.f23016a = zArr;
        this.f23017b = i7;
        this.f23018c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f23016a[this.f23017b] = ((Boolean) obj).booleanValue();
        this.f23018c.run();
    }
}

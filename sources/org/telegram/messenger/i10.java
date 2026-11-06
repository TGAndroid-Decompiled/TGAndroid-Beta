package org.telegram.messenger;
public final class i10 implements c20 {
    public final boolean[] f23023a;
    public final int f23024b;
    public final Runnable f23025c;

    public i10(int i7, Runnable runnable, boolean[] zArr) {
        this.f23023a = zArr;
        this.f23024b = i7;
        this.f23025c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f23023a[this.f23024b] = ((Boolean) obj).booleanValue();
        this.f23025c.run();
    }
}

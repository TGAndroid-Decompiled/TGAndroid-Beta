package org.telegram.messenger;
public final class i10 implements c20 {
    public final boolean[] f23014a;
    public final int f23015b;
    public final Runnable f23016c;

    public i10(int i7, Runnable runnable, boolean[] zArr) {
        this.f23014a = zArr;
        this.f23015b = i7;
        this.f23016c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f23014a[this.f23015b] = ((Boolean) obj).booleanValue();
        this.f23016c.run();
    }
}

package org.telegram.messenger;
public final class f10 implements z10 {
    public final boolean[] f23414a;
    public final int f23415b;
    public final Runnable f23416c;

    public f10(int i7, Runnable runnable, boolean[] zArr) {
        this.f23414a = zArr;
        this.f23415b = i7;
        this.f23416c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f23414a[this.f23415b] = ((Boolean) obj).booleanValue();
        this.f23416c.run();
    }
}

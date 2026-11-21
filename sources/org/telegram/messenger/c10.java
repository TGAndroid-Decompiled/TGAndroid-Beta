package org.telegram.messenger;
public final class c10 implements x10 {
    public final boolean[] f23251a;
    public final int f23252b;
    public final Runnable f23253c;

    public c10(int i7, Runnable runnable, boolean[] zArr) {
        this.f23251a = zArr;
        this.f23252b = i7;
        this.f23253c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f23251a[this.f23252b] = ((Boolean) obj).booleanValue();
        this.f23253c.run();
    }
}

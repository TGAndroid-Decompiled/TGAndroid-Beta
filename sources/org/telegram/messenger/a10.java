package org.telegram.messenger;
public final class a10 implements u10 {
    public final boolean[] f21424a;
    public final int f21425b;
    public final Runnable f21426c;

    public a10(int i3, Runnable runnable, boolean[] zArr) {
        this.f21424a = zArr;
        this.f21425b = i3;
        this.f21426c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f21424a[this.f21425b] = ((Boolean) obj).booleanValue();
        this.f21426c.run();
    }
}

package org.telegram.messenger;
public final class f10 implements z10 {
    public final boolean[] f23411a;
    public final int f23412b;
    public final Runnable f23413c;

    public f10(int i7, Runnable runnable, boolean[] zArr) {
        this.f23411a = zArr;
        this.f23412b = i7;
        this.f23413c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f23411a[this.f23412b] = ((Boolean) obj).booleanValue();
        this.f23413c.run();
    }
}

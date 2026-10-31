package org.telegram.messenger;
public final class w10 implements q20 {
    public final boolean[] f19040a;
    public final int f19041b;
    public final Runnable f19042c;

    public w10(int i10, Runnable runnable, boolean[] zArr) {
        this.f19040a = zArr;
        this.f19041b = i10;
        this.f19042c = runnable;
    }

    @Override
    public final void a(Object obj) {
        this.f19040a[this.f19041b] = ((Boolean) obj).booleanValue();
        this.f19042c.run();
    }
}

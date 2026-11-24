package defpackage;
public final class jxa implements Runnable {
    public final long a;
    public final int b;
    public final int c;
    public final boolean d;

    public jxa(int i, int i2, long j, boolean z) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override
    public final void run() {
        long j = this.a;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.b;
        int i3 = this.c;
        if (i != 0) {
            ku0.g(i2).p(i3, j);
        } else {
            jva.v(i2, this.d).V(i3);
        }
    }
}

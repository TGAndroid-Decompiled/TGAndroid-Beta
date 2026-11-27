package defpackage;
public abstract class qg0 implements gm6 {
    public final long a;
    public final long b;
    public long c;

    public qg0(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j - 1;
    }

    public final void b() {
        long j = this.c;
        if (j >= this.a && j <= this.b) {
            return;
        }
        lq5.n();
    }

    @Override
    public final boolean next() {
        boolean z;
        long j = this.c + 1;
        this.c = j;
        if (j > this.b) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }
}

package defpackage;
public abstract class qh0 implements em6 {
    public final long a;
    public final long b;
    public long c;

    public qh0(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = j - 1;
    }

    public final void a() {
        long j = this.c;
        if (j >= this.a && j <= this.b) {
            return;
        }
        u36.g();
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

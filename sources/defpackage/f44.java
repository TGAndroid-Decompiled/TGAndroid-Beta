package defpackage;
public final class f44 extends g44 {
    public final nob c;

    public f44(long j, nob nobVar) {
        super(j);
        this.c = nobVar;
    }

    @Override
    public final void run() {
        this.c.run();
    }

    @Override
    public final String toString() {
        return super.toString() + this.c;
    }
}

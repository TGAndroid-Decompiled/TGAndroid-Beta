package defpackage;
public final class b54 extends c54 {
    public final nsb c;

    public b54(long j, nsb nsbVar) {
        super(j);
        this.c = nsbVar;
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

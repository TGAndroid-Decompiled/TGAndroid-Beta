package defpackage;
public abstract class odc {
    public final pdc a = new pdc();

    public final void a() {
        pdc pdcVar = this.a;
        if (!pdcVar.d) {
            pdcVar.d = true;
            synchronized (pdcVar.a) {
                for (AutoCloseable autoCloseable : pdcVar.b.values()) {
                    pdc.a(autoCloseable);
                }
                for (AutoCloseable autoCloseable2 : pdcVar.c) {
                    pdc.a(autoCloseable2);
                }
                pdcVar.c.clear();
            }
        }
        b();
    }

    public void b() {
    }
}

package defpackage;
public abstract class nhc {
    public final ohc a = new ohc();

    public final void a() {
        ohc ohcVar = this.a;
        if (!ohcVar.d) {
            ohcVar.d = true;
            synchronized (ohcVar.a) {
                for (AutoCloseable autoCloseable : ohcVar.b.values()) {
                    ohc.a(autoCloseable);
                }
                for (AutoCloseable autoCloseable2 : ohcVar.c) {
                    ohc.a(autoCloseable2);
                }
                ohcVar.c.clear();
            }
        }
        b();
    }

    public void b() {
    }
}

package defpackage;
public abstract class pfc {
    public final qfc a = new qfc();

    public final void a() {
        qfc qfcVar = this.a;
        if (!qfcVar.d) {
            qfcVar.d = true;
            synchronized (qfcVar.a) {
                for (AutoCloseable autoCloseable : qfcVar.b.values()) {
                    qfc.a(autoCloseable);
                }
                for (AutoCloseable autoCloseable2 : qfcVar.c) {
                    qfc.a(autoCloseable2);
                }
                qfcVar.c.clear();
            }
        }
        b();
    }

    public void b() {
    }
}

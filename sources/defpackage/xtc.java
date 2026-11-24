package defpackage;
public final class xtc implements Runnable {
    public final byte a;
    public final auc b;

    public xtc(auc aucVar, byte b) {
        this.a = b;
        this.b = aucVar;
    }

    private final void a() {
        auc aucVar = this.b;
        aucVar.g();
        synchronized (aucVar.a) {
            if (aucVar.u) {
                return;
            }
            gl.d3(new xtc(aucVar, (byte) 2), 1000L);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xtc.run():void");
    }
}

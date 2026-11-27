package defpackage;
public final class myc implements Runnable {
    public final byte a;
    public final pyc b;

    public myc(pyc pycVar, byte b) {
        this.a = b;
        this.b = pycVar;
    }

    private final void a() {
        pyc pycVar = this.b;
        pycVar.g();
        synchronized (pycVar.a) {
            if (pycVar.u) {
                return;
            }
            hl.d3(new myc(pycVar, (byte) 2), 1000L);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.myc.run():void");
    }
}

package defpackage;
public final class yvc implements Runnable {
    public final byte a;
    public final bwc b;

    public yvc(bwc bwcVar, byte b) {
        this.a = b;
        this.b = bwcVar;
    }

    private final void a() {
        bwc bwcVar = this.b;
        bwcVar.g();
        synchronized (bwcVar.a) {
            if (bwcVar.u) {
                return;
            }
            gm.d3(new yvc(bwcVar, (byte) 2), 1000L);
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yvc.run():void");
    }
}

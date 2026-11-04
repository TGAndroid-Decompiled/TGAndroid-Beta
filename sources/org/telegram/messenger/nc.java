package org.telegram.messenger;
public final class nc implements Runnable {
    public final int f24363a;
    public final fg f24364b;
    public final xc f24365c;

    public nc(fg fgVar, xc xcVar, int i3) {
        this.f24363a = i3;
        this.f24364b = fgVar;
        this.f24365c = xcVar;
    }

    @Override
    public final void run() {
        switch (this.f24363a) {
            case 0:
                this.f24364b.run();
                this.f24365c.a();
                return;
            default:
                this.f24364b.run();
                this.f24365c.a();
                return;
        }
    }
}

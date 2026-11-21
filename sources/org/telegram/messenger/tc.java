package org.telegram.messenger;
public final class tc implements Runnable {
    public final int f27007a;
    public final gd f27008b;
    public final int f27009c;

    public tc(gd gdVar, int i7, int i10) {
        this.f27007a = i10;
        this.f27008b = gdVar;
        this.f27009c = i7;
    }

    @Override
    public final void run() {
        switch (this.f27007a) {
            case 0:
                gd gdVar = this.f27008b;
                gdVar.P = false;
                gdVar.j(this.f27009c);
                return;
            case 1:
                gd gdVar2 = this.f27008b;
                gdVar2.P = false;
                gdVar2.j(this.f27009c);
                return;
            case 2:
                this.f27008b.a1(this.f27009c, null, true, null);
                return;
            default:
                this.f27008b.a1(this.f27009c, null, true, null);
                return;
        }
    }
}
